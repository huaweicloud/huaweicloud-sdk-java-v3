package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ReportCustomEventRequestBody
 */
public class ReportCustomEventRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmId")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmName")

    private String alarmName;

    /**
     * 告警级别。取值为Critical（紧急）, Major（重要）, Minor（次要）, Info（提示）
     */
    public static final class AlarmLevelEnum {

        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final AlarmLevelEnum CRITICAL = new AlarmLevelEnum("Critical");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final AlarmLevelEnum MAJOR = new AlarmLevelEnum("Major");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final AlarmLevelEnum MINOR = new AlarmLevelEnum("Minor");

        /**
         * Enum INFO for value: "Info"
         */
        public static final AlarmLevelEnum INFO = new AlarmLevelEnum("Info");

        private static final Map<String, AlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmLevelEnum> createStaticFields() {
            Map<String, AlarmLevelEnum> map = new HashMap<>();
            map.put("Critical", CRITICAL);
            map.put("Major", MAJOR);
            map.put("Minor", MINOR);
            map.put("Info", INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmLevelEnum(String value) {
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
        public static AlarmLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmLevelEnum(value));
        }

        public static AlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmLevelEnum) {
                return this.value.equals(((AlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmLevel")

    private AlarmLevelEnum alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameSpace")

    private String nameSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionId")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmDesc")

    private String alarmDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "URL")

    private String url;

    /**
     * 告警状态。一般取值为alarm（告警中）和ok（已恢复）
     */
    public static final class AlarmStatusEnum {

        /**
         * Enum ALARM for value: "alarm"
         */
        public static final AlarmStatusEnum ALARM = new AlarmStatusEnum("alarm");

        /**
         * Enum OK for value: "ok"
         */
        public static final AlarmStatusEnum OK = new AlarmStatusEnum("ok");

        private static final Map<String, AlarmStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmStatusEnum> createStaticFields() {
            Map<String, AlarmStatusEnum> map = new HashMap<>();
            map.put("alarm", ALARM);
            map.put("ok", OK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmStatusEnum(String value) {
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
        public static AlarmStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmStatusEnum(value));
        }

        public static AlarmStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmStatusEnum) {
                return this.value.equals(((AlarmStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmStatus")

    private AlarmStatusEnum alarmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmSource")

    private String alarmSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional")

    private Object additional;

    public ReportCustomEventRequestBody withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警id
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ReportCustomEventRequestBody withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * 告警名称
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public ReportCustomEventRequestBody withAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别。取值为Critical（紧急）, Major（重要）, Minor（次要）, Info（提示）
     * @return alarmLevel
     */
    public AlarmLevelEnum getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public ReportCustomEventRequestBody withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 告警发生时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ReportCustomEventRequestBody withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * 告警发生时间
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public ReportCustomEventRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 告警发生区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ReportCustomEventRequestBody withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ReportCustomEventRequestBody withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ReportCustomEventRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ReportCustomEventRequestBody withAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc;
        return this;
    }

    /**
     * 告警描述
     * @return alarmDesc
     */
    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc;
    }

    public ReportCustomEventRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 原始告警URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ReportCustomEventRequestBody withAlarmStatus(AlarmStatusEnum alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * 告警状态。一般取值为alarm（告警中）和ok（已恢复）
     * @return alarmStatus
     */
    public AlarmStatusEnum getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(AlarmStatusEnum alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public ReportCustomEventRequestBody withAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
        return this;
    }

    /**
     * 告警源
     * @return alarmSource
     */
    public String getAlarmSource() {
        return alarmSource;
    }

    public void setAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
    }

    public ReportCustomEventRequestBody withAdditional(Object additional) {
        this.additional = additional;
        return this;
    }

    /**
     * 告警附加信息
     * @return additional
     */
    public Object getAdditional() {
        return additional;
    }

    public void setAdditional(Object additional) {
        this.additional = additional;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportCustomEventRequestBody that = (ReportCustomEventRequestBody) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.alarmName, that.alarmName)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.time, that.time)
            && Objects.equals(this.nameSpace, that.nameSpace) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.alarmDesc, that.alarmDesc) && Objects.equals(this.url, that.url)
            && Objects.equals(this.alarmStatus, that.alarmStatus) && Objects.equals(this.alarmSource, that.alarmSource)
            && Objects.equals(this.additional, that.additional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId,
            alarmName,
            alarmLevel,
            time,
            nameSpace,
            regionId,
            applicationId,
            resourceName,
            resourceId,
            alarmDesc,
            url,
            alarmStatus,
            alarmSource,
            additional);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportCustomEventRequestBody {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    alarmDesc: ").append(toIndentedString(alarmDesc)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    alarmSource: ").append(toIndentedString(alarmSource)).append("\n");
        sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
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
