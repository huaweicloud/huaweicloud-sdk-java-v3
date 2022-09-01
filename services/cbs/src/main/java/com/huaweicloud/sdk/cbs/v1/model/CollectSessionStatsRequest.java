package com.huaweicloud.sdk.cbs.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CollectSessionStatsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_id")
    
    @JacksonXmlProperty(localName = "qabot_id")
    
    private String qabotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    @JacksonXmlProperty(localName = "start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    @JacksonXmlProperty(localName = "end_time")
    
    private String endTime;
    /**
     * 统计周期目前支持month,week,day。
     */
    public static final class IntervalEnum {

        
        /**
         * Enum MONTH for value: "month"
         */
        public static final IntervalEnum MONTH = new IntervalEnum("month");
        
        /**
         * Enum WEEK for value: "week"
         */
        public static final IntervalEnum WEEK = new IntervalEnum("week");
        
        /**
         * Enum DAY for value: "day"
         */
        public static final IntervalEnum DAY = new IntervalEnum("day");
        

        private static final Map<String, IntervalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IntervalEnum> createStaticFields() {
            Map<String, IntervalEnum> map = new HashMap<>();
            map.put("month", MONTH);
            map.put("week", WEEK);
            map.put("day", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IntervalEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IntervalEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IntervalEnum(value);
            }
            return result;
        }

        public static IntervalEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IntervalEnum) {
                return this.value.equals(((IntervalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    @JacksonXmlProperty(localName = "interval")
    
    private IntervalEnum interval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    @JacksonXmlProperty(localName = "time_zone")
    
    private String timeZone;

    public CollectSessionStatsRequest withQabotId(String qabotId) {
        this.qabotId = qabotId;
        return this;
    }

    


    /**
     * qabot编号，UUID格式。
     * @return qabotId
     */
    public String getQabotId() {
        return qabotId;
    }

    public void setQabotId(String qabotId) {
        this.qabotId = qabotId;
    }

    

    public CollectSessionStatsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 查询的起始时间，long，UTC时间，默认值为0。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public CollectSessionStatsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 查询的结束时间，long，UTC时间，默认值为当前时间的毫秒数。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public CollectSessionStatsRequest withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * 统计周期目前支持month,week,day。
     * @return interval
     */
    public IntervalEnum getInterval() {
        return interval;
    }

    public void setInterval(IntervalEnum interval) {
        this.interval = interval;
    }

    

    public CollectSessionStatsRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 请求所在时区，例如：中国东八区为\"+08:00\"；美国西五区为\"-05:00\"；默认为\"UTC\"。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectSessionStatsRequest collectSessionStatsRequest = (CollectSessionStatsRequest) o;
        return Objects.equals(this.qabotId, collectSessionStatsRequest.qabotId) &&
            Objects.equals(this.startTime, collectSessionStatsRequest.startTime) &&
            Objects.equals(this.endTime, collectSessionStatsRequest.endTime) &&
            Objects.equals(this.interval, collectSessionStatsRequest.interval) &&
            Objects.equals(this.timeZone, collectSessionStatsRequest.timeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qabotId, startTime, endTime, interval, timeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectSessionStatsRequest {\n");
        sb.append("    qabotId: ").append(toIndentedString(qabotId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

