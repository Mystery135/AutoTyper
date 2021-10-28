package com.websiteofgames.AutoTyper;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static boolean start;

    Main() throws AWTException, InterruptedException, IOException {


    Robot robot = new Robot();

    Timer timer = new Timer();
    TimerTask timerTask =new TimerTask() {
        int time = 3;
        @Override
        public void run() {
            if (time > 0) {

                System.out.println(time);
                Frame.timeUntilStart.setBounds(300, 500,1000,50);
                Frame.timeUntilStart.setText("AutoTyper Starting In " + (time));
                time--;
            } else {
                System.out.println("AutoTyper Enabled");

                Frame.timeUntilStart.setBounds(357, 500,1000,50);
                Frame.timeUntilStart.setText("Started!");
                time--;
            }


            if (time < 0) {

                timer.cancel();


                FileWriter writer = null;
                try {
                    writer = new FileWriter(String.valueOf(getClass().getResourceAsStream("autotyper.txt")));
                } catch (IOException e) {
                    e.printStackTrace();
                }


                String toType =
                        Frame.toType.getText();

                System.out.println("Typing: "  + toType);

                try {
                    writer.write(toType);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                char typeOutChar[];
                String typeOut = "";


    int timesToPaste = Integer.parseInt(Frame.timestopaste.getText());


                for(int q = 0; q<timesToPaste; q++){
                    File file = new File((String.valueOf(getClass().getResourceAsStream("autotyper.txt"))));
                    Scanner scan = null;
                    try {
                        scan = new Scanner(file);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    while (scan.hasNextLine()){


                        typeOut = "";
                        typeOut += scan.nextLine();
                        typeOutChar =  typeOut.toCharArray();


                        for (int i = 0; i< typeOutChar.length; i++) {
                            int keyCode = KeyEvent.getExtendedKeyCodeForChar(typeOutChar[i]);

if (keyCode == KeyEvent.CHAR_UNDEFINED){

    Frame.timeUntilStart.setText("AutoTyper Failed! Key code not found for character " + typeOutChar[i]);
    throw new RuntimeException("Key code not found for character '" + typeOutChar[i] + "'");
}else   {



    switch (typeOutChar[i]){



        case '!':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_1);
            break;


        case '@':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_2);
            break;
        case '#':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_3);
            break;
        case '$':

            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_4);
            break;
        case '%':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_5);
            break;
        case '^':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_6);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_6);
            break;
        case '&':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_7);
            break;

        case '*':

            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_8);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_8);
            break;
        case '(':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_9);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_9);
            break;
        case ')':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_0);
            break;
        case 'Q':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_Q);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_Q);
            break;
        case 'W':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_W);
            break;
        case 'E':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_E);
            break;
        case 'R':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_R);
            break;
        case 'T':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_T);
            break;
        case 'Y':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_Y);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_Y);
            break;
        case 'U':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_U);
            break;
        case 'I':

            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_I);
            break;
        case 'O':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_O);
            break;
        case 'P':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_P);
            break;
        case '{':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
            break;
        case '}':

            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
            break;
        case '|':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_BACK_SLASH);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_BACK_SLASH);
            break;
        case 'A':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_A);
            break;
        case 'S':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_S);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_S);
            break;
        case 'D':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_D);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_D);
            break;
        case 'F':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_F);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_F);
            break;
        case 'G':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_G);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_G);
            break;
        case 'H':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_H);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_H);
            break;
        case 'J':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_J);

            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_J);
            break;
        case 'K':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_K);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_K);
            break;
        case 'L':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_L);
            break;
        case ':':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_SEMICOLON);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_SEMICOLON);
            break;
        case '"':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_QUOTE);


            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_QUOTE);
            break;
        case 'Z':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_Z);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_Z);
            break;
        case 'X':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_X);
            break;
        case 'C':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_C);
            break;
        case 'V':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_V);
            break;
        case 'B':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_B);
            break;
        case 'N':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_N);
            break;
        case 'M':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_M);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_M);
            break;
        case '<':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_COMMA);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_COMMA);
            break;
        case '>':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_PERIOD);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_PERIOD);
            break;
        case '?':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_SLASH);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_SLASH);
            break;
        case '_':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_MINUS);
            break;
        case '+':
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_EQUALS);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_EQUALS);
            break;
        default:
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
    }
}



                            try {
                               int timebetweenlettertypes = Integer.parseInt(Frame.timebetweenlettertypes.getText());

                                Thread.sleep(timebetweenlettertypes);
                            } catch (InterruptedException e) {
                                e.printStackTrace();

                            }


                        }
                        System.out.println(typeOutChar);

                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);


                        try {
                            int timeBetweenPastes =    Integer.parseInt(Frame.timebetweenpastes.getText());

                            Thread.sleep(timeBetweenPastes);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }



                }
                Frame.timeUntilStart.setBounds(355, 500,1000,50);
                Frame.timeUntilStart.setText("Finished!");
                System.out.println("Finished!");



            }

        }
        };
    timer.scheduleAtFixedRate(timerTask, 0, 1000);




}









    public static void main(String[] args) throws IOException {




new Frame();






    }
}
