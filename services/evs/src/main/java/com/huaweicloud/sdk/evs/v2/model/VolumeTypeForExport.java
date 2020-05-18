package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.VolumeTypeExtraSpecs;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云硬盘类型信息。
 */
public class VolumeTypeForExport  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_public")
    
    private Boolean isPublic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra_specs")
    
    private VolumeTypeExtraSpecs extraSpecs = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qos_specs_id")
    
    private String qosSpecsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deleted")
    
    private Boolean deleted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deleted_at")
    
    private String deletedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;

    public VolumeTypeForExport withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云硬盘类型的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeTypeForExport withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云硬盘类型名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VolumeTypeForExport withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    


    /**
     * 预留属性。
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public VolumeTypeForExport withExtraSpecs(VolumeTypeExtraSpecs extraSpecs) {
        this.extraSpecs = extraSpecs;
        return this;
    }

    public VolumeTypeForExport withExtraSpecs(Consumer<VolumeTypeExtraSpecs> extraSpecsSetter) {
        if(this.extraSpecs == null ){
            this.extraSpecs = new VolumeTypeExtraSpecs();
        }
        extraSpecsSetter.accept(this.extraSpecs);
        return this;
    }


    /**
     * Get extraSpecs
     * @return extraSpecs
     */
    public VolumeTypeExtraSpecs getExtraSpecs() {
        return extraSpecs;
    }

    public void setExtraSpecs(VolumeTypeExtraSpecs extraSpecs) {
        this.extraSpecs = extraSpecs;
    }

    public VolumeTypeForExport withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 云硬盘类型的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VolumeTypeForExport withQosSpecsId(String qosSpecsId) {
        this.qosSpecsId = qosSpecsId;
        return this;
    }

    


    /**
     * 预留属性。
     * @return qosSpecsId
     */
    public String getQosSpecsId() {
        return qosSpecsId;
    }

    public void setQosSpecsId(String qosSpecsId) {
        this.qosSpecsId = qosSpecsId;
    }

    public VolumeTypeForExport withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    


    /**
     * 云硬盘类型是否被删除标识。
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public VolumeTypeForExport withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    


    /**
     * 云硬盘类型的删除时间。
     * @return deletedAt
     */
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public VolumeTypeForExport withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 云硬盘类型的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public VolumeTypeForExport withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 云硬盘类型的更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeTypeForExport volumeTypeForExport = (VolumeTypeForExport) o;
        return Objects.equals(this.id, volumeTypeForExport.id) &&
            Objects.equals(this.name, volumeTypeForExport.name) &&
            Objects.equals(this.isPublic, volumeTypeForExport.isPublic) &&
            Objects.equals(this.extraSpecs, volumeTypeForExport.extraSpecs) &&
            Objects.equals(this.description, volumeTypeForExport.description) &&
            Objects.equals(this.qosSpecsId, volumeTypeForExport.qosSpecsId) &&
            Objects.equals(this.deleted, volumeTypeForExport.deleted) &&
            Objects.equals(this.deletedAt, volumeTypeForExport.deletedAt) &&
            Objects.equals(this.createdAt, volumeTypeForExport.createdAt) &&
            Objects.equals(this.updatedAt, volumeTypeForExport.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, isPublic, extraSpecs, description, qosSpecsId, deleted, deletedAt, createdAt, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeTypeForExport {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
            sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    qosSpecsId: ").append(toIndentedString(qosSpecsId)).append("\n");
            sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
            sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

