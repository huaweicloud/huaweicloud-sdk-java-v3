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
 * **约束：** - 1. 同poject_id下不允许同名脚本 - 2. 修改脚本时，不允许修改：脚本名称、project_id - 3. 字段长度和范围限制  - 脚本内容长度，创建时为做校验
 */
public class AddScriptModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ScriptPropertiesModel properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 脚本类型: 对于脚本后缀： SHELL:.sh PYTHON:.py BAT:.bat
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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<ScriptParamDefine> scriptParams = null;

    public AddScriptModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 脚本名称：只能包含中文、英文、数字、下划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddScriptModel withProperties(ScriptPropertiesModel properties) {
        this.properties = properties;
        return this;
    }

    public AddScriptModel withProperties(Consumer<ScriptPropertiesModel> propertiesSetter) {
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

    public AddScriptModel withDescription(String description) {
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

    public AddScriptModel withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 脚本类型: 对于脚本后缀： SHELL:.sh PYTHON:.py BAT:.bat
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AddScriptModel withContent(String content) {
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

    public AddScriptModel withEnterpriseProjectId(String enterpriseProjectId) {
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

    public AddScriptModel withScriptParams(List<ScriptParamDefine> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public AddScriptModel addScriptParamsItem(ScriptParamDefine scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public AddScriptModel withScriptParams(Consumer<List<ScriptParamDefine>> scriptParamsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddScriptModel that = (AddScriptModel) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.content, that.content)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.scriptParams, that.scriptParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, properties, description, type, content, enterpriseProjectId, scriptParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddScriptModel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
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
