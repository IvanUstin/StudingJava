package stringsAndBasicsOfTextProcessing.AnalyzerXML;

/*Напишите анализатор, позволяющий последовательно
 возвращать содержимое узлов xml-документа и его тип
 (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */
public class Main {
    public static void main(String[] args) {
        String xmlString = "<notes>\n" +
                "\n" +
                "   <note id = \"1\">\n" +
                "\n" +
                "       <to>Вася</to>\n" +
                "\n" +
                "       <from>Света</from>\n" +
                "\n" +
                "       <heading>Напоминание</heading>\n" +
                "\n" +
                "       <body>Позвони мне завтра!</body>\n" +
                "\n" +
                "   </note>\n" +
                "\n" +
                "   <note id = \"2\">\n" +
                "\n" +
                "       <to>Петя</to>\n" +
                "\n" +
                "       <from>Маша</from>\n" +
                "\n" +
                "       <heading>Важное напоминание</heading>\n" +
                "\n" +
                "       <body/>\n" +
                "\n" +
                "   </note>\n" +
                "\n" +
                "</notes>";
        AnalyzerMethods analyzer = new AnalyzerMethods();
        analyzer.analyze(xmlString);
        while (analyzer.sortKeys.size() > 0) {
            System.out.println(analyzer.nextElement());
        }
        System.out.println(analyzer.nextElement());
    }
}
