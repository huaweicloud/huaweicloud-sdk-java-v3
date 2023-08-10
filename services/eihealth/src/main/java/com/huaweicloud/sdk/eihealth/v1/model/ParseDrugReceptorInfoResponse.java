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
public class ParseDrugReceptorInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "residues")

    private List<ResidueDto> residues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<ReceptorLigandInfoDto> ligands = null;

    public ParseDrugReceptorInfoResponse withResidues(List<ResidueDto> residues) {
        this.residues = residues;
        return this;
    }

    public ParseDrugReceptorInfoResponse addResiduesItem(ResidueDto residuesItem) {
        if (this.residues == null) {
            this.residues = new ArrayList<>();
        }
        this.residues.add(residuesItem);
        return this;
    }

    public ParseDrugReceptorInfoResponse withResidues(Consumer<List<ResidueDto>> residuesSetter) {
        if (this.residues == null) {
            this.residues = new ArrayList<>();
        }
        residuesSetter.accept(this.residues);
        return this;
    }

    /**
     * 受体中的氨基酸残基列表
     * @return residues
     */
    public List<ResidueDto> getResidues() {
        return residues;
    }

    public void setResidues(List<ResidueDto> residues) {
        this.residues = residues;
    }

    public ParseDrugReceptorInfoResponse withLigands(List<ReceptorLigandInfoDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public ParseDrugReceptorInfoResponse addLigandsItem(ReceptorLigandInfoDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public ParseDrugReceptorInfoResponse withLigands(Consumer<List<ReceptorLigandInfoDto>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 受体中的配体列表
     * @return ligands
     */
    public List<ReceptorLigandInfoDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<ReceptorLigandInfoDto> ligands) {
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
        ParseDrugReceptorInfoResponse that = (ParseDrugReceptorInfoResponse) obj;
        return Objects.equals(this.residues, that.residues) && Objects.equals(this.ligands, that.ligands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(residues, ligands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseDrugReceptorInfoResponse {\n");
        sb.append("    residues: ").append(toIndentedString(residues)).append("\n");
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
