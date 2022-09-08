package org.roshadgu.personalwebsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.Text
import org.roshadgu.personalwebsite.components.layouts.PageLayout
import org.jetbrains.compose.web.dom.P

@Page
@Composable
fun AboutPage() {
    PageLayout("ABOUT") {


        descriptionCard()
        //Text("This is a skeleton app used to showcase a basic site made using Kobweb")
        P()
        Link("/", "Go Home")
    }
}

@Composable
fun descriptionCard()
{
    Text("My main focuses include mobile application development for the Android platform, along with frontend web & backend development. I have done iOS development and .NET development in the past but they are not my professional focus")
    Text("My non-professional interests include motorcycling & cars, snowboarding, and music & drums. I currently ride a 2020 Street Triple RS 765, and I drive 2021 Tesla Model 3 Performance. When it comes to music, I have a large range of genre preferences, from French electro-pop like The Sunday Sadness to post hardcore rock like Dance Gavin Dance — and many things in between (even K-Pop).")
    Text("I currently work as a Senior Android Engineer at Square (under Block) in San Francisco. Your first thought might be the little white card readers that Square started with - but Square has awesome newer hardware (like Square Register and Square Terminal), as well as a suite of tools for all types of businesses — big or small.")
}