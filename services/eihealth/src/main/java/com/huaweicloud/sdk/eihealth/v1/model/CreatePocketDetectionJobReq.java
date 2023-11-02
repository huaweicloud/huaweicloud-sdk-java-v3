package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建靶点口袋发现请求体
 */
public class CreatePocketDetectionJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private ReceptorDrugFile receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private ProbeDrugFile ligand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private PocketDetectionParamDto params;

    public CreatePocketDetectionJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreatePocketDetectionJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
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

    public CreatePocketDetectionJobReq withReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public CreatePocketDetectionJobReq withReceptor(Consumer<ReceptorDrugFile> receptorSetter) {
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

    public CreatePocketDetectionJobReq withLigand(ProbeDrugFile ligand) {
        this.ligand = ligand;
        return this;
    }

    public CreatePocketDetectionJobReq withLigand(Consumer<ProbeDrugFile> ligandSetter) {
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

    public CreatePocketDetectionJobReq withParams(PocketDetectionParamDto params) {
        this.params = params;
        return this;
    }

    public CreatePocketDetectionJobReq withParams(Consumer<PocketDetectionParamDto> paramsSetter) {
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
        CreatePocketDetectionJobReq that = (CreatePocketDetectionJobReq) obj;
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
        sb.append("class CreatePocketDetectionJobReq {\n");
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
