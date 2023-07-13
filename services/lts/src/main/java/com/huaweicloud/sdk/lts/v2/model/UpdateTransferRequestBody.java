package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTransferRequestBody
 */
public class UpdateTransferRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_id")

    private String logTransferId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_info")

    private UpdateTransferRequestBodyLogTransferInfo logTransferInfo;

    public UpdateTransferRequestBody withLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
        return this;
    }

    /**
     * 日志转储ID
     * @return logTransferId
     */
    public String getLogTransferId() {
        return logTransferId;
    }

    public void setLogTransferId(String logTransferId) {
        this.logTransferId = logTransferId;
    }

    public UpdateTransferRequestBody withLogTransferInfo(UpdateTransferRequestBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
        return this;
    }

    public UpdateTransferRequestBody withLogTransferInfo(
        Consumer<UpdateTransferRequestBodyLogTransferInfo> logTransferInfoSetter) {
        if (this.logTransferInfo == null) {
            this.logTransferInfo = new UpdateTransferRequestBodyLogTransferInfo();
            logTransferInfoSetter.accept(this.logTransferInfo);
        }

        return this;
    }

    /**
     * Get logTransferInfo
     * @return logTransferInfo
     */
    public UpdateTransferRequestBodyLogTransferInfo getLogTransferInfo() {
        return logTransferInfo;
    }

    public void setLogTransferInfo(UpdateTransferRequestBodyLogTransferInfo logTransferInfo) {
        this.logTransferInfo = logTransferInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTransferRequestBody that = (UpdateTransferRequestBody) obj;
        return Objects.equals(this.logTransferId, that.logTransferId)
            && Objects.equals(this.logTransferInfo, that.logTransferInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logTransferId, logTransferInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransferRequestBody {\n");
        sb.append("    logTransferId: ").append(toIndentedString(logTransferId)).append("\n");
        sb.append("    logTransferInfo: ").append(toIndentedString(logTransferInfo)).append("\n");
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
