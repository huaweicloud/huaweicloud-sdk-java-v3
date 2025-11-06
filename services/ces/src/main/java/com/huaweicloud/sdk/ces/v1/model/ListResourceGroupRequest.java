package com.huaweicloud.sdk.ces.v1.model;

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
public class ListResourceGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    /**
     * 资源分组健康状态，值可为health、unhealth、no_alarm_rule；health表示健康，unhealth表示不健康，no_alarm_rule表示未配置告警规则
     */
    public static final class StatusEnum {

        /**
         * Enum HEALTH for value: "health"
         */
        public static final StatusEnum HEALTH = new StatusEnum("health");

        /**
         * Enum UNHEALTH for value: "unhealth"
         */
        public static final StatusEnum UNHEALTH = new StatusEnum("unhealth");

        /**
         * Enum NO_ALARM_RULE for value: "no_alarm_rule"
         */
        public static final StatusEnum NO_ALARM_RULE = new StatusEnum("no_alarm_rule");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("health", HEALTH);
            map.put("unhealth", UNHEALTH);
            map.put("no_alarm_rule", NO_ALARM_RULE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListResourceGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组的名称；长度为1-128，只能包含0-9/a-z/A-Z/_/-或汉字；如：ResourceGroup-Test01。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListResourceGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组的ID，长度为1-128，只能包含0-9/a-z/A-Z；如：rg16063743652226ew93e64p。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListResourceGroupRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源分组健康状态，值可为health、unhealth、no_alarm_rule；health表示健康，unhealth表示不健康，no_alarm_rule表示未配置告警规则
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListResourceGroupRequest withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 分页起始值，类型为integer，默认值为0。
     * minimum: 0
     * maximum: 9999999
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public ListResourceGroupRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的条数限制，取值范围(0,100]，默认值为100， 用于限制结果数据条数。
     * minimum: 1
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceGroupRequest that = (ListResourceGroupRequest) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.start, that.start)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupId, status, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceGroupRequest {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
