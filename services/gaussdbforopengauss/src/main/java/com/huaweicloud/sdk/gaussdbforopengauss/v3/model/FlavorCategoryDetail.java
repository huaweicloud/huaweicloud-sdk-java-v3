package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FlavorCategoryDetail
 */
public class FlavorCategoryDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_flavor_groups")

    private List<ComputeFlavorGroupDetail> computeFlavorGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_flavors")

    private List<VolumeFlavorItemDetail> volumeFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dec_service_flavors")

    private List<DecServiceFlavorItemDetail> decServiceFlavors = null;

    public FlavorCategoryDetail withComputeFlavorGroups(List<ComputeFlavorGroupDetail> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
        return this;
    }

    public FlavorCategoryDetail addComputeFlavorGroupsItem(ComputeFlavorGroupDetail computeFlavorGroupsItem) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        this.computeFlavorGroups.add(computeFlavorGroupsItem);
        return this;
    }

    public FlavorCategoryDetail withComputeFlavorGroups(
        Consumer<List<ComputeFlavorGroupDetail>> computeFlavorGroupsSetter) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        computeFlavorGroupsSetter.accept(this.computeFlavorGroups);
        return this;
    }

    /**
     * **参数解释**: 计算规格组列表。 **取值范围**: 不涉及。
     * @return computeFlavorGroups
     */
    public List<ComputeFlavorGroupDetail> getComputeFlavorGroups() {
        return computeFlavorGroups;
    }

    public void setComputeFlavorGroups(List<ComputeFlavorGroupDetail> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
    }

    public FlavorCategoryDetail withVolumeFlavors(List<VolumeFlavorItemDetail> volumeFlavors) {
        this.volumeFlavors = volumeFlavors;
        return this;
    }

    public FlavorCategoryDetail addVolumeFlavorsItem(VolumeFlavorItemDetail volumeFlavorsItem) {
        if (this.volumeFlavors == null) {
            this.volumeFlavors = new ArrayList<>();
        }
        this.volumeFlavors.add(volumeFlavorsItem);
        return this;
    }

    public FlavorCategoryDetail withVolumeFlavors(Consumer<List<VolumeFlavorItemDetail>> volumeFlavorsSetter) {
        if (this.volumeFlavors == null) {
            this.volumeFlavors = new ArrayList<>();
        }
        volumeFlavorsSetter.accept(this.volumeFlavors);
        return this;
    }

    /**
     * **参数解释**: 存储规格列表。 **取值范围**: 不涉及。
     * @return volumeFlavors
     */
    public List<VolumeFlavorItemDetail> getVolumeFlavors() {
        return volumeFlavors;
    }

    public void setVolumeFlavors(List<VolumeFlavorItemDetail> volumeFlavors) {
        this.volumeFlavors = volumeFlavors;
    }

    public FlavorCategoryDetail withDecServiceFlavors(List<DecServiceFlavorItemDetail> decServiceFlavors) {
        this.decServiceFlavors = decServiceFlavors;
        return this;
    }

    public FlavorCategoryDetail addDecServiceFlavorsItem(DecServiceFlavorItemDetail decServiceFlavorsItem) {
        if (this.decServiceFlavors == null) {
            this.decServiceFlavors = new ArrayList<>();
        }
        this.decServiceFlavors.add(decServiceFlavorsItem);
        return this;
    }

    public FlavorCategoryDetail withDecServiceFlavors(
        Consumer<List<DecServiceFlavorItemDetail>> decServiceFlavorsSetter) {
        if (this.decServiceFlavors == null) {
            this.decServiceFlavors = new ArrayList<>();
        }
        decServiceFlavorsSetter.accept(this.decServiceFlavors);
        return this;
    }

    /**
     * **参数解释**: DeC专属规格列表。 **取值范围**: 不涉及。
     * @return decServiceFlavors
     */
    public List<DecServiceFlavorItemDetail> getDecServiceFlavors() {
        return decServiceFlavors;
    }

    public void setDecServiceFlavors(List<DecServiceFlavorItemDetail> decServiceFlavors) {
        this.decServiceFlavors = decServiceFlavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorCategoryDetail that = (FlavorCategoryDetail) obj;
        return Objects.equals(this.computeFlavorGroups, that.computeFlavorGroups)
            && Objects.equals(this.volumeFlavors, that.volumeFlavors)
            && Objects.equals(this.decServiceFlavors, that.decServiceFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeFlavorGroups, volumeFlavors, decServiceFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorCategoryDetail {\n");
        sb.append("    computeFlavorGroups: ").append(toIndentedString(computeFlavorGroups)).append("\n");
        sb.append("    volumeFlavors: ").append(toIndentedString(volumeFlavors)).append("\n");
        sb.append("    decServiceFlavors: ").append(toIndentedString(decServiceFlavors)).append("\n");
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
