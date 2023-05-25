package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CompareComponentConfigurationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ComponentConfigCompare body;

    public CompareComponentConfigurationRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public CompareComponentConfigurationRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public CompareComponentConfigurationRequest withBody(ComponentConfigCompare body) {
        this.body = body;
        return this;
    }

    public CompareComponentConfigurationRequest withBody(Consumer<ComponentConfigCompare> bodySetter) {
        if (this.body == null) {
            this.body = new ComponentConfigCompare();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ComponentConfigCompare getBody() {
        return body;
    }

    public void setBody(ComponentConfigCompare body) {
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
        CompareComponentConfigurationRequest compareComponentConfigurationRequest =
            (CompareComponentConfigurationRequest) o;
        return Objects.equals(this.componentId, compareComponentConfigurationRequest.componentId)
            && Objects.equals(this.applicationId, compareComponentConfigurationRequest.applicationId)
            && Objects.equals(this.body, compareComponentConfigurationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, applicationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareComponentConfigurationRequest {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
