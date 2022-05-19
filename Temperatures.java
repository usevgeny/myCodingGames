/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Temperatures {
   public static List<Integer> temps = new ArrayList<>();
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temps.add(t);
            
        }
        int etalon=0;
        if (temps.size()!=0){
        etalon = temps.get(0);}
       
        for(int t:temps){ 
            
            if(t<0&&Math.abs(etalon)>Math.abs(t)){
                etalon = t;
            }
            else if(t>0&&Math.abs(etalon)>t){
                etalon=t;
            }
            else if(t==Math.abs(etalon)){
                etalon=t;

            }
           
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(etalon);
    }
}