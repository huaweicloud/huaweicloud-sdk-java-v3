package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateDomainMappingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specify_project")

    private String specifyProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DomainMapping body;

    public CreateDomainMappingRequest withSpecifyProject(String specifyProject) {
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

    public CreateDomainMappingRequest withBody(DomainMapping body) {
        this.body = body;
        return this;
    }

    public CreateDomainMappingRequest withBody(Consumer<DomainMapping> bodySetter) {
        if (this.body == null) {
            this.body = new DomainMapping();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DomainMapping getBody() {
        return body;
    }

    public void setBody(DomainMapping body) {
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
        CreateDomainMappingRequest createDomainMappingRequest = (CreateDomainMappingRequest) o;
        return Objects.equals(this.specifyProject, createDomainMappingRequest.specifyProject)
            && Objects.equals(this.body, createDomainMappingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specifyProject, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDomainMappingRequest {\n");
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
