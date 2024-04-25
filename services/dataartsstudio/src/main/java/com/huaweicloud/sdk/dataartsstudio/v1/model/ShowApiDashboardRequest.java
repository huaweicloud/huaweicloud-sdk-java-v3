package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowApiDashboardRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * 数据服务的版本类型，指定SHARED共享版或EXCLUSIVE专享版。
     */
    public static final class DlmTypeEnum {

        /**
         * Enum SHARED for value: "SHARED"
         */
        public static final DlmTypeEnum SHARED = new DlmTypeEnum("SHARED");

        /**
         * Enum EXCLUSIVE for value: "EXCLUSIVE"
         */
        public static final DlmTypeEnum EXCLUSIVE = new DlmTypeEnum("EXCLUSIVE");

        private static final Map<String, DlmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DlmTypeEnum> createStaticFields() {
            Map<String, DlmTypeEnum> map = new HashMap<>();
            map.put("SHARED", SHARED);
            map.put("EXCLUSIVE", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DlmTypeEnum(String value) {
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
        public static DlmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DlmTypeEnum(value));
        }

        public static DlmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DlmTypeEnum) {
                return this.value.equals(((DlmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Dlm-Type")

    private DlmTypeEnum dlmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    /**
     * 时间单位。
     */
    public static final class TimeUnitEnum {

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final TimeUnitEnum DAY = new TimeUnitEnum("DAY");

        private static final Map<String, TimeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeUnitEnum> createStaticFields() {
            Map<String, TimeUnitEnum> map = new HashMap<>();
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeUnitEnum(String value) {
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
        public static TimeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeUnitEnum(value));
        }

        public static TimeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeUnitEnum) {
                return this.value.equals(((TimeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private TimeUnitEnum timeUnit;

    public ShowApiDashboardRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowApiDashboardRequest withDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
        return this;
    }

    /**
     * 数据服务的版本类型，指定SHARED共享版或EXCLUSIVE专享版。
     * @return dlmType
     */
    public DlmTypeEnum getDlmType() {
        return dlmType;
    }

    public void setDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
    }

    public ShowApiDashboardRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * api编号。
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ShowApiDashboardRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 集群编号。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowApiDashboardRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（13位时间戳）。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowApiDashboardRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（13位时间戳）。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowApiDashboardRequest withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 时间单位。
     * @return timeUnit
     */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowApiDashboardRequest that = (ShowApiDashboardRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.dlmType, that.dlmType)
            && Objects.equals(this.apiId, that.apiId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.timeUnit, that.timeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, dlmType, apiId, instanceId, startTime, endTime, timeUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiDashboardRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dlmType: ").append(toIndentedString(dlmType)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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
