package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

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
public class ListStatisticsApiRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * Gets or Sets mode
     */
    public static final class ModeEnum {

        
        /**
         * Enum INSTANCE for value: "INSTANCE"
         */
        public static final ModeEnum INSTANCE = new ModeEnum("INSTANCE");
        
        /**
         * Enum ALL for value: "ALL"
         */
        public static final ModeEnum ALL = new ModeEnum("ALL");
        
        /**
         * Enum APP for value: "APP"
         */
        public static final ModeEnum APP = new ModeEnum("APP");
        
        /**
         * Enum API for value: "API"
         */
        public static final ModeEnum API = new ModeEnum("API");
        

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("INSTANCE", INSTANCE);
            map.put("ALL", ALL);
            map.put("APP", APP);
            map.put("API", API);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private ModeEnum mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;
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
    
    private CycleEnum cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private String duration;

    public ListStatisticsApiRequest withInstanceId(String instanceId) {
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

    

    public ListStatisticsApiRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * Get mode
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    

    public ListStatisticsApiRequest withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * Get romaAppId
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    

    public ListStatisticsApiRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * Get apiId
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public ListStatisticsApiRequest withCycle(CycleEnum cycle) {
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

    

    public ListStatisticsApiRequest withStartTime(String startTime) {
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

    

    public ListStatisticsApiRequest withEndTime(String endTime) {
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

    

    public ListStatisticsApiRequest withDuration(String duration) {
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
        ListStatisticsApiRequest listStatisticsApiRequest = (ListStatisticsApiRequest) o;
        return Objects.equals(this.instanceId, listStatisticsApiRequest.instanceId) &&
            Objects.equals(this.mode, listStatisticsApiRequest.mode) &&
            Objects.equals(this.romaAppId, listStatisticsApiRequest.romaAppId) &&
            Objects.equals(this.apiId, listStatisticsApiRequest.apiId) &&
            Objects.equals(this.cycle, listStatisticsApiRequest.cycle) &&
            Objects.equals(this.startTime, listStatisticsApiRequest.startTime) &&
            Objects.equals(this.endTime, listStatisticsApiRequest.endTime) &&
            Objects.equals(this.duration, listStatisticsApiRequest.duration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, mode, romaAppId, apiId, cycle, startTime, endTime, duration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsApiRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
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

