package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Authentication;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateProductResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permissions")
    
    private List<String> permissions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_serial")
    
    private String productSerial;


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
     * 产品的协议类型 0-mqtt 1-coap 2-modbus 3-http, 4-opcua
     */
    public static final class ProtocolTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProtocolTypeEnum NUMBER_0 = new ProtocolTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProtocolTypeEnum NUMBER_1 = new ProtocolTypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ProtocolTypeEnum NUMBER_2 = new ProtocolTypeEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ProtocolTypeEnum NUMBER_3 = new ProtocolTypeEnum(3);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final ProtocolTypeEnum NUMBER_4 = new ProtocolTypeEnum(4);
        

        private static final Map<Integer, ProtocolTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtocolTypeEnum> createStaticFields() {
            Map<Integer, ProtocolTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
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
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authentication")
    
    private Authentication authentication = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_format")
    
    private Integer dataFormat;

    public CreateProductResponse withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    
    public CreateProductResponse addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public CreateProductResponse withPermissions(Consumer<List<String>> permissionsSetter) {
        if(this.permissions == null ){
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 权限
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public CreateProductResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 产品ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CreateProductResponse withProductSerial(String productSerial) {
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

    public CreateProductResponse withAppId(String appId) {
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

    public CreateProductResponse withName(String name) {
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

    public CreateProductResponse withManufacturerId(String manufacturerId) {
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

    public CreateProductResponse withManufacturerName(String manufacturerName) {
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

    public CreateProductResponse withModel(String model) {
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

    public CreateProductResponse withProductType(ProductTypeEnum productType) {
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

    public CreateProductResponse withDescription(String description) {
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

    public CreateProductResponse withProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 产品的协议类型 0-mqtt 1-coap 2-modbus 3-http, 4-opcua
     * @return protocolType
     */
    public ProtocolTypeEnum getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
    }

    public CreateProductResponse withDeviceType(String deviceType) {
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

    public CreateProductResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 产品版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateProductResponse withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public CreateProductResponse withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if(this.createdUser == null ){
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }
        
        return this;
    }


    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    public CreateProductResponse withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public CreateProductResponse withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if(this.lastUpdatedUser == null ){
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }
        
        return this;
    }


    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public CreateProductResponse withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public CreateProductResponse withAuthentication(Consumer<Authentication> authenticationSetter) {
        if(this.authentication == null ){
            this.authentication = new Authentication();
            authenticationSetter.accept(this.authentication);
        }
        
        return this;
    }


    /**
     * Get authentication
     * @return authentication
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public CreateProductResponse withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public CreateProductResponse withAppName(String appName) {
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

    public CreateProductResponse withDataFormat(Integer dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    


    /**
     * data_format 0-JSON 1-USER_DEFINED
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
        CreateProductResponse createProductResponse = (CreateProductResponse) o;
        return Objects.equals(this.permissions, createProductResponse.permissions) &&
            Objects.equals(this.id, createProductResponse.id) &&
            Objects.equals(this.productSerial, createProductResponse.productSerial) &&
            Objects.equals(this.appId, createProductResponse.appId) &&
            Objects.equals(this.name, createProductResponse.name) &&
            Objects.equals(this.manufacturerId, createProductResponse.manufacturerId) &&
            Objects.equals(this.manufacturerName, createProductResponse.manufacturerName) &&
            Objects.equals(this.model, createProductResponse.model) &&
            Objects.equals(this.productType, createProductResponse.productType) &&
            Objects.equals(this.description, createProductResponse.description) &&
            Objects.equals(this.protocolType, createProductResponse.protocolType) &&
            Objects.equals(this.deviceType, createProductResponse.deviceType) &&
            Objects.equals(this.version, createProductResponse.version) &&
            Objects.equals(this.createdUser, createProductResponse.createdUser) &&
            Objects.equals(this.lastUpdatedUser, createProductResponse.lastUpdatedUser) &&
            Objects.equals(this.authentication, createProductResponse.authentication) &&
            Objects.equals(this.createdDatetime, createProductResponse.createdDatetime) &&
            Objects.equals(this.appName, createProductResponse.appName) &&
            Objects.equals(this.dataFormat, createProductResponse.dataFormat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(permissions, id, productSerial, appId, name, manufacturerId, manufacturerName, model, productType, description, protocolType, deviceType, version, createdUser, lastUpdatedUser, authentication, createdDatetime, appName, dataFormat);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProductResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productSerial: ").append(toIndentedString(productSerial)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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

