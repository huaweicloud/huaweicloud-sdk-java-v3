package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重试任务请求。
 */
public class JobActionsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_type")

    private String opType;

    public JobActionsReq withOpType(String opType) {
        this.opType = opType;
        return this;
    }

    /**
     * 操作类型。retry代表重试。
     * @return opType
     */
    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobActionsReq that = (JobActionsReq) obj;
        return Objects.equals(this.opType, that.opType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobActionsReq {\n");
        sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
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
