package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateApplicationEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_urn")

    private String applicationUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateApplicationEndpointRequestBody body;

    public CreateApplicationEndpointRequest withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    /** Application的唯一资源标识，可通过[查询Application](https://support.huaweicloud.com/api-smn/ListApplications.html)获取该标识。
     * 
     * @return applicationUrn */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    public CreateApplicationEndpointRequest withBody(CreateApplicationEndpointRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateApplicationEndpointRequest withBody(Consumer<CreateApplicationEndpointRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateApplicationEndpointRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateApplicationEndpointRequestBody getBody() {
        return body;
    }

    public void setBody(CreateApplicationEndpointRequestBody body) {
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
        CreateApplicationEndpointRequest createApplicationEndpointRequest = (CreateApplicationEndpointRequest) o;
        return Objects.equals(this.applicationUrn, createApplicationEndpointRequest.applicationUrn)
            && Objects.equals(this.body, createApplicationEndpointRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationEndpointRequest {\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
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
