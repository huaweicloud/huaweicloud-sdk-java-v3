package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowResponseP2cVgw
 */
public class ShowResponseP2cVgw {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_subnet")

    private String connectSubnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private ResponseEipInfo eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection_number")

    private Integer maxConnectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_connection_number")

    private Integer currentConnectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_effect")

    private Integer frozenEffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied_at")

    private OffsetDateTime appliedAt;

    public ShowResponseP2cVgw withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * P2C VPN网关ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowResponseP2cVgw withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * P2C VPN网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowResponseP2cVgw withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * P2C VPN网关状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowResponseP2cVgw withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * P2C VPN网关所连接的VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowResponseP2cVgw withConnectSubnet(String connectSubnet) {
        this.connectSubnet = connectSubnet;
        return this;
    }

    /**
     * P2C VPN网关所使用的VPC子网ID
     * @return connectSubnet
     */
    public String getConnectSubnet() {
        return connectSubnet;
    }

    public void setConnectSubnet(String connectSubnet) {
        this.connectSubnet = connectSubnet;
    }

    public ShowResponseP2cVgw withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * P2C VPN网关的规格类型
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ShowResponseP2cVgw withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public ShowResponseP2cVgw addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public ShowResponseP2cVgw withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 可用区列表
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public ShowResponseP2cVgw withEip(ResponseEipInfo eip) {
        this.eip = eip;
        return this;
    }

    public ShowResponseP2cVgw withEip(Consumer<ResponseEipInfo> eipSetter) {
        if (this.eip == null) {
            this.eip = new ResponseEipInfo();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public ResponseEipInfo getEip() {
        return eip;
    }

    public void setEip(ResponseEipInfo eip) {
        this.eip = eip;
    }

    public ShowResponseP2cVgw withMaxConnectionNumber(Integer maxConnectionNumber) {
        this.maxConnectionNumber = maxConnectionNumber;
        return this;
    }

    /**
     * 配置的最大并发客户端连接数
     * @return maxConnectionNumber
     */
    public Integer getMaxConnectionNumber() {
        return maxConnectionNumber;
    }

    public void setMaxConnectionNumber(Integer maxConnectionNumber) {
        this.maxConnectionNumber = maxConnectionNumber;
    }

    public ShowResponseP2cVgw withCurrentConnectionNumber(Integer currentConnectionNumber) {
        this.currentConnectionNumber = currentConnectionNumber;
        return this;
    }

    /**
     * 当前建连的客户端连接数
     * @return currentConnectionNumber
     */
    public Integer getCurrentConnectionNumber() {
        return currentConnectionNumber;
    }

    public void setCurrentConnectionNumber(Integer currentConnectionNumber) {
        this.currentConnectionNumber = currentConnectionNumber;
    }

    public ShowResponseP2cVgw withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowResponseP2cVgw withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowResponseP2cVgw addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowResponseP2cVgw withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<VpnResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<VpnResourceTag> tags) {
        this.tags = tags;
    }

    public ShowResponseP2cVgw withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单Id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowResponseP2cVgw withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 冻结状态
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ShowResponseP2cVgw withFrozenEffect(Integer frozenEffect) {
        this.frozenEffect = frozenEffect;
        return this;
    }

    /**
     * 冻结场景：0未冻结；1 冻结可删除；2冻结不可删除
     * @return frozenEffect
     */
    public Integer getFrozenEffect() {
        return frozenEffect;
    }

    public void setFrozenEffect(Integer frozenEffect) {
        this.frozenEffect = frozenEffect;
    }

    public ShowResponseP2cVgw withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 网关版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowResponseP2cVgw withCreatedAt(OffsetDateTime createdAt) {
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

    public ShowResponseP2cVgw withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowResponseP2cVgw withAppliedAt(OffsetDateTime appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    /**
     * 生效时间
     * @return appliedAt
     */
    public OffsetDateTime getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(OffsetDateTime appliedAt) {
        this.appliedAt = appliedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResponseP2cVgw that = (ShowResponseP2cVgw) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.connectSubnet, that.connectSubnet) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.availabilityZoneIds, that.availabilityZoneIds) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.maxConnectionNumber, that.maxConnectionNumber)
            && Objects.equals(this.currentConnectionNumber, that.currentConnectionNumber)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.frozenEffect, that.frozenEffect) && Objects.equals(this.version, that.version)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.appliedAt, that.appliedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            vpcId,
            connectSubnet,
            flavor,
            availabilityZoneIds,
            eip,
            maxConnectionNumber,
            currentConnectionNumber,
            enterpriseProjectId,
            tags,
            orderId,
            adminStateUp,
            frozenEffect,
            version,
            createdAt,
            updatedAt,
            appliedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResponseP2cVgw {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    connectSubnet: ").append(toIndentedString(connectSubnet)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    maxConnectionNumber: ").append(toIndentedString(maxConnectionNumber)).append("\n");
        sb.append("    currentConnectionNumber: ").append(toIndentedString(currentConnectionNumber)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    frozenEffect: ").append(toIndentedString(frozenEffect)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
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
