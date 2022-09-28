package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAutoJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_job_id")

    private String autoJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateAutJobReq body;

    public UpdateAutoJobRequest withEihealthProjectId(String eihealthProjectId) {
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

    public UpdateAutoJobRequest withAutoJobId(String autoJobId) {
        this.autoJobId = autoJobId;
        return this;
    }

    /**
     * 自动作业id
     * @return autoJobId
     */
    public String getAutoJobId() {
        return autoJobId;
    }

    public void setAutoJobId(String autoJobId) {
        this.autoJobId = autoJobId;
    }

    public UpdateAutoJobRequest withBody(CreateAutJobReq body) {
        this.body = body;
        return this;
    }

    public UpdateAutoJobRequest withBody(Consumer<CreateAutJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAutJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateAutJobReq getBody() {
        return body;
    }

    public void setBody(CreateAutJobReq body) {
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
        UpdateAutoJobRequest updateAutoJobRequest = (UpdateAutoJobRequest) o;
        return Objects.equals(this.eihealthProjectId, updateAutoJobRequest.eihealthProjectId)
            && Objects.equals(this.autoJobId, updateAutoJobRequest.autoJobId)
            && Objects.equals(this.body, updateAutoJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, autoJobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    autoJobId: ").append(toIndentedString(autoJobId)).append("\n");
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
