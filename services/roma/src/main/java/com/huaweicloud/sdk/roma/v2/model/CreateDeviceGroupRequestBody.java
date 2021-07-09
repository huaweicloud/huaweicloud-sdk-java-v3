package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateDeviceGroupRequestBody
 */
public class CreateDeviceGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private Integer parentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public CreateDeviceGroupRequestBody withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * 父分组ID，自动向下取整
     * minimum: 0
     * maximum: 99999999999999999
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    

    public CreateDeviceGroupRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 分组名称，支持中文，英文大小写，数字，下划线和中划线,长度2-64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateDeviceGroupRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 分组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateDeviceGroupRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 分组归属应用ID
     * @return appId
     */
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
        CreateDeviceGroupRequestBody createDeviceGroupRequestBody = (CreateDeviceGroupRequestBody) o;
        return Objects.equals(this.parentId, createDeviceGroupRequestBody.parentId) &&
            Objects.equals(this.name, createDeviceGroupRequestBody.name) &&
            Objects.equals(this.description, createDeviceGroupRequestBody.description) &&
            Objects.equals(this.appId, createDeviceGroupRequestBody.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(parentId, name, description, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeviceGroupRequestBody {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

