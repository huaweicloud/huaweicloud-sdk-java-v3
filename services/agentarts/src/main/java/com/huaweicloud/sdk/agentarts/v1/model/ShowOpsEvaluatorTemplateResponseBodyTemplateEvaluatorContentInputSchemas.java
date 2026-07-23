package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_schema")

    private String jsonSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_content_types")

    private List<String> supportContentTypes = null;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas withJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        return this;
    }

    /**
     * **参数解释：** JSON入参描述输入参数的数据结构。 **取值范围：** 符合JSONSchema标准的字符串。 
     * @return jsonSchema
     */
    public String getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 关键字用于标识和引用输入参数。 **取值范围：** 合法的参数标识符。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas withSupportContentTypes(
        List<String> supportContentTypes) {
        this.supportContentTypes = supportContentTypes;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas addSupportContentTypesItem(
        String supportContentTypesItem) {
        if (this.supportContentTypes == null) {
            this.supportContentTypes = new ArrayList<>();
        }
        this.supportContentTypes.add(supportContentTypesItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas withSupportContentTypes(
        Consumer<List<String>> supportContentTypesSetter) {
        if (this.supportContentTypes == null) {
            this.supportContentTypes = new ArrayList<>();
        }
        supportContentTypesSetter.accept(this.supportContentTypes);
        return this;
    }

    /**
     * **参数解释：** 支持的类型标识参数可以处理的数据格式。 **取值范围：** 不涉及。 
     * @return supportContentTypes
     */
    public List<String> getSupportContentTypes() {
        return supportContentTypes;
    }

    public void setSupportContentTypes(List<String> supportContentTypes) {
        this.supportContentTypes = supportContentTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas) obj;
        return Objects.equals(this.jsonSchema, that.jsonSchema) && Objects.equals(this.key, that.key)
            && Objects.equals(this.supportContentTypes, that.supportContentTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonSchema, key, supportContentTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentInputSchemas {\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    supportContentTypes: ").append(toIndentedString(supportContentTypes)).append("\n");
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
