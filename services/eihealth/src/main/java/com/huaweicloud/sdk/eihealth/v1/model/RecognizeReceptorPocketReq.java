package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 受体口袋识别请求体
 */
public class RecognizeReceptorPocketReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private RecognizeReceptorPocketMode mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor_file")

    private ReceptorDrugFileReq receptorFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand_file")

    private DrugFile ligandFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "residues")

    private List<String> residues = null;

    public RecognizeReceptorPocketReq withMode(RecognizeReceptorPocketMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public RecognizeReceptorPocketMode getMode() {
        return mode;
    }

    public void setMode(RecognizeReceptorPocketMode mode) {
        this.mode = mode;
    }

    public RecognizeReceptorPocketReq withReceptorFile(ReceptorDrugFileReq receptorFile) {
        this.receptorFile = receptorFile;
        return this;
    }

    public RecognizeReceptorPocketReq withReceptorFile(Consumer<ReceptorDrugFileReq> receptorFileSetter) {
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

    public RecognizeReceptorPocketReq withLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
        return this;
    }

    public RecognizeReceptorPocketReq withLigandFile(Consumer<DrugFile> ligandFileSetter) {
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

    public RecognizeReceptorPocketReq withResidues(List<String> residues) {
        this.residues = residues;
        return this;
    }

    public RecognizeReceptorPocketReq addResiduesItem(String residuesItem) {
        if (this.residues == null) {
            this.residues = new ArrayList<>();
        }
        this.residues.add(residuesItem);
        return this;
    }

    public RecognizeReceptorPocketReq withResidues(Consumer<List<String>> residuesSetter) {
        if (this.residues == null) {
            this.residues = new ArrayList<>();
        }
        residuesSetter.accept(this.residues);
        return this;
    }

    /**
     * 残基列表，当识别模式为残基时提供
     * @return residues
     */
    public List<String> getResidues() {
        return residues;
    }

    public void setResidues(List<String> residues) {
        this.residues = residues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecognizeReceptorPocketReq that = (RecognizeReceptorPocketReq) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.receptorFile, that.receptorFile)
            && Objects.equals(this.ligandFile, that.ligandFile) && Objects.equals(this.residues, that.residues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, receptorFile, ligandFile, residues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeReceptorPocketReq {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    receptorFile: ").append(toIndentedString(receptorFile)).append("\n");
        sb.append("    ligandFile: ").append(toIndentedString(ligandFile)).append("\n");
        sb.append("    residues: ").append(toIndentedString(residues)).append("\n");
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
