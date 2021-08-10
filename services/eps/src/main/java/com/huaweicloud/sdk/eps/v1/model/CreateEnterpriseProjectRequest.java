package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateEnterpriseProjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EnterpriseProject body;

    public CreateEnterpriseProjectRequest withBody(EnterpriseProject body) {
        this.body = body;
        return this;
    }

    public CreateEnterpriseProjectRequest withBody(Consumer<EnterpriseProject> bodySetter) {
        if (this.body == null) {
            this.body = new EnterpriseProject();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public EnterpriseProject getBody() {
        return body;
    }

    public void setBody(EnterpriseProject body) {
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
        CreateEnterpriseProjectRequest createEnterpriseProjectRequest = (CreateEnterpriseProjectRequest) o;
        return Objects.equals(this.body, createEnterpriseProjectRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEnterpriseProjectRequest {\n");
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
