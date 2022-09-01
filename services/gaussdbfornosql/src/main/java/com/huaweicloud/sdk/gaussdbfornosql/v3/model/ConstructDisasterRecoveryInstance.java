package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConstructDisasterRecoveryInstance
 */
public class ConstructDisasterRecoveryInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    @JacksonXmlProperty(localName = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidrs")

    @JacksonXmlProperty(localName = "subnet_cidrs")

    private List<String> subnetCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ips")

    @JacksonXmlProperty(localName = "node_ips")

    private List<String> nodeIps = null;

    public ConstructDisasterRecoveryInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾实例的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConstructDisasterRecoveryInstance withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 容灾实例所在Region的code。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ConstructDisasterRecoveryInstance withSubnetCidrs(List<String> subnetCidrs) {
        this.subnetCidrs = subnetCidrs;
        return this;
    }

    public ConstructDisasterRecoveryInstance addSubnetCidrsItem(String subnetCidrsItem) {
        if (this.subnetCidrs == null) {
            this.subnetCidrs = new ArrayList<>();
        }
        this.subnetCidrs.add(subnetCidrsItem);
        return this;
    }

    public ConstructDisasterRecoveryInstance withSubnetCidrs(Consumer<List<String>> subnetCidrsSetter) {
        if (this.subnetCidrs == null) {
            this.subnetCidrs = new ArrayList<>();
        }
        subnetCidrsSetter.accept(this.subnetCidrs);
        return this;
    }

    /**
     * 与当前实例建立容灾关系实例所在子网的CIDR列表。
     * @return subnetCidrs
     */
    public List<String> getSubnetCidrs() {
        return subnetCidrs;
    }

    public void setSubnetCidrs(List<String> subnetCidrs) {
        this.subnetCidrs = subnetCidrs;
    }

    public ConstructDisasterRecoveryInstance withNodeIps(List<String> nodeIps) {
        this.nodeIps = nodeIps;
        return this;
    }

    public ConstructDisasterRecoveryInstance addNodeIpsItem(String nodeIpsItem) {
        if (this.nodeIps == null) {
            this.nodeIps = new ArrayList<>();
        }
        this.nodeIps.add(nodeIpsItem);
        return this;
    }

    public ConstructDisasterRecoveryInstance withNodeIps(Consumer<List<String>> nodeIpsSetter) {
        if (this.nodeIps == null) {
            this.nodeIps = new ArrayList<>();
        }
        nodeIpsSetter.accept(this.nodeIps);
        return this;
    }

    /**
     * 与当前实例建立容灾关系实例的所有节点的IP列表。
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
        ConstructDisasterRecoveryInstance constructDisasterRecoveryInstance = (ConstructDisasterRecoveryInstance) o;
        return Objects.equals(this.id, constructDisasterRecoveryInstance.id)
            && Objects.equals(this.regionCode, constructDisasterRecoveryInstance.regionCode)
            && Objects.equals(this.subnetCidrs, constructDisasterRecoveryInstance.subnetCidrs)
            && Objects.equals(this.nodeIps, constructDisasterRecoveryInstance.nodeIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regionCode, subnetCidrs, nodeIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConstructDisasterRecoveryInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    subnetCidrs: ").append(toIndentedString(subnetCidrs)).append("\n");
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
