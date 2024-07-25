package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO
 */
public class RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private LifecycleManagedModelLifecycleTemplateSwitchDTO params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    public RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO withParams(
        LifecycleManagedModelLifecycleTemplateSwitchDTO params) {
        this.params = params;
        return this;
    }

    public RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO withParams(
        Consumer<LifecycleManagedModelLifecycleTemplateSwitchDTO> paramsSetter) {
        if (this.params == null) {
            this.params = new LifecycleManagedModelLifecycleTemplateSwitchDTO();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public LifecycleManagedModelLifecycleTemplateSwitchDTO getParams() {
        return params;
    }

    public void setParams(LifecycleManagedModelLifecycleTemplateSwitchDTO params) {
        this.params = params;
    }

    public RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释**：  应用ID。  **约束限制**：  不涉及。  **取值范围**：  由英文字母和数字组成，且长度为32个字符。  **默认取值**：  不涉及。 
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO that =
            (RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO) obj;
        return Objects.equals(this.params, that.params) && Objects.equals(this.applicationId, that.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, applicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOLifecycleManagedModelLifecycleTemplateSwitchDTO {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
