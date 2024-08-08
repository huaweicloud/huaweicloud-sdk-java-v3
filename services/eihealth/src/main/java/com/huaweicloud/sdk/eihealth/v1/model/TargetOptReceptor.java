package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 靶点设置
 */
public class TargetOptReceptor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ReceptorDrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balanced_charge")

    private Boolean balancedCharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "water_model")

    private String waterModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_field")

    private String forceField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ion_type")

    private String ionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ion_concentration")

    private Float ionConcentration;

    public TargetOptReceptor withFile(ReceptorDrugFile file) {
        this.file = file;
        return this;
    }

    public TargetOptReceptor withFile(Consumer<ReceptorDrugFile> fileSetter) {
        if (this.file == null) {
            this.file = new ReceptorDrugFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ReceptorDrugFile getFile() {
        return file;
    }

    public void setFile(ReceptorDrugFile file) {
        this.file = file;
    }

    public TargetOptReceptor withBalancedCharge(Boolean balancedCharge) {
        this.balancedCharge = balancedCharge;
        return this;
    }

    /**
     * 是否平衡电荷
     * @return balancedCharge
     */
    public Boolean getBalancedCharge() {
        return balancedCharge;
    }

    public void setBalancedCharge(Boolean balancedCharge) {
        this.balancedCharge = balancedCharge;
    }

    public TargetOptReceptor withWaterModel(String waterModel) {
        this.waterModel = waterModel;
        return this;
    }

    /**
     * 水模型, 支持选择spc, spce, tip3p, tip4p, tip5p
     * @return waterModel
     */
    public String getWaterModel() {
        return waterModel;
    }

    public void setWaterModel(String waterModel) {
        this.waterModel = waterModel;
    }

    public TargetOptReceptor withForceField(String forceField) {
        this.forceField = forceField;
        return this;
    }

    /**
     * 蛋白立场，支持选择amber03, amber94, amber96, amber99, amber99sb, amber99sb-ildn, amberGS, charmm27, oplsaa, gromos43a1, gromos43a2, gromos45a3, gromos53a5, gromos53a6, gromos54a7
     * @return forceField
     */
    public String getForceField() {
        return forceField;
    }

    public void setForceField(String forceField) {
        this.forceField = forceField;
    }

    public TargetOptReceptor withIonType(String ionType) {
        this.ionType = ionType;
        return this;
    }

    /**
     * 离子种类，支持选择NaCl、MgCl2、None，若设置了平衡电荷不支持选择None
     * @return ionType
     */
    public String getIonType() {
        return ionType;
    }

    public void setIonType(String ionType) {
        this.ionType = ionType;
    }

    public TargetOptReceptor withIonConcentration(Float ionConcentration) {
        this.ionConcentration = ionConcentration;
        return this;
    }

    /**
     * 离子浓度，单位mol/L，若离子种类设置为None离子浓度不支持设置
     * minimum: 0
     * maximum: 5
     * @return ionConcentration
     */
    public Float getIonConcentration() {
        return ionConcentration;
    }

    public void setIonConcentration(Float ionConcentration) {
        this.ionConcentration = ionConcentration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetOptReceptor that = (TargetOptReceptor) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.balancedCharge, that.balancedCharge)
            && Objects.equals(this.waterModel, that.waterModel) && Objects.equals(this.forceField, that.forceField)
            && Objects.equals(this.ionType, that.ionType)
            && Objects.equals(this.ionConcentration, that.ionConcentration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, balancedCharge, waterModel, forceField, ionType, ionConcentration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetOptReceptor {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    balancedCharge: ").append(toIndentedString(balancedCharge)).append("\n");
        sb.append("    waterModel: ").append(toIndentedString(waterModel)).append("\n");
        sb.append("    forceField: ").append(toIndentedString(forceField)).append("\n");
        sb.append("    ionType: ").append(toIndentedString(ionType)).append("\n");
        sb.append("    ionConcentration: ").append(toIndentedString(ionConcentration)).append("\n");
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
