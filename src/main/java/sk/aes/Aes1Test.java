package sk.aes;

public class Aes1Test {
    public static void main(String[] args) {
        //加密的操作
        byte[] bys = Aes1Util.encrypt("需要加密的内容", "1234");
        //解密的操作
        byte[] decrypt = Aes1Util.decrypt(bys, "1234");

        System.out.println("加密后:"+new String(bys));
        System.out.println("解密后:"+new String(decrypt));

    }
}
