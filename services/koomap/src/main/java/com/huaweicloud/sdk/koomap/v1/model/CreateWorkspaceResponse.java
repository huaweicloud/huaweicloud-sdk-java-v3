package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_type")

    private String workspaceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_description")

    private String workspaceDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star")

    private Integer star;

    public CreateWorkspaceResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作共享空间唯一标识。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateWorkspaceResponse withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作共享空间名称。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public CreateWorkspaceResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CreateWorkspaceResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CreateWorkspaceResponse withWorkspaceType(String workspaceType) {
        this.workspaceType = workspaceType;
        return this;
    }

    /**
     * 工作共享空间类型，当前仅支持DATA_PROCESS（数据处理）。
     * @return workspaceType
     */
    public String getWorkspaceType() {
        return workspaceType;
    }

    public void setWorkspaceType(String workspaceType) {
        this.workspaceType = workspaceType;
    }

    public CreateWorkspaceResponse withWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
        return this;
    }

    /**
     * 工作共享空间描述。
     * @return workspaceDescription
     */
    public String getWorkspaceDescription() {
        return workspaceDescription;
    }

    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }

    public CreateWorkspaceResponse withStar(Integer star) {
        this.star = star;
        return this;
    }

    /**
     * 是否置顶。 - 0：否 - 1：是
     * @return star
     */
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWorkspaceResponse createWorkspaceResponse = (CreateWorkspaceResponse) o;
        return Objects.equals(this.workspaceId, createWorkspaceResponse.workspaceId)
            && Objects.equals(this.workspaceName, createWorkspaceResponse.workspaceName)
            && Objects.equals(this.creator, createWorkspaceResponse.creator)
            && Objects.equals(this.createTime, createWorkspaceResponse.createTime)
            && Objects.equals(this.workspaceType, createWorkspaceResponse.workspaceType)
            && Objects.equals(this.workspaceDescription, createWorkspaceResponse.workspaceDescription)
            && Objects.equals(this.star, createWorkspaceResponse.star);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, workspaceName, creator, createTime, workspaceType, workspaceDescription, star);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkspaceResponse {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    workspaceType: ").append(toIndentedString(workspaceType)).append("\n");
        sb.append("    workspaceDescription: ").append(toIndentedString(workspaceDescription)).append("\n");
        sb.append("    star: ").append(toIndentedString(star)).append("\n");
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
