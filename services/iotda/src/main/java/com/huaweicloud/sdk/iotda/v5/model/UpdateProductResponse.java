package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateProductResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private String deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private String protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_format")

    private String dataFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer_name")

    private String manufacturerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "industry")

    private String industry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_capabilities")

    private List<ServiceCapability> serviceCapabilities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public UpdateProductResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 资源空间ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateProductResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 资源空间名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public UpdateProductResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，用于唯一标识一个产品，在物联网平台创建产品后由平台分配获得。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public UpdateProductResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 产品名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateProductResponse withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 设备类型。
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public UpdateProductResponse withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * 设备使用的协议类型。取值范围：MQTT，CoAP，HTTP，HTTPS，Modbus，ONVIF， OPC-UA，OPC-DA，Other，TCP，UDP。
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public UpdateProductResponse withDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * 设备上报数据的格式，取值范围：json，binary。
     * @return dataFormat
     */
    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public UpdateProductResponse withManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    /**
     * 厂商名称。
     * @return manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public UpdateProductResponse withIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    /**
     * 设备所属行业。
     * @return industry
     */
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public UpdateProductResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 产品的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateProductResponse withServiceCapabilities(List<ServiceCapability> serviceCapabilities) {
        this.serviceCapabilities = serviceCapabilities;
        return this;
    }

    public UpdateProductResponse addServiceCapabilitiesItem(ServiceCapability serviceCapabilitiesItem) {
        if (this.serviceCapabilities == null) {
            this.serviceCapabilities = new ArrayList<>();
        }
        this.serviceCapabilities.add(serviceCapabilitiesItem);
        return this;
    }

    public UpdateProductResponse withServiceCapabilities(Consumer<List<ServiceCapability>> serviceCapabilitiesSetter) {
        if (this.serviceCapabilities == null) {
            this.serviceCapabilities = new ArrayList<>();
        }
        serviceCapabilitiesSetter.accept(this.serviceCapabilities);
        return this;
    }

    /**
     * 设备的服务能力列表。
     * @return serviceCapabilities
     */
    public List<ServiceCapability> getServiceCapabilities() {
        return serviceCapabilities;
    }

    public void setServiceCapabilities(List<ServiceCapability> serviceCapabilities) {
        this.serviceCapabilities = serviceCapabilities;
    }

    public UpdateProductResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 在物联网平台创建产品的时间，格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProductResponse that = (UpdateProductResponse) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.deviceType, that.deviceType) && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.dataFormat, that.dataFormat)
            && Objects.equals(this.manufacturerName, that.manufacturerName)
            && Objects.equals(this.industry, that.industry) && Objects.equals(this.description, that.description)
            && Objects.equals(this.serviceCapabilities, that.serviceCapabilities)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            appName,
            productId,
            name,
            deviceType,
            protocolType,
            dataFormat,
            manufacturerName,
            industry,
            description,
            serviceCapabilities,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    serviceCapabilities: ").append(toIndentedString(serviceCapabilities)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
