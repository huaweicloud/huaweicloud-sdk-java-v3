package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSynthesisJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSynthesisJobReq body;

    public CreateSynthesisJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 盘古辅助制药平台项目ID。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public CreateSynthesisJobRequest withBody(CreateSynthesisJobReq body) {
        this.body = body;
        return this;
    }

    public CreateSynthesisJobRequest withBody(Consumer<CreateSynthesisJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSynthesisJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateSynthesisJobReq getBody() {
        return body;
    }

    public void setBody(CreateSynthesisJobReq body) {
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
        CreateSynthesisJobRequest that = (CreateSynthesisJobRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSynthesisJobRequest {\n");
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
