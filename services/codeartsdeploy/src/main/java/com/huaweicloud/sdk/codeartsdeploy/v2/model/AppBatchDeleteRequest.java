package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppBatchDeleteRequest
 */
public class AppBatchDeleteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_ids")

    private List<String> applicationIds = null;

    public AppBatchDeleteRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AppBatchDeleteRequest withApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }

    public AppBatchDeleteRequest addApplicationIdsItem(String applicationIdsItem) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        this.applicationIds.add(applicationIdsItem);
        return this;
    }

    public AppBatchDeleteRequest withApplicationIds(Consumer<List<String>> applicationIdsSetter) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        applicationIdsSetter.accept(this.applicationIds);
        return this;
    }

    /**
     * 应用id列表
     * @return applicationIds
     */
    public List<String> getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppBatchDeleteRequest that = (AppBatchDeleteRequest) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.applicationIds, that.applicationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, applicationIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppBatchDeleteRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
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
