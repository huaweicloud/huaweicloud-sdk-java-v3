package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTestCaseAndScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmss_case_uri")

    private String tmssCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turn_on_awmapping")

    private Boolean turnOnAwmapping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTestCaseReq body;

    public UpdateTestCaseAndScriptRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateTestCaseAndScriptRequest withTmssCaseUri(String tmssCaseUri) {
        this.tmssCaseUri = tmssCaseUri;
        return this;
    }

    /**
     * TMSS用例uri
     * @return tmssCaseUri
     */
    public String getTmssCaseUri() {
        return tmssCaseUri;
    }

    public void setTmssCaseUri(String tmssCaseUri) {
        this.tmssCaseUri = tmssCaseUri;
    }

    public UpdateTestCaseAndScriptRequest withTurnOnAwmapping(Boolean turnOnAwmapping) {
        this.turnOnAwmapping = turnOnAwmapping;
        return this;
    }

    /**
     * 新组合AW开关
     * @return turnOnAwmapping
     */
    public Boolean getTurnOnAwmapping() {
        return turnOnAwmapping;
    }

    public void setTurnOnAwmapping(Boolean turnOnAwmapping) {
        this.turnOnAwmapping = turnOnAwmapping;
    }

    public UpdateTestCaseAndScriptRequest withBody(CreateTestCaseReq body) {
        this.body = body;
        return this;
    }

    public UpdateTestCaseAndScriptRequest withBody(Consumer<CreateTestCaseReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTestCaseReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTestCaseReq getBody() {
        return body;
    }

    public void setBody(CreateTestCaseReq body) {
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
        UpdateTestCaseAndScriptRequest that = (UpdateTestCaseAndScriptRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.tmssCaseUri, that.tmssCaseUri)
            && Objects.equals(this.turnOnAwmapping, that.turnOnAwmapping) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, tmssCaseUri, turnOnAwmapping, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseAndScriptRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tmssCaseUri: ").append(toIndentedString(tmssCaseUri)).append("\n");
        sb.append("    turnOnAwmapping: ").append(toIndentedString(turnOnAwmapping)).append("\n");
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
