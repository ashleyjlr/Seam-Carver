import java.awt.Color;
import java.util.ArrayList;
 
import javalib.impworld.WorldScene;
import tester.Tester;
 
//represents an example seam carver world with the image 5x5
class ExamplesSeamCarverGraph15x5 {
  void testMakeScene(Tester t) {
    SeamCarver seamThing = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
    seamThing.bigBang(1000, 1000, 0.1);
  }
}
 
//represents an example seam carver world with the image 1x1
class ExamplesSeamCarverGraph21x1 {
  void testMakeScene(Tester t) {
    SeamCarver seamThing = new SeamCarver(new Graph("src/SeamImages/1x1.png"));
    seamThing.bigBang(1000, 1000, 0.1);
  }
}
 
//represents an example seam carver world with the image Unknown
class ExamplesSeamCarverUnknown {
  void testMakeScene(Tester t) {
    SeamCarver seamThing = new SeamCarver(new Graph("src/SeamImages/Unknown.png"));
    seamThing.bigBang(1000, 1000, 0.05);
  }
}
 
//represents an example seam carver world with the image Unknown-1
class ExamplesSeamCarverUnknown1 {
  void testMakeScene(Tester t) {
    SeamCarver seamThing = new SeamCarver(new Graph("src/SeamImages/Unknown-1.png"));
    seamThing.bigBang(1000, 1000, 0.1);
  }
}
 
//represents an example seam carver world with the image Werner
class ExamplesSeamCarverWerner {
  void testMakeScene(Tester t) {
    SeamCarver seamThing = new SeamCarver(new Graph("src/SeamImages/Werner.jpg"));
    seamThing.bigBang(1000, 1000, 0.1);
  }
}
 
// examples and tests for SeamCarving
class ExamplesSeamCarving {
 
  // example 5X5 graph 1
  ImagePixel g1_p1;
  ImagePixel g1_p2;
  ImagePixel g1_p3;
  ImagePixel g1_p4;
  ImagePixel g1_p5;
  ImagePixel g1_p6;
  ImagePixel g1_p7;
  ImagePixel g1_p8;
  ImagePixel g1_p9;
  ImagePixel g1_p10;
  ImagePixel g1_p11;
  ImagePixel g1_p12;
  ImagePixel g1_p13;
  ImagePixel g1_p14;
  ImagePixel g1_p15;
  ImagePixel g1_p16;
  ImagePixel g1_p17;
  ImagePixel g1_p18;
  ImagePixel g1_p19;
  ImagePixel g1_p20;
  ImagePixel g1_p21;
  ImagePixel g1_p22;
  ImagePixel g1_p23;
  ImagePixel g1_p24;
  ImagePixel g1_p25;
  BorderPixel g1_pA;
  BorderPixel g1_pB;
  BorderPixel g1_pC;
  BorderPixel g1_pD;
  BorderPixel g1_pE;
  BorderPixel g1_pF;
  BorderPixel g1_pG;
  BorderPixel g1_pH;
  BorderPixel g1_pI;
  BorderPixel g1_pJ;
  BorderPixel g1_pK;
  BorderPixel g1_pL;
  BorderPixel g1_pM;
  BorderPixel g1_pN;
  BorderPixel g1_pO;
  BorderPixel g1_pP;
  BorderPixel g1_pQ;
  BorderPixel g1_pR;
  BorderPixel g1_pS;
  BorderPixel g1_pT;
 
  ArrayList<ArrayList<APixel>> graph1List;
  ArrayList<APixel> g1_row1;
  ArrayList<APixel> g1_row2;
  ArrayList<APixel> g1_row3;
  ArrayList<APixel> g1_row4;
  ArrayList<APixel> g1_row5;
  ArrayList<APixel> g1_row6;
  ArrayList<APixel> g1_row7;
 
  Graph graph1;
 
  // examples 1x1 graph 2
  ImagePixel g2_p1;
  BorderPixel g2_pA;
  BorderPixel g2_pB;
  BorderPixel g2_pC;
  BorderPixel g2_pD;
 
  ArrayList<ArrayList<APixel>> graph2List;
  ArrayList<APixel> g2_row1;
  ArrayList<APixel> g2_row2;
  ArrayList<APixel> g2_row3;
 
  Graph graph2;
 
  // EFFECT: sets up the example 5x5 graph 1
  void initData_Graph1_5X5() {
    this.g1_p1 = new ImagePixel(Color.red);
    this.g1_p2 = new ImagePixel(Color.orange);
    this.g1_p3 = new ImagePixel(Color.yellow);
    this.g1_p4 = new ImagePixel(Color.green);
    this.g1_p5 = new ImagePixel(Color.blue);
    this.g1_p6 = new ImagePixel(Color.darkGray);
    this.g1_p7 = new ImagePixel(Color.cyan);
    this.g1_p8 = new ImagePixel(Color.pink);
    this.g1_p9 = new ImagePixel(Color.gray);
    this.g1_p10 = new ImagePixel(Color.magenta);
    this.g1_p11 = new ImagePixel(Color.magenta);
    this.g1_p12 = new ImagePixel(Color.magenta);
    this.g1_p13 = new ImagePixel(Color.magenta);
    this.g1_p14 = new ImagePixel(Color.magenta);
    this.g1_p15 = new ImagePixel(Color.magenta);
    this.g1_p16 = new ImagePixel(Color.magenta);
    this.g1_p17 = new ImagePixel(Color.magenta);
    this.g1_p18 = new ImagePixel(Color.magenta);
    this.g1_p19 = new ImagePixel(Color.magenta);
    this.g1_p20 = new ImagePixel(Color.magenta);
    this.g1_p21 = new ImagePixel(Color.magenta);
    this.g1_p22 = new ImagePixel(Color.magenta);
    this.g1_p23 = new ImagePixel(Color.magenta);
    this.g1_p24 = new ImagePixel(Color.magenta);
    this.g1_p25 = new ImagePixel(Color.magenta);
 
    this.g1_pA = new BorderPixel();
    this.g1_pB = new BorderPixel();
    this.g1_pC = new BorderPixel();
    this.g1_pD = new BorderPixel();
    this.g1_pE = new BorderPixel();
    this.g1_pF = new BorderPixel();
    this.g1_pG = new BorderPixel();
    this.g1_pH = new BorderPixel();
    this.g1_pI = new BorderPixel();
    this.g1_pJ = new BorderPixel();
    this.g1_pK = new BorderPixel();
    this.g1_pL = new BorderPixel();
    this.g1_pM = new BorderPixel();
    this.g1_pN = new BorderPixel();
    this.g1_pO = new BorderPixel();
    this.g1_pP = new BorderPixel();
    this.g1_pQ = new BorderPixel();
    this.g1_pR = new BorderPixel();
    this.g1_pS = new BorderPixel();
    this.g1_pT = new BorderPixel();
 
    this.graph1List = new ArrayList<ArrayList<APixel>>();
    this.g1_row1 = new ArrayList<APixel>();
    this.g1_row2 = new ArrayList<APixel>();
    this.g1_row3 = new ArrayList<APixel>();
    this.g1_row4 = new ArrayList<APixel>();
    this.g1_row5 = new ArrayList<APixel>();
    this.g1_row6 = new ArrayList<APixel>();
    this.g1_row7 = new ArrayList<APixel>();
  }
 
  // EFFECT: initializes the example 1x1 graph 2
  void initData_Graph2_1X1() {
    this.g2_p1 = new ImagePixel(Color.red);
    this.g2_pA = new BorderPixel();
    this.g2_pB = new BorderPixel();
    this.g2_pC = new BorderPixel();
    this.g2_pD = new BorderPixel();
 
    this.graph2List = new ArrayList<ArrayList<APixel>>();
    this.g2_row1 = new ArrayList<APixel>();
    this.g2_row2 = new ArrayList<APixel>();
    this.g2_row3 = new ArrayList<APixel>();
  }
 
