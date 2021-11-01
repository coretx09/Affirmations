package com.example.affirmations.adapter
/** Adaptateur - Prend les données de datasource et les prépare RecyclerView à s'afficher. **/

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/* Vous devez ajouter un paramètre au constructeur de ItemAdapter, afin de pouvoir transmettre
  la liste des affirmations à l'adaptateur. */
class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>
                  ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    /* class imbriquée (Définir une classe à l'intérieur d'une autre classe)
     Puisque ItemViewHolder n'est utilisé que par ItemAdapter, sa création à l'intérieur ItemAdapter
    montre cette relation. Ce n'est pas obligatoire, mais cela aide les autres développeurs à comprendre la structure de votre programme. */

    /** viewHolder représente une vue d'élément de liste unique dans RecyclerView**/
    /* ItemViewHolder une sous-classe de RecyclerView.ViewHolder et transmettez le view paramètre au constructeur de la superclass.    */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // textView de type TextView , view attribuez ID item_title (défini dans list_item.xml)
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}