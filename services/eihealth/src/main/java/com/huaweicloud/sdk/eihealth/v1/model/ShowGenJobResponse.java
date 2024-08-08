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
public class ShowGenJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles_list")

    private List<String> smilesList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecule_file")

    private DrugFile moleculeFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials")

    private Integer numTrials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_dataset_size")

    private Integer initialDatasetSize;

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
    @JsonProperty(value = "base_model")

    private BaseModel baseModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<BasicDrugModel> models = null;

    public ShowGenJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowGenJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowGenJobResponse withSmilesList(List<String> smilesList) {
        this.smilesList = smilesList;
        return this;
    }

    public ShowGenJobResponse addSmilesListItem(String smilesListItem) {
        if (this.smilesList == null) {
            this.smilesList = new ArrayList<>();
        }
        this.smilesList.add(smilesListItem);
        return this;
    }

    public ShowGenJobResponse withSmilesList(Consumer<List<String>> smilesListSetter) {
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

    public ShowGenJobResponse withMoleculeFile(DrugFile moleculeFile) {
        this.moleculeFile = moleculeFile;
        return this;
    }

    public ShowGenJobResponse withMoleculeFile(Consumer<DrugFile> moleculeFileSetter) {
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

    public ShowGenJobResponse withNumTrials(Integer numTrials) {
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

    public ShowGenJobResponse withInitialDatasetSize(Integer initialDatasetSize) {
        this.initialDatasetSize = initialDatasetSize;
        return this;
    }

    /**
     * 初始化数据集的分子数目。当为-1时，表示分子数目未知
     * minimum: -1
     * maximum: 100000
     * @return initialDatasetSize
     */
    public Integer getInitialDatasetSize() {
        return initialDatasetSize;
    }

    public void setInitialDatasetSize(Integer initialDatasetSize) {
        this.initialDatasetSize = initialDatasetSize;
    }

    public ShowGenJobResponse withBindingSites(List<BindSiteDto> bindingSites) {
        this.bindingSites = bindingSites;
        return this;
    }

    public ShowGenJobResponse addBindingSitesItem(BindSiteDto bindingSitesItem) {
        if (this.bindingSites == null) {
            this.bindingSites = new ArrayList<>();
        }
        this.bindingSites.add(bindingSitesItem);
        return this;
    }

    public ShowGenJobResponse withBindingSites(Consumer<List<BindSiteDto>> bindingSitesSetter) {
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

    public ShowGenJobResponse withWeakConstraints(List<WeakConstraintDto> weakConstraints) {
        this.weakConstraints = weakConstraints;
        return this;
    }

    public ShowGenJobResponse addWeakConstraintsItem(WeakConstraintDto weakConstraintsItem) {
        if (this.weakConstraints == null) {
            this.weakConstraints = new ArrayList<>();
        }
        this.weakConstraints.add(weakConstraintsItem);
        return this;
    }

    public ShowGenJobResponse withWeakConstraints(Consumer<List<WeakConstraintDto>> weakConstraintsSetter) {
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

    public ShowGenJobResponse withStrongConstraints(List<StrongConstraintDto> strongConstraints) {
        this.strongConstraints = strongConstraints;
        return this;
    }

    public ShowGenJobResponse addStrongConstraintsItem(StrongConstraintDto strongConstraintsItem) {
        if (this.strongConstraints == null) {
            this.strongConstraints = new ArrayList<>();
        }
        this.strongConstraints.add(strongConstraintsItem);
        return this;
    }

    public ShowGenJobResponse withStrongConstraints(Consumer<List<StrongConstraintDto>> strongConstraintsSetter) {
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

    public ShowGenJobResponse withBaseModel(BaseModel baseModel) {
        this.baseModel = baseModel;
        return this;
    }

    public ShowGenJobResponse withBaseModel(Consumer<BaseModel> baseModelSetter) {
        if (this.baseModel == null) {
            this.baseModel = new BaseModel();
            baseModelSetter.accept(this.baseModel);
        }

        return this;
    }

    /**
     * Get baseModel
     * @return baseModel
     */
    public BaseModel getBaseModel() {
        return baseModel;
    }

    public void setBaseModel(BaseModel baseModel) {
        this.baseModel = baseModel;
    }

    public ShowGenJobResponse withModels(List<BasicDrugModel> models) {
        this.models = models;
        return this;
    }

    public ShowGenJobResponse addModelsItem(BasicDrugModel modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ShowGenJobResponse withModels(Consumer<List<BasicDrugModel>> modelsSetter) {
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
        ShowGenJobResponse that = (ShowGenJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.smilesList, that.smilesList)
            && Objects.equals(this.moleculeFile, that.moleculeFile) && Objects.equals(this.numTrials, that.numTrials)
            && Objects.equals(this.initialDatasetSize, that.initialDatasetSize)
            && Objects.equals(this.bindingSites, that.bindingSites)
            && Objects.equals(this.weakConstraints, that.weakConstraints)
            && Objects.equals(this.strongConstraints, that.strongConstraints)
            && Objects.equals(this.baseModel, that.baseModel) && Objects.equals(this.models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            smilesList,
            moleculeFile,
            numTrials,
            initialDatasetSize,
            bindingSites,
            weakConstraints,
            strongConstraints,
            baseModel,
            models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGenJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    smilesList: ").append(toIndentedString(smilesList)).append("\n");
        sb.append("    moleculeFile: ").append(toIndentedString(moleculeFile)).append("\n");
        sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
        sb.append("    initialDatasetSize: ").append(toIndentedString(initialDatasetSize)).append("\n");
        sb.append("    bindingSites: ").append(toIndentedString(bindingSites)).append("\n");
        sb.append("    weakConstraints: ").append(toIndentedString(weakConstraints)).append("\n");
        sb.append("    strongConstraints: ").append(toIndentedString(strongConstraints)).append("\n");
        sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
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
