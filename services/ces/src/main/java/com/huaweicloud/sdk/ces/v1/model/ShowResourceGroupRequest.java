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
public class ShowResourceGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    /**
     * **参数解释** 资源分组健康状态 **约束限制** 不涉及 **取值范围** - health: 表示健康 - unhealth: 表示不健康 - no_alarm_rule: 表示未配置告警规则 **默认取值** 不涉及
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
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dname")

    private String dname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ShowResourceGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释** 资源分组ID。 **约束限制** 不涉及 **取值范围** 以\"rg\"开头，后面跟着22个字母或数字 **默认取值** 不涉及
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowResourceGroupRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 资源分组健康状态 **约束限制** 不涉及 **取值范围** - health: 表示健康 - unhealth: 表示不健康 - no_alarm_rule: 表示未配置告警规则 **默认取值** 不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowResourceGroupRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 资源类型，即命名空间，如弹性云服务器的资源命名空间为：SYS.ECS；各服务命名空间可查看：“[服务命名空间](ces_03_0059.xml)”。 **约束限制** 不涉及 **取值范围** 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度在 [3,32]个字符之间 **默认取值** 不涉及
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowResourceGroupRequest withDname(String dname) {
        this.dname = dname;
        return this;
    }

    /**
     * **参数解释** 资源维度，如：弹性云服务器，则维度为instance_id，各资源的监控维度名称可查看：“[服务指标维度](ces_03_0059.xml)”。 **约束限制** 不涉及 **取值范围** 包含字母、数字、_、-、/、#、\\或括号，长度为[1,131]个字符 **默认取值** 不涉及
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ShowResourceGroupRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * **参数解释** 分页起始值 **约束限制** 不涉及 **取值范围** [0,9999999] **默认取值** 0
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ShowResourceGroupRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释** 单次查询的条数限制 **约束限制** 不涉及 **取值范围** [1,100] **默认取值** 100
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
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
        ShowResourceGroupRequest that = (ShowResourceGroupRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dname, that.dname)
            && Objects.equals(this.start, that.start) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, status, namespace, dname, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceGroupRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dname: ").append(toIndentedString(dname)).append("\n");
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
