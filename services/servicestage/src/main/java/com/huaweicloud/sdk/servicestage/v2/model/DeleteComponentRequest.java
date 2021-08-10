package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteComponentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public DeleteComponentRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /** 应用ID。
     * 
     * @return applicationId */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public DeleteComponentRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /** 组件ID。
     * 
     * @return componentId */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public DeleteComponentRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /** 是否强制删除。
     * 
     * @return force */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteComponentRequest deleteComponentRequest = (DeleteComponentRequest) o;
        return Objects.equals(this.applicationId, deleteComponentRequest.applicationId)
            && Objects.equals(this.componentId, deleteComponentRequest.componentId)
            && Objects.equals(this.force, deleteComponentRequest.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, componentId, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteComponentRequest {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
