package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结合位点
 */
public class ReceptorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private ReceptorDrugFile receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private BoundBoxDto boundingBox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ion")

    private Boolean removeIon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_water")

    private Boolean removeWater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ligand")

    private Boolean removeLigand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_hydrogen")

    private Boolean addHydrogen;

    public ReceptorDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 靶点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReceptorDto withReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public ReceptorDto withReceptor(Consumer<ReceptorDrugFile> receptorSetter) {
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

    public ReceptorDto withBoundingBox(BoundBoxDto boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public ReceptorDto withBoundingBox(Consumer<BoundBoxDto> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new BoundBoxDto();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /**
     * Get boundingBox
     * @return boundingBox
     */
    public BoundBoxDto getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundBoxDto boundingBox) {
        this.boundingBox = boundingBox;
    }

    public ReceptorDto withRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
        return this;
    }

    /**
     * 去除受体中的离子。
     * @return removeIon
     */
    public Boolean getRemoveIon() {
        return removeIon;
    }

    public void setRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
    }

    public ReceptorDto withRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
        return this;
    }

    /**
     * 去除受体中的水分子。
     * @return removeWater
     */
    public Boolean getRemoveWater() {
        return removeWater;
    }

    public void setRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
    }

    public ReceptorDto withRemoveLigand(Boolean removeLigand) {
        this.removeLigand = removeLigand;
        return this;
    }

    /**
     * 去除受体中的配体分子。
     * @return removeLigand
     */
    public Boolean getRemoveLigand() {
        return removeLigand;
    }

    public void setRemoveLigand(Boolean removeLigand) {
        this.removeLigand = removeLigand;
    }

    public ReceptorDto withAddHydrogen(Boolean addHydrogen) {
        this.addHydrogen = addHydrogen;
        return this;
    }

    /**
     * 增加氢原子。
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
        ReceptorDto that = (ReceptorDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.receptor, that.receptor)
            && Objects.equals(this.boundingBox, that.boundingBox) && Objects.equals(this.removeIon, that.removeIon)
            && Objects.equals(this.removeWater, that.removeWater)
            && Objects.equals(this.removeLigand, that.removeLigand)
            && Objects.equals(this.addHydrogen, that.addHydrogen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, receptor, boundingBox, removeIon, removeWater, removeLigand, addHydrogen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReceptorDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
        sb.append("    removeIon: ").append(toIndentedString(removeIon)).append("\n");
        sb.append("    removeWater: ").append(toIndentedString(removeWater)).append("\n");
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
