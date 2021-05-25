package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
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
    /**
     * 产品类型，0-普通产品(不支持子设备) 1-网关产品
     */
    public static final class ProductTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProductTypeEnum NUMBER_0 = new ProductTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProductTypeEnum NUMBER_1 = new ProductTypeEnum(1);
        

        private static final Map<Integer, ProductTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProductTypeEnum> createStaticFields() {
            Map<Integer, ProductTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProductTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProductTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ProductTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProductTypeEnum(value);
            }
            return result;
        }

        public static ProductTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ProductTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProductTypeEnum) {
                return this.value.equals(((ProductTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_type")
    
    private ProductTypeEnum productType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 产品的协议类型 0-mqtt 2-modbus 4-opcua
     */
    public static final class ProtocolTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProtocolTypeEnum NUMBER_0 = new ProtocolTypeEnum(0);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ProtocolTypeEnum NUMBER_2 = new ProtocolTypeEnum(2);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final ProtocolTypeEnum NUMBER_4 = new ProtocolTypeEnum(4);
        

        private static final Map<Integer, ProtocolTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtocolTypeEnum> createStaticFields() {
            Map<Integer, ProtocolTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(2, NUMBER_2);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProtocolTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ProtocolTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolTypeEnum(value);
            }
            return result;
        }

        public static ProtocolTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ProtocolTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolTypeEnum) {
                return this.value.equals(((ProtocolTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_type")
    
    private ProtocolTypeEnum protocolType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_type")
    
    private String deviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private Integer templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;
    /**
     * 产品的数据格式 0-JSON 1-USER_DEFINED
     */
    public static final class DataFormatEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DataFormatEnum NUMBER_0 = new DataFormatEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DataFormatEnum NUMBER_1 = new DataFormatEnum(1);
        

        private static final Map<Integer, DataFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DataFormatEnum> createStaticFields() {
            Map<Integer, DataFormatEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DataFormatEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataFormatEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            DataFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataFormatEnum(value);
            }
            return result;
        }

        public static DataFormatEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            DataFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DataFormatEnum) {
                return this.value.equals(((DataFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_format")
    
    private DataFormatEnum dataFormat;

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

    

    public CreateProductRequestBody withProductType(ProductTypeEnum productType) {
        this.productType = productType;
        return this;
    }

    


    /**
     * 产品类型，0-普通产品(不支持子设备) 1-网关产品
     * @return productType
     */
    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
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

    

    public CreateProductRequestBody withProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 产品的协议类型 0-mqtt 2-modbus 4-opcua
     * @return protocolType
     */
    public ProtocolTypeEnum getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolTypeEnum protocolType) {
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

    

    public CreateProductRequestBody withDataFormat(DataFormatEnum dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    


    /**
     * 产品的数据格式 0-JSON 1-USER_DEFINED
     * @return dataFormat
     */
    public DataFormatEnum getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(DataFormatEnum dataFormat) {
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

