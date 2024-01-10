import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import javalib.impworld.World;
import javalib.impworld.WorldScene;
import javalib.worldimages.ComputedPixelImage;
import javalib.worldimages.FontStyle;
import javalib.worldimages.FromFileImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldImage;

//
interface IPixel {
  // calculates the brightness of this APixel
  double calculateBrightness();

  // calculates the energy of this APixel
  double calculateEnergy();

  // EFFECT: updates this pixel's up, right, down, and left field
  void updateNeighbors(APixel up, APixel right, APixel down, APixel left);

  // EFFECT: updates this pixel's inwardPixel field with the given pixel
  void updateNeighbors(APixel inward);

  // EFFECT: updates the given ImagePixel's inwardPixel to this pixel
  // but ImagePixel doesn't have an inwardPixel so it does nothing
  void updateNeighborsImagePixel(ImagePixel outward);

  // EFFECT: updates the given BorderPixel's inwardPixel to this pixel
  void updateNeighborsBorderPixel(BorderPixel outward);

  // finds the following 3 next level neighbors from this pixel, when calculating
  // a vertical seam
  ArrayList<APixel> findVerticalLevelNeighbors();

  // EFFECT: reconnects the neighbors of this APixel to each other
  // based on the direction of the seam, effectively removing this vertical seam
  void removePixelVertical();

  // EFFECT: moves subsequent pixels to the correct position and reassigns its
  // neighbors when one of the pixels is removed in that column
  void removePixelVerticalHelper();

  // finds the 3 neighbors of this pixel, the next three adjacent vertical pixels
  // and puts them in a list
  ArrayList<APixel> findHorizontalLevelNeighbors();

  // EFFECT: reconnects the neighbors of this APixel to each other
  // based on the direction of the seam, effectively removing this horizontal seam
  void removePixelHorizontal();

  // EFFECT: moves subsequent pixels to the correct position and reassigns its
  // neighbors when one of the pixels is removed in that row
  void removePixelHorizontalHelper();

  // EFFECT: renders the column of an image
  void renderColumn(int x, int y, ComputedPixelImage image, int color);

  // EFFECT: renders the row of an image
  void renderRow(int x, int y, ComputedPixelImage image, int color);

  // EFFECT calculates and sets the energies of each pixel in each column
  void createEnergiesColumn();

  // EFFECT: calculates and sets the energies of each pixel in the row
  void createEnergiesRow();

  // EFFECT: checks whether or not the grid is well formed
  void wellFormedColumn();

  // EFFECT: check whether or not each pixel in the row is well formed with the
  // other pixels in the grid
  void wellFormedRow();

  // EFFECT: changes the pixel color to red
  void changeColor();

  // EFFECT: adds all the pixels in the same row as the start pixel to the list,
  // including the start pixel
  void addToListRow(ArrayList<APixel> firstRow);

  // EFFECT: adds all the pixels in the same column the start pixel to the list,
  // including the start pixel
  void addToListColumm(ArrayList<APixel> firstColumn);

  // observes the right of the pixel
  APixel updateStart();
}

// The abstract class that represents pixels in an image.
// Design decision: class is named APixel instead of AIPixel for readability
abstract class APixel implements IPixel {
  Color color;
  double brightness;
  Double energy;
  APixel up;
  APixel right;
  APixel down;
  APixel left;

  // constructor for BorderPixels
  APixel() {
    this.color = Color.black;
    this.brightness = this.calculateBrightness();
    this.energy = Double.MAX_VALUE;
    this.up = this;
    this.right = this;
    this.down = this;
    this.left = this;
  }

  // constructor for image pixel
  APixel(Color color) {
    this.color = color;
    this.brightness = this.calculateBrightness();
    this.energy = null;
    this.up = null;
    this.right = null;
    this.down = null;
    this.left = null;
  }

  // calculates the brightness of this APixel
  public double calculateBrightness() {
    return (this.color.getRed() + this.color.getGreen() + this.color.getBlue()) / 255.0;
  }

  // calculates the energy of this APixel
  public abstract double calculateEnergy();

  // EFFECT: updates this pixel's up, right, down, and left field
  public abstract void updateNeighbors(APixel up, APixel right, APixel down, APixel left);

  // EFFECT: updates this pixel's inwardPixel field with the given pixel
  public abstract void updateNeighbors(APixel inward);

  // EFFECT: updates the given ImagePixel's inwardPixel to this pixel
  // but ImagePixel doesn't have an inwardPixel so it does nothing
  public abstract void updateNeighborsImagePixel(ImagePixel outward);

  // EFFECT: updates the given BorderPixel's inwardPixel to this pixel
  public abstract void updateNeighborsBorderPixel(BorderPixel outward);

