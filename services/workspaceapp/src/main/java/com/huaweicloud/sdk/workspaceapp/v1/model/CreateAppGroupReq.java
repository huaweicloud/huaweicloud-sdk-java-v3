package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建应用组,允许创建应用组之后再绑定应用服务器组
 */
public class CreateAppGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_group_id")

    private String appServerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private AuthorizationTypeEnum authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    public CreateAppGroupReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用组名称,名称需满足如下规则: 1. 由中文，英文大小写，数字，_-组成 2. 长度范围1~64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAppGroupReq withAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
        return this;
    }

    /**
     * 应用服务器组ID
     * @return appServerGroupId
     */
    public String getAppServerGroupId() {
        return appServerGroupId;
    }

    public void setAppServerGroupId(String appServerGroupId) {
        this.appServerGroupId = appServerGroupId;
    }

    public CreateAppGroupReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAppGroupReq withAuthorizationType(AuthorizationTypeEnum authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * Get authorizationType
     * @return authorizationType
     */
    public AuthorizationTypeEnum getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(AuthorizationTypeEnum authorizationType) {
        this.authorizationType = authorizationType;
    }

    public CreateAppGroupReq withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    /**
     * Get appType
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAppGroupReq that = (CreateAppGroupReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.appServerGroupId, that.appServerGroupId)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.authorizationType, that.authorizationType)
            && Objects.equals(this.appType, that.appType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appServerGroupId, description, authorizationType, appType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppGroupReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appServerGroupId: ").append(toIndentedString(appServerGroupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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
