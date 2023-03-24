package swarn.example.myquizapp

object Constants {

    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Brazil", "Newzealand",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia",
            "Brazil", "Newzealand",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_fiji,
            "UAE", "Fiji",
            "Brazil", "Qatar",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Australia",
            "Denmark", "Germany",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Kuwait",
            "Germany", "Denmark",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_new_zealand,
            "England", "Australia",
            "Italy", "Newzeland",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_denmark,
            "Qatar", "Denmark",
            "Trinidad & Tobbago", "West Indies",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_kuwait,
            "UAE", "Qatar",
            "Brazil", "Kuwait",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            1, "Which country does this flag represent?",
            R.drawable.ic_flag_of_australia,
            "Japan", "Australia",
            "China", "Newzeland",
            2
        )
        questionsList.add(que1)

        return questionsList
    }
}