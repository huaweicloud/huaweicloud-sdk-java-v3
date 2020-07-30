package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DailySummary
 */
public class DailySummary  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Float duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_count")
    
    private Long taskCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="date")
    
    private String date;

    public DailySummary withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 转码源文件时长，单位：分钟，精确到小数点后两位。 
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public DailySummary withTaskCount(Long taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    


    /**
     * 任务数
     * minimum: 0
     * maximum: 2147483647
     * @return taskCount
     */
    public Long getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Long taskCount) {
        this.taskCount = taskCount;
    }

    public DailySummary withDate(String date) {
        this.date = date;
        return this;
    }

    


    /**
     * 日期,格式样例：2018/03/01. 
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DailySummary dailySummary = (DailySummary) o;
        return Objects.equals(this.duration, dailySummary.duration) &&
            Objects.equals(this.taskCount, dailySummary.taskCount) &&
            Objects.equals(this.date, dailySummary.date);
    }
    @Override
    public int hashCode() {
        return Objects.hash(duration, taskCount, date);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailySummary {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