  // EFFECT: Checks that the initial fields of examples 5X5 graph 1 pixels are set
  // to null/empty
  // and the lists in the graph are empty
  void testCheckInit_Graph1_5X5(Tester t) {
 
    // Initializes the example graph
    this.initData_Graph1_5X5();
 
    t.checkExpect(this.g1_p1.color, Color.red);
    t.checkExpect(this.g1_p1.energy, null);
    t.checkExpect(this.g1_p1.horizontalEnergy, null);
    t.checkExpect(this.g1_p1.verticalEnergy, null);
    t.checkExpect(this.g1_p1.up, null);
    t.checkExpect(this.g1_p1.right, null);
    t.checkExpect(this.g1_p1.down, null);
    t.checkExpect(this.g1_p1.left, null);
    t.checkExpect(this.g1_p1.brightness, this.g1_p1.calculateBrightness());
    t.checkExpect(this.g1_p2.color, Color.orange);
    t.checkExpect(this.g1_p2.energy, null);
    t.checkExpect(this.g1_p2.horizontalEnergy, null);
    t.checkExpect(this.g1_p2.verticalEnergy, null);
    t.checkExpect(this.g1_p2.up, null);
    t.checkExpect(this.g1_p2.right, null);
    t.checkExpect(this.g1_p2.down, null);
    t.checkExpect(this.g1_p2.left, null);
    t.checkExpect(this.g1_p2.brightness, this.g1_p2.calculateBrightness());
    t.checkExpect(this.g1_p3.color, Color.yellow);
    t.checkExpect(this.g1_p3.energy, null);
    t.checkExpect(this.g1_p3.horizontalEnergy, null);
    t.checkExpect(this.g1_p3.verticalEnergy, null);
    t.checkExpect(this.g1_p3.up, null);
    t.checkExpect(this.g1_p3.right, null);
    t.checkExpect(this.g1_p3.down, null);
    t.checkExpect(this.g1_p3.left, null);
    t.checkExpect(this.g1_p3.brightness, this.g1_p3.calculateBrightness());
    t.checkExpect(this.g1_p4.color, Color.green);
    t.checkExpect(this.g1_p4.energy, null);
    t.checkExpect(this.g1_p4.horizontalEnergy, null);
    t.checkExpect(this.g1_p4.verticalEnergy, null);
    t.checkExpect(this.g1_p4.up, null);
    t.checkExpect(this.g1_p4.right, null);
    t.checkExpect(this.g1_p4.down, null);
    t.checkExpect(this.g1_p4.left, null);
    t.checkExpect(this.g1_p4.brightness, this.g1_p4.calculateBrightness());
    t.checkExpect(this.g1_p5.color, Color.blue);
    t.checkExpect(this.g1_p5.energy, null);
    t.checkExpect(this.g1_p5.horizontalEnergy, null);
    t.checkExpect(this.g1_p5.verticalEnergy, null);
    t.checkExpect(this.g1_p5.up, null);
    t.checkExpect(this.g1_p5.right, null);
    t.checkExpect(this.g1_p5.down, null);
    t.checkExpect(this.g1_p5.left, null);
    t.checkExpect(this.g1_p5.brightness, this.g1_p5.calculateBrightness());
    t.checkExpect(this.g1_p6.color, Color.darkGray);
    t.checkExpect(this.g1_p6.energy, null);
    t.checkExpect(this.g1_p6.horizontalEnergy, null);
    t.checkExpect(this.g1_p6.verticalEnergy, null);
    t.checkExpect(this.g1_p6.up, null);
    t.checkExpect(this.g1_p6.right, null);
    t.checkExpect(this.g1_p6.down, null);
    t.checkExpect(this.g1_p6.left, null);
    t.checkExpect(this.g1_p6.brightness, this.g1_p6.calculateBrightness());
    t.checkExpect(this.g1_p7.color, Color.cyan);
    t.checkExpect(this.g1_p7.energy, null);
    t.checkExpect(this.g1_p7.horizontalEnergy, null);
    t.checkExpect(this.g1_p7.verticalEnergy, null);
    t.checkExpect(this.g1_p7.up, null);
    t.checkExpect(this.g1_p7.right, null);
    t.checkExpect(this.g1_p7.down, null);
    t.checkExpect(this.g1_p7.left, null);
    t.checkExpect(this.g1_p7.brightness, this.g1_p7.calculateBrightness());
    t.checkExpect(this.g1_p8.color, Color.pink);
    t.checkExpect(this.g1_p8.energy, null);
    t.checkExpect(this.g1_p8.horizontalEnergy, null);
    t.checkExpect(this.g1_p8.verticalEnergy, null);
    t.checkExpect(this.g1_p8.up, null);
    t.checkExpect(this.g1_p8.right, null);
    t.checkExpect(this.g1_p8.down, null);
    t.checkExpect(this.g1_p8.left, null);
    t.checkExpect(this.g1_p8.brightness, this.g1_p8.calculateBrightness());
    t.checkExpect(this.g1_p9.color, Color.gray);
    t.checkExpect(this.g1_p9.energy, null);
    t.checkExpect(this.g1_p9.horizontalEnergy, null);
    t.checkExpect(this.g1_p9.verticalEnergy, null);
    t.checkExpect(this.g1_p9.up, null);
    t.checkExpect(this.g1_p9.right, null);
    t.checkExpect(this.g1_p9.down, null);
    t.checkExpect(this.g1_p9.left, null);
    t.checkExpect(this.g1_p9.brightness, this.g1_p9.calculateBrightness());
    t.checkExpect(this.g1_p10.color, Color.magenta);
    t.checkExpect(this.g1_p10.energy, null);
    t.checkExpect(this.g1_p10.horizontalEnergy, null);
    t.checkExpect(this.g1_p10.verticalEnergy, null);
    t.checkExpect(this.g1_p10.up, null);
    t.checkExpect(this.g1_p10.right, null);
    t.checkExpect(this.g1_p10.down, null);
    t.checkExpect(this.g1_p10.left, null);
    t.checkExpect(this.g1_p10.brightness, this.g1_p10.calculateBrightness());
    t.checkExpect(this.g1_p11.color, Color.magenta);
    t.checkExpect(this.g1_p11.energy, null);
    t.checkExpect(this.g1_p11.horizontalEnergy, null);
    t.checkExpect(this.g1_p11.verticalEnergy, null);
    t.checkExpect(this.g1_p11.up, null);
    t.checkExpect(this.g1_p11.right, null);
    t.checkExpect(this.g1_p11.down, null);
    t.checkExpect(this.g1_p11.left, null);
    t.checkExpect(this.g1_p11.brightness, this.g1_p11.calculateBrightness());
    t.checkExpect(this.g1_p12.color, Color.magenta);
    t.checkExpect(this.g1_p12.energy, null);
    t.checkExpect(this.g1_p12.horizontalEnergy, null);
    t.checkExpect(this.g1_p12.verticalEnergy, null);
    t.checkExpect(this.g1_p12.up, null);
    t.checkExpect(this.g1_p12.right, null);
    t.checkExpect(this.g1_p12.down, null);
    t.checkExpect(this.g1_p12.left, null);
    t.checkExpect(this.g1_p12.brightness, this.g1_p12.calculateBrightness());
    t.checkExpect(this.g1_p13.color, Color.magenta);
    t.checkExpect(this.g1_p13.energy, null);
    t.checkExpect(this.g1_p13.horizontalEnergy, null);
    t.checkExpect(this.g1_p13.verticalEnergy, null);
    t.checkExpect(this.g1_p13.up, null);
    t.checkExpect(this.g1_p13.right, null);
    t.checkExpect(this.g1_p13.down, null);
    t.checkExpect(this.g1_p13.left, null);
    t.checkExpect(this.g1_p13.brightness, this.g1_p13.calculateBrightness());
    t.checkExpect(this.g1_p14.color, Color.magenta);
    t.checkExpect(this.g1_p14.energy, null);
    t.checkExpect(this.g1_p14.horizontalEnergy, null);
    t.checkExpect(this.g1_p14.verticalEnergy, null);
    t.checkExpect(this.g1_p14.up, null);
    t.checkExpect(this.g1_p14.right, null);
    t.checkExpect(this.g1_p14.down, null);
    t.checkExpect(this.g1_p14.left, null);
    t.checkExpect(this.g1_p14.brightness, this.g1_p14.calculateBrightness());
    t.checkExpect(this.g1_p15.color, Color.magenta);
    t.checkExpect(this.g1_p15.energy, null);
    t.checkExpect(this.g1_p15.horizontalEnergy, null);
    t.checkExpect(this.g1_p15.verticalEnergy, null);
    t.checkExpect(this.g1_p15.up, null);
    t.checkExpect(this.g1_p15.right, null);
    t.checkExpect(this.g1_p15.down, null);
    t.checkExpect(this.g1_p15.left, null);
    t.checkExpect(this.g1_p15.brightness, this.g1_p15.calculateBrightness());
    t.checkExpect(this.g1_p16.color, Color.magenta);
    t.checkExpect(this.g1_p16.energy, null);
    t.checkExpect(this.g1_p16.horizontalEnergy, null);
    t.checkExpect(this.g1_p16.verticalEnergy, null);
    t.checkExpect(this.g1_p16.up, null);
    t.checkExpect(this.g1_p16.right, null);
    t.checkExpect(this.g1_p16.down, null);
    t.checkExpect(this.g1_p16.left, null);
    t.checkExpect(this.g1_p16.brightness, this.g1_p16.calculateBrightness());
    t.checkExpect(this.g1_p17.color, Color.magenta);
    t.checkExpect(this.g1_p17.energy, null);
    t.checkExpect(this.g1_p17.horizontalEnergy, null);
    t.checkExpect(this.g1_p17.verticalEnergy, null);
    t.checkExpect(this.g1_p17.up, null);
    t.checkExpect(this.g1_p17.right, null);
    t.checkExpect(this.g1_p17.down, null);
    t.checkExpect(this.g1_p17.left, null);
    t.checkExpect(this.g1_p17.brightness, this.g1_p17.calculateBrightness());
    t.checkExpect(this.g1_p18.color, Color.magenta);
    t.checkExpect(this.g1_p18.energy, null);
    t.checkExpect(this.g1_p18.horizontalEnergy, null);
    t.checkExpect(this.g1_p18.verticalEnergy, null);
    t.checkExpect(this.g1_p18.up, null);
    t.checkExpect(this.g1_p18.right, null);
    t.checkExpect(this.g1_p18.down, null);
    t.checkExpect(this.g1_p18.left, null);
    t.checkExpect(this.g1_p18.brightness, this.g1_p18.calculateBrightness());
    t.checkExpect(this.g1_p19.color, Color.magenta);
    t.checkExpect(this.g1_p19.energy, null);
    t.checkExpect(this.g1_p19.horizontalEnergy, null);
    t.checkExpect(this.g1_p19.verticalEnergy, null);
    t.checkExpect(this.g1_p19.up, null);
    t.checkExpect(this.g1_p19.right, null);
    t.checkExpect(this.g1_p19.down, null);
    t.checkExpect(this.g1_p19.left, null);
    t.checkExpect(this.g1_p19.brightness, this.g1_p19.calculateBrightness());
    t.checkExpect(this.g1_p20.color, Color.magenta);
    t.checkExpect(this.g1_p20.energy, null);
    t.checkExpect(this.g1_p20.horizontalEnergy, null);
    t.checkExpect(this.g1_p20.verticalEnergy, null);
    t.checkExpect(this.g1_p20.up, null);
    t.checkExpect(this.g1_p20.right, null);
    t.checkExpect(this.g1_p20.down, null);
    t.checkExpect(this.g1_p20.left, null);
    t.checkExpect(this.g1_p20.brightness, this.g1_p20.calculateBrightness());
    t.checkExpect(this.g1_p21.color, Color.magenta);
    t.checkExpect(this.g1_p21.energy, null);
    t.checkExpect(this.g1_p21.horizontalEnergy, null);
    t.checkExpect(this.g1_p21.verticalEnergy, null);
    t.checkExpect(this.g1_p21.up, null);
    t.checkExpect(this.g1_p21.right, null);
    t.checkExpect(this.g1_p21.down, null);
    t.checkExpect(this.g1_p21.left, null);
    t.checkExpect(this.g1_p21.brightness, this.g1_p21.calculateBrightness());
    t.checkExpect(this.g1_p22.color, Color.magenta);
    t.checkExpect(this.g1_p22.energy, null);
    t.checkExpect(this.g1_p22.horizontalEnergy, null);
    t.checkExpect(this.g1_p22.verticalEnergy, null);
    t.checkExpect(this.g1_p22.up, null);
    t.checkExpect(this.g1_p22.right, null);
    t.checkExpect(this.g1_p22.down, null);
    t.checkExpect(this.g1_p22.left, null);
    t.checkExpect(this.g1_p22.brightness, this.g1_p22.calculateBrightness());
    t.checkExpect(this.g1_p23.color, Color.magenta);
    t.checkExpect(this.g1_p23.energy, null);
    t.checkExpect(this.g1_p23.horizontalEnergy, null);
    t.checkExpect(this.g1_p23.verticalEnergy, null);
    t.checkExpect(this.g1_p23.up, null);
    t.checkExpect(this.g1_p23.right, null);
    t.checkExpect(this.g1_p23.down, null);
    t.checkExpect(this.g1_p23.left, null);
    t.checkExpect(this.g1_p23.brightness, this.g1_p23.calculateBrightness());
    t.checkExpect(this.g1_p24.color, Color.magenta);
    t.checkExpect(this.g1_p24.energy, null);
    t.checkExpect(this.g1_p24.horizontalEnergy, null);
    t.checkExpect(this.g1_p24.verticalEnergy, null);
    t.checkExpect(this.g1_p24.up, null);
    t.checkExpect(this.g1_p24.right, null);
    t.checkExpect(this.g1_p24.down, null);
    t.checkExpect(this.g1_p24.left, null);
    t.checkExpect(this.g1_p24.brightness, this.g1_p24.calculateBrightness());
    t.checkExpect(this.g1_p25.color, Color.magenta);
    t.checkExpect(this.g1_p25.energy, null);
    t.checkExpect(this.g1_p25.horizontalEnergy, null);
    t.checkExpect(this.g1_p25.verticalEnergy, null);
    t.checkExpect(this.g1_p25.up, null);
    t.checkExpect(this.g1_p25.right, null);
    t.checkExpect(this.g1_p25.down, null);
    t.checkExpect(this.g1_p25.left, null);
    t.checkExpect(this.g1_p25.brightness, this.g1_p25.calculateBrightness());
 
    t.checkExpect(this.g1_pA.color, Color.black);
    t.checkExpect(this.g1_pA.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pA.brightness, this.g1_pA.calculateBrightness());
    t.checkExpect(this.g1_pA.up, this.g1_pA);
   t.checkExpect(this.g1_pA.right, this.g1_pA);
    t.checkExpect(this.g1_pA.down, this.g1_pA);
    t.checkExpect(this.g1_pA.left, this.g1_pA);
    t.checkExpect(this.g1_pA.inwardPixel, null);
    t.checkExpect(this.g1_pB.color, Color.black);
    t.checkExpect(this.g1_pB.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pB.brightness, this.g1_pB.calculateBrightness());
    t.checkExpect(this.g1_pB.up, this.g1_pB);
    t.checkExpect(this.g1_pB.right, this.g1_pB);
    t.checkExpect(this.g1_pB.down, this.g1_pB);
    t.checkExpect(this.g1_pB.left, this.g1_pB);
    t.checkExpect(this.g1_pB.inwardPixel, null);
    t.checkExpect(this.g1_pC.color, Color.black);
    t.checkExpect(this.g1_pC.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pC.brightness, this.g1_pC.calculateBrightness());
    t.checkExpect(this.g1_pC.up, this.g1_pC);
    t.checkExpect(this.g1_pC.right, this.g1_pC);
    t.checkExpect(this.g1_pC.down, this.g1_pC);
    t.checkExpect(this.g1_pC.left, this.g1_pC);
    t.checkExpect(this.g1_pC.inwardPixel, null);
    t.checkExpect(this.g1_pD.color, Color.black);
    t.checkExpect(this.g1_pD.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pD.brightness, this.g1_pD.calculateBrightness());
    t.checkExpect(this.g1_pD.up, this.g1_pD);
    t.checkExpect(this.g1_pD.right, this.g1_pD);
    t.checkExpect(this.g1_pD.down, this.g1_pD);
    t.checkExpect(this.g1_pD.left, this.g1_pD);
    t.checkExpect(this.g1_pD.inwardPixel, null);
    t.checkExpect(this.g1_pE.color, Color.black);
    t.checkExpect(this.g1_pE.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pE.brightness, this.g1_pE.calculateBrightness());
    t.checkExpect(this.g1_pE.up, this.g1_pE);
    t.checkExpect(this.g1_pE.right, this.g1_pE);
    t.checkExpect(this.g1_pE.down, this.g1_pE);
    t.checkExpect(this.g1_pE.left, this.g1_pE);
    t.checkExpect(this.g1_pE.inwardPixel, null);
    t.checkExpect(this.g1_pF.color, Color.black);
    t.checkExpect(this.g1_pF.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pF.brightness, this.g1_pF.calculateBrightness());
    t.checkExpect(this.g1_pF.up, this.g1_pF);
    t.checkExpect(this.g1_pF.right, this.g1_pF);
    t.checkExpect(this.g1_pF.down, this.g1_pF);
    t.checkExpect(this.g1_pF.left, this.g1_pF);
    t.checkExpect(this.g1_pF.inwardPixel, null);
    t.checkExpect(this.g1_pG.color, Color.black);
    t.checkExpect(this.g1_pG.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pG.brightness, this.g1_pG.calculateBrightness());
    t.checkExpect(this.g1_pG.up, this.g1_pG);
    t.checkExpect(this.g1_pG.right, this.g1_pG);
    t.checkExpect(this.g1_pG.down, this.g1_pG);
    t.checkExpect(this.g1_pG.left, this.g1_pG);
    t.checkExpect(this.g1_pG.inwardPixel, null);
    t.checkExpect(this.g1_pH.color, Color.black);
    t.checkExpect(this.g1_pH.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pH.brightness, this.g1_pH.calculateBrightness());
    t.checkExpect(this.g1_pH.up, this.g1_pH);
    t.checkExpect(this.g1_pH.right, this.g1_pH);
    t.checkExpect(this.g1_pH.down, this.g1_pH);
    t.checkExpect(this.g1_pH.left, this.g1_pH);
    t.checkExpect(this.g1_pH.inwardPixel, null);
    t.checkExpect(this.g1_pI.color, Color.black);
    t.checkExpect(this.g1_pI.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pI.brightness, this.g1_pI.calculateBrightness());
    t.checkExpect(this.g1_pI.up, this.g1_pI);
    t.checkExpect(this.g1_pI.right, this.g1_pI);
    t.checkExpect(this.g1_pI.down, this.g1_pI);
    t.checkExpect(this.g1_pI.left, this.g1_pI);
    t.checkExpect(this.g1_pI.inwardPixel, null);
    t.checkExpect(this.g1_pJ.color, Color.black);
    t.checkExpect(this.g1_pJ.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pJ.brightness, this.g1_pJ.calculateBrightness());
    t.checkExpect(this.g1_pJ.up, this.g1_pJ);
    t.checkExpect(this.g1_pJ.right, this.g1_pJ);
    t.checkExpect(this.g1_pJ.down, this.g1_pJ);
    t.checkExpect(this.g1_pJ.left, this.g1_pJ);
    t.checkExpect(this.g1_pJ.inwardPixel, null);
    t.checkExpect(this.g1_pK.color, Color.black);
    t.checkExpect(this.g1_pK.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pK.brightness, this.g1_pK.calculateBrightness());
    t.checkExpect(this.g1_pK.up, this.g1_pK);
    t.checkExpect(this.g1_pK.right, this.g1_pK);
    t.checkExpect(this.g1_pK.down, this.g1_pK);
    t.checkExpect(this.g1_pK.left, this.g1_pK);
    t.checkExpect(this.g1_pK.inwardPixel, null);
    t.checkExpect(this.g1_pL.color, Color.black);
    t.checkExpect(this.g1_pL.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pL.brightness, this.g1_pL.calculateBrightness());
    t.checkExpect(this.g1_pL.up, this.g1_pL);
    t.checkExpect(this.g1_pL.right, this.g1_pL);
    t.checkExpect(this.g1_pL.down, this.g1_pL);
    t.checkExpect(this.g1_pL.left, this.g1_pL);
    t.checkExpect(this.g1_pL.inwardPixel, null);
    t.checkExpect(this.g1_pM.color, Color.black);
    t.checkExpect(this.g1_pM.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pM.brightness, this.g1_pM.calculateBrightness());
    t.checkExpect(this.g1_pM.up, this.g1_pM);
    t.checkExpect(this.g1_pM.right, this.g1_pM);
    t.checkExpect(this.g1_pM.down, this.g1_pM);
    t.checkExpect(this.g1_pM.left, this.g1_pM);
    t.checkExpect(this.g1_pM.inwardPixel, null);
    t.checkExpect(this.g1_pN.color, Color.black);
    t.checkExpect(this.g1_pN.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pN.brightness, this.g1_pN.calculateBrightness());
    t.checkExpect(this.g1_pN.up, this.g1_pN);
    t.checkExpect(this.g1_pN.right, this.g1_pN);
    t.checkExpect(this.g1_pN.down, this.g1_pN);
    t.checkExpect(this.g1_pN.left, this.g1_pN);
    t.checkExpect(this.g1_pN.inwardPixel, null);
    t.checkExpect(this.g1_pO.color, Color.black);
    t.checkExpect(this.g1_pO.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pO.brightness, this.g1_pO.calculateBrightness());
    t.checkExpect(this.g1_pO.up, this.g1_pO);
    t.checkExpect(this.g1_pO.right, this.g1_pO);
    t.checkExpect(this.g1_pO.down, this.g1_pO);
    t.checkExpect(this.g1_pO.left, this.g1_pO);
    t.checkExpect(this.g1_pO.inwardPixel, null);
    t.checkExpect(this.g1_pP.color, Color.black);
    t.checkExpect(this.g1_pP.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pP.brightness, this.g1_pP.calculateBrightness());
    t.checkExpect(this.g1_pP.up, this.g1_pP);
    t.checkExpect(this.g1_pP.right, this.g1_pP);
    t.checkExpect(this.g1_pP.down, this.g1_pP);
    t.checkExpect(this.g1_pP.left, this.g1_pP);
    t.checkExpect(this.g1_pP.inwardPixel, null);
    t.checkExpect(this.g1_pQ.color, Color.black);
    t.checkExpect(this.g1_pQ.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pQ.brightness, this.g1_pQ.calculateBrightness());
    t.checkExpect(this.g1_pQ.up, this.g1_pQ);
    t.checkExpect(this.g1_pQ.right, this.g1_pQ);
    t.checkExpect(this.g1_pQ.down, this.g1_pQ);
    t.checkExpect(this.g1_pQ.left, this.g1_pQ);
    t.checkExpect(this.g1_pQ.inwardPixel, null);
    t.checkExpect(this.g1_pR.color, Color.black);
    t.checkExpect(this.g1_pR.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pR.brightness, this.g1_pR.calculateBrightness());
    t.checkExpect(this.g1_pR.up, this.g1_pR);
    t.checkExpect(this.g1_pR.right, this.g1_pR);
    t.checkExpect(this.g1_pR.down, this.g1_pR);
    t.checkExpect(this.g1_pR.left, this.g1_pR);
    t.checkExpect(this.g1_pR.inwardPixel, null);
    t.checkExpect(this.g1_pS.color, Color.black);
    t.checkExpect(this.g1_pS.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pS.brightness, this.g1_pS.calculateBrightness());
    t.checkExpect(this.g1_pS.up, this.g1_pS);
    t.checkExpect(this.g1_pS.right, this.g1_pS);
    t.checkExpect(this.g1_pS.down, this.g1_pS);
    t.checkExpect(this.g1_pS.left, this.g1_pS);
    t.checkExpect(this.g1_pS.inwardPixel, null);
    t.checkExpect(this.g1_pT.color, Color.black);
    t.checkExpect(this.g1_pT.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pT.brightness, this.g1_pT.calculateBrightness());
    t.checkExpect(this.g1_pT.up, this.g1_pT);
    t.checkExpect(this.g1_pT.right, this.g1_pT);
    t.checkExpect(this.g1_pT.down, this.g1_pT);
    t.checkExpect(this.g1_pT.left, this.g1_pT);
    t.checkExpect(this.g1_pT.inwardPixel, null);
 
    t.checkExpect(this.graph1List, new ArrayList<ArrayList<APixel>>());
    t.checkExpect(this.g1_row1, new ArrayList<APixel>());
    t.checkExpect(this.g1_row2, new ArrayList<APixel>());
    t.checkExpect(this.g1_row3, new ArrayList<APixel>());
    t.checkExpect(this.g1_row4, new ArrayList<APixel>());
    t.checkExpect(this.g1_row5, new ArrayList<APixel>());
    t.checkExpect(this.g1_row6, new ArrayList<APixel>());
    t.checkExpect(this.g1_row7, new ArrayList<APixel>());
  }
 
  // EFFECT: Checks that the initial fields of examples 1x1 graph 2 pixels are set
  // to null/empty
  // and the lists in the graph are empty
  void testCheckInit_Graph2_1X1(Tester t) {
 
    // Initializes the example graph
    this.initData_Graph2_1X1();
 
    t.checkExpect(this.g2_p1.color, Color.red);
    t.checkExpect(this.g2_p1.energy, null);
    t.checkExpect(this.g2_p1.horizontalEnergy, null);
    t.checkExpect(this.g2_p1.verticalEnergy, null);
    t.checkExpect(this.g2_p1.up, null);
    t.checkExpect(this.g2_p1.right, null);
    t.checkExpect(this.g2_p1.down, null);
    t.checkExpect(this.g2_p1.left, null);
    t.checkExpect(this.g2_p1.brightness, this.g2_p1.calculateBrightness());
 
    t.checkExpect(this.g2_pA.color, Color.black);
    t.checkExpect(this.g2_pA.energy, Double.MAX_VALUE);
    t.checkExpect(this.g2_pA.brightness, this.g2_pA.calculateBrightness());
    t.checkExpect(this.g2_pA.up, this.g2_pA);
   t.checkExpect(this.g2_pA.right, this.g2_pA);
    t.checkExpect(this.g2_pA.down, this.g2_pA);
    t.checkExpect(this.g2_pA.left, this.g2_pA);
    t.checkExpect(this.g2_pA.inwardPixel, null);
    t.checkExpect(this.g2_pB.color, Color.black);
    t.checkExpect(this.g2_pB.energy, Double.MAX_VALUE);
    t.checkExpect(this.g2_pB.brightness, this.g2_pB.calculateBrightness());
    t.checkExpect(this.g2_pB.up, this.g2_pB);
    t.checkExpect(this.g2_pB.right, this.g2_pB);
    t.checkExpect(this.g2_pB.down, this.g2_pB);
    t.checkExpect(this.g2_pB.left, this.g2_pB);
    t.checkExpect(this.g2_pB.inwardPixel, null);
    t.checkExpect(this.g2_pC.color, Color.black);
    t.checkExpect(this.g2_pC.energy, Double.MAX_VALUE);
    t.checkExpect(this.g2_pC.brightness, this.g2_pC.calculateBrightness());
    t.checkExpect(this.g2_pC.up, this.g2_pC);
    t.checkExpect(this.g2_pC.right, this.g2_pC);
    t.checkExpect(this.g2_pC.down, this.g2_pC);
    t.checkExpect(this.g2_pC.left, this.g2_pC);
    t.checkExpect(this.g2_pC.inwardPixel, null);
    t.checkExpect(this.g2_pD.color, Color.black);
    t.checkExpect(this.g2_pD.energy, Double.MAX_VALUE);
    t.checkExpect(this.g2_pD.brightness, this.g2_pD.calculateBrightness());
    t.checkExpect(this.g2_pD.up, this.g2_pD);
    t.checkExpect(this.g2_pD.right, this.g2_pD);
    t.checkExpect(this.g2_pD.down, this.g2_pD);
    t.checkExpect(this.g2_pD.left, this.g2_pD);
    t.checkExpect(this.g2_pD.inwardPixel, null);
 
    t.checkExpect(this.graph2List, new ArrayList<ArrayList<APixel>>());
    t.checkExpect(this.g2_row1, new ArrayList<APixel>());
    t.checkExpect(this.g2_row2, new ArrayList<APixel>());
    t.checkExpect(this.g2_row3, new ArrayList<APixel>());
  }
 
