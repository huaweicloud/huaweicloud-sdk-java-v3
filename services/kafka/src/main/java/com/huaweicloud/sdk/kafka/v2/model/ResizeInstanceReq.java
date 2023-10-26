package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResizeInstanceReq
 */
public class ResizeInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_spec_code")

    private String newSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_storage_space")

    private Integer newStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_type")

    private String operType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_broker_num")

    private Integer newBrokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_product_id")

    private String newProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_ips")

    private List<String> tenantIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_tenant_subnet_id")

    private String secondTenantSubnetId;

    public ResizeInstanceReq withNewSpecCode(String newSpecCode) {
        this.newSpecCode = newSpecCode;
        return this;
    }

    /**
     * 规格变更后的规格ID。 若只扩展磁盘大小，则规格ID保持和原实例不变。
     * @return newSpecCode
     */
    public String getNewSpecCode() {
        return newSpecCode;
    }

    public void setNewSpecCode(String newSpecCode) {
        this.newSpecCode = newSpecCode;
    }

    public ResizeInstanceReq withNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
        return this;
    }

    /**
     * 规格变更后的消息存储空间，单位：GB。 若扩展实例基准带宽，则new_storage_space不能低于基准带宽规定的最小磁盘大小。
     * @return newStorageSpace
     */
    public Integer getNewStorageSpace() {
        return newStorageSpace;
    }

    public void setNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
    }

    public ResizeInstanceReq withOperType(String operType) {
        this.operType = operType;
        return this;
    }

    /**
     * 扩容类型, 新规格支持扩容类型：\"horizontal\"、\"vertical\"、\"node\"、\"storage\"四种类型。
     * @return operType
     */
    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public ResizeInstanceReq withNewBrokerNum(Integer newBrokerNum) {
        this.newBrokerNum = newBrokerNum;
        return this;
    }

    /**
     * 扩容后集群节点数。
     * @return newBrokerNum
     */
    public Integer getNewBrokerNum() {
        return newBrokerNum;
    }

    public void setNewBrokerNum(Integer newBrokerNum) {
        this.newBrokerNum = newBrokerNum;
    }

    public ResizeInstanceReq withNewProductId(String newProductId) {
        this.newProductId = newProductId;
        return this;
    }

    /**
     * 新规格变更后的产品ID。 涉及垂直扩容场景，需指定该项。 产品ID可以从[查询产品规格列表](ListEngineProducts.xml)获取。
     * @return newProductId
     */
    public String getNewProductId() {
        return newProductId;
    }

    public void setNewProductId(String newProductId) {
        this.newProductId = newProductId;
    }

    public ResizeInstanceReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 实例绑定的弹性IP地址的ID。 以英文逗号隔开多个弹性IP地址的ID。 如果开启了公网再进行扩容，需要填写此参数。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ResizeInstanceReq withTenantIps(List<String> tenantIps) {
        this.tenantIps = tenantIps;
        return this;
    }

    public ResizeInstanceReq addTenantIpsItem(String tenantIpsItem) {
        if (this.tenantIps == null) {
            this.tenantIps = new ArrayList<>();
        }
        this.tenantIps.add(tenantIpsItem);
        return this;
    }

    public ResizeInstanceReq withTenantIps(Consumer<List<String>> tenantIpsSetter) {
        if (this.tenantIps == null) {
            this.tenantIps = new ArrayList<>();
        }
        tenantIpsSetter.accept(this.tenantIps);
        return this;
    }

    /**
     * 创建节点可以手动指定实例节点的内网IP地址，仅支持指定IPv4地址。  指定内网地址数量必须小于等于购买的节点数量。  当小于购买的节点数量时,未指定的节点则随机分配。
     * @return tenantIps
     */
    public List<String> getTenantIps() {
        return tenantIps;
    }

    public void setTenantIps(List<String> tenantIps) {
        this.tenantIps = tenantIps;
    }

    public ResizeInstanceReq withSecondTenantSubnetId(String secondTenantSubnetId) {
        this.secondTenantSubnetId = secondTenantSubnetId;
        return this;
    }

    /**
     * 实例扩容时新节点使用备用子网的id。  当实例扩容使用备用子网，则传入此值。  需要联系客服添加白名单才能传入此值。
     * @return secondTenantSubnetId
     */
    public String getSecondTenantSubnetId() {
        return secondTenantSubnetId;
    }

    public void setSecondTenantSubnetId(String secondTenantSubnetId) {
        this.secondTenantSubnetId = secondTenantSubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeInstanceReq that = (ResizeInstanceReq) obj;
        return Objects.equals(this.newSpecCode, that.newSpecCode)
            && Objects.equals(this.newStorageSpace, that.newStorageSpace)
            && Objects.equals(this.operType, that.operType) && Objects.equals(this.newBrokerNum, that.newBrokerNum)
            && Objects.equals(this.newProductId, that.newProductId) && Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.tenantIps, that.tenantIps)
            && Objects.equals(this.secondTenantSubnetId, that.secondTenantSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSpecCode,
            newStorageSpace,
            operType,
            newBrokerNum,
            newProductId,
            publicipId,
            tenantIps,
            secondTenantSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceReq {\n");
        sb.append("    newSpecCode: ").append(toIndentedString(newSpecCode)).append("\n");
        sb.append("    newStorageSpace: ").append(toIndentedString(newStorageSpace)).append("\n");
        sb.append("    operType: ").append(toIndentedString(operType)).append("\n");
        sb.append("    newBrokerNum: ").append(toIndentedString(newBrokerNum)).append("\n");
        sb.append("    newProductId: ").append(toIndentedString(newProductId)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    tenantIps: ").append(toIndentedString(tenantIps)).append("\n");
        sb.append("    secondTenantSubnetId: ").append(toIndentedString(secondTenantSubnetId)).append("\n");
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
