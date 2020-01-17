package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {
    int n;

    //TODO: add tests here
    @Test
    public void searchEmptyList() {
        int[] emptyList = {};
        n = 3;
        assertEquals(-1, BonusBinarySearch.binarySearch(emptyList, n));
    }

    @Test
    public void positiveSearchSingleItemList() {
        int [] singleItemList = {3};
        n = 3;
        assertEquals(0, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchSingleItemList() {
        int [] singleItemList = {5};
        n = 3;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void searchStartTwoItemList() {
        int [] singleItemList = {3, 7};
        n = 3;
        assertEquals(0, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void searchEndTwoItemList() {
        int [] singleItemList = {3, 7};
        n = 7;
        assertEquals(1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchBeforeStartTwoItemList() {
        int [] singleItemList = {3, 7};
        n = 1;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchAfterEndTwoItemList() {
        int [] singleItemList = {3, 7};
        n = 9;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchInteriorTwoItemList() {
        int [] singleItemList = {3, 7};
        n = 5;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }


    @Test
    public void searchStartThreeItemList() {
        int [] singleItemList = {3, 7, 11};
        n = 3;
        assertEquals(0, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void searchInteriorThreeItemList() {
        int [] singleItemList = {3, 7, 11};
        n = 7;
        assertEquals(1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void searchEndThreeItemList() {
        int [] singleItemList = {3, 7, 11};
        n = 11;
        assertEquals(2, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchBeforeStartThreeItemList() {
        int [] singleItemList = {3, 7, 11};
        n = 1;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchInteriorThreeItemList() {
        int [] singleItemList = {3, 7, 11};
        n = 5;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }

    @Test
    public void negativeSearchAfterEndThreeItemList() {
        int [] singleItemList = {3, 7, 11};
        n = 13;
        assertEquals(-1, BonusBinarySearch.binarySearch(singleItemList, n));
    }






    @Test
    public void positiveSearchEvenLengthList() {
        int[] sortedNumbersEvenLength = {-4, -2, -1, 0, 3, 6, 14, 21, 34, 50};
        n = 0;
        assertEquals(3, BonusBinarySearch.binarySearch(sortedNumbersEvenLength, n));
    }

    @Test
    public void positiveSearchOddLengthList() {
        int[] sortedNumbersOddLength = {-4, -2, -1, 0, 3, 6, 14, 21, 34};
        n = 0;
        assertEquals(3, BonusBinarySearch.binarySearch(sortedNumbersOddLength, n));
    }

    @Test
    public void searchBeginningOfList() {
        int[] sortedNumbersEvenLength = {-4, -2, -1, 0, 3, 6, 14, 21, 34, 50};
        n = -4;
        assertEquals(0, BonusBinarySearch.binarySearch(sortedNumbersEvenLength, n));
    }

    @Test
    public void searchEndOfList() {
        int[] sortedNumbersEvenLength = {-4, -2, -1, 0, 3, 6, 14, 21, 34, 50};
        n = 50;
        assertEquals(9, BonusBinarySearch.binarySearch(sortedNumbersEvenLength, n));
    }

    @Test
    public void searchTermNotInList() {
        int[] sortedNumbersEvenLength = {-4, -2, -1, 0, 3, 6, 14, 21, 34, 50};
        n = 5;
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNumbersEvenLength, n));
    }

}
