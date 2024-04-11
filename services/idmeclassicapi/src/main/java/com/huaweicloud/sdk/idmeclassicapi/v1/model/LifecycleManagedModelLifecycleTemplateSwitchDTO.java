package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LifecycleManagedModelLifecycleTemplateSwitchDTO
 */
public class LifecycleManagedModelLifecycleTemplateSwitchDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycleTemplate")

    private ObjectReferenceParamDTO lifecycleTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycleState")

    private ObjectReferenceParamDTO lifecycleState;

    public LifecycleManagedModelLifecycleTemplateSwitchDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LifecycleManagedModelLifecycleTemplateSwitchDTO withLifecycleTemplate(
        ObjectReferenceParamDTO lifecycleTemplate) {
        this.lifecycleTemplate = lifecycleTemplate;
        return this;
    }

    public LifecycleManagedModelLifecycleTemplateSwitchDTO withLifecycleTemplate(
        Consumer<ObjectReferenceParamDTO> lifecycleTemplateSetter) {
        if (this.lifecycleTemplate == null) {
            this.lifecycleTemplate = new ObjectReferenceParamDTO();
            lifecycleTemplateSetter.accept(this.lifecycleTemplate);
        }

        return this;
    }

    /**
     * Get lifecycleTemplate
     * @return lifecycleTemplate
     */
    public ObjectReferenceParamDTO getLifecycleTemplate() {
        return lifecycleTemplate;
    }

    public void setLifecycleTemplate(ObjectReferenceParamDTO lifecycleTemplate) {
        this.lifecycleTemplate = lifecycleTemplate;
    }

    public LifecycleManagedModelLifecycleTemplateSwitchDTO withLifecycleState(ObjectReferenceParamDTO lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }

    public LifecycleManagedModelLifecycleTemplateSwitchDTO withLifecycleState(
        Consumer<ObjectReferenceParamDTO> lifecycleStateSetter) {
        if (this.lifecycleState == null) {
            this.lifecycleState = new ObjectReferenceParamDTO();
            lifecycleStateSetter.accept(this.lifecycleState);
        }

        return this;
    }

    /**
     * Get lifecycleState
     * @return lifecycleState
     */
    public ObjectReferenceParamDTO getLifecycleState() {
        return lifecycleState;
    }

    public void setLifecycleState(ObjectReferenceParamDTO lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LifecycleManagedModelLifecycleTemplateSwitchDTO that = (LifecycleManagedModelLifecycleTemplateSwitchDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.lifecycleTemplate, that.lifecycleTemplate)
            && Objects.equals(this.lifecycleState, that.lifecycleState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lifecycleTemplate, lifecycleState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LifecycleManagedModelLifecycleTemplateSwitchDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lifecycleTemplate: ").append(toIndentedString(lifecycleTemplate)).append("\n");
        sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
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
