package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结构约束参数
 */
public class StructureConstraintParamsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structs")

    private List<String> structs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive")

    private Boolean exclusive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private OperatorType operator;

    public StructureConstraintParamsDto withStructs(List<String> structs) {
        this.structs = structs;
        return this;
    }

    public StructureConstraintParamsDto addStructsItem(String structsItem) {
        if (this.structs == null) {
            this.structs = new ArrayList<>();
        }
        this.structs.add(structsItem);
        return this;
    }

    public StructureConstraintParamsDto withStructs(Consumer<List<String>> structsSetter) {
        if (this.structs == null) {
            this.structs = new ArrayList<>();
        }
        structsSetter.accept(this.structs);
        return this;
    }

    /**
     * 子结构SMILES
     * @return structs
     */
    public List<String> getStructs() {
        return structs;
    }

    public void setStructs(List<String> structs) {
        this.structs = structs;
    }

    public StructureConstraintParamsDto withExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }

    /**
     * 是否排除子结构
     * @return exclusive
     */
    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public StructureConstraintParamsDto withOperator(OperatorType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public OperatorType getOperator() {
        return operator;
    }

    public void setOperator(OperatorType operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructureConstraintParamsDto structureConstraintParamsDto = (StructureConstraintParamsDto) o;
        return Objects.equals(this.structs, structureConstraintParamsDto.structs)
            && Objects.equals(this.exclusive, structureConstraintParamsDto.exclusive)
            && Objects.equals(this.operator, structureConstraintParamsDto.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(structs, exclusive, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructureConstraintParamsDto {\n");
        sb.append("    structs: ").append(toIndentedString(structs)).append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