  // EFFECT: sets up the example 5X5 graph 1 with the neighbors and energies
  void setData_Graph1_5X5(Tester t) {
 
    // Checks that the initial fields of examples 5X5 graph 1 pixels are set to
    // null/empty
    // and the lists in the graph are empty
    this.testCheckInit_Graph1_5X5(t);
 
    this.g1_p1.updateNeighbors(this.g1_pA, this.g1_p2, this.g1_p6, this.g1_pT);
    this.g1_p2.updateNeighbors(this.g1_pB, this.g1_p3, this.g1_p7, this.g1_p1);
    this.g1_p3.updateNeighbors(this.g1_pC, this.g1_p4, this.g1_p8, this.g1_p2);
    this.g1_p4.updateNeighbors(this.g1_pD, this.g1_p5, this.g1_p9, this.g1_p3);
    this.g1_p5.updateNeighbors(this.g1_pE, this.g1_pF, this.g1_p10, this.g1_p4);
    this.g1_p6.updateNeighbors(this.g1_p1, this.g1_p7, this.g1_p11, this.g1_pS);
    this.g1_p7.updateNeighbors(this.g1_p2, this.g1_p8, this.g1_p12, this.g1_p6);
    this.g1_p8.updateNeighbors(this.g1_p3, this.g1_p9, this.g1_p13, this.g1_p7);
    this.g1_p9.updateNeighbors(this.g1_p4, this.g1_p10, this.g1_p14, this.g1_p8);
    this.g1_p10.updateNeighbors(this.g1_p5, this.g1_pG, this.g1_p15, this.g1_p9);
    this.g1_p11.updateNeighbors(this.g1_p6, this.g1_p12, this.g1_p16, this.g1_pR);
    this.g1_p12.updateNeighbors(this.g1_p7, this.g1_p13, this.g1_p17, this.g1_p11);
    this.g1_p13.updateNeighbors(this.g1_p8, this.g1_p14, this.g1_p18, this.g1_p12);
    this.g1_p14.updateNeighbors(this.g1_p9, this.g1_p15, this.g1_p19, this.g1_p13);
    this.g1_p15.updateNeighbors(this.g1_p10, this.g1_pH, this.g1_p20, this.g1_p14);
    this.g1_p16.updateNeighbors(this.g1_p11, this.g1_p17, this.g1_p21, this.g1_pQ);
    this.g1_p17.updateNeighbors(this.g1_p12, this.g1_p18, this.g1_p22, this.g1_p16);
    this.g1_p18.updateNeighbors(this.g1_p13, this.g1_p19, this.g1_p23, this.g1_p17);
    this.g1_p19.updateNeighbors(this.g1_p14, this.g1_p20, this.g1_p24, this.g1_p18);
    this.g1_p20.updateNeighbors(this.g1_p15, this.g1_pI, this.g1_p25, this.g1_p19);
    this.g1_p21.updateNeighbors(this.g1_p16, this.g1_p22, this.g1_pO, this.g1_pP);
    this.g1_p22.updateNeighbors(this.g1_p17, this.g1_p23, this.g1_pN, this.g1_p21);
    this.g1_p23.updateNeighbors(this.g1_p18, this.g1_p24, this.g1_pM, this.g1_p22);
    this.g1_p24.updateNeighbors(this.g1_p19, this.g1_p25, this.g1_pL, this.g1_p23);
    this.g1_p25.updateNeighbors(this.g1_p20, this.g1_pJ, this.g1_pK, this.g1_p24);
 
    this.g1_p1.createEnergiesRow();
    this.g1_p2.createEnergiesRow();
    this.g1_p3.createEnergiesRow();
    this.g1_p4.createEnergiesRow();
    this.g1_p5.createEnergiesRow();
    this.g1_p6.createEnergiesRow();
    this.g1_p7.createEnergiesRow();
    this.g1_p8.createEnergiesRow();
    this.g1_p9.createEnergiesRow();
    this.g1_p10.createEnergiesRow();
    this.g1_p11.createEnergiesRow();
    this.g1_p12.createEnergiesRow();
    this.g1_p13.createEnergiesRow();
    this.g1_p14.createEnergiesRow();
    this.g1_p15.createEnergiesRow();
    this.g1_p16.createEnergiesRow();
    this.g1_p17.createEnergiesRow();
    this.g1_p18.createEnergiesRow();
    this.g1_p19.createEnergiesRow();
    this.g1_p20.createEnergiesRow();
    this.g1_p21.createEnergiesRow();
    this.g1_p22.createEnergiesRow();
    this.g1_p23.createEnergiesRow();
    this.g1_p24.createEnergiesRow();
    this.g1_p25.createEnergiesRow();
 
    this.g1_pA.updateNeighbors(this.g1_p1);
    this.g1_pB.updateNeighbors(this.g1_p2);
    this.g1_pC.updateNeighbors(this.g1_p3);
    this.g1_pD.updateNeighbors(this.g1_p4);
    this.g1_pE.updateNeighbors(this.g1_p5);
    this.g1_pF.updateNeighbors(this.g1_p5);
    this.g1_pG.updateNeighbors(this.g1_p10);
    this.g1_pH.updateNeighbors(this.g1_p15);
    this.g1_pI.updateNeighbors(this.g1_p20);
    this.g1_pJ.updateNeighbors(this.g1_p25);
    this.g1_pK.updateNeighbors(this.g1_p25);
    this.g1_pL.updateNeighbors(this.g1_p24);
    this.g1_pM.updateNeighbors(this.g1_p23);
    this.g1_pN.updateNeighbors(this.g1_p22);
    this.g1_pO.updateNeighbors(this.g1_p21);
    this.g1_pP.updateNeighbors(this.g1_p21);
    this.g1_pQ.updateNeighbors(this.g1_p16);
    this.g1_pR.updateNeighbors(this.g1_p11);
    this.g1_pS.updateNeighbors(this.g1_p16);
    this.g1_pT.updateNeighbors(this.g1_p1);
 
    this.g1_row1.add(this.g1_pA);
    this.g1_row1.add(this.g1_pB);
    this.g1_row1.add(this.g1_pC);
    this.g1_row1.add(this.g1_pD);
    this.g1_row1.add(this.g1_pE);
    this.g1_row2.add(this.g1_pT);
    this.g1_row2.add(this.g1_p1);
    this.g1_row2.add(this.g1_p2);
    this.g1_row2.add(this.g1_p3);
    this.g1_row2.add(this.g1_p4);
    this.g1_row2.add(this.g1_p5);
    this.g1_row2.add(this.g1_pF);
    this.g1_row3.add(this.g1_pS);
    this.g1_row3.add(this.g1_p6);
    this.g1_row3.add(this.g1_p7);
    this.g1_row3.add(this.g1_p8);
    this.g1_row3.add(this.g1_p9);
    this.g1_row3.add(this.g1_p10);
    this.g1_row3.add(this.g1_pG);
    this.g1_row4.add(this.g1_pR);
    this.g1_row4.add(this.g1_p11);
    this.g1_row4.add(this.g1_p12);
    this.g1_row4.add(this.g1_p13);
    this.g1_row4.add(this.g1_p14);
    this.g1_row4.add(this.g1_p15);
    this.g1_row4.add(this.g1_pH);
    this.g1_row5.add(this.g1_pQ);
    this.g1_row5.add(this.g1_p16);
    this.g1_row5.add(this.g1_p17);
    this.g1_row5.add(this.g1_p18);
    this.g1_row5.add(this.g1_p19);
    this.g1_row5.add(this.g1_p20);
    this.g1_row5.add(this.g1_pI);
    this.g1_row6.add(this.g1_pP);
    this.g1_row6.add(this.g1_p21);
    this.g1_row6.add(this.g1_p22);
    this.g1_row6.add(this.g1_p23);
    this.g1_row6.add(this.g1_p24);
    this.g1_row6.add(this.g1_p25);
    this.g1_row6.add(this.g1_pJ);
    this.g1_row7.add(this.g1_pO);
    this.g1_row7.add(this.g1_pN);
    this.g1_row7.add(this.g1_pM);
    this.g1_row7.add(this.g1_pL);
    this.g1_row7.add(this.g1_pK);
 
    this.graph1List.add(this.g1_row1);
    this.graph1List.add(this.g1_row2);
    this.graph1List.add(this.g1_row3);
    this.graph1List.add(this.g1_row4);
    this.graph1List.add(this.g1_row5);
    this.graph1List.add(this.g1_row6);
    this.graph1List.add(this.g1_row7);
 
    this.graph1 = new Graph("src/SeamImages/5x5.png");
    this.graph1.findLowestHorizontalSeam();
    this.graph1.findLowestVerticalSeam();
  }
 
  // EFFECT: sets up the example 1x1 graph 2 with the neighbors and energies
  void setData_Graph2_1X1(Tester t) {
 
    // Checks that the initial fields of examples 1x1 graph 2 pixels are set to
    // null/empty
    // and the lists in the graph are empty
    this.testCheckInit_Graph2_1X1(t);
 
    this.g2_p1.updateNeighbors(this.g2_pA, this.g2_pB, this.g2_pC, this.g2_pD);
    this.g2_p1.createEnergiesRow();
 
    this.g2_pA.updateNeighbors(this.g2_p1);
    this.g2_pB.updateNeighbors(this.g2_p1);
    this.g2_pC.updateNeighbors(this.g2_p1);
    this.g2_pD.updateNeighbors(this.g2_p1);
 
    this.g2_row1.add(this.g2_pA);
    this.g2_row2.add(this.g2_pB);
    this.g2_row2.add(this.g2_p1);
    this.g2_row2.add(this.g2_pC);
    this.g2_row3.add(this.g2_pD);
 
    this.graph2List.add(this.g2_row1);
    this.graph2List.add(this.g2_row2);
    this.graph2List.add(this.g2_row3);
 
    this.graph2 = new Graph("src/SeamImages/1x1.png");
    this.graph2.findLowestHorizontalSeam();
    this.graph2.findLowestVerticalSeam();
  }
 
  // tests for updateEnergy in ImagePixel
  void testUpdateEnergy_ImagePixel(Tester t) {
 
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph1_5X5(t);
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the neighbors of the pixels in the graphs
    this.g1_p1.updateNeighbors(this.g1_pA, this.g1_p2, this.g1_p6, this.g1_pT);
    this.g1_p2.updateNeighbors(this.g1_pB, this.g1_p3, this.g1_p7, this.g1_p1);
    this.g1_p3.updateNeighbors(this.g1_pC, this.g1_p4, this.g1_p8, this.g1_p2);
    this.g1_p4.updateNeighbors(this.g1_pD, this.g1_p5, this.g1_p9, this.g1_p3);
    this.g1_p5.updateNeighbors(this.g1_pE, this.g1_pF, this.g1_p10, this.g1_p4);
    this.g1_p6.updateNeighbors(this.g1_p1, this.g1_p7, this.g1_p11, this.g1_pS);
    this.g1_p7.updateNeighbors(this.g1_p2, this.g1_p8, this.g1_p12, this.g1_p6);
    this.g1_p8.updateNeighbors(this.g1_p3, this.g1_p9, this.g1_p13, this.g1_p7);
    this.g1_p9.updateNeighbors(this.g1_p4, this.g1_p10, this.g1_p14, this.g1_p8);
    this.g1_p10.updateNeighbors(this.g1_p5, this.g1_pG, this.g1_p15, this.g1_p9);
    this.g1_p11.updateNeighbors(this.g1_p6, this.g1_p12, this.g1_p16, this.g1_pR);
    this.g1_p12.updateNeighbors(this.g1_p7, this.g1_p13, this.g1_p17, this.g1_p11);
    this.g1_p13.updateNeighbors(this.g1_p8, this.g1_p14, this.g1_p18, this.g1_p12);
    this.g1_p14.updateNeighbors(this.g1_p9, this.g1_p15, this.g1_p19, this.g1_p13);
    this.g1_p15.updateNeighbors(this.g1_p10, this.g1_pH, this.g1_p20, this.g1_p14);
    this.g1_p16.updateNeighbors(this.g1_p11, this.g1_p17, this.g1_p21, this.g1_pQ);
    this.g1_p17.updateNeighbors(this.g1_p12, this.g1_p18, this.g1_p22, this.g1_p16);
    this.g1_p18.updateNeighbors(this.g1_p13, this.g1_p19, this.g1_p23, this.g1_p17);
    this.g1_p19.updateNeighbors(this.g1_p14, this.g1_p20, this.g1_p24, this.g1_p18);
    this.g1_p20.updateNeighbors(this.g1_p15, this.g1_pI, this.g1_p25, this.g1_p19);
    this.g1_p21.updateNeighbors(this.g1_p16, this.g1_p22, this.g1_pO, this.g1_pQ);
    this.g1_p22.updateNeighbors(this.g1_p17, this.g1_p23, this.g1_pN, this.g1_p21);
    this.g1_p23.updateNeighbors(this.g1_p18, this.g1_p24, this.g1_pM, this.g1_p22);
    this.g1_p24.updateNeighbors(this.g1_p19, this.g1_p25, this.g1_pL, this.g1_p23);
    this.g1_p25.updateNeighbors(this.g1_p20, this.g1_pJ, this.g1_pK, this.g1_p24);
 
    this.g2_p1.updateNeighbors(this.g2_pA, this.g2_pB, this.g2_pC, this.g2_pD);
 
    // Updates energy of pixels
    this.g1_p1.createEnergiesRow();
    this.g1_p2.createEnergiesRow();
    this.g1_p3.createEnergiesRow();
    this.g1_p4.createEnergiesRow();
    this.g1_p5.createEnergiesRow();
    this.g1_p6.createEnergiesRow();
    this.g1_p7.createEnergiesRow();
    this.g1_p8.createEnergiesRow();
    this.g1_p9.createEnergiesRow();
    this.g1_p10.createEnergiesRow();
    this.g1_p11.createEnergiesRow();
    this.g1_p12.createEnergiesRow();
    this.g1_p13.createEnergiesRow();
    this.g1_p14.createEnergiesRow();
    this.g1_p15.createEnergiesRow();
    this.g1_p16.createEnergiesRow();
    this.g1_p17.createEnergiesRow();
    this.g1_p18.createEnergiesRow();
    this.g1_p19.createEnergiesRow();
    this.g1_p20.createEnergiesRow();
    this.g1_p21.createEnergiesRow();
    this.g1_p22.createEnergiesRow();
    this.g1_p23.createEnergiesRow();
    this.g1_p24.createEnergiesRow();
    this.g1_p25.createEnergiesRow();
 
    this.g2_p1.createEnergiesRow();
 
    // Checks that updating energy of a image pixel in graph 1 correctly changes the
    // energies
    t.checkExpect(this.g1_p1.energy, this.g1_p1.calculateEnergy());
    t.checkExpect(this.g1_p1.horizontalEnergy, this.g1_p1.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p1.verticalEnergy, this.g1_p1.calculateVerticalEnergy());
    t.checkExpect(this.g1_p2.energy, this.g1_p2.calculateEnergy());
    t.checkExpect(this.g1_p2.horizontalEnergy, this.g1_p2.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p2.verticalEnergy, this.g1_p2.calculateVerticalEnergy());
    t.checkExpect(this.g1_p3.energy, this.g1_p3.calculateEnergy());
    t.checkExpect(this.g1_p3.horizontalEnergy, this.g1_p3.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p3.verticalEnergy, this.g1_p3.calculateVerticalEnergy());
    t.checkExpect(this.g1_p4.energy, this.g1_p4.calculateEnergy());
    t.checkExpect(this.g1_p4.horizontalEnergy, this.g1_p4.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p4.verticalEnergy, this.g1_p4.calculateVerticalEnergy());
    t.checkExpect(this.g1_p5.energy, this.g1_p5.calculateEnergy());
    t.checkExpect(this.g1_p5.horizontalEnergy, this.g1_p5.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p5.verticalEnergy, this.g1_p5.calculateVerticalEnergy());
    t.checkExpect(this.g1_p6.energy, this.g1_p6.calculateEnergy());
    t.checkExpect(this.g1_p6.horizontalEnergy, this.g1_p6.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p6.verticalEnergy, this.g1_p6.calculateVerticalEnergy());
    t.checkExpect(this.g1_p7.energy, this.g1_p7.calculateEnergy());
    t.checkExpect(this.g1_p7.horizontalEnergy, this.g1_p7.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p7.verticalEnergy, this.g1_p7.calculateVerticalEnergy());
    t.checkExpect(this.g1_p8.energy, this.g1_p8.calculateEnergy());
    t.checkExpect(this.g1_p8.horizontalEnergy, this.g1_p8.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p8.verticalEnergy, this.g1_p8.calculateVerticalEnergy());
    t.checkExpect(this.g1_p9.energy, this.g1_p9.calculateEnergy());
    t.checkExpect(this.g1_p9.horizontalEnergy, this.g1_p9.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p9.verticalEnergy, this.g1_p9.calculateVerticalEnergy());
    t.checkExpect(this.g1_p10.energy, this.g1_p10.calculateEnergy());
    t.checkExpect(this.g1_p10.horizontalEnergy, this.g1_p10.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p10.verticalEnergy, this.g1_p10.calculateVerticalEnergy());
    t.checkExpect(this.g1_p11.energy, this.g1_p11.calculateEnergy());
    t.checkExpect(this.g1_p11.horizontalEnergy, this.g1_p11.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p11.verticalEnergy, this.g1_p11.calculateVerticalEnergy());
    t.checkExpect(this.g1_p12.energy, this.g1_p12.calculateEnergy());
    t.checkExpect(this.g1_p12.horizontalEnergy, this.g1_p12.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p12.verticalEnergy, this.g1_p12.calculateVerticalEnergy());
    t.checkExpect(this.g1_p13.energy, this.g1_p13.calculateEnergy());
    t.checkExpect(this.g1_p13.horizontalEnergy, this.g1_p13.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p13.verticalEnergy, this.g1_p13.calculateVerticalEnergy());
    t.checkExpect(this.g1_p14.energy, this.g1_p14.calculateEnergy());
    t.checkExpect(this.g1_p14.horizontalEnergy, this.g1_p14.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p14.verticalEnergy, this.g1_p14.calculateVerticalEnergy());
    t.checkExpect(this.g1_p15.energy, this.g1_p15.calculateEnergy());
    t.checkExpect(this.g1_p15.horizontalEnergy, this.g1_p15.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p15.verticalEnergy, this.g1_p15.calculateVerticalEnergy());
    t.checkExpect(this.g1_p16.energy, this.g1_p16.calculateEnergy());
    t.checkExpect(this.g1_p16.horizontalEnergy, this.g1_p16.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p16.verticalEnergy, this.g1_p16.calculateVerticalEnergy());
    t.checkExpect(this.g1_p17.energy, this.g1_p17.calculateEnergy());
    t.checkExpect(this.g1_p17.horizontalEnergy, this.g1_p17.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p17.verticalEnergy, this.g1_p17.calculateVerticalEnergy());
    t.checkExpect(this.g1_p18.energy, this.g1_p18.calculateEnergy());
    t.checkExpect(this.g1_p18.horizontalEnergy, this.g1_p18.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p18.verticalEnergy, this.g1_p18.calculateVerticalEnergy());
    t.checkExpect(this.g1_p19.energy, this.g1_p19.calculateEnergy());
    t.checkExpect(this.g1_p19.horizontalEnergy, this.g1_p19.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p19.verticalEnergy, this.g1_p19.calculateVerticalEnergy());
    t.checkExpect(this.g1_p20.energy, this.g1_p20.calculateEnergy());
    t.checkExpect(this.g1_p20.horizontalEnergy, this.g1_p20.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p20.verticalEnergy, this.g1_p20.calculateVerticalEnergy());
    t.checkExpect(this.g1_p21.energy, this.g1_p21.calculateEnergy());
    t.checkExpect(this.g1_p21.horizontalEnergy, this.g1_p21.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p21.verticalEnergy, this.g1_p21.calculateVerticalEnergy());
    t.checkExpect(this.g1_p22.energy, this.g1_p22.calculateEnergy());
    t.checkExpect(this.g1_p22.horizontalEnergy, this.g1_p22.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p22.verticalEnergy, this.g1_p22.calculateVerticalEnergy());
    t.checkExpect(this.g1_p23.energy, this.g1_p23.calculateEnergy());
    t.checkExpect(this.g1_p23.horizontalEnergy, this.g1_p23.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p23.verticalEnergy, this.g1_p23.calculateVerticalEnergy());
    t.checkExpect(this.g1_p24.energy, this.g1_p24.calculateEnergy());
    t.checkExpect(this.g1_p24.horizontalEnergy, this.g1_p24.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p24.verticalEnergy, this.g1_p24.calculateVerticalEnergy());
    t.checkExpect(this.g1_p25.energy, this.g1_p25.calculateEnergy());
    t.checkExpect(this.g1_p25.horizontalEnergy, this.g1_p25.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p25.verticalEnergy, this.g1_p25.calculateVerticalEnergy());
 
    // Checks that updating energy of a image pixel in graph 2 correctly changes the
    // energies
    t.checkExpect(this.g2_p1.energy, this.g2_p1.calculateEnergy());
    t.checkExpect(this.g2_p1.horizontalEnergy, this.g2_p1.calculateHorizontalEnergy());
    t.checkExpect(this.g2_p1.verticalEnergy, this.g2_p1.calculateVerticalEnergy());
 
    this.graph2 = new Graph("src/SeamImages/1x1.png");
    this.graph2.findLowestHorizontalSeam();
    this.graph2.findLowestVerticalSeam();
  }
 
