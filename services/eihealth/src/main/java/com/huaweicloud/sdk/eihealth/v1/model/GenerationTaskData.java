package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子生成任务的请求体
 */
public class GenerationTaskData {

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
    @JsonProperty(value = "initial_dataset")

    private List<String> initialDataset = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_site")

    private BindingSite bindingSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_props")

    private List<CustomProp> customProps = null;

    public GenerationTaskData withNumTrials(Integer numTrials) {
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

    public GenerationTaskData withStrongConstraints(List<MoleculeConstraint> strongConstraints) {
        this.strongConstraints = strongConstraints;
        return this;
    }

    public GenerationTaskData addStrongConstraintsItem(MoleculeConstraint strongConstraintsItem) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        this.strongConstraints.add(strongConstraintsItem);
        return this;
    }

    public GenerationTaskData withStrongConstraints(Consumer<List<MoleculeConstraint>> strongConstraintsSetter) {
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

    public GenerationTaskData withWeakConstraints(List<MoleculeConstraint> weakConstraints) {
        this.weakConstraints = weakConstraints;
        return this;
    }

    public GenerationTaskData addWeakConstraintsItem(MoleculeConstraint weakConstraintsItem) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        this.weakConstraints.add(weakConstraintsItem);
        return this;
    }

    public GenerationTaskData withWeakConstraints(Consumer<List<MoleculeConstraint>> weakConstraintsSetter) {
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

    public GenerationTaskData withNumExpected(Integer numExpected) {
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

    public GenerationTaskData withInitialDataset(List<String> initialDataset) {
        this.initialDataset = initialDataset;
        return this;
    }

    public GenerationTaskData addInitialDatasetItem(String initialDatasetItem) {
        if (this.initialDataset == null) {
            this.initialDataset = new ArrayList<>();
        }
        this.initialDataset.add(initialDatasetItem);
        return this;
    }

    public GenerationTaskData withInitialDataset(Consumer<List<String>> initialDatasetSetter) {
        if (this.initialDataset == null) {
            this.initialDataset = new ArrayList<>();
        }
        initialDatasetSetter.accept(this.initialDataset);
        return this;
    }

    /**
     * 初始化分子集合
     * @return initialDataset
     */
    public List<String> getInitialDataset() {
        return initialDataset;
    }

    public void setInitialDataset(List<String> initialDataset) {
        this.initialDataset = initialDataset;
    }

    public GenerationTaskData withBindingSite(BindingSite bindingSite) {
        this.bindingSite = bindingSite;
        return this;
    }

    public GenerationTaskData withBindingSite(Consumer<BindingSite> bindingSiteSetter) {
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

    public GenerationTaskData withCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
        return this;
    }

    public GenerationTaskData addCustomPropsItem(CustomProp customPropsItem) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        this.customProps.add(customPropsItem);
        return this;
    }

    public GenerationTaskData withCustomProps(Consumer<List<CustomProp>> customPropsSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerationTaskData generationTaskData = (GenerationTaskData) o;
        return Objects.equals(this.numTrials, generationTaskData.numTrials)
            && Objects.equals(this.strongConstraints, generationTaskData.strongConstraints)
            && Objects.equals(this.weakConstraints, generationTaskData.weakConstraints)
            && Objects.equals(this.numExpected, generationTaskData.numExpected)
            && Objects.equals(this.initialDataset, generationTaskData.initialDataset)
            && Objects.equals(this.bindingSite, generationTaskData.bindingSite)
            && Objects.equals(this.customProps, generationTaskData.customProps);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(numTrials, strongConstraints, weakConstraints, numExpected, initialDataset, bindingSite, customProps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerationTaskData {\n");
        sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
        sb.append("    strongConstraints: ").append(toIndentedString(strongConstraints)).append("\n");
        sb.append("    weakConstraints: ").append(toIndentedString(weakConstraints)).append("\n");
        sb.append("    numExpected: ").append(toIndentedString(numExpected)).append("\n");
        sb.append("    initialDataset: ").append(toIndentedString(initialDataset)).append("\n");
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
