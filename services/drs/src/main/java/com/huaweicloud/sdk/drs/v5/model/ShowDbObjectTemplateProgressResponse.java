package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDbObjectTemplateProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_success")

    private Boolean sendSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parsed_success_number")

    private String parsedSuccessNumber;

    public ShowDbObjectTemplateProgressResponse withSendSuccess(Boolean sendSuccess) {
        this.sendSuccess = sendSuccess;
        return this;
    }

    /**
     * 是否上传完成。
     * @return sendSuccess
     */
    public Boolean getSendSuccess() {
        return sendSuccess;
    }

    public void setSendSuccess(Boolean sendSuccess) {
        this.sendSuccess = sendSuccess;
    }

    public ShowDbObjectTemplateProgressResponse withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 文件解析状态。 取值：success，failed
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public ShowDbObjectTemplateProgressResponse withParsedSuccessNumber(String parsedSuccessNumber) {
        this.parsedSuccessNumber = parsedSuccessNumber;
        return this;
    }

    /**
     * 解析成功的行数。
     * @return parsedSuccessNumber
     */
    public String getParsedSuccessNumber() {
        return parsedSuccessNumber;
    }

    public void setParsedSuccessNumber(String parsedSuccessNumber) {
        this.parsedSuccessNumber = parsedSuccessNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDbObjectTemplateProgressResponse that = (ShowDbObjectTemplateProgressResponse) obj;
        return Objects.equals(this.sendSuccess, that.sendSuccess)
            && Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.parsedSuccessNumber, that.parsedSuccessNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendSuccess, processStatus, parsedSuccessNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDbObjectTemplateProgressResponse {\n");
        sb.append("    sendSuccess: ").append(toIndentedString(sendSuccess)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    parsedSuccessNumber: ").append(toIndentedString(parsedSuccessNumber)).append("\n");
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
