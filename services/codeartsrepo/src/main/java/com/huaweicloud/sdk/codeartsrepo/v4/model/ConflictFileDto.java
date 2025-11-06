package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConflictFileDto
 */
public class ConflictFileDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_path")

    private String newPath;

    public ConflictFileDto withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * 旧文件
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public ConflictFileDto withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * 新文件
     * @return newPath
     */
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConflictFileDto that = (ConflictFileDto) obj;
        return Objects.equals(this.oldPath, that.oldPath) && Objects.equals(this.newPath, that.newPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPath, newPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictFileDto {\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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
