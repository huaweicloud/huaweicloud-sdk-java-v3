package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CCE组件
 */
public class ComCCE {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private Detail cluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private Detail network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private Detail securityGroup;

    public ComCCE withCluster(Detail cluster) {
        this.cluster = cluster;
        return this;
    }

    public ComCCE withCluster(Consumer<Detail> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new Detail();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    public Detail getCluster() {
        return cluster;
    }

    public void setCluster(Detail cluster) {
        this.cluster = cluster;
    }

    public ComCCE withNetwork(Detail network) {
        this.network = network;
        return this;
    }

    public ComCCE withNetwork(Consumer<Detail> networkSetter) {
        if (this.network == null) {
            this.network = new Detail();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public Detail getNetwork() {
        return network;
    }

    public void setNetwork(Detail network) {
        this.network = network;
    }

    public ComCCE withSecurityGroup(Detail securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public ComCCE withSecurityGroup(Consumer<Detail> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new Detail();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    /**
     * Get securityGroup
     * @return securityGroup
     */
    public Detail getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(Detail securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComCCE comCCE = (ComCCE) o;
        return Objects.equals(this.cluster, comCCE.cluster) && Objects.equals(this.network, comCCE.network)
            && Objects.equals(this.securityGroup, comCCE.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster, network, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComCCE {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
