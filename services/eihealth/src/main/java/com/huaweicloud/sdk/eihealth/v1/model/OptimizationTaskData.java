package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子优化任务的请求体
 */
public class OptimizationTaskData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials")

    private Integer numTrials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strong_constraints")

    private List<MoleculeConstraint> strongConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_constraints")

    private List<MoleculeConstraint> weakConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_expected")

    private Integer numExpected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_site")

    private BindingSite bindingSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_props")

    private List<CustomProp> customProps = null;

    public OptimizationTaskData withSmiles(String smiles) {
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

    public OptimizationTaskData withNumTrials(Integer numTrials) {
        this.numTrials = numTrials;
        return this;
    }

    /**
     * 生成分子数量
     * @return numTrials
     */
    public Integer getNumTrials() {
        return numTrials;
    }

    public void setNumTrials(Integer numTrials) {
        this.numTrials = numTrials;
    }

    public OptimizationTaskData withStrongConstraints(List<MoleculeConstraint> strongConstraints) {
        this.strongConstraints = strongConstraints;
        return this;
    }

    public OptimizationTaskData addStrongConstraintsItem(MoleculeConstraint strongConstraintsItem) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        this.strongConstraints.add(strongConstraintsItem);
        return this;
    }

    public OptimizationTaskData withStrongConstraints(Consumer<List<MoleculeConstraint>> strongConstraintsSetter) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        strongConstraintsSetter.accept(this.strongConstraints);
        return this;
    }

    /**
     * 强约束集合
     * @return strongConstraints
     */
    public List<MoleculeConstraint> getStrongConstraints() {
        return strongConstraints;
    }

    public void setStrongConstraints(List<MoleculeConstraint> strongConstraints) {
        this.strongConstraints = strongConstraints;
    }

    public OptimizationTaskData withWeakConstraints(List<MoleculeConstraint> weakConstraints) {
        this.weakConstraints = weakConstraints;
        return this;
    }

    public OptimizationTaskData addWeakConstraintsItem(MoleculeConstraint weakConstraintsItem) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        this.weakConstraints.add(weakConstraintsItem);
        return this;
    }

    public OptimizationTaskData withWeakConstraints(Consumer<List<MoleculeConstraint>> weakConstraintsSetter) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        weakConstraintsSetter.accept(this.weakConstraints);
        return this;
    }

    /**
     * 弱约束集合
     * @return weakConstraints
     */
    public List<MoleculeConstraint> getWeakConstraints() {
        return weakConstraints;
    }

    public void setWeakConstraints(List<MoleculeConstraint> weakConstraints) {
        this.weakConstraints = weakConstraints;
    }

    public OptimizationTaskData withNumExpected(Integer numExpected) {
        this.numExpected = numExpected;
        return this;
    }

    /**
     * 期望最大返回条目数（排序后取Top）
     * @return numExpected
     */
    public Integer getNumExpected() {
        return numExpected;
    }

    public void setNumExpected(Integer numExpected) {
        this.numExpected = numExpected;
    }

    public OptimizationTaskData withBindingSite(BindingSite bindingSite) {
        this.bindingSite = bindingSite;
        return this;
    }

    public OptimizationTaskData withBindingSite(Consumer<BindingSite> bindingSiteSetter) {
        if (this.bindingSite == null) {
            this.bindingSite = new BindingSite();
            bindingSiteSetter.accept(this.bindingSite);
        }

        return this;
    }

    /**
     * Get bindingSite
     * @return bindingSite
     */
    public BindingSite getBindingSite() {
        return bindingSite;
    }

    public void setBindingSite(BindingSite bindingSite) {
        this.bindingSite = bindingSite;
    }

    public OptimizationTaskData withCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
        return this;
    }

    public OptimizationTaskData addCustomPropsItem(CustomProp customPropsItem) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        this.customProps.add(customPropsItem);
        return this;
    }

    public OptimizationTaskData withCustomProps(Consumer<List<CustomProp>> customPropsSetter) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        customPropsSetter.accept(this.customProps);
        return this;
    }

    /**
     * 用户已开启的自定义属性集合
     * @return customProps
     */
    public List<CustomProp> getCustomProps() {
        return customProps;
    }

    public void setCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OptimizationTaskData that = (OptimizationTaskData) obj;
        return Objects.equals(this.smiles, that.smiles) && Objects.equals(this.numTrials, that.numTrials)
            && Objects.equals(this.strongConstraints, that.strongConstraints)
            && Objects.equals(this.weakConstraints, that.weakConstraints)
            && Objects.equals(this.numExpected, that.numExpected) && Objects.equals(this.bindingSite, that.bindingSite)
            && Objects.equals(this.customProps, that.customProps);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(smiles, numTrials, strongConstraints, weakConstraints, numExpected, bindingSite, customProps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptimizationTaskData {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
        sb.append("    strongConstraints: ").append(toIndentedString(strongConstraints)).append("\n");
        sb.append("    weakConstraints: ").append(toIndentedString(weakConstraints)).append("\n");
        sb.append("    numExpected: ").append(toIndentedString(numExpected)).append("\n");
        sb.append("    bindingSite: ").append(toIndentedString(bindingSite)).append("\n");
        sb.append("    customProps: ").append(toIndentedString(customProps)).append("\n");
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
