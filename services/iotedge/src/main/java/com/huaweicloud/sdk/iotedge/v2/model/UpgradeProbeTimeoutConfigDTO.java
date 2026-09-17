package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradeProbeTimeoutConfigDTO
 */
public class UpgradeProbeTimeoutConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_threshold")

    private Integer failureThreshold;

    public UpgradeProbeTimeoutConfigDTO withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间
     * minimum: 5
     * maximum: 120
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public UpgradeProbeTimeoutConfigDTO withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * 失败阈值
     * minimum: 1
     * maximum: 100
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeProbeTimeoutConfigDTO that = (UpgradeProbeTimeoutConfigDTO) obj;
        return Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.failureThreshold, that.failureThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeout, failureThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeProbeTimeoutConfigDTO {\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
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