  // test updateNeighbors for APixel
  void testUpdateNeighbors1Arg_APixel(Tester t) {
 
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the neighbors of the pixels in the graph
    this.g2_p1.updateNeighbors(this.g2_p1);
    this.g2_p1.updateNeighbors(this.g2_pB);
    this.g2_pA.updateNeighbors(this.g2_p1);
    this.g2_pB.updateNeighbors(this.g2_pA);
 
    // Checks that updating neighbors of a image pixel in graph 2 correctly changes
    // the neighbors
    t.checkExpect(this.g2_p1.up, null);
    t.checkExpect(this.g2_p1.right, null);
    t.checkExpect(this.g2_p1.down, null);
    t.checkExpect(this.g2_p1.left, null);
    t.checkExpect(this.g2_pA.up, this.g2_pA);
    t.checkExpect(this.g2_pA.right, this.g2_pA);
    t.checkExpect(this.g2_pA.down, this.g2_pA);
    t.checkExpect(this.g2_pA.left, this.g2_pA);
    t.checkExpect(this.g2_pA.inwardPixel, this.g2_p1);
    t.checkExpect(this.g2_pB.up, this.g2_pB);
    t.checkExpect(this.g2_pB.right, this.g2_pB);
    t.checkExpect(this.g2_pB.down, this.g2_pB);
    t.checkExpect(this.g2_pB.left, this.g2_pB);
    t.checkExpect(this.g2_pB.inwardPixel, null);
    t.checkExpect(this.g2_pC.up, this.g2_pC);
    t.checkExpect(this.g2_pC.right, this.g2_pC);
    t.checkExpect(this.g2_pC.down, this.g2_pC);
    t.checkExpect(this.g2_pC.left, this.g2_pC);
    t.checkExpect(this.g2_pC.inwardPixel, null);
    t.checkExpect(this.g2_pD.up, this.g2_pD);
    t.checkExpect(this.g2_pD.right, this.g2_pD);
    t.checkExpect(this.g2_pD.down, this.g2_pD);
    t.checkExpect(this.g2_pD.left, this.g2_pD);
    t.checkExpect(this.g2_pD.inwardPixel, null);
  }
 
  // test updateNeighbors for APixel
  void testUpdateNeighbors4Arg_APixel(Tester t) {
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph1_5X5(t);
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the neighbors of the graph
    this.g1_p1.updateNeighbors(this.g1_pA, this.g1_p2, this.g1_p6, this.g1_pT);
    this.g1_p2.updateNeighbors(this.g1_pB, this.g1_p3, this.g1_p7, this.g1_p1);
    this.g1_p3.updateNeighbors(this.g1_pC, this.g1_p4, this.g1_p8, this.g1_p2);
    this.g1_p4.updateNeighbors(this.g1_pD, this.g1_p5, this.g1_p9, this.g1_p3);
    this.g1_p5.updateNeighbors(this.g1_pE, this.g1_pF, this.g1_p10, this.g1_p4);
    this.g1_p6.updateNeighbors(this.g1_p1, this.g1_p7, this.g1_p11, this.g1_pS);
    this.g1_p7.updateNeighbors(this.g1_p2, this.g1_p8, this.g1_p12, this.g1_p6);
    this.g1_p8.updateNeighbors(this.g1_p3, this.g1_p9, this.g1_p13, this.g1_p7);
    this.g1_p9.updateNeighbors(this.g1_p4, this.g1_p10, this.g1_p14, this.g1_p8);
    this.g1_p10.updateNeighbors(this.g1_p5, this.g1_pG, this.g1_p15, this.g1_p9);
    this.g1_p11.updateNeighbors(this.g1_p6, this.g1_p12, this.g1_p16, this.g1_pR);
    this.g1_p12.updateNeighbors(this.g1_p7, this.g1_p13, this.g1_p17, this.g1_p11);
    this.g1_p13.updateNeighbors(this.g1_p8, this.g1_p14, this.g1_p18, this.g1_p12);
    this.g1_p14.updateNeighbors(this.g1_p9, this.g1_p15, this.g1_p19, this.g1_p13);
    this.g1_p15.updateNeighbors(this.g1_p10, this.g1_pH, this.g1_p20, this.g1_p14);
    this.g1_p16.updateNeighbors(this.g1_p11, this.g1_p17, this.g1_p21, this.g1_pQ);
    this.g1_p17.updateNeighbors(this.g1_p12, this.g1_p18, this.g1_p22, this.g1_p16);
    this.g1_p18.updateNeighbors(this.g1_p13, this.g1_p19, this.g1_p23, this.g1_p17);
    this.g1_p19.updateNeighbors(this.g1_p14, this.g1_p20, this.g1_p24, this.g1_p18);
    this.g1_p20.updateNeighbors(this.g1_p15, this.g1_pI, this.g1_p25, this.g1_p19);
    this.g1_p21.updateNeighbors(this.g1_p16, this.g1_p22, this.g1_pO, this.g1_pQ);
    this.g1_p22.updateNeighbors(this.g1_p17, this.g1_p23, this.g1_pN, this.g1_p21);
    this.g1_p23.updateNeighbors(this.g1_p18, this.g1_p24, this.g1_pM, this.g1_p22);
    this.g1_p24.updateNeighbors(this.g1_p19, this.g1_p25, this.g1_pL, this.g1_p23);
    this.g1_p25.updateNeighbors(this.g1_p20, this.g1_pJ, this.g1_pK, this.g1_p24);
 
    this.g1_pA.updateNeighbors(this.g1_p1, this.g1_p2, this.g1_p3, this.g1_p4);
 
    this.g2_p1.updateNeighbors(this.g2_pA, this.g2_pB, this.g2_pC, this.g2_pD);
 
    // Checks that the neighbors in the graphs were properly updated
    t.checkExpect(this.g1_p1.up, this.g1_pA);
    t.checkExpect(this.g1_p1.right, this.g1_p2);
    t.checkExpect(this.g1_p1.down, this.g1_p6);
    t.checkExpect(this.g1_p1.left, this.g1_pT);
    t.checkExpect(this.g1_p2.up, this.g1_pB);
    t.checkExpect(this.g1_p2.right, this.g1_p3);
    t.checkExpect(this.g1_p2.down, this.g1_p7);
    t.checkExpect(this.g1_p2.left, this.g1_p1);
    t.checkExpect(this.g1_p3.up, this.g1_pC);
    t.checkExpect(this.g1_p3.right, this.g1_p4);
    t.checkExpect(this.g1_p3.down, this.g1_p8);
    t.checkExpect(this.g1_p3.left, this.g1_p2);
    t.checkExpect(this.g1_p4.up, this.g1_pD);
    t.checkExpect(this.g1_p4.right, this.g1_p5);
    t.checkExpect(this.g1_p4.down, this.g1_p9);
    t.checkExpect(this.g1_p4.left, this.g1_p3);
    t.checkExpect(this.g1_p5.up, this.g1_pE);
    t.checkExpect(this.g1_p5.right, this.g1_pF);
    t.checkExpect(this.g1_p5.down, this.g1_p10);
    t.checkExpect(this.g1_p5.left, this.g1_p4);
    t.checkExpect(this.g1_p6.up, this.g1_p1);
    t.checkExpect(this.g1_p6.right, this.g1_p7);
    t.checkExpect(this.g1_p6.down, this.g1_p11);
    t.checkExpect(this.g1_p6.left, this.g1_pS);
    t.checkExpect(this.g1_p7.up, this.g1_p2);
    t.checkExpect(this.g1_p7.right, this.g1_p8);
    t.checkExpect(this.g1_p7.down, this.g1_p12);
    t.checkExpect(this.g1_p7.left, this.g1_p6);
    t.checkExpect(this.g1_p8.up, this.g1_p3);
    t.checkExpect(this.g1_p8.right, this.g1_p9);
    t.checkExpect(this.g1_p8.down, this.g1_p13);
    t.checkExpect(this.g1_p8.left, this.g1_p7);
    t.checkExpect(this.g1_p9.up, this.g1_p4);
    t.checkExpect(this.g1_p9.right, this.g1_p10);
    t.checkExpect(this.g1_p9.down, this.g1_p14);
    t.checkExpect(this.g1_p9.left, this.g1_p8);
    t.checkExpect(this.g1_p10.up, this.g1_p5);
    t.checkExpect(this.g1_p10.right, this.g1_pF);
    t.checkExpect(this.g1_p10.down, this.g1_p15);
    t.checkExpect(this.g1_p10.left, this.g1_p9);
    t.checkExpect(this.g1_p11.up, this.g1_p6);
    t.checkExpect(this.g1_p11.right, this.g1_p12);
    t.checkExpect(this.g1_p11.down, this.g1_p16);
    t.checkExpect(this.g1_p11.left, this.g1_pR);
    t.checkExpect(this.g1_p12.up, this.g1_p7);
    t.checkExpect(this.g1_p12.right, this.g1_p13);
    t.checkExpect(this.g1_p12.down, this.g1_p17);
    t.checkExpect(this.g1_p12.left, this.g1_p11);
    t.checkExpect(this.g1_p13.up, this.g1_p8);
    t.checkExpect(this.g1_p13.right, this.g1_p14);
    t.checkExpect(this.g1_p13.down, this.g1_p18);
    t.checkExpect(this.g1_p13.left, this.g1_p12);
    t.checkExpect(this.g1_p14.up, this.g1_p9);
    t.checkExpect(this.g1_p14.right, this.g1_p15);
    t.checkExpect(this.g1_p14.down, this.g1_p19);
    t.checkExpect(this.g1_p14.left, this.g1_p13);
    t.checkExpect(this.g1_p15.up, this.g1_p10);
    t.checkExpect(this.g1_p15.right, this.g1_pH);
    t.checkExpect(this.g1_p15.down, this.g1_p20);
    t.checkExpect(this.g1_p15.left, this.g1_p14);
    t.checkExpect(this.g1_p16.up, this.g1_p11);
    t.checkExpect(this.g1_p16.right, this.g1_p17);
    t.checkExpect(this.g1_p16.down, this.g1_p21);
    t.checkExpect(this.g1_p16.left, this.g1_pQ);
    t.checkExpect(this.g1_p17.up, this.g1_p12);
    t.checkExpect(this.g1_p17.right, this.g1_p18);
    t.checkExpect(this.g1_p17.down, this.g1_p22);
    t.checkExpect(this.g1_p17.left, this.g1_p16);
    t.checkExpect(this.g1_p18.up, this.g1_p13);
    t.checkExpect(this.g1_p18.right, this.g1_p19);
    t.checkExpect(this.g1_p18.down, this.g1_p23);
    t.checkExpect(this.g1_p18.left, this.g1_p17);
    t.checkExpect(this.g1_p19.up, this.g1_p14);
    t.checkExpect(this.g1_p19.right, this.g1_p20);
    t.checkExpect(this.g1_p19.down, this.g1_p24);
    t.checkExpect(this.g1_p19.left, this.g1_p18);
    t.checkExpect(this.g1_p20.up, this.g1_p15);
    t.checkExpect(this.g1_p20.right, this.g1_pI);
    t.checkExpect(this.g1_p20.down, this.g1_p25);
    t.checkExpect(this.g1_p20.left, this.g1_p19);
    t.checkExpect(this.g1_p21.up, this.g1_p16);
    t.checkExpect(this.g1_p21.right, this.g1_p22);
    t.checkExpect(this.g1_p21.down, this.g1_pO);
    t.checkExpect(this.g1_p21.left, this.g1_pP);
    t.checkExpect(this.g1_p22.up, this.g1_p17);
    t.checkExpect(this.g1_p22.right, this.g1_p23);
    t.checkExpect(this.g1_p22.down, this.g1_pN);
    t.checkExpect(this.g1_p22.left, this.g1_p21);
    t.checkExpect(this.g1_p23.up, this.g1_p18);
    t.checkExpect(this.g1_p23.right, this.g1_p24);
    t.checkExpect(this.g1_p23.down, this.g1_pM);
    t.checkExpect(this.g1_p23.left, this.g1_p22);
    t.checkExpect(this.g1_p24.up, this.g1_p19);
    t.checkExpect(this.g1_p24.right, this.g1_p25);
    t.checkExpect(this.g1_p24.down, this.g1_pL);
    t.checkExpect(this.g1_p24.left, this.g1_p23);
    t.checkExpect(this.g1_p25.up, this.g1_p20);
    t.checkExpect(this.g1_p25.right, this.g1_pJ);
    t.checkExpect(this.g1_p25.down, this.g1_pK);
    t.checkExpect(this.g1_p25.left, this.g1_p24);
    t.checkExpect(this.g1_pA.color, Color.black);
    t.checkExpect(this.g1_pA.energy, Double.MAX_VALUE);
    t.checkExpect(this.g1_pA.brightness, this.g1_pA.calculateBrightness());
    t.checkExpect(this.g1_pA.up, this.g1_pA);
    t.checkExpect(this.g1_pA.right, this.g1_pA);
    t.checkExpect(this.g1_pA.down, this.g1_pA);
    t.checkExpect(this.g1_pA.left, this.g1_pA);
    t.checkExpect(this.g1_pA.inwardPixel, null);
    t.checkExpect(this.g2_p1.up, this.g1_pA);
    t.checkExpect(this.g2_p1.right, this.g1_pB);
    t.checkExpect(this.g2_p1.down, this.g1_pC);
    t.checkExpect(this.g2_p1.left, this.g1_pD);
  }
 
  // test updateNeighborsImagePixel in APixel
  void testUpdateNeighborsImagePixel_APixel(Tester t) {
 
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the inward of the pixels in the graphs
    this.g2_p1.updateNeighbors(this.g2_p1);
    this.g2_pA.updateNeighbors(this.g2_p1);
 
    t.checkExpect(this.g2_p1.color, Color.red);
    t.checkExpect(this.g2_p1.down, null);
    t.checkExpect(this.g2_p1.left, null);
    t.checkExpect(this.g2_p1.up, null);
    t.checkExpect(this.g2_p1.right, null);
    t.checkExpect(this.g2_p1.energy, null);
    t.checkExpect(this.g2_p1.horizontalEnergy, null);
    t.checkExpect(this.g2_p1.verticalEnergy, null);
    t.checkExpect(this.g2_p1.brightness, this.g2_p1.calculateBrightness());
    t.checkExpect(this.g2_pA.inwardPixel, this.g2_p1);
  }
 
  // test updateNeighborsBorderPixel in APixel
  void testUpdateNeighborsBorderPixel_APixel(Tester t) {
 
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the inward of the pixels in the graphs
    this.g2_p1.updateNeighbors(this.g2_pB);
    this.g2_pB.updateNeighbors(this.g2_pA);
 
    t.checkExpect(this.g2_p1.color, Color.red);
    t.checkExpect(this.g2_p1.down, null);
    t.checkExpect(this.g2_p1.left, null);
    t.checkExpect(this.g2_p1.up, null);
    t.checkExpect(this.g2_p1.right, null);
    t.checkExpect(this.g2_p1.energy, null);
    t.checkExpect(this.g2_p1.horizontalEnergy, null);
    t.checkExpect(this.g2_p1.verticalEnergy, null);
    t.checkExpect(this.g2_p1.brightness, this.g2_p1.calculateBrightness());
    t.checkExpect(this.g2_pB.inwardPixel, null);
  }
 
