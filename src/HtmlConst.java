/**
 * Created by nafanya on 5/4/16.
 */
public class HtmlConst {
    private static final String DOCBEGIN =
            "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "\n" +
                    "  <!-- Basic Page Needs\n" +
                    "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                    "  <meta charset=\"utf-8\">\n" +
                    "  <title>%s</title>\n" +
                    "  <meta name=\"description\" content=\"%s\">\n" +
                    "  <meta name=\"author\" content=\"%s\">\n" +
                    "\n" +
                    "  <!-- Mobile Specific Metas\n" +
                    "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "\n" +
                    "  <!-- FONT\n" +
                    "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                    "  <link href=\"//fonts.googleapis.com/css?family=Raleway:400,300,600\" rel=\"stylesheet\" type=\"text/css\">\n" +
                    "\n" +
                    "  <!-- CSS\n" +
                    "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                    "  <link rel=\"stylesheet\" href=\"css/normalize.css\">\n" +
                    "  <link rel=\"stylesheet\" href=\"css/skeleton.css\">\n" +
                    "  <link rel=\"stylesheet\" href=\"css/custom.css\">\n" +
                    "\n" +
                    "  <!-- Favicon\n" +
                    "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                    "  <link rel=\"icon\" type=\"image/png\" href=\"images/favicon.png\">\n" +
                    "\n" +
                    "  <script type=\"text/x-mathjax-config\">\n" +
                    "    MathJax.Hub.Config({tex2jax: {inlineMath: [['$','$']]}});\n" +
                    "  </script>\n" +
                    "  <script type=\"text/javascript\" async src=\"https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-MML-AM_CHTML\"></script>\n" +
                    "\n" +
                    "</head>\n" +
                    "<body>" +
                    "  <!-- Primary Page Layout\n" +
                    "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                    "  <div class=\"container\">\n" +
                    "    <section class=\"header\">\n" +
                    "      <h2 class=\"title\">%s</h2>\n" +
                    "      <h5>%s</h5>\n" +
                    "    </section>\n";

    public static String getDocumentStart(String title, String description, String author) {
        return String.format(DOCBEGIN, title, description, author, title, author);
    }


    public static String getDocumentEnd() {
        return "<!-- End Document\n" +
                "  –––––––––––––––––––––––––––––––––––––––––––––––––– -->\n" +
                "</body>\n" +
                "</html>";
    }
}
