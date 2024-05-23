package eu.tutorials.mywishlistapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Scaffold
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun AddEditDetailView(
    id: Int,
    wishViewModel: WishViewModel,
    navController: NavController
){
    Scaffold(topBar = {
        AppBarView(title =
        if(id != 0) stringResource(id = R.string.update_wish)
        else stringResource(id = R.string.add_wish)
        )
    }) {
        Column(modifier = Modifier
            .padding(it)
            .wrapContentSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}


@Composable
fun WishTextField(
    label: String,
    value: String,
    onChanged: (String)-> Unit
){
    OutlinedTextField(
        value = value, 
        onValueChange = onChanged,
        label = { Text(text = label, color = Color.Black)},
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Black,
            cursorColor = colorResource(id = R.color.black),
            focusedLabelColor = colorResource(id = R.color.black),
            unfocusedLabelColor = colorResource(id = R.color.black),
            focusedIndicatorColor = colorResource(id = R.color.black),
            unfocusedIndicatorColor = colorResource(id = R.color.black)

        )
    )
}


@Preview(showBackground = true)
@Composable
fun AddEditDetailPreview(){
//    val context = LocalContext.current
//    AddEditDetailView(id = 0,
//        wishViewModel = WishViewModel(),
//        navController = NavController(context))
    WishTextField("text", "text", {})
}