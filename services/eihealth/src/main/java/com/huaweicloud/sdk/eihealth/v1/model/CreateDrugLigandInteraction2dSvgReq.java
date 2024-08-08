package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成相互作用2D图请求体
 */
public class CreateDrugLigandInteraction2dSvgReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor_file")

    private ReceptorDrugFileReq receptorFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand_file")

    private DrugFile ligandFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateDrugLigandInteraction2dSvgReq withReceptorFile(ReceptorDrugFileReq receptorFile) {
        this.receptorFile = receptorFile;
        return this;
    }

    public CreateDrugLigandInteraction2dSvgReq withReceptorFile(Consumer<ReceptorDrugFileReq> receptorFileSetter) {
        if (this.receptorFile == null) {
            this.receptorFile = new ReceptorDrugFileReq();
            receptorFileSetter.accept(this.receptorFile);
        }

        return this;
    }

    /**
     * Get receptorFile
     * @return receptorFile
     */
    public ReceptorDrugFileReq getReceptorFile() {
        return receptorFile;
    }

    public void setReceptorFile(ReceptorDrugFileReq receptorFile) {
        this.receptorFile = receptorFile;
    }

    public CreateDrugLigandInteraction2dSvgReq withLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
        return this;
    }

    public CreateDrugLigandInteraction2dSvgReq withLigandFile(Consumer<DrugFile> ligandFileSetter) {
        if (this.ligandFile == null) {
            this.ligandFile = new DrugFile();
            ligandFileSetter.accept(this.ligandFile);
        }

        return this;
    }

    /**
     * Get ligandFile
     * @return ligandFile
     */
    public DrugFile getLigandFile() {
        return ligandFile;
    }

    public void setLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
    }

    public CreateDrugLigandInteraction2dSvgReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 小分子名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDrugLigandInteraction2dSvgReq that = (CreateDrugLigandInteraction2dSvgReq) obj;
        return Objects.equals(this.receptorFile, that.receptorFile) && Objects.equals(this.ligandFile, that.ligandFile)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptorFile, ligandFile, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDrugLigandInteraction2dSvgReq {\n");
        sb.append("    receptorFile: ").append(toIndentedString(receptorFile)).append("\n");
        sb.append("    ligandFile: ").append(toIndentedString(ligandFile)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
