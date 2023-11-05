package com.example.applayout.ui.theme.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applayout.ui.theme.AppLayoutTheme

@Composable
fun ScheduleBar(){
        Row {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 410.dp, height = 100.dp)
                    .padding(8.dp),
                shape = RectangleShape,
                colors = CardDefaults.elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f))
            ) {
                Row {


                    Text(  text = "Time",
                        modifier = Modifier
                            .padding(8.dp),
                        textAlign = TextAlign.Left)


                    Text(
                        text = "Make an appointment",
                        modifier = Modifier.padding(8.dp),
                        textAlign = TextAlign.Right
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 90.dp, top = 8.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "16.30",
                        textAlign = TextAlign.Left,
                        modifier = Modifier.padding(8.dp)
                    )

                    Text(
                        text = "at Indira Nagar",
                        textAlign = TextAlign.Right,
                        modifier = Modifier.padding(8.dp)
                    )


                }

            }
        }
    }
 @Preview
@Composable
fun SchedulePreview(){
    AppLayoutTheme {
        ScheduleBar()
    }
}