  // finds the following 3 next level neighbors from this pixel, when calculating
  // a vertical seam
  public abstract ArrayList<APixel> findVerticalLevelNeighbors();

  // EFFECT: reconnects the neighbors of this APixel to each other
  // based on the direction of the seam, effectively removing this vertical seam
  public abstract void removePixelVertical();

  // EFFECT: moves subsequent pixels to the correct position and reassigns its
  // neighbors when one of the pixels is removed in that column
  public abstract void removePixelVerticalHelper();

  // finds the 3 neighbors of this pixel, the next three adjacent vertical pixels
  // and puts them in a list
  public abstract ArrayList<APixel> findHorizontalLevelNeighbors();

  // EFFECT: reconnects the neighbors of this APixel to each other
  // based on the direction of the seam, effectively removing this horizontal seam
  public abstract void removePixelHorizontal();

  // EFFECT: moves subsequent pixels to the correct position and reassigns its
  // neighbors when one of the pixels is removed in that row
  public abstract void removePixelHorizontalHelper();

  // EFFECT: renders the column of an image
  public abstract void renderColumn(int x, int y, ComputedPixelImage image, int color);

  // EFFECT: renders the row of an image
  public abstract void renderRow(int x, int y, ComputedPixelImage image, int color);

  // EFFECT calculates and sets the energies of each pixel in each column
  public abstract void createEnergiesColumn();

  // EFFECT: calculates and sets the energies of each pixel in the row
  public abstract void createEnergiesRow();

  // EFFECT: checks whether or not the grid is well formed
  public abstract void wellFormedColumn();

  // EFFECT: check whether or not each pixel in the row is well formed with the
  // other pixels in the grid
  public abstract void wellFormedRow();

  // EFFECT: changes the pixel color to red
  public void changeColor() {
    this.color = Color.red;
  }

  // EFFECT: adds all the pixels in the same row as the start pixel to the list,
  // including the start pixel
  public abstract void addToListRow(ArrayList<APixel> firstRow);

  // EFFECT: adds all the pixels in the same column the start pixel to the list,
  // including the start pixel
  public abstract void addToListColumm(ArrayList<APixel> firstColumn);

  // observes the right of the pixel
  public APixel updateStart() {
    return this.right;
  }
}

// Represents the border pixel in an image, instantiated with the color black.
class BorderPixel extends APixel {
  ImagePixel inwardPixel;

  BorderPixel() {
    super();
  }

  // called on the first row of the grid which is an arraylist of border pixels
  // and returns a list of neighbors of this pixel
  public ArrayList<APixel> findVerticalLevelNeighbors() {
    ArrayList<APixel> neighbors = new ArrayList<APixel>();
    neighbors.add(this.inwardPixel.left);
    neighbors.add(this.inwardPixel);
    neighbors.add(this.inwardPixel.right);
    return neighbors;
  }

  // EFFECT: updates this pixel's up, right, down, and left field
  // does nothing since border pixel's neighbors always point to itself
  public void updateNeighbors(APixel up, APixel right, APixel down, APixel left) {
    //
  }

  // EFFECT: updates this pixel's inwardPixel field with the given pixel
  public void updateNeighbors(APixel inward) {
    inward.updateNeighborsBorderPixel(this);
  }

  // EFFECT: updates the given ImagePixel's inwardPixel to this pixel
  // but ImagePixel doesn't have an inwardPixel so it does nothing
  // does nothing since border pixel's neighbors always point to itself
  public void updateNeighborsImagePixel(ImagePixel outward) {
    //
  }

  // EFFECT: updates the given BorderPixel's inwardPixel to this pixel
  // but inwardPixel is an ImagePixel so it does nothing
  // does nothing since border pixel's neighbors always point to itself
  public void updateNeighborsBorderPixel(BorderPixel outward) {
    //
  }

  // returns the highest double value as the energy of a border pixel
  // such that it won't be included as a low value seam
  public double calculateEnergy() {
    return Double.MAX_VALUE;
  }

  // EFFECT: reconnects the neighbors of this APixel to each other based on
  // it being vertical, so it effectively removes this pixel from the graph
  // SIDE-EFFECT: shifts all the pixels to the right of this pixel, over to the
  // left by one spot
  public void removePixelVertical() {
    //
  }

  // EFFECT: moves this and the ride pixels over by one to the left, closing in
  // the picture and reconnecting
  public void removePixelVerticalHelper() {
    //
  }

  // EFFECT: does not render border pixels in the graph
  public void renderColumn(int x, int y, ComputedPixelImage image, int color) {
    //
  }

  // EFFECT: does not render border pixels in the row
  public void renderRow(int x, int y, ComputedPixelImage image, int color) {
    //
  }

  // EFFECT: does not create energies in the column
  public void createEnergiesColumn() {
    //
  }

