package state;

public class Main {
    public static void main(String[] args) {
        Xerox xerox = new GiveMeMoney();
        CopyClient client = new CopyClient();
        client.setXerox(xerox);
        client.justDoIt();
        for (int i =0; i<10;i++){
            client.nextActivity();
            client.justDoIt();
    }
}}
