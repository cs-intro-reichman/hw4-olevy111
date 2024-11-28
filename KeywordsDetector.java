public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        for (int i=0; i<sentences.length; i++)
        {
            for (int j=0; j<keywords.length; j++)
            {
                if (isContains(sentences[i], keywords[j])==true)
                {
                    System.out.println(sentences[i]);
                }
            }
        }
    }

    public static boolean isContains(String str1, String str2) {   
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i=0; i<=(str1.length()- str2.length()); i++)
        {
            int j;
            for (j=0; j<str2.length(); j++)
            {
                if (str1.charAt(i+j)!=str2.charAt(j))
                {
                 break;
                }
            }
        
        if (j == str2.length())
                {
                return true;
                }
            }       
        return false;

}
}
