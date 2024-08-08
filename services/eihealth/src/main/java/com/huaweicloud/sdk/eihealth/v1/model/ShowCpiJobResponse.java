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
public class ShowCpiJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptors")

    private List<ReceptorDrugFile> receptors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<MoleculeFileDto> ligands = null;

    public ShowCpiJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowCpiJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowCpiJobResponse withReceptors(List<ReceptorDrugFile> receptors) {
        this.receptors = receptors;
        return this;
    }

    public ShowCpiJobResponse addReceptorsItem(ReceptorDrugFile receptorsItem) {
        if (this.receptors == null) {
            this.receptors = new ArrayList<>();
        }
        this.receptors.add(receptorsItem);
        return this;
    }

    public ShowCpiJobResponse withReceptors(Consumer<List<ReceptorDrugFile>> receptorsSetter) {
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
    public List<ReceptorDrugFile> getReceptors() {
        return receptors;
    }

    public void setReceptors(List<ReceptorDrugFile> receptors) {
        this.receptors = receptors;
    }

    public ShowCpiJobResponse withLigands(List<MoleculeFileDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public ShowCpiJobResponse addLigandsItem(MoleculeFileDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public ShowCpiJobResponse withLigands(Consumer<List<MoleculeFileDto>> ligandsSetter) {
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
        ShowCpiJobResponse that = (ShowCpiJobResponse) obj;
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
        sb.append("class ShowCpiJobResponse {\n");
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
