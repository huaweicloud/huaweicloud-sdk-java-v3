package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchDeleteIterationsV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteIterationsV4RequestBody body;

    public BatchDeleteIterationsV4Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchDeleteIterationsV4Request withBody(BatchDeleteIterationsV4RequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteIterationsV4Request withBody(Consumer<BatchDeleteIterationsV4RequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteIterationsV4RequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchDeleteIterationsV4RequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteIterationsV4RequestBody body) {
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
        BatchDeleteIterationsV4Request batchDeleteIterationsV4Request = (BatchDeleteIterationsV4Request) o;
        return Objects.equals(this.projectId, batchDeleteIterationsV4Request.projectId)
            && Objects.equals(this.body, batchDeleteIterationsV4Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIterationsV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
