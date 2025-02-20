package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchListMultiCloudResourceResponseData
 */
public class BatchListMultiCloudResourceResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private String datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, Object> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public BatchListMultiCloudResourceResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * CMDB生成uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchListMultiCloudResourceResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 在云厂商上存的资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchListMultiCloudResourceResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchListMultiCloudResourceResponseData withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 云厂商
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public BatchListMultiCloudResourceResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BatchListMultiCloudResourceResponseData withDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * 云厂商账户id
     * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public BatchListMultiCloudResourceResponseData withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * regionId
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public BatchListMultiCloudResourceResponseData withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public BatchListMultiCloudResourceResponseData putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public BatchListMultiCloudResourceResponseData withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 资源详细属性
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public BatchListMultiCloudResourceResponseData withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源创建时间
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
        BatchListMultiCloudResourceResponseData that = (BatchListMultiCloudResourceResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.vendor, that.vendor)
            && Objects.equals(this.type, that.type) && Objects.equals(this.datasource, that.datasource)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceId, name, vendor, type, datasource, regionId, properties, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListMultiCloudResourceResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
