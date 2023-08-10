package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结合位点
 */
public class BindSiteDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private DrugFile receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private BoundingBoxDto boundingBox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ion")

    private Boolean removeIon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_water")

    private Boolean removeWater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_ligand")

    private Boolean removeLigand;

    public BindSiteDto withReceptor(DrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public BindSiteDto withReceptor(Consumer<DrugFile> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new DrugFile();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public DrugFile getReceptor() {
        return receptor;
    }

    public void setReceptor(DrugFile receptor) {
        this.receptor = receptor;
    }

    public BindSiteDto withBoundingBox(BoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public BindSiteDto withBoundingBox(Consumer<BoundingBoxDto> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new BoundingBoxDto();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /**
     * Get boundingBox
     * @return boundingBox
     */
    public BoundingBoxDto getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
    }

    public BindSiteDto withRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
        return this;
    }

    /**
     * 去除受体中的离子
     * @return removeIon
     */
    public Boolean getRemoveIon() {
        return removeIon;
    }

    public void setRemoveIon(Boolean removeIon) {
        this.removeIon = removeIon;
    }

    public BindSiteDto withRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
        return this;
    }

    /**
     * 去除受体中的水分子
     * @return removeWater
     */
    public Boolean getRemoveWater() {
        return removeWater;
    }

    public void setRemoveWater(Boolean removeWater) {
        this.removeWater = removeWater;
    }

    public BindSiteDto withRemoveLigand(Boolean removeLigand) {
        this.removeLigand = removeLigand;
        return this;
    }

    /**
     * 去除受体中的配体分子
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
        BindSiteDto that = (BindSiteDto) obj;
        return Objects.equals(this.receptor, that.receptor) && Objects.equals(this.boundingBox, that.boundingBox)
            && Objects.equals(this.removeIon, that.removeIon) && Objects.equals(this.removeWater, that.removeWater)
            && Objects.equals(this.removeLigand, that.removeLigand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptor, boundingBox, removeIon, removeWater, removeLigand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindSiteDto {\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
        sb.append("    removeIon: ").append(toIndentedString(removeIon)).append("\n");
        sb.append("    removeWater: ").append(toIndentedString(removeWater)).append("\n");
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
