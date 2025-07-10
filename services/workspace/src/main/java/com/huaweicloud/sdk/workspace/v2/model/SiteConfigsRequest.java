package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SiteConfigsRequest
 */
public class SiteConfigsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_config")

    private NetworkConfigReq networkConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config")

    private AccessConfigReq accessConfig;

    public SiteConfigsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 开通服务资源使用的可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public SiteConfigsRequest withNetworkConfig(NetworkConfigReq networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    public SiteConfigsRequest withNetworkConfig(Consumer<NetworkConfigReq> networkConfigSetter) {
        if (this.networkConfig == null) {
            this.networkConfig = new NetworkConfigReq();
            networkConfigSetter.accept(this.networkConfig);
        }

        return this;
    }

    /**
     * Get networkConfig
     * @return networkConfig
     */
    public NetworkConfigReq getNetworkConfig() {
        return networkConfig;
    }

    public void setNetworkConfig(NetworkConfigReq networkConfig) {
        this.networkConfig = networkConfig;
    }

    public SiteConfigsRequest withAccessConfig(AccessConfigReq accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }

    public SiteConfigsRequest withAccessConfig(Consumer<AccessConfigReq> accessConfigSetter) {
        if (this.accessConfig == null) {
            this.accessConfig = new AccessConfigReq();
            accessConfigSetter.accept(this.accessConfig);
        }

        return this;
    }

    /**
     * Get accessConfig
     * @return accessConfig
     */
    public AccessConfigReq getAccessConfig() {
        return accessConfig;
    }

    public void setAccessConfig(AccessConfigReq accessConfig) {
        this.accessConfig = accessConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteConfigsRequest that = (SiteConfigsRequest) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.networkConfig, that.networkConfig)
            && Objects.equals(this.accessConfig, that.accessConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, networkConfig, accessConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteConfigsRequest {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    accessConfig: ").append(toIndentedString(accessConfig)).append("\n");
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
