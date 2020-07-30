package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppAuthBindedApiResp
 */
public class AppAuthBindedApiResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    private String envName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_type")
    
    private Integer apiType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_name")
    
    private String apiName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_time")
    
    private OffsetDateTime authTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_creator")
    
    private String appCreator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_remark")
    
    private String apiRemark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_role")
    
    private String authRole;

    public AppAuthBindedApiResp withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API的编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public AppAuthBindedApiResp withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * APP的名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppAuthBindedApiResp withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    


    /**
     * api授权绑定的环境
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public AppAuthBindedApiResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * API绑定的分组
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AppAuthBindedApiResp withApiType(Integer apiType) {
        this.apiType = apiType;
        return this;
    }

    


    /**
     * API类型
     * @return apiType
     */
    public Integer getApiType() {
        return apiType;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    public AppAuthBindedApiResp withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    


    /**
     * API的名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public AppAuthBindedApiResp withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * APP的编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppAuthBindedApiResp withAuthTime(OffsetDateTime authTime) {
        this.authTime = authTime;
        return this;
    }

    


    /**
     * 授权创建的时间
     * @return authTime
     */
    public OffsetDateTime getAuthTime() {
        return authTime;
    }

    public void setAuthTime(OffsetDateTime authTime) {
        this.authTime = authTime;
    }

    public AppAuthBindedApiResp withAppCreator(String appCreator) {
        this.appCreator = appCreator;
        return this;
    }

    


    /**
     * APP的创建者，取值如下： - USER：租户自己创建 - MARKET：API市场分配
     * @return appCreator
     */
    public String getAppCreator() {
        return appCreator;
    }

    public void setAppCreator(String appCreator) {
        this.appCreator = appCreator;
    }

    public AppAuthBindedApiResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 授权关系编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppAuthBindedApiResp withApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
        return this;
    }

    


    /**
     * API的描述信息
     * @return apiRemark
     */
    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }

    public AppAuthBindedApiResp withAuthRole(String authRole) {
        this.authRole = authRole;
        return this;
    }

    


    /**
     * 授权者
     * @return authRole
     */
    public String getAuthRole() {
        return authRole;
    }

    public void setAuthRole(String authRole) {
        this.authRole = authRole;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppAuthBindedApiResp appAuthBindedApiResp = (AppAuthBindedApiResp) o;
        return Objects.equals(this.apiId, appAuthBindedApiResp.apiId) &&
            Objects.equals(this.appName, appAuthBindedApiResp.appName) &&
            Objects.equals(this.envName, appAuthBindedApiResp.envName) &&
            Objects.equals(this.groupName, appAuthBindedApiResp.groupName) &&
            Objects.equals(this.apiType, appAuthBindedApiResp.apiType) &&
            Objects.equals(this.apiName, appAuthBindedApiResp.apiName) &&
            Objects.equals(this.appId, appAuthBindedApiResp.appId) &&
            Objects.equals(this.authTime, appAuthBindedApiResp.authTime) &&
            Objects.equals(this.appCreator, appAuthBindedApiResp.appCreator) &&
            Objects.equals(this.id, appAuthBindedApiResp.id) &&
            Objects.equals(this.apiRemark, appAuthBindedApiResp.apiRemark) &&
            Objects.equals(this.authRole, appAuthBindedApiResp.authRole);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiId, appName, envName, groupName, apiType, apiName, appId, authTime, appCreator, id, apiRemark, authRole);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAuthBindedApiResp {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
        sb.append("    appCreator: ").append(toIndentedString(appCreator)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
        sb.append("    authRole: ").append(toIndentedString(authRole)).append("\n");
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

