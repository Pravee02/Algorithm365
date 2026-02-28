public class Tables{

static void PrintTable(int num){//5
    for(int i=1; i<=10;i++){
        int result= num * i ;
        System.out.println(num + "*" + i + "="+ result);
    }

}


    public static void main(String args[]){

PrintTable(5);
    }

}