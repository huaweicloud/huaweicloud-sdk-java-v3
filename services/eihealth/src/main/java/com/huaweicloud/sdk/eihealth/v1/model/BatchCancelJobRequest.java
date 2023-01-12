package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCancelJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Force")

    private Boolean xForce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchOperateJobReq body;

    public BatchCancelJobRequest withXForce(Boolean xForce) {
        this.xForce = xForce;
        return this;
    }

    /**
     * 是否强制停止作业
     * @return xForce
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Force")
    public Boolean getXForce() {
        return xForce;
    }

    public void setXForce(Boolean xForce) {
        this.xForce = xForce;
    }

    public BatchCancelJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public BatchCancelJobRequest withBody(BatchOperateJobReq body) {
        this.body = body;
        return this;
    }

    public BatchCancelJobRequest withBody(Consumer<BatchOperateJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new BatchOperateJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchOperateJobReq getBody() {
        return body;
    }

    public void setBody(BatchOperateJobReq body) {
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
        BatchCancelJobRequest batchCancelJobRequest = (BatchCancelJobRequest) o;
        return Objects.equals(this.xForce, batchCancelJobRequest.xForce)
            && Objects.equals(this.eihealthProjectId, batchCancelJobRequest.eihealthProjectId)
            && Objects.equals(this.body, batchCancelJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xForce, eihealthProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCancelJobRequest {\n");
        sb.append("    xForce: ").append(toIndentedString(xForce)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
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
