package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SimpleDiffDto
 */
public class SimpleDiffDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_line")

    private Integer addedLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_line")

    private Integer deletedLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public SimpleDiffDto withAddedLine(Integer addedLine) {
        this.addedLine = addedLine;
        return this;
    }

    /**
     * **参数解释：** 增加行数。 **取值范围：** 不涉及。
     * @return addedLine
     */
    public Integer getAddedLine() {
        return addedLine;
    }

    public void setAddedLine(Integer addedLine) {
        this.addedLine = addedLine;
    }

    public SimpleDiffDto withDeletedLine(Integer deletedLine) {
        this.deletedLine = deletedLine;
        return this;
    }

    /**
     * **参数解释：** 删除行数。 **取值范围：** 不涉及。
     * @return deletedLine
     */
    public Integer getDeletedLine() {
        return deletedLine;
    }

    public void setDeletedLine(Integer deletedLine) {
        this.deletedLine = deletedLine;
    }

    public SimpleDiffDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 路径。 **取值范围：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleDiffDto that = (SimpleDiffDto) obj;
        return Objects.equals(this.addedLine, that.addedLine) && Objects.equals(this.deletedLine, that.deletedLine)
            && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addedLine, deletedLine, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleDiffDto {\n");
        sb.append("    addedLine: ").append(toIndentedString(addedLine)).append("\n");
        sb.append("    deletedLine: ").append(toIndentedString(deletedLine)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
