package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPocketDetectionJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private ReceptorDrugFile receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private ProbeDrugFile ligand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private PocketDetectionParamDto params;

    public ShowPocketDetectionJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowPocketDetectionJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowPocketDetectionJobResponse withReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public ShowPocketDetectionJobResponse withReceptor(Consumer<ReceptorDrugFile> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new ReceptorDrugFile();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public ReceptorDrugFile getReceptor() {
        return receptor;
    }

    public void setReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
    }

    public ShowPocketDetectionJobResponse withLigand(ProbeDrugFile ligand) {
        this.ligand = ligand;
        return this;
    }

    public ShowPocketDetectionJobResponse withLigand(Consumer<ProbeDrugFile> ligandSetter) {
        if (this.ligand == null) {
            this.ligand = new ProbeDrugFile();
            ligandSetter.accept(this.ligand);
        }

        return this;
    }

    /**
     * Get ligand
     * @return ligand
     */
    public ProbeDrugFile getLigand() {
        return ligand;
    }

    public void setLigand(ProbeDrugFile ligand) {
        this.ligand = ligand;
    }

    public ShowPocketDetectionJobResponse withParams(PocketDetectionParamDto params) {
        this.params = params;
        return this;
    }

    public ShowPocketDetectionJobResponse withParams(Consumer<PocketDetectionParamDto> paramsSetter) {
        if (this.params == null) {
            this.params = new PocketDetectionParamDto();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public PocketDetectionParamDto getParams() {
        return params;
    }

    public void setParams(PocketDetectionParamDto params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPocketDetectionJobResponse that = (ShowPocketDetectionJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptor, that.receptor)
            && Objects.equals(this.ligand, that.ligand) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptor, ligand, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPocketDetectionJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligand: ").append(toIndentedString(ligand)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
