package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    val inputValidator = InputValidator()

    // 자동차 이름 입력 및 map에 저장
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val rawCarnames = Console.readLine() ?: throw IllegalArgumentException("자동차 이름 입력값이 비어 있습니다.")
    val carNames = rawCarnames.split(",").map { it.trim() }
    inputValidator.validateCarName(carNames)

    // 시도 횟수 입력 및 검증
    println("시도할 횟수는 몇 회인가요?")
    val rawTryCount = Console.readLine() ?: throw IllegalArgumentException("시도 횟수 입력값이 비어 있습니다.")
    val tryCount = inputValidator.validateTryCount(rawTryCount)

    // 입력 값이 잘 출력되는지 임시 확인
    println(carNames)
    println(tryCount)
}


