package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_info")

    private String statusInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grants")

    private List<CreateWorkspaceResponseBodyGrants> grants = null;

    public CreateWorkspaceResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 创建者名称。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateWorkspaceResponse withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 授权类型。默认值为PUBLIC。PUBLIC：租户内部公开访问。PRIVATE：仅创建者和主账号可访问。INTERNAL：创建者、主账号、指定IAM子账号可访问，需要与grants参数配合使用。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public CreateWorkspaceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateWorkspaceResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最后修改时间，UTC。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateWorkspaceResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，UTC。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateWorkspaceResponse withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public CreateWorkspaceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWorkspaceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作空间描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWorkspaceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作空间ID，系统生成的32位UUID，不带橫线。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateWorkspaceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工作空间状态。 - CREATE_FAILED：创建失败。 - NORMAL：状态正常。 - DELETING：正在删除。 - DELETE_FAILED：删除失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateWorkspaceResponse withStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    /**
     * 状态描述，默认为空。该字段会补充显示状态的详细信息。如删除失败时，可通过该字段查看删除失败的原因。
     * @return statusInfo
     */
    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public CreateWorkspaceResponse withGrants(List<CreateWorkspaceResponseBodyGrants> grants) {
        this.grants = grants;
        return this;
    }

    public CreateWorkspaceResponse addGrantsItem(CreateWorkspaceResponseBodyGrants grantsItem) {
        if (this.grants == null) {
            this.grants = new ArrayList<>();
        }
        this.grants.add(grantsItem);
        return this;
    }

    public CreateWorkspaceResponse withGrants(Consumer<List<CreateWorkspaceResponseBodyGrants>> grantsSetter) {
        if (this.grants == null) {
            this.grants = new ArrayList<>();
        }
        grantsSetter.accept(this.grants);
        return this;
    }

    /**
     * 授权用户列表。默认为空。需要与“auth_type”参数配合使用，且仅当授权类型为“INTERNAL”时才会生效。
     * @return grants
     */
    public List<CreateWorkspaceResponseBodyGrants> getGrants() {
        return grants;
    }

    public void setGrants(List<CreateWorkspaceResponseBodyGrants> grants) {
        this.grants = grants;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkspaceResponse that = (CreateWorkspaceResponse) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusInfo, that.statusInfo) && Objects.equals(this.grants, that.grants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner,
            authType,
            enterpriseProjectId,
            updateTime,
            createTime,
            enterpriseProjectName,
            name,
            description,
            id,
            status,
            statusInfo,
            grants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkspaceResponse {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
        sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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
