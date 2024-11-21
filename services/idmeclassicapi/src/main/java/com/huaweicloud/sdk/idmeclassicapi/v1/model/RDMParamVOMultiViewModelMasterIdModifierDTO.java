package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOMultiViewModelMasterIdModifierDTO
 */
public class RDMParamVOMultiViewModelMasterIdModifierDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private MultiViewModelMasterIdModifierDTO params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    public RDMParamVOMultiViewModelMasterIdModifierDTO withParams(MultiViewModelMasterIdModifierDTO params) {
        this.params = params;
        return this;
    }

    public RDMParamVOMultiViewModelMasterIdModifierDTO withParams(
        Consumer<MultiViewModelMasterIdModifierDTO> paramsSetter) {
        if (this.params == null) {
            this.params = new MultiViewModelMasterIdModifierDTO();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public MultiViewModelMasterIdModifierDTO getParams() {
        return params;
    }

    public void setParams(MultiViewModelMasterIdModifierDTO params) {
        this.params = params;
    }

    public RDMParamVOMultiViewModelMasterIdModifierDTO withApplicationId(String applicationId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOMultiViewModelMasterIdModifierDTO that = (RDMParamVOMultiViewModelMasterIdModifierDTO) obj;
        return Objects.equals(this.params, that.params) && Objects.equals(this.applicationId, that.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, applicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOMultiViewModelMasterIdModifierDTO {\n");
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
