package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询同步任务统计结果
 */
public class StatisticData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stamp")

    private Long timeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_num")

    private Long statisticNum;

    public StatisticData withTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * 统计时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return timeStamp
     */
    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public StatisticData withStatisticNum(Long statisticNum) {
        this.statisticNum = statisticNum;
        return this;
    }

    /**
     * 统计数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return statisticNum
     */
    public Long getStatisticNum() {
        return statisticNum;
    }

    public void setStatisticNum(Long statisticNum) {
        this.statisticNum = statisticNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticData that = (StatisticData) obj;
        return Objects.equals(this.timeStamp, that.timeStamp) && Objects.equals(this.statisticNum, that.statisticNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeStamp, statisticNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticData {\n");
        sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
        sb.append("    statisticNum: ").append(toIndentedString(statisticNum)).append("\n");
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
