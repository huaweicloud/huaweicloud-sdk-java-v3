package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListScalingPolicyExecuteLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_id")

    private String scalingPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    /**
     * 伸缩资源类型：伸缩组：SCALING_GROUP。带宽：BANDWIDTH
     */
    public static final class ScalingResourceTypeEnum {

        /**
         * Enum SCALING_GROUP for value: "SCALING_GROUP"
         */
        public static final ScalingResourceTypeEnum SCALING_GROUP = new ScalingResourceTypeEnum("SCALING_GROUP");

        /**
         * Enum BANDWIDTH for value: "BANDWIDTH"
         */
        public static final ScalingResourceTypeEnum BANDWIDTH = new ScalingResourceTypeEnum("BANDWIDTH");

        private static final Map<String, ScalingResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScalingResourceTypeEnum> createStaticFields() {
            Map<String, ScalingResourceTypeEnum> map = new HashMap<>();
            map.put("SCALING_GROUP", SCALING_GROUP);
            map.put("BANDWIDTH", BANDWIDTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScalingResourceTypeEnum(String value) {
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
        public static ScalingResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ScalingResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScalingResourceTypeEnum(value);
            }
            return result;
        }

        public static ScalingResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ScalingResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScalingResourceTypeEnum) {
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
    @JsonProperty(value = "scaling_resource_type")

    private ScalingResourceTypeEnum scalingResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_resource_id")

    private String scalingResourceId;

    /**
     * 策略执行类型：SCHEDULED：自动触发（定时）。RECURRENCE：自动触发（周期）。ALARM：自动触发（告警）。MANUAL：手动触发。
     */
    public static final class ExecuteTypeEnum {

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

        private static final Map<String, ExecuteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecuteTypeEnum> createStaticFields() {
            Map<String, ExecuteTypeEnum> map = new HashMap<>();
            map.put("SCHEDULED", SCHEDULED);
            map.put("RECURRENCE", RECURRENCE);
            map.put("ALARM", ALARM);
            map.put("MANUAL", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecuteTypeEnum(String value) {
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
        public static ExecuteTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExecuteTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExecuteTypeEnum(value);
            }
            return result;
        }

        public static ExecuteTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExecuteTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExecuteTypeEnum) {
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
    @JsonProperty(value = "execute_type")

    private ExecuteTypeEnum executeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_number")

    private Integer startNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListScalingPolicyExecuteLogsRequest withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    /**
     * 伸缩策略ID。
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
     * 日志ID。
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
     * 伸缩资源类型：伸缩组：SCALING_GROUP。带宽：BANDWIDTH
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
     * 伸缩资源ID。
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
     * 策略执行类型：SCHEDULED：自动触发（定时）。RECURRENCE：自动触发（周期）。ALARM：自动触发（告警）。MANUAL：手动触发。
     * @return executeType
     */
    public ExecuteTypeEnum getExecuteType() {
        return executeType;
    }

    public void setExecuteType(ExecuteTypeEnum executeType) {
        this.executeType = executeType;
    }

    public ListScalingPolicyExecuteLogsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询的起始时间，格式是“yyyy-MM-ddThh:mm:ssZ”。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListScalingPolicyExecuteLogsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询的截止时间，格式是“yyyy-MM-ddThh:mm:ssZ”。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListScalingPolicyExecuteLogsRequest withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    /**
     * 查询的起始行号，默认为0。
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
     * 查询记录数，默认20，最大100。
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
        ListScalingPolicyExecuteLogsRequest listScalingPolicyExecuteLogsRequest =
            (ListScalingPolicyExecuteLogsRequest) o;
        return Objects.equals(this.scalingPolicyId, listScalingPolicyExecuteLogsRequest.scalingPolicyId)
            && Objects.equals(this.logId, listScalingPolicyExecuteLogsRequest.logId)
            && Objects.equals(this.scalingResourceType, listScalingPolicyExecuteLogsRequest.scalingResourceType)
            && Objects.equals(this.scalingResourceId, listScalingPolicyExecuteLogsRequest.scalingResourceId)
            && Objects.equals(this.executeType, listScalingPolicyExecuteLogsRequest.executeType)
            && Objects.equals(this.startTime, listScalingPolicyExecuteLogsRequest.startTime)
            && Objects.equals(this.endTime, listScalingPolicyExecuteLogsRequest.endTime)
            && Objects.equals(this.startNumber, listScalingPolicyExecuteLogsRequest.startNumber)
            && Objects.equals(this.limit, listScalingPolicyExecuteLogsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyId,
            logId,
            scalingResourceType,
            scalingResourceId,
            executeType,
            startTime,
            endTime,
            startNumber,
            limit);
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
