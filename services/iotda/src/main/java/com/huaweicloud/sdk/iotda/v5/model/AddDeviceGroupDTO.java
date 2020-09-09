package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建设备组请求结构体
 */
public class AddDeviceGroupDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="super_group_id")
    
    private String superGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public AddDeviceGroupDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 设备组名称，单个资源空间下不可重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddDeviceGroupDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 设备组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddDeviceGroupDTO withSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }

    


    /**
     * 父设备组ID，携带该参数时表示在该设备组下创建一个子设备组。
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return superGroupId;
    }

    public void setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
    }

    public AddDeviceGroupDTO withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的设备组归属到哪个资源空间下，否则创建的设备组将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。
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
        AddDeviceGroupDTO addDeviceGroupDTO = (AddDeviceGroupDTO) o;
        return Objects.equals(this.name, addDeviceGroupDTO.name) &&
            Objects.equals(this.description, addDeviceGroupDTO.description) &&
            Objects.equals(this.superGroupId, addDeviceGroupDTO.superGroupId) &&
            Objects.equals(this.appId, addDeviceGroupDTO.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, superGroupId, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeviceGroupDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    superGroupId: ").append(toIndentedString(superGroupId)).append("\n");
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