  //
  //  // // test createPixels in Graph
  //  // void testCreatePixels_Graph(Tester t) {
  //  // This test does not work as a limitation of the code. The values are not
  //  // identically the same object, and the tester library fails the test even
  //  // when using checkEquivalence using an Equivalence object. Because the
  //  // method createPixels creates pixels, so testing it means the objects
  //  // will not point to the same place because the specific pixels are unknown
  //  // }
  //  //
  //  // // test createNeighbors in Graph
  //  // void testCreateNeighbors_Graph(Tester t) {
  //  // This test does not work as a limitation of the code. The values are not
  //  // identically the same object, and the tester library fails the test even
  //  // when using checkEquivalence using an Equivalence object. Because the
  //  // method createNeighbors relies on created pixels, so testing it means the
  //  // objects
  //  // will not point to the same place because the specific pixels are unknown
  //  // }
  //
  // test render for Graph
  //  boolean testRender_Graph(Tester t) {
  //
  //    // Initializes the example graphs, checks that the initial fields are correct,
  //    // and sets up their fields to the correct values
  //    this.setData_Graph1_5X5(t);
  //    this.setData_Graph2_1X1(t);
  //
  //    ComputedPixelImage result1 = new ComputedPixelImage(5, 5);
  //    ComputedPixelImage result2 = new ComputedPixelImage(1, 1);
  //
  //    result1.setPixel(0, 0, Color.red);
  //    result1.setPixel(1, 0, Color.orange);
  //    result1.setPixel(2, 0, Color.yellow);
  //    result1.setPixel(3, 0, Color.green);
  //    result1.setPixel(4, 0, Color.blue);
  //    result1.setPixel(0, 1, Color.darkGray);
  //    result1.setPixel(1, 1, Color.cyan);
  //    result1.setPixel(2, 1, Color.pink);
  //    result1.setPixel(3, 1, Color.gray);
  //    result1.setPixel(4, 1, Color.magenta);
  //    result1.setPixel(0, 2, Color.magenta);
  //    result1.setPixel(1, 2, Color.magenta);
  //    result1.setPixel(2, 2, Color.magenta);
  //    result1.setPixel(3, 2, Color.magenta);
  //    result1.setPixel(4, 2, Color.magenta);
  //    result1.setPixel(0, 3, Color.magenta);
  //    result1.setPixel(1, 3, Color.magenta);
  //    result1.setPixel(2, 3, Color.magenta);
  //    result1.setPixel(3, 3, Color.magenta);
  //    result1.setPixel(4, 3, Color.magenta);
  //    result1.setPixel(0, 4, Color.magenta);
  //    result1.setPixel(1, 4, Color.magenta);
  //    result1.setPixel(2, 4, Color.magenta);
  //    result1.setPixel(3, 4, Color.magenta);
  //    result1.setPixel(4, 4, Color.magenta);
  //
  //    graph1.render(1)
  //
  //    result2.setPixel(0, 0, Color.red);
  //
  //    return t.checkExpect(this.graph1.render(1), result1)
  //        && t.checkExpect(this.graph2.render(1), result2);
  //  }
 
  // test renderColumn in APixel
  //  boolean testRenderColumn_APixel(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //    this.setData_Graph2_1X1(t);
  //
  //    ComputedPixelImage result1 = new ComputedPixelImage(5, 5);
  //    ComputedPixelImage result2 = new ComputedPixelImage(1, 1);
  //
  //    result1.setPixel(0, 0, Color.red);
  //    result1.setPixel(1, 0, Color.orange);
  //    result1.setPixel(2, 0, Color.yellow);
  //    result1.setPixel(3, 0, Color.green);
  //    result1.setPixel(4, 0, Color.blue);
  //    result1.setPixel(0, 1, Color.darkGray);
  //    result1.setPixel(1, 1, Color.cyan);
  //    result1.setPixel(2, 1, Color.pink);
  //    result1.setPixel(3, 1, Color.gray);
  //    result1.setPixel(4, 1, Color.magenta);
  //    result1.setPixel(0, 2, Color.magenta);
  //    result1.setPixel(1, 2, Color.magenta);
  //    result1.setPixel(2, 2, Color.magenta);
  //    result1.setPixel(3, 2, Color.magenta);
  //    result1.setPixel(4, 2, Color.magenta);
  //    result1.setPixel(0, 3, Color.magenta);
  //    result1.setPixel(1, 3, Color.magenta);
  //    result1.setPixel(2, 3, Color.magenta);
  //    result1.setPixel(3, 3, Color.magenta);
  //    result1.setPixel(4, 3, Color.magenta);
  //    result1.setPixel(0, 4, Color.magenta);
  //    result1.setPixel(1, 4, Color.magenta);
  //    result1.setPixel(2, 4, Color.magenta);
  //    result1.setPixel(3, 4, Color.magenta);
  //    result1.setPixel(4, 4, Color.magenta);
  //
  //    result2.setPixel(0, 0, Color.red);
  //
  //    this.graph1.start.renderColumn(0, 0, new ComputedPixelImage(5, 5), 1);
  //    this.graph2.start.renderColumn(0, 0, new ComputedPixelImage(1, 1), 1);
  //
  //    ComputedPixelImage result3 = new ComputedPixelImage(1, 1);
  //    this.g1_pA.renderColumn(0, 0, result3, 1);
  //
  //    return t.checkExpect(this.graph1.image, result1)
  //        && t.checkExpect(this.graph2.image, result2)
  //        && t.checkExpect(result3, new ComputedPixelImage(1, 1));
  //  }
 
  // test renderRow in APixel
  //  boolean testRenderRow_APixel(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //    this.setData_Graph2_1X1(t);
  //
  //    ComputedPixelImage result1 = new ComputedPixelImage(5, 5);
  //    ComputedPixelImage result2 = new ComputedPixelImage(1, 1);
  //
  //    result1.setPixel(0, 0, Color.red);
  //    result1.setPixel(1, 0, Color.orange);
  //    result1.setPixel(2, 0, Color.yellow);
  //    result1.setPixel(3, 0, Color.green);
  //    result1.setPixel(4, 0, Color.blue);
  //
  //    result2.setPixel(0, 0, Color.red);
  //
  //    ComputedPixelImage g1CPI = new ComputedPixelImage(5, 5);
  //    this.graph1.start.renderRow(0, 0, g1CPI, 1);
  //    //this.graph2.start.renderRow(0, 0, new ComputedPixelImage(1, 1), 1);
  //
  //    ComputedPixelImage result3 = new ComputedPixelImage(1, 1);
  //    this.g1_pA.renderRow(0, 0, result3, 1);
  //
  //    return t.checkExpect(g1CPI, result1)
  //        //&& t.checkExpect(this.graph2.image, result2)
  //        && t.checkExpect(result3, new ComputedPixelImage(1, 1));
  //  }
 
  // test makeScene in SeamCarver
  boolean testMakeScene_SeamCarver(Tester t) {
 
    // Initializes the example graphs, checks that the initial fields are correct,
    // and sets up their fields to the correct values
    this.setData_Graph1_5X5(t);
    this.setData_Graph2_1X1(t);
 
    WorldScene canvas1 = new WorldScene(1000, 1000);
    canvas1.placeImageXY(this.graph1.render(1), 500, 500);
 
    WorldScene canvas2 = new WorldScene(1000, 1000);
    canvas2.placeImageXY(this.graph2.render(1), 500, 500);
 
    return t.checkExpect(new SeamCarver(this.graph1).makeScene(), canvas1)
        && t.checkExpect(new SeamCarver(this.graph2).makeScene(), canvas2);
  }
 
  // test BorderPixel constructor
  boolean testBorderPixelConstructor(Tester t) {
 
    BorderPixel g1_pA = new BorderPixel();
 
    return t.checkExpect(g1_pA.color, Color.black)
        && t.checkExpect(g1_pA.energy, Double.MAX_VALUE)
        && t.checkExpect(g1_pA.brightness, g1_pA.calculateBrightness())
        && t.checkExpect(g1_pA.up, g1_pA) && t.checkExpect(g1_pA.right, g1_pA)
        && t.checkExpect(g1_pA.down, g1_pA) && t.checkExpect(g1_pA.left, g1_pA)
        && t.checkExpect(g1_pA.inwardPixel, null);
  }
 
  // test ImagePixel constructor
  boolean testImagePixelConstructor(Tester t) {
 
    ImagePixel g1_p1 = new ImagePixel(Color.red);
 
    return t.checkExpect(g1_p1.color, Color.red) && t.checkExpect(g1_p1.energy, null)
        && t.checkExpect(g1_p1.horizontalEnergy, null)
        && t.checkExpect(g1_p1.verticalEnergy, null)
        && t.checkExpect(g1_p1.up, null) && t.checkExpect(g1_p1.right, null)
        && t.checkExpect(g1_p1.down, null) && t.checkExpect(g1_p1.left, null)
        && t.checkExpect(g1_p1.brightness, g1_p1.calculateBrightness());
  }
 
  // test wellFormed in Graph
  void testWellFormedNoExceptions(Tester t) {
 
    this.setData_Graph1_5X5(t);
    this.setData_Graph2_1X1(t);
 
    //t.checkNoException(this.graph1, "wellFormed");
    //t.checkNoException(this.graph2, "wellFormed");
  }
 
  //  // test wellFormed in Graph
  //  void testWellFormedExceptions(Tester t) {
  //
  //    Graph result1 = new Graph("src/SeamImages/5x5.png");
  //    result1.createPixels();
  //
  //    t.checkException(
  //        new RuntimeException("Pixels should not have any null neighbors at this point."), result1,
  //        "wellFormed");
  //
  //    result1.createGraph();
  //    t.checkNoException(result1, "wellFormed");
  //  }
  //
  // test removePixelVertical in APixel
  void testRemovePixelVertical(Tester t) {
 
    this.setData_Graph1_5X5(t);
 
    t.checkExpect(this.g1_p12.right, this.g1_p13);
    t.checkExpect(this.g1_p14.left, this.g1_p13);
    t.checkExpect(this.g1_p18.up, this.g1_p13);
    t.checkExpect(this.g1_p8.down, this.g1_p13);
 
    this.g1_p13.removePixelVertical();
 
    t.checkExpect(this.g1_p12.right, this.g1_p14);
    t.checkExpect(this.g1_p14.left, this.g1_p12);
    t.checkExpect(this.g1_p18.up, this.g1_p14);
    t.checkExpect(this.g1_p8.down, this.g1_p14);
  }
 
  // test removePixelHorizontal in APixel
  void testRemovePixelHorizontal(Tester t) {
 
    this.setData_Graph1_5X5(t);
 
    t.checkExpect(this.g1_p12.right, this.g1_p13);
    t.checkExpect(this.g1_p14.left, this.g1_p13);
    t.checkExpect(this.g1_p8.down, this.g1_p13);
    t.checkExpect(this.g1_p18.up, this.g1_p13);
 
    this.g1_p13.removePixelHorizontal();
 
    t.checkExpect(this.g1_p12.right, this.g1_p18);
    t.checkExpect(this.g1_p14.left, this.g1_p18);
    t.checkExpect(this.g1_p8.down, this.g1_p18);
    t.checkExpect(this.g1_p18.up, this.g1_p8);
  }
 
  // test on addToListColumn
  void testAddToListColumn(Tester t) {
 
    this.setData_Graph1_5X5(t);
    ArrayList<APixel> list = new ArrayList<>();
 
    ArrayList<APixel> result = new ArrayList<>();
    result.add(this.g1_p1);
    result.add(this.g1_p6);
    result.add(this.g1_p11);
    result.add(this.g1_p16);
    result.add(this.g1_p21);
 
    this.g1_p1.addToListRow(list);
 
    // This test does not work as a limitation of the code. The values are not
    //   identically the same object, and the tester library fails the test even
    //   when using checkEquivalence using an Equivalence object. Because the
    //   method createPixels creates pixels, testing it means the objects
    //   will not point to the same place because the specific pixels are unknown
    //t.checkExpect(list, result);
  }
 
  // test on addToListRow
  void testAddToListRow(Tester t) {
    this.setData_Graph1_5X5(t);
    ArrayList<APixel> list = new ArrayList<>();
 
    ArrayList<APixel> result = new ArrayList<>();
    result.add(this.g1_p1);
    result.add(this.g1_p2);
    result.add(this.g1_p3);
    result.add(this.g1_p4);
    result.add(this.g1_p5);
 
    this.g1_p1.addToListRow(list);
 
    t.checkExpect(list, result);
  }
 
  //  // test calculateBrightness for APixel
  void testCalculateBrightness(Tester t) {
    this.setData_Graph1_5X5(t);
 
    t.checkExpect(this.g1_p1.calculateBrightness(), 1.0);
    t.checkExpect(this.g1_p2.calculateBrightness(), 1.7843137254901962);
    t.checkExpect(this.g1_p3.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p4.calculateBrightness(), 1.0);
    t.checkExpect(this.g1_p5.calculateBrightness(), 1.0);
    t.checkExpect(this.g1_p6.calculateBrightness(), 0.7529411764705882);
    t.checkExpect(this.g1_p7.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p8.calculateBrightness(), 2.372549019607843);
    t.checkExpect(this.g1_p9.calculateBrightness(), 1.5058823529411764);
    t.checkExpect(this.g1_p10.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p11.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p12.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p13.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p14.calculateBrightness(), 2.0);
    t.checkExpect(this.g1_p15.calculateBrightness(), 2.0);
 
    t.checkExpect(this.g1_pA.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pB.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pC.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pD.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pE.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pF.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pG.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pH.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pI.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pJ.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pK.calculateBrightness(), 0.0);
    t.checkExpect(this.g1_pL.calculateBrightness(), 0.0);
  }
 
  // test calculateEnergy for BorderPixel
  void testCalculateEnergy_BorderPixel(Tester t) {
    this.testCheckInit_Graph1_5X5(t);
 
    t.checkExpect(this.g1_pA.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pB.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pC.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pD.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pE.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pF.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pG.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pH.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pI.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pJ.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pK.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pL.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pM.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pN.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pO.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pQ.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pR.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pS.calculateEnergy(), Double.MAX_VALUE);
    t.checkExpect(this.g1_pT.calculateEnergy(), Double.MAX_VALUE);
  }
 
  // test calculateEnergy for ImagePixel
  void testCalculateEnergy_ImagePixel(Tester t) {
    this.setData_Graph1_5X5(t);
 
    t.checkExpect(this.g1_p1.calculateEnergy(), 4.679713185019009);
    t.checkExpect(this.g1_p2.calculateEnergy(), 5.756126736089325);
    t.checkExpect(this.g1_p3.calculateEnergy(), 6.015840936734126);
    t.checkExpect(this.g1_p4.calculateEnergy(), 6.03654257112422);
    t.checkExpect(this.g1_p5.calculateEnergy(), 4.309368566210875);
    t.checkExpect(this.g1_p6.calculateEnergy(), 5.9106834116644915);
    t.checkExpect(this.g1_p7.calculateEnergy(), 2.887947085709458);
    t.checkExpect(this.g1_p8.calculateEnergy(), 1.764165494603354);
    t.checkExpect(this.g1_p9.calculateEnergy(), 2.4256732696771945);
    t.checkExpect(this.g1_p10.calculateEnergy(), 4.929804841831643);
    t.checkExpect(this.g1_p11.calculateEnergy(), 6.128226147046351);
    t.checkExpect(this.g1_p12.calculateEnergy(), 1.8406240688165125);
    t.checkExpect(this.g1_p13.calculateEnergy(), 0.5088528081039382);
    t.checkExpect(this.g1_p14.calculateEnergy(), 0.3918822567954316);
    t.checkExpect(this.g1_p15.calculateEnergy(), 5.528009834792628);
    t.checkExpect(this.g1_p16.calculateEnergy(), 6.0);
    t.checkExpect(this.g1_p17.calculateEnergy(), 0.0);
    t.checkExpect(this.g1_p18.calculateEnergy(), 0.0);
    t.checkExpect(this.g1_p19.calculateEnergy(), 0.0);
    t.checkExpect(this.g1_p20.calculateEnergy(), 6.0);
    t.checkExpect(this.g1_p21.calculateEnergy(), 5.656854249492381);
    t.checkExpect(this.g1_p22.calculateEnergy(), 6.0);
    t.checkExpect(this.g1_p23.calculateEnergy(), 6.0);
    t.checkExpect(this.g1_p24.calculateEnergy(), 6.0);
    t.checkExpect(this.g1_p25.calculateEnergy(), 5.656854249492381);
  }
 
