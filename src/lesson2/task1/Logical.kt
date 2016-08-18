@file:Suppress("UNUSED_PARAMETER")
package lesson2.task1

/*
 * Пример -- точка внутри окружности
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
        (x - x0) * (x - x0) + (y - y0) * (y - y0) <= r * r

/*
Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
окружности с центром в (x2, y2) и радиусом r2.
 */
fun circleInside(x1: Double, y1: Double, r1: Double,
                 x2: Double, y2: Double, r2: Double): Boolean = TODO()

/*
Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
Стороны отверстия должны быть параллельны граням кирпича.
Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean = TODO()

/*
На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
Определить, угрожают ли они друг другу.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean = TODO()

/*
Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
Определить, счастливое ли заданное число.
 */
fun isNumberHappy(number: Int): Boolean = TODO()
