package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ReplyRatesIntervals;
import com.huaweicloud.sdk.cbs.v1.model.ReplyRatesTotal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CollectReplyRatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    
    private String interval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    
    private String timeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private ReplyRatesTotal total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="intervals")
    
    
    private ReplyRatesIntervals intervals;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startutc")
    
    
    private Long startutc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endutc")
    
    
    private Long endutc;

    public CollectReplyRatesResponse withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * 统计周期目前支持year、month、week、day。 调用失败时无此字段。
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    

    public CollectReplyRatesResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 所在时区，例如：中国东八区为\"+08:00\"；美国西五区为\"-05:00\";默认为\"UTC\"。 调用失败时无此字段。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    

    public CollectReplyRatesResponse withTotal(ReplyRatesTotal total) {
        this.total = total;
        return this;
    }

    public CollectReplyRatesResponse withTotal(Consumer<ReplyRatesTotal> totalSetter) {
        if(this.total == null ){
            this.total = new ReplyRatesTotal();
            totalSetter.accept(this.total);
        }
        
        return this;
    }


    /**
     * Get total
     * @return total
     */
    public ReplyRatesTotal getTotal() {
        return total;
    }

    public void setTotal(ReplyRatesTotal total) {
        this.total = total;
    }

    

    public CollectReplyRatesResponse withIntervals(ReplyRatesIntervals intervals) {
        this.intervals = intervals;
        return this;
    }

    public CollectReplyRatesResponse withIntervals(Consumer<ReplyRatesIntervals> intervalsSetter) {
        if(this.intervals == null ){
            this.intervals = new ReplyRatesIntervals();
            intervalsSetter.accept(this.intervals);
        }
        
        return this;
    }


    /**
     * Get intervals
     * @return intervals
     */
    public ReplyRatesIntervals getIntervals() {
        return intervals;
    }

    public void setIntervals(ReplyRatesIntervals intervals) {
        this.intervals = intervals;
    }

    

    public CollectReplyRatesResponse withStartutc(Long startutc) {
        this.startutc = startutc;
        return this;
    }

    


    /**
     * 统计开始的utc时间。
     * @return startutc
     */
    public Long getStartutc() {
        return startutc;
    }

    public void setStartutc(Long startutc) {
        this.startutc = startutc;
    }

    

    public CollectReplyRatesResponse withEndutc(Long endutc) {
        this.endutc = endutc;
        return this;
    }

    


    /**
     * 统计结束的utc时间。
     * @return endutc
     */
    public Long getEndutc() {
        return endutc;
    }

    public void setEndutc(Long endutc) {
        this.endutc = endutc;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectReplyRatesResponse collectReplyRatesResponse = (CollectReplyRatesResponse) o;
        return Objects.equals(this.interval, collectReplyRatesResponse.interval) &&
            Objects.equals(this.timeZone, collectReplyRatesResponse.timeZone) &&
            Objects.equals(this.total, collectReplyRatesResponse.total) &&
            Objects.equals(this.intervals, collectReplyRatesResponse.intervals) &&
            Objects.equals(this.startutc, collectReplyRatesResponse.startutc) &&
            Objects.equals(this.endutc, collectReplyRatesResponse.endutc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(interval, timeZone, total, intervals, startutc, endutc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectReplyRatesResponse {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
        sb.append("    startutc: ").append(toIndentedString(startutc)).append("\n");
        sb.append("    endutc: ").append(toIndentedString(endutc)).append("\n");
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

