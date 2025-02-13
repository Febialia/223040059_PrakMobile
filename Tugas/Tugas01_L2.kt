public class Tugas01_L2 {

 class IndeksNilaiMatkul(private val nilaiAkhir: Int?) {
    fun hitungIndeks(): String {
        return when {
            nilaiAkhir == null -> "Nilai harus diisi"
            nilaiAkhir !in 0..100 -> "Nilai di luar jangkauan"
            nilaiAkhir in 80..100 -> "A"
            nilaiAkhir in 70..79 -> "AB" 
            nilaiAkhir in 60..69 -> "B"
            nilaiAkhir in 50..59 -> "BC"
            nilaiAkhir in 40..49 -> "C"
            nilaiAkhir in 30..39 -> "D"
            else -> "D"
        }
    }
}

fun main(args: Array<String>) {
    val inputs = listOf("77", "110", "", "25")
    val hasil = mutableListOf<Pair<String, String>>()
    
    for (input in inputs) {
        val nilai = input.toIntOrNull()
        val indeksNilai = IndeksNilaiMatkul(nilai)
        hasil.add(Pair(input.ifEmpty { "{kosong}" }, indeksNilai.hitungIndeks()))
    }
    
    println("+----+--------+----------------------+")
    println("| No | Input  | Output               |")
    println("+----+--------+----------------------+")
    
    hasil.forEachIndexed { index, (input, output) ->
        println("| %-2d | %-6s | %-20s |".format(index + 1, input, output))
    }
    println("+----+--------+----------------------+")
}
}