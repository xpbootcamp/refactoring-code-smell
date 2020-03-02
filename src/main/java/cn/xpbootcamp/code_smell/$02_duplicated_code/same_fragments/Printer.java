package cn.xpbootcamp.code_smell.$02_duplicated_code.same_fragments;

public class Printer {
    private final StringBuilder stringBuilder;

    public Printer(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void printString(String string) {
        stringBuilder.append("--------------- START --------------------");
        stringBuilder.append("\n");
        stringBuilder.append(string);
        stringBuilder.append("\n");
        stringBuilder.append("--------------- END --------------------");
    }

    public void printTwoStrings(String first, String second) {
        String string = first + second;
        stringBuilder.append("--------------- START --------------------");
        stringBuilder.append("\n");
        stringBuilder.append(string);
        stringBuilder.append("\n");
        stringBuilder.append("--------------- END --------------------");
    }

    public void printStringAndInt(String string, int number) {
        String combinedString = string + ": " + number;
        stringBuilder.append("--------------- START --------------------");
        stringBuilder.append("\n");
        stringBuilder.append(combinedString);
        stringBuilder.append("\n");
        stringBuilder.append("--------------- END --------------------");
    }
}
