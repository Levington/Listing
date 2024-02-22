package Listing5;

class SecureDivisionOp {
public static void main(String[] args) {
    int result;
    for (int divisior = - 5; divisior <= 5; divisior++){
        result = divisior != 0 ? 100 / divisior:0;
        if (result != 0){
            System.out.println("100 / " + divisior + "=" + result);
        }

    }

}
}
