package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 限制迁移速度请求体 */
public class SpeedLimitInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin")

    private String begin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private String end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private String speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_utc")

    private Boolean isUtc;

    public SpeedLimitInfo withBegin(String begin) {
        this.begin = begin;
        return this;
    }

    /** 开始限速时间, 此时间为UTC时间，开始时间为整时，若有分钟，则会忽略，格式为hh:mm，小时数为两位，例如：01:00。
     * 
     * @return begin */
    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public SpeedLimitInfo withEnd(String end) {
        this.end = end;
        return this;
    }

    /** 结束时间,此时间为UTC时间,输入必须为59分结尾，格式为hh:mm，小时数为两位，例如：05:59。
     * 
     * @return end */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public SpeedLimitInfo withSpeed(String speed) {
        this.speed = speed;
        return this;
    }

    /** 限速，取值范围为1~9999 ,单位为MB/s
     * 
     * @return speed */
    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public SpeedLimitInfo withIsUtc(Boolean isUtc) {
        this.isUtc = isUtc;
        return this;
    }

    /** 是否为UTC时间
     * 
     * @return isUtc */
    public Boolean getIsUtc() {
        return isUtc;
    }

    public void setIsUtc(Boolean isUtc) {
        this.isUtc = isUtc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpeedLimitInfo speedLimitInfo = (SpeedLimitInfo) o;
        return Objects.equals(this.begin, speedLimitInfo.begin) && Objects.equals(this.end, speedLimitInfo.end)
            && Objects.equals(this.speed, speedLimitInfo.speed) && Objects.equals(this.isUtc, speedLimitInfo.isUtc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end, speed, isUtc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpeedLimitInfo {\n");
        sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    isUtc: ").append(toIndentedString(isUtc)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
