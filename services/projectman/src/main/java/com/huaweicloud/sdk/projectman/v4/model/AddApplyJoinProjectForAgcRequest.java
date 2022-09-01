package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class AddApplyJoinProjectForAgcRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Domain-Id")

    @JacksonXmlProperty(localName = "Domain-Id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "User-Id")

    @JacksonXmlProperty(localName = "User-Id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    public AddApplyJoinProjectForAgcRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AddApplyJoinProjectForAgcRequest withUserId(String userId) {
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

    public AddApplyJoinProjectForAgcRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddApplyJoinProjectForAgcRequest addApplyJoinProjectForAgcRequest = (AddApplyJoinProjectForAgcRequest) o;
        return Objects.equals(this.domainId, addApplyJoinProjectForAgcRequest.domainId)
            && Objects.equals(this.userId, addApplyJoinProjectForAgcRequest.userId)
            && Objects.equals(this.projectId, addApplyJoinProjectForAgcRequest.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, userId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddApplyJoinProjectForAgcRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
