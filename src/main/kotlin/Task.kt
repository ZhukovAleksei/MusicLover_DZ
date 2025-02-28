fun main() {

    var totalPrice = 1000.0
    var regularCustomer = false

    val noDiscount = 1000.0
    val discountRubles = 10_000.0
    val discountPrices = 10_001.0

    val result = if (totalPrice <= noDiscount) {
        if (regularCustomer) {
            "Стоимость покупки - $totalPrice рублей. Так как вы наш постоянный клиент, применится скидка 1%. Стоимость покупки с учётом скидки составит: " +(totalPrice - (totalPrice * 0.01))
        } else {
            "Стоимость покупки - $totalPrice рублей. Так как она меньше или равняется $noDiscount, скидки не будет. Стоимость покупки с учётом скидки составит: $totalPrice"
        }
    } else if (totalPrice > noDiscount && totalPrice <= discountRubles) {
        if (regularCustomer) {
            "Стоимость покупки - $totalPrice рублей. Так как она больше $noDiscount или равняется $discountRubles и вы наш постоянный клиент, скидка составит " + (100 + (totalPrice * 0.01)) + " рублей. Стоимость покупки с учётом скидки составит: " + (totalPrice - (100 + (totalPrice * 0.01)))
        } else {
            "Стоимость покупки - $totalPrice рублей. Так как она больше $noDiscount или равняется $discountRubles, скидка составит 100 рублей. Стоимость покупки с учётом скидки составит: " + (totalPrice - 100)
        }
    } else {
        if (regularCustomer) {
            "Стоимость покупки - $totalPrice рублей. Так как она больше или равна $discountPrices и вы постоянный клиент, применится скидка 6%. Стоимость покупки с учётом скидки составит: " + (totalPrice - (totalPrice * 0.06))
        } else {
            "Стоимость покупки - $totalPrice рублей. Так как она больше или равна $discountPrices, применится скидка 5%. Стоимость покупки с учётом скидки составит: " + (totalPrice - (totalPrice * 0.05))
        }
    }

    println(result)
}