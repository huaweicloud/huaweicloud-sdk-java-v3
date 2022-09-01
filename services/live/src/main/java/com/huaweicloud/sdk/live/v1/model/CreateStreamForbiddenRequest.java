package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateStreamForbiddenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specify_project")

    @JacksonXmlProperty(localName = "specify_project")

    private String specifyProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private StreamForbiddenSetting body;

    public CreateStreamForbiddenRequest withSpecifyProject(String specifyProject) {
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

    public CreateStreamForbiddenRequest withBody(StreamForbiddenSetting body) {
        this.body = body;
        return this;
    }

    public CreateStreamForbiddenRequest withBody(Consumer<StreamForbiddenSetting> bodySetter) {
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
        CreateStreamForbiddenRequest createStreamForbiddenRequest = (CreateStreamForbiddenRequest) o;
        return Objects.equals(this.specifyProject, createStreamForbiddenRequest.specifyProject)
            && Objects.equals(this.body, createStreamForbiddenRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specifyProject, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStreamForbiddenRequest {\n");
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
