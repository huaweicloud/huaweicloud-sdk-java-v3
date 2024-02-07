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
public class ShowPocketMolDesignJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private PocketMolDesignReceptorDto receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<PocketFragment> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_trials")

    private Integer numTrials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_list")

    private List<BasicDrugModel> modelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecular_weight")

    private List<Integer> molecularWeight = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimization_mode")

    private OptimizationMode optimizationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_result")

    private ClusterJobRsp clusterResult;

    public ShowPocketMolDesignJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowPocketMolDesignJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowPocketMolDesignJobResponse withReceptor(PocketMolDesignReceptorDto receptor) {
        this.receptor = receptor;
        return this;
    }

    public ShowPocketMolDesignJobResponse withReceptor(Consumer<PocketMolDesignReceptorDto> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new PocketMolDesignReceptorDto();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public PocketMolDesignReceptorDto getReceptor() {
        return receptor;
    }

    public void setReceptor(PocketMolDesignReceptorDto receptor) {
        this.receptor = receptor;
    }

    public ShowPocketMolDesignJobResponse withLigands(List<PocketFragment> ligands) {
        this.ligands = ligands;
        return this;
    }

    public ShowPocketMolDesignJobResponse addLigandsItem(PocketFragment ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public ShowPocketMolDesignJobResponse withLigands(Consumer<List<PocketFragment>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 配体文件列表
     * @return ligands
     */
    public List<PocketFragment> getLigands() {
        return ligands;
    }

    public void setLigands(List<PocketFragment> ligands) {
        this.ligands = ligands;
    }

    public ShowPocketMolDesignJobResponse withNumTrials(Integer numTrials) {
        this.numTrials = numTrials;
        return this;
    }

    /**
     * 生成分子数量
     * minimum: 1
     * maximum: 5000
     * @return numTrials
     */
    public Integer getNumTrials() {
        return numTrials;
    }

    public void setNumTrials(Integer numTrials) {
        this.numTrials = numTrials;
    }

    public ShowPocketMolDesignJobResponse withModelList(List<BasicDrugModel> modelList) {
        this.modelList = modelList;
        return this;
    }

    public ShowPocketMolDesignJobResponse addModelListItem(BasicDrugModel modelListItem) {
        if (this.modelList == null) {
            this.modelList = new ArrayList<>();
        }
        this.modelList.add(modelListItem);
        return this;
    }

    public ShowPocketMolDesignJobResponse withModelList(Consumer<List<BasicDrugModel>> modelListSetter) {
        if (this.modelList == null) {
            this.modelList = new ArrayList<>();
        }
        modelListSetter.accept(this.modelList);
        return this;
    }

    /**
     * 模型列表
     * @return modelList
     */
    public List<BasicDrugModel> getModelList() {
        return modelList;
    }

    public void setModelList(List<BasicDrugModel> modelList) {
        this.modelList = modelList;
    }

    public ShowPocketMolDesignJobResponse withMolecularWeight(List<Integer> molecularWeight) {
        this.molecularWeight = molecularWeight;
        return this;
    }

    public ShowPocketMolDesignJobResponse addMolecularWeightItem(Integer molecularWeightItem) {
        if (this.molecularWeight == null) {
            this.molecularWeight = new ArrayList<>();
        }
        this.molecularWeight.add(molecularWeightItem);
        return this;
    }

    public ShowPocketMolDesignJobResponse withMolecularWeight(Consumer<List<Integer>> molecularWeightSetter) {
        if (this.molecularWeight == null) {
            this.molecularWeight = new ArrayList<>();
        }
        molecularWeightSetter.accept(this.molecularWeight);
        return this;
    }

    /**
     * 分子量范围
     * @return molecularWeight
     */
    public List<Integer> getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(List<Integer> molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public ShowPocketMolDesignJobResponse withOptimizationMode(OptimizationMode optimizationMode) {
        this.optimizationMode = optimizationMode;
        return this;
    }

    /**
     * Get optimizationMode
     * @return optimizationMode
     */
    public OptimizationMode getOptimizationMode() {
        return optimizationMode;
    }

    public void setOptimizationMode(OptimizationMode optimizationMode) {
        this.optimizationMode = optimizationMode;
    }

    public ShowPocketMolDesignJobResponse withClusterResult(ClusterJobRsp clusterResult) {
        this.clusterResult = clusterResult;
        return this;
    }

    public ShowPocketMolDesignJobResponse withClusterResult(Consumer<ClusterJobRsp> clusterResultSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPocketMolDesignJobResponse that = (ShowPocketMolDesignJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptor, that.receptor)
            && Objects.equals(this.ligands, that.ligands) && Objects.equals(this.numTrials, that.numTrials)
            && Objects.equals(this.modelList, that.modelList)
            && Objects.equals(this.molecularWeight, that.molecularWeight)
            && Objects.equals(this.optimizationMode, that.optimizationMode)
            && Objects.equals(this.clusterResult, that.clusterResult);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(basicInfo, receptor, ligands, numTrials, modelList, molecularWeight, optimizationMode, clusterResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPocketMolDesignJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    numTrials: ").append(toIndentedString(numTrials)).append("\n");
        sb.append("    modelList: ").append(toIndentedString(modelList)).append("\n");
        sb.append("    molecularWeight: ").append(toIndentedString(molecularWeight)).append("\n");
        sb.append("    optimizationMode: ").append(toIndentedString(optimizationMode)).append("\n");
        sb.append("    clusterResult: ").append(toIndentedString(clusterResult)).append("\n");
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