  // EFFECT: does not create energies in the row
  public void createEnergiesRow() {
    //
  }

  // EFFECT: does not check well-formed-ness of the column
  public void wellFormedColumn() {
    //
  }

  // EFFECT: does not check well-formed-ness of the row
  public void wellFormedRow() {
    //
  }

  // EFFECT: does not add to a row
  public void addToListRow(ArrayList<APixel> firstRow) {
    //
  }

  // EFFECT: does not add to a list
  public void removePixelHorizontal() {
    //
  }

  // adds the pixels to the neighbors of this pixel
  public ArrayList<APixel> findHorizontalLevelNeighbors() {
    ArrayList<APixel> neighbors = new ArrayList<APixel>();
    neighbors.add(this.inwardPixel.up);
    neighbors.add(this.inwardPixel);
    neighbors.add(this.inwardPixel.down);
    return neighbors;
  }

  // EFFECT: does not add to the list
  public void addToListColumm(ArrayList<APixel> firstColumn) {
    //
  }

  // EFFECT: does not remove
  public void removePixelHorizontalHelper() {
    //
  }

}

//represents a single pixel in a picture
class ImagePixel extends APixel {
  Double horizontalEnergy;
  Double verticalEnergy;

  ImagePixel(Color color) {
    super(color);
  }

  // EFFECT: reconnects the neighbors of this APixel to each other based on
  // it being vertical, so it effectively removes this pixel from the graph
  // SIDE-EFFECT: shifts all the pixels to the right of this pixel, over to the
  // left by one spot
  public void removePixelVertical() {

    this.left.right = this.right;
    this.right.left = this.left;

    this.up.down = this.right;
    this.down.up = this.right;

    this.right.removePixelVerticalHelper();
  }

  // EFFECT: moves this and the ride pixels over by one to the left, closing in
  // the picture and reconnecting
  public void removePixelVerticalHelper() {
    this.up.down = this.right;
    this.down.up = this.right;

    this.up = this.up.left;
    this.down = this.down.left;

    this.right.removePixelVerticalHelper();
  }

  // EFFECT: updates this pixel's up, right, down, and left field
  public void updateNeighbors(APixel up, APixel right, APixel down, APixel left) {
    this.up = up;
    this.right = right;
    this.down = down;
    this.left = left;
  }

  // EFFECT: updates this pixel's inwardPixel field with the given pixel
  public void updateNeighbors(APixel inward) {
    inward.updateNeighborsImagePixel(this);
  }

  // EFFECT: updates the given ImagePixel's inwardPixel to this ImagePixel pixel
  // but ImagePixel doesn't have an inwardPixel so it does nothing
  public void updateNeighborsImagePixel(ImagePixel outward) {
    //
  }

  // EFFECT: updates the given BorderPixel's inwardPixel to this ImagePixel
  public void updateNeighborsBorderPixel(BorderPixel outward) {
    outward.inwardPixel = this;
  }

  // calculates the energy of this image pixel
  public double calculateEnergy() {
    return Math.sqrt(Math.pow(this.horizontalEnergy, 2) + Math.pow(this.verticalEnergy, 2));
  }

  // calculates the horizontal energy of this image pixel
  public double calculateHorizontalEnergy() {
    double a = this.up.left.calculateBrightness();
    double d = this.left.calculateBrightness();
    double g = this.down.left.calculateBrightness();
    double c = this.up.right.calculateBrightness();
    double f = this.right.calculateBrightness();
    double i = this.down.right.calculateBrightness();
    return ((a + d + g) - (c + f + i));
  }

  // calculates the vertical energy of this image pixel
  public double calculateVerticalEnergy() {
    double a = this.up.left.calculateBrightness();
    double b = this.up.calculateBrightness();
    double c = this.up.right.calculateBrightness();
    double g = this.down.left.calculateBrightness();
    double h = this.down.calculateBrightness();
    double i = this.down.right.calculateBrightness();
    return ((a + b + c) - (g + h + i));
  }

  // finds the following 3 next level neighbors from this image pixel
  public ArrayList<APixel> findVerticalLevelNeighbors() {
    ArrayList<APixel> threeVerticalNeighbors = new ArrayList<APixel>();
    threeVerticalNeighbors.add(this.down.left);
    threeVerticalNeighbors.add(this.down);
    threeVerticalNeighbors.add(this.down.right);
    return threeVerticalNeighbors;
  }

  // EFFECT: renders the image by rendering each column
  public void renderColumn(int x, int y, ComputedPixelImage image, int color) {
    this.renderRow(x, y, image, color);
    this.down.renderColumn(x, y + 1, image, color);
  }

