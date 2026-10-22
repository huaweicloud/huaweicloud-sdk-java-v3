package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：权限策略中的action详情，包含action操作和对应的描述。 
 */
public class ActionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_description")

    private String actionDescription;

    public ActionDetail withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：权限操作内容。 **取值范围**：只能由英文字母、数字、冒号及特殊字符组成，长度0~128个字符。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ActionDetail withActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
        return this;
    }

    /**
     * **参数解释**：权限操作的描述，说明该操作的具体含义。 **取值范围**：支持中文字符、英文字母、数字及特殊字符，长度0~1024个字符。
     * @return actionDescription
     */
    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionDetail that = (ActionDetail) obj;
        return Objects.equals(this.action, that.action)
            && Objects.equals(this.actionDescription, that.actionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, actionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDetail {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
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
