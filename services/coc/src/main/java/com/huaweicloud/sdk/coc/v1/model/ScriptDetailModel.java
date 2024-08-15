package com.huaweicloud.sdk.coc.v1.model;

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

/**
 * 脚本详情
 */
public class ScriptDetailModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_uuid")

    private String scriptUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 脚本类型 SHELL:shell脚本， PYTHON:Python脚本， BAT:Bat脚本，
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<ScriptParamDefine> scriptParams = null;

    /**
     * 脚本状态 PENDING_APPROVE:待审批 APPROVED：正常（审批通过） REJECTED：驳回（审批人，驳回该脚本）
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ScriptDetailModel withScriptUuid(String scriptUuid) {
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

    public ScriptDetailModel withName(String name) {
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

    public ScriptDetailModel withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 脚本版本号 约束条件  后期废除，不建议使用
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ScriptDetailModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 脚本描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScriptDetailModel withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 脚本类型 SHELL:shell脚本， PYTHON:Python脚本， BAT:Bat脚本，
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ScriptDetailModel withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 脚本内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ScriptDetailModel withScriptParams(List<ScriptParamDefine> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public ScriptDetailModel addScriptParamsItem(ScriptParamDefine scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public ScriptDetailModel withScriptParams(Consumer<List<ScriptParamDefine>> scriptParamsSetter) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        scriptParamsSetter.accept(this.scriptParams);
        return this;
    }

    /**
     * 脚本入参
     * @return scriptParams
     */
    public List<ScriptParamDefine> getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(List<ScriptParamDefine> scriptParams) {
        this.scriptParams = scriptParams;
    }

    public ScriptDetailModel withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 脚本状态 PENDING_APPROVE:待审批 APPROVED：正常（审批通过） REJECTED：驳回（审批人，驳回该脚本）
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScriptDetailModel withGmtCreated(Long gmtCreated) {
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

    public ScriptDetailModel withGmtModified(Long gmtModified) {
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

    public ScriptDetailModel withCreator(String creator) {
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

    public ScriptDetailModel withCreatorId(String creatorId) {
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

    public ScriptDetailModel withOperator(String operator) {
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

    public ScriptDetailModel withProperties(ScriptPropertiesModel properties) {
        this.properties = properties;
        return this;
    }

    public ScriptDetailModel withProperties(Consumer<ScriptPropertiesModel> propertiesSetter) {
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

    public ScriptDetailModel withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptDetailModel that = (ScriptDetailModel) obj;
        return Objects.equals(this.scriptUuid, that.scriptUuid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.content, that.content)
            && Objects.equals(this.scriptParams, that.scriptParams) && Objects.equals(this.status, that.status)
            && Objects.equals(this.gmtCreated, that.gmtCreated) && Objects.equals(this.gmtModified, that.gmtModified)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptUuid,
            name,
            version,
            description,
            type,
            content,
            scriptParams,
            status,
            gmtCreated,
            gmtModified,
            creator,
            creatorId,
            operator,
            properties,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptDetailModel {\n");
        sb.append("    scriptUuid: ").append(toIndentedString(scriptUuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    gmtCreated: ").append(toIndentedString(gmtCreated)).append("\n");
        sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
