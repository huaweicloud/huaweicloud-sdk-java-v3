package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EcnItem
 */
public class EcnItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_id")

    private String areaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_asn")

    private Long ecnAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_asn")

    private Long iegAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vni")

    private Integer vni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_ids")

    private List<String> enterpriseRouterIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_ieg_count")

    private Integer bindIegCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_effect")

    private Integer frozenEffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hub_enable")

    private Boolean hubEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public EcnItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 企业连接网络ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EcnItem withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EcnItem withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public EcnItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业连接网络名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EcnItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EcnItem withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public EcnItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 企业连接网络类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EcnItem withAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }

    /**
     * 大区ID
     * @return areaId
     */
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public EcnItem withRegionId(String regionId) {
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

    public EcnItem withEcnAsn(Long ecnAsn) {
        this.ecnAsn = ecnAsn;
        return this;
    }

    /**
     * 企业连接网络AS号
     * minimum: 64512
     * maximum: 65534
     * @return ecnAsn
     */
    public Long getEcnAsn() {
        return ecnAsn;
    }

    public void setEcnAsn(Long ecnAsn) {
        this.ecnAsn = ecnAsn;
    }

    public EcnItem withIegAsn(Long iegAsn) {
        this.iegAsn = iegAsn;
        return this;
    }

    /**
     * 智能企业网关AS号
     * minimum: 64512
     * maximum: 65534
     * @return iegAsn
     */
    public Long getIegAsn() {
        return iegAsn;
    }

    public void setIegAsn(Long iegAsn) {
        this.iegAsn = iegAsn;
    }

    public EcnItem withVni(Integer vni) {
        this.vni = vni;
        return this;
    }

    /**
     * VXLAN网络标识
     * minimum: 0
     * maximum: 65535
     * @return vni
     */
    public Integer getVni() {
        return vni;
    }

    public void setVni(Integer vni) {
        this.vni = vni;
    }

    public EcnItem withEnterpriseRouterIds(List<String> enterpriseRouterIds) {
        this.enterpriseRouterIds = enterpriseRouterIds;
        return this;
    }

    public EcnItem addEnterpriseRouterIdsItem(String enterpriseRouterIdsItem) {
        if (this.enterpriseRouterIds == null) {
            this.enterpriseRouterIds = new ArrayList<>();
        }
        this.enterpriseRouterIds.add(enterpriseRouterIdsItem);
        return this;
    }

    public EcnItem withEnterpriseRouterIds(Consumer<List<String>> enterpriseRouterIdsSetter) {
        if (this.enterpriseRouterIds == null) {
            this.enterpriseRouterIds = new ArrayList<>();
        }
        enterpriseRouterIdsSetter.accept(this.enterpriseRouterIds);
        return this;
    }

    /**
     * 企业路由器列表
     * @return enterpriseRouterIds
     */
    public List<String> getEnterpriseRouterIds() {
        return enterpriseRouterIds;
    }

    public void setEnterpriseRouterIds(List<String> enterpriseRouterIds) {
        this.enterpriseRouterIds = enterpriseRouterIds;
    }

    public EcnItem withBindIegCount(Integer bindIegCount) {
        this.bindIegCount = bindIegCount;
        return this;
    }

    /**
     * 绑定智能企业网关数量
     * minimum: 0
     * maximum: 400
     * @return bindIegCount
     */
    public Integer getBindIegCount() {
        return bindIegCount;
    }

    public void setBindIegCount(Integer bindIegCount) {
        this.bindIegCount = bindIegCount;
    }

    public EcnItem withEnterpriseProjectId(String enterpriseProjectId) {
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

    public EcnItem withStatus(String status) {
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

    public EcnItem withFrozenEffect(Integer frozenEffect) {
        this.frozenEffect = frozenEffect;
        return this;
    }

    /**
     * 冻结效果
     * minimum: 0
     * maximum: 3
     * @return frozenEffect
     */
    public Integer getFrozenEffect() {
        return frozenEffect;
    }

    public void setFrozenEffect(Integer frozenEffect) {
        this.frozenEffect = frozenEffect;
    }

    public EcnItem withHubEnable(Boolean hubEnable) {
        this.hubEnable = hubEnable;
        return this;
    }

    /**
     * 分支互联开关
     * @return hubEnable
     */
    public Boolean getHubEnable() {
        return hubEnable;
    }

    public void setHubEnable(Boolean hubEnable) {
        this.hubEnable = hubEnable;
    }

    public EcnItem withCreatedAt(OffsetDateTime createdAt) {
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

    public EcnItem withUpdatedAt(OffsetDateTime updatedAt) {
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

    public EcnItem withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期场景下购买的订单号，按需场景下为空
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public EcnItem withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 包周期场景下购买的订单号，按需场景下为空
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EcnItem that = (EcnItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.type, that.type)
            && Objects.equals(this.areaId, that.areaId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.ecnAsn, that.ecnAsn) && Objects.equals(this.iegAsn, that.iegAsn)
            && Objects.equals(this.vni, that.vni) && Objects.equals(this.enterpriseRouterIds, that.enterpriseRouterIds)
            && Objects.equals(this.bindIegCount, that.bindIegCount)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.frozenEffect, that.frozenEffect)
            && Objects.equals(this.hubEnable, that.hubEnable) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            domainId,
            name,
            description,
            bandwidthSize,
            type,
            areaId,
            regionId,
            ecnAsn,
            iegAsn,
            vni,
            enterpriseRouterIds,
            bindIegCount,
            enterpriseProjectId,
            status,
            frozenEffect,
            hubEnable,
            createdAt,
            updatedAt,
            orderId,
            productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcnItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    ecnAsn: ").append(toIndentedString(ecnAsn)).append("\n");
        sb.append("    iegAsn: ").append(toIndentedString(iegAsn)).append("\n");
        sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
        sb.append("    enterpriseRouterIds: ").append(toIndentedString(enterpriseRouterIds)).append("\n");
        sb.append("    bindIegCount: ").append(toIndentedString(bindIegCount)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    frozenEffect: ").append(toIndentedString(frozenEffect)).append("\n");
        sb.append("    hubEnable: ").append(toIndentedString(hubEnable)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
