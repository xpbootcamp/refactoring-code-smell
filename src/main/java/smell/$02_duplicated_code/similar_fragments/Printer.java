package smell.$02_duplicated_code.similar_fragments;

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
        stringBuilder.append("--------------- START --------------------");
        stringBuilder.append("\n");
        stringBuilder.append(first + second);
        stringBuilder.append("\n");
        stringBuilder.append("--------------- END --------------------");
    }

    public void printStringAndInt(String string, int number) {
        stringBuilder.append("--------------- START --------------------");
        stringBuilder.append("\n");
        stringBuilder.append(string + ": " + number);
        stringBuilder.append("\n");
        stringBuilder.append("--------------- END --------------------");
    }
}
