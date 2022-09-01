package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateIterationV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    @JacksonXmlProperty(localName = "iteration_id")

    private Integer iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateIterationRequestV4 body;

    public UpdateIterationV4Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateIterationV4Request withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * 迭代id
     * @return iterationId
     */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    public UpdateIterationV4Request withBody(UpdateIterationRequestV4 body) {
        this.body = body;
        return this;
    }

    public UpdateIterationV4Request withBody(Consumer<UpdateIterationRequestV4> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateIterationRequestV4();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateIterationRequestV4 getBody() {
        return body;
    }

    public void setBody(UpdateIterationRequestV4 body) {
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
        UpdateIterationV4Request updateIterationV4Request = (UpdateIterationV4Request) o;
        return Objects.equals(this.projectId, updateIterationV4Request.projectId)
            && Objects.equals(this.iterationId, updateIterationV4Request.iterationId)
            && Objects.equals(this.body, updateIterationV4Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, iterationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIterationV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
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
