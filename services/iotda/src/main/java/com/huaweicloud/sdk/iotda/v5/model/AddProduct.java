package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建产品信息结构体。 */
public class AddProduct {

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
    @JsonProperty(value = "service_capabilities")

    private List<ServiceCapability> serviceCapabilities = null;

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
    @JsonProperty(value = "app_id")

    private String appId;

    public AddProduct withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** **参数说明**：产品ID，用于唯一标识一个产品。如果携带此参数，平台将产品ID设置为该参数值；如果不携带此参数，产品ID在物联网平台创建产品后由平台分配获得。
     * **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public AddProduct withName(String name) {
        this.name = name;
        return this;
    }

    /** **参数说明**：产品名称。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddProduct withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /** **参数说明**：设备类型。 **取值范围**：长度不超过32，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * 
     * @return deviceType */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public AddProduct withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /** **参数说明**：设备使用的协议类型。 **取值范围**：MQTT，CoAP，HTTP，HTTPS，Modbus，ONVIF，OPC-UA，OPC-DA。
     * 
     * @return protocolType */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public AddProduct withDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /** **参数说明**：设备上报数据的格式。 **取值范围**： - json：JSON格式 - binary：二进制码流格式 默认值json。
     * 
     * @return dataFormat */
    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public AddProduct withServiceCapabilities(List<ServiceCapability> serviceCapabilities) {
        this.serviceCapabilities = serviceCapabilities;
        return this;
    }

    public AddProduct addServiceCapabilitiesItem(ServiceCapability serviceCapabilitiesItem) {
        if (this.serviceCapabilities == null) {
            this.serviceCapabilities = new ArrayList<>();
        }
        this.serviceCapabilities.add(serviceCapabilitiesItem);
        return this;
    }

    public AddProduct withServiceCapabilities(Consumer<List<ServiceCapability>> serviceCapabilitiesSetter) {
        if (this.serviceCapabilities == null) {
            this.serviceCapabilities = new ArrayList<>();
        }
        serviceCapabilitiesSetter.accept(this.serviceCapabilities);
        return this;
    }

    /** **参数说明**：设备的服务能力列表。
     * 
     * @return serviceCapabilities */
    public List<ServiceCapability> getServiceCapabilities() {
        return serviceCapabilities;
    }

    public void setServiceCapabilities(List<ServiceCapability> serviceCapabilities) {
        this.serviceCapabilities = serviceCapabilities;
    }

    public AddProduct withManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    /** **参数说明**：厂商名称。 **取值范围**：长度不超过32，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * 
     * @return manufacturerName */
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public AddProduct withIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    /** **参数说明**：设备所属行业。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * 
     * @return industry */
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public AddProduct withDescription(String description) {
        this.description = description;
        return this;
    }

    /** **参数说明**：产品的描述信息。 **取值范围**：长度不超过128，只允许中文、字母、数字、空白字符、以及_?'#().,;&%@!- ，、：；。/等字符的组合。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddProduct withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的产品归属到哪个资源空间下，否则创建的产品将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。
     * **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddProduct addProduct = (AddProduct) o;
        return Objects.equals(this.productId, addProduct.productId) && Objects.equals(this.name, addProduct.name)
            && Objects.equals(this.deviceType, addProduct.deviceType)
            && Objects.equals(this.protocolType, addProduct.protocolType)
            && Objects.equals(this.dataFormat, addProduct.dataFormat)
            && Objects.equals(this.serviceCapabilities, addProduct.serviceCapabilities)
            && Objects.equals(this.manufacturerName, addProduct.manufacturerName)
            && Objects.equals(this.industry, addProduct.industry)
            && Objects.equals(this.description, addProduct.description) && Objects.equals(this.appId, addProduct.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            name,
            deviceType,
            protocolType,
            dataFormat,
            serviceCapabilities,
            manufacturerName,
            industry,
            description,
            appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProduct {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
        sb.append("    serviceCapabilities: ").append(toIndentedString(serviceCapabilities)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
