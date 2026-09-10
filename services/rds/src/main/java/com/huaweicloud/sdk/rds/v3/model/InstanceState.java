package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例状态
 */
public class InstanceState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_restart_for_params")

    private Boolean waitRestartForParams;

    public InstanceState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceState withWaitRestartForParams(Boolean waitRestartForParams) {
        this.waitRestartForParams = waitRestartForParams;
        return this;
    }

    /**
     * 参数变更，是否需要重启
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
        InstanceState that = (InstanceState) obj;
        return Objects.equals(this.status, that.status)
            && Objects.equals(this.waitRestartForParams, that.waitRestartForParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, waitRestartForParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceState {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
