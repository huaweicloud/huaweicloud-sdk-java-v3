package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子优化任务的返回结果
 */
public class OptimizationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_rounds")

    private Integer numRounds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials_per_round")

    private Integer numTrialsPerRound;

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
    @JsonProperty(value = "original")

    private PlainMoleculeItem original;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<OptimizationResultItem> result = null;

    public OptimizationResult withName(String name) {
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

    public OptimizationResult withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public OptimizationResult withNumRounds(Integer numRounds) {
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

    public OptimizationResult withNumTrialsPerRound(Integer numTrialsPerRound) {
        this.numTrialsPerRound = numTrialsPerRound;
        return this;
    }

    /**
     * 每轮生成数量
     * @return numTrialsPerRound
     */
    public Integer getNumTrialsPerRound() {
        return numTrialsPerRound;
    }

    public void setNumTrialsPerRound(Integer numTrialsPerRound) {
        this.numTrialsPerRound = numTrialsPerRound;
    }

    public OptimizationResult withNumExpected(Integer numExpected) {
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

    public OptimizationResult withNumStrongConstraints(Integer numStrongConstraints) {
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

    public OptimizationResult withNumWeakConstraints(Integer numWeakConstraints) {
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

    public OptimizationResult withPropNames(List<String> propNames) {
        this.propNames = propNames;
        return this;
    }

    public OptimizationResult addPropNamesItem(String propNamesItem) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        this.propNames.add(propNamesItem);
        return this;
    }

    public OptimizationResult withPropNames(Consumer<List<String>> propNamesSetter) {
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

    public OptimizationResult withOriginal(PlainMoleculeItem original) {
        this.original = original;
        return this;
    }

    public OptimizationResult withOriginal(Consumer<PlainMoleculeItem> originalSetter) {
        if (this.original == null) {
            this.original = new PlainMoleculeItem();
            originalSetter.accept(this.original);
        }

        return this;
    }

    /**
     * Get original
     * @return original
     */
    public PlainMoleculeItem getOriginal() {
        return original;
    }

    public void setOriginal(PlainMoleculeItem original) {
        this.original = original;
    }

    public OptimizationResult withResult(List<OptimizationResultItem> result) {
        this.result = result;
        return this;
    }

    public OptimizationResult addResultItem(OptimizationResultItem resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public OptimizationResult withResult(Consumer<List<OptimizationResultItem>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 分子优化结果条目
     * @return result
     */
    public List<OptimizationResultItem> getResult() {
        return result;
    }

    public void setResult(List<OptimizationResultItem> result) {
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
        OptimizationResult optimizationResult = (OptimizationResult) o;
        return Objects.equals(this.name, optimizationResult.name)
            && Objects.equals(this.smiles, optimizationResult.smiles)
            && Objects.equals(this.numRounds, optimizationResult.numRounds)
            && Objects.equals(this.numTrialsPerRound, optimizationResult.numTrialsPerRound)
            && Objects.equals(this.numExpected, optimizationResult.numExpected)
            && Objects.equals(this.numStrongConstraints, optimizationResult.numStrongConstraints)
            && Objects.equals(this.numWeakConstraints, optimizationResult.numWeakConstraints)
            && Objects.equals(this.propNames, optimizationResult.propNames)
            && Objects.equals(this.original, optimizationResult.original)
            && Objects.equals(this.result, optimizationResult.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            smiles,
            numRounds,
            numTrialsPerRound,
            numExpected,
            numStrongConstraints,
            numWeakConstraints,
            propNames,
            original,
            result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptimizationResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    numRounds: ").append(toIndentedString(numRounds)).append("\n");
        sb.append("    numTrialsPerRound: ").append(toIndentedString(numTrialsPerRound)).append("\n");
        sb.append("    numExpected: ").append(toIndentedString(numExpected)).append("\n");
        sb.append("    numStrongConstraints: ").append(toIndentedString(numStrongConstraints)).append("\n");
        sb.append("    numWeakConstraints: ").append(toIndentedString(numWeakConstraints)).append("\n");
        sb.append("    propNames: ").append(toIndentedString(propNames)).append("\n");
        sb.append("    original: ").append(toIndentedString(original)).append("\n");
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
