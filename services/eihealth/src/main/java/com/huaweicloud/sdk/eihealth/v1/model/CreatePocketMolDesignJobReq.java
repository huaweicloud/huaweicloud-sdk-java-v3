package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePocketMolDesignJobReq
 */
public class CreatePocketMolDesignJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private PocketMolDesignReceptorDto receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<DrugFile> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_ids")

    private List<String> modelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecular_weight")

    private List<Integer> molecularWeight = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimization_mode")

    private OptimizationMode optimizationMode;

    public CreatePocketMolDesignJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreatePocketMolDesignJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
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

    public CreatePocketMolDesignJobReq withReceptor(PocketMolDesignReceptorDto receptor) {
        this.receptor = receptor;
        return this;
    }

    public CreatePocketMolDesignJobReq withReceptor(Consumer<PocketMolDesignReceptorDto> receptorSetter) {
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

    public CreatePocketMolDesignJobReq withLigands(List<DrugFile> ligands) {
        this.ligands = ligands;
        return this;
    }

    public CreatePocketMolDesignJobReq addLigandsItem(DrugFile ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public CreatePocketMolDesignJobReq withLigands(Consumer<List<DrugFile>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 配体文件列表，最多支持1个
     * @return ligands
     */
    public List<DrugFile> getLigands() {
        return ligands;
    }

    public void setLigands(List<DrugFile> ligands) {
        this.ligands = ligands;
    }

    public CreatePocketMolDesignJobReq withModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
        return this;
    }

    public CreatePocketMolDesignJobReq addModelIdsItem(String modelIdsItem) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        this.modelIds.add(modelIdsItem);
        return this;
    }

    public CreatePocketMolDesignJobReq withModelIds(Consumer<List<String>> modelIdsSetter) {
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

    public CreatePocketMolDesignJobReq withMolecularWeight(List<Integer> molecularWeight) {
        this.molecularWeight = molecularWeight;
        return this;
    }

    public CreatePocketMolDesignJobReq addMolecularWeightItem(Integer molecularWeightItem) {
        if (this.molecularWeight == null) {
            this.molecularWeight = new ArrayList<>();
        }
        this.molecularWeight.add(molecularWeightItem);
        return this;
    }

    public CreatePocketMolDesignJobReq withMolecularWeight(Consumer<List<Integer>> molecularWeightSetter) {
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

    public CreatePocketMolDesignJobReq withOptimizationMode(OptimizationMode optimizationMode) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePocketMolDesignJobReq that = (CreatePocketMolDesignJobReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptor, that.receptor)
            && Objects.equals(this.ligands, that.ligands) && Objects.equals(this.modelIds, that.modelIds)
            && Objects.equals(this.molecularWeight, that.molecularWeight)
            && Objects.equals(this.optimizationMode, that.optimizationMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptor, ligands, modelIds, molecularWeight, optimizationMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePocketMolDesignJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
        sb.append("    molecularWeight: ").append(toIndentedString(molecularWeight)).append("\n");
        sb.append("    optimizationMode: ").append(toIndentedString(optimizationMode)).append("\n");
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
