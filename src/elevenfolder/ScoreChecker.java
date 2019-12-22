package elevenfolder;

public class ScoreChecker {

    public static void main(String[] args) {


        int score = 70 ;

        if ( score < 0   || score> 100 ) {
            System.out.println(" invalid score !!");

        }else if ( score == 100) {
            System.out.println( "perfect score ");
        }else if( score > 70 && score < 100) {
            System.out.println(" passing score");
        }else {
            System.out.println(" you have  failed this exam !!!");
        }








    }


}

    // Score = 10000
    // score>70  ||  score < 100


   /*
  * Create a program to check the score :ScoreChecker with main method create a variable called score assign a value of your choice
        If the score is less than 0 or more 100 —>> INVALID SCORE !!
        If the score is 100 —>> Perfect SCORE
        If the score between 70 - 100 —>> YOU HAVE PASSED!
        Else you have failed !!!!
        OPTIONAL :  add more condition for failing scorers
        If the score is less than 20 —> come to my office
        If the score is between 30 - 40 —> attend additional classes
        If the score is between 40 - 70 —> little bit more study will let you pass
*/
