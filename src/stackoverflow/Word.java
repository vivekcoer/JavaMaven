package stackoverflow;

import java.util.*;


class Word{
protected String theWord;
protected int hashValue;
protected Word next;
protected int key;
public Word(String theWord,int hashValue){
    this.theWord = theWord;
    this.hashValue = hashValue;

}

public String returnWord(){
return theWord;
}

public int returnHashVal(){

return hashValue;
}


}//end class