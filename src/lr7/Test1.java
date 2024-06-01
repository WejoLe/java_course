package lr7;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
public class Test1 {
        private static String str1Color="";
        private static final int NUM_RINGS = 0;
        private static final int RING_WIDTH = 0;

        public static void main(String[] args) {

            SuperClasT str11 = new SuperClasT(" (Передал в конструктор:) ");
            SubClasT str1 = new SubClasT(str11, " Передал в конструктор подкласса: ", " Где 2 параметра: ");
            str1Color = String.valueOf(str1);

            SwingUtilities.invokeLater(GradientText::createAndShowGui);

            System.out.println(str1);

        }

        private static void createAndShowGui() {
        }

        private static String str1;
        private static String str2;
        private static String str3;
        private static String str4;
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";

        public static class SuperClasT {
            SuperClasT(String str11) {
                str1 = str11;

                System.out.println("Запись в: " + this.getClass().getSimpleName() + " -> " + str1);


            }


            @Override
            public String toString() {
                String sCAFV;

                sCAFV = "SUP наименование класса: " + this.getClass().getSimpleName() + " 1S !" + str1;
                return sCAFV;
            }

            public String geS1() {

                return str1;
            }


        }

        public static class SubClasT extends SuperClasT {

            SubClasT(SuperClasT str11, String str22, String str33) {
                super(String.valueOf(str11));
                str2 = str22;
                str3 = str33;


            }

            @Override
            public String toString() {


                String s = str1;
                String s1 = s.substring(s.indexOf("(") + 1);
                s1.trim();
                String str = s1;
                str = str.replaceAll("[)]", "");

                String CNAFIV = ANSI_GREEN + "\n SUB наименование класса: " +ANSI_BLUE+ this.getClass().getSimpleName() + ANSI_GREEN+"\n Наследование с " +ANSI_BLUE+ this.geS1() +ANSI_PURPLE+ "\n Str1:  " + str + "\n Str2: " + str2 + "\n Str3: " + str3;

                return CNAFIV;

            }

        }

        public static class GradientText extends JPanel {
            private static final int PREF_W = 1600;
            private static final int PREF_H = 200;
            private static final Font FONT = new Font(Font.DIALOG, Font.BOLD, 46);
            private static final String TEXT = str1 ;
            private static final int COLOR_COUNT = 30;
            private static final Color BG = Color.BLACK;
            private Paint myPaint;

            public GradientText() {
                setBackground(BG);
                setPreferredSize(new Dimension(PREF_W, PREF_H));
                float[] fractions = new float[COLOR_COUNT];
                Color[] colors = new Color[COLOR_COUNT];
                for (int i = 0; i < colors.length; i++) {
                    fractions[i] = ((float) i) / COLOR_COUNT;
                    float hue = fractions[i];
                    colors[i] = Color.getHSBColor(hue, 1f, 1f);
                }
                myPaint = new LinearGradientPaint(0, 0, PREF_W, 0, fractions, colors);
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setPaint(myPaint);
                g2.setFont(FONT);
                g2.drawString(TEXT, 2, 100);
            }

            private static void createAndShowGui() {
                GradientText mainPanel = new GradientText();

                JFrame frame = new JFrame("GradientText");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(mainPanel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        }
}
