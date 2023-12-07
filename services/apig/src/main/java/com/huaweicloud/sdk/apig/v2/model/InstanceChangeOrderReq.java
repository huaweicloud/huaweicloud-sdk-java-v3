package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceChangeOrderReq
 */
public class InstanceChangeOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_info")

    private ResizeInstanceReq resizeInfo;

    public InstanceChangeOrderReq withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceChangeOrderReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品编号
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public InstanceChangeOrderReq withResizeInfo(ResizeInstanceReq resizeInfo) {
        this.resizeInfo = resizeInfo;
        return this;
    }

    public InstanceChangeOrderReq withResizeInfo(Consumer<ResizeInstanceReq> resizeInfoSetter) {
        if (this.resizeInfo == null) {
            this.resizeInfo = new ResizeInstanceReq();
            resizeInfoSetter.accept(this.resizeInfo);
        }

        return this;
    }

    /**
     * Get resizeInfo
     * @return resizeInfo
     */
    public ResizeInstanceReq getResizeInfo() {
        return resizeInfo;
    }

    public void setResizeInfo(ResizeInstanceReq resizeInfo) {
        this.resizeInfo = resizeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceChangeOrderReq that = (InstanceChangeOrderReq) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.resizeInfo, that.resizeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productId, resizeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceChangeOrderReq {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    resizeInfo: ").append(toIndentedString(resizeInfo)).append("\n");
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
