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
    int b;
    int c;
    int d;
    int e; 
    int f;
    int g;
    int h;
    int ay;
    int by;
    int cy;
    int dy;
    int ya;
    int yb;
    int w;

    int [] fi = {4, 9, 11, 14, 13, 3, 1, 12, 0, 10, 5, 8, 7, 15, 6, 2};
    int ab = a(s, ci, fi[0], lk());
    int ac = a(s, ci, fi[1], lk());

    if (ab > ac)
      a = fi[0];
    else 
      a = fi[1];
    int ba = a(s, ci, fi[2], lk());
    int bb = a(s, ci, fi[3], lk());

    if (ba > bb)
      b = fi[2];
    else 
      b = fi[3];

    int ca = a(s, ci, fi[4], lk());
    int cb = a(s, ci, fi[5], lk());

    if (ca > cb)
      c = fi[4];
    else 
      c = fi[5];

    int da = a(s, ci, fi[6], lk());
    int db = a(s, ci, fi[7], lk());

    if (da > db)
      d = fi[6];
    else 
      d = fi[7];

    int ea = a(s, ci, fi[8], lk());
    int eb = a(s, ci, fi[9], lk());

    if (ea > eb)
      e = fi[8];
    else 
      e = fi[9];

    int fa = a(s, ci, fi[10], lk());
    int fb = a(s, ci, fi[11], lk());

    if (fa > fb)
      f = fi[10];
    else 
      f = fi[11];

    int ga = a(s, ci, fi[12], lk());
    int gb = a(s, ci, fi[13], lk());

    if (ga > gb)
      g = fi[12];
    else 
      g = fi[13];

    int ha = a(s, ci, fi[14], lk());
    int hb = a(s, ci, fi[15], lk());

    if (ha > hb)
      h = fi[14];
    else 
      h = fi[15];


    int az = a(s, ci, fi[a], lk());
    int ax = a(s, ci, fi[b], lk());

    if (az > ax)
      ay = fi[a];
    else 
      ay = fi[b];

    int bz = a(s, ci, fi[c], lk());
    int bx = a(s, ci, fi[d], lk());

    if (bz > bx)
      by = fi[c];
    else 
      by = fi[d];

    int cz = a(s, ci, fi[e], lk());
    int cx = a(s, ci, fi[f], lk());

    if (cz > cx)
      cy = fi[e];
    else 
      cy = fi[f];

    int dz = a(s, ci, fi[g], lk());
    int dx = a(s, ci, fi[h], lk());

    if (dz > dx)
      dy = fi[g];
    else 
      dy = fi[h];

    int za = a(s, ci, fi[ay], lk());
    int xa = a(s, ci, fi[by], lk());

    if (za > xa)
      ya = fi[ay];
    else 
      ya = fi[by];

    int zb = a(s, ci, fi[cy], lk());
    int xb = a(s, ci, fi[dy], lk());

    if (zb > xb)
      yb = fi[cy];
    else 
      yb = fi[dy];

    int ww = a(s, ci, fi[ya], lk());
    int www = a(s, ci, fi[yb], lk());

    if (ya > yb)
      w = fi[ya];
    else 
      w = fi[yb];

    return b;
    
    
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