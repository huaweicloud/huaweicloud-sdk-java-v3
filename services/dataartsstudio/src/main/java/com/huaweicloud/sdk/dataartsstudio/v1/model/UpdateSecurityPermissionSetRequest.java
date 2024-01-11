package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSecurityPermissionSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PermissionSetCreateDTO body;

    public UpdateSecurityPermissionSetRequest withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集id
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public UpdateSecurityPermissionSetRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public UpdateSecurityPermissionSetRequest withBody(PermissionSetCreateDTO body) {
        this.body = body;
        return this;
    }

    public UpdateSecurityPermissionSetRequest withBody(Consumer<PermissionSetCreateDTO> bodySetter) {
        if (this.body == null) {
            this.body = new PermissionSetCreateDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PermissionSetCreateDTO getBody() {
        return body;
    }

    public void setBody(PermissionSetCreateDTO body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityPermissionSetRequest that = (UpdateSecurityPermissionSetRequest) obj;
        return Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetId, workspace, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityPermissionSetRequest {\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
