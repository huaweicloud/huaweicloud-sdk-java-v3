package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageServer
 */
public class ImageServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_ref")

    private ImageRef imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ImageServerStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorize_accounts")

    private List<ImageAccountInfo> authorizeAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ImageServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例的唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageServer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageServer withImageRef(ImageRef imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    public ImageServer withImageRef(Consumer<ImageRef> imageRefSetter) {
        if (this.imageRef == null) {
            this.imageRef = new ImageRef();
            imageRefSetter.accept(this.imageRef);
        }

        return this;
    }

    /**
     * Get imageRef
     * @return imageRef
     */
    public ImageRef getImageRef() {
        return imageRef;
    }

    public void setImageRef(ImageRef imageRef) {
        this.imageRef = imageRef;
    }

    public ImageServer withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * APS服务器组ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ImageServer withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID。
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public ImageServer withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * APS实例ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ImageServer withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * ECS服务器ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ImageServer withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像产物唯一标识。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageServer withStatus(ImageServerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ImageServerStatus getStatus() {
        return status;
    }

    public void setStatus(ImageServerStatus status) {
        this.status = status;
    }

    public ImageServer withAuthorizeAccounts(List<ImageAccountInfo> authorizeAccounts) {
        this.authorizeAccounts = authorizeAccounts;
        return this;
    }

    public ImageServer addAuthorizeAccountsItem(ImageAccountInfo authorizeAccountsItem) {
        if (this.authorizeAccounts == null) {
            this.authorizeAccounts = new ArrayList<>();
        }
        this.authorizeAccounts.add(authorizeAccountsItem);
        return this;
    }

    public ImageServer withAuthorizeAccounts(Consumer<List<ImageAccountInfo>> authorizeAccountsSetter) {
        if (this.authorizeAccounts == null) {
            this.authorizeAccounts = new ArrayList<>();
        }
        authorizeAccountsSetter.accept(this.authorizeAccounts);
        return this;
    }

    /**
     * 应用组授权用户， * 限制用户类型：'USER' - 用户
     * @return authorizeAccounts
     */
    public List<ImageAccountInfo> getAuthorizeAccounts() {
        return authorizeAccounts;
    }

    public void setAuthorizeAccounts(List<ImageAccountInfo> authorizeAccounts) {
        this.authorizeAccounts = authorizeAccounts;
    }

    public ImageServer withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 镜像实例创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ImageServer withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ImageServer withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID,仅企业项目需配置(字段为空或者0表示使用默认default企业项目)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageServer that = (ImageServer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.imageRef, that.imageRef)
            && Objects.equals(this.serverGroupId, that.serverGroupId)
            && Objects.equals(this.appGroupId, that.appGroupId) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.authorizeAccounts, that.authorizeAccounts)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            imageRef,
            serverGroupId,
            appGroupId,
            serverId,
            instanceId,
            imageId,
            status,
            authorizeAccounts,
            createTime,
            updateTime,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageServer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    authorizeAccounts: ").append(toIndentedString(authorizeAccounts)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
