class CountriesTest {
    private val countries: Map<String, String> = mapOf("Ukraine" to "Kiev","USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")

    fun makeInterView() {
        var rightAnswersCount = 0;
        for((key ,value) in countries){
            print("Enter the capital of : $key ")
            var answer: String = readLine().toString()
            if (answer != value){
                print("The answer is wrong , $answer is not a capital of $key , right answer is $value \n")
            } else {
                rightAnswersCount++;
            }
        }
        var perсent: Double = (rightAnswersCount / countries.size.toDouble() * 100)
        print("Percentage of right answers - ${String.format("%.1f",perсent)}% ")
    }

}


fun main(args: Array<String>) {
    var interviewer = CountriesTest();
    interviewer.makeInterView();
}