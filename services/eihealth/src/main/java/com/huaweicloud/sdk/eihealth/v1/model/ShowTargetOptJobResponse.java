package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTargetOptJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private TargetOptReceptor receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private TargetOptLigand ligand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md_params")

    private MdParam mdParams;

    public ShowTargetOptJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowTargetOptJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowTargetOptJobResponse withReceptor(TargetOptReceptor receptor) {
        this.receptor = receptor;
        return this;
    }

    public ShowTargetOptJobResponse withReceptor(Consumer<TargetOptReceptor> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new TargetOptReceptor();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public TargetOptReceptor getReceptor() {
        return receptor;
    }

    public void setReceptor(TargetOptReceptor receptor) {
        this.receptor = receptor;
    }

    public ShowTargetOptJobResponse withLigand(TargetOptLigand ligand) {
        this.ligand = ligand;
        return this;
    }

    public ShowTargetOptJobResponse withLigand(Consumer<TargetOptLigand> ligandSetter) {
        if (this.ligand == null) {
            this.ligand = new TargetOptLigand();
            ligandSetter.accept(this.ligand);
        }

        return this;
    }

    /**
     * Get ligand
     * @return ligand
     */
    public TargetOptLigand getLigand() {
        return ligand;
    }

    public void setLigand(TargetOptLigand ligand) {
        this.ligand = ligand;
    }

    public ShowTargetOptJobResponse withMdParams(MdParam mdParams) {
        this.mdParams = mdParams;
        return this;
    }

    public ShowTargetOptJobResponse withMdParams(Consumer<MdParam> mdParamsSetter) {
        if (this.mdParams == null) {
            this.mdParams = new MdParam();
            mdParamsSetter.accept(this.mdParams);
        }

        return this;
    }

    /**
     * Get mdParams
     * @return mdParams
     */
    public MdParam getMdParams() {
        return mdParams;
    }

    public void setMdParams(MdParam mdParams) {
        this.mdParams = mdParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTargetOptJobResponse that = (ShowTargetOptJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptor, that.receptor)
            && Objects.equals(this.ligand, that.ligand) && Objects.equals(this.mdParams, that.mdParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptor, ligand, mdParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTargetOptJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligand: ").append(toIndentedString(ligand)).append("\n");
        sb.append("    mdParams: ").append(toIndentedString(mdParams)).append("\n");
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
