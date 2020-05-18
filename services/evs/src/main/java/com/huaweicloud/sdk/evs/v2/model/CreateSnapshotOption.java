package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 快照信息。
 */
public class CreateSnapshotOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force")
    
    private Boolean force;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Map<String, String> metadata = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public CreateSnapshotOption withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 源云硬盘的ID。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public CreateSnapshotOption withForce(Boolean force) {
        this.force = force;
        return this;
    }

    


    /**
     * 强制创快照标示，默认为false。 当force标记为false时，云硬盘处于挂载状态时，不能强制创建快照。 当force标记为true时，即使云硬盘处于挂载状态时，仍可以创建快照。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public CreateSnapshotOption withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    

    public CreateSnapshotOption putMetadataItem(String key, String metadataItem) {
         if (this.metadata == null) {
            this.metadata = new HashMap<>();
         }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public CreateSnapshotOption withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }
    /**
     * 云硬盘快照的元数据信息。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public CreateSnapshotOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 云硬盘快照描述，最大支持255个字节。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSnapshotOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云硬盘快照名称，最大支持255个字节。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSnapshotOption createSnapshotOption = (CreateSnapshotOption) o;
        return Objects.equals(this.volumeId, createSnapshotOption.volumeId) &&
            Objects.equals(this.force, createSnapshotOption.force) &&
            Objects.equals(this.metadata, createSnapshotOption.metadata) &&
            Objects.equals(this.description, createSnapshotOption.description) &&
            Objects.equals(this.name, createSnapshotOption.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumeId, force, metadata, description, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotOption {\n");
            sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
            sb.append("    force: ").append(toIndentedString(force)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

