package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点网络配置。
 */
public class NodeNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private String subnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityGroups")

    private List<String> securityGroups = null;

    public NodeNetwork withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * **参数解释**：vpc id。 **取值范围**：不涉及。
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public NodeNetwork withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * **参数解释**：子网id。 **取值范围**：不涉及。
     * @return subnet
     */
    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public NodeNetwork withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NodeNetwork addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NodeNetwork withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * **参数解释**：安全组id集合。
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeNetwork that = (NodeNetwork) obj;
        return Objects.equals(this.vpc, that.vpc) && Objects.equals(this.subnet, that.subnet)
            && Objects.equals(this.securityGroups, that.securityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpc, subnet, securityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeNetwork {\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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
