package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建分子生成请求体
 */
public class CreateGenJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles_list")

    private List<String> smilesList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecule_file")

    private DrugFile moleculeFile;

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
    @JsonProperty(value = "base_model_id")

    private String baseModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_ids")

    private List<String> modelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials")

    private Integer numTrials;

    public CreateGenJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateGenJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
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

    public CreateGenJobReq withSmilesList(List<String> smilesList) {
        this.smilesList = smilesList;
        return this;
    }

    public CreateGenJobReq addSmilesListItem(String smilesListItem) {
        if (this.smilesList == null) {
            this.smilesList = new ArrayList<>();
        }
        this.smilesList.add(smilesListItem);
        return this;
    }

    public CreateGenJobReq withSmilesList(Consumer<List<String>> smilesListSetter) {
        if (this.smilesList == null) {
            this.smilesList = new ArrayList<>();
        }
        smilesListSetter.accept(this.smilesList);
        return this;
    }

    /**
     * 分子表达式列表
     * @return smilesList
     */
    public List<String> getSmilesList() {
        return smilesList;
    }

    public void setSmilesList(List<String> smilesList) {
        this.smilesList = smilesList;
    }

    public CreateGenJobReq withMoleculeFile(DrugFile moleculeFile) {
        this.moleculeFile = moleculeFile;
        return this;
    }

    public CreateGenJobReq withMoleculeFile(Consumer<DrugFile> moleculeFileSetter) {
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

    public CreateGenJobReq withBindingSites(List<BindSiteDto> bindingSites) {
        this.bindingSites = bindingSites;
        return this;
    }

    public CreateGenJobReq addBindingSitesItem(BindSiteDto bindingSitesItem) {
        if (this.bindingSites == null) {
            this.bindingSites = new ArrayList<>();
        }
        this.bindingSites.add(bindingSitesItem);
        return this;
    }

    public CreateGenJobReq withBindingSites(Consumer<List<BindSiteDto>> bindingSitesSetter) {
        if (this.bindingSites == null) {
            this.bindingSites = new ArrayList<>();
        }
        bindingSitesSetter.accept(this.bindingSites);
        return this;
    }

    /**
     * 靶点列表
     * @return bindingSites
     */
    public List<BindSiteDto> getBindingSites() {
        return bindingSites;
    }

    public void setBindingSites(List<BindSiteDto> bindingSites) {
        this.bindingSites = bindingSites;
    }

    public CreateGenJobReq withWeakConstraints(List<WeakConstraintDto> weakConstraints) {
        this.weakConstraints = weakConstraints;
        return this;
    }

    public CreateGenJobReq addWeakConstraintsItem(WeakConstraintDto weakConstraintsItem) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        this.weakConstraints.add(weakConstraintsItem);
        return this;
    }

    public CreateGenJobReq withWeakConstraints(Consumer<List<WeakConstraintDto>> weakConstraintsSetter) {
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

    public CreateGenJobReq withStrongConstraints(List<StrongConstraintDto> strongConstraints) {
        this.strongConstraints = strongConstraints;
        return this;
    }

    public CreateGenJobReq addStrongConstraintsItem(StrongConstraintDto strongConstraintsItem) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        this.strongConstraints.add(strongConstraintsItem);
        return this;
    }

    public CreateGenJobReq withStrongConstraints(Consumer<List<StrongConstraintDto>> strongConstraintsSetter) {
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

    public CreateGenJobReq withBaseModelId(String baseModelId) {
        this.baseModelId = baseModelId;
        return this;
    }

    /**
     * 基模型id
     * @return baseModelId
     */
    public String getBaseModelId() {
        return baseModelId;
    }

    public void setBaseModelId(String baseModelId) {
        this.baseModelId = baseModelId;
    }

    public CreateGenJobReq withModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
        return this;
    }

    public CreateGenJobReq addModelIdsItem(String modelIdsItem) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        this.modelIds.add(modelIdsItem);
        return this;
    }

    public CreateGenJobReq withModelIds(Consumer<List<String>> modelIdsSetter) {
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

    public CreateGenJobReq withNumTrials(Integer numTrials) {
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
        CreateGenJobReq that = (CreateGenJobReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.smilesList, that.smilesList)
            && Objects.equals(this.moleculeFile, that.moleculeFile)
            && Objects.equals(this.bindingSites, that.bindingSites)
            && Objects.equals(this.weakConstraints, that.weakConstraints)
            && Objects.equals(this.strongConstraints, that.strongConstraints)
            && Objects.equals(this.baseModelId, that.baseModelId) && Objects.equals(this.modelIds, that.modelIds)
            && Objects.equals(this.numTrials, that.numTrials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            smilesList,
            moleculeFile,
            bindingSites,
            weakConstraints,
            strongConstraints,
            baseModelId,
            modelIds,
            numTrials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGenJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    smilesList: ").append(toIndentedString(smilesList)).append("\n");
        sb.append("    moleculeFile: ").append(toIndentedString(moleculeFile)).append("\n");
        sb.append("    bindingSites: ").append(toIndentedString(bindingSites)).append("\n");
        sb.append("    weakConstraints: ").append(toIndentedString(weakConstraints)).append("\n");
        sb.append("    strongConstraints: ").append(toIndentedString(strongConstraints)).append("\n");
        sb.append("    baseModelId: ").append(toIndentedString(baseModelId)).append("\n");
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
