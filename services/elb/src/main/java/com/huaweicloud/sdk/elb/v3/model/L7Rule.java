package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** L7转发规则 */
public class L7Rule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /** 一个l7policy下创建的l7rule的HOST_NAME，PATH，METHOD，SOURCE_IP 不能重复。HEADER、QUERY_STRING支持重复的rule配置。
     * 匹配内容：可以为HOST_NAME,PATH,METHOD,HEADER,QUERY_STRING,SOURCE_IP */
    public static final class TypeEnum {

        /** Enum HOST_NAME for value: "HOST_NAME" */
        public static final TypeEnum HOST_NAME = new TypeEnum("HOST_NAME");

        /** Enum PATH for value: "PATH" */
        public static final TypeEnum PATH = new TypeEnum("PATH");

        /** Enum METHOD for value: "METHOD" */
        public static final TypeEnum METHOD = new TypeEnum("METHOD");

        /** Enum HEADER for value: "HEADER" */
        public static final TypeEnum HEADER = new TypeEnum("HEADER");

        /** Enum QUERY_STRING for value: "QUERY_STRING" */
        public static final TypeEnum QUERY_STRING = new TypeEnum("QUERY_STRING");

        /** Enum SOURCE_IP for value: "SOURCE_IP" */
        public static final TypeEnum SOURCE_IP = new TypeEnum("SOURCE_IP");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("HOST_NAME", HOST_NAME);
            map.put("PATH", PATH);
            map.put("METHOD", METHOD);
            map.put("HEADER", HEADER);
            map.put("QUERY_STRING", QUERY_STRING);
            map.put("SOURCE_IP", SOURCE_IP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invert")

    private Boolean invert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<RuleCondition> conditions = null;

    public L7Rule withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 转发规则的管理状，默认为true。 不支持该字段，请勿使用。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public L7Rule withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /** 转发规则的匹配方式。type为HOST_NAME时可以为EQUAL_TO。type为PATH时可以为Perl类型的REGEX， STARTS_WITH，EQUAL_TO。
     * 
     * @return compareType */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public L7Rule withKey(String key) {
        this.key = key;
        return this;
    }

    /** 匹配内容的键值。目前匹配内容为HOST_NAME和PATH时，该字段不生效。该字段能更新但不会生效。
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public L7Rule withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 转发规则所在的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public L7Rule withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 一个l7policy下创建的l7rule的HOST_NAME，PATH，METHOD，SOURCE_IP 不能重复。HEADER、QUERY_STRING支持重复的rule配置。
     * 匹配内容：可以为HOST_NAME,PATH,METHOD,HEADER,QUERY_STRING,SOURCE_IP
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public L7Rule withValue(String value) {
        this.value = value;
        return this;
    }

    /** 匹配内容的值。仅当conditions空时该字段生效。 当type为HOST_NAME时，字符串只能包含英文字母、数字、“-”、“.”或“*”，必须以字母、数字或“*”开头。
     * 若域名中包含“*”，则“*”只能出现在开头且必须以*.开始。当*开头时表示通配0~任一个字符。
     * 当type为PATH时，当转发规则的compare_type为STARTS_WITH、EQUAL_TO时，字符串只能包含英文字母、数字、_~';@^-%#&$.*+?,=!&#58;|/()[]{}，且必须以\"/\"开头。
     * 当type为METHOD、SOURCE_IP、HEADER, QUERY_STRING时，该字段无意义，使用condition_pair来指定key，value。
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public L7Rule withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /** provisioning状态，可以为ACTIVE、PENDING_CREATE 或者ERROR。 说明：该字段无实际含义，默认为ACTIVE。
     * 
     * @return provisioningStatus */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public L7Rule withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    /** 是否反向匹配。 使用说明： - 固定为false。该字段能更新但不会生效。
     * 
     * @return invert */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public L7Rule withId(String id) {
        this.id = id;
        return this;
    }

    /** 规则ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public L7Rule withConditions(List<RuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public L7Rule addConditionsItem(RuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public L7Rule withConditions(Consumer<List<RuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /** 转发规则的匹配条件。当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效。 配置了conditions后，字段key、字段value的值无意义。
     * 若指定了conditons，该rule的条件数为conditons列表长度。 列表中key必须相同，value不允许重复。 [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return conditions */
    public List<RuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<RuleCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L7Rule l7Rule = (L7Rule) o;
        return Objects.equals(this.adminStateUp, l7Rule.adminStateUp)
            && Objects.equals(this.compareType, l7Rule.compareType) && Objects.equals(this.key, l7Rule.key)
            && Objects.equals(this.projectId, l7Rule.projectId) && Objects.equals(this.type, l7Rule.type)
            && Objects.equals(this.value, l7Rule.value)
            && Objects.equals(this.provisioningStatus, l7Rule.provisioningStatus)
            && Objects.equals(this.invert, l7Rule.invert) && Objects.equals(this.id, l7Rule.id)
            && Objects.equals(this.conditions, l7Rule.conditions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(adminStateUp, compareType, key, projectId, type, value, provisioningStatus, invert, id, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7Rule {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
