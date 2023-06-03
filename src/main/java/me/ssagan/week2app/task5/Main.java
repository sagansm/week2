package me.ssagan.week2app.task5;

public class Main {
    public static void main(String[] args) {
        //Выполните упаковку каждого примитива в соответствующую ему обёртку разными способами и обратную распаковку.

        //упаковка
        boolean booleanVar = true;
        Boolean booleanObj1 = new Boolean(booleanVar);
        Boolean booleanObj2 = Boolean.valueOf(booleanVar);
        Boolean booleanObj3 = booleanVar;

        byte byteVar = 10;
        Byte byteObj1 = new Byte(byteVar);
        Byte byteObj2 = Byte.valueOf(byteVar);
        Byte byteObj3 = byteVar;

        short shortVar = 30000;
        Short shortObj1 = new Short(shortVar);
        Short shortObj2 = Short.valueOf(shortVar);
        Short shortObj3 = shortVar;

        int intVar = 123456789;
        Integer intObj1 = new Integer(intVar);
        Integer intObj2 = Integer.valueOf(intVar);
        Integer intObj3 = intVar;

        long longVar = 987654321L;
        Long longObj1 = new Long(longVar);
        Long longObj2 = Long.valueOf(longVar);
        Long longObj3 = longVar;

        char charVar = 'ы';
        Character charObj1 = new Character(charVar);
        Character charObj2 = Character.valueOf(charVar);
        Character charObj3 = charVar;

        float floatVar = 3.14F;
        Float floatObj1 = new Float(floatVar);
        Float floatObj2 = Float.valueOf(floatVar);
        Float floatObj3 = floatVar;

        double doubleVar = 2.71828;
        Double doubleObj1 = new Double(doubleVar);
        Double doubleObj2 = Double.valueOf(doubleVar);
        Double doubleObj3 = doubleVar;

        //распаковка
        boolean booleanVar1 = booleanObj1.booleanValue();
        boolean booleanVar2 = booleanObj2;

        byte byteVar1 = byteObj1.byteValue();
        byte byteVar2 = byteObj2;

        short shortVar1 = shortObj1.shortValue();
        short shortVar2 = shortObj2;

        int intVar1 = intObj1.intValue();
        int intVar2 = intObj2;

        long longVar1 = longObj1.longValue();
        long longVar2 = longObj2;

        char charVar1 = charObj1.charValue();
        char charVar2 = charObj2;

        float floatVar1 = floatObj1.floatValue();
        float floatVar2 = floatObj2;

        double doubleVar1 = doubleObj1.doubleValue();
        double doubleVar2 = doubleObj2;
    }
}
