package com.studyjava.apex;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApexCompetitionEvent {
    String NAME;
    String TYPE;   //比赛类型
    String AREA;   //比赛区域
    String DATE;   //比赛时间
    String MAP;    //比赛地图
    String WINNER; //比赛结果
    int PRIZE;     //比赛奖金

    public String toString() {
        return "Apex Legends Global Series（ALGS）" +
                "\n比赛名称：" + NAME +
                "\n比赛类型：" + TYPE +
                "\n比赛区域：" + AREA +
                "\n比赛时间：" + DATE +
                "\n比赛地图：" + MAP +
                "\n比赛结果：" + WINNER +
                "\n比赛奖金：" + PRIZE;
    }
}
