public class bytebinary {
    public static void main(String[] args) {
        byte a = 0b00001100; // 12
        byte b = 0b00000110; // 6
        byte binaryNegation = (byte) ~b;  // binaryNegation -> 0b11111001
        byte binaryAnd = (byte) (a & b);    // binaryAnd -> 0b00000100
        byte binaryOr = (byte) (a | b);     // binaryOr -> 0b00001110
        byte binaryXor = (byte) (a ^ b);    // binaryXor -> 0b00001010
        // nawiasy sa potrzebne, jak w matematyce, decyduja o kolejnosci dzialan
        // 0b11111111111111111111111111111001 & 0b11111111 -> 0b0000000000000000000011111001
        System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')); // wypiszmy b binarnie
        System.out.println(String.format("%8s", Integer.toBinaryString(binaryNegation & 0xFF)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(binaryAnd & 0xFF)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(binaryOr & 0xFF)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(binaryXor & 0xFF)).replace(' ', '0'));
        byte shiftLeft = (byte) (binaryNegation << 2);
        byte shiftRightSigned = (byte) (binaryNegation >> 2);
        byte shiftRightUnsigned = (byte) (binaryNegation >>> 2);
        System.out.println(String.format("%8s", Integer.toBinaryString(shiftLeft & 0xFF)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(shiftRightSigned & 0xFF)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(shiftRightUnsigned & 0xFF)).replace(' ', '0'));
    }
    }
