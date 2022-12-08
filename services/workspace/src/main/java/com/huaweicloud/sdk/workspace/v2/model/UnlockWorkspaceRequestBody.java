package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 解除云办公服务锁定状态请求。
 */
public class UnlockWorkspaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    public UnlockWorkspaceRequestBody withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 解除项目锁定操作类型。
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnlockWorkspaceRequestBody unlockWorkspaceRequestBody = (UnlockWorkspaceRequestBody) o;
        return Objects.equals(this.operateType, unlockWorkspaceRequestBody.operateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnlockWorkspaceRequestBody {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
