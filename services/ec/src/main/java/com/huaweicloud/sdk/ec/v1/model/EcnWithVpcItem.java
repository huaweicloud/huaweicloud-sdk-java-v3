package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EcnWithVpcItem
 */
public class EcnWithVpcItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "remote_subnet_list")

    private List<String> remoteSubnetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public EcnWithVpcItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 企业连接网络关联虚拟私有云ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EcnWithVpcItem withVpcId(String vpcId) {
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

    public EcnWithVpcItem withSubnetId(String subnetId) {
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

    public EcnWithVpcItem withLocalSubnetList(List<String> localSubnetList) {
        this.localSubnetList = localSubnetList;
        return this;
    }

    public EcnWithVpcItem addLocalSubnetListItem(String localSubnetListItem) {
        if (this.localSubnetList == null) {
            this.localSubnetList = new ArrayList<>();
        }
        this.localSubnetList.add(localSubnetListItem);
        return this;
    }

    public EcnWithVpcItem withLocalSubnetList(Consumer<List<String>> localSubnetListSetter) {
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

    public EcnWithVpcItem withRemoteSubnetList(List<String> remoteSubnetList) {
        this.remoteSubnetList = remoteSubnetList;
        return this;
    }

    public EcnWithVpcItem addRemoteSubnetListItem(String remoteSubnetListItem) {
        if (this.remoteSubnetList == null) {
            this.remoteSubnetList = new ArrayList<>();
        }
        this.remoteSubnetList.add(remoteSubnetListItem);
        return this;
    }

    public EcnWithVpcItem withRemoteSubnetList(Consumer<List<String>> remoteSubnetListSetter) {
        if (this.remoteSubnetList == null) {
            this.remoteSubnetList = new ArrayList<>();
        }
        remoteSubnetListSetter.accept(this.remoteSubnetList);
        return this;
    }

    /**
     * 对端子网列表
     * @return remoteSubnetList
     */
    public List<String> getRemoteSubnetList() {
        return remoteSubnetList;
    }

    public void setRemoteSubnetList(List<String> remoteSubnetList) {
        this.remoteSubnetList = remoteSubnetList;
    }

    public EcnWithVpcItem withRegionId(String regionId) {
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

    public EcnWithVpcItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EcnWithVpcItem withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EcnWithVpcItem that = (EcnWithVpcItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.localSubnetList, that.localSubnetList)
            && Objects.equals(this.remoteSubnetList, that.remoteSubnetList)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vpcId, subnetId, localSubnetList, remoteSubnetList, regionId, status, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcnWithVpcItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    localSubnetList: ").append(toIndentedString(localSubnetList)).append("\n");
        sb.append("    remoteSubnetList: ").append(toIndentedString(remoteSubnetList)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
