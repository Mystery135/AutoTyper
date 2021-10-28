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



                            switch (keyCode){
                                case KeyEvent.CHAR_UNDEFINED:

                                    Frame.timeUntilStart.setText("AutoTyper Failed! Key code not found for character " + typeOutChar[i]);
                                    throw new RuntimeException("Key code not found for character '" + typeOutChar[i] + "'");
                                    break;



                                case KeyEvent.VK_EXCLAMATION_MARK:
                                    robot.keyPress(KeyEvent.VK_SHIFT);
                                    robot.keyPress(KeyEvent.VK_1);
                                    robot.keyRelease(KeyEvent.VK_SHIFT);
                                    robot.keyRelease(KeyEvent.VK_1);
                                    break;



                            }




                             if (KeyEvent.VK_AT == keyCode){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_2);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_2);


                            }
                            else if (KeyEvent.VK_NUMBER_SIGN == keyCode){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_3);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_3);


                            }
                            else if (KeyEvent.VK_DOLLAR == keyCode){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_4);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_4);


                            }

                            else if (typeOutChar[i] == '%'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_5);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_5);


                            }

                            else if (typeOutChar[i] == '^'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_6);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_6);


                            }

                            else if (typeOutChar[i] == '&'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_7);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_7);


                            }
                            else if (typeOutChar[i] == '*'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_8);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_8);


                            }
                            else if (typeOutChar[i] == '('){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_9);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_9);


                            }
                            else if (typeOutChar[i] == ')'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_0);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_0);


                            }
                            else if (typeOutChar[i] == 'Q'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_Q);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_Q);


                            }
                            else if (typeOutChar[i] == 'W'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_W);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_W);


                            }
                            else if (typeOutChar[i] == 'E'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_E);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_E);


                            }
                            else if (typeOutChar[i] == 'R'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_R);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_R);


                            }
                            else if (typeOutChar[i] == 'T'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_T);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_T);


                            }
                            else if (typeOutChar[i] == 'Y'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_Y);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_Y);


                            }
                            else if (typeOutChar[i] == 'U'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_U);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_U);


                            }
                            else if (typeOutChar[i] == 'I'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_I);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_I);


                            }
                            else if (typeOutChar[i] == 'O'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_O);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_O);


                            }
                            else if (typeOutChar[i] == 'P'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_P);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_P);


                            }
                            else if (typeOutChar[i] == '{'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);


                            }
                            else if (typeOutChar[i] == '}'){

                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);


                            }
                            else if (typeOutChar[i] == '|'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_BACK_SLASH);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_BACK_SLASH);


                            }
                            else if (typeOutChar[i] == 'A'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_A);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_A);


                            }
                            else if (typeOutChar[i] == 'S'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_S);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_S);


                            }
                            else if (typeOutChar[i] == 'D'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_D);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_D);


                            }
                            else if (typeOutChar[i] == 'F'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_F);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_F);


                            }

                            else if (typeOutChar[i] == 'G'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_G);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_G);


                            }
                            else if (typeOutChar[i] == 'H'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_H);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_H);


                            }
                            else if (typeOutChar[i] == 'J'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_J);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_J);


                            }
                            else if (typeOutChar[i] == 'K'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_K);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_K);


                            }
                            else if (typeOutChar[i] == 'L'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_L);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_L);


                            }
                            else if (typeOutChar[i] == ':'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_SEMICOLON);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_SEMICOLON);


                            }
                            else if (typeOutChar[i] == '"'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_QUOTE);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_QUOTE);


                            }
                            else if (typeOutChar[i] == 'Z'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_Z);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_Z);


                            }
                            else if (typeOutChar[i] == 'X'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_X);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_X);


                            }
                            else if (typeOutChar[i] == 'C'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_C);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_C);


                            }
                            else if (typeOutChar[i] == 'V'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_V);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_V);


                            }
                            else if (typeOutChar[i] == 'B'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_B);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_B);


                            }
                            else if (typeOutChar[i] == 'N'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_N);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_N);


                            }
                            else if (typeOutChar[i] == 'M'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_M);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_M);


                            }
                            else if (typeOutChar[i] == '<'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_COMMA);



                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_COMMA);


                            }
                            else if (typeOutChar[i] == '>'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_PERIOD);



                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_PERIOD);


                            }
                            else if (typeOutChar[i] == '?'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_SLASH);


                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_SLASH);


                            }
                            else if (typeOutChar[i] == '_'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_MINUS);



                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_MINUS);


                            }
                            else if (typeOutChar[i] == '+'){
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_EQUALS);

                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                robot.keyRelease(KeyEvent.VK_EQUALS);


                            }
//                            else {
//System.out.println(keyCode);
//                                robot.keyPress(keyCode);
//
//                                robot.keyRelease(keyCode);
//
//                            }


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
