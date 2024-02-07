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

    private ReceptorDrugFileReq file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_water")

    private Boolean removeWater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ion")

    private Boolean removeIon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ligand")

    private Boolean removeLigand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_hydrogen")

    private Boolean addHydrogen;

    public RunReceptorPreprocessReq withFile(ReceptorDrugFileReq file) {
        this.file = file;
        return this;
    }

    public RunReceptorPreprocessReq withFile(Consumer<ReceptorDrugFileReq> fileSetter) {
        if (this.file == null) {
            this.file = new ReceptorDrugFileReq();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ReceptorDrugFileReq getFile() {
        return file;
    }

    public void setFile(ReceptorDrugFileReq file) {
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

    public RunReceptorPreprocessReq withAddHydrogen(Boolean addHydrogen) {
        this.addHydrogen = addHydrogen;
        return this;
    }

    /**
     * 增加氢原子
     * @return addHydrogen
     */
    public Boolean getAddHydrogen() {
        return addHydrogen;
    }

    public void setAddHydrogen(Boolean addHydrogen) {
        this.addHydrogen = addHydrogen;
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
            && Objects.equals(this.removeIon, that.removeIon) && Objects.equals(this.removeLigand, that.removeLigand)
            && Objects.equals(this.addHydrogen, that.addHydrogen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, removeWater, removeIon, removeLigand, addHydrogen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunReceptorPreprocessReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    removeWater: ").append(toIndentedString(removeWater)).append("\n");
        sb.append("    removeIon: ").append(toIndentedString(removeIon)).append("\n");
        sb.append("    removeLigand: ").append(toIndentedString(removeLigand)).append("\n");
        sb.append("    addHydrogen: ").append(toIndentedString(addHydrogen)).append("\n");
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
