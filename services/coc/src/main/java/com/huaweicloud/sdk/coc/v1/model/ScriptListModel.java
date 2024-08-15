package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **遗留问题** 1. 脚本入参限制：参数个数、参数长度、参数合法范围 2. 字段长度和范围待定义
 */
public class ScriptListModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_uuid")

    private String scriptUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 脚本类型 SHELL:shell脚本 PYTHON:python脚本 BAT:bat脚本
     */
    public static final class TypeEnum {

        /**
         * Enum SHELL for value: "SHELL"
         */
        public static final TypeEnum SHELL = new TypeEnum("SHELL");

        /**
         * Enum PYTHON for value: "PYTHON"
         */
        public static final TypeEnum PYTHON = new TypeEnum("PYTHON");

        /**
         * Enum BAT for value: "BAT"
         */
        public static final TypeEnum BAT = new TypeEnum("BAT");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SHELL", SHELL);
            map.put("PYTHON", PYTHON);
            map.put("BAT", BAT);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 脚本状态 PENDING_APPROVE:待审批 APPROVED：正常（审批通过） REJECTED：驳回（审批人，驳回该脚本
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING_APPROVE for value: "PENDING_APPROVE"
         */
        public static final StatusEnum PENDING_APPROVE = new StatusEnum("PENDING_APPROVE");

        /**
         * Enum APPROVED for value: "APPROVED"
         */
        public static final StatusEnum APPROVED = new StatusEnum("APPROVED");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final StatusEnum REJECTED = new StatusEnum("REJECTED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PENDING_APPROVE", PENDING_APPROVE);
            map.put("APPROVED", APPROVED);
            map.put("REJECTED", REJECTED);
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
    @JsonProperty(value = "gmt_created")

    private Long gmtCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modified")

    private Long gmtModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ScriptPropertiesModel properties;

    public ScriptListModel withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 脚本自增id
     * minimum: 1
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScriptListModel withScriptUuid(String scriptUuid) {
        this.scriptUuid = scriptUuid;
        return this;
    }

    /**
     * 脚本uuid
     * @return scriptUuid
     */
    public String getScriptUuid() {
        return scriptUuid;
    }

    public void setScriptUuid(String scriptUuid) {
        this.scriptUuid = scriptUuid;
    }

    public ScriptListModel withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认为：0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ScriptListModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 脚本名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScriptListModel withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 脚本类型 SHELL:shell脚本 PYTHON:python脚本 BAT:bat脚本
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ScriptListModel withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 脚本状态 PENDING_APPROVE:待审批 APPROVED：正常（审批通过） REJECTED：驳回（审批人，驳回该脚本
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScriptListModel withGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }

    /**
     * 创建时间
     * minimum: 1
     * maximum: 9223372036854775807
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public ScriptListModel withGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }

    /**
     * 修改时间
     * minimum: 1
     * maximum: 9223372036854775807
     * @return gmtModified
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public ScriptListModel withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ScriptListModel withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建人Id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ScriptListModel withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 修改人
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ScriptListModel withProperties(ScriptPropertiesModel properties) {
        this.properties = properties;
        return this;
    }

    public ScriptListModel withProperties(Consumer<ScriptPropertiesModel> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ScriptPropertiesModel();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ScriptPropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(ScriptPropertiesModel properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptListModel that = (ScriptListModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.scriptUuid, that.scriptUuid)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.gmtCreated, that.gmtCreated)
            && Objects.equals(this.gmtModified, that.gmtModified) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            scriptUuid,
            enterpriseProjectId,
            name,
            type,
            status,
            gmtCreated,
            gmtModified,
            creator,
            creatorId,
            operator,
            properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptListModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scriptUuid: ").append(toIndentedString(scriptUuid)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    gmtCreated: ").append(toIndentedString(gmtCreated)).append("\n");
        sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
