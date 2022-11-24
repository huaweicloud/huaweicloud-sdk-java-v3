package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectIterationsV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time_interval")

    private String updatedTimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_deleted")

    private Boolean includeDeleted;

    public ListProjectIterationsV4Request withProjectId(String projectId) {
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

    public ListProjectIterationsV4Request withUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
        return this;
    }

    /**
     * 更新迭代的时间(查询的起始时间,查询的结束时间)
     * @return updatedTimeInterval
     */
    public String getUpdatedTimeInterval() {
        return updatedTimeInterval;
    }

    public void setUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
    }

    public ListProjectIterationsV4Request withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }

    /**
     * 是否包含被删除的迭代,默认false不包含被删除的迭代
     * @return includeDeleted
     */
    public Boolean getIncludeDeleted() {
        return includeDeleted;
    }

    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectIterationsV4Request listProjectIterationsV4Request = (ListProjectIterationsV4Request) o;
        return Objects.equals(this.projectId, listProjectIterationsV4Request.projectId)
            && Objects.equals(this.updatedTimeInterval, listProjectIterationsV4Request.updatedTimeInterval)
            && Objects.equals(this.includeDeleted, listProjectIterationsV4Request.includeDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, updatedTimeInterval, includeDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectIterationsV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    updatedTimeInterval: ").append(toIndentedString(updatedTimeInterval)).append("\n");
        sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
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
