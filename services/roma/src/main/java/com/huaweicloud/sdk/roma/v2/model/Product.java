package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Authentication;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Product
 */
public class Product  {



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
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authentication")
    
    private Authentication authentication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_format")
    
    private Integer dataFormat;

    public Product withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    
    public Product addPermissionsItem(String permissionsItem) {
        if(this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public Product withPermissions(Consumer<List<String>> permissionsSetter) {
        if(this.permissions == null) {
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

    

    public Product withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 产品ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Product withProductSerial(String productSerial) {
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

    

    public Product withAppId(String appId) {
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

    

    public Product withName(String name) {
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

    

    public Product withManufacturerId(String manufacturerId) {
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

    

    public Product withManufacturerName(String manufacturerName) {
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

    

    public Product withModel(String model) {
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

    

    public Product withProductType(Integer productType) {
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

    

    public Product withDescription(String description) {
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

    

    public Product withProtocolType(Integer protocolType) {
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

    

    public Product withDeviceType(String deviceType) {
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

    

    public Product withVersion(String version) {
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

    

    public Product withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Product withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
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

    

    public Product withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public Product withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
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

    

    public Product withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public Product withAuthentication(Consumer<Authentication> authenticationSetter) {
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

    

    public Product withCreatedDatetime(Long createdDatetime) {
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

    

    public Product withAppName(String appName) {
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

    

    public Product withDataFormat(Integer dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    


    /**
     * data_format 0-JSON 1-USER_DEFINED
     * minimum: 1
     * maximum: 999999999999999999
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
        Product product = (Product) o;
        return Objects.equals(this.permissions, product.permissions) &&
            Objects.equals(this.id, product.id) &&
            Objects.equals(this.productSerial, product.productSerial) &&
            Objects.equals(this.appId, product.appId) &&
            Objects.equals(this.name, product.name) &&
            Objects.equals(this.manufacturerId, product.manufacturerId) &&
            Objects.equals(this.manufacturerName, product.manufacturerName) &&
            Objects.equals(this.model, product.model) &&
            Objects.equals(this.productType, product.productType) &&
            Objects.equals(this.description, product.description) &&
            Objects.equals(this.protocolType, product.protocolType) &&
            Objects.equals(this.deviceType, product.deviceType) &&
            Objects.equals(this.version, product.version) &&
            Objects.equals(this.createdUser, product.createdUser) &&
            Objects.equals(this.lastUpdatedUser, product.lastUpdatedUser) &&
            Objects.equals(this.authentication, product.authentication) &&
            Objects.equals(this.createdDatetime, product.createdDatetime) &&
            Objects.equals(this.appName, product.appName) &&
            Objects.equals(this.dataFormat, product.dataFormat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(permissions, id, productSerial, appId, name, manufacturerId, manufacturerName, model, productType, description, protocolType, deviceType, version, createdUser, lastUpdatedUser, authentication, createdDatetime, appName, dataFormat);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");
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

