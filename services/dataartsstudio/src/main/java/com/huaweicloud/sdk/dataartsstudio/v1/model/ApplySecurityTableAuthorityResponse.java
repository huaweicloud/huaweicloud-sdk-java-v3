package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ApplySecurityTableAuthorityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "describe")

    private String describe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_center_url")

    private String permissionCenterUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    public ApplySecurityTableAuthorityResponse withDescribe(String describe) {
        this.describe = describe;
        return this;
    }

    /**
     * 描述
     * @return describe
     */
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public ApplySecurityTableAuthorityResponse withPermissionCenterUrl(String permissionCenterUrl) {
        this.permissionCenterUrl = permissionCenterUrl;
        return this;
    }

    /**
     * 审批页面地址
     * @return permissionCenterUrl
     */
    public String getPermissionCenterUrl() {
        return permissionCenterUrl;
    }

    public void setPermissionCenterUrl(String permissionCenterUrl) {
        this.permissionCenterUrl = permissionCenterUrl;
    }

    public ApplySecurityTableAuthorityResponse withWorkspaceId(String workspaceId) {
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

    public ApplySecurityTableAuthorityResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 工单id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplySecurityTableAuthorityResponse that = (ApplySecurityTableAuthorityResponse) obj;
        return Objects.equals(this.describe, that.describe)
            && Objects.equals(this.permissionCenterUrl, that.permissionCenterUrl)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.applicationId, that.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(describe, permissionCenterUrl, workspaceId, applicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplySecurityTableAuthorityResponse {\n");
        sb.append("    describe: ").append(toIndentedString(describe)).append("\n");
        sb.append("    permissionCenterUrl: ").append(toIndentedString(permissionCenterUrl)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
