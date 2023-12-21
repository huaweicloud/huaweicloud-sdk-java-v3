package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateByConditionVoPersistableModelUpdateDTO
 */
public class UpdateByConditionVoPersistableModelUpdateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private QueryRequestVo condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateDTO")

    private PersistableModelUpdateDTO updateDTO;

    public UpdateByConditionVoPersistableModelUpdateDTO withCondition(QueryRequestVo condition) {
        this.condition = condition;
        return this;
    }

    public UpdateByConditionVoPersistableModelUpdateDTO withCondition(Consumer<QueryRequestVo> conditionSetter) {
        if (this.condition == null) {
            this.condition = new QueryRequestVo();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public QueryRequestVo getCondition() {
        return condition;
    }

    public void setCondition(QueryRequestVo condition) {
        this.condition = condition;
    }

    public UpdateByConditionVoPersistableModelUpdateDTO withUpdateDTO(PersistableModelUpdateDTO updateDTO) {
        this.updateDTO = updateDTO;
        return this;
    }

    public UpdateByConditionVoPersistableModelUpdateDTO withUpdateDTO(
        Consumer<PersistableModelUpdateDTO> updateDTOSetter) {
        if (this.updateDTO == null) {
            this.updateDTO = new PersistableModelUpdateDTO();
            updateDTOSetter.accept(this.updateDTO);
        }

        return this;
    }

    /**
     * Get updateDTO
     * @return updateDTO
     */
    public PersistableModelUpdateDTO getUpdateDTO() {
        return updateDTO;
    }

    public void setUpdateDTO(PersistableModelUpdateDTO updateDTO) {
        this.updateDTO = updateDTO;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateByConditionVoPersistableModelUpdateDTO that = (UpdateByConditionVoPersistableModelUpdateDTO) obj;
        return Objects.equals(this.condition, that.condition) && Objects.equals(this.updateDTO, that.updateDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, updateDTO);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateByConditionVoPersistableModelUpdateDTO {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    updateDTO: ").append(toIndentedString(updateDTO)).append("\n");
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
