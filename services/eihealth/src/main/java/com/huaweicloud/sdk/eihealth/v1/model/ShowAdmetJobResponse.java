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
public class ShowAdmetJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecule_file")

    private MoleculeFileDto moleculeFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result")

    private JobResult jobResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_failed_reason")

    private List<FailedReasonRecord> partFailedReason = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_model")

    private BaseModel baseModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<BasicDrugModel> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_result")

    private ClusterJobRsp clusterResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_fingerprint")

    private Boolean saveFingerprint;

    public ShowAdmetJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowAdmetJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowAdmetJobResponse withMoleculeFile(MoleculeFileDto moleculeFile) {
        this.moleculeFile = moleculeFile;
        return this;
    }

    public ShowAdmetJobResponse withMoleculeFile(Consumer<MoleculeFileDto> moleculeFileSetter) {
        if (this.moleculeFile == null) {
            this.moleculeFile = new MoleculeFileDto();
            moleculeFileSetter.accept(this.moleculeFile);
        }

        return this;
    }

    /**
     * Get moleculeFile
     * @return moleculeFile
     */
    public MoleculeFileDto getMoleculeFile() {
        return moleculeFile;
    }

    public void setMoleculeFile(MoleculeFileDto moleculeFile) {
        this.moleculeFile = moleculeFile;
    }

    public ShowAdmetJobResponse withJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public ShowAdmetJobResponse withJobResult(Consumer<JobResult> jobResultSetter) {
        if (this.jobResult == null) {
            this.jobResult = new JobResult();
            jobResultSetter.accept(this.jobResult);
        }

        return this;
    }

    /**
     * Get jobResult
     * @return jobResult
     */
    public JobResult getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
    }

    public ShowAdmetJobResponse withPartFailedReason(List<FailedReasonRecord> partFailedReason) {
        this.partFailedReason = partFailedReason;
        return this;
    }

    public ShowAdmetJobResponse addPartFailedReasonItem(FailedReasonRecord partFailedReasonItem) {
        if (this.partFailedReason == null) {
            this.partFailedReason = new ArrayList<>();
        }
        this.partFailedReason.add(partFailedReasonItem);
        return this;
    }

    public ShowAdmetJobResponse withPartFailedReason(Consumer<List<FailedReasonRecord>> partFailedReasonSetter) {
        if (this.partFailedReason == null) {
            this.partFailedReason = new ArrayList<>();
        }
        partFailedReasonSetter.accept(this.partFailedReason);
        return this;
    }

    /**
     * 作业结果信息
     * @return partFailedReason
     */
    public List<FailedReasonRecord> getPartFailedReason() {
        return partFailedReason;
    }

    public void setPartFailedReason(List<FailedReasonRecord> partFailedReason) {
        this.partFailedReason = partFailedReason;
    }

    public ShowAdmetJobResponse withBaseModel(BaseModel baseModel) {
        this.baseModel = baseModel;
        return this;
    }

    public ShowAdmetJobResponse withBaseModel(Consumer<BaseModel> baseModelSetter) {
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

    public ShowAdmetJobResponse withModels(List<BasicDrugModel> models) {
        this.models = models;
        return this;
    }

    public ShowAdmetJobResponse addModelsItem(BasicDrugModel modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ShowAdmetJobResponse withModels(Consumer<List<BasicDrugModel>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 模型信息
     * @return models
     */
    public List<BasicDrugModel> getModels() {
        return models;
    }

    public void setModels(List<BasicDrugModel> models) {
        this.models = models;
    }

    public ShowAdmetJobResponse withClusterResult(ClusterJobRsp clusterResult) {
        this.clusterResult = clusterResult;
        return this;
    }

    public ShowAdmetJobResponse withClusterResult(Consumer<ClusterJobRsp> clusterResultSetter) {
        if (this.clusterResult == null) {
            this.clusterResult = new ClusterJobRsp();
            clusterResultSetter.accept(this.clusterResult);
        }

        return this;
    }

    /**
     * Get clusterResult
     * @return clusterResult
     */
    public ClusterJobRsp getClusterResult() {
        return clusterResult;
    }

    public void setClusterResult(ClusterJobRsp clusterResult) {
        this.clusterResult = clusterResult;
    }

    public ShowAdmetJobResponse withSaveFingerprint(Boolean saveFingerprint) {
        this.saveFingerprint = saveFingerprint;
        return this;
    }

    /**
     * 是否输出表征
     * @return saveFingerprint
     */
    public Boolean getSaveFingerprint() {
        return saveFingerprint;
    }

    public void setSaveFingerprint(Boolean saveFingerprint) {
        this.saveFingerprint = saveFingerprint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAdmetJobResponse that = (ShowAdmetJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.moleculeFile, that.moleculeFile)
            && Objects.equals(this.jobResult, that.jobResult)
            && Objects.equals(this.partFailedReason, that.partFailedReason)
            && Objects.equals(this.baseModel, that.baseModel) && Objects.equals(this.models, that.models)
            && Objects.equals(this.clusterResult, that.clusterResult)
            && Objects.equals(this.saveFingerprint, that.saveFingerprint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            moleculeFile,
            jobResult,
            partFailedReason,
            baseModel,
            models,
            clusterResult,
            saveFingerprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAdmetJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    moleculeFile: ").append(toIndentedString(moleculeFile)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    partFailedReason: ").append(toIndentedString(partFailedReason)).append("\n");
        sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    clusterResult: ").append(toIndentedString(clusterResult)).append("\n");
        sb.append("    saveFingerprint: ").append(toIndentedString(saveFingerprint)).append("\n");
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
