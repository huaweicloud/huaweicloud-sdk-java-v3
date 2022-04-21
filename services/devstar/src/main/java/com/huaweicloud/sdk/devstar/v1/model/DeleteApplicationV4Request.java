package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteApplicationV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_repository")

    private Boolean isDeleteRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_ids")

    private String pipelineIds;

    public DeleteApplicationV4Request withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public DeleteApplicationV4Request withIsDeleteRepository(Boolean isDeleteRepository) {
        this.isDeleteRepository = isDeleteRepository;
        return this;
    }

    /**
     * 是否删除代码仓
     * @return isDeleteRepository
     */
    public Boolean getIsDeleteRepository() {
        return isDeleteRepository;
    }

    public void setIsDeleteRepository(Boolean isDeleteRepository) {
        this.isDeleteRepository = isDeleteRepository;
    }

    public DeleteApplicationV4Request withPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }

    /**
     * 删除流水线ID,多流水线逗号隔开
     * @return pipelineIds
     */
    public String getPipelineIds() {
        return pipelineIds;
    }

    public void setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteApplicationV4Request deleteApplicationV4Request = (DeleteApplicationV4Request) o;
        return Objects.equals(this.applicationId, deleteApplicationV4Request.applicationId)
            && Objects.equals(this.isDeleteRepository, deleteApplicationV4Request.isDeleteRepository)
            && Objects.equals(this.pipelineIds, deleteApplicationV4Request.pipelineIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, isDeleteRepository, pipelineIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteApplicationV4Request {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    isDeleteRepository: ").append(toIndentedString(isDeleteRepository)).append("\n");
        sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
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
