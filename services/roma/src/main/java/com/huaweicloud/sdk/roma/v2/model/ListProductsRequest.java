package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

    public ListProductsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
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
     * Get limit
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
     * Get appId
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ListProductsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
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
     * Get manufacturerId
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
     * Get manufacturerName
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
     * Get model
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
     * Get deviceType
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    

    public ListProductsRequest withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    


    /**
     * Get createdUserName
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
     * Get createdDateStart
     * minimum: 1
     * maximum: 999999999999999999
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
     * Get createdDateEnd
     * minimum: 1
     * maximum: 999999999999999999
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
     * Get offset
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
            Objects.equals(this.name, listProductsRequest.name) &&
            Objects.equals(this.manufacturerId, listProductsRequest.manufacturerId) &&
            Objects.equals(this.manufacturerName, listProductsRequest.manufacturerName) &&
            Objects.equals(this.model, listProductsRequest.model) &&
            Objects.equals(this.deviceType, listProductsRequest.deviceType) &&
            Objects.equals(this.createdUserName, listProductsRequest.createdUserName) &&
            Objects.equals(this.createdDateStart, listProductsRequest.createdDateStart) &&
            Objects.equals(this.createdDateEnd, listProductsRequest.createdDateEnd) &&
            Objects.equals(this.offset, listProductsRequest.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, limit, appId, name, manufacturerId, manufacturerName, model, deviceType, createdUserName, createdDateStart, createdDateEnd, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    createdDateStart: ").append(toIndentedString(createdDateStart)).append("\n");
        sb.append("    createdDateEnd: ").append(toIndentedString(createdDateEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

