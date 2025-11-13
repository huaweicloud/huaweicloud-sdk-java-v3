package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchUpdatePublicRecordsetsConditionvalue
 */
public class BatchUpdatePublicRecordsetsConditionvalue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public BatchUpdatePublicRecordsetsConditionvalue withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * **参数解释：** 条件信息的键。 **约束限制：** 不涉及。 **取值范围：** - host_name：主机记录。  **默认取值：** 不涉及。
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public BatchUpdatePublicRecordsetsConditionvalue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 条件信息的值。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdatePublicRecordsetsConditionvalue that = (BatchUpdatePublicRecordsetsConditionvalue) obj;
        return Objects.equals(this.condition, that.condition) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePublicRecordsetsConditionvalue {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
