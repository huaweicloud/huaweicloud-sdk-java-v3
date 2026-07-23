package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 定义对话或数据记录中的单次交互轮次。 **取值范围：** 不涉及。
 */
public class OpsTurn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private Map<String, OpsFieldValue> fields = null;

    public OpsTurn withFields(Map<String, OpsFieldValue> fields) {
        this.fields = fields;
        return this;
    }

    public OpsTurn putFieldsItem(String key, OpsFieldValue fieldsItem) {
        if (this.fields == null) {
            this.fields = new HashMap<>();
        }
        this.fields.put(key, fieldsItem);
        return this;
    }

    public OpsTurn withFields(Consumer<Map<String, OpsFieldValue>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new HashMap<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释：** 该轮次中具体字段的键值对集合。 **取值范围：** Map 结构，Value 参考OpsFieldValue定义。
     * @return fields
     */
    public Map<String, OpsFieldValue> getFields() {
        return fields;
    }

    public void setFields(Map<String, OpsFieldValue> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTurn that = (OpsTurn) obj;
        return Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTurn {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
