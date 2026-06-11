package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 条件节点执行条件。
 */
public class StepCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left")

    private Object left;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right")

    private Object right;

    public StepCondition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 判断类型，例如==（等于）、!=（不等于）、>（大于）、>=（大于等于）、<（小于）、<=（小于等于）、in（包含）、or（或）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StepCondition withLeft(Object left) {
        this.left = left;
        return this;
    }

    /**
     * 节点执行条件为true时的分支。
     * @return left
     */
    public Object getLeft() {
        return left;
    }

    public void setLeft(Object left) {
        this.left = left;
    }

    public StepCondition withRight(Object right) {
        this.right = right;
        return this;
    }

    /**
     * 节点执行条件为false时的分支。
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
        StepCondition that = (StepCondition) obj;
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
        sb.append("class StepCondition {\n");
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
