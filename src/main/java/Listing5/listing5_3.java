package Listing5;

class Base64Demo {
public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("usage:Base64Demo text");
        System.exit(1);
        String text = args[0];
        Base64Demo   enc = new Base64Demo();
        byte[] encoded = enc.encode(text.getBytes());
        enc = null;
        String decoded = null;
        Base64Demo dec = new Base64Demo();
        decoded = new String(dec.encode(encoded));
        dec = null;
        System.out.println("Закодировано:" + encoded);
        System.out.println("Декодировано:" + decoded);
        encoded = null;
        decoded = null;

    }
}

    private byte[] encode(byte[] bytes) {
        return bytes;
    }
}
