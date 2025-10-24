package racingcar

class InputValidator {

    fun validateCarName(name: List<String>) {
        require(name.isNotEmpty()) { "자동차 이름은 최소 1개 이상이어야 합니다." }
        name.forEach { name ->
            require(name.isNotEmpty()) { "자동차 이름에 빈 값이 있습니다." }
            require(name.length <= 5) { "자동차 이름은 5자 이하만 가능합니다."}
        }
    }

    fun validateTryCount(count: String): Int {

        // count.all { it.isDigit() } : 모든 문자가 숫자인지 판단
        require(count.isNotEmpty() && count.all { it.isDigit() }) {" 시도 횟수는 숫자만 입력해야 합니다." }
        val value = count.toIntOrNull() ?: throw IllegalArgumentException("올바른 입력 방식이 아닙니다.")
        require(value >= 1) { "시도 횟수는 1 이상이어야 합니다." }
        return value
    }

}