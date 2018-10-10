package org.seckill.entity;

public class Prize {

    private int id;//奖品id
    private String prize_name;//奖品名称
    private int prize_amount;//奖品（剩余）数量
    private Double prize_weight;//奖品权重

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrize_name() {
        return prize_name;
    }

    public void setPrize_name(String prize_name) {
        this.prize_name = prize_name;
    }

    public int getPrize_amount() {
        return prize_amount;
    }

    public void setPrize_amount(int prize_amount) {
        this.prize_amount = prize_amount;
    }

    public Double getPrize_weight() {
        return prize_weight;
    }

    public void setPrize_weight(Double prize_weight) {
        this.prize_weight = prize_weight;
    }
}