  // EFFECT: renders each pixel in the row
  public void renderRow(int x, int y, ComputedPixelImage image, int color) {
    if ((color == 1) || (color == 3)) {
      image.setColorAt(x, y, this.color);
    }
    else if (color == 2) {
      int value = (int) (25.5 * this.energy);
      image.setColorAt(x, y, new Color(value, value, value));
    }
    this.right.renderRow(x + 1, y, image, color);
  }

  // EFFECT: calculates the energies the grid by going down each column
  public void createEnergiesColumn() {
    this.createEnergiesRow();
    this.down.createEnergiesColumn();
  }

  // EFFECT: calculates the energy of each pixel in the row
  public void createEnergiesRow() {
    this.horizontalEnergy = this.calculateHorizontalEnergy();
    this.verticalEnergy = this.calculateVerticalEnergy();
    this.energy = this.calculateEnergy();
    this.right.createEnergiesRow();
  }

  // EFFECT: checks the well formed-ness of the whole graph by checking each row
  public void wellFormedColumn() {
    this.wellFormedRow();
    this.down.wellFormedColumn();
  }

  // EFFECT : checks that each pixel is well formed in the row
  public void wellFormedRow() {
    if (this.left.up != this.up.left) {
      throw new RuntimeException("Not well formed: left-up and up-left of this image pixel");
    }
    else if (this.right.up != this.up.right) {
      throw new RuntimeException(
          "Not well formed: right-up and up-right of this image pixel" + this);
    }
    else if (this.left.down != this.down.left) {
      throw new RuntimeException("Not well formed: left-down and down-left of this image pixel");
    }
    else if (this.right.down != this.down.right) {
      throw new RuntimeException("Not well formed: right-down and down-right of this image pixel");
    }
    else if (this != this.up.down) {
      throw new RuntimeException("Not well formed: up-down doesn't point to this image pixel");
    }
    else if (this != this.down.up) {
      throw new RuntimeException("Not well formed: down-up doesn't point to this image pixel");
    }
    else if (this != this.left.right) {
      throw new RuntimeException("Not well formed: left-right doesn't point to this image pixel");
    }
    else if (this != this.right.left) {
      throw new RuntimeException("Not well formed: right-left doesn't point to this image pixel");
    }
    else if (this.left == null) {
      throw new RuntimeException("Not well formed: this image pixel's left is null");
    }
    else if (this.right == null) {
      throw new RuntimeException("Not well formed: this image pixel's right is null");
    }
    else if (this.up == null) {
      throw new RuntimeException("Not well formed: this image pixel's up is null");
    }
    else if (this.down == null) {
      throw new RuntimeException("Not well formed: this image pixel's down is null");
    }
    else {
      this.right.wellFormedRow();
    }
  }

  // EFFECT: adds the whole row of pixels to a list
  public void addToListRow(ArrayList<APixel> firstRow) {
    firstRow.add(this);
    this.right.addToListRow(firstRow);
  }

  // EFFECT: moves this and the ride pixels over by one to the left, closing in
  // the picture and reconnecting
  public void removePixelHorizontal() {

    this.up.down = this.down;
    this.down.up = this.up;

    this.left.right = this.down;
    this.right.left = this.down;

    this.down.removePixelHorizontalHelper();
  }

  // EFFECT: moves this and the ride pixels over by one to the left, closing in
  // the picture and reconnecting
  public void removePixelHorizontalHelper() {
    this.left.right = this.down;
    this.right.left = this.down;

    this.left = this.left.up;
    this.right = this.right.up;

    this.down.removePixelHorizontalHelper();
  }

  // finds the neighbors of a pixel and adds the 3 to an array list
  // used to check the next potential pixel in a horizontal seam
  public ArrayList<APixel> findHorizontalLevelNeighbors() {
    ArrayList<APixel> threeHorizontalNeighbors = new ArrayList<APixel>();
    threeHorizontalNeighbors.add(this.right.up);
    threeHorizontalNeighbors.add(this.right);
    threeHorizontalNeighbors.add(this.right.down);
    return threeHorizontalNeighbors;
  }

  // EFFECT: adds the how column of pixels to a list
  public void addToListColumm(ArrayList<APixel> firstColumn) {
    firstColumn.add(this);
    this.down.addToListColumm(firstColumn);
  }

}

//represents a graph of pixels, which represent an image
class Graph {
  ArrayList<ArrayList<APixel>> grid = new ArrayList<ArrayList<APixel>>();
  SeamInfo lowestVerticalSeam;
  SeamInfo lowestHorizontalSeam;
  FromFileImage image;
  int originalHeight;
  int originalWidth;
  APixel start;

  Graph(String fileName) {
    this.image = new FromFileImage(fileName);
    this.originalHeight = (int) this.image.getHeight();
    this.originalWidth = (int) this.image.getWidth();
    this.createGraph();
  }

