package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAppGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_group_id")

    private String appServerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_server_group_name")

    private String appServerGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private AuthorizationTypeEnum authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private OffsetDateTime createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_count")

    private Integer appCount;

    public CreateAppGroupResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用组ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAppGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAppGroupResponse withAppServerGroupId(String appServerGroupId) {
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

    public CreateAppGroupResponse withAppServerGroupName(String appServerGroupName) {
        this.appServerGroupName = appServerGroupName;
        return this;
    }

    /**
     * 应用服务器组名称
     * @return appServerGroupName
     */
    public String getAppServerGroupName() {
        return appServerGroupName;
    }

    public void setAppServerGroupName(String appServerGroupName) {
        this.appServerGroupName = appServerGroupName;
    }

    public CreateAppGroupResponse withDescription(String description) {
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

    public CreateAppGroupResponse withAuthorizationType(AuthorizationTypeEnum authorizationType) {
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

    public CreateAppGroupResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateAppGroupResponse withAppType(AppTypeEnum appType) {
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

    public CreateAppGroupResponse withCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 发布时间
     * @return createAt
     */
    public OffsetDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
    }

    public CreateAppGroupResponse withAppCount(Integer appCount) {
        this.appCount = appCount;
        return this;
    }

    /**
     * 应用数量
     * @return appCount
     */
    public Integer getAppCount() {
        return appCount;
    }

    public void setAppCount(Integer appCount) {
        this.appCount = appCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAppGroupResponse that = (CreateAppGroupResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.appServerGroupId, that.appServerGroupId)
            && Objects.equals(this.appServerGroupName, that.appServerGroupName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.authorizationType, that.authorizationType)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.appCount, that.appCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            appServerGroupId,
            appServerGroupName,
            description,
            authorizationType,
            tenantId,
            appType,
            createAt,
            appCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppGroupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appServerGroupId: ").append(toIndentedString(appServerGroupId)).append("\n");
        sb.append("    appServerGroupName: ").append(toIndentedString(appServerGroupName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    appCount: ").append(toIndentedString(appCount)).append("\n");
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
