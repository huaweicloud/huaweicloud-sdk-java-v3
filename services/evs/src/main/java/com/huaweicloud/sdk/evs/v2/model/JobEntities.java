package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.SubJob;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class JobEntities  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_jobs")
    
    private List<SubJob> subJobs = null;
    
    public JobEntities withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 云硬盘的类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public JobEntities withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 云硬盘的容量，单位为GB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public JobEntities withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 云硬盘的ID。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public JobEntities withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云硬盘的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobEntities withSubJobs(List<SubJob> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    
    public JobEntities addSubJobsItem(SubJob subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public JobEntities withSubJobs(Consumer<List<SubJob>> subJobsSetter) {
        if(this.subJobs == null ){
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子Job的信息。
     * @return subJobs
     */
    public List<SubJob> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJob> subJobs) {
        this.subJobs = subJobs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobEntities jobEntities = (JobEntities) o;
        return Objects.equals(this.volumeType, jobEntities.volumeType) &&
            Objects.equals(this.size, jobEntities.size) &&
            Objects.equals(this.volumeId, jobEntities.volumeId) &&
            Objects.equals(this.name, jobEntities.name) &&
            Objects.equals(this.subJobs, jobEntities.subJobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size, volumeId, name, subJobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntities {\n");
            sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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

