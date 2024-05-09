package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建分子优化请求体
 */
public class CreateOptmJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecule_file")

    private DrugFile moleculeFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_site")

    private BindSiteDto bindingSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_sites")

    private List<BindSiteDto> bindingSites = null;

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
    @JsonProperty(value = "model_ids")

    private List<String> modelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials")

    private Integer numTrials;

    public CreateOptmJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateOptmJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new CreateDrugJobBasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public CreateDrugJobBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public CreateOptmJobReq withSmiles(String smiles) {
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

    public CreateOptmJobReq withMoleculeFile(DrugFile moleculeFile) {
        this.moleculeFile = moleculeFile;
        return this;
    }

    public CreateOptmJobReq withMoleculeFile(Consumer<DrugFile> moleculeFileSetter) {
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

    public CreateOptmJobReq withBindingSite(BindSiteDto bindingSite) {
        this.bindingSite = bindingSite;
        return this;
    }

    public CreateOptmJobReq withBindingSite(Consumer<BindSiteDto> bindingSiteSetter) {
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

    public CreateOptmJobReq withBindingSites(List<BindSiteDto> bindingSites) {
        this.bindingSites = bindingSites;
        return this;
    }

    public CreateOptmJobReq addBindingSitesItem(BindSiteDto bindingSitesItem) {
        if (this.bindingSites == null) {
            this.bindingSites = new ArrayList<>();
        }
        this.bindingSites.add(bindingSitesItem);
        return this;
    }

    public CreateOptmJobReq withBindingSites(Consumer<List<BindSiteDto>> bindingSitesSetter) {
        if (this.bindingSites == null) {
            this.bindingSites = new ArrayList<>();
        }
        bindingSitesSetter.accept(this.bindingSites);
        return this;
    }

    /**
     * 受体列表和受体是二选一的关系，受体列表优先级最高
     * @return bindingSites
     */
    public List<BindSiteDto> getBindingSites() {
        return bindingSites;
    }

    public void setBindingSites(List<BindSiteDto> bindingSites) {
        this.bindingSites = bindingSites;
    }

    public CreateOptmJobReq withWeakConstraints(List<WeakConstraintDto> weakConstraints) {
        this.weakConstraints = weakConstraints;
        return this;
    }

    public CreateOptmJobReq addWeakConstraintsItem(WeakConstraintDto weakConstraintsItem) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        this.weakConstraints.add(weakConstraintsItem);
        return this;
    }

    public CreateOptmJobReq withWeakConstraints(Consumer<List<WeakConstraintDto>> weakConstraintsSetter) {
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

    public CreateOptmJobReq withStrongConstraints(List<StrongConstraintDto> strongConstraints) {
        this.strongConstraints = strongConstraints;
        return this;
    }

    public CreateOptmJobReq addStrongConstraintsItem(StrongConstraintDto strongConstraintsItem) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        this.strongConstraints.add(strongConstraintsItem);
        return this;
    }

    public CreateOptmJobReq withStrongConstraints(Consumer<List<StrongConstraintDto>> strongConstraintsSetter) {
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

    public CreateOptmJobReq withSamplerMixinWeight(Float samplerMixinWeight) {
        this.samplerMixinWeight = samplerMixinWeight;
        return this;
    }

    /**
     * 初始化采样权重，参数范围(0.5, 1)，不包含0.5和1，默认为0.6
     * minimum: 0.5
     * maximum: 1
     * @return samplerMixinWeight
     */
    public Float getSamplerMixinWeight() {
        return samplerMixinWeight;
    }

    public void setSamplerMixinWeight(Float samplerMixinWeight) {
        this.samplerMixinWeight = samplerMixinWeight;
    }

    public CreateOptmJobReq withModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
        return this;
    }

    public CreateOptmJobReq addModelIdsItem(String modelIdsItem) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        this.modelIds.add(modelIdsItem);
        return this;
    }

    public CreateOptmJobReq withModelIds(Consumer<List<String>> modelIdsSetter) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        modelIdsSetter.accept(this.modelIds);
        return this;
    }

    /**
     * 模型id列表
     * @return modelIds
     */
    public List<String> getModelIds() {
        return modelIds;
    }

    public void setModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
    }

    public CreateOptmJobReq withNumTrials(Integer numTrials) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOptmJobReq that = (CreateOptmJobReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.moleculeFile, that.moleculeFile)
            && Objects.equals(this.bindingSite, that.bindingSite)
            && Objects.equals(this.bindingSites, that.bindingSites)
            && Objects.equals(this.weakConstraints, that.weakConstraints)
            && Objects.equals(this.strongConstraints, that.strongConstraints)
            && Objects.equals(this.samplerMixinWeight, that.samplerMixinWeight)
            && Objects.equals(this.modelIds, that.modelIds) && Objects.equals(this.numTrials, that.numTrials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            smiles,
            moleculeFile,
            bindingSite,
            bindingSites,
            weakConstraints,
            strongConstraints,
            samplerMixinWeight,
            modelIds,
            numTrials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOptmJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    moleculeFile: ").append(toIndentedString(moleculeFile)).append("\n");
        sb.append("    bindingSite: ").append(toIndentedString(bindingSite)).append("\n");
        sb.append("    bindingSites: ").append(toIndentedString(bindingSites)).append("\n");
        sb.append("    weakConstraints: ").append(toIndentedString(weakConstraints)).append("\n");
        sb.append("    strongConstraints: ").append(toIndentedString(strongConstraints)).append("\n");
        sb.append("    samplerMixinWeight: ").append(toIndentedString(samplerMixinWeight)).append("\n");
        sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
        sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
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
