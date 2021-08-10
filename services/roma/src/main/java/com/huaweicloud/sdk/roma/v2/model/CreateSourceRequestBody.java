package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateSourceRequestBody */
public class CreateSourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_base64")

    private Integer isBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_device_info")

    private Integer containDeviceInfo;

    public CreateSourceRequestBody withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID，自动向下取整 minimum: 1 maximum: 999999999999999999
     * 
     * @return productId */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public CreateSourceRequestBody withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID，自动向下取整，不填为全部设备 minimum: 1 maximum: 999999999999999999
     * 
     * @return deviceId */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public CreateSourceRequestBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** 主题，当设备ID为空时为产品级主题，设备ID不为空时为设备级主题
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CreateSourceRequestBody withIsBase64(Integer isBase64) {
        this.isBase64 = isBase64;
        return this;
    }

    /** 是否payload使用base64，0-是 1-否 minimum: 1 maximum: 10
     * 
     * @return isBase64 */
    public Integer getIsBase64() {
        return isBase64;
    }

    public void setIsBase64(Integer isBase64) {
        this.isBase64 = isBase64;
    }

    public CreateSourceRequestBody withContainDeviceInfo(Integer containDeviceInfo) {
        this.containDeviceInfo = containDeviceInfo;
        return this;
    }

    /** 是否包含设备信息是否包含设备信息，0-是 1-否 minimum: 1 maximum: 10
     * 
     * @return containDeviceInfo */
    public Integer getContainDeviceInfo() {
        return containDeviceInfo;
    }

    public void setContainDeviceInfo(Integer containDeviceInfo) {
        this.containDeviceInfo = containDeviceInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSourceRequestBody createSourceRequestBody = (CreateSourceRequestBody) o;
        return Objects.equals(this.productId, createSourceRequestBody.productId)
            && Objects.equals(this.deviceId, createSourceRequestBody.deviceId)
            && Objects.equals(this.topic, createSourceRequestBody.topic)
            && Objects.equals(this.isBase64, createSourceRequestBody.isBase64)
            && Objects.equals(this.containDeviceInfo, createSourceRequestBody.containDeviceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, deviceId, topic, isBase64, containDeviceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSourceRequestBody {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
        sb.append("    containDeviceInfo: ").append(toIndentedString(containDeviceInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
