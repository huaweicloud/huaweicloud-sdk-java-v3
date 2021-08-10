package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 逻辑卷组信息 */
public class VolumeGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private String components;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_size")

    private Long freeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_volumes")

    private List<LogicalVolumes> logicalVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    public VolumeGroups withComponents(String components) {
        this.components = components;
        return this;
    }

    /** Pv信息
     * 
     * @return components */
    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public VolumeGroups withFreeSize(Long freeSize) {
        this.freeSize = freeSize;
        return this;
    }

    /** 剩余空间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return freeSize */
    public Long getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
    }

    public VolumeGroups withLogicalVolumes(List<LogicalVolumes> logicalVolumes) {
        this.logicalVolumes = logicalVolumes;
        return this;
    }

    public VolumeGroups addLogicalVolumesItem(LogicalVolumes logicalVolumesItem) {
        if (this.logicalVolumes == null) {
            this.logicalVolumes = new ArrayList<>();
        }
        this.logicalVolumes.add(logicalVolumesItem);
        return this;
    }

    public VolumeGroups withLogicalVolumes(Consumer<List<LogicalVolumes>> logicalVolumesSetter) {
        if (this.logicalVolumes == null) {
            this.logicalVolumes = new ArrayList<>();
        }
        logicalVolumesSetter.accept(this.logicalVolumes);
        return this;
    }

    /** lv信息
     * 
     * @return logicalVolumes */
    public List<LogicalVolumes> getLogicalVolumes() {
        return logicalVolumes;
    }

    public void setLogicalVolumes(List<LogicalVolumes> logicalVolumes) {
        this.logicalVolumes = logicalVolumes;
    }

    public VolumeGroups withName(String name) {
        this.name = name;
        return this;
    }

    /** 名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VolumeGroups withSize(Long size) {
        this.size = size;
        return this;
    }

    /** 大小 minimum: 0 maximum: 9223372036854775807
     * 
     * @return size */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeGroups volumeGroups = (VolumeGroups) o;
        return Objects.equals(this.components, volumeGroups.components)
            && Objects.equals(this.freeSize, volumeGroups.freeSize)
            && Objects.equals(this.logicalVolumes, volumeGroups.logicalVolumes)
            && Objects.equals(this.name, volumeGroups.name) && Objects.equals(this.size, volumeGroups.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, freeSize, logicalVolumes, name, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeGroups {\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    freeSize: ").append(toIndentedString(freeSize)).append("\n");
        sb.append("    logicalVolumes: ").append(toIndentedString(logicalVolumes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
