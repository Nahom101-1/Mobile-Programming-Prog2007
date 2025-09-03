package com.example.hobbyapplication.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Homescreen() {
    // store hobbies in a state list
    var myHobbies = remember { mutableStateListOf("Tennis", "Gym/working out", "Movies/cinema") }
    var text = remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            Text(text = "HobbyApp", style = MaterialTheme.typography.headlineSmall)

            Row(modifier = Modifier.padding(top = 8.dp)) {
                TextField(
                    value = text.value,
                    onValueChange = { text.value = it },
                    label = { Text("Enter hobby") },
                    placeholder = { Text("Enter Hobby") },
                    modifier = Modifier.weight(1f)
                )
                Button(
                    onClick = {
                        if (text.value.isNotBlank()) {
                            myHobbies.add(text.value)
                            text.value = ""
                        }
                    },
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Text("Add")
                }
            }

            // show the list of hobbies
            Column(modifier = Modifier.padding(top = 16.dp)) {
                for (hobby in myHobbies) {
                    Text(text = hobby, modifier = Modifier.padding(4.dp))
                }
            }
        }
    }
}
