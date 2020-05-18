package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListScalingPolicyExecuteLogsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_id")
    
    private String scalingPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_id")
    
    private String logId;
    /**
     * Gets or Sets scalingResourceType
     */
    public static class ScalingResourceTypeEnum {

        
        /**
         * Enum SCALING_GROUP for value: "SCALING_GROUP"
         */
        public static final ScalingResourceTypeEnum SCALING_GROUP = new ScalingResourceTypeEnum("SCALING_GROUP");

        
        /**
         * Enum BANDWIDTH for value: "BANDWIDTH"
         */
        public static final ScalingResourceTypeEnum BANDWIDTH = new ScalingResourceTypeEnum("BANDWIDTH");

        

        public static Map<String, ScalingResourceTypeEnum> staticFields =
                new HashMap<String, ScalingResourceTypeEnum>() {
                    { 
                        put("SCALING_GROUP", SCALING_GROUP);
                        put("BANDWIDTH", BANDWIDTH);
                    }
                };

        private String value;

        ScalingResourceTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingResourceTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ScalingResourceTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ScalingResourceTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ScalingResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingResourceTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScalingResourceTypeEnum) {
                return this.value.equals(((ScalingResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_resource_type")
    
    private ScalingResourceTypeEnum scalingResourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_resource_id")
    
    private String scalingResourceId;
    /**
     * Gets or Sets executeType
     */
    public static class ExecuteTypeEnum {

        
        /**
         * Enum SCHEDULED for value: "SCHEDULED"
         */
        public static final ExecuteTypeEnum SCHEDULED = new ExecuteTypeEnum("SCHEDULED");

        
        /**
         * Enum RECURRENCE for value: "RECURRENCE"
         */
        public static final ExecuteTypeEnum RECURRENCE = new ExecuteTypeEnum("RECURRENCE");

        
        /**
         * Enum ALARM for value: "ALARM"
         */
        public static final ExecuteTypeEnum ALARM = new ExecuteTypeEnum("ALARM");

        
        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final ExecuteTypeEnum MANUAL = new ExecuteTypeEnum("MANUAL");

        

        public static Map<String, ExecuteTypeEnum> staticFields =
                new HashMap<String, ExecuteTypeEnum>() {
                    { 
                        put("SCHEDULED", SCHEDULED);
                        put("RECURRENCE", RECURRENCE);
                        put("ALARM", ALARM);
                        put("MANUAL", MANUAL);
                    }
                };

        private String value;

        ExecuteTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExecuteTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ExecuteTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ExecuteTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ExecuteTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExecuteTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ExecuteTypeEnum) {
                return this.value.equals(((ExecuteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_type")
    
    private ExecuteTypeEnum executeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private OffsetDateTime startTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private OffsetDateTime endTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListScalingPolicyExecuteLogsRequest withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    


    /**
     * Get scalingPolicyId
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    public ListScalingPolicyExecuteLogsRequest withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    


    /**
     * Get logId
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public ListScalingPolicyExecuteLogsRequest withScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
        this.scalingResourceType = scalingResourceType;
        return this;
    }

    


    /**
     * Get scalingResourceType
     * @return scalingResourceType
     */
    public ScalingResourceTypeEnum getScalingResourceType() {
        return scalingResourceType;
    }

    public void setScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
        this.scalingResourceType = scalingResourceType;
    }

    public ListScalingPolicyExecuteLogsRequest withScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
        return this;
    }

    


    /**
     * Get scalingResourceId
     * @return scalingResourceId
     */
    public String getScalingResourceId() {
        return scalingResourceId;
    }

    public void setScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
    }

    public ListScalingPolicyExecuteLogsRequest withExecuteType(ExecuteTypeEnum executeType) {
        this.executeType = executeType;
        return this;
    }

    


    /**
     * Get executeType
     * @return executeType
     */
    public ExecuteTypeEnum getExecuteType() {
        return executeType;
    }

    public void setExecuteType(ExecuteTypeEnum executeType) {
        this.executeType = executeType;
    }

    public ListScalingPolicyExecuteLogsRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ListScalingPolicyExecuteLogsRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ListScalingPolicyExecuteLogsRequest withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * Get startNumber
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public ListScalingPolicyExecuteLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingPolicyExecuteLogsRequest listScalingPolicyExecuteLogsRequest = (ListScalingPolicyExecuteLogsRequest) o;
        return Objects.equals(this.scalingPolicyId, listScalingPolicyExecuteLogsRequest.scalingPolicyId) &&
            Objects.equals(this.logId, listScalingPolicyExecuteLogsRequest.logId) &&
            Objects.equals(this.scalingResourceType, listScalingPolicyExecuteLogsRequest.scalingResourceType) &&
            Objects.equals(this.scalingResourceId, listScalingPolicyExecuteLogsRequest.scalingResourceId) &&
            Objects.equals(this.executeType, listScalingPolicyExecuteLogsRequest.executeType) &&
            Objects.equals(this.startTime, listScalingPolicyExecuteLogsRequest.startTime) &&
            Objects.equals(this.endTime, listScalingPolicyExecuteLogsRequest.endTime) &&
            Objects.equals(this.startNumber, listScalingPolicyExecuteLogsRequest.startNumber) &&
            Objects.equals(this.limit, listScalingPolicyExecuteLogsRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyId, logId, scalingResourceType, scalingResourceId, executeType, startTime, endTime, startNumber, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingPolicyExecuteLogsRequest {\n");
            sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
            sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
            sb.append("    scalingResourceType: ").append(toIndentedString(scalingResourceType)).append("\n");
            sb.append("    scalingResourceId: ").append(toIndentedString(scalingResourceId)).append("\n");
            sb.append("    executeType: ").append(toIndentedString(executeType)).append("\n");
            sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

