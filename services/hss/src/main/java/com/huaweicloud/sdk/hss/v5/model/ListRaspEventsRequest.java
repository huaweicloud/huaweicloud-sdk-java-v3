package com.huaweicloud.sdk.hss.v5.model;

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
public class ListRaspEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 应用类型，包含如下1种。   - java ：java类型应用防护。
     */
    public static final class AppTypeEnum {

        /**
         * Enum JAVA for value: "java"
         */
        public static final AppTypeEnum JAVA = new AppTypeEnum("java");

        private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppTypeEnum> createStaticFields() {
            Map<String, AppTypeEnum> map = new HashMap<>();
            map.put("java", JAVA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppTypeEnum(String value) {
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
        public static AppTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppTypeEnum(value));
        }

        public static AppTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppTypeEnum) {
                return this.value.equals(((AppTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_tag")

    private String attackTag;

    /**
     * 防护状态，包含如下2种。   - closed ：未开启。   - opened ：防护中。
     */
    public static final class ProtectStatusEnum {

        /**
         * Enum CLOSED for value: "closed"
         */
        public static final ProtectStatusEnum CLOSED = new ProtectStatusEnum("closed");

        /**
         * Enum OPENED for value: "opened"
         */
        public static final ProtectStatusEnum OPENED = new ProtectStatusEnum("opened");

        private static final Map<String, ProtectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectStatusEnum> createStaticFields() {
            Map<String, ProtectStatusEnum> map = new HashMap<>();
            map.put("closed", CLOSED);
            map.put("opened", OPENED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectStatusEnum(String value) {
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
        public static ProtectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectStatusEnum(value));
        }

        public static ProtectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectStatusEnum) {
                return this.value.equals(((ProtectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private ProtectStatusEnum protectStatus;

    public ListRaspEventsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListRaspEventsRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * Host Id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListRaspEventsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询时间段的起始时间，毫秒级时间戳(ms)
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListRaspEventsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询时间段的终止时间，毫秒级时间戳(ms)
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListRaspEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 默认10
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRaspEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 默认0
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRaspEventsRequest withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 应用类型，包含如下1种。   - java ：java类型应用防护。
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    public ListRaspEventsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 告警级别 |- 告警级别，包含如下1种。 - 0 ：Info级别告警 - 1 ：Low级别告警 - 2 ：Medium级别告警 - 3 ：High级别告警 - 4 ：Critical级别告警
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ListRaspEventsRequest withAttackTag(String attackTag) {
        this.attackTag = attackTag;
        return this;
    }

    /**
     * 攻击标识 |- 攻击标识，包含如下6种。 - 1 ：Attack Success  攻击成功 - 2 ：Attack Attempt  攻击尝试 - 3 ：Attack Blocked  攻击被阻断 - 4 ：Abnormal Behavior  异常行为 - 5 ：Collapsible Host  主机失陷 - 6 ：System Vulnerability  系统脆弱性
     * @return attackTag
     */
    public String getAttackTag() {
        return attackTag;
    }

    public void setAttackTag(String attackTag) {
        this.attackTag = attackTag;
    }

    public ListRaspEventsRequest withProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。   - closed ：未开启。   - opened ：防护中。
     * @return protectStatus
     */
    public ProtectStatusEnum getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRaspEventsRequest that = (ListRaspEventsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.attackTag, that.attackTag)
            && Objects.equals(this.protectStatus, that.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            hostId,
            startTime,
            endTime,
            limit,
            offset,
            appType,
            severity,
            attackTag,
            protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRaspEventsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    attackTag: ").append(toIndentedString(attackTag)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
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
