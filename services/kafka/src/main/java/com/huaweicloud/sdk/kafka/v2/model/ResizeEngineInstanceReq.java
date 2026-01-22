package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例规格变更请求体。
 */
public class ResizeEngineInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_type")

    private String operType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_storage_space")

    private Integer newStorageSpace;

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

    public ResizeEngineInstanceReq withOperType(String operType) {
        this.operType = operType;
        return this;
    }

    /**
     * 变更类型。  取值范围：   - storage：存储空间扩容，代理数量不变。    - horizontal：代理数量扩容，每个broker的存储空间不变。    [- vertical：垂直扩容，broker的底层虚机规格变更，代理数量和存储空间不变。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,hk_tm,dt,fcs,sbc,hk_sbc,hcs,ax,srg)
     * @return operType
     */
    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public ResizeEngineInstanceReq withNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
        return this;
    }

    /**
     * 扩容后的存储空间。注意：磁盘容量仅支持设置为100的整数倍。  实例存储空间 = 代理数量 * 每个broker的存储空间。  当oper_type类型是storage或horizontal时，该参数有效且必填。    - 当oper_type类型是storage时，代理数量不变，每个broker存储空间最少扩容100GB。    - 当oper_type类型是horizontal时，每个broker的存储空间不变。
     * @return newStorageSpace
     */
    public Integer getNewStorageSpace() {
        return newStorageSpace;
    }

    public void setNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
    }

    public ResizeEngineInstanceReq withNewBrokerNum(Integer newBrokerNum) {
        this.newBrokerNum = newBrokerNum;
        return this;
    }

    /**
     * 当oper_type参数为horizontal时，该参数有效。  [取值范围：最多支持50个broker。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,sbc,hk_sbc,g42,hk_g42,tm,hk_tm,ax)
     * @return newBrokerNum
     */
    public Integer getNewBrokerNum() {
        return newBrokerNum;
    }

    public void setNewBrokerNum(Integer newBrokerNum) {
        this.newBrokerNum = newBrokerNum;
    }

    public ResizeEngineInstanceReq withNewProductId(String newProductId) {
        this.newProductId = newProductId;
        return this;
    }

    /**
     * 垂直扩容时的新产品ID。  当oper_type类型是vertical时，该参数才有效且必填。  产品ID可以从[查询产品规格列表](ListEngineProducts.xml)获取。
     * @return newProductId
     */
    public String getNewProductId() {
        return newProductId;
    }

    public void setNewProductId(String newProductId) {
        this.newProductId = newProductId;
    }

    public ResizeEngineInstanceReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 实例绑定的弹性IP地址的ID。[获取方法：参考[[《弹性公网IP API参考》](https://support.huaweicloud.com/api-eip/ListPublicipsV3.html)](tag:hws)[[《弹性公网IP API参考》](https://support.huaweicloud.com/intl/zh-cn/api-eip/ListPublicipsV3.html)](tag:hws_hk)[[《弹性公网IP API参考》](https://support.huaweicloud.com/eu/api-eip/ListPublicipsV3.html)](tag:hws_eu)[《弹性公网IP API参考》](tag:ax,cmcc,ctc,sbc,hk_sbc,g42,hk_g42,srg,dt,ocb,hws_ocb,hcs,fcs)，调用“查询弹性公网IP列表”接口，从响应体中获取弹性公网IP的ID。](tag:ax,cmcc,ctc,sbc,hk_sbc,g42,hk_g42,srg,dt,ocb,hws_ocb,hcs,fcs,hws,hws_hk,hws_eu)  以英文逗号隔开多个弹性IP地址的ID。  当oper_type类型是horizontal时，该参数必填。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ResizeEngineInstanceReq withTenantIps(List<String> tenantIps) {
        this.tenantIps = tenantIps;
        return this;
    }

    public ResizeEngineInstanceReq addTenantIpsItem(String tenantIpsItem) {
        if (this.tenantIps == null) {
            this.tenantIps = new ArrayList<>();
        }
        this.tenantIps.add(tenantIpsItem);
        return this;
    }

    public ResizeEngineInstanceReq withTenantIps(Consumer<List<String>> tenantIpsSetter) {
        if (this.tenantIps == null) {
            this.tenantIps = new ArrayList<>();
        }
        tenantIpsSetter.accept(this.tenantIps);
        return this;
    }

    /**
     * 指定的内网IP地址，仅支持指定IPv4。  指定的IP数量只能小于等于新增节点数量。  当指定IP小于节点数量时，未指定的节点随机分配内网IP地址。
     * @return tenantIps
     */
    public List<String> getTenantIps() {
        return tenantIps;
    }

    public void setTenantIps(List<String> tenantIps) {
        this.tenantIps = tenantIps;
    }

    public ResizeEngineInstanceReq withSecondTenantSubnetId(String secondTenantSubnetId) {
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
        ResizeEngineInstanceReq that = (ResizeEngineInstanceReq) obj;
        return Objects.equals(this.operType, that.operType)
            && Objects.equals(this.newStorageSpace, that.newStorageSpace)
            && Objects.equals(this.newBrokerNum, that.newBrokerNum)
            && Objects.equals(this.newProductId, that.newProductId) && Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.tenantIps, that.tenantIps)
            && Objects.equals(this.secondTenantSubnetId, that.secondTenantSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(operType, newStorageSpace, newBrokerNum, newProductId, publicipId, tenantIps, secondTenantSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeEngineInstanceReq {\n");
        sb.append("    operType: ").append(toIndentedString(operType)).append("\n");
        sb.append("    newStorageSpace: ").append(toIndentedString(newStorageSpace)).append("\n");
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
