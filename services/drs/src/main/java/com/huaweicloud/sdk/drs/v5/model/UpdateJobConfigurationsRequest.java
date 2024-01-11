package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateJobConfigurationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyParameterReq body;

    public UpdateJobConfigurationsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateJobConfigurationsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public UpdateJobConfigurationsRequest withBody(ModifyParameterReq body) {
        this.body = body;
        return this;
    }

    public UpdateJobConfigurationsRequest withBody(Consumer<ModifyParameterReq> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyParameterReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyParameterReq getBody() {
        return body;
    }

    public void setBody(ModifyParameterReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateJobConfigurationsRequest that = (UpdateJobConfigurationsRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, xLanguage, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobConfigurationsRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