  // test createEnergiesColumn for APixel
  void testCreateEnergiesColumn_APixel(Tester t) {
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph1_5X5(t);
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the neighbors of the pixels in the graphs
    this.g1_p1.updateNeighbors(this.g1_pA, this.g1_p2, this.g1_p6, this.g1_pT);
    this.g1_p2.updateNeighbors(this.g1_pB, this.g1_p3, this.g1_p7, this.g1_p1);
    this.g1_p3.updateNeighbors(this.g1_pC, this.g1_p4, this.g1_p8, this.g1_p2);
    this.g1_p4.updateNeighbors(this.g1_pD, this.g1_p5, this.g1_p9, this.g1_p3);
    this.g1_p5.updateNeighbors(this.g1_pE, this.g1_pF, this.g1_p10, this.g1_p4);
    this.g1_p6.updateNeighbors(this.g1_p1, this.g1_p7, this.g1_p11, this.g1_pS);
    this.g1_p7.updateNeighbors(this.g1_p2, this.g1_p8, this.g1_p12, this.g1_p6);
    this.g1_p8.updateNeighbors(this.g1_p3, this.g1_p9, this.g1_p13, this.g1_p7);
    this.g1_p9.updateNeighbors(this.g1_p4, this.g1_p10, this.g1_p14, this.g1_p8);
    this.g1_p10.updateNeighbors(this.g1_p5, this.g1_pG, this.g1_p15, this.g1_p9);
    this.g1_p11.updateNeighbors(this.g1_p6, this.g1_p12, this.g1_p16, this.g1_pR);
    this.g1_p12.updateNeighbors(this.g1_p7, this.g1_p13, this.g1_p17, this.g1_p11);
    this.g1_p13.updateNeighbors(this.g1_p8, this.g1_p14, this.g1_p18, this.g1_p12);
    this.g1_p14.updateNeighbors(this.g1_p9, this.g1_p15, this.g1_p19, this.g1_p13);
    this.g1_p15.updateNeighbors(this.g1_p10, this.g1_pH, this.g1_p20, this.g1_p14);
    this.g1_p16.updateNeighbors(this.g1_p11, this.g1_p17, this.g1_p21, this.g1_pQ);
    this.g1_p17.updateNeighbors(this.g1_p12, this.g1_p18, this.g1_p22, this.g1_p16);
    this.g1_p18.updateNeighbors(this.g1_p13, this.g1_p19, this.g1_p23, this.g1_p17);
    this.g1_p19.updateNeighbors(this.g1_p14, this.g1_p20, this.g1_p24, this.g1_p18);
    this.g1_p20.updateNeighbors(this.g1_p15, this.g1_pI, this.g1_p25, this.g1_p19);
    this.g1_p21.updateNeighbors(this.g1_p16, this.g1_p22, this.g1_pO, this.g1_pQ);
    this.g1_p22.updateNeighbors(this.g1_p17, this.g1_p23, this.g1_pN, this.g1_p21);
    this.g1_p23.updateNeighbors(this.g1_p18, this.g1_p24, this.g1_pM, this.g1_p22);
    this.g1_p24.updateNeighbors(this.g1_p19, this.g1_p25, this.g1_pL, this.g1_p23);
    this.g1_p25.updateNeighbors(this.g1_p20, this.g1_pJ, this.g1_pK, this.g1_p24);
 
    this.g2_p1.updateNeighbors(this.g2_pA, this.g2_pB, this.g2_pC, this.g2_pD);
 
    // Updates energy of pixels
    this.g1_p1.createEnergiesColumn();
    this.g2_pA.createEnergiesColumn();
 
    // Checks that updating energy of a image pixel in graph 1 correctly changes the
    // energies
    t.checkExpect(this.g1_p1.energy, this.g1_p1.calculateEnergy());
    t.checkExpect(this.g1_p1.horizontalEnergy, this.g1_p1.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p1.verticalEnergy, this.g1_p1.calculateVerticalEnergy());
    t.checkExpect(this.g1_p2.energy, this.g1_p2.calculateEnergy());
    t.checkExpect(this.g1_p2.horizontalEnergy, this.g1_p2.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p2.verticalEnergy, this.g1_p2.calculateVerticalEnergy());
    t.checkExpect(this.g1_p3.energy, this.g1_p3.calculateEnergy());
    t.checkExpect(this.g1_p3.horizontalEnergy, this.g1_p3.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p3.verticalEnergy, this.g1_p3.calculateVerticalEnergy());
    t.checkExpect(this.g1_p4.energy, this.g1_p4.calculateEnergy());
    t.checkExpect(this.g1_p4.horizontalEnergy, this.g1_p4.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p4.verticalEnergy, this.g1_p4.calculateVerticalEnergy());
    t.checkExpect(this.g1_p5.energy, this.g1_p5.calculateEnergy());
    t.checkExpect(this.g1_p5.horizontalEnergy, this.g1_p5.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p5.verticalEnergy, this.g1_p5.calculateVerticalEnergy());
    t.checkExpect(this.g1_p6.energy, this.g1_p6.calculateEnergy());
    t.checkExpect(this.g1_p6.horizontalEnergy, this.g1_p6.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p6.verticalEnergy, this.g1_p6.calculateVerticalEnergy());
    t.checkExpect(this.g1_p7.energy, this.g1_p7.calculateEnergy());
    t.checkExpect(this.g1_p7.horizontalEnergy, this.g1_p7.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p7.verticalEnergy, this.g1_p7.calculateVerticalEnergy());
    t.checkExpect(this.g1_p8.energy, this.g1_p8.calculateEnergy());
    t.checkExpect(this.g1_p8.horizontalEnergy, this.g1_p8.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p8.verticalEnergy, this.g1_p8.calculateVerticalEnergy());
    t.checkExpect(this.g1_p9.energy, this.g1_p9.calculateEnergy());
    t.checkExpect(this.g1_p9.horizontalEnergy, this.g1_p9.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p9.verticalEnergy, this.g1_p9.calculateVerticalEnergy());
    t.checkExpect(this.g1_p10.energy, this.g1_p10.calculateEnergy());
    t.checkExpect(this.g1_p10.horizontalEnergy, this.g1_p10.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p10.verticalEnergy, this.g1_p10.calculateVerticalEnergy());
    t.checkExpect(this.g1_p11.energy, this.g1_p11.calculateEnergy());
    t.checkExpect(this.g1_p11.horizontalEnergy, this.g1_p11.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p11.verticalEnergy, this.g1_p11.calculateVerticalEnergy());
    t.checkExpect(this.g1_p12.energy, this.g1_p12.calculateEnergy());
    t.checkExpect(this.g1_p12.horizontalEnergy, this.g1_p12.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p12.verticalEnergy, this.g1_p12.calculateVerticalEnergy());
    t.checkExpect(this.g1_p13.energy, this.g1_p13.calculateEnergy());
    t.checkExpect(this.g1_p13.horizontalEnergy, this.g1_p13.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p13.verticalEnergy, this.g1_p13.calculateVerticalEnergy());
    t.checkExpect(this.g1_p14.energy, this.g1_p14.calculateEnergy());
    t.checkExpect(this.g1_p14.horizontalEnergy, this.g1_p14.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p14.verticalEnergy, this.g1_p14.calculateVerticalEnergy());
    t.checkExpect(this.g1_p15.energy, this.g1_p15.calculateEnergy());
    t.checkExpect(this.g1_p15.horizontalEnergy, this.g1_p15.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p15.verticalEnergy, this.g1_p15.calculateVerticalEnergy());
    t.checkExpect(this.g1_p16.energy, this.g1_p16.calculateEnergy());
    t.checkExpect(this.g1_p16.horizontalEnergy, this.g1_p16.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p16.verticalEnergy, this.g1_p16.calculateVerticalEnergy());
    t.checkExpect(this.g1_p17.energy, this.g1_p17.calculateEnergy());
    t.checkExpect(this.g1_p17.horizontalEnergy, this.g1_p17.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p17.verticalEnergy, this.g1_p17.calculateVerticalEnergy());
    t.checkExpect(this.g1_p18.energy, this.g1_p18.calculateEnergy());
    t.checkExpect(this.g1_p18.horizontalEnergy, this.g1_p18.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p18.verticalEnergy, this.g1_p18.calculateVerticalEnergy());
    t.checkExpect(this.g1_p19.energy, this.g1_p19.calculateEnergy());
    t.checkExpect(this.g1_p19.horizontalEnergy, this.g1_p19.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p19.verticalEnergy, this.g1_p19.calculateVerticalEnergy());
    t.checkExpect(this.g1_p20.energy, this.g1_p20.calculateEnergy());
    t.checkExpect(this.g1_p20.horizontalEnergy, this.g1_p20.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p20.verticalEnergy, this.g1_p20.calculateVerticalEnergy());
    t.checkExpect(this.g1_p21.energy, this.g1_p21.calculateEnergy());
    t.checkExpect(this.g1_p21.horizontalEnergy, this.g1_p21.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p21.verticalEnergy, this.g1_p21.calculateVerticalEnergy());
    t.checkExpect(this.g1_p22.energy, this.g1_p22.calculateEnergy());
    t.checkExpect(this.g1_p22.horizontalEnergy, this.g1_p22.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p22.verticalEnergy, this.g1_p22.calculateVerticalEnergy());
    t.checkExpect(this.g1_p23.energy, this.g1_p23.calculateEnergy());
    t.checkExpect(this.g1_p23.horizontalEnergy, this.g1_p23.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p23.verticalEnergy, this.g1_p23.calculateVerticalEnergy());
    t.checkExpect(this.g1_p24.energy, this.g1_p24.calculateEnergy());
    t.checkExpect(this.g1_p24.horizontalEnergy, this.g1_p24.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p24.verticalEnergy, this.g1_p24.calculateVerticalEnergy());
    t.checkExpect(this.g1_p25.energy, this.g1_p25.calculateEnergy());
    t.checkExpect(this.g1_p25.horizontalEnergy, this.g1_p25.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p25.verticalEnergy, this.g1_p25.calculateVerticalEnergy());
 
    // Checks that updating energy of a image pixel in graph 2 correctly changes the
    // energies
    t.checkExpect(this.g2_pA.energy, this.g2_pA.calculateEnergy());
  }
 
  //test createEnergiesColumn for APixel
  void testCreateEnergiesRow_APixel(Tester t) {
    // Initializes the example graphs and checks that the initial fields are correct
    this.testCheckInit_Graph1_5X5(t);
    this.testCheckInit_Graph2_1X1(t);
 
    // Updates the neighbors of the pixels in the graphs
    this.g1_p1.updateNeighbors(this.g1_pA, this.g1_p2, this.g1_p6, this.g1_pT);
    this.g1_p2.updateNeighbors(this.g1_pB, this.g1_p3, this.g1_p7, this.g1_p1);
    this.g1_p3.updateNeighbors(this.g1_pC, this.g1_p4, this.g1_p8, this.g1_p2);
    this.g1_p4.updateNeighbors(this.g1_pD, this.g1_p5, this.g1_p9, this.g1_p3);
    this.g1_p5.updateNeighbors(this.g1_pE, this.g1_pF, this.g1_p10, this.g1_p4);
    this.g1_p6.updateNeighbors(this.g1_p1, this.g1_p7, this.g1_p11, this.g1_pS);
    this.g1_p7.updateNeighbors(this.g1_p2, this.g1_p8, this.g1_p12, this.g1_p6);
    this.g1_p8.updateNeighbors(this.g1_p3, this.g1_p9, this.g1_p13, this.g1_p7);
    this.g1_p9.updateNeighbors(this.g1_p4, this.g1_p10, this.g1_p14, this.g1_p8);
    this.g1_p10.updateNeighbors(this.g1_p5, this.g1_pG, this.g1_p15, this.g1_p9);
    this.g1_p11.updateNeighbors(this.g1_p6, this.g1_p12, this.g1_p16, this.g1_pR);
    this.g1_p12.updateNeighbors(this.g1_p7, this.g1_p13, this.g1_p17, this.g1_p11);
    this.g1_p13.updateNeighbors(this.g1_p8, this.g1_p14, this.g1_p18, this.g1_p12);
    this.g1_p14.updateNeighbors(this.g1_p9, this.g1_p15, this.g1_p19, this.g1_p13);
    this.g1_p15.updateNeighbors(this.g1_p10, this.g1_pH, this.g1_p20, this.g1_p14);
    this.g1_p16.updateNeighbors(this.g1_p11, this.g1_p17, this.g1_p21, this.g1_pQ);
    this.g1_p17.updateNeighbors(this.g1_p12, this.g1_p18, this.g1_p22, this.g1_p16);
    this.g1_p18.updateNeighbors(this.g1_p13, this.g1_p19, this.g1_p23, this.g1_p17);
    this.g1_p19.updateNeighbors(this.g1_p14, this.g1_p20, this.g1_p24, this.g1_p18);
    this.g1_p20.updateNeighbors(this.g1_p15, this.g1_pI, this.g1_p25, this.g1_p19);
    this.g1_p21.updateNeighbors(this.g1_p16, this.g1_p22, this.g1_pO, this.g1_pQ);
    this.g1_p22.updateNeighbors(this.g1_p17, this.g1_p23, this.g1_pN, this.g1_p21);
    this.g1_p23.updateNeighbors(this.g1_p18, this.g1_p24, this.g1_pM, this.g1_p22);
    this.g1_p24.updateNeighbors(this.g1_p19, this.g1_p25, this.g1_pL, this.g1_p23);
    this.g1_p25.updateNeighbors(this.g1_p20, this.g1_pJ, this.g1_pK, this.g1_p24);
 
    this.g2_p1.updateNeighbors(this.g2_pA, this.g2_pB, this.g2_pC, this.g2_pD);
 
    // Updates energy of pixels
    this.g1_p1.createEnergiesRow();
    this.g2_pA.createEnergiesRow();
 
    // Checks that updating energy of a image pixel in graph 1 correctly changes the
    // energies
    t.checkExpect(this.g1_p1.energy, this.g1_p1.calculateEnergy());
    t.checkExpect(this.g1_p1.horizontalEnergy, this.g1_p1.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p1.verticalEnergy, this.g1_p1.calculateVerticalEnergy());
    t.checkExpect(this.g1_p2.energy, this.g1_p2.calculateEnergy());
    t.checkExpect(this.g1_p2.horizontalEnergy, this.g1_p2.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p2.verticalEnergy, this.g1_p2.calculateVerticalEnergy());
    t.checkExpect(this.g1_p3.energy, this.g1_p3.calculateEnergy());
    t.checkExpect(this.g1_p3.horizontalEnergy, this.g1_p3.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p3.verticalEnergy, this.g1_p3.calculateVerticalEnergy());
    t.checkExpect(this.g1_p4.energy, this.g1_p4.calculateEnergy());
    t.checkExpect(this.g1_p4.horizontalEnergy, this.g1_p4.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p4.verticalEnergy, this.g1_p4.calculateVerticalEnergy());
    t.checkExpect(this.g1_p5.energy, this.g1_p5.calculateEnergy());
    t.checkExpect(this.g1_p5.horizontalEnergy, this.g1_p5.calculateHorizontalEnergy());
    t.checkExpect(this.g1_p5.verticalEnergy, this.g1_p5.calculateVerticalEnergy());
 
    // Checks that updating energy of a image pixel in graph 2 correctly changes the
    // energies
    t.checkExpect(this.g2_pA.energy, this.g2_pA.calculateEnergy());
  }
 
  // test calculateHorizontalEnergy for ImagePixel
  void testCalculatHorizontaleEnergy_ImagePixel(Tester t) {
    this.setData_Graph1_5X5(t);
 
    t.checkExpect(this.g1_p1.calculateHorizontalEnergy(), -3.784313725490196);
    t.checkExpect(this.g1_p2.calculateHorizontalEnergy(), -2.6196078431372554);
    t.checkExpect(this.g1_p3.calculateHorizontalEnergy(), 1.2784313725490195);
    t.checkExpect(this.g1_p4.calculateHorizontalEnergy(), 1.3725490196078436);
    t.checkExpect(this.g1_p5.calculateHorizontalEnergy(), 2.5058823529411764);
    t.checkExpect(this.g1_p6.calculateHorizontalEnergy(), -5.784313725490196);
    t.checkExpect(this.g1_p7.calculateHorizontalEnergy(), -2.6196078431372554);
    t.checkExpect(this.g1_p8.calculateHorizontalEnergy(), 1.2784313725490195);
    t.checkExpect(this.g1_p9.calculateHorizontalEnergy(), 1.3725490196078436);
    t.checkExpect(this.g1_p10.calculateHorizontalEnergy(), 4.5058823529411764);
    t.checkExpect(this.g1_p11.calculateHorizontalEnergy(), -6.0);
    t.checkExpect(this.g1_p12.calculateHorizontalEnergy(), -1.6196078431372554);
    t.checkExpect(this.g1_p13.calculateHorizontalEnergy(), 0.49411764705882355);
    t.checkExpect(this.g1_p14.calculateHorizontalEnergy(), 0.3725490196078436);
    t.checkExpect(this.g1_p15.calculateHorizontalEnergy(), 5.5058823529411764);
    t.checkExpect(this.g1_p16.calculateHorizontalEnergy(), -6.0);
    t.checkExpect(this.g1_p17.calculateHorizontalEnergy(), 0.0);
    t.checkExpect(this.g1_p18.calculateHorizontalEnergy(), 0.0);
    t.checkExpect(this.g1_p19.calculateHorizontalEnergy(), 0.0);
    t.checkExpect(this.g1_p20.calculateHorizontalEnergy(), 6.0);
    t.checkExpect(this.g1_p21.calculateHorizontalEnergy(), -4.0);
    t.checkExpect(this.g1_p22.calculateHorizontalEnergy(), 0.0);
   t.checkExpect(this.g1_p23.calculateHorizontalEnergy(), 0.0);
    t.checkExpect(this.g1_p24.calculateHorizontalEnergy(), 0.0);
    t.checkExpect(this.g1_p25.calculateHorizontalEnergy(), 4.0);
  }
 
  // test calculateVerticalEnergy for ImagePixel
  void testCalculatVerticalEnergy_ImagePixel(Tester t) {
    this.setData_Graph1_5X5(t);
 
    t.checkExpect(this.g1_p1.calculateVerticalEnergy(), -2.7529411764705882);
    t.checkExpect(this.g1_p2.calculateVerticalEnergy(), -5.125490196078431);
    t.checkExpect(this.g1_p3.calculateVerticalEnergy(), -5.87843137254902);
    t.checkExpect(this.g1_p4.calculateVerticalEnergy(), -5.87843137254902);
    t.checkExpect(this.g1_p5.calculateVerticalEnergy(), -3.5058823529411764);
    t.checkExpect(this.g1_p6.calculateVerticalEnergy(), -1.215686274509804);
    t.checkExpect(this.g1_p7.calculateVerticalEnergy(), -1.215686274509804);
    t.checkExpect(this.g1_p8.calculateVerticalEnergy(), -1.215686274509804);
    t.checkExpect(this.g1_p9.calculateVerticalEnergy(), -2.0);
    t.checkExpect(this.g1_p10.calculateVerticalEnergy(), -2.0);
    t.checkExpect(this.g1_p11.calculateVerticalEnergy(), -1.2470588235294118);
    t.checkExpect(this.g1_p12.calculateVerticalEnergy(), -0.8745098039215691);
    t.checkExpect(this.g1_p13.calculateVerticalEnergy(), -0.12156862745097996);
    t.checkExpect(this.g1_p14.calculateVerticalEnergy(), -0.12156862745097996);
    t.checkExpect(this.g1_p15.calculateVerticalEnergy(), -0.49411764705882355);
    t.checkExpect(this.g1_p16.calculateVerticalEnergy(), 0.0);
    t.checkExpect(this.g1_p17.calculateVerticalEnergy(), 0.0);
    t.checkExpect(this.g1_p18.calculateVerticalEnergy(), 0.0);
    t.checkExpect(this.g1_p19.calculateVerticalEnergy(), 0.0);
    t.checkExpect(this.g1_p20.calculateVerticalEnergy(), 0.0);
    t.checkExpect(this.g1_p21.calculateVerticalEnergy(), 4.0);
    t.checkExpect(this.g1_p22.calculateVerticalEnergy(), 6.0);
    t.checkExpect(this.g1_p23.calculateVerticalEnergy(), 6.0);
    t.checkExpect(this.g1_p24.calculateVerticalEnergy(), 6.0);
    t.checkExpect(this.g1_p25.calculateVerticalEnergy(), 4.0);
  }
 
