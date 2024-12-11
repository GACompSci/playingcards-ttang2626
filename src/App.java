public class App {
    public static void main(String[] args) throws Exception {
        // Use nested loops to create a full deck (plus two Jokers)
        // printing each card as you create it. 

        for(int i = 1; i <= 6; i++){
            for(int n = 1; n <= 13; n++){
                if(i <= 4){
                    Card card = new Card(n, i);
                    System.out.println(card.toString());
                }
            }
            if (i > 4){
                Card joker = new Card();
                System.out.println(joker.toString());
            }

        }
    }
}
