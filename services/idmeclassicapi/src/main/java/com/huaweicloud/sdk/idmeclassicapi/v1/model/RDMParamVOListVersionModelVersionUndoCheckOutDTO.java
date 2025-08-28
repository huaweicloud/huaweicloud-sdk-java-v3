package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RDMParamVOListVersionModelVersionUndoCheckOutDTO
 */
public class RDMParamVOListVersionModelVersionUndoCheckOutDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationId")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<VersionModelVersionUndoCheckOutDTO> params = null;

    public RDMParamVOListVersionModelVersionUndoCheckOutDTO withApplicationId(String applicationId) {
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

    public RDMParamVOListVersionModelVersionUndoCheckOutDTO withParams(
        List<VersionModelVersionUndoCheckOutDTO> params) {
        this.params = params;
        return this;
    }

    public RDMParamVOListVersionModelVersionUndoCheckOutDTO addParamsItem(
        VersionModelVersionUndoCheckOutDTO paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public RDMParamVOListVersionModelVersionUndoCheckOutDTO withParams(
        Consumer<List<VersionModelVersionUndoCheckOutDTO>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：**  请求参数对象。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return params
     */
    public List<VersionModelVersionUndoCheckOutDTO> getParams() {
        return params;
    }

    public void setParams(List<VersionModelVersionUndoCheckOutDTO> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDMParamVOListVersionModelVersionUndoCheckOutDTO that = (RDMParamVOListVersionModelVersionUndoCheckOutDTO) obj;
        return Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDMParamVOListVersionModelVersionUndoCheckOutDTO {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
