package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkConfig
 */
public class NetworkConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podCIDR")

    private String podCIDR;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceCIDR")

    private String serviceCIDR;

    public NetworkConfig withPodCIDR(String podCIDR) {
        this.podCIDR = podCIDR;
        return this;
    }

    /**
     * 容器网段
     * @return podCIDR
     */
    public String getPodCIDR() {
        return podCIDR;
    }

    public void setPodCIDR(String podCIDR) {
        this.podCIDR = podCIDR;
    }

    public NetworkConfig withServiceCIDR(String serviceCIDR) {
        this.serviceCIDR = serviceCIDR;
        return this;
    }

    /**
     * 服务网段
     * @return serviceCIDR
     */
    public String getServiceCIDR() {
        return serviceCIDR;
    }

    public void setServiceCIDR(String serviceCIDR) {
        this.serviceCIDR = serviceCIDR;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkConfig that = (NetworkConfig) obj;
        return Objects.equals(this.podCIDR, that.podCIDR) && Objects.equals(this.serviceCIDR, that.serviceCIDR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(podCIDR, serviceCIDR);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkConfig {\n");
        sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
        sb.append("    serviceCIDR: ").append(toIndentedString(serviceCIDR)).append("\n");
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
