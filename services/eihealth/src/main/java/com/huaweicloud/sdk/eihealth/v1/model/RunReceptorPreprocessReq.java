package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 受体预处理请求体
 */
public class RunReceptorPreprocessReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ReceptorDrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_water")

    private Boolean removeWater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ion")

    private Boolean removeIon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ligand")

    private Boolean removeLigand;

    public RunReceptorPreprocessReq withFile(ReceptorDrugFile file) {
        this.file = file;
        return this;
    }

    public RunReceptorPreprocessReq withFile(Consumer<ReceptorDrugFile> fileSetter) {
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

    public RunReceptorPreprocessReq withRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
        return this;
    }

    /**
     * 去除水分子
     * @return removeWater
     */
    public Boolean getRemoveWater() {
        return removeWater;
    }

    public void setRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
    }

    public RunReceptorPreprocessReq withRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
        return this;
    }

    /**
     * 去除离子
     * @return removeIon
     */
    public Boolean getRemoveIon() {
        return removeIon;
    }

    public void setRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
    }

    public RunReceptorPreprocessReq withRemoveLigand(Boolean removeLigand) {
        this.removeLigand = removeLigand;
        return this;
    }

    /**
     * 去除配体分子
     * @return removeLigand
     */
    public Boolean getRemoveLigand() {
        return removeLigand;
    }

    public void setRemoveLigand(Boolean removeLigand) {
        this.removeLigand = removeLigand;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunReceptorPreprocessReq that = (RunReceptorPreprocessReq) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.removeWater, that.removeWater)
            && Objects.equals(this.removeIon, that.removeIon) && Objects.equals(this.removeLigand, that.removeLigand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, removeWater, removeIon, removeLigand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunReceptorPreprocessReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    removeWater: ").append(toIndentedString(removeWater)).append("\n");
        sb.append("    removeIon: ").append(toIndentedString(removeIon)).append("\n");
        sb.append("    removeLigand: ").append(toIndentedString(removeLigand)).append("\n");
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
