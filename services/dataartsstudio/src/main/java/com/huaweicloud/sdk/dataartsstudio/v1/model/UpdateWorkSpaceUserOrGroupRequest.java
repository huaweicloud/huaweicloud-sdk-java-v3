package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateWorkSpaceUserOrGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ApigWorkspaceUserDto body;

    public UpdateWorkSpaceUserOrGroupRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateWorkSpaceUserOrGroupRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateWorkSpaceUserOrGroupRequest withBody(ApigWorkspaceUserDto body) {
        this.body = body;
        return this;
    }

    public UpdateWorkSpaceUserOrGroupRequest withBody(Consumer<ApigWorkspaceUserDto> bodySetter) {
        if (this.body == null) {
            this.body = new ApigWorkspaceUserDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ApigWorkspaceUserDto getBody() {
        return body;
    }

    public void setBody(ApigWorkspaceUserDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWorkSpaceUserOrGroupRequest updateWorkSpaceUserOrGroupRequest = (UpdateWorkSpaceUserOrGroupRequest) o;
        return Objects.equals(this.workspaceId, updateWorkSpaceUserOrGroupRequest.workspaceId)
            && Objects.equals(this.userId, updateWorkSpaceUserOrGroupRequest.userId)
            && Objects.equals(this.body, updateWorkSpaceUserOrGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, userId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkSpaceUserOrGroupRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
