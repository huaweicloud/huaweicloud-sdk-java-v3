package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    @JacksonXmlProperty(localName = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    @JacksonXmlProperty(localName = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private InstanceCreate body;

    public CreateInstanceRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public CreateInstanceRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件ID。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public CreateInstanceRequest withBody(InstanceCreate body) {
        this.body = body;
        return this;
    }

    public CreateInstanceRequest withBody(Consumer<InstanceCreate> bodySetter) {
        if (this.body == null) {
            this.body = new InstanceCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public InstanceCreate getBody() {
        return body;
    }

    public void setBody(InstanceCreate body) {
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
        CreateInstanceRequest createInstanceRequest = (CreateInstanceRequest) o;
        return Objects.equals(this.applicationId, createInstanceRequest.applicationId)
            && Objects.equals(this.componentId, createInstanceRequest.componentId)
            && Objects.equals(this.body, createInstanceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, componentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequest {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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
