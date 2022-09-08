package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateStreamForbiddenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specify_project")

    private String specifyProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StreamForbiddenSetting body;

    public UpdateStreamForbiddenRequest withSpecifyProject(String specifyProject) {
        this.specifyProject = specifyProject;
        return this;
    }

    /**
     * op账号需要携带的特定project_id，当使用op账号时该值为所操作租户的project_id
     * @return specifyProject
     */
    public String getSpecifyProject() {
        return specifyProject;
    }

    public void setSpecifyProject(String specifyProject) {
        this.specifyProject = specifyProject;
    }

    public UpdateStreamForbiddenRequest withBody(StreamForbiddenSetting body) {
        this.body = body;
        return this;
    }

    public UpdateStreamForbiddenRequest withBody(Consumer<StreamForbiddenSetting> bodySetter) {
        if (this.body == null) {
            this.body = new StreamForbiddenSetting();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StreamForbiddenSetting getBody() {
        return body;
    }

    public void setBody(StreamForbiddenSetting body) {
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
        UpdateStreamForbiddenRequest updateStreamForbiddenRequest = (UpdateStreamForbiddenRequest) o;
        return Objects.equals(this.specifyProject, updateStreamForbiddenRequest.specifyProject)
            && Objects.equals(this.body, updateStreamForbiddenRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specifyProject, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStreamForbiddenRequest {\n");
        sb.append("    specifyProject: ").append(toIndentedString(specifyProject)).append("\n");
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
