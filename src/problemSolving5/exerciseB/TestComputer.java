package problemSolving5.exerciseB;

public class TestComputer {
    public static void main(String[] args){
        String output = "Displaying the state of the 3 Computer objects at this point";

        Computer computer1 = new Computer(new Case("Optiplex 71010", "Dell", 240, new Dimension(275,250,100)),"Acer 5363","Asus 2345");

        Computer computer2 = new Computer(new Case("Optiplex GX620", "Dell",230, new Dimension(315,300,120)),"LG 3241", "Intel 6533");

        Computer computer3 = new Computer(new Case("i-Blason", "Apple",115, new Dimension(250,275,110)),"HP 5433", "AMD 1942");

        Computer[] all = new Computer[3];

        all[0] = computer1;
        all[1] = computer2;
        all[2] = computer3;

        for(int i =0; i < all.length ;i++){
            output += "\n\nComputer "+ (i+1) + "\n\n" + all[i].toString() + "\n\n";
        }

        output += "\n\nNow displaying a list of any Computer objects whose case model includes the word \"Optiplex\"\n\n\n";

        String list="";

        for(int i = 0; i<all.length; i++){
            if(all[i].getCases().getModel().toLowerCase().contains("optiplex")){
                list += all[i].toString() + "\n\n";
            }
        }

        System.out.println(output + list);
    }
}
