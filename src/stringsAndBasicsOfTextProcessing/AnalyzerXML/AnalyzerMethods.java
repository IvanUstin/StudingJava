package stringsAndBasicsOfTextProcessing.AnalyzerXML;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyzerMethods {

    public static final String OPEN_TAG = "<.+?>";
    public static final String CLOSE_TAG = "</.+?>";
    public static final String ONE_TAG = "<.+?/>";
    public static final String CONTENT = "(?<=>).*?(?=<)";

    public Map<Integer, String> elements = new HashMap<>();
    public Set<Integer> keys = new HashSet<>();
    public List<Integer> sortKeys = new ArrayList<>();

    public void analyze (String string) {
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(OPEN_TAG);
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            keys.add(matcher.start());
            elements.put(matcher.start(),matcher.group() + " is open tag.");
        }
        pattern = Pattern.compile(CLOSE_TAG);
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            keys.add(matcher.start());
            elements.put(matcher.start(), matcher.group() + " is close tag.");
        }
        pattern = Pattern.compile(ONE_TAG);
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            keys.add(matcher.start());
            elements.put(matcher.start(),matcher.group() + " is solo tag.");
        }
        pattern = Pattern.compile(CONTENT);
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            keys.add(matcher.start());
            elements.put(matcher.start(), matcher.group() + " is text.");
        }
        sortKeys.addAll(keys);
        Collections.sort(sortKeys);
    }

    public String nextElement () {
        return sortKeys.size() == 0 ? "NO MORE ELEMENTS." : elements.get(sortKeys.remove(0));
    }
}