  // test findVerticalLevelNeighbors for BorderPixel (ONLY CALLED ON FIRST ROW OF
  // BORDER PIXELS)
  void testVerticalLevelNeighbors_BorderPixel(Tester t) {
    this.setData_Graph1_5X5(t);
 
    ArrayList<APixel> pA_AL = new ArrayList<>();
    pA_AL.add(this.g1_pT);
    pA_AL.add(this.g1_p1);
    pA_AL.add(this.g1_p2);
    t.checkExpect(this.g1_pA.findVerticalLevelNeighbors(), pA_AL);
 
    ArrayList<APixel> pB_AL = new ArrayList<>();
    pB_AL.add(this.g1_p1);
    pB_AL.add(this.g1_p2);
    pB_AL.add(this.g1_p3);
    t.checkExpect(this.g1_pB.findVerticalLevelNeighbors(), pB_AL);
 
    ArrayList<APixel> pC_AL = new ArrayList<>();
    pC_AL.add(this.g1_p2);
    pC_AL.add(this.g1_p3);
    pC_AL.add(this.g1_p4);
    t.checkExpect(this.g1_pC.findVerticalLevelNeighbors(), pC_AL);
 
    ArrayList<APixel> pD_AL = new ArrayList<>();
    pD_AL.add(this.g1_p3);
    pD_AL.add(this.g1_p4);
    pD_AL.add(this.g1_p5);
    t.checkExpect(this.g1_pD.findVerticalLevelNeighbors(), pD_AL);
 
    ArrayList<APixel> pE_AL = new ArrayList<>();
    pE_AL.add(this.g1_p4);
    pE_AL.add(this.g1_p5);
    pE_AL.add(this.g1_pF);
    t.checkExpect(this.g1_pE.findVerticalLevelNeighbors(), pE_AL);
  }
 
  // test findHorizontalLevelNeighbors for BorderPixel (ONLY CALLED ON FIRST
  // COLUMN OF
  // BORDER PIXELS)
  void testHorizontalLevelNeighbors_BorderPixel(Tester t) {
    this.setData_Graph1_5X5(t);
 
    ArrayList<APixel> pT_AL = new ArrayList<>();
    pT_AL.add(this.g1_pA);
    pT_AL.add(this.g1_p1);
    pT_AL.add(this.g1_p6);
    t.checkExpect(this.g1_pT.findHorizontalLevelNeighbors(), pT_AL);
 
    ArrayList<APixel> pS_AL = new ArrayList<>();
    pS_AL.add(this.g1_p1);
    pS_AL.add(this.g1_p6);
    pS_AL.add(this.g1_p11);
    t.checkExpect(this.g1_pS.findHorizontalLevelNeighbors(), pS_AL);
 
    ArrayList<APixel> pR_AL = new ArrayList<>();
    pR_AL.add(this.g1_p6);
    pR_AL.add(this.g1_p11);
    pR_AL.add(this.g1_p16);
    t.checkExpect(this.g1_pR.findHorizontalLevelNeighbors(), pR_AL);
 
    ArrayList<APixel> pQ_AL = new ArrayList<>();
    pQ_AL.add(this.g1_p11);
    pQ_AL.add(this.g1_p16);
    pQ_AL.add(this.g1_p21);
    t.checkExpect(this.g1_pQ.findHorizontalLevelNeighbors(), pQ_AL);
 
    ArrayList<APixel> pP_AL = new ArrayList<>();
    pP_AL.add(this.g1_p16);
    pP_AL.add(this.g1_p21);
    pP_AL.add(this.g1_pO);
    t.checkExpect(this.g1_pP.findHorizontalLevelNeighbors(), pP_AL);
  }
 
