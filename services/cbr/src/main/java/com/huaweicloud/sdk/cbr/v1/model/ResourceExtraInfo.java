package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ResourceExtraInfo */
public class ResourceExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_volumes")

    private List<String> excludeVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_volumes")

    private List<ResourceExtraInfoIncludeVolumes> includeVolumes = null;

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

    /** 需要排除备份的卷id。仅在多系统盘备份特性中有效，排除不需要备份的磁盘。当虚拟机新绑定磁盘时，也能继续排除之前设置不用备份的卷。
     * 
     * @return excludeVolumes */
    public List<String> getExcludeVolumes() {
        return excludeVolumes;
    }

    public void setExcludeVolumes(List<String> excludeVolumes) {
        this.excludeVolumes = excludeVolumes;
    }

    public ResourceExtraInfo withIncludeVolumes(List<ResourceExtraInfoIncludeVolumes> includeVolumes) {
        this.includeVolumes = includeVolumes;
        return this;
    }

    public ResourceExtraInfo addIncludeVolumesItem(ResourceExtraInfoIncludeVolumes includeVolumesItem) {
        if (this.includeVolumes == null) {
            this.includeVolumes = new ArrayList<>();
        }
        this.includeVolumes.add(includeVolumesItem);
        return this;
    }

    public ResourceExtraInfo withIncludeVolumes(Consumer<List<ResourceExtraInfoIncludeVolumes>> includeVolumesSetter) {
        if (this.includeVolumes == null) {
            this.includeVolumes = new ArrayList<>();
        }
        includeVolumesSetter.accept(this.includeVolumes);
        return this;
    }

    /** 指定需要备份的卷,若有指定值，则每次备份都只备份指定的卷，如虚拟机绑定存储库之后新绑定的卷不会备份；若为空默认为资源全部卷；仅虚拟机磁盘级备份特性中有效。
     * 
     * @return includeVolumes */
    public List<ResourceExtraInfoIncludeVolumes> getIncludeVolumes() {
        return includeVolumes;
    }

    public void setIncludeVolumes(List<ResourceExtraInfoIncludeVolumes> includeVolumes) {
        this.includeVolumes = includeVolumes;
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
        return Objects.equals(this.excludeVolumes, resourceExtraInfo.excludeVolumes)
            && Objects.equals(this.includeVolumes, resourceExtraInfo.includeVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeVolumes, includeVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceExtraInfo {\n");
        sb.append("    excludeVolumes: ").append(toIndentedString(excludeVolumes)).append("\n");
        sb.append("    includeVolumes: ").append(toIndentedString(includeVolumes)).append("\n");
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
