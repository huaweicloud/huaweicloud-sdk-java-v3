package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.ResourceExtraInfoIncludeVolumes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceExtraInfo
 */
public class ResourceExtraInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exclude_volumes")
    
    private List<String> excludeVolumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_volumes")
    
    private List<ResourceExtraInfoIncludeVolumes> includeVolumes = null;
    
    public ResourceExtraInfo withExcludeVolumes(List<String> excludeVolumes) {
        this.excludeVolumes = excludeVolumes;
        return this;
    }

    
    public ResourceExtraInfo addExcludeVolumesItem(String excludeVolumesItem) {
        if(this.excludeVolumes == null) {
            this.excludeVolumes = new ArrayList<>();
        }
        this.excludeVolumes.add(excludeVolumesItem);
        return this;
    }

    public ResourceExtraInfo withExcludeVolumes(Consumer<List<String>> excludeVolumesSetter) {
        if(this.excludeVolumes == null) {
            this.excludeVolumes = new ArrayList<>();
        }
        excludeVolumesSetter.accept(this.excludeVolumes);
        return this;
    }

    /**
     * 需要排除备份的卷id。仅虚拟机磁盘级备份有效
     * @return excludeVolumes
     */
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
        if(this.includeVolumes == null) {
            this.includeVolumes = new ArrayList<>();
        }
        this.includeVolumes.add(includeVolumesItem);
        return this;
    }

    public ResourceExtraInfo withIncludeVolumes(Consumer<List<ResourceExtraInfoIncludeVolumes>> includeVolumesSetter) {
        if(this.includeVolumes == null) {
            this.includeVolumes = new ArrayList<>();
        }
        includeVolumesSetter.accept(this.includeVolumes);
        return this;
    }

    /**
     * 要备份的卷
     * @return includeVolumes
     */
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
        return Objects.equals(this.excludeVolumes, resourceExtraInfo.excludeVolumes) &&
            Objects.equals(this.includeVolumes, resourceExtraInfo.includeVolumes);
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

