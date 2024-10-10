package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Point
 */
public class Point {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack")

    private Integer attack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic")

    private Integer basic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private Integer cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_custom")

    private Integer customCustom;

    public Point withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 时间戳
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Point withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 请求总量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Point withAttack(Integer attack) {
        this.attack = attack;
        return this;
    }

    /**
     * 攻击总量
     * @return attack
     */
    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Point withBasic(Integer basic) {
        this.basic = basic;
        return this;
    }

    /**
     * web基础防护
     * @return basic
     */
    public Integer getBasic() {
        return basic;
    }

    public void setBasic(Integer basic) {
        this.basic = basic;
    }

    public Point withCc(Integer cc) {
        this.cc = cc;
        return this;
    }

    /**
     * 频率控制
     * @return cc
     */
    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Point withCustomCustom(Integer customCustom) {
        this.customCustom = customCustom;
        return this;
    }

    /**
     * 精准防护
     * @return customCustom
     */
    public Integer getCustomCustom() {
        return customCustom;
    }

    public void setCustomCustom(Integer customCustom) {
        this.customCustom = customCustom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point that = (Point) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.total, that.total)
            && Objects.equals(this.attack, that.attack) && Objects.equals(this.basic, that.basic)
            && Objects.equals(this.cc, that.cc) && Objects.equals(this.customCustom, that.customCustom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, total, attack, basic, cc, customCustom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Point {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    customCustom: ").append(toIndentedString(customCustom)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
