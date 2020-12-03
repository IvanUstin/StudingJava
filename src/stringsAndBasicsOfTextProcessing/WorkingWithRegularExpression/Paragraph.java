package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

public class Paragraph implements Comparable<Paragraph> {
    private int sentencesQuantity;
    private String content;

    public Paragraph() {
    }

    public Paragraph (int sentencesQuantity, String content) {
        this.sentencesQuantity = sentencesQuantity;
        this.content = content;
    }

    public Paragraph (String content) {
        this(StringAuxiliaryMethods.quantityOfSentences(content),content);
    }

    public int getSentencesQuantity() {
        return sentencesQuantity;
    }

    public void setSentencesQuantity(int sentencesQuantity) {
        this.sentencesQuantity = sentencesQuantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int compareTo (Paragraph paragraph) {
        return Integer.compare(this.sentencesQuantity, paragraph.getSentencesQuantity());
    }

    public String toString () {
//        return String.valueOf(sentencesQuantity);
        return content;
    }

}
