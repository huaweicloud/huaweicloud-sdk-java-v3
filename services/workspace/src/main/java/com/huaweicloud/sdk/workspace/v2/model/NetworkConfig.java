package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络信息
 */
public class NetworkConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_subnet_cidr")

    private String managementSubnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_node_subnet_id")

    private String managementNodeSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_config_infos")

    private List<VpcConfigInfo> vpcConfigInfos = null;

    public NetworkConfig withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public NetworkConfig withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * VPC名称
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public NetworkConfig withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public NetworkConfig addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public NetworkConfig withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 业务子网，可以指定返回的网络ID订购桌面
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public NetworkConfig withManagementSubnetCidr(String managementSubnetCidr) {
        this.managementSubnetCidr = managementSubnetCidr;
        return this;
    }

    /**
     * 后端管理组件占用的子网网段
     * @return managementSubnetCidr
     */
    public String getManagementSubnetCidr() {
        return managementSubnetCidr;
    }

    public void setManagementSubnetCidr(String managementSubnetCidr) {
        this.managementSubnetCidr = managementSubnetCidr;
    }

    public NetworkConfig withManagementNodeSubnetId(String managementNodeSubnetId) {
        this.managementNodeSubnetId = managementNodeSubnetId;
        return this;
    }

    /**
     * subnet_ids所返回的业务子网中,被管理节点所占用的子网id
     * @return managementNodeSubnetId
     */
    public String getManagementNodeSubnetId() {
        return managementNodeSubnetId;
    }

    public void setManagementNodeSubnetId(String managementNodeSubnetId) {
        this.managementNodeSubnetId = managementNodeSubnetId;
    }

    public NetworkConfig withVpcConfigInfos(List<VpcConfigInfo> vpcConfigInfos) {
        this.vpcConfigInfos = vpcConfigInfos;
        return this;
    }

    public NetworkConfig addVpcConfigInfosItem(VpcConfigInfo vpcConfigInfosItem) {
        if (this.vpcConfigInfos == null) {
            this.vpcConfigInfos = new ArrayList<>();
        }
        this.vpcConfigInfos.add(vpcConfigInfosItem);
        return this;
    }

    public NetworkConfig withVpcConfigInfos(Consumer<List<VpcConfigInfo>> vpcConfigInfosSetter) {
        if (this.vpcConfigInfos == null) {
            this.vpcConfigInfos = new ArrayList<>();
        }
        vpcConfigInfosSetter.accept(this.vpcConfigInfos);
        return this;
    }

    /**
     * VPC配置信息列表。
     * @return vpcConfigInfos
     */
    public List<VpcConfigInfo> getVpcConfigInfos() {
        return vpcConfigInfos;
    }

    public void setVpcConfigInfos(List<VpcConfigInfo> vpcConfigInfos) {
        this.vpcConfigInfos = vpcConfigInfos;
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
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.vpcName, that.vpcName)
            && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.managementSubnetCidr, that.managementSubnetCidr)
            && Objects.equals(this.managementNodeSubnetId, that.managementNodeSubnetId)
            && Objects.equals(this.vpcConfigInfos, that.vpcConfigInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, vpcName, subnetIds, managementSubnetCidr, managementNodeSubnetId, vpcConfigInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkConfig {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    managementSubnetCidr: ").append(toIndentedString(managementSubnetCidr)).append("\n");
        sb.append("    managementNodeSubnetId: ").append(toIndentedString(managementNodeSubnetId)).append("\n");
        sb.append("    vpcConfigInfos: ").append(toIndentedString(vpcConfigInfos)).append("\n");
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
