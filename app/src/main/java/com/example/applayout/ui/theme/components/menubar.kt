package com.example.applayout.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applayout.R
import com.example.applayout.ui.theme.AppLayoutTheme

@Composable
fun MenuItem(
    icon: Int,
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isActive: Boolean = false,
    iconDescription: String? = null
) {
    Column(
        modifier = modifier
            .clickable { onClick() }
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = iconDescription,
            tint = if (isActive) MaterialTheme.colorScheme.primary
            else MaterialTheme.colorScheme.secondary,
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = title,
            color = if (isActive) MaterialTheme.colorScheme.primary
            else MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun MenuBar(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 2.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MenuItem(
                icon = R.drawable.user,
                title = "Profile",
                onClick = {},
                isActive = true
            )
            MenuItem(
                icon = R.drawable.calendar_days,
                title = "Calendar",
                onClick = {},
                isActive = false
            )

            MenuItem(
                icon = R.drawable.magnifying_glass,
                title = "Search",
                onClick = {},
                isActive = false
            )
            MenuItem(
                icon = R.drawable.tablets,
                title = "Medicines",
                onClick = {},
                isActive = false
            )

        }
    }
}

@Preview
@Composable
fun MenuBarPreview() {
    AppLayoutTheme {
        MenuBar()
    }
}

@Preview
@Composable
fun MenuItemPreview() {
    MenuItem(
        icon = R.drawable.calendar_days,
        title = "Calender",
        onClick = {},
        isActive = true

    )
}