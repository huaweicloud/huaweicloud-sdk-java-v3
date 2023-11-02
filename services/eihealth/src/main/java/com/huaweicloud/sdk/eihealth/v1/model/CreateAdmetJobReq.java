package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建分子属性预测作业请求体
 */
public class CreateAdmetJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecule_file")

    private MoleculeFileDto moleculeFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_ids")

    private List<String> modelIds = null;

    public CreateAdmetJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateAdmetJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
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

    public CreateAdmetJobReq withMoleculeFile(MoleculeFileDto moleculeFile) {
        this.moleculeFile = moleculeFile;
        return this;
    }

    public CreateAdmetJobReq withMoleculeFile(Consumer<MoleculeFileDto> moleculeFileSetter) {
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

    public CreateAdmetJobReq withModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
        return this;
    }

    public CreateAdmetJobReq addModelIdsItem(String modelIdsItem) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        this.modelIds.add(modelIdsItem);
        return this;
    }

    public CreateAdmetJobReq withModelIds(Consumer<List<String>> modelIdsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAdmetJobReq that = (CreateAdmetJobReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.moleculeFile, that.moleculeFile)
            && Objects.equals(this.modelIds, that.modelIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, moleculeFile, modelIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAdmetJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    moleculeFile: ").append(toIndentedString(moleculeFile)).append("\n");
        sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
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
