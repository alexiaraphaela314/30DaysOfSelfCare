package com.example.a30daysofselfcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.DaysOfSelfCareTheme
import com.example.a30daysofselfcare.data.Care
import com.example.a30daysofselfcare.data.CareRepository
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaysOfSelfCareTheme {
                // Chamamos apenas o seu App aqui dentro
                SelfCareApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelfCareTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Dias de autocuidado"
            )
        },
        modifier = modifier
    )
}

@Composable
fun SelfCareApp() {
    Scaffold(
        topBar = {
            SelfCareTopAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(CareRepository.cares) {
                CareItem(
                    care = it,
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
fun CareItem(
    care: Care,
    modifier: Modifier = Modifier,
) {
    // Estado que controla se o card está aberto ou fechado
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth(),
        // Ao clicar, invertemos o estado e enviamos um sinal para nossa "IA"
        onClick = { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
                .padding(16.dp)
        ) {
            // Título do Dia (Ex: Dia 1)
            Text(
                text = stringResource(care.name),
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.secondary
            )

            // Espaçamento pequeno
            Spacer(Modifier.height(8.dp))

            // Imagem do Card
            Image(
                painter = painterResource(care.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )

            // Se o card for clicado (expandido), mostramos a descrição
            if (expanded) {
                Spacer(Modifier.height(16.dp))
                Text(
                    text = stringResource(care.description),
                    style = MaterialTheme.typography.bodyLarge
                )

                // Badge da TAG (Visualizando a categoria para a IA)
                Text(
                    text = "#${care.tag}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaysOfSelfCareTheme {
        SelfCareApp()
    }
}