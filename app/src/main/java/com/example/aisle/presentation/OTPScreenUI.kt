package com.example.aisle.presentation

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.aisle.R
import com.example.aisle.navigation.NavigationScreens
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun OTPScreenUI(navController: NavHostController) {
    var otp by remember { mutableStateOf("")}

//    var timerRunning by remember { mutableStateOf(false) }
//    var remainingTime by remember { mutableStateOf(60) }

    val coroutineScope = rememberCoroutineScope()

//    var timerRunning by remember { mutableStateOf(false) }
//    var remainingTime by remember { mutableStateOf(60) }
//
//    LaunchedEffect(timerRunning) {
//        if (timerRunning) {
//           // CountdownTimer()
//        }
//    }
    Column(modifier = Modifier.padding(start = 20.dp, top = 100.dp)){

        //to do text field bold inside
        Row() {
            Text(text = "+91 9999999999", fontWeight = FontWeight.Medium, fontSize = 25.sp)
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Edit, contentDescription = "Edit Phone Number")
            }
        }
        Text(stringResource(id = R.string.header_1_OTP_Screen), fontSize = 35.sp, fontWeight = FontWeight.ExtraBold)
        Text(stringResource(id = R.string.header_2_OTP_Screen), fontSize = 35.sp, fontWeight = FontWeight.ExtraBold)
        OutlinedTextField(value = otp,
            onValueChange = {otp = it},
            textStyle = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black), maxLines = 1,
            placeholder = {Text(text = "9999", fontSize = 16.sp, color = Color.Black, fontWeight = FontWeight.ExtraBold)},
            modifier = Modifier
                .padding(end = 296.dp),shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        //Button
        Spacer(modifier = Modifier.height(13.dp))
        Row() {
            Button(onClick = {
//                timerRunning=true
//                coroutineScope.launch { countdownTimer() }
                navController.navigate(NavigationScreens.NotesScreen.route)
            },
                //enabled = !timerRunning,
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Yellow)) {
                Text(
                    stringResource(id = R.string.continue_btn),
                    fontSize = 20.sp, color= Color.Black ,
                    fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(15.dp))

//            Text(
//                text = "$remainingTime",
//                fontSize = 25.sp, modifier = Modifier.padding(top = 5.dp)
//            )

        }
    }
}


suspend fun countdownTimer() {
    var remainingSeconds = 60

    while (remainingSeconds > 0) {
        delay(1000)
        remainingSeconds -= 1
    }
}
