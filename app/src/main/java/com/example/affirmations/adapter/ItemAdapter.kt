package com.example.affirmations.adapter
/** Adaptateur - Prend les données de datasource et les prépare RecyclerView à s'afficher.
 * Les adaptateurs fournissent une liaison entre un dataset spécifiques à l'application et les views affichées dans un RecyclerView.
 * Un adaptateur comporte plusieurs parties **/

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/* Vous devez ajouter un paramètre au constructeur de ItemAdapter, afin de pouvoir transmettre
  la liste des affirmations à l'adaptateur.

  ItemAdapter a besoin d'informations sur la façon de résoudre les ressources de chaîne.
  Ces informations, ainsi que d'autres informations sur l'application, sont stockées dans une Context*/

/**Adapter for the [RecyclerView] in [MainActivity] displays [Affirmation] data object
 * ItemAdapter implemente  RecyclerView.Adapter(class abstract) **/
class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>
                  // RecyclerView.Adapter(class abstract)<VH> – Une classe qui étend ViewHolder qui sera utilisé par l'adaptateur.
                  // responsable de fournir des views qui représentent des items dans data set
                  ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /* class imbriquée (Définir une classe à l'intérieur d'une autre classe)
     Puisque ItemViewHolder n'est utilisé que par ItemAdapter, sa création à l'intérieur ItemAdapter
    montre cette relation. Ce n'est pas obligatoire, mais cela aide les autres développeurs à comprendre la structure de votre programme. */

    /** viewHolder représente une seul view d'élément de la liste unique dans RecyclerView
     * ItemViewHolder implemente RecyclerViewHolder **/
    /* ItemViewHolder une sous-classe de RecyclerView.ViewHolder et transmettez le view paramètre au constructeur de la superclass.    */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // textView de type TextView , view attribuez ID item_title (défini dans list_item.xml)
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /* Placez votre curseur ItemAdapter et appuyez sur Ctrl+I, Cela vous montre la liste des méthodes
     que vous devez implémenter : getItemCount(), onCreateViewHolder(), et onBindViewHolder().*/

    /** onCreateViewHolder() méthode est appelée par layout manager pour créer de nouveaux view holder  pour le RecyclerView **/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        /* LayoutInflater(abstract class) sait comment gonfler une mise en page XML dans une hiérarchie d'objets de view.*/
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    /** onBindViewHolder() méthode est appelée par layout manager afin de remplacer le contenu d'une view d'élément de liste. **/
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        /* Vous devez mettre à jour toutes les views référencées par viewHolder pour refléter les données correctes pour cet élément
        Dans ce cas, il n'y a qu'une seule view : le TextView inside ItemViewHolder.
        Définissez le texte de TextView pour afficher la Affirmation chaîne de cet élément. */
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /** getItemCount() méthode doit renvoyer la taille de dataset **/
    override fun getItemCount(): Int {
        return dataset.size
    }
}