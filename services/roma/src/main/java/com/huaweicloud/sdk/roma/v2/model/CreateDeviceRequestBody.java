package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ProductReferer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateDeviceRequestBody
 */
public class CreateDeviceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_device_id")
    
    private Integer parentDeviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product")
    
    private ProductReferer product;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    
    public CreateDeviceRequestBody withParentDeviceId(Integer parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }

    


    /**
     * 父设备ID，无父设备时不填写，自动向下取整
     * minimum: 1
     * maximum: 999999999999999999
     * @return parentDeviceId
     */
    public Integer getParentDeviceId() {
        return parentDeviceId;
    }

    public void setParentDeviceId(Integer parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
    }

    

    public CreateDeviceRequestBody withProduct(ProductReferer product) {
        this.product = product;
        return this;
    }

    public CreateDeviceRequestBody withProduct(Consumer<ProductReferer> productSetter) {
        if(this.product == null ){
            this.product = new ProductReferer();
            productSetter.accept(this.product);
        }
        
        return this;
    }


    /**
     * Get product
     * @return product
     */
    public ProductReferer getProduct() {
        return product;
    }

    public void setProduct(ProductReferer product) {
        this.product = product;
    }

    

    public CreateDeviceRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 设备密码，输入要求：至少1数字，1大写字母，1小写字母，1特殊字符(~!@#$%^&*()-_=+|[{}];:<>/?)，长度8-32个字符
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public CreateDeviceRequestBody withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * 设备名称，支持中文、中文标点符号（）。；，：“”、？《》及英文大小写、数字及英文符号()_,#.?'-@%&!, 长度2-64
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    

    public CreateDeviceRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 设备物理编号，通常使用MAC或者IMEI号，支持英文大小写，数字，下划线和中划线，长度2-64
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public CreateDeviceRequestBody withAppId(String appId) {
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

    

    public CreateDeviceRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 设备状态 0启用 1禁用，不填时默认为0启用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public CreateDeviceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateDeviceRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateDeviceRequestBody addTagsItem(String tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDeviceRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeviceRequestBody createDeviceRequestBody = (CreateDeviceRequestBody) o;
        return Objects.equals(this.parentDeviceId, createDeviceRequestBody.parentDeviceId) &&
            Objects.equals(this.product, createDeviceRequestBody.product) &&
            Objects.equals(this.password, createDeviceRequestBody.password) &&
            Objects.equals(this.deviceName, createDeviceRequestBody.deviceName) &&
            Objects.equals(this.nodeId, createDeviceRequestBody.nodeId) &&
            Objects.equals(this.appId, createDeviceRequestBody.appId) &&
            Objects.equals(this.status, createDeviceRequestBody.status) &&
            Objects.equals(this.description, createDeviceRequestBody.description) &&
            Objects.equals(this.tags, createDeviceRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(parentDeviceId, product, password, deviceName, nodeId, appId, status, description, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeviceRequestBody {\n");
        sb.append("    parentDeviceId: ").append(toIndentedString(parentDeviceId)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

