public class Table {
    static void tabels(int num){
        int i=1;
    while(i<11){
        int result=num*i;
        
        
        System.out.println(num + "*" +i +"=" +result);
        i++;
    }
    }
    static void tabelss(int num){
    for(int i=1;i<=10;i++){
        int result=num*i;
        System.out.println(num + "*" +i +"=" +result);
    }

}
    
    
    public static void main(String args[]){
        tabels(10);
        tabelss(5);
    }
}
