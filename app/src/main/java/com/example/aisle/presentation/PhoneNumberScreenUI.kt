package com.example.aisle.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.aisle.R
import com.example.aisle.navigation.NavigationScreens

@Composable
fun PhoneNumberScreenUI(navController: NavHostController){
    Column(modifier = Modifier.padding(start = 20.dp, top = 100.dp)) {
        var countryCode by remember { mutableStateOf("")}
        var phoneNumber by remember { mutableStateOf("")}

        Text(stringResource(id = R.string.get_otp), fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(stringResource(id = R.string.header_1_Phone_Number_Screen), fontWeight = FontWeight.ExtraBold, fontSize = 35.sp)
        Text(stringResource(id = R.string.header_2_Phone_Number_Screen), fontWeight = FontWeight.ExtraBold, fontSize = 35.sp)
        //Phone NumberField
        Row() {
            OutlinedTextField(value = countryCode, onValueChange = {countryCode= it},
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black),
                maxLines = 1,
                placeholder = {Text(text = "+91",fontSize = 16.sp, color = Color.Black,fontWeight = FontWeight.ExtraBold)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii),
                modifier = Modifier.wrapContentWidth()
                    .weight(0.06f),shape = RoundedCornerShape(15.dp))

                   Spacer(modifier = Modifier.width(10.dp))

            OutlinedTextField(value = phoneNumber, onValueChange = { phoneNumber = it},
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black),
                maxLines = 1,
                placeholder = {Text(text = "9999999999",fontSize = 16.sp, color = Color.Black,fontWeight = FontWeight.ExtraBold)},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.wrapContentWidth()
                    .width(266.dp)
                    .padding(end = 140.dp), shape = RoundedCornerShape(15.dp))
        }
        Spacer(modifier = Modifier.height(13.dp))
        Button(onClick = {
                navController.navigate(NavigationScreens.OTPScreen.route)
        },shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Yellow)) {
            Text(stringResource(id = R.string.continue_btn),
                fontSize = 20.sp, color= Color.Black ,
                fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewPhoneUI(){
    //PhoneNumberScreenUI()
}