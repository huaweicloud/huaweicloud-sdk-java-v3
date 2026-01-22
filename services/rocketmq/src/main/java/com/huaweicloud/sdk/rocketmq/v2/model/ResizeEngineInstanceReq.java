package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResizeEngineInstanceReq
 */
public class ResizeEngineInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_type")

    private String operType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_storage_space")

    private Integer newStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_product_id")

    private String newProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_broker_num")

    private Integer newBrokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    public ResizeEngineInstanceReq withOperType(String operType) {
        this.operType = operType;
        return this;
    }

    /**
     * **参数解释**： 变更类型。 **约束限制**： 不涉及。 **取值范围**： [- storage：存储空间扩容，节点数量不变。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,dt,cmcc,ax,srg) - horizontal：[RocketMQ 5.x为实例规格扩容。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,dt,srg)[RocketMQ 4.8.0为代理数扩容。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,cmcc,ax) [- vertical：垂直扩容，broker的底层虚机规格变更，代理数量和存储空间不变，仅RocketMQ 4.8.0支持。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,cmcc,ax,srg) **默认取值**： 不涉及。
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
     * **参数解释**： 新存储规格 **约束限制**： 当oper_type类型是storage时，该参数有效且必填。  [- 当oper_type类型是storage时，每个broker存储空间最少扩容100GB。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,dt,cmcc,ax,srg)  - 当oper_type类型是horizontal时，每个broker的存储空间不变。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return newStorageSpace
     */
    public Integer getNewStorageSpace() {
        return newStorageSpace;
    }

    public void setNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
    }

    public ResizeEngineInstanceReq withNewProductId(String newProductId) {
        this.newProductId = newProductId;
        return this;
    }

    /**
     * **参数解释**： 新产品ID **约束限制**：  [- RocketMQ 5.x：当oper_type类型是horizontal时该参数有效且必填，规格变更仅限于集群实例。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,dt,srg) [- RocketMQ 4.8.0：当oper_type类型是vertical时该参数有效且必填，规格变更仅限于集群实例。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,fcs,cmcc,ax) **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return newProductId
     */
    public String getNewProductId() {
        return newProductId;
    }

    public void setNewProductId(String newProductId) {
        this.newProductId = newProductId;
    }

    public ResizeEngineInstanceReq withNewBrokerNum(Integer newBrokerNum) {
        this.newBrokerNum = newBrokerNum;
        return this;
    }

    /**
     * **参数解释**： 代理数量 **约束限制**： 当oper_type参数为horizontal时，该参数必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return newBrokerNum
     */
    public Integer getNewBrokerNum() {
        return newBrokerNum;
    }

    public void setNewBrokerNum(Integer newBrokerNum) {
        this.newBrokerNum = newBrokerNum;
    }

    public ResizeEngineInstanceReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * **参数解释**： 实例绑定的弹性IP地址的ID。以英文逗号隔开多个弹性IP地址的ID。 **约束限制**：  当oper_type参数为horizontal且开启了公网访问时，此参数必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
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
            && Objects.equals(this.newProductId, that.newProductId)
            && Objects.equals(this.newBrokerNum, that.newBrokerNum) && Objects.equals(this.publicipId, that.publicipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operType, newStorageSpace, newProductId, newBrokerNum, publicipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeEngineInstanceReq {\n");
        sb.append("    operType: ").append(toIndentedString(operType)).append("\n");
        sb.append("    newStorageSpace: ").append(toIndentedString(newStorageSpace)).append("\n");
        sb.append("    newProductId: ").append(toIndentedString(newProductId)).append("\n");
        sb.append("    newBrokerNum: ").append(toIndentedString(newBrokerNum)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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
