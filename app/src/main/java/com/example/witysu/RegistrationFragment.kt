package com.example.witysu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.witysu.databinding.FragmentRegistrationBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RegistrationFragment : Fragment() {

    private var _binding: FragmentRegistrationBinding? = null
//    val usernameEditText = binding.username
//    val passwordEditText = binding.passwordReg
//    val submitButton = binding.buttonSubmit


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        submitButton.setOnClickListener {
//            loadingProgressBar.visibility = View.VISIBLE
//            ViewModel.login(
//                usernameEditText.text.toString(),
//                passwordEditText.text.toString()
//            )
//            findNavController().navigate(R.id.action_loginFragment_to_secondActivity)
//        }
        binding.buttonSubmit.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}