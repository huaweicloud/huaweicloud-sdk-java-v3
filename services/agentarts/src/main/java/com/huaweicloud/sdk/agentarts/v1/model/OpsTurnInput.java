package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 定义对话或记录中的一个具体轮次数据。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsTurnInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<OpsFieldValueInput> fields = null;

    public OpsTurnInput withFields(List<OpsFieldValueInput> fields) {
        this.fields = fields;
        return this;
    }

    public OpsTurnInput addFieldsItem(OpsFieldValueInput fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public OpsTurnInput withFields(Consumer<List<OpsFieldValueInput>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释：** 当前轮次中包含的具体数据字段（如Input、Output、Rationale 等）集合。 **约束限制：** 包含0到10000个字段项。 **取值范围：** 参考OpsFieldValueInput定义。 **默认取值：** 不涉及。 
     * @return fields
     */
    public List<OpsFieldValueInput> getFields() {
        return fields;
    }

    public void setFields(List<OpsFieldValueInput> fields) {
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
        OpsTurnInput that = (OpsTurnInput) obj;
        return Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTurnInput {\n");
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
