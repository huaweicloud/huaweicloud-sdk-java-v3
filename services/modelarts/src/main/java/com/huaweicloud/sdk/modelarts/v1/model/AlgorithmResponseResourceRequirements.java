package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlgorithmResponseResourceRequirements
 */
public class AlgorithmResponseResourceRequirements {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<String> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    public AlgorithmResponseResourceRequirements withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 资源约束，可选值如下： - 资源类型（flavor_type），对应值可选择CPU、GPU[或Ascend](tag:hc,hk,fcs_super)； - 是否支持多卡训练（device_distributed_mode），对应值可选择支持（multiple）、不支持（singular）； - 是否支持分布式训练（host_distributed_mode），对应值可选择支持（multiple）、不支持（singular）。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AlgorithmResponseResourceRequirements withValue(List<String> value) {
        this.value = value;
        return this;
    }

    public AlgorithmResponseResourceRequirements addValueItem(String valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public AlgorithmResponseResourceRequirements withValue(Consumer<List<String>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 资源约束键对应值。
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public AlgorithmResponseResourceRequirements withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 键与值关系，当前只支持in。例如flavor_type in [CPU,GPU]。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmResponseResourceRequirements that = (AlgorithmResponseResourceRequirements) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseResourceRequirements {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
