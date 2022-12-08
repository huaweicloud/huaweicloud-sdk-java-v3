package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteTerminalsBindingDesktopsResult
 */
public class DeleteTerminalsBindingDesktopsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_result_code")

    private String deleteResultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_result_msg")

    private String deleteResultMsg;

    public DeleteTerminalsBindingDesktopsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 需删除的策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteTerminalsBindingDesktopsResult withDeleteResultCode(String deleteResultCode) {
        this.deleteResultCode = deleteResultCode;
        return this;
    }

    /**
     * 删除操作的结果码
     * @return deleteResultCode
     */
    public String getDeleteResultCode() {
        return deleteResultCode;
    }

    public void setDeleteResultCode(String deleteResultCode) {
        this.deleteResultCode = deleteResultCode;
    }

    public DeleteTerminalsBindingDesktopsResult withDeleteResultMsg(String deleteResultMsg) {
        this.deleteResultMsg = deleteResultMsg;
        return this;
    }

    /**
     * 删除操作的结果信息
     * @return deleteResultMsg
     */
    public String getDeleteResultMsg() {
        return deleteResultMsg;
    }

    public void setDeleteResultMsg(String deleteResultMsg) {
        this.deleteResultMsg = deleteResultMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTerminalsBindingDesktopsResult deleteTerminalsBindingDesktopsResult =
            (DeleteTerminalsBindingDesktopsResult) o;
        return Objects.equals(this.id, deleteTerminalsBindingDesktopsResult.id)
            && Objects.equals(this.deleteResultCode, deleteTerminalsBindingDesktopsResult.deleteResultCode)
            && Objects.equals(this.deleteResultMsg, deleteTerminalsBindingDesktopsResult.deleteResultMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleteResultCode, deleteResultMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTerminalsBindingDesktopsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleteResultCode: ").append(toIndentedString(deleteResultCode)).append("\n");
        sb.append("    deleteResultMsg: ").append(toIndentedString(deleteResultMsg)).append("\n");
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
