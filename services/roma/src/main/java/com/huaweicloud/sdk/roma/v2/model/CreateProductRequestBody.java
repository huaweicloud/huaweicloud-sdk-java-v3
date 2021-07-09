package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateProductRequestBody
 */
public class CreateProductRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="manufacturer_id")
    
    private String manufacturerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="manufacturer_name")
    
    private String manufacturerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="model")
    
    private String model;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_type")
    
    private Integer productType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_type")
    
    private Integer protocolType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_type")
    
    private String deviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private Integer templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_format")
    
    private Integer dataFormat;

    public CreateProductRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public CreateProductRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 产品名称，创建产品时租户内唯一，长度最大64，仅支持中文，英文字母，数字，下划线和中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateProductRequestBody withManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
        return this;
    }

    


    /**
     * 产品供应商ID
     * @return manufacturerId
     */
    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    

    public CreateProductRequestBody withManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    


    /**
     * 厂商名称
     * @return manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    

    public CreateProductRequestBody withModel(String model) {
        this.model = model;
        return this;
    }

    


    /**
     * 产品型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public CreateProductRequestBody withProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    


    /**
     * 产品类型，0-普通产品(不支持子设备) 1-网关产品
     * minimum: 0
     * maximum: 10
     * @return productType
     */
    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    

    public CreateProductRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 产品描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateProductRequestBody withProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 产品的协议类型 0-mqtt 2-modbus 4-opcua
     * minimum: 0
     * maximum: 10
     * @return protocolType
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    

    public CreateProductRequestBody withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    


    /**
     * 产品的设备类型（默认Default）
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    

    public CreateProductRequestBody withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 关联产品模板ID（使用产品模板创建产品时使用，否则为空），自动向下取整
     * minimum: 1
     * maximum: 999999999999999999
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    

    public CreateProductRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 模型版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public CreateProductRequestBody withDataFormat(Integer dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    


    /**
     * 产品的数据格式 0-JSON 1-USER_DEFINED
     * minimum: 0
     * maximum: 10
     * @return dataFormat
     */
    public Integer getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(Integer dataFormat) {
        this.dataFormat = dataFormat;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProductRequestBody createProductRequestBody = (CreateProductRequestBody) o;
        return Objects.equals(this.appId, createProductRequestBody.appId) &&
            Objects.equals(this.name, createProductRequestBody.name) &&
            Objects.equals(this.manufacturerId, createProductRequestBody.manufacturerId) &&
            Objects.equals(this.manufacturerName, createProductRequestBody.manufacturerName) &&
            Objects.equals(this.model, createProductRequestBody.model) &&
            Objects.equals(this.productType, createProductRequestBody.productType) &&
            Objects.equals(this.description, createProductRequestBody.description) &&
            Objects.equals(this.protocolType, createProductRequestBody.protocolType) &&
            Objects.equals(this.deviceType, createProductRequestBody.deviceType) &&
            Objects.equals(this.templateId, createProductRequestBody.templateId) &&
            Objects.equals(this.version, createProductRequestBody.version) &&
            Objects.equals(this.dataFormat, createProductRequestBody.dataFormat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, name, manufacturerId, manufacturerName, model, productType, description, protocolType, deviceType, templateId, version, dataFormat);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProductRequestBody {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
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

