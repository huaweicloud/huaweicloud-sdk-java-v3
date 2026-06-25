package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量创建信息。
 */
public class CreatingStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreatingStep withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释**：超节点的步长。仅支持资源规格详情中包含的步长。 **取值范围**：不涉及。
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public CreatingStep withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：批量创建类型。 **取值范围**：可选值如下： - hyperinstance：超节点。
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
        CreatingStep that = (CreatingStep) obj;
        return Objects.equals(this.step, that.step) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(step, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatingStep {\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
