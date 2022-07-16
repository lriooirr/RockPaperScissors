package com.loniooin.rockpaperscissors.ui.home

import KnowMoreView
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loniooin.rockpaperscissors.ui.theme.AppTheme
import com.loniooin.rockpaperscissors.ui.theme.williams
import com.loniooin.rockpaperscissors.ui.theme.williamsblue

val items = listOf(
    Item(
        code = 0,
        name = "经典的随机抽取",
        description = "Random Sample"
    ),
    Item(
        code = 1,
        name = "石头剪刀布",
        description = "Paper Scissors Stone"
    ),
    Item(
        code = 2,
        name = "掷骰子",
        description = "Roll The Dice"
    )
)


@Composable
@Preview
fun HomeScreen() {
    var shouldShowOnBoarding by remember { mutableStateOf(true) }
    AppTheme {
        if (shouldShowOnBoarding) {
            Surface {
                Column {
                    TopAppBar()
                    LazyColumn(contentPadding = PaddingValues(4.dp)) {
                        items(items.size) {
                            Greeting(item = items[it]) {}
                        }
                    }
                    KnowMore(onContinueClicked = { shouldShowOnBoarding = false })
                }
            }
        } else {
            KnowMoreView(onContinueClicked = { shouldShowOnBoarding = true })
        }
    }
}

@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Text(text = "决断帮手RS")
        },
        backgroundColor = williams
    )
}

@Composable
private fun Greeting(item: Item, onContinueClicked: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 12.dp)
            .shadow(10.dp)
    ) {
        Row(
            modifier = Modifier.padding(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = item.name,
                    color = Color.Black,
                    style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold)
                )
                Text(
                    text = item.description,
                    color = Color.Black,
                    style = MaterialTheme.typography.subtitle2
                )
            }
            Button(
                //    onClick = { /* TODO */ }
                onClick = onContinueClicked
            )
            {
                Text(
                    "点击进入", color = williamsblue,
                    style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold)
                )
            }
        }
    }
}


@Composable
private fun KnowMore(onContinueClicked: () -> Unit) {
    Card(
        backgroundColor = williams,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 14.dp, horizontal = 17.dp)
            .shadow(10.dp)
    ) {
        Row(
            modifier = Modifier.padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "了解 [ 决断帮手RS ]",
                    color = Color.Black,
                    style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold)
                )
            }
            Button(
                modifier = Modifier.padding(vertical = 5.dp),
                onClick = onContinueClicked
            )
            {
                Text(
                    "点击了解", color = williamsblue,
                    style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold)
                )
            }
        }
    }
}

data class Item(val code: Int, val name: String, val description: String)