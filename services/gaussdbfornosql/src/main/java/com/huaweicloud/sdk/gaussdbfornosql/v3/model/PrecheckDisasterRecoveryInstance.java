package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrecheckDisasterRecoveryInstance
 */
public class PrecheckDisasterRecoveryInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_cidr")

    private String vpcCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ips")

    private List<String> nodeIps = null;

    public PrecheckDisasterRecoveryInstance withVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    /**
     * 与当前实例建立容灾关系实例的vpc网段。
     * @return vpcCidr
     */
    public String getVpcCidr() {
        return vpcCidr;
    }

    public void setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
    }

    public PrecheckDisasterRecoveryInstance withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 与当前实例建立容灾关系实例的规格码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public PrecheckDisasterRecoveryInstance withNodeIps(List<String> nodeIps) {
        this.nodeIps = nodeIps;
        return this;
    }

    public PrecheckDisasterRecoveryInstance addNodeIpsItem(String nodeIpsItem) {
        if (this.nodeIps == null) {
            this.nodeIps = new ArrayList<>();
        }
        this.nodeIps.add(nodeIpsItem);
        return this;
    }

    public PrecheckDisasterRecoveryInstance withNodeIps(Consumer<List<String>> nodeIpsSetter) {
        if (this.nodeIps == null) {
            this.nodeIps = new ArrayList<>();
        }
        nodeIpsSetter.accept(this.nodeIps);
        return this;
    }

    /**
     * 与当前实例建立容灾关系实例的节点IP列表。
     * @return nodeIps
     */
    public List<String> getNodeIps() {
        return nodeIps;
    }

    public void setNodeIps(List<String> nodeIps) {
        this.nodeIps = nodeIps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrecheckDisasterRecoveryInstance precheckDisasterRecoveryInstance = (PrecheckDisasterRecoveryInstance) o;
        return Objects.equals(this.vpcCidr, precheckDisasterRecoveryInstance.vpcCidr)
            && Objects.equals(this.specCode, precheckDisasterRecoveryInstance.specCode)
            && Objects.equals(this.nodeIps, precheckDisasterRecoveryInstance.nodeIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcCidr, specCode, nodeIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrecheckDisasterRecoveryInstance {\n");
        sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    nodeIps: ").append(toIndentedString(nodeIps)).append("\n");
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
