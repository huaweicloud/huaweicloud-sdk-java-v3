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
 * 公共脚本详情
 */
public class PublicScriptDetailModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_uuid")

    private String scriptUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_created")

    private Long gmtCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private PublicScriptPropertiesModel properties;

    public PublicScriptDetailModel withScriptUuid(String scriptUuid) {
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

    public PublicScriptDetailModel withName(String name) {
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

    public PublicScriptDetailModel withDescription(String description) {
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

    public PublicScriptDetailModel withType(TypeEnum type) {
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

    public PublicScriptDetailModel withContent(String content) {
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

    public PublicScriptDetailModel withScriptParams(List<ScriptParamDefine> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public PublicScriptDetailModel addScriptParamsItem(ScriptParamDefine scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public PublicScriptDetailModel withScriptParams(Consumer<List<ScriptParamDefine>> scriptParamsSetter) {
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

    public PublicScriptDetailModel withGmtCreated(Long gmtCreated) {
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

    public PublicScriptDetailModel withProperties(PublicScriptPropertiesModel properties) {
        this.properties = properties;
        return this;
    }

    public PublicScriptDetailModel withProperties(Consumer<PublicScriptPropertiesModel> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new PublicScriptPropertiesModel();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public PublicScriptPropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(PublicScriptPropertiesModel properties) {
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
        PublicScriptDetailModel that = (PublicScriptDetailModel) obj;
        return Objects.equals(this.scriptUuid, that.scriptUuid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.content, that.content) && Objects.equals(this.scriptParams, that.scriptParams)
            && Objects.equals(this.gmtCreated, that.gmtCreated) && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptUuid, name, description, type, content, scriptParams, gmtCreated, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicScriptDetailModel {\n");
        sb.append("    scriptUuid: ").append(toIndentedString(scriptUuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    gmtCreated: ").append(toIndentedString(gmtCreated)).append("\n");
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
