package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建CPI作业请求体
 */
public class CreateCpiJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptors")

    private List<CpiReceptor> receptors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<MoleculeFileDto> ligands = null;

    public CreateCpiJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateCpiJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
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

    public CreateCpiJobReq withReceptors(List<CpiReceptor> receptors) {
        this.receptors = receptors;
        return this;
    }

    public CreateCpiJobReq addReceptorsItem(CpiReceptor receptorsItem) {
        if (this.receptors == null) {
            this.receptors = new ArrayList<>();
        }
        this.receptors.add(receptorsItem);
        return this;
    }

    public CreateCpiJobReq withReceptors(Consumer<List<CpiReceptor>> receptorsSetter) {
        if (this.receptors == null) {
            this.receptors = new ArrayList<>();
        }
        receptorsSetter.accept(this.receptors);
        return this;
    }

    /**
     * 受体文件列表
     * @return receptors
     */
    public List<CpiReceptor> getReceptors() {
        return receptors;
    }

    public void setReceptors(List<CpiReceptor> receptors) {
        this.receptors = receptors;
    }

    public CreateCpiJobReq withLigands(List<MoleculeFileDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public CreateCpiJobReq addLigandsItem(MoleculeFileDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public CreateCpiJobReq withLigands(Consumer<List<MoleculeFileDto>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 小分子
     * @return ligands
     */
    public List<MoleculeFileDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<MoleculeFileDto> ligands) {
        this.ligands = ligands;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCpiJobReq that = (CreateCpiJobReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptors, that.receptors)
            && Objects.equals(this.ligands, that.ligands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptors, ligands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCpiJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptors: ").append(toIndentedString(receptors)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
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
