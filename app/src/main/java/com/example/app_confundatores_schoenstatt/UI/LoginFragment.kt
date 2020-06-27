package com.example.app_confundatores_schoenstatt.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app_confundatores_schoenstatt.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_login, container, false)
        val botonGenerar= v.findViewById<View>(R.id.btnGenerar)
        botonGenerar.setOnClickListener {
            val fragment=RegistrarPersonaFragment()
            val fragmentManager=activity?.supportFragmentManager?.beginTransaction()
            fragmentManager?.replace(R.id.Contenedor, fragment)
            fragmentManager?.addToBackStack(null)
            fragmentManager?.commit()
        }
        return v
    }
}