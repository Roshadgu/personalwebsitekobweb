package org.roshadgu.personalwebsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.Text
import org.jetbrains.compose.web.dom.P
import org.roshadgu.personalwebsite.components.layouts.PageLayout
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun ProjectsPage()
{
  PageLayout("Projects")
  {
    Text("This is a skeleton app used to showcase a basic site made using Kobweb and to show projects")
    //Modifier.color(Color.aliceblue)

    Column(modifier = Modifier.fillMaxSize())
    {
       Row(modifier = Modifier.fillMaxSize())
        {
          projectCard()
        }
      Row(modifier = Modifier.fillMaxSize())
      {
        projectCard()
      }
      Row(modifier = Modifier.fillMaxSize())
      {
        projectCard()
      }
    }

    P()

    Link("/", "Go Home")
  }
}

@Composable
fun projectCard()
{
  Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.margin(left = 500.px, top = 50.px)) {
    Image("resources/public/WhatsApp.jpg")
    Column {
      Text("•\tBuilt from the ground up using Kotlin and its APIs including Google’s new UI toolkit, Jetpack Compose.\n")
      Spacer()
      Text("•\tThird challenge in the Android Developer Challenge Competition.\n")
      Spacer()
      Text("•\tTrading app that allows you to change trade stocks and securities.")
    }
  }
}