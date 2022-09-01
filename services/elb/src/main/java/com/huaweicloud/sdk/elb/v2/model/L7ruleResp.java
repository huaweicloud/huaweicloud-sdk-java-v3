package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 转发规则对象
 */
public class L7ruleResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    @JacksonXmlProperty(localName = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    /**
     * 转发规则的匹配内容
     */
    public static final class TypeEnum {

        /**
         * Enum HOST_NAME for value: "HOST_NAME"
         */
        public static final TypeEnum HOST_NAME = new TypeEnum("HOST_NAME");

        /**
         * Enum PATH for value: "PATH"
         */
        public static final TypeEnum PATH = new TypeEnum("PATH");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("HOST_NAME", HOST_NAME);
            map.put("PATH", PATH);
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

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    @JacksonXmlProperty(localName = "compare_type")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invert")

    @JacksonXmlProperty(localName = "invert")

    private Boolean invert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    public L7ruleResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 转发规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public L7ruleResp withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 转发规则的配置状态；该字段为预留字段，暂未启用。默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public L7ruleResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 转发规则所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public L7ruleResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 转发规则所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public L7ruleResp withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 转发规则的管理状态；该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public L7ruleResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 转发规则的匹配内容
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public L7ruleResp withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 转发规则的匹配方式。type为HOST_NAME时可以为EQUAL_TO。type为PATH时可以为REGEX， STARTS_WITH，EQUAL_TO。
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public L7ruleResp withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    /**
     * 是否反向匹配。使用说明：固定为false。该字段能更新但不会生效。
     * @return invert
     */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public L7ruleResp withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 匹配内容的键值。目前匹配内容为HOST_NAME和PATH时，该字段不生效。该字段能更新但不会生效。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public L7ruleResp withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 匹配内容的值。其值不能包含空格。使用说明：当type为HOST_NAME时，取值范围：String(100)，字符串只能包含英文字母、数字、“-”或“.”，且必须以字母或数字开头。当type为PATH时，取值范围：String(128)。当转发规则的compare_type为STARTS_WITH，EQUAL_TO时，字符串只能包含英文字母、数字、^-%#&$.*+?,=!:| /()[]{}，且必须以\"/\"开头。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L7ruleResp l7ruleResp = (L7ruleResp) o;
        return Objects.equals(this.id, l7ruleResp.id)
            && Objects.equals(this.provisioningStatus, l7ruleResp.provisioningStatus)
            && Objects.equals(this.tenantId, l7ruleResp.tenantId)
            && Objects.equals(this.projectId, l7ruleResp.projectId)
            && Objects.equals(this.adminStateUp, l7ruleResp.adminStateUp) && Objects.equals(this.type, l7ruleResp.type)
            && Objects.equals(this.compareType, l7ruleResp.compareType)
            && Objects.equals(this.invert, l7ruleResp.invert) && Objects.equals(this.key, l7ruleResp.key)
            && Objects.equals(this.value, l7ruleResp.value);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, provisioningStatus, tenantId, projectId, adminStateUp, type, compareType, invert, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7ruleResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
