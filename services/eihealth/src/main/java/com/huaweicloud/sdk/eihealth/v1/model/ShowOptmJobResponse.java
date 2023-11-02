package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOptmJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecule_file")

    private DrugFile moleculeFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials")

    private Integer numTrials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_site")

    private BindSiteDto bindingSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_constraints")

    private List<WeakConstraintDto> weakConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strong_constraints")

    private List<StrongConstraintDto> strongConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sampler_mixin_weight")

    private Float samplerMixinWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<BasicDrugModel> models = null;

    public ShowOptmJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowOptmJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new DrugJobDto();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public DrugJobDto getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ShowOptmJobResponse withSmiles(String smiles) {
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

    public ShowOptmJobResponse withMoleculeFile(DrugFile moleculeFile) {
        this.moleculeFile = moleculeFile;
        return this;
    }

    public ShowOptmJobResponse withMoleculeFile(Consumer<DrugFile> moleculeFileSetter) {
        if (this.moleculeFile == null) {
            this.moleculeFile = new DrugFile();
            moleculeFileSetter.accept(this.moleculeFile);
        }

        return this;
    }

    /**
     * Get moleculeFile
     * @return moleculeFile
     */
    public DrugFile getMoleculeFile() {
        return moleculeFile;
    }

    public void setMoleculeFile(DrugFile moleculeFile) {
        this.moleculeFile = moleculeFile;
    }

    public ShowOptmJobResponse withNumTrials(Integer numTrials) {
        this.numTrials = numTrials;
        return this;
    }

    /**
     * 生成分子数量
     * minimum: 0
     * maximum: 5000
     * @return numTrials
     */
    public Integer getNumTrials() {
        return numTrials;
    }

    public void setNumTrials(Integer numTrials) {
        this.numTrials = numTrials;
    }

    public ShowOptmJobResponse withBindingSite(BindSiteDto bindingSite) {
        this.bindingSite = bindingSite;
        return this;
    }

    public ShowOptmJobResponse withBindingSite(Consumer<BindSiteDto> bindingSiteSetter) {
        if (this.bindingSite == null) {
            this.bindingSite = new BindSiteDto();
            bindingSiteSetter.accept(this.bindingSite);
        }

        return this;
    }

    /**
     * Get bindingSite
     * @return bindingSite
     */
    public BindSiteDto getBindingSite() {
        return bindingSite;
    }

    public void setBindingSite(BindSiteDto bindingSite) {
        this.bindingSite = bindingSite;
    }

    public ShowOptmJobResponse withWeakConstraints(List<WeakConstraintDto> weakConstraints) {
        this.weakConstraints = weakConstraints;
        return this;
    }

    public ShowOptmJobResponse addWeakConstraintsItem(WeakConstraintDto weakConstraintsItem) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        this.weakConstraints.add(weakConstraintsItem);
        return this;
    }

    public ShowOptmJobResponse withWeakConstraints(Consumer<List<WeakConstraintDto>> weakConstraintsSetter) {
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
    public List<WeakConstraintDto> getWeakConstraints() {
        return weakConstraints;
    }

    public void setWeakConstraints(List<WeakConstraintDto> weakConstraints) {
        this.weakConstraints = weakConstraints;
    }

    public ShowOptmJobResponse withStrongConstraints(List<StrongConstraintDto> strongConstraints) {
        this.strongConstraints = strongConstraints;
        return this;
    }

    public ShowOptmJobResponse addStrongConstraintsItem(StrongConstraintDto strongConstraintsItem) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        this.strongConstraints.add(strongConstraintsItem);
        return this;
    }

    public ShowOptmJobResponse withStrongConstraints(Consumer<List<StrongConstraintDto>> strongConstraintsSetter) {
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
    public List<StrongConstraintDto> getStrongConstraints() {
        return strongConstraints;
    }

    public void setStrongConstraints(List<StrongConstraintDto> strongConstraints) {
        this.strongConstraints = strongConstraints;
    }

    public ShowOptmJobResponse withSamplerMixinWeight(Float samplerMixinWeight) {
        this.samplerMixinWeight = samplerMixinWeight;
        return this;
    }

    /**
     * 初始化采样权重
     * @return samplerMixinWeight
     */
    public Float getSamplerMixinWeight() {
        return samplerMixinWeight;
    }

    public void setSamplerMixinWeight(Float samplerMixinWeight) {
        this.samplerMixinWeight = samplerMixinWeight;
    }

    public ShowOptmJobResponse withModels(List<BasicDrugModel> models) {
        this.models = models;
        return this;
    }

    public ShowOptmJobResponse addModelsItem(BasicDrugModel modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ShowOptmJobResponse withModels(Consumer<List<BasicDrugModel>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 模型列表
     * @return models
     */
    public List<BasicDrugModel> getModels() {
        return models;
    }

    public void setModels(List<BasicDrugModel> models) {
        this.models = models;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOptmJobResponse that = (ShowOptmJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.moleculeFile, that.moleculeFile) && Objects.equals(this.numTrials, that.numTrials)
            && Objects.equals(this.bindingSite, that.bindingSite)
            && Objects.equals(this.weakConstraints, that.weakConstraints)
            && Objects.equals(this.strongConstraints, that.strongConstraints)
            && Objects.equals(this.samplerMixinWeight, that.samplerMixinWeight)
            && Objects.equals(this.models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            smiles,
            moleculeFile,
            numTrials,
            bindingSite,
            weakConstraints,
            strongConstraints,
            samplerMixinWeight,
            models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOptmJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    moleculeFile: ").append(toIndentedString(moleculeFile)).append("\n");
        sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
        sb.append("    bindingSite: ").append(toIndentedString(bindingSite)).append("\n");
        sb.append("    weakConstraints: ").append(toIndentedString(weakConstraints)).append("\n");
        sb.append("    strongConstraints: ").append(toIndentedString(strongConstraints)).append("\n");
        sb.append("    samplerMixinWeight: ").append(toIndentedString(samplerMixinWeight)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
