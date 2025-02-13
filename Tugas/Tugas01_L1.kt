public class Tugas01_L1 {
    class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
        fun luas(): Int {
            return panjang * lebar
        }
        
        fun keliling(): Int {
            return 2 * (panjang + lebar)
        }
    }
    
    fun main(args: Array<String>) {
    
        val panjang = 4
        val lebar = 2
        
        val persegiPanjang = PersegiPanjang(panjang, lebar)
        println("Panjang: $panjang")
        println("Lebar: $lebar")
        println("Luas: ${persegiPanjang.luas()}")
        println("Keliling: ${persegiPanjang.keliling()}")
    }  
}
