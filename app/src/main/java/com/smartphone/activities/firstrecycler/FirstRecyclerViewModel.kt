package com.smartphone.activities.firstrecycler

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.smartphone.models.Smartphone

class FirstRecyclerViewModel : ViewModel() {

    var liveDataHobbies = MutableLiveData<ArrayList<Smartphone>>()
    var listSmartphones = ArrayList<Smartphone>()

    fun getSmartphones() {
        listSmartphones = ArrayList()
        listSmartphones.add(Smartphone("Iphone","13 pro 256 GO", "1370 EUR", "Gris Sidéral", arrayOf("https://static.fnac-static.com/multimedia/Images/FR/MDM/51/12/04/17044049/3756-1/tsp20220404213935/Apple-iPhone-13-Pro-6-1-5G-512-Go-Double-SIM-Graphite.jpg","https://static.fnac-static.com/multimedia/Images/FR/MDM/51/12/04/17044049/3756-1/tsp20220404213935/Apple-iPhone-13-Pro-6-1-5G-512-Go-Double-SIM-Graphite.jpg","https://static.fnac-static.com/multimedia/Images/FR/MDM/51/12/04/17044049/3756-1/tsp20220404213935/Apple-iPhone-13-Pro-6-1-5G-512-Go-Double-SIM-Graphite.jpg")))
        listSmartphones.add(Smartphone("Samsung","Galaxy S8", "679 EUR", "Blue", arrayOf("https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=640/https://d1eh9yux7w8iql.cloudfront.net/product_images/45160_369fa755-163b-445e-a26c-3d3b873ddcc2.jpg","https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=640/https://d1eh9yux7w8iql.cloudfront.net/product_images/45160_369fa755-163b-445e-a26c-3d3b873ddcc2.jpg","https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=640/https://d1eh9yux7w8iql.cloudfront.net/product_images/45160_369fa755-163b-445e-a26c-3d3b873ddcc2.jpg")))
        listSmartphones.add(Smartphone("Motorola","V50", "30 EUR", "Black", arrayOf("https://cloud10.todocoleccion.online/antiguedades-tecnicas/tc/2017/09/02/14/96910303.jpg","https://cloud10.todocoleccion.online/antiguedades-tecnicas/tc/2017/09/02/14/96910303.jpg","https://cloud10.todocoleccion.online/antiguedades-tecnicas/tc/2017/09/02/14/96910303.jpg")))
        listSmartphones.add(Smartphone("Iphone 10","XR 64 GO", "300 EUR", "Red", arrayOf("https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=640/https://d1eh9yux7w8iql.cloudfront.net/product_images/234364_8fc9a5e1-5fcb-4737-b08c-a532617d401a.jpg","https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=640/https://d1eh9yux7w8iql.cloudfront.net/product_images/234364_8fc9a5e1-5fcb-4737-b08c-a532617d401a.jpg","https://www.backmarket.fr/cdn-cgi/image/format=auto,quality=75,width=640/https://d1eh9yux7w8iql.cloudfront.net/product_images/234364_8fc9a5e1-5fcb-4737-b08c-a532617d401a.jpg")))
        liveDataHobbies.postValue(listSmartphones)
    }
}