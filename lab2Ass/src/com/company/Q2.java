package com.company;
//Q2--->sheet3--->Question3//
public class Q2 {
    public int m = 0, h = 0, D = 1, M = 1, Y = 2000;
    public String state = "NORMAL", state1 = "TIME";

    public void press(char in) {
        if (state.equals("NORMAL")) {
            if (in == 'c') {
                state1 = "min";
                state = "UPDATE";

            }
            if (in == 'b') {
                state1 = "Alarm";
                state = "ALARM";

            }
            if (in == 'a') {
                if (state1.equals("TIME")) {
                    state1 = "DATE";

                } else {
                    state1 = "TIME";
                }
            }

        }
        if (state.equals("ALARM")) {
            if (in == 'd') {
                state1 = "TIME";
                state = "NORMAL";

            }
            if (in== 'a') {
                state1 = "Chime";
            }
        }
        if (state.equals("UPDATE")) {
            if (in== 'd') {
                state1 = "TIME";
                state = "NORMAL";

            }
            if (in == 'a') {
                if (state1.equals("year")) {
                    state1 = "TIME";
                    state = "NORMAL";

                }
                if (state1.equals("month")) {
                    state1 = "year";
                }
                if (state1.equals("day")) {
                    state1 = "month";
                }
                if (state1.equals("hour")) {
                    state1 = "day";
                }
                if (state1.equals("min")) {
                    state1 = "hour";
                }
            }
            if (in== 'b') {
                if (state1.equals("min")) {
                    m++;
                    if (m>=60) {
                        m=0;
                    }
                }
                if (state1.equals("hour")) {
                    h++;
                    if (h>=24) {
                        h=0;
                    }
                }
                if (state1.equals("day")) {
                    D++;
                    if (D>31) {
                        D=1;
                    }
                }
                if (state1.equals("month")) {
                    M++;
                    if (M>12) {
                        M=1;
                    }
                }
                if (state1.equals("year")) {
                    Y++;
                    if(Y>2100){
                        Y=2000;
                    }

                }
            }

        }

    }
    public String getTime(){
        return (h+":"+m);
    }
    public String getDate(){
        return (Y+"-"+M+"-"+D);
    }
    public String getState(){
        return(state+","+state1);
    }


}
