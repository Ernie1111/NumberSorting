public class NumberSorting {

    public static void main(String[] args) {

        int randomNum[] = {5, 7, 4, 9, 8, 5, 6, 3};
        System.out.println("Before Sorting Array");
        for(int i : randomNum) {
            System.out.println(i + " ");

        }

        System.out.println("Sorted Array");

        selectionSort(randomNum);

        for(int i : randomNum) {
            System.out.println(i + " ");





        }
        selectionSortbw(randomNum);
        System.out.println("Sorted Backwards");
        for(int i1 : randomNum) {
            System.out.println(i1 + " ");
        }
    }

    private static void selectionSort(int[] randomNum) {

        for(int i = 0; i < randomNum.length - 1; i++) {
            int Lowest = i;
            for(int j = i + 1; j < randomNum.length; j++) {
                if(randomNum[Lowest] > randomNum[j]) {
                    Lowest = j;
                }
            }

            int temp = randomNum[i];
            randomNum[i] = randomNum[Lowest];
            randomNum[Lowest] = temp;
        }
    }
    private static void selectionSortbw(int[] randomNum) {
        for(int i = 0; i < randomNum.length - 1; i++) {
            int Lowest = i;
            for(int j = i + 1; j < randomNum.length; j++) {
                if(randomNum[Lowest] < randomNum[j]) {
                    Lowest = j;
                }
            }

            int temp = randomNum[i];
            randomNum[i] = randomNum[Lowest];
            randomNum[Lowest] = temp;
        }
    }
}
