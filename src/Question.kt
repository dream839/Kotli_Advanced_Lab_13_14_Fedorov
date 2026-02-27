//class FillInTheBlankQuestion(
//    val questionText: String,
//    val answer: String,
//    val difficulty: String
//)
//class TrueOrFalseQuestion(
//    val questionText: String,
//    val answer: Boolean,
//    val difficulty: String
//)
//class NumericQuestion(
//    val questionText: String,
//    val answer: Int,
//    val difficulty: String
//)
//data class Question<T>(
//    val questionText: String,
//    val answer: T,
//    val difficulty: Difficulty
//)
//enum class Difficulty{
//    EASY,
//    MEDIUM,
//    HARD
//}
//object StudentProgress{
//    var total: Int = 10
//    var answered: Int = 3
//}
//companion object StudentProgress {
//    var total: Int = 10
//    var answered: Int = 3
//val Quiz.StudentProgress.progressText: String
//    get() = "${answered} of ${total} answered"
//fun Quiz.StudentProgress.printProgressBar(){
//    repeat(Quiz.answered) {print("▓")}
//    repeat(Quiz.total - Quiz.answered) {print("▓")}
//    println()
//    println(Quiz.progressText)
//    interface ProgressPrintable{
//
//    }
//    class Quiz{
//        val question1 = Question<String>(
//            "Речка спятила с ума - По домам пошла сама. ___",
//            "водопровод",
//            Difficulty.MEDIUM
//        )
//        val question2 = Question<Boolean>(
//            "Небо зелёное. Правда или ложь",
//            false,
//            Difficulty.EASY
//        )
//        val question3 = Question<Int>(
//            "Сколько дней между полнолуниями?",
//            28,
//            Difficulty.HARD
//        )
//        interface ProgressPrintable{
//            val progressText: String
//            fun printProgressBar()
//        }
//        class Quiz : ProgressPrintable {
//            override val progressText: String
//                get() = "${answered} of ${total} answered"
//    val question1 = Question<String>(
//        "Речка спятила с ума - По домам пошла сама. ___",
//        "водопровод",
//        Difficulty.MEDIUM
//    )
//    val question2 = Question<Boolean>(
//        "Небо зелёное. Правда или ложь",
//        false,
//        Difficulty.EASY
//    )
//    val question3 = Question<Int>(
//        "Сколько дней между полнолуниями?",
//        28,
//        Difficulty.HARD
//    )
//
//            override fun printProgressBar() {
//                repeat(Quiz.answered) {print("▓")}
//                repeat(Quiz.total - Quiz.answered) {print("▓")}
//                println()
//                println(progressText)
//            }
//            companion object StudentProgress {
//                var total: Int = 10
//                var answered: Int = 3
//            }
//        }
//        val Quiz.StudentProgress.progressText: String
//            get() = "${answered} of ${total} answered"
//
//        fun Quiz.StudentProgress.printProgressBar(){
//            repeat(Quiz.answered) {print("▓")}
//            repeat(Quiz.total - Quiz.answered) {print("▓")}
//            println()
//            println(Quiz.progressText)
//fun printQuiz(){
//    question1.let{
//        println(it.questionText)
//        println(it.answer)
//        println(it.difficulty)
//    }
//    println()
//    question2.let{
//        println(it.questionText)
//        println(it.answer)
//        println(it.difficulty)
//    }
//    println()
//    question3.let{
//        println(it.questionText)
//        println(it.answer)
//        println(it.difficulty)
//    }
//    println()
//
//}
//}