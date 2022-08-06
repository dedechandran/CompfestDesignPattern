package com.dedechandran.compfestdesignpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.dedechandran.compfestdesignpattern.builder.Computer
import com.dedechandran.compfestdesignpattern.builder.ComputerBuilder
import com.dedechandran.compfestdesignpattern.databinding.ActivityMainBinding
import com.dedechandran.compfestdesignpattern.mock.*
import com.dedechandran.compfestdesignpattern.observer.ComputerPricePublisher
import com.dedechandran.compfestdesignpattern.observer.ComputerPriceSubscriber

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        // TODO : Create Computer Price Subscription Mechanism
//        val computerPricePublisher = ComputerPricePublisher()
//        val computerPriceSubscriber = ComputerPriceSubscriber() {
//            binding.tvTotalPrice.text = "Rp.$it"
//        }
//        computerPricePublisher.subscribe(computerPriceSubscriber)
        // TODO : Create Computer Builder
//        val computerBuilder = ComputerBuilder()

        val motherBoardItems = DataGenerator.generateMotherboardData()
        val displayedMotherBoardItems = motherBoardItems.map { "${it.name}  Rp.${it.price}" }
        val moboAdapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, displayedMotherBoardItems)
        (binding.ipMotherBoard as AutoCompleteTextView).setAdapter(moboAdapter)
        binding.ipMotherBoard.setOnItemClickListener { _, _, i, _ ->
        // TODO : Notify the subscriber about the total price changes & set the selected motherboard through computer builder
//            computerPricePublisher.onComputerPriceChanged(motherBoardItems[i].price)
//            computerBuilder.setMotherBoard(motherBoardItems[i].name)
        }

        val cpuItems = DataGenerator.generateCPUData()
        val displayedCpuItems = cpuItems.map { "${it.name}  Rp.${it.price}" }
        val cpuAdapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, displayedCpuItems)
        (binding.ipCpu as AutoCompleteTextView).setAdapter(cpuAdapter)
        binding.ipCpu.setOnItemClickListener { _, _, i, _ ->
            // TODO : Notify the subscriber about the total price changes & set the selected cpu through computer builder
//            computerPricePublisher.onComputerPriceChanged(cpuItems[i].price)
//            computerBuilder.setCpu(cpuItems[i].name)
        }

        val vgaItems = DataGenerator.generateVGAData()
        val displayedVgaItems = vgaItems.map { "${it.name}  Rp.${it.price}" }
        val vgaAdapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, displayedVgaItems)
        (binding.ipVga as AutoCompleteTextView).setAdapter(vgaAdapter)
        binding.ipVga.setOnItemClickListener { _, _, i, _ ->
            // TODO : Notify the subscriber about the total price changes & set the selected vga through computer builder
//            computerPricePublisher.onComputerPriceChanged(vgaItems[i].price)
//            computerBuilder.setVga(vgaItems[i].name)
        }

        val ramItems = DataGenerator.generateRAMData()
        val displayedRamItems = ramItems.map { "${it.name}  Rp.${it.price}" }
        val ramAdapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, displayedRamItems)
        (binding.ipRam as AutoCompleteTextView).setAdapter(ramAdapter)
        binding.ipRam.setOnItemClickListener { _, _, i, _ ->
            // TODO : Notify the subscriber about the total price changes & set the selected ram through computer builder
//            computerPricePublisher.onComputerPriceChanged(ramItems[i].price)
//            computerBuilder.setRam(ramItems[i].name)
        }

        val psuItems = DataGenerator.generatePSUData()
        val displayedPsuItems = psuItems.map { "${it.name}  Rp.${it.price}" }
        val psuAdapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, displayedPsuItems)
        (binding.ipPsu as AutoCompleteTextView).setAdapter(psuAdapter)
        binding.ipPsu.setOnItemClickListener { _, _, i, _ ->
            // TODO : Notify the subscriber about the total price changes & set the selected psu through computer builder
//            computerPricePublisher.onComputerPriceChanged(psuItems[i].price)
//            computerBuilder.setPsu(psuItems[i].name)
        }

        val fanItems = DataGenerator.generateFanData()
        val displayedFanItems = fanItems.map { "${it.name}  Rp.${it.price}" }
        val fanAdapter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, displayedFanItems)
        (binding.ipFan as AutoCompleteTextView).setAdapter(fanAdapter)
        binding.ipFan.setOnItemClickListener { _, _, i, _ ->
            // TODO : Notify the subscriber about the total price changes & set the selected fan through computer builder
//            computerPricePublisher.onComputerPriceChanged(fanItems[i].price)
//            computerBuilder.setFan(fanItems[i].name)
        }

        binding.btnNext.setOnClickListener {
            // TODO : Build the computer using Builder.build() and proceed to the next screen
//            val orderedComputer = computerBuilder.build()
//            val orderedComputerText = getOrderedComputerText(orderedComputer)
//            val intent = Intent(this,OrderDetailActivity::class.java).apply {
//                putExtra(OrderDetailActivity.EXTRA_ORDER, orderedComputerText)
//            }
//            startActivity(intent)
        }

    }

    private fun getOrderedComputerText(computer: Computer): String {
        return StringBuilder().apply {
            append(computer.motherboard)
            append("\n")
            append(computer.cpu)
            append("\n")
            append(computer.vga)
            append("\n")
            append(computer.psu)
            append("\n")
            append(computer.ram)
            append("\n")
            append(computer.fan)
            append("\n")
        }.toString()
    }
}