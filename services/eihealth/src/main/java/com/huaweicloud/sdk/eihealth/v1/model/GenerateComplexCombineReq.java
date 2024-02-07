package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 蛋白小分子拼接复合物接口的请求体
 */
public class GenerateComplexCombineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private RunReceptorPreprocessReq receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private ReceptorDrugFileReq ligand;

    public GenerateComplexCombineReq withReceptor(RunReceptorPreprocessReq receptor) {
        this.receptor = receptor;
        return this;
    }

    public GenerateComplexCombineReq withReceptor(Consumer<RunReceptorPreprocessReq> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new RunReceptorPreprocessReq();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public RunReceptorPreprocessReq getReceptor() {
        return receptor;
    }

    public void setReceptor(RunReceptorPreprocessReq receptor) {
        this.receptor = receptor;
    }

    public GenerateComplexCombineReq withLigand(ReceptorDrugFileReq ligand) {
        this.ligand = ligand;
        return this;
    }

    public GenerateComplexCombineReq withLigand(Consumer<ReceptorDrugFileReq> ligandSetter) {
        if (this.ligand == null) {
            this.ligand = new ReceptorDrugFileReq();
            ligandSetter.accept(this.ligand);
        }

        return this;
    }

    /**
     * Get ligand
     * @return ligand
     */
    public ReceptorDrugFileReq getLigand() {
        return ligand;
    }

    public void setLigand(ReceptorDrugFileReq ligand) {
        this.ligand = ligand;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateComplexCombineReq that = (GenerateComplexCombineReq) obj;
        return Objects.equals(this.receptor, that.receptor) && Objects.equals(this.ligand, that.ligand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptor, ligand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateComplexCombineReq {\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligand: ").append(toIndentedString(ligand)).append("\n");
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