  // EFFECT: sets grid to be a 2D ArrayList of APixels based on the given image
  void createPixels() {
    this.grid = new ArrayList<ArrayList<APixel>>();
    Color color;

    // iterates over each row of pixels in the image and creates the pixels for each
    // row
    for (int y = 0; y < this.originalHeight; y += 1) {
      ArrayList<APixel> currentRow = new ArrayList<APixel>();
      // adds border pixels above the first row of image pixels
      if (y == 0) {
        // iterates over each column in the row of pixels in the image and creates
        // border pixels
        // for each column
        for (int x = 0; x < this.originalWidth; x += 1) {
          currentRow.add(new BorderPixel());
        }
        this.grid.add(currentRow);
        currentRow = new ArrayList<APixel>();
      }
      // iterates over each column of pixels in the row of pixels and creates the
      // pixels/borders
      for (int x = 0; x < this.originalWidth; x += 1) {
        color = this.image.getColorAt(x, y);
        // adds border pixel at the start of the row
        if (x == 0) {
          currentRow.add(new BorderPixel());
        }
        currentRow.add(new ImagePixel(color));
        // adds border pixel at the end of the row
        if (x == (this.originalWidth - 1)) {
          currentRow.add(new BorderPixel());
        }
      }
      this.grid.add(currentRow);
      currentRow = new ArrayList<APixel>();
      // adds border pixels below the last row of image pixels
      if (y == (this.originalHeight - 1)) {
        // iterates over each column in the row of pixels in the image and creates
        // border pixels
        // for each column
        for (int x = 0; x < this.originalWidth; x += 1) {
          currentRow.add(new BorderPixel());
        }
        this.grid.add(currentRow);
      }
    }
  }

  // EFFECT: assigns energies to all of the pixels in grid
  void createEnergies() {
    this.start.createEnergiesColumn();
  }

  // EFFECT: sets up the neighbors/inward of the APixels in grid based on their
  // location in the array
  void createGraph() {

    // sets grid to be a 2D ArrayList of APixels based on the given image
    this.createPixels();

    // iterates over grid and creates the neighbors for the pixels in each row
    for (int y = 0; y < this.grid.size(); y += 1) {

      ArrayList<APixel> currentRow = this.grid.get(y);

      // top border
      if (y == 0) {
        // iterates over each pixel in the column and updates its neighbors
        for (int x = 0; x < currentRow.size(); x += 1) {
          currentRow.get(x).updateNeighbors(this.grid.get(y + 1).get(x + 1));
        }
      }
      // bottom border
      else if (y == (this.grid.size() - 1)) {
        // iterates over each pixel in the column and updates its neighbors
        for (int x = 0; x < currentRow.size(); x += 1) {
          currentRow.get(x).updateNeighbors(this.grid.get(y - 1).get(x + 1));
        }
      }
      else {
        // image pixels
        // iterates over the ArrayList at i in grid and creates the neighbors for the
        // pixels in
        // the list
        for (int x = 0; x < currentRow.size(); x += 1) {
          // left border
          if (x == 0) {
            currentRow.get(x).updateNeighbors(currentRow.get(x + 1));
          }
          // right border
          else if (x == (this.grid.get(y).size() - 1)) {
            currentRow.get(x).updateNeighbors(currentRow.get(x - 1));
          }
          else {
            // image pixels
            APixel top;
            APixel right = currentRow.get(x + 1);
            APixel bottom;
            APixel left = currentRow.get(x - 1);
            // top is border
            if ((y - 1) == 0) {
              top = this.grid.get(y - 1).get(x - 1);
            }
            // top is not border
            else {
              top = this.grid.get(y - 1).get(x);
            }
            // bottom is border
            if ((y + 1) == (this.grid.size() - 1)) {
              bottom = this.grid.get(y + 1).get(x - 1);
            }
            // bottom is not border
            else {
              bottom = this.grid.get(y + 1).get(x);
            }
            currentRow.get(x).updateNeighbors(top, right, bottom, left);
          }
        }
      }
    }

    // assigns a start pixel to the start field
    this.start = this.grid.get(1).get(1);

    // assigns energies to all of the pixels in grid
    this.createEnergies();
  }

  // EFFECT: determines if this graph is well formed and throws exceptions if it's
  // not
  boolean wellFormed() {
    if ((this.originalHeight >= 3) && (this.originalWidth >= 3)) {
      this.grid.get(2).get(2).wellFormedColumn();
    }
    return true;
  }

  // returns the SeamInfo with the smallest weight out of all the small seam infos
  // from the list, using a comparator that compares their totalWeights that
  // should have been accumulated
  void findLowestVerticalSeam() {
    ArrayList<SeamInfo> seamInfoOfBottom = this.findLowestVerticalSeamHelper();

    // find the lowest totalWeight seamInfo from the last row
    SeamInfo lowestSeamInfo = seamInfoOfBottom.get(0);
    for (int i = 1; i < seamInfoOfBottom.size(); i++) {
      if (seamInfoOfBottom.get(i).totalWeight < lowestSeamInfo.totalWeight) {
        lowestSeamInfo = seamInfoOfBottom.get(i);
      }
    }
    this.lowestVerticalSeam = lowestSeamInfo;
  }

