package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EvaluationOpsTurn
 */
public class EvaluationOpsTurn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turn_id")

    private String turnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<EvaluationOpsTurnField> fields = null;

    public EvaluationOpsTurn withTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }

    /**
     * **参数解释：** 单轮对话的唯一标识符（UUID）。 **约束限制：** 1-64个字符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 **默认取值：** 不涉及。 
     * @return turnId
     */
    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    public EvaluationOpsTurn withFields(List<EvaluationOpsTurnField> fields) {
        this.fields = fields;
        return this;
    }

    public EvaluationOpsTurn addFieldsItem(EvaluationOpsTurnField fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public EvaluationOpsTurn withFields(Consumer<List<EvaluationOpsTurnField>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释：** 当前对话轮次中的具体数据字段列表（如角色、内容等）。 **约束限制：** 包含0-10个字段项。 **取值范围：** 参考EvaluationOpsTurnField。 **默认取值：** 不涉及。 
     * @return fields
     */
    public List<EvaluationOpsTurnField> getFields() {
        return fields;
    }

    public void setFields(List<EvaluationOpsTurnField> fields) {
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
        EvaluationOpsTurn that = (EvaluationOpsTurn) obj;
        return Objects.equals(this.turnId, that.turnId) && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turnId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsTurn {\n");
        sb.append("    turnId: ").append(toIndentedString(turnId)).append("\n");
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
