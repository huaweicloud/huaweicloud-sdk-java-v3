package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结合位点
 */
public class DockingReceptorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private ReceptorDrugFile receptor;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_hydrogen")

    private Boolean addHydrogen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docking_type")

    private String dockingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_file")

    private ReferenceLigandFile referenceFile;

    public DockingReceptorDto withReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public DockingReceptorDto withReceptor(Consumer<ReceptorDrugFile> receptorSetter) {
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

    public DockingReceptorDto withBoundingBox(BoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public DockingReceptorDto withBoundingBox(Consumer<BoundingBoxDto> boundingBoxSetter) {
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

    public DockingReceptorDto withRemoveIon(Boolean removeIon) {
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

    public DockingReceptorDto withRemoveWater(Boolean removeWater) {
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

    public DockingReceptorDto withRemoveLigand(Boolean removeLigand) {
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

    public DockingReceptorDto withAddHydrogen(Boolean addHydrogen) {
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

    public DockingReceptorDto withDockingType(String dockingType) {
        this.dockingType = dockingType;
        return this;
    }

    /**
     * **参数解释**： 对接类型。 **约束限制**： 不支持 **取值范围**： - BLIND_DOCKING：全局对接 - POCKET_DOCKING：口袋对接 **默认取值**： POCKET_DOCKING 
     * @return dockingType
     */
    public String getDockingType() {
        return dockingType;
    }

    public void setDockingType(String dockingType) {
        this.dockingType = dockingType;
    }

    public DockingReceptorDto withReferenceFile(ReferenceLigandFile referenceFile) {
        this.referenceFile = referenceFile;
        return this;
    }

    public DockingReceptorDto withReferenceFile(Consumer<ReferenceLigandFile> referenceFileSetter) {
        if (this.referenceFile == null) {
            this.referenceFile = new ReferenceLigandFile();
            referenceFileSetter.accept(this.referenceFile);
        }

        return this;
    }

    /**
     * Get referenceFile
     * @return referenceFile
     */
    public ReferenceLigandFile getReferenceFile() {
        return referenceFile;
    }

    public void setReferenceFile(ReferenceLigandFile referenceFile) {
        this.referenceFile = referenceFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DockingReceptorDto that = (DockingReceptorDto) obj;
        return Objects.equals(this.receptor, that.receptor) && Objects.equals(this.boundingBox, that.boundingBox)
            && Objects.equals(this.removeIon, that.removeIon) && Objects.equals(this.removeWater, that.removeWater)
            && Objects.equals(this.removeLigand, that.removeLigand)
            && Objects.equals(this.addHydrogen, that.addHydrogen) && Objects.equals(this.dockingType, that.dockingType)
            && Objects.equals(this.referenceFile, that.referenceFile);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(receptor, boundingBox, removeIon, removeWater, removeLigand, addHydrogen, dockingType, referenceFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DockingReceptorDto {\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
        sb.append("    removeIon: ").append(toIndentedString(removeIon)).append("\n");
        sb.append("    removeWater: ").append(toIndentedString(removeWater)).append("\n");
        sb.append("    removeLigand: ").append(toIndentedString(removeLigand)).append("\n");
        sb.append("    addHydrogen: ").append(toIndentedString(addHydrogen)).append("\n");
        sb.append("    dockingType: ").append(toIndentedString(dockingType)).append("\n");
        sb.append("    referenceFile: ").append(toIndentedString(referenceFile)).append("\n");
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
