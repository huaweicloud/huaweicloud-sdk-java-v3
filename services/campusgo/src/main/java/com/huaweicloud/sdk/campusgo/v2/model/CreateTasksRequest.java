package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    @JacksonXmlProperty(localName = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreateTasksRequestBody body;

    public CreateTasksRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务API,具体API名称见园区智能体提供的API参考列表中URI描述[API列表](https://support.huaweicloud.com/api-campusgo/campusgo_03_0013.html)
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public CreateTasksRequest withBody(CreateTasksRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTasksRequest withBody(Consumer<CreateTasksRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTasksRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTasksRequestBody getBody() {
        return body;
    }

    public void setBody(CreateTasksRequestBody body) {
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
        CreateTasksRequest createTasksRequest = (CreateTasksRequest) o;
        return Objects.equals(this.serviceName, createTasksRequest.serviceName)
            && Objects.equals(this.body, createTasksRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTasksRequest {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
