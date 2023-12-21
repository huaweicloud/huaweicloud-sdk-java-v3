package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建边缘实例网络信息。
 */
public class NetConfigInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<SubnetConfig> subnets = null;

    public NetConfigInstance withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 边缘网络ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public NetConfigInstance withSubnets(List<SubnetConfig> subnets) {
        this.subnets = subnets;
        return this;
    }

    public NetConfigInstance addSubnetsItem(SubnetConfig subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public NetConfigInstance withSubnets(Consumer<List<SubnetConfig>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 待创建边缘实例子网信息。  需要指定vpcid对应VPC下已创建的子网（subnet）的网络ID，UUID格式。
     * @return subnets
     */
    public List<SubnetConfig> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<SubnetConfig> subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetConfigInstance that = (NetConfigInstance) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnets, that.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetConfigInstance {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
