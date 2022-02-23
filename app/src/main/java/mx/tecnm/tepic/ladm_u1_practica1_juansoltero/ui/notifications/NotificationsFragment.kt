package mx.tecnm.tepic.ladm_u1_practica1_juansoltero.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.tecnm.tepic.ladm_u1_practica1_juansoltero.ScrollingActivity2
import mx.tecnm.tepic.ladm_u1_practica1_juansoltero.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.aceptar.setOnClickListener {
            llamarActivity()
        }

        return root
    }

    private fun llamarActivity() {
        val otroact = Intent(requireContext(), ScrollingActivity2::class.java)
        startActivity(otroact)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}