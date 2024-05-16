package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HTAP实例状态信息。
 */
public class HtapInstanceListInstanceState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_fail_error_code")

    private String createFailErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_message")

    private String failMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_restart_for_params")

    private Boolean waitRestartForParams;

    public HtapInstanceListInstanceState withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * HTAP实例状态。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public HtapInstanceListInstanceState withCreateFailErrorCode(String createFailErrorCode) {
        this.createFailErrorCode = createFailErrorCode;
        return this;
    }

    /**
     * HTAP实例创建失败错误码。
     * @return createFailErrorCode
     */
    public String getCreateFailErrorCode() {
        return createFailErrorCode;
    }

    public void setCreateFailErrorCode(String createFailErrorCode) {
        this.createFailErrorCode = createFailErrorCode;
    }

    public HtapInstanceListInstanceState withFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }

    /**
     * HTAP实例创建失败错误信息。
     * @return failMessage
     */
    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }

    public HtapInstanceListInstanceState withWaitRestartForParams(Boolean waitRestartForParams) {
        this.waitRestartForParams = waitRestartForParams;
        return this;
    }

    /**
     * 是否需要重启更新参数。
     * @return waitRestartForParams
     */
    public Boolean getWaitRestartForParams() {
        return waitRestartForParams;
    }

    public void setWaitRestartForParams(Boolean waitRestartForParams) {
        this.waitRestartForParams = waitRestartForParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapInstanceListInstanceState that = (HtapInstanceListInstanceState) obj;
        return Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.createFailErrorCode, that.createFailErrorCode)
            && Objects.equals(this.failMessage, that.failMessage)
            && Objects.equals(this.waitRestartForParams, that.waitRestartForParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceStatus, createFailErrorCode, failMessage, waitRestartForParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapInstanceListInstanceState {\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    createFailErrorCode: ").append(toIndentedString(createFailErrorCode)).append("\n");
        sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
        sb.append("    waitRestartForParams: ").append(toIndentedString(waitRestartForParams)).append("\n");
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
