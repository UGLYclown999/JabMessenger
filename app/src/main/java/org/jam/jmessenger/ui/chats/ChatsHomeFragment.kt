package org.jam.jmessenger.ui.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import org.jam.jmessenger.R
import org.jam.jmessenger.databinding.ChatsHomeFragmentBinding
import org.jam.jmessenger.databinding.ContactsHomeFragmentBinding

class ChatsHomeFragment : Fragment() {
    private lateinit var bindings: ChatsHomeFragmentBinding
    private lateinit var viewModel: ChatsHomeViewModel
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        bindings = ChatsHomeFragmentBinding.inflate(inflater)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}