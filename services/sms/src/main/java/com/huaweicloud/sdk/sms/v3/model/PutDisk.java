package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 磁盘信息 */
public class PutDisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_migration")

    private Boolean needMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjust_size")

    private Long adjustSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_volumes")

    private List<PutVolume> physicalVolumes = null;

    public PutDisk withNeedMigration(Boolean needMigration) {
        this.needMigration = needMigration;
        return this;
    }

    /** 磁盘名称
     * 
     * @return needMigration */
    public Boolean getNeedMigration() {
        return needMigration;
    }

    public void setNeedMigration(Boolean needMigration) {
        this.needMigration = needMigration;
    }

    public PutDisk withId(String id) {
        this.id = id;
        return this;
    }

    /** 磁盘id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PutDisk withAdjustSize(Long adjustSize) {
        this.adjustSize = adjustSize;
        return this;
    }

    /** 调整大小 minimum: 0 maximum: 9223372036854775807
     * 
     * @return adjustSize */
    public Long getAdjustSize() {
        return adjustSize;
    }

    public void setAdjustSize(Long adjustSize) {
        this.adjustSize = adjustSize;
    }

    public PutDisk withPhysicalVolumes(List<PutVolume> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
        return this;
    }

    public PutDisk addPhysicalVolumesItem(PutVolume physicalVolumesItem) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        this.physicalVolumes.add(physicalVolumesItem);
        return this;
    }

    public PutDisk withPhysicalVolumes(Consumer<List<PutVolume>> physicalVolumesSetter) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        physicalVolumesSetter.accept(this.physicalVolumes);
        return this;
    }

    /** 修改的卷信息
     * 
     * @return physicalVolumes */
    public List<PutVolume> getPhysicalVolumes() {
        return physicalVolumes;
    }

    public void setPhysicalVolumes(List<PutVolume> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutDisk putDisk = (PutDisk) o;
        return Objects.equals(this.needMigration, putDisk.needMigration) && Objects.equals(this.id, putDisk.id)
            && Objects.equals(this.adjustSize, putDisk.adjustSize)
            && Objects.equals(this.physicalVolumes, putDisk.physicalVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(needMigration, id, adjustSize, physicalVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutDisk {\n");
        sb.append("    needMigration: ").append(toIndentedString(needMigration)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    adjustSize: ").append(toIndentedString(adjustSize)).append("\n");
        sb.append("    physicalVolumes: ").append(toIndentedString(physicalVolumes)).append("\n");
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
