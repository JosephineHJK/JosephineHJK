package com.example.quizapp


object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What club is this",
            R.drawable.hvidovre,
            "Herfølge",
            "Hvidovre",
            "Hjørring",
            "HB Køge",
            2
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "Who won Superligaen in '13?",
            R.drawable.superliga_logo,
            "AaB", "Brøndby IF",
            "FC København", "FC Midtjylland", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Christian Eriksen transferred from Ajax to?",
            R.drawable.ce,
            "Inter Milan", "OB",
            "Brentford", "Tottenham Hotspur", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Who is this?",
            R.drawable.bech,
            "Ebbe Skovdahl", "Troels Bech",
            "Michael Laudrup", "Kasper Hjulmand", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Who bought EfB in '21?",
            R.drawable.efb,
            "TD Ameritrade", "Goldman Sachs Group",
            "Pacific Media Group", "JP Morgan", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "When was the phrase 'Huttelihut' used?",
            R.drawable.huttelihut,
            "EM'92", "EM'84",
            "EM'88", "EM'96", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Which two clubs joined to create this club?",
            R.drawable.fcm,
            "Herning & Viborg", "Vejle & Ikast",
            "Herning & Ikast", "None of the above", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "How many Superliga goals did David Nielsen score?",
            R.drawable.david,
            "94", "86",
            "80", "76", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "The 'great Dane' scored how many goals for Man utd?",
            R.drawable.schmeichel,
            "1", "2",
            "3", "0", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "When did Laudrup retire?",
            R.drawable.laudrup,
            "1998", "1996",
            "1999", "1997", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}