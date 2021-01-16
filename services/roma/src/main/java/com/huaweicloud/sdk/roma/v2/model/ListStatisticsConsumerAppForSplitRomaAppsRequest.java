package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListStatisticsConsumerAppForSplitRomaAppsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consumer_app_id")
    
    private String consumerAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_ids")
    
    private String romaAppIds;
    /**
     * Gets or Sets cycle
     */
    public static final class CycleEnum {

        
        /**
         * Enum MINUTE for value: "minute"
         */
        public static final CycleEnum MINUTE = new CycleEnum("minute");
        
        /**
         * Enum HOUR for value: "hour"
         */
        public static final CycleEnum HOUR = new CycleEnum("hour");
        
        /**
         * Enum DAY for value: "day"
         */
        public static final CycleEnum DAY = new CycleEnum("day");
        

        private static final Map<String, CycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CycleEnum> createStaticFields() {
            Map<String, CycleEnum> map = new HashMap<>();
            map.put("minute", MINUTE);
            map.put("hour", HOUR);
            map.put("day", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CycleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CycleEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CycleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CycleEnum(value);
            }
            return result;
        }

        public static CycleEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CycleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CycleEnum) {
                return this.value.equals(((CycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cycle")
    
    private CycleEnum cycle = CycleEnum.MINUTE;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private String duration;

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withConsumerAppId(String consumerAppId) {
        this.consumerAppId = consumerAppId;
        return this;
    }

    


    /**
     * Get consumerAppId
     * @return consumerAppId
     */
    public String getConsumerAppId() {
        return consumerAppId;
    }

    public void setConsumerAppId(String consumerAppId) {
        this.consumerAppId = consumerAppId;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withRomaAppIds(String romaAppIds) {
        this.romaAppIds = romaAppIds;
        return this;
    }

    


    /**
     * Get romaAppIds
     * @return romaAppIds
     */
    public String getRomaAppIds() {
        return romaAppIds;
    }

    public void setRomaAppIds(String romaAppIds) {
        this.romaAppIds = romaAppIds;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withCycle(CycleEnum cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * Get cycle
     * @return cycle
     */
    public CycleEnum getCycle() {
        return cycle;
    }

    public void setCycle(CycleEnum cycle) {
        this.cycle = cycle;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListStatisticsConsumerAppForSplitRomaAppsRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * Get duration
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatisticsConsumerAppForSplitRomaAppsRequest listStatisticsConsumerAppForSplitRomaAppsRequest = (ListStatisticsConsumerAppForSplitRomaAppsRequest) o;
        return Objects.equals(this.instanceId, listStatisticsConsumerAppForSplitRomaAppsRequest.instanceId) &&
            Objects.equals(this.consumerAppId, listStatisticsConsumerAppForSplitRomaAppsRequest.consumerAppId) &&
            Objects.equals(this.romaAppIds, listStatisticsConsumerAppForSplitRomaAppsRequest.romaAppIds) &&
            Objects.equals(this.cycle, listStatisticsConsumerAppForSplitRomaAppsRequest.cycle) &&
            Objects.equals(this.startTime, listStatisticsConsumerAppForSplitRomaAppsRequest.startTime) &&
            Objects.equals(this.endTime, listStatisticsConsumerAppForSplitRomaAppsRequest.endTime) &&
            Objects.equals(this.duration, listStatisticsConsumerAppForSplitRomaAppsRequest.duration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, consumerAppId, romaAppIds, cycle, startTime, endTime, duration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsConsumerAppForSplitRomaAppsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    consumerAppId: ").append(toIndentedString(consumerAppId)).append("\n");
        sb.append("    romaAppIds: ").append(toIndentedString(romaAppIds)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

