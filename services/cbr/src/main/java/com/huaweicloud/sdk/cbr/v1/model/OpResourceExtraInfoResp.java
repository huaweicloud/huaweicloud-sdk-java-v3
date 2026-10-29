package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpResourceExtraInfoResp
 */
public class OpResourceExtraInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_volumes")

    private List<String> excludeVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_volumes")

    private List<ResourceExtraInfoIncludeVolumesResp> includeVolumes = null;

    public OpResourceExtraInfoResp withExcludeVolumes(List<String> excludeVolumes) {
        this.excludeVolumes = excludeVolumes;
        return this;
    }

    public OpResourceExtraInfoResp addExcludeVolumesItem(String excludeVolumesItem) {
        if (this.excludeVolumes == null) {
            this.excludeVolumes = new ArrayList<>();
        }
        this.excludeVolumes.add(excludeVolumesItem);
        return this;
    }

    public OpResourceExtraInfoResp withExcludeVolumes(Consumer<List<String>> excludeVolumesSetter) {
        if (this.excludeVolumes == null) {
            this.excludeVolumes = new ArrayList<>();
        }
        excludeVolumesSetter.accept(this.excludeVolumes);
        return this;
    }

    /**
     * **参数解释：** 需要排除备份的卷ID列表，列表元素为String类型的UUID。 **取值范围：** 不涉及
     * @return excludeVolumes
     */
    public List<String> getExcludeVolumes() {
        return excludeVolumes;
    }

    public void setExcludeVolumes(List<String> excludeVolumes) {
        this.excludeVolumes = excludeVolumes;
    }

    public OpResourceExtraInfoResp withIncludeVolumes(List<ResourceExtraInfoIncludeVolumesResp> includeVolumes) {
        this.includeVolumes = includeVolumes;
        return this;
    }

    public OpResourceExtraInfoResp addIncludeVolumesItem(ResourceExtraInfoIncludeVolumesResp includeVolumesItem) {
        if (this.includeVolumes == null) {
            this.includeVolumes = new ArrayList<>();
        }
        this.includeVolumes.add(includeVolumesItem);
        return this;
    }

    public OpResourceExtraInfoResp withIncludeVolumes(
        Consumer<List<ResourceExtraInfoIncludeVolumesResp>> includeVolumesSetter) {
        if (this.includeVolumes == null) {
            this.includeVolumes = new ArrayList<>();
        }
        includeVolumesSetter.accept(this.includeVolumes);
        return this;
    }

    /**
     * **参数解释：** 指定需要备份的卷，如果有指定值，则每次备份都只备份指定的卷，如虚拟机绑定存储库之后新绑定的卷不会备份；如果为空默认为资源全部卷；仅虚拟机磁盘级备份特性中有效
     * @return includeVolumes
     */
    public List<ResourceExtraInfoIncludeVolumesResp> getIncludeVolumes() {
        return includeVolumes;
    }

    public void setIncludeVolumes(List<ResourceExtraInfoIncludeVolumesResp> includeVolumes) {
        this.includeVolumes = includeVolumes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpResourceExtraInfoResp that = (OpResourceExtraInfoResp) obj;
        return Objects.equals(this.excludeVolumes, that.excludeVolumes)
            && Objects.equals(this.includeVolumes, that.includeVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeVolumes, includeVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpResourceExtraInfoResp {\n");
        sb.append("    excludeVolumes: ").append(toIndentedString(excludeVolumes)).append("\n");
        sb.append("    includeVolumes: ").append(toIndentedString(includeVolumes)).append("\n");
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
