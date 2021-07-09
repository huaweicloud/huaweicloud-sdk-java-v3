package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Source
 */
public class Source  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_id")
    
    private Integer sourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private Integer deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_base64")
    
    private Integer isBase64;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contain_device_info")
    
    private Integer containDeviceInfo;

    public Source withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    


    /**
     * 源数据源ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    

    public Source withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    

    public Source withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备ID，不填为全部设备
     * minimum: 1
     * maximum: 999999999999999999
     * @return deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    

    public Source withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * 主题，当设备ID为空时为产品级主题，设备ID不为空时为设备级主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public Source withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * 设备名称
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    

    public Source withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * 产品名称
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    

    public Source withIsBase64(Integer isBase64) {
        this.isBase64 = isBase64;
        return this;
    }

    


    /**
     * 是否payload使用base64，0-是 1-否
     * minimum: 0
     * maximum: 10
     * @return isBase64
     */
    public Integer getIsBase64() {
        return isBase64;
    }

    public void setIsBase64(Integer isBase64) {
        this.isBase64 = isBase64;
    }

    

    public Source withContainDeviceInfo(Integer containDeviceInfo) {
        this.containDeviceInfo = containDeviceInfo;
        return this;
    }

    


    /**
     * 是否包含设备信息，0-是，1-否
     * minimum: 0
     * maximum: 10
     * @return containDeviceInfo
     */
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
        Source source = (Source) o;
        return Objects.equals(this.sourceId, source.sourceId) &&
            Objects.equals(this.productId, source.productId) &&
            Objects.equals(this.deviceId, source.deviceId) &&
            Objects.equals(this.topic, source.topic) &&
            Objects.equals(this.deviceName, source.deviceName) &&
            Objects.equals(this.productName, source.productName) &&
            Objects.equals(this.isBase64, source.isBase64) &&
            Objects.equals(this.containDeviceInfo, source.containDeviceInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceId, productId, deviceId, topic, deviceName, productName, isBase64, containDeviceInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Source {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    isBase64: ").append(toIndentedString(isBase64)).append("\n");
        sb.append("    containDeviceInfo: ").append(toIndentedString(containDeviceInfo)).append("\n");
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

