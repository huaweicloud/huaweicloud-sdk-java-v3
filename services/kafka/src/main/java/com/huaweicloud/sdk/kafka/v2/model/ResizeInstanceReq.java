package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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
     * 新规格变更后的产品ID。 涉及垂直扩容场景，需指定该项。
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
     * 实例绑定的弹性IP地址的ID。 以英文逗号隔开多个弹性IP地址的ID。 如果开启了公网再扩容，需要填写此参数。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceReq resizeInstanceReq = (ResizeInstanceReq) o;
        return Objects.equals(this.newSpecCode, resizeInstanceReq.newSpecCode)
            && Objects.equals(this.newStorageSpace, resizeInstanceReq.newStorageSpace)
            && Objects.equals(this.operType, resizeInstanceReq.operType)
            && Objects.equals(this.newBrokerNum, resizeInstanceReq.newBrokerNum)
            && Objects.equals(this.newProductId, resizeInstanceReq.newProductId)
            && Objects.equals(this.publicipId, resizeInstanceReq.publicipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSpecCode, newStorageSpace, operType, newBrokerNum, newProductId, publicipId);
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
