package com.farukdeveci.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.farukdeveci.navigationcomponentodev.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.buttonAyaGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.AnasayfadanAsayfasina)
        }

        tasarim.buttonXeGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.AnasayfadanXsayfasina)

        }


        return tasarim.root
    }


}