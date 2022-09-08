package org.roshadgu.personalwebsite.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.Text
import org.roshadgu.personalwebsite.components.layouts.PageLayout
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.P

@Page
@Composable
fun HomePage()
{
    PageLayout("Welcome to Kobweb!")
    {
        Box()
        {
            Text("Hey there (emoji hey)")
            Spacer()
            Text("I am Roshad Guerrier")
            Text("Software Developer")
            var name by remember { mutableStateOf("") }
            Input(
                InputType.Text,
                attrs = {
                    onInput { e -> name = e.value }
                }
            )
            P()
            Text("Hello ${name.takeIf { it.isNotBlank() } ?: "World"}!")
        }

        AboutPage()
        ProjectsPage()
    }
}