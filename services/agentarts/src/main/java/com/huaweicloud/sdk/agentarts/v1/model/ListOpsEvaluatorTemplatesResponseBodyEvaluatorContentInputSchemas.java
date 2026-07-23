package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_schema")

    private String jsonSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_content_types")

    private List<String> supportContentTypes = null;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas withJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        return this;
    }

    /**
     * **参数解释：** JSON格式的入参描述。 **取值范围：** 不涉及。 
     * @return jsonSchema
     */
    public String getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 参数标识关键字。 **取值范围：** 不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas withSupportContentTypes(
        List<String> supportContentTypes) {
        this.supportContentTypes = supportContentTypes;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas addSupportContentTypesItem(
        String supportContentTypesItem) {
        if (this.supportContentTypes == null) {
            this.supportContentTypes = new ArrayList<>();
        }
        this.supportContentTypes.add(supportContentTypesItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas withSupportContentTypes(
        Consumer<List<String>> supportContentTypesSetter) {
        if (this.supportContentTypes == null) {
            this.supportContentTypes = new ArrayList<>();
        }
        supportContentTypesSetter.accept(this.supportContentTypes);
        return this;
    }

    /**
     * **参数解释：** 支持的内容格式类型。 **取值范围：** 如 Text 等。 
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
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas) obj;
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
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentInputSchemas {\n");
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
