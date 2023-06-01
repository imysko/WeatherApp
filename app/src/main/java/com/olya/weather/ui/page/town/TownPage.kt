package com.olya.weather.ui.page.town

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIos
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.olya.weather.R
import com.olya.weather.data.db.AppDatabase
import com.olya.weather.domain.model.Geocoding
import com.olya.weather.ui.theme.Orange
import com.olya.weather.ui.theme.WeatherTheme

@Composable
fun TownPage(
    navController: NavHostController,
    viewModel: TownViewModel = viewModel(
        factory = TownViewModelFactory(AppDatabase.getInstance(LocalContext.current))
    ),
) {
    val townList by viewModel.townList.observeAsState(emptyList())
    val favouriteTownList by viewModel.favouriteTownList.observeAsState(emptyList())

    TownPage(
        townList = townList,
        favouriteTownList = favouriteTownList,
        onDone = { viewModel.getGeocoding(it) },
        onAddClick = { viewModel.addToFavouriteList(it) },
        onDeleteClick = { viewModel.deleteFromFavouriteList(it) },
        onBackClick = { navController.popBackStack() },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TownPage(
    townList: List<Geocoding>,
    favouriteTownList: List<Geocoding>,
    onDone: (String) -> Unit,
    onAddClick: (Geocoding) -> Unit,
    onDeleteClick: (Geocoding) -> Unit,
    onBackClick: () -> Unit,
) {
    var inputtedText by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(text = stringResource(id = R.string.favorite_towns))
                },
                navigationIcon = {
                    IconButton(
                        onClick = { onBackClick() },
                        content = {
                            Icon(
                                imageVector = Icons.Rounded.ArrowBackIos,
                                contentDescription = stringResource(id = R.string.back),
                            )
                        },
                    )
                }
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = padding.calculateTopPadding(), start = 15.dp, end = 15.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                Row(
                    modifier = Modifier.padding(top = 15.dp),
                    horizontalArrangement = Arrangement.spacedBy(7.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        imageVector = Icons.Rounded.StarOutline,
                        tint = Orange,
                        contentDescription = stringResource(id = R.string.favorites),
                    )
                    Text(
                        text = stringResource(id = R.string.favorites),
                        style = MaterialTheme.typography.titleLarge,
                    )
                }

                FavouriteList(
                    favouriteTownList = favouriteTownList,
                    onDeleteClick = { onDeleteClick(it) },
                )

                Divider(
                    Modifier
                        .fillMaxWidth()
                        .height(2.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    SearchLine(
                        value = inputtedText,
                        onValueChange = { inputtedText = it },
                        onDone = { onDone(inputtedText) }
                    )

                    SearchedList(
                        townList = townList,
                        onAddClick = { onAddClick(it) },
                    )
                }
            }
        },
    )
}

@Composable
fun SearchLine(
    modifier: Modifier = Modifier,
    value: String = "",
    onValueChange: (value: String) -> Unit,
    onDone: () -> Unit = { },
    onClose: () -> Unit = { },
) {
    val focusManager = LocalFocusManager.current

    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = { onValueChange(it) },
        textStyle = MaterialTheme.typography.titleMedium,
        placeholder = {
            Text(
                text = stringResource(id = R.string.search_town),
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.secondary,
                )
            )
        },
        trailingIcon = {
            Icon(
                modifier = Modifier.size(32.dp),
                imageVector = Icons.Rounded.Search,
                tint = MaterialTheme.colorScheme.secondary,
                contentDescription = stringResource(id = R.string.search_town),
            )
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                focusManager.clearFocus()
                onDone()
            },
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.background,
            unfocusedContainerColor = MaterialTheme.colorScheme.background,
        ),
        shape = RoundedCornerShape(10.dp),
    )
}

@Composable
fun SearchedList(
    townList: List<Geocoding>,
    onAddClick: (Geocoding) -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(townList) { town ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .clickable { onAddClick(town) },
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(text = town.name)

                town.admin1?.let {
                    Text(text = town.admin1)
                }

                Text(text = town.country)
            }

            Divider(Modifier.fillMaxWidth().height(2.dp))
        }
    }
}

@Composable
fun FavouriteList(
    favouriteTownList: List<Geocoding>,
    onDeleteClick: (Geocoding) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(favouriteTownList) { town ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = Modifier
                        .clickable { onDeleteClick(town) },
                    text = town.name,
                    style = MaterialTheme.typography.titleLarge,
                )

                IconButton(
                    onClick = { onDeleteClick(town) },
                    content = {
                        Icon(
                            imageVector = Icons.Rounded.Delete,
                            contentDescription = stringResource(id = R.string.back),
                        )
                    },
                )
            }
        }
    }
}

@Composable
@Preview
fun SearchLinePreview() {
    WeatherTheme {
        SearchLine(
            value = "",
            onValueChange = { },
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SearchedListPreview() {
    WeatherTheme {
        SearchedList(
            townList = listOf(
                Geocoding(
                    id = 0,
                    latitude = 0f,
                    longitude = 0f,
                    name = "Иркутск",
                    country = "Россия",
                    timezone = "",
                    admin1 = "Иркутская область",
                ),
                Geocoding(
                    id = 0,
                    latitude = 0f,
                    longitude = 0f,
                    name = "Усть-Илимск",
                    country = "Россия",
                    timezone = "",
                    admin1 = null,
                ),
            ),
            onAddClick = { },
        )
    }
}

@Composable
@Preview(showBackground = true)
fun FavouriteListPreview() {
    WeatherTheme {
        FavouriteList(
            favouriteTownList = listOf(
                Geocoding(
                    id = 0,
                    latitude = 0f,
                    longitude = 0f,
                    name = "Иркутск",
                    country = "Россия",
                    timezone = "",
                    admin1 = "Иркутская область",
                ),
                Geocoding(
                    id = 0,
                    latitude = 0f,
                    longitude = 0f,
                    name = "Усть-Илимск",
                    country = "Россия",
                    timezone = "",
                    admin1 = null,
                ),
            ),
            onDeleteClick = { },
        )
    }
}

@Composable
@Preview(showBackground = true)
fun TownPagePreview() {
    WeatherTheme {
        TownPage(
            townList = emptyList(),
            favouriteTownList = listOf(
                Geocoding(
                    id = 0,
                    latitude = 0f,
                    longitude = 0f,
                    name = "Иркутск",
                    country = "Россия",
                    timezone = "",
                    admin1 = "Иркутская область",
                ),
                Geocoding(
                    id = 0,
                    latitude = 0f,
                    longitude = 0f,
                    name = "Усть-Илимск",
                    country = "Россия",
                    timezone = "",
                    admin1 = null,
                ),
            ),
            onDone = { },
            onAddClick = { },
            onDeleteClick = { },
            onBackClick = { },
        )
    }
}