package com.twschool.practice.domain;

public class UserGameInfo {

    /**
     * 用户id
     */
    String userId;

    /**
     * 游戏答案
     */
    String answer;

    /**
     * 用户本次玩的次数
     */
    Integer count = 0;

    /**
     * 用户连续正确次数
     */
    Integer continuousRightCount = 0;

    /**
     * 积分
     */
    Integer integral = 0;

    /**
     * 额外积分
     */
    Integer extraIntegral = 0;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getContinuousRightCount() {
        return continuousRightCount;
    }

    public void setContinuousRightCount(Integer continuousRightCount) {
        this.continuousRightCount = continuousRightCount;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getExtraIntegral() {
        return extraIntegral;
    }

    public void setExtraIntegral(Integer extraIntegral) {
        this.extraIntegral = extraIntegral;
    }

    class History {
        Integer totalIntegral = 0;

        String time;

        public History(Integer totalIntegral, String time) {
            this.totalIntegral = totalIntegral;
            this.time = time;
        }

        public Integer getTotalIntegral() {
            return totalIntegral;
        }

        public void setTotalIntegral(Integer totalIntegral) {
            this.totalIntegral = totalIntegral;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
