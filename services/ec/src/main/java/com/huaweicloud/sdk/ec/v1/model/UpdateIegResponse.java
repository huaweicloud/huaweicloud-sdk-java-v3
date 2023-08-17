package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateIegResponse extends SdkResponse {

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
    @JsonProperty(value = "area_id")

    private String areaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_type")

    private String equipmentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_availability")

    private String highAvailability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_effect")

    private Integer frozenEffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_ecn")

    private String bindEcn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_infos")

    private List<EquipmentItem> equipmentInfos = null;

    public UpdateIegResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 智能企业网关ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateIegResponse withProjectId(String projectId) {
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

    public UpdateIegResponse withDomainId(String domainId) {
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

    public UpdateIegResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 智能企业网关名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIegResponse withAreaId(String areaId) {
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

    public UpdateIegResponse withEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
        return this;
    }

    /**
     * 设备类型
     * @return equipmentType
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public UpdateIegResponse withHighAvailability(String highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * 高可用性
     * @return highAvailability
     */
    public String getHighAvailability() {
        return highAvailability;
    }

    public void setHighAvailability(String highAvailability) {
        this.highAvailability = highAvailability;
    }

    public UpdateIegResponse withFrozenEffect(Integer frozenEffect) {
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

    public UpdateIegResponse withCreatedAt(OffsetDateTime createdAt) {
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

    public UpdateIegResponse withUpdatedAt(OffsetDateTime updatedAt) {
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

    public UpdateIegResponse withStatus(String status) {
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

    public UpdateIegResponse withBindEcn(String bindEcn) {
        this.bindEcn = bindEcn;
        return this;
    }

    /**
     * 绑定的企业连接网络ID
     * @return bindEcn
     */
    public String getBindEcn() {
        return bindEcn;
    }

    public void setBindEcn(String bindEcn) {
        this.bindEcn = bindEcn;
    }

    public UpdateIegResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public UpdateIegResponse withOrderId(String orderId) {
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

    public UpdateIegResponse withProductId(String productId) {
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

    public UpdateIegResponse withEquipmentInfos(List<EquipmentItem> equipmentInfos) {
        this.equipmentInfos = equipmentInfos;
        return this;
    }

    public UpdateIegResponse addEquipmentInfosItem(EquipmentItem equipmentInfosItem) {
        if (this.equipmentInfos == null) {
            this.equipmentInfos = new ArrayList<>();
        }
        this.equipmentInfos.add(equipmentInfosItem);
        return this;
    }

    public UpdateIegResponse withEquipmentInfos(Consumer<List<EquipmentItem>> equipmentInfosSetter) {
        if (this.equipmentInfos == null) {
            this.equipmentInfos = new ArrayList<>();
        }
        equipmentInfosSetter.accept(this.equipmentInfos);
        return this;
    }

    /**
     * ieg设备信息
     * @return equipmentInfos
     */
    public List<EquipmentItem> getEquipmentInfos() {
        return equipmentInfos;
    }

    public void setEquipmentInfos(List<EquipmentItem> equipmentInfos) {
        this.equipmentInfos = equipmentInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIegResponse that = (UpdateIegResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.areaId, that.areaId) && Objects.equals(this.equipmentType, that.equipmentType)
            && Objects.equals(this.highAvailability, that.highAvailability)
            && Objects.equals(this.frozenEffect, that.frozenEffect) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.status, that.status)
            && Objects.equals(this.bindEcn, that.bindEcn)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.equipmentInfos, that.equipmentInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            domainId,
            name,
            areaId,
            equipmentType,
            highAvailability,
            frozenEffect,
            createdAt,
            updatedAt,
            status,
            bindEcn,
            enterpriseProjectId,
            orderId,
            productId,
            equipmentInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIegResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
        sb.append("    equipmentType: ").append(toIndentedString(equipmentType)).append("\n");
        sb.append("    highAvailability: ").append(toIndentedString(highAvailability)).append("\n");
        sb.append("    frozenEffect: ").append(toIndentedString(frozenEffect)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bindEcn: ").append(toIndentedString(bindEcn)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    equipmentInfos: ").append(toIndentedString(equipmentInfos)).append("\n");
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
