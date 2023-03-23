package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子生成任务的返回结果
 */
public class GenerationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_rounds")

    private Integer numRounds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_expected")

    private Integer numExpected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_strong_constraints")

    private Integer numStrongConstraints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_weak_constraints")

    private Integer numWeakConstraints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_names")

    private List<String> propNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<GenerationResultItem> result = null;

    public GenerationResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenerationResult withNumRounds(Integer numRounds) {
        this.numRounds = numRounds;
        return this;
    }

    /**
     * 总生成轮数
     * @return numRounds
     */
    public Integer getNumRounds() {
        return numRounds;
    }

    public void setNumRounds(Integer numRounds) {
        this.numRounds = numRounds;
    }

    public GenerationResult withNumExpected(Integer numExpected) {
        this.numExpected = numExpected;
        return this;
    }

    /**
     * 期望条目数
     * @return numExpected
     */
    public Integer getNumExpected() {
        return numExpected;
    }

    public void setNumExpected(Integer numExpected) {
        this.numExpected = numExpected;
    }

    public GenerationResult withNumStrongConstraints(Integer numStrongConstraints) {
        this.numStrongConstraints = numStrongConstraints;
        return this;
    }

    /**
     * 强约束数量
     * @return numStrongConstraints
     */
    public Integer getNumStrongConstraints() {
        return numStrongConstraints;
    }

    public void setNumStrongConstraints(Integer numStrongConstraints) {
        this.numStrongConstraints = numStrongConstraints;
    }

    public GenerationResult withNumWeakConstraints(Integer numWeakConstraints) {
        this.numWeakConstraints = numWeakConstraints;
        return this;
    }

    /**
     * 弱约束数量
     * @return numWeakConstraints
     */
    public Integer getNumWeakConstraints() {
        return numWeakConstraints;
    }

    public void setNumWeakConstraints(Integer numWeakConstraints) {
        this.numWeakConstraints = numWeakConstraints;
    }

    public GenerationResult withPropNames(List<String> propNames) {
        this.propNames = propNames;
        return this;
    }

    public GenerationResult addPropNamesItem(String propNamesItem) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        this.propNames.add(propNamesItem);
        return this;
    }

    public GenerationResult withPropNames(Consumer<List<String>> propNamesSetter) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        propNamesSetter.accept(this.propNames);
        return this;
    }

    /**
     * 分子ADMET属性名列表
     * @return propNames
     */
    public List<String> getPropNames() {
        return propNames;
    }

    public void setPropNames(List<String> propNames) {
        this.propNames = propNames;
    }

    public GenerationResult withResult(List<GenerationResultItem> result) {
        this.result = result;
        return this;
    }

    public GenerationResult addResultItem(GenerationResultItem resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public GenerationResult withResult(Consumer<List<GenerationResultItem>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 分子生成结果条目
     * @return result
     */
    public List<GenerationResultItem> getResult() {
        return result;
    }

    public void setResult(List<GenerationResultItem> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerationResult generationResult = (GenerationResult) o;
        return Objects.equals(this.name, generationResult.name)
            && Objects.equals(this.numRounds, generationResult.numRounds)
            && Objects.equals(this.numExpected, generationResult.numExpected)
            && Objects.equals(this.numStrongConstraints, generationResult.numStrongConstraints)
            && Objects.equals(this.numWeakConstraints, generationResult.numWeakConstraints)
            && Objects.equals(this.propNames, generationResult.propNames)
            && Objects.equals(this.result, generationResult.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numRounds, numExpected, numStrongConstraints, numWeakConstraints, propNames, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerationResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numRounds: ").append(toIndentedString(numRounds)).append("\n");
        sb.append("    numExpected: ").append(toIndentedString(numExpected)).append("\n");
        sb.append("    numStrongConstraints: ").append(toIndentedString(numStrongConstraints)).append("\n");
        sb.append("    numWeakConstraints: ").append(toIndentedString(numWeakConstraints)).append("\n");
        sb.append("    propNames: ").append(toIndentedString(propNames)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
