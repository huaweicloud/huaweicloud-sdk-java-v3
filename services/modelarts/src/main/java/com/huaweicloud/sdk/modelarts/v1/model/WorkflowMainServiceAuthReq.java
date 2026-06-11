package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * workflow main service auth request
 */
public class WorkflowMainServiceAuthReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_service_id")

    private String mainServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private String contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume")

    private WorkflowConsume consume;

    public WorkflowMainServiceAuthReq withMainServiceId(String mainServiceId) {
        this.mainServiceId = mainServiceId;
        return this;
    }

    /**
     * 在线服务ID。
     * @return mainServiceId
     */
    public String getMainServiceId() {
        return mainServiceId;
    }

    public void setMainServiceId(String mainServiceId) {
        this.mainServiceId = mainServiceId;
    }

    public WorkflowMainServiceAuthReq withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Gallery资产ID。
     * @return contentId
     */
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public WorkflowMainServiceAuthReq withConsume(WorkflowConsume consume) {
        this.consume = consume;
        return this;
    }

    public WorkflowMainServiceAuthReq withConsume(Consumer<WorkflowConsume> consumeSetter) {
        if (this.consume == null) {
            this.consume = new WorkflowConsume();
            consumeSetter.accept(this.consume);
        }

        return this;
    }

    /**
     * Get consume
     * @return consume
     */
    public WorkflowConsume getConsume() {
        return consume;
    }

    public void setConsume(WorkflowConsume consume) {
        this.consume = consume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowMainServiceAuthReq that = (WorkflowMainServiceAuthReq) obj;
        return Objects.equals(this.mainServiceId, that.mainServiceId) && Objects.equals(this.contentId, that.contentId)
            && Objects.equals(this.consume, that.consume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainServiceId, contentId, consume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowMainServiceAuthReq {\n");
        sb.append("    mainServiceId: ").append(toIndentedString(mainServiceId)).append("\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    consume: ").append(toIndentedString(consume)).append("\n");
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
