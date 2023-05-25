package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowComponentInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_fields")

    private String expectFields;

    public ShowComponentInfoRequest withComponentId(String componentId) {
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

    public ShowComponentInfoRequest withApplicationId(String applicationId) {
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

    public ShowComponentInfoRequest withExpectFields(String expectFields) {
        this.expectFields = expectFields;
        return this;
    }

    /**
     * 特殊字段
     * @return expectFields
     */
    public String getExpectFields() {
        return expectFields;
    }

    public void setExpectFields(String expectFields) {
        this.expectFields = expectFields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowComponentInfoRequest showComponentInfoRequest = (ShowComponentInfoRequest) o;
        return Objects.equals(this.componentId, showComponentInfoRequest.componentId)
            && Objects.equals(this.applicationId, showComponentInfoRequest.applicationId)
            && Objects.equals(this.expectFields, showComponentInfoRequest.expectFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, applicationId, expectFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComponentInfoRequest {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    expectFields: ").append(toIndentedString(expectFields)).append("\n");
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
