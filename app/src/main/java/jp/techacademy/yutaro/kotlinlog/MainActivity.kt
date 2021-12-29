package jp.techacademy.yutaro.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)

        dog.move()

        var human1 = Human("Tim", 10, "soccer")

        human1.say()

        human1.think()

        var human2 = Human("Jessy", 10, "cooking")

        human2.say()

        human2.think()

//        var num = 10
//        Log.d("kotlintest", Integer.toString(num))
//
//        num = 50
//        Log.d("kotlintest", num.toString())
//
//        val num1 = 10 + 5 - 2 * 4 / 2
//        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)
//
//        val flag1 = true
//        val flag2 = false
//        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
//        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))
//
//        val num2 = 10
//        val num3 = 20
//        Log.d("kotlintest", "num < num3 = " + (num2 < num3))
//
//        num = 60
//
//        if (num >= 90) {
//            Log.d("kotlintest", "優")
//        } else if (num >= 75) {
//            Log.d("kotlintest", "良")
//        } else if (num >= 60) {
//            Log.d("kotlintest", "可")
//        } else {
//            Log.d("kotlintest", "不可")
//        }
//
//        val drink = 1
//
//        when (drink) {
//            0 -> {
//                Log.d("kotlintist", "コーヒーを注文しました")
//            }
//            1 -> Log.d("kotlintist", "紅茶を注文しました")
//            2 -> Log.d("kotlintist", "ミルクを注文しました")
//            else -> Log.d("kotlintist", "オーダーミスです")
//        }
//
//        for (i in 1 until 6) {
//            Log.d("kotlintest", "for文の" + i + "回目")
//        }
//
//        num = 1
//
//        while (num < 6) {
//            Log.d("kotlintest", "while文の" + num + "回目")
//            num++
//        }
//
//        val points = arrayOf(10, 6, 15, 23, 17)
//
//        for ( i in points ) {
//            Log.d("kotlintest", i.toString())
//        }
//
//        val numA = 100
//        val numB = 0
//        var ans = 0
//
//        try {
//            ans = numA / numB
//        } catch (e : Exception) {
//            Log.d("kotlintist", "0で割ろうとしました")
//            Log.d("kotlintist", e.message.toString())
//        } finally {
//            Log.d("kotlintest", "ans = " + ans.toString())
//        }
//
////        total(50, 1000)
//
////        total(1, 1111)
//
//        val t = total(50, 1000)
//        Log.d("kotlintest", t.toString())
//
//        val dog = Dog("ポチ", 3)
//        dog.say()
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15)
//
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")
//    }
//
//    private fun total(first: Int, last: Int): Int{
//        var sum = 0
//        for (i in first..last) {
//            sum += i
//        }
//        return sum
    }

}