package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新分区
 */
public class PutVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_migration")

    private Boolean needMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjust_size")

    private Long adjustSize;

    public PutVolume withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PutVolume withNeedMigration(Boolean needMigration) {
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

    public PutVolume withAdjustSize(Long adjustSize) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutVolume that = (PutVolume) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.needMigration, that.needMigration)
            && Objects.equals(this.adjustSize, that.adjustSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, needMigration, adjustSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutVolume {\n");
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
