package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImportOpsResultsRequestBodySchemaMapping
 */
public class ImportOpsResultsRequestBodySchemaMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ImportOpsResultsRequestBodySchemaMapping withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 源任务结果中的原始字段键名。 **约束限制：** 1-255个字符。 **取值范围：** 合法的字段键。 **默认取值：** 不涉及。 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ImportOpsResultsRequestBodySchemaMapping withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * **参数解释：** 目标评测集定义的字段键名。 **约束限制：** 1-255个字符。 **取值范围：** 字符长度1-255，目标Schema定义的键。 **默认取值：** 不涉及。 
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ImportOpsResultsRequestBodySchemaMapping withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 字段的数据类型，确保数据校验准确性。 **约束限制：** 1-64个字符。 **取值范围：** 1-64个字符，String, Integer 等。 **默认取值：** 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportOpsResultsRequestBodySchemaMapping that = (ImportOpsResultsRequestBodySchemaMapping) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.target, that.target)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOpsResultsRequestBodySchemaMapping {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
