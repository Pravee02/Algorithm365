public class Table {
    static void tabels(int num){
        int i=1;
    while(i<11){
        int result=num*i;
        
        
        System.out.println(num + "*" +i +"=" +result);
        i++;
    }
    
    }
    public static void main(String args[]){
        tabels(10);
    }
}
