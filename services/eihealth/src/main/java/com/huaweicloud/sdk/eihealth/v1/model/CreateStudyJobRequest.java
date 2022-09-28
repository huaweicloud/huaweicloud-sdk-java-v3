package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateStudyJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "study_id")

    private String studyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateStudyJobReq body;

    public CreateStudyJobRequest withEihealthProjectId(String eihealthProjectId) {
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

    public CreateStudyJobRequest withStudyId(String studyId) {
        this.studyId = studyId;
        return this;
    }

    /**
     * study_id
     * @return studyId
     */
    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public CreateStudyJobRequest withBody(CreateStudyJobReq body) {
        this.body = body;
        return this;
    }

    public CreateStudyJobRequest withBody(Consumer<CreateStudyJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateStudyJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateStudyJobReq getBody() {
        return body;
    }

    public void setBody(CreateStudyJobReq body) {
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
        CreateStudyJobRequest createStudyJobRequest = (CreateStudyJobRequest) o;
        return Objects.equals(this.eihealthProjectId, createStudyJobRequest.eihealthProjectId)
            && Objects.equals(this.studyId, createStudyJobRequest.studyId)
            && Objects.equals(this.body, createStudyJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, studyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStudyJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    studyId: ").append(toIndentedString(studyId)).append("\n");
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
