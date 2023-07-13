package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 函数网络配置。
 */
public class NetworkControlConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_public_network")

    private Boolean disablePublicNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_access_vpcs")

    private List<VpcConfig> triggerAccessVpcs = null;

    public NetworkControlConfig withDisablePublicNetwork(Boolean disablePublicNetwork) {
        this.disablePublicNetwork = disablePublicNetwork;
        return this;
    }

    /**
     * 禁止公网访问开关。
     * @return disablePublicNetwork
     */
    public Boolean getDisablePublicNetwork() {
        return disablePublicNetwork;
    }

    public void setDisablePublicNetwork(Boolean disablePublicNetwork) {
        this.disablePublicNetwork = disablePublicNetwork;
    }

    public NetworkControlConfig withTriggerAccessVpcs(List<VpcConfig> triggerAccessVpcs) {
        this.triggerAccessVpcs = triggerAccessVpcs;
        return this;
    }

    public NetworkControlConfig addTriggerAccessVpcsItem(VpcConfig triggerAccessVpcsItem) {
        if (this.triggerAccessVpcs == null) {
            this.triggerAccessVpcs = new ArrayList<>();
        }
        this.triggerAccessVpcs.add(triggerAccessVpcsItem);
        return this;
    }

    public NetworkControlConfig withTriggerAccessVpcs(Consumer<List<VpcConfig>> triggerAccessVpcsSetter) {
        if (this.triggerAccessVpcs == null) {
            this.triggerAccessVpcs = new ArrayList<>();
        }
        triggerAccessVpcsSetter.accept(this.triggerAccessVpcs);
        return this;
    }

    /**
     * 指定触发函数vpc配置。
     * @return triggerAccessVpcs
     */
    public List<VpcConfig> getTriggerAccessVpcs() {
        return triggerAccessVpcs;
    }

    public void setTriggerAccessVpcs(List<VpcConfig> triggerAccessVpcs) {
        this.triggerAccessVpcs = triggerAccessVpcs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkControlConfig that = (NetworkControlConfig) obj;
        return Objects.equals(this.disablePublicNetwork, that.disablePublicNetwork)
            && Objects.equals(this.triggerAccessVpcs, that.triggerAccessVpcs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disablePublicNetwork, triggerAccessVpcs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkControlConfig {\n");
        sb.append("    disablePublicNetwork: ").append(toIndentedString(disablePublicNetwork)).append("\n");
        sb.append("    triggerAccessVpcs: ").append(toIndentedString(triggerAccessVpcs)).append("\n");
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
