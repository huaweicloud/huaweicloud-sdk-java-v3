package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 条件节点执行条件。
 */
public class StepConditionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left")

    private Object left;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right")

    private Object right;

    public StepConditionResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：判断类型，例如==（等于）、!=（不等于）、>（大于）、>=（大于等于）、<（小于）、<=（小于等于）、in（包含）、or（或）。 **取值范围**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StepConditionResp withLeft(Object left) {
        this.left = left;
        return this;
    }

    /**
     * **参数解释**：节点执行条件为true时的分支。
     * @return left
     */
    public Object getLeft() {
        return left;
    }

    public void setLeft(Object left) {
        this.left = left;
    }

    public StepConditionResp withRight(Object right) {
        this.right = right;
        return this;
    }

    /**
     * **参数解释**：节点执行条件为false时的分支。
     * @return right
     */
    public Object getRight() {
        return right;
    }

    public void setRight(Object right) {
        this.right = right;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StepConditionResp that = (StepConditionResp) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.left, that.left)
            && Objects.equals(this.right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, left, right);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepConditionResp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
