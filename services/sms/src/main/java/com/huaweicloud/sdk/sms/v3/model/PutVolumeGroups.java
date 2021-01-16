package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.PutLogicalVolume;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 逻辑卷组信息
 */
public class PutVolumeGroups  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logical_volumes")
    
    private List<PutLogicalVolume> logicalVolumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="need_migration")
    
    private Boolean needMigration = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjust_size")
    
    private Long adjustSize = 0l;

    public PutVolumeGroups withLogicalVolumes(List<PutLogicalVolume> logicalVolumes) {
        this.logicalVolumes = logicalVolumes;
        return this;
    }

    
    public PutVolumeGroups addLogicalVolumesItem(PutLogicalVolume logicalVolumesItem) {
        if (this.logicalVolumes == null) {
            this.logicalVolumes = new ArrayList<>();
        }
        this.logicalVolumes.add(logicalVolumesItem);
        return this;
    }

    public PutVolumeGroups withLogicalVolumes(Consumer<List<PutLogicalVolume>> logicalVolumesSetter) {
        if(this.logicalVolumes == null ){
            this.logicalVolumes = new ArrayList<>();
        }
        logicalVolumesSetter.accept(this.logicalVolumes);
        return this;
    }

    /**
     * lv信息
     * @return logicalVolumes
     */
    public List<PutLogicalVolume> getLogicalVolumes() {
        return logicalVolumes;
    }

    public void setLogicalVolumes(List<PutLogicalVolume> logicalVolumes) {
        this.logicalVolumes = logicalVolumes;
    }

    public PutVolumeGroups withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 卷组id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PutVolumeGroups withNeedMigration(Boolean needMigration) {
        this.needMigration = needMigration;
        return this;
    }

    


    /**
     * 是否迁移
     * @return needMigration
     */
    public Boolean getNeedMigration() {
        return needMigration;
    }

    public void setNeedMigration(Boolean needMigration) {
        this.needMigration = needMigration;
    }

    public PutVolumeGroups withAdjustSize(Long adjustSize) {
        this.adjustSize = adjustSize;
        return this;
    }

    


    /**
     * 调整大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return adjustSize
     */
    public Long getAdjustSize() {
        return adjustSize;
    }

    public void setAdjustSize(Long adjustSize) {
        this.adjustSize = adjustSize;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutVolumeGroups putVolumeGroups = (PutVolumeGroups) o;
        return Objects.equals(this.logicalVolumes, putVolumeGroups.logicalVolumes) &&
            Objects.equals(this.id, putVolumeGroups.id) &&
            Objects.equals(this.needMigration, putVolumeGroups.needMigration) &&
            Objects.equals(this.adjustSize, putVolumeGroups.adjustSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logicalVolumes, id, needMigration, adjustSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutVolumeGroups {\n");
        sb.append("    logicalVolumes: ").append(toIndentedString(logicalVolumes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    needMigration: ").append(toIndentedString(needMigration)).append("\n");
        sb.append("    adjustSize: ").append(toIndentedString(adjustSize)).append("\n");
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