  // EFFECT: changes the colors of the pixels in the seam being removed to red
  void paint(int seam) {
    if (seam == 0) {
      this.lowestHorizontalSeam.paint();
    }
    else if (seam == 1) {
      this.lowestVerticalSeam.paint();
    }
  }

  // creates an arraylist of the lowest seamInfos in this graph
  ArrayList<SeamInfo> findLowestVerticalSeamHelper() {
    int height = this.originalHeight;

    ArrayList<APixel> firstRow = new ArrayList<>();
    this.start.addToListRow(firstRow);

    ArrayList<SeamInfo> seamInfoOfFirstRow = new ArrayList<SeamInfo>();
    for (APixel p : firstRow) {
      seamInfoOfFirstRow.add(new SeamInfo(p));
    }

    // iterate through the remaining rows, finding the lowest weight seam for
    // each
    // pixel, skipping first and last row
    for (int i = 0; i < height; i++) {
      ArrayList<SeamInfo> seamInfoOfRow = new ArrayList<SeamInfo>();

      // iterates through the row of pixels, skipping first and last pixel
      // starting at current pixel
      for (int a = 0; a < seamInfoOfFirstRow.size(); a++) {
        SeamInfo lowestSeamInfo = seamInfoOfFirstRow.get(a).findNextVerticalSeamInfo();
        // iterates through the seam info of adjacent pixels
        for (int x = a - 1; x <= (a + 1); x++) {
          // check if index is within bounds
          if ((x >= 0) && (x < seamInfoOfFirstRow.size())) {
            SeamInfo nextSeamInfo = seamInfoOfFirstRow.get(x).findNextVerticalSeamInfo();
            if (nextSeamInfo.totalWeight < lowestSeamInfo.totalWeight) {
              lowestSeamInfo = nextSeamInfo;
            }
          }
        }
        seamInfoOfRow.add(lowestSeamInfo);
      }
      seamInfoOfFirstRow = seamInfoOfRow;
    }
    return seamInfoOfFirstRow;
  }

  // EFFECT: removes the lowestVerticalSeam from grid
  void removeVerticalSeam() {
    this.lowestVerticalSeam.verticalSeamRemoval(this.start);
  }

  // renders this graph into an image
  WorldImage render(int color) {
    ComputedPixelImage result = new ComputedPixelImage(this.originalHeight, this.originalWidth);
    this.start.renderColumn(0, 0, result, color);
    return result;
  }

  // creates an ending scene
  public WorldScene lastScene() {
    WorldScene scene = new WorldScene(1000, 1000);
    scene.placeImageXY(new TextImage("End", 24, FontStyle.BOLD, Color.black), 500, 500);
    return scene;
  }

  // checks if the world should end
  boolean shouldEnd(int wDelta, int hDelta, int count) {
    if (count > 1) {
      if ((((int) this.image.getHeight() - 1) != (this.originalHeight - (Math.abs(hDelta))))
          || (((int) this.image.getWidth() - 1) != (this.originalWidth - (Math.abs(wDelta))))) {
        return true;
      }
    }
    if (((int) this.image.getHeight() == 0) && ((int) this.image.getWidth() == 0)) {
      return true;
    }
    else {
      return false;
      // return this.wellFormed();
    }
  }

  // returns the SeamInfo with the smallest weight out of all the small seam infos
  // from the list, using a comparator that compares their totalWeights that
  // should have been accumulated
  void findLowestHorizontalSeam() {
    ArrayList<SeamInfo> seamInfoOfRightMost = this.findLowestHorizontalSeamHelper();

    // find the lowest totalWeight seamInfo from the last row
    SeamInfo lowestSeamInfo = seamInfoOfRightMost.get(0);
    for (int i = 1; i < seamInfoOfRightMost.size(); i++) {
      if (seamInfoOfRightMost.get(i).totalWeight < lowestSeamInfo.totalWeight) {
        lowestSeamInfo = seamInfoOfRightMost.get(i);
      }
    }
    this.lowestHorizontalSeam = lowestSeamInfo;
  }

