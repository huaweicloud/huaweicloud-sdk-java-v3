package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 调用链采集配置。 
 */
public class CoreRunTracingObservabilityConfigResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group")

    private String serviceGroup;

    public CoreRunTracingObservabilityConfigResp withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否开启调用链采集，默认为false。 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CoreRunTracingObservabilityConfigResp withServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }

    /**
     * **参数解释**: 调用链服务应用名。 
     * @return serviceGroup
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunTracingObservabilityConfigResp that = (CoreRunTracingObservabilityConfigResp) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.serviceGroup, that.serviceGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, serviceGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunTracingObservabilityConfigResp {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
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
