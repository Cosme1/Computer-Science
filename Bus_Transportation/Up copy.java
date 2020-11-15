import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
import java.util.List; 
import java.util.Random;

public class Up {

	public static void main(String[] args) {

//940, 1086, 10, 230, 291
      int max_cyclists = 16;
      Cyclist [] cyclists = new Cyclist[max_cyclists];
      cyclists [0] = new Cyclist ("Pogacar ",2000, 2000, 2000, 2000, 2000);
      cyclists [1] = new Cyclist ("Roglic ", 480, 1218, 25, 145, 400);
      cyclists [2] = new Cyclist ("Porte ", 712, 616, 13, 182, 156);
      cyclists [3] = new Cyclist ("Evenepoel ", 700, 197, 42, 160, 0);
      cyclists [4] = new Cyclist ("Bennet ", 33, 58, 833, 0, 120);
      cyclists [5] = new Cyclist ("Demare ", 273, 125, 768, 46, 239);
      cyclists [6] = new Cyclist ("Sagan ", 45, 256, 558, 0, 170);
      cyclists [7] = new Cyclist ("Martin ", 478, 766, 16, 6, 239);
      cyclists [8] = new Cyclist ("Kelderman ", 630, 732, 52, 126, 22);
      cyclists [9] = new Cyclist ("Fuglsang ", 575, 730, 136, 76, 535);
      cyclists [10] = new Cyclist ("Van Aert ", 105, 435, 400, 350, 1081);
      cyclists [11] = new Cyclist ("Alaphilippe ", 73, 624, 139, 14, 796);
      cyclists [12] = new Cyclist ("Van Der Poel ", 255, 266, 213, 92, 767);
      cyclists [13] = new Cyclist ("Hirschi ", 39, 568, 10, 0, 615);
      cyclists [14] = new Cyclist ("Ulissi ", 566, 543, 211, 19, 247);
      cyclists [15] = new Cyclist ("Bilbao ", 417, 467, 90, 228, 54);

      int max_stages = 21;
      Stage [] stages = new Stage[max_stages];
      stages [0] = new Stage ("stage 21, flat ", 0, 0, 100, 0, 0);
      stages [1] = new Stage ("stage 1, mostly flat ", 0, 5, 90, 0, 15);
      stages [2] = new Stage ("stage 2, hilly ", 5, 30, 20, 5, 60);
      stages [3] = new Stage ("stage 3, falt ", 0, 0, 95, 0, 5);
      stages [4] = new Stage ("stage 4, mountain ", 40, 70, 0, 0, 40);
      stages [5] = new Stage ("stage 5, mostly flat ", 0, 0, 95, 0, 10);
      stages [6] = new Stage ("stage 6, hilly ", 15, 60, 0, 0, 50);
      stages [7] = new Stage ("stage 7, mostly flat ", 0, 0, 95, 0, 5);
      stages [8] = new Stage ("stage 8, mountain ", 15, 90, 0, 10, 70);
      stages [9] = new Stage ("stage 9, hilly ", 5, 75, 5, 8, 85);
      stages [10] = new Stage ("stage 10, flat ", 0, 0, 100, 0, 0);
      stages [11] = new Stage ("stage 11, flat ", 0, 0, 100, 0, 0);
      stages [12] = new Stage ("stage 12, hilly ", 0, 30, 10, 20, 90);
      stages [13] = new Stage ("stage 13, mountain ", 40, 70, 0, 0, 30);
      stages [14] = new Stage ("stage 14, mostly flat ", 0, 15, 60, 0, 40);
      stages [15] = new Stage ("stage 15, mountain ", 80, 100, 0, 0, 30);
      stages [16] = new Stage ("stage 16, mountain ", 30, 90, 0, 5, 60);
      stages [17] = new Stage ("stage 17, mountain ", 80, 100, 0, 0, 30);
      stages [18] = new Stage ("stage 18, mountain ", 10, 80, 0, 25, 100);
      stages [19] = new Stage ("stage 19, mostly flat ", 0, 5, 60, 0, 40);
      stages [20] = new Stage ("stage 20, tt ", 20, 30, 0, 100, 0);

      int winner = a(stages, cyclists);

//      System.out.println("the winner is: " + cyclists[winner].getName());

      System.out.println(winner);
      
  }

  public static int a(Stage [] s, Cyclist [] ci){

    int a;
    int [] fi = {4, 9, 11, 14, 13, 3, 1, 12, 0, 10, 5, 8, 7, 15, 6, 2};
    
    for (int i = 0; i < fi.length; i++){
      if (a(s, ci [i], lk() > a(s, ci [i+1], lk()))){
        a = fi[i];
      }
    }
    
  }


  public static int a (Stage [] s, Cyclist [] c, int r, int q){

    int al = ( c[r].getGc() * (s[q].getGcs()));
    int bl = ( c[r].getClimbing() * (s[q].getClimbings()));
    int cl = ( c[r].getSprinting() * (s[q].getSprintings()));
    int dl = ( c[r].getTimetrial() * (s[q].getTimetrials()));
    int el = ( c[r].getDay() * (s[q].getDays()));

    int a = al + bl + cl + dl + el;

    return a;
    

  }

  public static int lk(){
      Random rand = new Random(); 

      int upperbound = 21;
        
      int int_random = rand.nextInt(upperbound); 

      return int_random;

    }
	
}