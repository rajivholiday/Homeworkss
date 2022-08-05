package lesson9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static lesson9.IndexOfArrayElement.find;
import static org.junit.jupiter.api.Assertions.*;

class IndexOfArrayElementTest {
    IndexOfArrayElement obj;

    @BeforeEach
    public void setUp(){
        this.obj = new IndexOfArrayElement();
    }
    @Test
    void elementIndex(){
        int [] arr = {1,2,3,4,5};
        int result = 4;
        assertEquals(result,find(arr,5));
    }
    @Test
    void indexElement(){
        int[] arr = {1,2,3,4,5};
        int result  = -1;
        assertEquals(result,find(arr,3));

    }

}