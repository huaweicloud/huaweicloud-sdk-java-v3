package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteTransferRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_id")

    private String logTransferId;

    public DeleteTransferRequest withLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
        return this;
    }

    /** 日志转储ID。获取ID有3种方式： 1. 调用查询日志转储接口，返回值有日志转储ID 2. 调用新增日志转储接口，返回值有日志转储ID 3. 调用删除日志转储接口，返回值有日志转储ID
     * 
     * @return logTransferId */
    public String getLogTransferId() {
        return logTransferId;
    }

    public void setLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTransferRequest deleteTransferRequest = (DeleteTransferRequest) o;
        return Objects.equals(this.logTransferId, deleteTransferRequest.logTransferId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logTransferId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTransferRequest {\n");
        sb.append("    logTransferId: ").append(toIndentedString(logTransferId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