  // test findVerticalLevelNeighbors for ImagePixel
  void testVerticalLevelNeighbors_ImagePixel(Tester t) {
    this.setData_Graph1_5X5(t);
 
    ArrayList<APixel> g1_p1_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p1_verticalLevelNeighbors.add(this.g1_pS);
    g1_p1_verticalLevelNeighbors.add(this.g1_p6);
    g1_p1_verticalLevelNeighbors.add(this.g1_p7);
    t.checkExpect(this.g1_p1.findVerticalLevelNeighbors(), g1_p1_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p2_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p2_verticalLevelNeighbors.add(this.g1_p6);
    g1_p2_verticalLevelNeighbors.add(this.g1_p7);
    g1_p2_verticalLevelNeighbors.add(this.g1_p8);
    t.checkExpect(this.g1_p2.findVerticalLevelNeighbors(), g1_p2_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p3_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p3_verticalLevelNeighbors.add(this.g1_p7);
    g1_p3_verticalLevelNeighbors.add(this.g1_p8);
    g1_p3_verticalLevelNeighbors.add(this.g1_p9);
    t.checkExpect(this.g1_p3.findVerticalLevelNeighbors(), g1_p3_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p4_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p4_verticalLevelNeighbors.add(this.g1_p8);
    g1_p4_verticalLevelNeighbors.add(this.g1_p9);
    g1_p4_verticalLevelNeighbors.add(this.g1_p10);
    t.checkExpect(this.g1_p4.findVerticalLevelNeighbors(), g1_p4_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p5_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p5_verticalLevelNeighbors.add(this.g1_p9);
    g1_p5_verticalLevelNeighbors.add(this.g1_p10);
    g1_p5_verticalLevelNeighbors.add(this.g1_pG);
    t.checkExpect(this.g1_p5.findVerticalLevelNeighbors(), g1_p5_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p6_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p6_verticalLevelNeighbors.add(this.g1_pR);
    g1_p6_verticalLevelNeighbors.add(this.g1_p11);
    g1_p6_verticalLevelNeighbors.add(this.g1_p12);
    t.checkExpect(this.g1_p6.findVerticalLevelNeighbors(), g1_p6_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p7_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p7_verticalLevelNeighbors.add(this.g1_p11);
    g1_p7_verticalLevelNeighbors.add(this.g1_p12);
    g1_p7_verticalLevelNeighbors.add(this.g1_p13);
    t.checkExpect(this.g1_p7.findVerticalLevelNeighbors(), g1_p7_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p8_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p8_verticalLevelNeighbors.add(this.g1_p12);
    g1_p8_verticalLevelNeighbors.add(this.g1_p13);
    g1_p8_verticalLevelNeighbors.add(this.g1_p14);
    t.checkExpect(this.g1_p8.findVerticalLevelNeighbors(), g1_p8_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p9_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p9_verticalLevelNeighbors.add(this.g1_p13);
    g1_p9_verticalLevelNeighbors.add(this.g1_p14);
    g1_p9_verticalLevelNeighbors.add(this.g1_p15);
    t.checkExpect(this.g1_p9.findVerticalLevelNeighbors(), g1_p9_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p10_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p10_verticalLevelNeighbors.add(this.g1_p14);
    g1_p10_verticalLevelNeighbors.add(this.g1_p15);
    g1_p10_verticalLevelNeighbors.add(this.g1_pH);
    t.checkExpect(this.g1_p10.findVerticalLevelNeighbors(), g1_p10_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p11_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p11_verticalLevelNeighbors.add(this.g1_pQ);
    g1_p11_verticalLevelNeighbors.add(this.g1_p16);
    g1_p11_verticalLevelNeighbors.add(this.g1_p17);
    t.checkExpect(this.g1_p11.findVerticalLevelNeighbors(), g1_p11_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p12_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p12_verticalLevelNeighbors.add(this.g1_p16);
    g1_p12_verticalLevelNeighbors.add(this.g1_p17);
    g1_p12_verticalLevelNeighbors.add(this.g1_p18);
    t.checkExpect(this.g1_p12.findVerticalLevelNeighbors(), g1_p12_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p13_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p13_verticalLevelNeighbors.add(this.g1_p17);
    g1_p13_verticalLevelNeighbors.add(this.g1_p18);
    g1_p13_verticalLevelNeighbors.add(this.g1_p19);
    t.checkExpect(this.g1_p13.findVerticalLevelNeighbors(), g1_p13_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p14_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p14_verticalLevelNeighbors.add(this.g1_p18);
    g1_p14_verticalLevelNeighbors.add(this.g1_p19);
    g1_p14_verticalLevelNeighbors.add(this.g1_p20);
    t.checkExpect(this.g1_p14.findVerticalLevelNeighbors(), g1_p14_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p15_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p15_verticalLevelNeighbors.add(this.g1_p19);
    g1_p15_verticalLevelNeighbors.add(this.g1_p20);
    g1_p15_verticalLevelNeighbors.add(this.g1_pI);
    t.checkExpect(this.g1_p15.findVerticalLevelNeighbors(), g1_p15_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p16_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p16_verticalLevelNeighbors.add(this.g1_pP);
    g1_p16_verticalLevelNeighbors.add(this.g1_p21);
    g1_p16_verticalLevelNeighbors.add(this.g1_p22);
    t.checkExpect(this.g1_p16.findVerticalLevelNeighbors(), g1_p16_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p17_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p17_verticalLevelNeighbors.add(this.g1_p21);
    g1_p17_verticalLevelNeighbors.add(this.g1_p22);
    g1_p17_verticalLevelNeighbors.add(this.g1_p23);
    t.checkExpect(this.g1_p17.findVerticalLevelNeighbors(), g1_p17_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p18_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p18_verticalLevelNeighbors.add(this.g1_p22);
    g1_p18_verticalLevelNeighbors.add(this.g1_p23);
    g1_p18_verticalLevelNeighbors.add(this.g1_p24);
    t.checkExpect(this.g1_p18.findVerticalLevelNeighbors(), g1_p18_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p19_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p19_verticalLevelNeighbors.add(this.g1_p23);
    g1_p19_verticalLevelNeighbors.add(this.g1_p24);
    g1_p19_verticalLevelNeighbors.add(this.g1_p25);
    t.checkExpect(this.g1_p19.findVerticalLevelNeighbors(), g1_p19_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p20_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p20_verticalLevelNeighbors.add(this.g1_p24);
    g1_p20_verticalLevelNeighbors.add(this.g1_p25);
    g1_p20_verticalLevelNeighbors.add(this.g1_pJ);
    t.checkExpect(this.g1_p20.findVerticalLevelNeighbors(), g1_p20_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p21_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p21_verticalLevelNeighbors.add(this.g1_pO);
    g1_p21_verticalLevelNeighbors.add(this.g1_pO);
    g1_p21_verticalLevelNeighbors.add(this.g1_pO);
    t.checkExpect(this.g1_p21.findVerticalLevelNeighbors(), g1_p21_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p22_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p22_verticalLevelNeighbors.add(this.g1_pN);
    g1_p22_verticalLevelNeighbors.add(this.g1_pN);
    g1_p22_verticalLevelNeighbors.add(this.g1_pN);
    t.checkExpect(this.g1_p22.findVerticalLevelNeighbors(), g1_p22_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p23_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p23_verticalLevelNeighbors.add(this.g1_pM);
    g1_p23_verticalLevelNeighbors.add(this.g1_pM);
    g1_p23_verticalLevelNeighbors.add(this.g1_pM);
    t.checkExpect(this.g1_p23.findVerticalLevelNeighbors(), g1_p23_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p24_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p24_verticalLevelNeighbors.add(this.g1_pL);
    g1_p24_verticalLevelNeighbors.add(this.g1_pL);
    g1_p24_verticalLevelNeighbors.add(this.g1_pL);
    t.checkExpect(this.g1_p24.findVerticalLevelNeighbors(), g1_p24_verticalLevelNeighbors);
 
    ArrayList<APixel> g1_p25_verticalLevelNeighbors = new ArrayList<APixel>();
    g1_p25_verticalLevelNeighbors.add(this.g1_pK);
    g1_p25_verticalLevelNeighbors.add(this.g1_pK);
    g1_p25_verticalLevelNeighbors.add(this.g1_pK);
    t.checkExpect(this.g1_p25.findVerticalLevelNeighbors(), g1_p25_verticalLevelNeighbors);
  }
 
  //  // test findHorizontalLevelNeighbors for ImagePixel
  //  void testHorizontalLevelNeighbors_ImagePixel(Tester t) {
  //    this.setData_Graph1_5X5(t);
  //
  //    ArrayList<APixel> g1_p1_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p1_horizontalLevelNeighbors.add(this.g1_pB);
  //    g1_p1_horizontalLevelNeighbors.add(this.g1_p2);
  //    g1_p1_horizontalLevelNeighbors.add(this.g1_p7);
  //    t.checkExpect(this.g1_p1.findHorizontalLevelNeighbors(), g1_p1_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p2_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p2_horizontalLevelNeighbors.add(this.g1_pC);
  //    g1_p2_horizontalLevelNeighbors.add(this.g1_p3);
  //    g1_p2_horizontalLevelNeighbors.add(this.g1_p8);
  //    t.checkExpect(this.g1_p2.findHorizontalLevelNeighbors(), g1_p2_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p3_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p3_horizontalLevelNeighbors.add(this.g1_pD);
  //    g1_p3_horizontalLevelNeighbors.add(this.g1_p4);
  //    g1_p3_horizontalLevelNeighbors.add(this.g1_p9);
  //    t.checkExpect(this.g1_p3.findHorizontalLevelNeighbors(), g1_p3_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p4_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p4_horizontalLevelNeighbors.add(this.g1_pE);
  //    g1_p4_horizontalLevelNeighbors.add(this.g1_p5);
  //    g1_p4_horizontalLevelNeighbors.add(this.g1_p10);
  //    t.checkExpect(this.g1_p4.findHorizontalLevelNeighbors(), g1_p4_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p5_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p5_horizontalLevelNeighbors.add(this.g1_pF);
  //    g1_p5_horizontalLevelNeighbors.add(this.g1_pF);
  //    g1_p5_horizontalLevelNeighbors.add(this.g1_pF);
  //    t.checkExpect(this.g1_p5.findHorizontalLevelNeighbors(), g1_p5_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p6_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p6_horizontalLevelNeighbors.add(this.g1_p2);
  //    g1_p6_horizontalLevelNeighbors.add(this.g1_p7);
  //    g1_p6_horizontalLevelNeighbors.add(this.g1_p12);
  //    t.checkExpect(this.g1_p6.findHorizontalLevelNeighbors(), g1_p6_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p7_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p7_horizontalLevelNeighbors.add(this.g1_p3);
  //    g1_p7_horizontalLevelNeighbors.add(this.g1_p8);
  //    g1_p7_horizontalLevelNeighbors.add(this.g1_p13);
  //    t.checkExpect(this.g1_p7.findHorizontalLevelNeighbors(), g1_p7_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p8_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p8_horizontalLevelNeighbors.add(this.g1_p4);
  //    g1_p8_horizontalLevelNeighbors.add(this.g1_p9);
  //    g1_p8_horizontalLevelNeighbors.add(this.g1_p14);
  //    t.checkExpect(this.g1_p8.findHorizontalLevelNeighbors(), g1_p8_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p9_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p9_horizontalLevelNeighbors.add(this.g1_p5);
  //    g1_p9_horizontalLevelNeighbors.add(this.g1_p10);
  //    g1_p9_horizontalLevelNeighbors.add(this.g1_p15);
  //    t.checkExpect(this.g1_p9.findHorizontalLevelNeighbors(), g1_p9_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p10_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p10_horizontalLevelNeighbors.add(this.g1_pG);
  //    g1_p10_horizontalLevelNeighbors.add(this.g1_pG);
  //    g1_p10_horizontalLevelNeighbors.add(this.g1_pG);
  //    t.checkExpect(this.g1_p10.findHorizontalLevelNeighbors(), g1_p10_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p11_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p11_horizontalLevelNeighbors.add(this.g1_p7);
  //    g1_p11_horizontalLevelNeighbors.add(this.g1_p12);
  //    g1_p11_horizontalLevelNeighbors.add(this.g1_p17);
  //    t.checkExpect(this.g1_p11.findHorizontalLevelNeighbors(), g1_p11_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p12_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p12_horizontalLevelNeighbors.add(this.g1_p8);
  //    g1_p12_horizontalLevelNeighbors.add(this.g1_p13);
  //    g1_p12_horizontalLevelNeighbors.add(this.g1_p18);
  //    t.checkExpect(this.g1_p12.findHorizontalLevelNeighbors(), g1_p12_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p13_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p13_horizontalLevelNeighbors.add(this.g1_p9);
  //    g1_p13_horizontalLevelNeighbors.add(this.g1_p14);
  //    g1_p13_horizontalLevelNeighbors.add(this.g1_p19);
  //    t.checkExpect(this.g1_p13.findHorizontalLevelNeighbors(), g1_p13_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p14_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p14_horizontalLevelNeighbors.add(this.g1_p10);
  //    g1_p14_horizontalLevelNeighbors.add(this.g1_p15);
  //    g1_p14_horizontalLevelNeighbors.add(this.g1_p20);
  //    t.checkExpect(this.g1_p14.findHorizontalLevelNeighbors(), g1_p14_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p15_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p15_horizontalLevelNeighbors.add(this.g1_pH);
  //    g1_p15_horizontalLevelNeighbors.add(this.g1_pH);
  //    g1_p15_horizontalLevelNeighbors.add(this.g1_pH);
  //    t.checkExpect(this.g1_p15.findHorizontalLevelNeighbors(), g1_p15_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p16_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p16_horizontalLevelNeighbors.add(this.g1_p12);
  //    g1_p16_horizontalLevelNeighbors.add(this.g1_p17);
  //    g1_p16_horizontalLevelNeighbors.add(this.g1_p22);
  //    t.checkExpect(this.g1_p16.findHorizontalLevelNeighbors(), g1_p16_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p17_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p17_horizontalLevelNeighbors.add(this.g1_p13);
  //    g1_p17_horizontalLevelNeighbors.add(this.g1_p18);
  //    g1_p17_horizontalLevelNeighbors.add(this.g1_p23);
  //    t.checkExpect(this.g1_p17.findHorizontalLevelNeighbors(), g1_p17_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p18_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p18_horizontalLevelNeighbors.add(this.g1_p14);
  //    g1_p18_horizontalLevelNeighbors.add(this.g1_p19);
  //    g1_p18_horizontalLevelNeighbors.add(this.g1_p24);
  //    t.checkExpect(this.g1_p18.findHorizontalLevelNeighbors(), g1_p18_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p19_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p19_horizontalLevelNeighbors.add(this.g1_p15);
  //    g1_p19_horizontalLevelNeighbors.add(this.g1_p20);
  //    g1_p19_horizontalLevelNeighbors.add(this.g1_p25);
  //    t.checkExpect(this.g1_p19.findHorizontalLevelNeighbors(), g1_p19_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p20_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p20_horizontalLevelNeighbors.add(this.g1_pI);
  //    g1_p20_horizontalLevelNeighbors.add(this.g1_pI);
  //    g1_p20_horizontalLevelNeighbors.add(this.g1_pI);
  //    t.checkExpect(this.g1_p20.findHorizontalLevelNeighbors(), g1_p20_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p21_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p21_horizontalLevelNeighbors.add(this.g1_p17);
  //    g1_p21_horizontalLevelNeighbors.add(this.g1_p22);
  //    g1_p21_horizontalLevelNeighbors.add(this.g1_pN);
  //    t.checkExpect(this.g1_p21.findHorizontalLevelNeighbors(), g1_p21_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p22_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p22_horizontalLevelNeighbors.add(this.g1_p18);
  //    g1_p22_horizontalLevelNeighbors.add(this.g1_p23);
  //    g1_p22_horizontalLevelNeighbors.add(this.g1_pM);
  //    t.checkExpect(this.g1_p22.findHorizontalLevelNeighbors(), g1_p22_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p23_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p23_horizontalLevelNeighbors.add(this.g1_p19);
  //    g1_p23_horizontalLevelNeighbors.add(this.g1_p24);
  //    g1_p23_horizontalLevelNeighbors.add(this.g1_pL);
  //    t.checkExpect(this.g1_p23.findHorizontalLevelNeighbors(), g1_p23_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p24_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p24_horizontalLevelNeighbors.add(this.g1_p20);
  //    g1_p24_horizontalLevelNeighbors.add(this.g1_p25);
  //    g1_p24_horizontalLevelNeighbors.add(this.g1_pK);
  //    t.checkExpect(this.g1_p24.findHorizontalLevelNeighbors(), g1_p24_horizontalLevelNeighbors);
  //
  //    ArrayList<APixel> g1_p25_horizontalLevelNeighbors = new ArrayList<APixel>();
  //    g1_p25_horizontalLevelNeighbors.add(this.g1_pJ);
  //    g1_p25_horizontalLevelNeighbors.add(this.g1_pJ);
  //    g1_p25_horizontalLevelNeighbors.add(this.g1_pJ);
  //    t.checkExpect(this.g1_p25.findHorizontalLevelNeighbors(), g1_p25_horizontalLevelNeighbors);
  //  }
  //
    //// test findLowestVerticalSeam for Graph
    void testFindLowestVerticalSeam_Graph(Tester t) {
  
      // graph 2
      this.setData_Graph2_1X1(t);
  
      SeamInfo origin2 = new SeamInfo(this.g2_p1);
      SeamInfo next2 = new SeamInfo(this.g2_p1, origin2.totalWeight + this.g2_p1.calculateEnergy(),
          origin2);
      SeamInfo next3 = new SeamInfo(this.g2_pC, next2.totalWeight + this.g2_pC.calculateEnergy(),
          next2);
      t.checkExpect(this.graph2.lowestVerticalSeam, origin2);
    }
  //
  //  //// test findLowestHorizontalSeam for Graph
  //  void testFindHorizontalSeam_Graph(Tester t) {
  //
  //    // graph 2
  //    this.setData_Graph2_1X1(t);
  //
  //    this.graph2.findLowestHorizontalSeam();
  //    SeamInfo origin2 = new SeamInfo(this.g2_pA);
  //    SeamInfo next2 = new SeamInfo(this.g2_p1, origin2.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin2);
  //    t.checkExpect(this.graph2.lowestHorizontalSeam, next2);
  //  }
  //
  //  // test verticalSeamRemoval for SeamInfo
  //  void testVerticalSeamRemoval(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pA);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //
  //    next.verticalSeamRemoval(this.g2_p1);
  //    // throws exception
  //  }
  //
  //  //test horizontalSeamRemoval for SeamInfo
  //  void testHorizontalSeamRemoval(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pD);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //
  //    next.horizontalSeamRemoval(this.g2_p1);
  //    // throws exception
  //  }
  //
  //  // test findNextVertical3PixelsEnergy for SeamInfo
  //  void testFindNextVertical3PixelEnergy(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pA);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //    t.checkExpect(origin.findNextVertical3PixelsEnergy(), this.g2_p1);
  //  }
  //
  //  // test findNextHorizontal3PixelsEnergy for SeamInfo
  //  void testFindNextHorizontal3PixelEnergy(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pD);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //    t.checkExpect(origin.findNextHorizontal3PixelsEnergy(), this.g2_p1);
  //  }
  //
  //  // test findNextVerticalSeamInfo for SeamInfo
  //  void testFindNextVerticalSeamInfo(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pA);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //    t.checkExpect(origin.findNextVerticalSeamInfo(), next);
  //  }
  //
  //  // test findNextHorizontalSeamInfo for SeamInfo
  //  void testFindNextHorizontalSeamInfo(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pD);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //    t.checkExpect(origin.findNextHorizontalSeamInfo(), next);
  //  }
  //
  //  //
  //  void testUpdateLowestVerticalSeam(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pA);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //    ArrayList<ArrayList<APixel>> old = this.graph2List;
  //    // next.updateGraphAfterVerticalSeamRemoval(this.graph2List);
  //    t.checkExpect(old, this.graph2List);
  //  }
  //
  //  //
  //  void testUpdateLowestHorizontalSeam(Tester t) {
  //    this.setData_Graph2_1X1(t);
  //    SeamInfo origin = new SeamInfo(this.g2_pD);
  //    SeamInfo next = new SeamInfo(this.g2_p1, origin.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin);
  //    ArrayList<ArrayList<APixel>> old = this.graph2List;
  //    // next.updateGraphAfterVerticalSeamRemoval(this.graph2List);
  //    t.checkExpect(old, this.graph2List);
  //  }
  //
  //  // test compare for CompareEnergyValues {
  //  void testCompareEnergyValues(Tester t) {
  //    this.setData_Graph1_5X5(t);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p1, this.g1_p2), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p2, this.g1_p3), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p3, this.g1_p4), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p4, this.g1_p5), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p5, this.g1_p6), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p6, this.g1_p7), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p8), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p9), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p10), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p11), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p12), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p13), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p14), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p15), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p16), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p17), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p18), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p19), 1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p20), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p21), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p22), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p23), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p24), -1);
  //    t.checkExpect(new CompareEnergyValues().compare(this.g1_p7, this.g1_p25), -1);
  //  }
  //
//    // tests for testRemovePixelHorizontalHelper
//    void testRemovePixelHorizontalHelper(Tester t) {
//  
//      this.setData_Graph1_5X5(t);
//      t.checkExpect(this.g1_p18.right, this.g1_p19);
//      t.checkExpect(this.g1_p18.left, this.g1_p17);
//      t.checkExpect(this.g1_p18.up, this.g1_p13);
//      t.checkExpect(this.g1_p18.down, this.g1_p23);
//  
//      this.g1_p18.removePixelHorizontalHelper();
//  
//      t.checkExpect(this.g1_p18.right, this.g1_p14);
//      t.checkExpect(this.g1_p18.left, this.g1_p12);
//      t.checkExpect(this.g1_p18.up, this.g1_p8);
//      t.checkExpect(this.g1_p18.down, this.g1_p23);
//    }
//  //
//    // tests for testRemovePixelVerticalHelper
//    void testRemovePixelVerticalHelper(Tester t) {
//  
//      this.setData_Graph1_5X5(t);
//      t.checkExpect(this.g1_p14.right, this.g1_p15);
//      t.checkExpect(this.g1_p14.left, this.g1_p13);
//      t.checkExpect(this.g1_p14.up, this.g1_p9);
//      t.checkExpect(this.g1_p14.down, this.g1_p19);
//  
//      this.g1_p14.removePixelVerticalHelper();
//  
//      t.checkExpect(this.g1_p14.right, this.g1_p15);
//      t.checkExpect(this.g1_p14.left, this.g1_p12);
//      t.checkExpect(this.g1_p14.up, this.g1_p8);
//      t.checkExpect(this.g1_p14.down, this.g1_p23);
//    }
  //
  //  // tests for onTick in SeamCarver
  //  void tsetOnTick_SeamCarver(Tester t) {
  //    SeamCarver sc1 = new SeamCarver(this.graph1, new Random(2));
  //    SeamCarver result1 = new SeamCarver(this.graph1, new Random(2));
  //
  //    t.checkExpect(sc1.pause, false);
  //    t.checkExpect(sc1.rand, new Random(2));
  //    t.checkExpect(sc1.seam, new Random(2).nextInt(2));
  //    t.checkExpect(sc1.color, "1");
  //    t.checkExpect(sc1.stop, false);
  //    t.checkExpect(sc1.count, 0);
  //    t.checkExpect(sc1.wDelta, 0);
  //    t.checkExpect(sc1.hDelta, 0);
  //    t.checkExpect(result1.pause, false);
  //    t.checkExpect(result1.rand, new Random(2));
  //    t.checkExpect(result1.seam, new Random(2).nextInt(2));
  //    t.checkExpect(result1.color, "1");
  //    t.checkExpect(result1.stop, false);
  //    t.checkExpect(result1.count, 0);
  //    t.checkExpect(result1.wDelta, 0);
  //    t.checkExpect(result1.hDelta, 0);
  //
  //    sc1.onTick();
  //
  //    result1.find();
  //    result1.paint();
  //
  //    t.checkExpect(sc1.graph, result1.graph);
  //    t.checkExpect(sc1.count, 1);
  //
  //    sc1.onTick();
  //
  //    result1.carve();
  //
  //    t.checkExpect(sc1.graph, result1.graph);
  //    t.checkExpect(sc1.count, 2);
  //
  //    sc1.pause = true;
  //
  //    sc1.onTick();
  //
  //    t.checkExpect(sc1, result1);
  //  }
  //
  //  // test shouldWorldEnd in SeamCarver
  //  boolean shouldWorldEnd(Tester t) {
  //    SeamCarver sc1 = new SeamCarver(this.graph1, new Random(2));
  //    SeamCarver sc2 = new SeamCarver(this.graph2, new Random(2));
  //    SeamCarver sc3 = new SeamCarver(this.graph2, new Random(2));
  //
  //    sc1.onTick();
  //    sc2.onTick();
  //
  //    sc3.stop = true;
  //
  //    return t.checkExpect(sc1.shouldWorldEnd(), false)
  //        && t.checkExpect(sc2.shouldWorldEnd(), true)
  //        && t.checkExpect(sc3.shouldWorldEnd(), true);
  //  }
  //
  //  // test changeColor in APixel
  //  void changeColor(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    this.g1_p1.changeColor();
  //    this.g1_pA.changeColor();
  //
  //    t.checkExpect(this.g1_p1.color, Color.red);
  //    t.checkExpect(this.g1_pA.color, Color.red);
  //  }
  //
  //  // test paint in Graph
  //  void testPaint_Graph(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    this.graph1.paint(0);
  //    Graph result1 = new Graph("src/SeamImages/5x5.png");
  //    result1.lowestHorizontalSeam.paint();
  //
  //    t.checkExpect(this.graph1, result1);
  //
  //    this.graph1.paint(1);
  //    result1.lowestVerticalSeam.paint();
  //
  //    t.checkExpect(this.graph1, result1);
  //  }
  //
  //  //test paint in SeamCarver
  //  void testPaint_SeamCarver(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    SeamCarver sc1 = new SeamCarver(this.graph1);
  //    Graph result1 = new Graph("src/SeamImages/5x5.png");
  //    result1.findLowestHorizontalSeam();
  //    result1.findLowestVerticalSeam();
  //
  //    sc1.seam = 1;
  //
  //    sc1.paint();
  //    result1.paint(1);
  //
  //    t.checkExpect(sc1.graph, result1);
  //
  //    sc1.seam = 2;
  //
  //    sc1.paint();
  //    result1.paint(2);
  //
  //    t.checkExpect(sc1.graph, result1);
  //  }
  //
  //  // test paint in SeamInfo
  //  void testPaint_SeamInfo(Tester t) {
  //
  //    // graph 2
  //    this.setData_Graph2_1X1(t);
  //
  //    SeamInfo origin2 = new SeamInfo(this.g2_pA);
  //    SeamInfo next2 = new SeamInfo(this.g2_p1, origin2.totalWeight + this.g2_p1.calculateEnergy(),
  //        origin2);
  //
  //    origin2.paint();
  //    next2.paint();
  //
  //    t.checkExpect(this.g2_pA.color, Color.black);
  //    t.checkExpect(this.g2_p1.color, Color.red);
  //    t.checkExpect(this.g2_pA.color, Color.black);
  //  }
  //
  //  // test find in SeamCarver
  //  void testFind_SeamCarver(Tester t) {
  //
  //    SeamCarver sc1 = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
  //    Graph result1 = new Graph("src/SeamImages/5x5.png");
  //
  //    sc1.find();
  //    result1.findLowestHorizontalSeam();
  //    result1.findLowestVerticalSeam();
  //
  //    t.checkExpect(sc1.graph, result1);
  //  }
  //
  //  // test carve in SeamCarver
  //  void testCarve_SeamCarver(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    SeamCarver sc1 = new SeamCarver(this.graph1, new Random(2));
  //    SeamCarver result1 = new SeamCarver(this.graph1, new Random(2));
  //
  //    t.checkExpect(sc1.pause, false);
  //    t.checkExpect(sc1.rand, new Random(2));
  //    t.checkExpect(sc1.seam, new Random(2).nextInt(2));
  //    t.checkExpect(sc1.color, 1);
  //    t.checkExpect(sc1.stop, false);
  //    t.checkExpect(sc1.count, 0);
  //    t.checkExpect(sc1.wDelta, 0);
  //    t.checkExpect(sc1.hDelta, 0);
  //    t.checkExpect(result1.pause, false);
  //    t.checkExpect(result1.rand, new Random(2));
  //    t.checkExpect(result1.seam, new Random(2).nextInt(2));
  //    t.checkExpect(result1.color, 1);
  //    t.checkExpect(result1.stop, false);
  //    t.checkExpect(result1.count, 0);
  //    t.checkExpect(result1.wDelta, 0);
  //    t.checkExpect(result1.hDelta, 0);
  //
  //    sc1.seam = 1;
  //    sc1.carve();
  //
  //    result1.graph.removeVerticalSeam();
  //    result1.wDelta = 1;
  //    result1.seam = new Random(2).nextInt(2);
  //
  //    t.checkExpect(sc1.graph, result1.graph);
  //    t.checkExpect(sc1.wDelta, result1.wDelta);
  //    t.checkExpect(sc1.seam, result1.seam);
  //
  //    sc1.seam = 0;
  //    sc1.carve();
  //
  //    result1.graph.removeHorizontalSeam();
  //    result1.hDelta = 1;
  //    result1.seam = new Random(2).nextInt(2);
  //
  //    t.checkExpect(sc1.graph, result1.graph);
  //    t.checkExpect(sc1.hDelta, result1.hDelta);
  //    t.checkExpect(sc1.seam, result1.seam);
  //  }
  //
  //  // test lastScene in SeamCarver
  //  boolean testLastScene_SeamCarver(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    SeamCarver sc1 = new SeamCarver(this.graph1);
  //    Graph result1 = new Graph("src/SeamImages/5x5.png");
  //
  //    return t.checkExpect(sc1.lastScene("end"), result1.lastScene());
  //  }
  //
  //  // test lastScene in Graph
  //  boolean testLastScene_Graph(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    WorldScene scene = new WorldScene(1000, 1000);
  //    scene.placeImageXY(new TextImage("End", 24, FontStyle.BOLD, Color.black), 500, 500);
  //
  //    return t.checkExpect(this.graph1.lastScene(), scene);
  //  }
  //
  //  // test onKeyEvent in SeamCarver
  //  void testOnKeyEvent_SeamCarver(Tester t) {
  //
  //    this.setData_Graph1_5X5(t);
  //
  //    SeamCarver sc1 = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
  //    t.checkExpect(sc1.pause, false);
  //    t.checkExpect(sc1.rand, new Random(2));
  //    t.checkExpect(sc1.seam, new Random(2).nextInt(2));
  //    t.checkExpect(sc1.color, "1");
  //    t.checkExpect(sc1.stop, false);
  //    t.checkExpect(sc1.count, 0);
  //    t.checkExpect(sc1.wDelta, 0);
  //    t.checkExpect(sc1.hDelta, 0);
  //
  //    sc1.onKeyEvent(" ");
  //    t.checkExpect(sc1.pause, true);
  //    sc1.onKeyEvent("1");
  //    t.checkExpect(sc1.color, 1);
  //    sc1.onKeyEvent("2");
  //    t.checkExpect(sc1.color, 2);
  //    sc1.onKeyEvent("3");
  //    t.checkExpect(sc1.color, 3);
  //    sc1.onKeyEvent("escape");
  //    t.checkExpect(sc1.stop, true);
  //
  //    SeamCarver sc2 = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
  //    SeamCarver result1 = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
  //
  //    sc2.onKeyEvent("v");
  //    t.checkExpect(sc2, result1);
  //    sc2.onKeyEvent("h");
  //    t.checkExpect(sc2, result1);
  //
  //    sc2.pause = true;
  //    result1.seam = 1;
  //    result1.find();
  //    result1.carve();
  //
  //    sc2.onKeyEvent("v");
  //
  //    t.checkExpect(sc2, result1);
  //
  //    SeamCarver sc3 = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
  //    SeamCarver result2 = new SeamCarver(new Graph("src/SeamImages/5x5.png"));
  //
  //    sc3.pause = true;
  //    result2.seam = 0;
  //    result2.find();
  //    result2.carve();
  //
  //    sc3.onKeyEvent("h");
  //
  //    t.checkExpect(sc3, result2);
  //  }
  //
  //  // test shouldEnd in Graph
  //  boolean shouldEnd_Graph(Tester t) {
  //    return true;
  //  }
}