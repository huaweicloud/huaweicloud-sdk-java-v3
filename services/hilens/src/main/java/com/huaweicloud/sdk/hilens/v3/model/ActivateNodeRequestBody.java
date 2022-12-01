package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ActivateNodeRequestBody
 */
public class ActivateNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_order_id")

    private String cpuOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_gpu_order_id")

    private String npuGpuOrderId;

    public ActivateNodeRequestBody withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，小型轻型设备激活时使用的订单
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ActivateNodeRequestBody withCpuOrderId(String cpuOrderId) {
        this.cpuOrderId = cpuOrderId;
        return this;
    }

    /**
     * 订单ID，大型设备使用CPU时激活的订单
     * @return cpuOrderId
     */
    public String getCpuOrderId() {
        return cpuOrderId;
    }

    public void setCpuOrderId(String cpuOrderId) {
        this.cpuOrderId = cpuOrderId;
    }

    public ActivateNodeRequestBody withNpuGpuOrderId(String npuGpuOrderId) {
        this.npuGpuOrderId = npuGpuOrderId;
        return this;
    }

    /**
     * 订单ID，大型设备使用GPU/NPU时激活的订单
     * @return npuGpuOrderId
     */
    public String getNpuGpuOrderId() {
        return npuGpuOrderId;
    }

    public void setNpuGpuOrderId(String npuGpuOrderId) {
        this.npuGpuOrderId = npuGpuOrderId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivateNodeRequestBody activateNodeRequestBody = (ActivateNodeRequestBody) o;
        return Objects.equals(this.orderId, activateNodeRequestBody.orderId)
            && Objects.equals(this.cpuOrderId, activateNodeRequestBody.cpuOrderId)
            && Objects.equals(this.npuGpuOrderId, activateNodeRequestBody.npuGpuOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, cpuOrderId, npuGpuOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivateNodeRequestBody {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    cpuOrderId: ").append(toIndentedString(cpuOrderId)).append("\n");
        sb.append("    npuGpuOrderId: ").append(toIndentedString(npuGpuOrderId)).append("\n");
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
