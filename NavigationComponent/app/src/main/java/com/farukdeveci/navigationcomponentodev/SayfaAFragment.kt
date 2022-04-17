package com.farukdeveci.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.farukdeveci.navigationcomponentodev.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {

    private lateinit var tasarim:FragmentSayfaABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaABinding.inflate(inflater,container,false)


        tasarim.buttonByeGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.AsayfasindanBsayfasina)
        }

        return tasarim.root
    }


}