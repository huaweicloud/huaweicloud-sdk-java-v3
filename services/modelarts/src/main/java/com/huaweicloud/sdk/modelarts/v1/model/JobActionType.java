package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对训练作业的操作请求体。终止训练作业请使用terminate。
 */
public class JobActionType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    public JobActionType withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 对训练作业的操作请求。参数值设置为terminate时，表示终止训练作业操作。
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobActionType that = (JobActionType) obj;
        return Objects.equals(this.actionType, that.actionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobActionType {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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
