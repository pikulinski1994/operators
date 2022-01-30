public class Binary {

    public static void main(String[] args) {


            int a = 0b1100; // 12
            int b = 0b0110; // 6
            int binaryNegation = ~b;  // binaryNegation -> 0b111...1001
            int binaryAnd = a & b;    // binaryAnd -> 0b0100
            int binaryOr = a | b;     // binaryOr -> 0b1110
            int binaryXor = a ^ b;    // binaryXor -> 0b1010
            System.out.println(Integer.toBinaryString(b)); // wypiszmy b binarnie
            System.out.println(Integer.toBinaryString(binaryNegation));
            System.out.println(Integer.toBinaryString(binaryAnd));
            System.out.println(Integer.toBinaryString(binaryOr));
            System.out.println(Integer.toBinaryString(binaryXor));
            int shiftLeft = binaryNegation << 2;
            int shiftRightSigned = binaryNegation >> 2;
            int shiftRightUnsigned = binaryNegation >>> 2;
            System.out.println(Integer.toBinaryString(shiftLeft));
            System.out.println(Integer.toBinaryString(shiftRightSigned));
            System.out.println(Integer.toBinaryString(shiftRightUnsigned));
    }
}
