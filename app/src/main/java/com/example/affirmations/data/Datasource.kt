package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/** [Datasource]class
  Prépare les données pour l'application qui seront ensuite modelise dans Model
 Contient une methode [loadAffirmations]
 */
class Datasource {
    /** [loadAffirmations] renvoie une liste de type [Affirmation]class  c-a-d une liste d'instances
     * de [Affirmation]*/
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}