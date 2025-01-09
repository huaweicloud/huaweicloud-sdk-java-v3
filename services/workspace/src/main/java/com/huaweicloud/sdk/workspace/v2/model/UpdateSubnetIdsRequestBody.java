package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateSubnetIdsRequestBody
 */
public class UpdateSubnetIdsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_config_infos")

    private List<VpcConfigInfo> vpcConfigInfos = null;

    public UpdateSubnetIdsRequestBody withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public UpdateSubnetIdsRequestBody addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public UpdateSubnetIdsRequestBody withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 业务子网id
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public UpdateSubnetIdsRequestBody withVpcConfigInfos(List<VpcConfigInfo> vpcConfigInfos) {
        this.vpcConfigInfos = vpcConfigInfos;
        return this;
    }

    public UpdateSubnetIdsRequestBody addVpcConfigInfosItem(VpcConfigInfo vpcConfigInfosItem) {
        if (this.vpcConfigInfos == null) {
            this.vpcConfigInfos = new ArrayList<>();
        }
        this.vpcConfigInfos.add(vpcConfigInfosItem);
        return this;
    }

    public UpdateSubnetIdsRequestBody withVpcConfigInfos(Consumer<List<VpcConfigInfo>> vpcConfigInfosSetter) {
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
        UpdateSubnetIdsRequestBody that = (UpdateSubnetIdsRequestBody) obj;
        return Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.vpcConfigInfos, that.vpcConfigInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetIds, vpcConfigInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetIdsRequestBody {\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
