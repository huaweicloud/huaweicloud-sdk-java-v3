package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StatisticListInfoRequests
 */
public class StatisticListInfoRequests  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Long time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num")
    
    private Long num;

    public StatisticListInfoRequests withTime(Long time) {
        this.time = time;
        return this;
    }

    


    /**
     * 统计终止时间点
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    

    public StatisticListInfoRequests withNum(Long num) {
        this.num = num;
        return this;
    }

    


    /**
     * 统计计数
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticListInfoRequests statisticListInfoRequests = (StatisticListInfoRequests) o;
        return Objects.equals(this.time, statisticListInfoRequests.time) &&
            Objects.equals(this.num, statisticListInfoRequests.num);
    }
    @Override
    public int hashCode() {
        return Objects.hash(time, num);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticListInfoRequests {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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

