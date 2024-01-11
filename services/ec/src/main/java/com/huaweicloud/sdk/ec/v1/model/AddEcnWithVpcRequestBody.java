package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddEcnWithVpcRequestBody
 */
public class AddEcnWithVpcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnet_list")

    private List<String> localSubnetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_project_id")

    private String regionProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public AddEcnWithVpcRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AddEcnWithVpcRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public AddEcnWithVpcRequestBody withLocalSubnetList(List<String> localSubnetList) {
        this.localSubnetList = localSubnetList;
        return this;
    }

    public AddEcnWithVpcRequestBody addLocalSubnetListItem(String localSubnetListItem) {
        if (this.localSubnetList == null) {
            this.localSubnetList = new ArrayList<>();
        }
        this.localSubnetList.add(localSubnetListItem);
        return this;
    }

    public AddEcnWithVpcRequestBody withLocalSubnetList(Consumer<List<String>> localSubnetListSetter) {
        if (this.localSubnetList == null) {
            this.localSubnetList = new ArrayList<>();
        }
        localSubnetListSetter.accept(this.localSubnetList);
        return this;
    }

    /**
     * 本端子网列表
     * @return localSubnetList
     */
    public List<String> getLocalSubnetList() {
        return localSubnetList;
    }

    public void setLocalSubnetList(List<String> localSubnetList) {
        this.localSubnetList = localSubnetList;
    }

    public AddEcnWithVpcRequestBody withRegionProjectId(String regionProjectId) {
        this.regionProjectId = regionProjectId;
        return this;
    }

    /**
     * 虚拟私有云区域项目ID
     * @return regionProjectId
     */
    public String getRegionProjectId() {
        return regionProjectId;
    }

    public void setRegionProjectId(String regionProjectId) {
        this.regionProjectId = regionProjectId;
    }

    public AddEcnWithVpcRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddEcnWithVpcRequestBody that = (AddEcnWithVpcRequestBody) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.localSubnetList, that.localSubnetList)
            && Objects.equals(this.regionProjectId, that.regionProjectId)
            && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetId, localSubnetList, regionProjectId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEcnWithVpcRequestBody {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    localSubnetList: ").append(toIndentedString(localSubnetList)).append("\n");
        sb.append("    regionProjectId: ").append(toIndentedString(regionProjectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
