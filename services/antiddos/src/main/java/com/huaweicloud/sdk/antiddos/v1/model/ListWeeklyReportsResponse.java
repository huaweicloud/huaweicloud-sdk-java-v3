package com.huaweicloud.sdk.antiddos.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.antiddos.v1.model.WeeklyCount;
import com.huaweicloud.sdk.antiddos.v1.model.WeeklyTop10;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListWeeklyReportsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ddos_intercept_times")
    
    private Integer ddosInterceptTimes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weekdata")
    
    private List<WeeklyCount> weekdata = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top10")
    
    private List<WeeklyTop10> top10 = null;
    
    public ListWeeklyReportsResponse withDdosInterceptTimes(Integer ddosInterceptTimes) {
        this.ddosInterceptTimes = ddosInterceptTimes;
        return this;
    }

    


    /**
     * 一周内DDoS拦截次数
     * @return ddosInterceptTimes
     */
    public Integer getDdosInterceptTimes() {
        return ddosInterceptTimes;
    }

    public void setDdosInterceptTimes(Integer ddosInterceptTimes) {
        this.ddosInterceptTimes = ddosInterceptTimes;
    }

    public ListWeeklyReportsResponse withWeekdata(List<WeeklyCount> weekdata) {
        this.weekdata = weekdata;
        return this;
    }

    
    public ListWeeklyReportsResponse addWeekdataItem(WeeklyCount weekdataItem) {
        if (this.weekdata == null) {
            this.weekdata = new ArrayList<>();
        }
        this.weekdata.add(weekdataItem);
        return this;
    }

    public ListWeeklyReportsResponse withWeekdata(Consumer<List<WeeklyCount>> weekdataSetter) {
        if(this.weekdata == null ){
            this.weekdata = new ArrayList<>();
        }
        weekdataSetter.accept(this.weekdata);
        return this;
    }

    /**
     * 一周的攻击次数统计数据
     * @return weekdata
     */
    public List<WeeklyCount> getWeekdata() {
        return weekdata;
    }

    public void setWeekdata(List<WeeklyCount> weekdata) {
        this.weekdata = weekdata;
    }

    public ListWeeklyReportsResponse withTop10(List<WeeklyTop10> top10) {
        this.top10 = top10;
        return this;
    }

    
    public ListWeeklyReportsResponse addTop10Item(WeeklyTop10 top10Item) {
        if (this.top10 == null) {
            this.top10 = new ArrayList<>();
        }
        this.top10.add(top10Item);
        return this;
    }

    public ListWeeklyReportsResponse withTop10(Consumer<List<WeeklyTop10>> top10Setter) {
        if(this.top10 == null ){
            this.top10 = new ArrayList<>();
        }
        top10Setter.accept(this.top10);
        return this;
    }

    /**
     * 被攻击次数排名前10的IP地址
     * @return top10
     */
    public List<WeeklyTop10> getTop10() {
        return top10;
    }

    public void setTop10(List<WeeklyTop10> top10) {
        this.top10 = top10;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWeeklyReportsResponse listWeeklyReportsResponse = (ListWeeklyReportsResponse) o;
        return Objects.equals(this.ddosInterceptTimes, listWeeklyReportsResponse.ddosInterceptTimes) &&
            Objects.equals(this.weekdata, listWeeklyReportsResponse.weekdata) &&
            Objects.equals(this.top10, listWeeklyReportsResponse.top10);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ddosInterceptTimes, weekdata, top10);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWeeklyReportsResponse {\n");
        sb.append("    ddosInterceptTimes: ").append(toIndentedString(ddosInterceptTimes)).append("\n");
        sb.append("    weekdata: ").append(toIndentedString(weekdata)).append("\n");
        sb.append("    top10: ").append(toIndentedString(top10)).append("\n");
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

