package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceExtraInfo
 */
public class ResourceExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_volumes")

    @JacksonXmlProperty(localName = "exclude_volumes")

    private List<String> excludeVolumes = null;

    public ResourceExtraInfo withExcludeVolumes(List<String> excludeVolumes) {
        this.excludeVolumes = excludeVolumes;
        return this;
    }

    public ResourceExtraInfo addExcludeVolumesItem(String excludeVolumesItem) {
        if (this.excludeVolumes == null) {
            this.excludeVolumes = new ArrayList<>();
        }
        this.excludeVolumes.add(excludeVolumesItem);
        return this;
    }

    public ResourceExtraInfo withExcludeVolumes(Consumer<List<String>> excludeVolumesSetter) {
        if (this.excludeVolumes == null) {
            this.excludeVolumes = new ArrayList<>();
        }
        excludeVolumesSetter.accept(this.excludeVolumes);
        return this;
    }

    /**
     * 需要排除备份的卷id。仅在多系统盘备份特性中有效，排除不需要备份的磁盘。当虚拟机新绑定磁盘时，也能继续排除之前设置不用备份的卷。
     * @return excludeVolumes
     */
    public List<String> getExcludeVolumes() {
        return excludeVolumes;
    }

    public void setExcludeVolumes(List<String> excludeVolumes) {
        this.excludeVolumes = excludeVolumes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceExtraInfo resourceExtraInfo = (ResourceExtraInfo) o;
        return Objects.equals(this.excludeVolumes, resourceExtraInfo.excludeVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceExtraInfo {\n");
        sb.append("    excludeVolumes: ").append(toIndentedString(excludeVolumes)).append("\n");
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
