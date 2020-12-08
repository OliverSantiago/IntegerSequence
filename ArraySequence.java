import java.util.NoSuchElementException;
import java.util.Arrays;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i]=other[i];
    }
  }

  public void reset(){
    currentIndex=0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    return (currentIndex<this.length());
  }

  public int next(){
    int temp = data[currentIndex];
    currentIndex++;
    return temp;
  }
}
