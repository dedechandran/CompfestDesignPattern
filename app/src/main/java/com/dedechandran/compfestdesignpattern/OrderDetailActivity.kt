package com.dedechandran.compfestdesignpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.dedechandran.compfestdesignpattern.databinding.ActivityOrderDetailBinding
import com.dedechandran.compfestdesignpattern.facade.DateManager
import com.dedechandran.compfestdesignpattern.factory.Transport
import com.dedechandran.compfestdesignpattern.factory.TransportFactory
import com.dedechandran.compfestdesignpattern.factory.TransportType
import com.dedechandran.compfestdesignpattern.mock.DataGenerator
import com.google.android.material.R

class OrderDetailActivity : AppCompatActivity() {
    private var _binding: ActivityOrderDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityOrderDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val orderDetails = intent.getStringExtra(EXTRA_ORDER)
        orderDetails?.let {
            binding.tvOrderDetails.text = it
        }

        val transportItems = DataGenerator.generateTransportType().map { it.name }
        val transportAdapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, transportItems)
        var selectedLogisticTransportation : Transport? = null
        (binding.ipLogisticTransportation as AutoCompleteTextView).setAdapter(transportAdapter)
        binding.ipLogisticTransportation.setOnItemClickListener { _, _, i, _ ->
            // TODO : Get selected logistic transportation using factory
//            selectedLogisticTransportation = TransportFactory.create(TransportType.valueOf(transportItems[i]))
        }

        binding.btnOrder.setOnClickListener {
            // TODO : Call facade class to get formatted date today
//            val todayDate = DateManager.convertTimeStampToFormattedDate(System.currentTimeMillis())
            selectedLogisticTransportation?.deliver {
//                binding.tvOrderDelivery.text = "$it in $todayDate"
            }
        }

    }

    companion object {
        const val EXTRA_ORDER = "EXTRA_ORDER"
    }
}