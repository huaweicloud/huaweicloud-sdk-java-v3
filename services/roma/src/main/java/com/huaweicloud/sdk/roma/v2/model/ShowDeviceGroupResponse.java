package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeviceGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permissions")
    
    private List<String> permissions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private Integer parentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private String createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_datetime")
    
    private String lastUpdatedDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;

    public ShowDeviceGroupResponse withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    
    public ShowDeviceGroupResponse addPermissionsItem(String permissionsItem) {
        if(this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public ShowDeviceGroupResponse withPermissions(Consumer<List<String>> permissionsSetter) {
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

    

    public ShowDeviceGroupResponse withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * 父分组ID
     * minimum: 1
     * maximum: 99999999999999999
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    

    public ShowDeviceGroupResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 分组ID
     * minimum: 1
     * maximum: 99999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public ShowDeviceGroupResponse withName(String name) {
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

    

    public ShowDeviceGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 分组描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowDeviceGroupResponse withAppId(String appId) {
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

    

    public ShowDeviceGroupResponse withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public ShowDeviceGroupResponse withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
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

    

    public ShowDeviceGroupResponse withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public ShowDeviceGroupResponse withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
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

    

    public ShowDeviceGroupResponse withCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createdDatetime
     */
    public String getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    

    public ShowDeviceGroupResponse withLastUpdatedDatetime(String lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    


    /**
     * 最后修改时间
     * @return lastUpdatedDatetime
     */
    public String getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(String lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    

    public ShowDeviceGroupResponse withAppName(String appName) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeviceGroupResponse showDeviceGroupResponse = (ShowDeviceGroupResponse) o;
        return Objects.equals(this.permissions, showDeviceGroupResponse.permissions) &&
            Objects.equals(this.parentId, showDeviceGroupResponse.parentId) &&
            Objects.equals(this.id, showDeviceGroupResponse.id) &&
            Objects.equals(this.name, showDeviceGroupResponse.name) &&
            Objects.equals(this.description, showDeviceGroupResponse.description) &&
            Objects.equals(this.appId, showDeviceGroupResponse.appId) &&
            Objects.equals(this.createdUser, showDeviceGroupResponse.createdUser) &&
            Objects.equals(this.lastUpdatedUser, showDeviceGroupResponse.lastUpdatedUser) &&
            Objects.equals(this.createdDatetime, showDeviceGroupResponse.createdDatetime) &&
            Objects.equals(this.lastUpdatedDatetime, showDeviceGroupResponse.lastUpdatedDatetime) &&
            Objects.equals(this.appName, showDeviceGroupResponse.appName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(permissions, parentId, id, name, description, appId, createdUser, lastUpdatedUser, createdDatetime, lastUpdatedDatetime, appName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceGroupResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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

