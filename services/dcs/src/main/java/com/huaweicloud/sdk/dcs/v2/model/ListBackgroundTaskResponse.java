package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.DetailsBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBackgroundTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="details")
    
    private DetailsBody details = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private String params;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;

    public ListBackgroundTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 后台任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListBackgroundTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后台任务名，目前支持以下取值：  ChangeInstanceSpec：变更规格  BindEip：开启公网访问  UnBindEip：关闭公网访问  AddReplica：添加副本  DelReplica：删除副本  AddWhitelist：设置IP白名单  UpdatePort：修改端口  RemoveIpFromDns：域名摘除IP 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListBackgroundTaskResponse withDetails(DetailsBody details) {
        this.details = details;
        return this;
    }

    public ListBackgroundTaskResponse withDetails(Consumer<DetailsBody> detailsSetter) {
        if(this.details == null ){
            this.details = new DetailsBody();
            detailsSetter.accept(this.details);
        }
        
        return this;
    }


    /**
     * Get details
     * @return details
     */
    public DetailsBody getDetails() {
        return details;
    }

    public void setDetails(DetailsBody details) {
        this.details = details;
    }

    public ListBackgroundTaskResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListBackgroundTaskResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListBackgroundTaskResponse withParams(String params) {
        this.params = params;
        return this;
    }

    


    /**
     * 任务相关参数
     * @return params
     */
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public ListBackgroundTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListBackgroundTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 任务启动时间，格式为2020-06-17T07:38:42.503Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListBackgroundTaskResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 任务结束时间，格式为2020-06-17T07:38:42.503Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackgroundTaskResponse listBackgroundTaskResponse = (ListBackgroundTaskResponse) o;
        return Objects.equals(this.id, listBackgroundTaskResponse.id) &&
            Objects.equals(this.name, listBackgroundTaskResponse.name) &&
            Objects.equals(this.details, listBackgroundTaskResponse.details) &&
            Objects.equals(this.userName, listBackgroundTaskResponse.userName) &&
            Objects.equals(this.userId, listBackgroundTaskResponse.userId) &&
            Objects.equals(this.params, listBackgroundTaskResponse.params) &&
            Objects.equals(this.status, listBackgroundTaskResponse.status) &&
            Objects.equals(this.createdAt, listBackgroundTaskResponse.createdAt) &&
            Objects.equals(this.updatedAt, listBackgroundTaskResponse.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, details, userName, userId, params, status, createdAt, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackgroundTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

