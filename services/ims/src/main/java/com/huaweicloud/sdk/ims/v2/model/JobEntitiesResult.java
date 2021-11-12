package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** JobEntitiesResult */
public class JobEntitiesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public JobEntitiesResult withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 镜像ID。
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public JobEntitiesResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public JobEntitiesResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 任务状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobEntitiesResult jobEntitiesResult = (JobEntitiesResult) o;
        return Objects.equals(this.imageId, jobEntitiesResult.imageId)
            && Objects.equals(this.projectId, jobEntitiesResult.projectId)
            && Objects.equals(this.status, jobEntitiesResult.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, projectId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntitiesResult {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
