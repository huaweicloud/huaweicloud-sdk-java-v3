package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMonitorItemDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    private Long xBusinessId;

    public ShowMonitorItemDetailRequest withMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }

    /**
     * 监控项ID
     * @return monitorItemId
     */
    public Long getMonitorItemId() {
        return monitorItemId;
    }

    public void setMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
    }

    public ShowMonitorItemDetailRequest withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境ID
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public ShowMonitorItemDetailRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * Get xBusinessId
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonitorItemDetailRequest that = (ShowMonitorItemDetailRequest) obj;
        return Objects.equals(this.monitorItemId, that.monitorItemId) && Objects.equals(this.envId, that.envId)
            && Objects.equals(this.xBusinessId, that.xBusinessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorItemId, envId, xBusinessId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonitorItemDetailRequest {\n");
        sb.append("    monitorItemId: ").append(toIndentedString(monitorItemId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
