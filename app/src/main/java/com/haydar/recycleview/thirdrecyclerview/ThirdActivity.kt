package com.haydar.recycleview.thirdrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.haydar.recycleview.R
import com.haydar.recycleview.databinding.ActivityThirdBinding
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.nio.charset.StandardCharsets

class ThirdActivity : AppCompatActivity() {

    private var modelPahlawan: MutableList<ModelPahlawan> = ArrayList()
    lateinit var pahlawanAdapter: PahlawanAdapter

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvListPalawan.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ThirdActivity)
        }

        getListPahlawan()
    }

    fun getListPahlawan(){
        try {
            //cara membuka asset json
            val stream = assets.open("pahlawan_nasional.json")
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            val strContent = String(buffer,StandardCharsets.UTF_8)
            try {
                val jsonObject = JSONObject(strContent)
                val jsonArray = jsonObject.getJSONArray("daftar_pahlawan")
                for (i in 0 until  jsonArray.length()){
                    val jsonObjectData = jsonArray.getJSONObject(i)
                    val dataApi = ModelPahlawan()
                    dataApi.nama = jsonObjectData.getString("nama")
                    dataApi.namaLengkap = jsonObjectData.getString("nama2")
                    dataApi.image = jsonObjectData.getString("img")
                    modelPahlawan.add(dataApi)
                }
                pahlawanAdapter = PahlawanAdapter(modelPahlawan)
                // set up recycler view
                binding.rvListPalawan.adapter = pahlawanAdapter
            } catch (e : JSONException){
                e.printStackTrace()
            }


        }catch (e : JSONException){
          Toast.makeText(this,"error slurr",Toast.LENGTH_LONG).show()
        }
    }

}