  // creates an arraylist of the lowest seamInfos in this graph horizontally
  ArrayList<SeamInfo> findLowestHorizontalSeamHelper() {
    int width = this.originalWidth;

    ArrayList<APixel> firstColumn = new ArrayList<>();
    this.start.addToListColumm(firstColumn);

    ArrayList<SeamInfo> seamInfoOfFirstColumn = new ArrayList<SeamInfo>();
    for (APixel p : firstColumn) {
      seamInfoOfFirstColumn.add(new SeamInfo(p));
    }

    // iterate through the remaining rows, finding the lowest weight seam for
    // each pixel, skipping first and last row
    for (int i = 0; i < width; i++) {
      ArrayList<SeamInfo> seamInfoOfRow = new ArrayList<SeamInfo>();

      // iterates through the row of pixels, skipping first and last pixel
      // starting at current pixel
      for (int a = 0; a < seamInfoOfFirstColumn.size(); a++) {
        SeamInfo lowestSeamInfo = seamInfoOfFirstColumn.get(a).findNextHorizontalSeamInfo();
        // iterates through the seam info of adjacent pixels
        for (int x = a - 1; x <= (a + 1); x++) {
          // check if index is within bounds
          if ((x >= 0) && (x < seamInfoOfFirstColumn.size())) {
            SeamInfo nextSeamInfo = seamInfoOfFirstColumn.get(x).findNextHorizontalSeamInfo();
            if (nextSeamInfo.totalWeight < lowestSeamInfo.totalWeight) {
              lowestSeamInfo = nextSeamInfo;
            }
          }
        }
        seamInfoOfRow.add(lowestSeamInfo);
      }
      seamInfoOfFirstColumn = seamInfoOfRow;
    }
    return seamInfoOfFirstColumn;
  }

  // EFFECT: big function!! takes the lowest horizontal seam of this graph and
  // removes it
  void removeHorizontalSeam() {
    this.lowestHorizontalSeam.horizontalSeamRemoval(this.start);
  }

}

//represents the information of an accumulating seam in a picture
class SeamInfo {
  APixel pixel;
  double totalWeight;
  SeamInfo cameFrom;

  SeamInfo(APixel pixel, double totalWeight, SeamInfo cameFrom) {
    this.pixel = pixel;
    this.totalWeight = totalWeight;
    this.cameFrom = cameFrom;
  }

  SeamInfo(APixel pixel) {
    this.pixel = pixel;
    this.totalWeight = 0;
    this.cameFrom = null;
  }

  // EFFECT: changes the color of the pixels in the seam to red
  void paint() {
    this.pixel.changeColor();
    if (this.cameFrom != null) {
      this.cameFrom.paint();
    }
  }

  // creates a new SeamInfo, adding on to the information with the new pixel in
  // the seam
  SeamInfo findNextVerticalSeamInfo() {
    APixel nextPixel = this.findNextVertical3PixelsEnergy();
    double nextTotalWeight = this.totalWeight + nextPixel.energy;
    return new SeamInfo(nextPixel, nextTotalWeight, this);
  }

  // finds the next pixel with the lowest amount of energy from the given pixel
  APixel findNextVertical3PixelsEnergy() {
    ArrayList<APixel> threeVerticalNeighbors = this.pixel.findVerticalLevelNeighbors();

    if (!(threeVerticalNeighbors.isEmpty())) {
      APixel leftMostPixel = threeVerticalNeighbors.get(0);
      APixel middlePixel = threeVerticalNeighbors.get(1);
      APixel rightMostPixel = threeVerticalNeighbors.get(2);

      if (new CompareEnergyValues().compare(leftMostPixel, middlePixel) <= 0) {
        if (new CompareEnergyValues().compare(leftMostPixel, rightMostPixel) <= 0) {
          return leftMostPixel;
        }
        else {
          return rightMostPixel;
        }
      }
      else if (new CompareEnergyValues().compare(middlePixel, rightMostPixel) <= 0) {
        return middlePixel;
      }
      else {
        return rightMostPixel;
      }
    }
    return this.pixel;
  }

  // EFFECT:
  // set this pixel's neighbors to each other first
  // removes the lowestTotalWeight seam found, from the the graph, and reconnects
  // the remaining pixels to one another correctly
  // goes from bottom up
  // will concurrently update the 2d array in Graph by also removing each pixel
  void verticalSeamRemoval(APixel start) {
    if (this.pixel == start) {
      start = start.updateStart();
    }
    this.pixel.removePixelVertical();
    if (this.cameFrom != null) {
      this.cameFrom.verticalSeamRemoval(start);
    }
  }

  // creates a new SeamInfo, adding on to the information with the new pixel in
  // the seam
  SeamInfo findNextHorizontalSeamInfo() {
    APixel nextPixel = this.findNextHorizontal3PixelsEnergy();
    double nextTotalWeight = this.totalWeight + nextPixel.calculateEnergy();
    return new SeamInfo(nextPixel, nextTotalWeight, this);
  }

