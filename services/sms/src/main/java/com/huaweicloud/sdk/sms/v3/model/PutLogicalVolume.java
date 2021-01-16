package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改的逻辑卷信息
 */
public class PutLogicalVolume  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="need_migration")
    
    private Boolean needMigration = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjust_size")
    
    private Long adjustSize = 0l;

    public PutLogicalVolume withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 逻辑卷id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PutLogicalVolume withNeedMigration(Boolean needMigration) {
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

    public PutLogicalVolume withAdjustSize(Long adjustSize) {
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
        PutLogicalVolume putLogicalVolume = (PutLogicalVolume) o;
        return Objects.equals(this.id, putLogicalVolume.id) &&
            Objects.equals(this.needMigration, putLogicalVolume.needMigration) &&
            Objects.equals(this.adjustSize, putLogicalVolume.adjustSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, needMigration, adjustSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutLogicalVolume {\n");
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

