package com.example.tp1android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupérer le bouton d'inscription
        val buttonInscription = findViewById<Button>(R.id.buttonInscription)

        // Ajouter un écouteur de clic sur le bouton d'inscription
        buttonInscription.setOnClickListener {
            // Actions à effectuer lors du clic sur le bouton d'inscription
            val nom = findViewById<EditText>(R.id.editTextNom).text.toString()
            val prenom = findViewById<EditText>(R.id.editTextPrenom).text.toString()
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val motDePasse = findViewById<EditText>(R.id.editTextMotDePasse).text.toString()
            val confirmerMotDePasse = findViewById<EditText>(R.id.editTextConfirmerMotDePasse).text.toString()
            val age = findViewById<EditText>(R.id.editTextAge).text.toString()
            val genre = if (findViewById<RadioButton>(R.id.radioButtonHomme).isChecked) "Homme" else "Femme"

            // Vérifier si les champs sont remplis
            if (nom.isNotEmpty() && prenom.isNotEmpty() && email.isNotEmpty() &&
                motDePasse.isNotEmpty() && confirmerMotDePasse.isNotEmpty() && age.isNotEmpty()) {
                // Vérifier si les mots de passe correspondent
                if (motDePasse == confirmerMotDePasse) {
                    // Effectuer l'inscription
                    // Vous pouvez ajouter votre logique d'inscription ici
                    // Par exemple, enregistrer les données dans une base de données ou appeler une API
                    Toast.makeText(this, "Inscription réussie!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Les mots de passe ne correspondent pas!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Veuillez remplir tous les champs!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
