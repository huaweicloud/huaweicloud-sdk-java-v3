package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检视意见位置详情。
 */
public class PositionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_sha")

    private String baseSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sha")

    private String startSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_sha")

    private String headSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_path")

    private String newPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_type")

    private String positionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_line")

    private Integer oldLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_line")

    private Integer newLine;

    public PositionDto withBaseSha(String baseSha) {
        this.baseSha = baseSha;
        return this;
    }

    /**
     * **参数解释：** 基础sha值。
     * @return baseSha
     */
    public String getBaseSha() {
        return baseSha;
    }

    public void setBaseSha(String baseSha) {
        this.baseSha = baseSha;
    }

    public PositionDto withStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }

    /**
     * **参数解释：** 起始sha值。
     * @return startSha
     */
    public String getStartSha() {
        return startSha;
    }

    public void setStartSha(String startSha) {
        this.startSha = startSha;
    }

    public PositionDto withHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * **参数解释：** 最新sha值。
     * @return headSha
     */
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public PositionDto withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * **参数解释：** 文件旧路径。
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public PositionDto withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * **参数解释：** 文件新路径。
     * @return newPath
     */
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    public PositionDto withPositionType(String positionType) {
        this.positionType = positionType;
        return this;
    }

    /**
     * **参数解释：** 文件类型。
     * @return positionType
     */
    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public PositionDto withOldLine(Integer oldLine) {
        this.oldLine = oldLine;
        return this;
    }

    /**
     * **参数解释：** 旧文件行号。
     * @return oldLine
     */
    public Integer getOldLine() {
        return oldLine;
    }

    public void setOldLine(Integer oldLine) {
        this.oldLine = oldLine;
    }

    public PositionDto withNewLine(Integer newLine) {
        this.newLine = newLine;
        return this;
    }

    /**
     * **参数解释：** 新文件行号。
     * @return newLine
     */
    public Integer getNewLine() {
        return newLine;
    }

    public void setNewLine(Integer newLine) {
        this.newLine = newLine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PositionDto that = (PositionDto) obj;
        return Objects.equals(this.baseSha, that.baseSha) && Objects.equals(this.startSha, that.startSha)
            && Objects.equals(this.headSha, that.headSha) && Objects.equals(this.oldPath, that.oldPath)
            && Objects.equals(this.newPath, that.newPath) && Objects.equals(this.positionType, that.positionType)
            && Objects.equals(this.oldLine, that.oldLine) && Objects.equals(this.newLine, that.newLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSha, startSha, headSha, oldPath, newPath, positionType, oldLine, newLine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PositionDto {\n");
        sb.append("    baseSha: ").append(toIndentedString(baseSha)).append("\n");
        sb.append("    startSha: ").append(toIndentedString(startSha)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
        sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
        sb.append("    oldLine: ").append(toIndentedString(oldLine)).append("\n");
        sb.append("    newLine: ").append(toIndentedString(newLine)).append("\n");
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
