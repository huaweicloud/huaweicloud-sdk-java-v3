package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建分子对接作业请求体
 */
public class CreateDockJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptors")

    private List<DockingReceptorDto> receptors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<LigandDto> ligands = null;

    public CreateDockJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateDockJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
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

    public CreateDockJobReq withReceptors(List<DockingReceptorDto> receptors) {
        this.receptors = receptors;
        return this;
    }

    public CreateDockJobReq addReceptorsItem(DockingReceptorDto receptorsItem) {
        if (this.receptors == null) {
            this.receptors = new ArrayList<>();
        }
        this.receptors.add(receptorsItem);
        return this;
    }

    public CreateDockJobReq withReceptors(Consumer<List<DockingReceptorDto>> receptorsSetter) {
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
    public List<DockingReceptorDto> getReceptors() {
        return receptors;
    }

    public void setReceptors(List<DockingReceptorDto> receptors) {
        this.receptors = receptors;
    }

    public CreateDockJobReq withLigands(List<LigandDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public CreateDockJobReq addLigandsItem(LigandDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public CreateDockJobReq withLigands(Consumer<List<LigandDto>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 配体文件列表，当前仅支持1个
     * @return ligands
     */
    public List<LigandDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<LigandDto> ligands) {
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
        CreateDockJobReq that = (CreateDockJobReq) obj;
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
        sb.append("class CreateDockJobReq {\n");
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
