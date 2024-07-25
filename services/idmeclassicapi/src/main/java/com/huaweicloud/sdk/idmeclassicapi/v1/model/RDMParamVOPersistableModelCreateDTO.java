package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOPersistableModelCreateDTO
 */
public class RDMParamVOPersistableModelCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private PersistableModelCreateDTO params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    public RDMParamVOPersistableModelCreateDTO withParams(PersistableModelCreateDTO params) {
        this.params = params;
        return this;
    }

    public RDMParamVOPersistableModelCreateDTO withParams(Consumer<PersistableModelCreateDTO> paramsSetter) {
        if (this.params == null) {
            this.params = new PersistableModelCreateDTO();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public PersistableModelCreateDTO getParams() {
        return params;
    }

    public void setParams(PersistableModelCreateDTO params) {
        this.params = params;
    }

    public RDMParamVOPersistableModelCreateDTO withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：**  应用ID。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
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
        RDMParamVOPersistableModelCreateDTO that = (RDMParamVOPersistableModelCreateDTO) obj;
        return Objects.equals(this.params, that.params) && Objects.equals(this.applicationId, that.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, applicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOPersistableModelCreateDTO {\n");
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