  // finds the next pixel with the lowest amount of energy from the given pixel
  APixel findNextHorizontal3PixelsEnergy() {
    ArrayList<APixel> threeHorizontalNeighbors = this.pixel.findHorizontalLevelNeighbors();

    if (!(threeHorizontalNeighbors.isEmpty())) {
      APixel topMostPixel = threeHorizontalNeighbors.get(0);
      APixel middlePixel = threeHorizontalNeighbors.get(1);
      APixel bottomMostPixel = threeHorizontalNeighbors.get(2);

      if (new CompareEnergyValues().compare(topMostPixel, middlePixel) <= 0) {
        if (new CompareEnergyValues().compare(topMostPixel, bottomMostPixel) <= 0) {
          return topMostPixel;
        }
        else {
          return bottomMostPixel;
        }
      }
      else if (new CompareEnergyValues().compare(middlePixel, bottomMostPixel) <= 0) {
        return middlePixel;
      }
      else {
        return bottomMostPixel;
      }
    }
    return this.pixel;
  }

  // EFFECT: removes all the pixels in the lowest horizontal seam
  public void horizontalSeamRemoval(APixel start) {
    if (this.pixel == start) {
      start = start.updateStart();
    }
    this.pixel.removePixelHorizontal();
    if (this.cameFrom != null) {
      this.cameFrom.horizontalSeamRemoval(start);
    }
  }
}

// a comparator that compares the energy of two pixels
class CompareEnergyValues implements Comparator<APixel> {

  // returns an int representing which energy is greater
  public int compare(APixel p1, APixel p2) {
    double energyDiff = p1.calculateEnergy() - p2.calculateEnergy();
    if (energyDiff > 0) {
      return 1;
    }
    else if (energyDiff < 0) {
      return -1;
    }
    else {
      return 0;
    }
  }
}

// represents a world where a SeamCarver exists
class SeamCarver extends World {
  Graph graph;
  // represents whether the SeamCarver is paused or not
  boolean pause;
  // represents which seam gets removed
  // v is 1, h is 0
  int seam;
  // represents a color state where 1 is the actual image, 2 is the energies,
  // and 3 is the cumulative weight of each seam
  int color;
  boolean stop;
  int count;
  Random rand;
  int wDelta;
  int hDelta;

  SeamCarver(Graph graph, Random random) {
    this.graph = graph;
    this.pause = false;
    this.rand = random;
    this.seam = this.rand.nextInt(2);
    this.color = 1;
    this.stop = false;
    this.count = 0;
    this.wDelta = 0;
    this.hDelta = 0;

  }

  SeamCarver(Graph graph) {
    this(graph, new Random((int) Math.random()));
  }

  // EFFECT: carves the image according to specific key-presses
  // able to pause
  // able to remove horizontal seam
  // able to remove vertical seam
  public void onKeyEvent(String key) {
    if (key.equals(" ")) {
      this.pause = !this.pause;
    }
    else if (key.equals("v")) {
      if (this.pause = true) {
        this.seam = 1;
        this.find();
        this.carve();
      }
    }
    else if (key.equals("h")) {
      if (this.pause = true) {
        this.seam = 0;
        this.find();
        this.carve();
      }
    }
    else if (key.equals("1")) {
      this.color = 1;
    }
    else if (key.equals("2")) {
      this.color = 2;
    }
    else if (key.equals("3")) {
      this.color = 3;
    }
    else if (key.equals("escape")) {
      this.stop = true;
    }
  }

  // produces a WorldScene with the grid rendered
  public WorldScene makeScene() {
    WorldScene canvas = new WorldScene(1000, 1000);
    canvas.placeImageXY(this.graph.render(this.color), 500, 500);
    return canvas;
  }

  // displays the last scene
  public WorldScene lastScene(String msg) {
    return this.graph.lastScene();
  }

  // EFFECT: carves the image according to what seam needs to be removed
  public void carve() {
    if (this.seam == 1) {
      this.graph.removeVerticalSeam();
      this.wDelta += 1;
    }
    else if (this.seam == 0) {
      this.graph.removeHorizontalSeam();
      this.hDelta += 1;
    }
    this.seam = this.rand.nextInt(2);
  }

  // EFFECT: finds the appropriate seam and sets the graphs field equal to it
  public void find() {
    this.graph.findLowestVerticalSeam();
    this.graph.findLowestHorizontalSeam();
  }

  // EFFECT: changes the color of the pixels in the seam to be removed
  public void paint() {
    this.graph.paint(this.seam);
  }

  // checks if the world should end
  public boolean shouldWorldEnd() {
    return this.graph.shouldEnd(this.wDelta, this.hDelta, this.count) || this.stop;
  }

  // EFFECT: removes the lowest energy vertical seam each tick
  public void onTick() {
    if (this.pause) {
    }
    else {
      if ((this.count % 2) == 0) {
        this.find();
        this.paint();
      }
      else {
        this.carve();
      }
      this.count += 1;
    }
  }
}
