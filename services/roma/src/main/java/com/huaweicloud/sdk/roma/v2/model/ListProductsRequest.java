package com.huaweicloud.sdk.roma.v2.model;




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
 * Request Object
 */
public class ListProductsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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
    @JsonProperty(value="device_type")
    
    private String deviceType;
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
            return value;
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
            if (obj instanceof ProductTypeEnum) {
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
            return value;
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
            if (obj instanceof ProtocolTypeEnum) {
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
    @JsonProperty(value="created_user_name")
    
    private String createdUserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_date_start")
    
    private Long createdDateStart;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_date_end")
    
    private Long createdDateEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_serial")
    
    private String productSerial;

    public ListProductsRequest withInstanceId(String instanceId) {
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

    

    public ListProductsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示条目数量，最大数量999，超过999后只返回999
     * minimum: 0
     * maximum: 999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListProductsRequest withAppId(String appId) {
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

    

    public ListProductsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 产品ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListProductsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 产品名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListProductsRequest withManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
        return this;
    }

    


    /**
     * 厂商ID
     * @return manufacturerId
     */
    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    

    public ListProductsRequest withManufacturerName(String manufacturerName) {
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

    

    public ListProductsRequest withModel(String model) {
        this.model = model;
        return this;
    }

    


    /**
     * 型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public ListProductsRequest withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    


    /**
     * 产品的设备类型，默认Default
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    

    public ListProductsRequest withProductType(ProductTypeEnum productType) {
        this.productType = productType;
        return this;
    }

    


    /**
     * 产品类型，0-普通产品(不支持子设备) 1-网关产品
     * minimum: 0
     * maximum: 10
     * @return productType
     */
    public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    

    public ListProductsRequest withProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 产品的协议类型 0-mqtt 2-modbus 4-opcua
     * minimum: 0
     * maximum: 10
     * @return protocolType
     */
    public ProtocolTypeEnum getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
    }

    

    public ListProductsRequest withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    


    /**
     * 创建用户
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    

    public ListProductsRequest withCreatedDateStart(Long createdDateStart) {
        this.createdDateStart = createdDateStart;
        return this;
    }

    


    /**
     * 创建时间起始，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 99999999999999999
     * @return createdDateStart
     */
    public Long getCreatedDateStart() {
        return createdDateStart;
    }

    public void setCreatedDateStart(Long createdDateStart) {
        this.createdDateStart = createdDateStart;
    }

    

    public ListProductsRequest withCreatedDateEnd(Long createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
        return this;
    }

    


    /**
     * 创建时间截止，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 99999999999999999
     * @return createdDateEnd
     */
    public Long getCreatedDateEnd() {
        return createdDateEnd;
    }

    public void setCreatedDateEnd(Long createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
    }

    

    public ListProductsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListProductsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ListProductsRequest withProductSerial(String productSerial) {
        this.productSerial = productSerial;
        return this;
    }

    


    /**
     * 产品唯一序列（系统唯一值，用于MQS的TOPIC中标记产品）
     * @return productSerial
     */
    public String getProductSerial() {
        return productSerial;
    }

    public void setProductSerial(String productSerial) {
        this.productSerial = productSerial;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductsRequest listProductsRequest = (ListProductsRequest) o;
        return Objects.equals(this.instanceId, listProductsRequest.instanceId) &&
            Objects.equals(this.limit, listProductsRequest.limit) &&
            Objects.equals(this.appId, listProductsRequest.appId) &&
            Objects.equals(this.id, listProductsRequest.id) &&
            Objects.equals(this.name, listProductsRequest.name) &&
            Objects.equals(this.manufacturerId, listProductsRequest.manufacturerId) &&
            Objects.equals(this.manufacturerName, listProductsRequest.manufacturerName) &&
            Objects.equals(this.model, listProductsRequest.model) &&
            Objects.equals(this.deviceType, listProductsRequest.deviceType) &&
            Objects.equals(this.productType, listProductsRequest.productType) &&
            Objects.equals(this.protocolType, listProductsRequest.protocolType) &&
            Objects.equals(this.createdUserName, listProductsRequest.createdUserName) &&
            Objects.equals(this.createdDateStart, listProductsRequest.createdDateStart) &&
            Objects.equals(this.createdDateEnd, listProductsRequest.createdDateEnd) &&
            Objects.equals(this.offset, listProductsRequest.offset) &&
            Objects.equals(this.appName, listProductsRequest.appName) &&
            Objects.equals(this.productSerial, listProductsRequest.productSerial);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, limit, appId, id, name, manufacturerId, manufacturerName, model, deviceType, productType, protocolType, createdUserName, createdDateStart, createdDateEnd, offset, appName, productSerial);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    createdDateStart: ").append(toIndentedString(createdDateStart)).append("\n");
        sb.append("    createdDateEnd: ").append(toIndentedString(createdDateEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    productSerial: ").append(toIndentedString(productSerial)).append("\n");
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

