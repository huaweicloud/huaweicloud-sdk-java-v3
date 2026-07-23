package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_schema")

    private String jsonSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas withJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        return this;
    }

    /**
     * **参数解释：** JSON格式的出参描述。 **取值范围：** 不涉及。 
     * @return jsonSchema
     */
    public String getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 输出关键字。 **取值范围：** 不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas) obj;
        return Objects.equals(this.jsonSchema, that.jsonSchema) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonSchema, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentOutputSchemas {\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
