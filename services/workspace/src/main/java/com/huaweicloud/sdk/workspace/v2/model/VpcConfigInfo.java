package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VPC配置信息。
 */
public class VpcConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_subnet_ids")

    private List<String> usedSubnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_access_vpc")

    private Boolean defaultAccessVpc;

    public VpcConfigInfo withUsedSubnetIds(List<String> usedSubnetIds) {
        this.usedSubnetIds = usedSubnetIds;
        return this;
    }

    public VpcConfigInfo addUsedSubnetIdsItem(String usedSubnetIdsItem) {
        if (this.usedSubnetIds == null) {
            this.usedSubnetIds = new ArrayList<>();
        }
        this.usedSubnetIds.add(usedSubnetIdsItem);
        return this;
    }

    public VpcConfigInfo withUsedSubnetIds(Consumer<List<String>> usedSubnetIdsSetter) {
        if (this.usedSubnetIds == null) {
            this.usedSubnetIds = new ArrayList<>();
        }
        usedSubnetIdsSetter.accept(this.usedSubnetIds);
        return this;
    }

    /**
     * 已使用的子网信息。
     * @return usedSubnetIds
     */
    public List<String> getUsedSubnetIds() {
        return usedSubnetIds;
    }

    public void setUsedSubnetIds(List<String> usedSubnetIds) {
        this.usedSubnetIds = usedSubnetIds;
    }

    public VpcConfigInfo withVpcId(String vpcId) {
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

    public VpcConfigInfo withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public VpcConfigInfo addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public VpcConfigInfo withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 子网ID列表
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public VpcConfigInfo withDefaultAccessVpc(Boolean defaultAccessVpc) {
        this.defaultAccessVpc = defaultAccessVpc;
        return this;
    }

    /**
     * 是否为默认接入VPC
     * @return defaultAccessVpc
     */
    public Boolean getDefaultAccessVpc() {
        return defaultAccessVpc;
    }

    public void setDefaultAccessVpc(Boolean defaultAccessVpc) {
        this.defaultAccessVpc = defaultAccessVpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcConfigInfo that = (VpcConfigInfo) obj;
        return Objects.equals(this.usedSubnetIds, that.usedSubnetIds) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.defaultAccessVpc, that.defaultAccessVpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedSubnetIds, vpcId, subnetIds, defaultAccessVpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcConfigInfo {\n");
        sb.append("    usedSubnetIds: ").append(toIndentedString(usedSubnetIds)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    defaultAccessVpc: ").append(toIndentedString(defaultAccessVpc)).append("\n");
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
