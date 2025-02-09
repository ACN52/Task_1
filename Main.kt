package ru.netology

import java.util.*

fun main() {

    // Инициализируем переменные
    // --------------------
    val percent = 0.75 / 100   // 0.75%
    val minComission: Double = 35.0  // 35 руб
    var comission: Double = 0.0
    var amount = 0  // сумма перевода в рублях.
    val minSumma: Double = 1000.0  // сумма перевода c которой уже начисляются %

    // Создаем объект Scanner для чтения ввода из консоли
    val scanner = Scanner(System.`in`)
    // --------------------

    // Основной блок программы
    // --------------------
    print("Введите сумму перевода: ")
    amount = scanner.nextInt()

    if (amount > minSumma) {
        comission = percent * amount
    } else if (amount <= minSumma) {
        comission = minComission
    } else if (amount <= 0)
        println("Проверьте сумму перевода !")

    // Округляем результат до двух знаков после запятой
    val roundComission = "%.2f".format(comission)
    print("Комиссия за перевод составляет: $roundComission руб.")

    // Очищаем буфер сканера
    scanner.nextLine()
    // --------------------
}