package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIteratorDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_id")

    private String iteratorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    public ShowIteratorDetailRequest withIteratorId(String iteratorId) {
        this.iteratorId = iteratorId;
        return this;
    }

    /**
     * 迭代uri
     * @return iteratorId
     */
    public String getIteratorId() {
        return iteratorId;
    }

    public void setIteratorId(String iteratorId) {
        this.iteratorId = iteratorId;
    }

    public ShowIteratorDetailRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIteratorDetailRequest that = (ShowIteratorDetailRequest) obj;
        return Objects.equals(this.iteratorId, that.iteratorId) && Objects.equals(this.projectUuid, that.projectUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iteratorId, projectUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIteratorDetailRequest {\n");
        sb.append("    iteratorId: ").append(toIndentedString(iteratorId)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
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
