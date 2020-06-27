package com.example.app_confundatores_schoenstatt.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app_confundatores_schoenstatt.R


class SplashFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_splash, container, false)

//        val boton =v.findViewById<View>(R.id.prueba)
//
//        boton.setOnClickListener {

        val bac = object  : Thread(){
            override fun run(){
                try {
                    Thread.sleep(5000)
                    val fragment=
                        LoginFragment()
                    val fragmentManager=activity?.supportFragmentManager?.beginTransaction()
                    fragmentManager?.replace(R.id.Contenedor, fragment)
                    fragmentManager?.addToBackStack(null)
                    fragmentManager?.commit()
                } catch (e : Exception){
                    e.printStackTrace()
                }
            }
        }
        bac.start()

//        }
        return v
    }


}