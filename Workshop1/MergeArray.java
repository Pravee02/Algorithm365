public class MergeArray {

    // Function to merge data[] into masterArray[]
    static void mergeArrays(int[] masterArray, int[] data) {

        int startIndex = masterArray.length - data.length;

        for(int dataIndex = 0; dataIndex < data.length; dataIndex++) {

            masterArray[startIndex + dataIndex] = data[dataIndex];
 /* dataIndex = 0                           dataIndex = 1
masterArray[3 + 0] = data[0]               masterArray[3 + 1] = data[1]
masterArray[3] = 4                          masterArray[4] = 5
Array becomes:                              Array becomes:            
{1,2,3,4,0,0}                                 {1,2,3,4,5,0} */


        }
    }

    static void printArray(int[] numbers) {
        for(int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
    }

    public static void main(String[] args) {

        int[] masterArray = {1,2,3,0,0,0};
        int[] data = {4,5,6};

        mergeArrays(masterArray, data);
        printArray(masterArray);
    }
}