package com.example.petclub.ui.CadastroPet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.petclub.databinding.FragmentCadastropetBinding

class CadastroPetFragment : Fragment() {

    private lateinit var binding:FragmentCadastropetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCadastropetBinding.inflate(inflater,container,false)
        val root: View = binding.root
        return root
    }

}