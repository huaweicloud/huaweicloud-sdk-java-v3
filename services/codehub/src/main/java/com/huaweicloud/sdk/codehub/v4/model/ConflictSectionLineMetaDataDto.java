package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConflictSectionLineMetaDataDto
 */
public class ConflictSectionLineMetaDataDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_pos")

    private Integer oldPos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_pos")

    private Integer newPos;

    public ConflictSectionLineMetaDataDto withOldPos(Integer oldPos) {
        this.oldPos = oldPos;
        return this;
    }

    /**
     * 旧列位置
     * @return oldPos
     */
    public Integer getOldPos() {
        return oldPos;
    }

    public void setOldPos(Integer oldPos) {
        this.oldPos = oldPos;
    }

    public ConflictSectionLineMetaDataDto withNewPos(Integer newPos) {
        this.newPos = newPos;
        return this;
    }

    /**
     * 新列位置
     * @return newPos
     */
    public Integer getNewPos() {
        return newPos;
    }

    public void setNewPos(Integer newPos) {
        this.newPos = newPos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConflictSectionLineMetaDataDto that = (ConflictSectionLineMetaDataDto) obj;
        return Objects.equals(this.oldPos, that.oldPos) && Objects.equals(this.newPos, that.newPos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPos, newPos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictSectionLineMetaDataDto {\n");
        sb.append("    oldPos: ").append(toIndentedString(oldPos)).append("\n");
        sb.append("    newPos: ").append(toIndentedString(newPos)).append("\n");
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
