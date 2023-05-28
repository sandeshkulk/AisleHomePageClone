package com.example.aisle.presentation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.aisle.R

@Composable
fun NotesScreenUI(navController: NavHostController){
    val scaffoldState = rememberScaffoldState()
    Scaffold (
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavigationBar()
        })
    {
        Column(modifier = Modifier
            .padding(start = 5.dp, end = 5.dp, bottom = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally, 
            verticalArrangement = Arrangement.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(stringResource(id = R.string.header_1_Notes_Screen), fontSize = 30.sp, fontWeight = FontWeight.ExtraBold)
                Text(stringResource(id = R.string.header_2_Notes_Screen), fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box() {
                Image(painter = painterResource(id = R.drawable.poster_image),
                    contentDescription ="Poster Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(255.dp)
                        .width(360.dp)
                        .clip(RoundedCornerShape(8))
                )
                Column(modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 15.dp, bottom = 10.dp)) {
                    Text(stringResource(id = R.string.nameAndAge),
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold, fontSize = 20.sp, modifier = Modifier.clickable {
                            Log.d("Name","Tapped on name to review notes")})
                    Spacer(modifier = Modifier.height(1.5.dp))
                    Text(stringResource(id = R.string.intro_msg_notes),
                        color=Color.White,
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp)
                }
                
            }
            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.padding(start = 18.dp, end = 18.dp)) {
                Text(stringResource(id = R.string.body_text1_Notes_Screen), fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)

                Row {
                    Text(stringResource(id = R.string.body_text2_Notes_Screen),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.weight(0.08f))
                    Button(onClick = {  },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Yellow)) {
                        Text(stringResource(id = R.string.upgrade_btn),
                            fontSize = 16.sp,color=Color.Black,
                            fontWeight = FontWeight.Bold)
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.padding(bottom = 5.dp)) {
                Box {
                    Image(painter = painterResource(id = R.drawable.poster_image),
                        contentDescription = "Banner Image 1",
                    contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(260.dp)
                            .width(170.dp)
                            .clip(RoundedCornerShape(8))
                            .blur(radiusX = 10.dp, radiusY = 10.dp)
                    )
                    Text(
                        text = "Teena",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(start = 15.dp, bottom = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box {
                    Image(painter = painterResource(id = R.drawable.poster_image),
                        contentDescription = "Banner Image 1",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(260.dp)
                            .width(170.dp)
                            .clip(RoundedCornerShape(8))
                            .blur(radiusX = 10.dp, radiusY = 10.dp)
                    )
                    Text(
                        text = "Beena",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(start = 15.dp, bottom = 10.dp)
                    )
                }
            }
        }
    }
}