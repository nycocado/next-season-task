package pt.iade.ei.nextseason.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.test.generateContentItemListExample
import pt.iade.ei.nextseason.ui.components.RatedContentListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    val contentList by remember { mutableStateOf<List<ContentItem>?>(generateContentItemListExample()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Next Season")
                },
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text(
                modifier = Modifier.padding(top = 7.dp, bottom = 3.dp),
                text = "Featured Items",
                fontSize = 27.sp
            )

            if (contentList != null) {
                LazyColumn {
                    items(contentList!!) { item ->
                        RatedContentListItem(
                            item = item
                        )
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    MainView()
}