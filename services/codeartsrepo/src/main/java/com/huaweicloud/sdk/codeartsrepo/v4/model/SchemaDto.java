package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 代码导航功模式信息
 */
public class SchemaDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_file_size")

    private Integer maximumFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_line_length")

    private Integer maximumLineLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_truncate_line")

    private Integer maximumTruncateLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rebuild_at")

    private String rebuildAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_at")

    private String lastBuildAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_times")

    private Integer buildTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_times")

    private Integer queryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outline_times")

    private Integer outlineTimes;

    public SchemaDto withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 代码导航版本。 **约束限制：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SchemaDto withMaximumFileSize(Integer maximumFileSize) {
        this.maximumFileSize = maximumFileSize;
        return this;
    }

    /**
     * **参数解释：** 支持的最大文件大小。 **约束限制：** 不涉及。
     * @return maximumFileSize
     */
    public Integer getMaximumFileSize() {
        return maximumFileSize;
    }

    public void setMaximumFileSize(Integer maximumFileSize) {
        this.maximumFileSize = maximumFileSize;
    }

    public SchemaDto withMaximumLineLength(Integer maximumLineLength) {
        this.maximumLineLength = maximumLineLength;
        return this;
    }

    /**
     * **参数解释：** 支持的最大行数。 **约束限制：** 不涉及。
     * @return maximumLineLength
     */
    public Integer getMaximumLineLength() {
        return maximumLineLength;
    }

    public void setMaximumLineLength(Integer maximumLineLength) {
        this.maximumLineLength = maximumLineLength;
    }

    public SchemaDto withMaximumTruncateLine(Integer maximumTruncateLine) {
        this.maximumTruncateLine = maximumTruncateLine;
        return this;
    }

    /**
     * **参数解释：** 每行支持的最大字符数，超过将截断。 **约束限制：** 不涉及。
     * @return maximumTruncateLine
     */
    public Integer getMaximumTruncateLine() {
        return maximumTruncateLine;
    }

    public void setMaximumTruncateLine(Integer maximumTruncateLine) {
        this.maximumTruncateLine = maximumTruncateLine;
    }

    public SchemaDto withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 索引创建时间。 **约束限制：** 不涉及。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public SchemaDto withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 索引更新时间。 **约束限制：** 不涉及。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public SchemaDto withRebuildAt(String rebuildAt) {
        this.rebuildAt = rebuildAt;
        return this;
    }

    /**
     * **参数解释：** 索引重建时间。 **约束限制：** 不涉及。
     * @return rebuildAt
     */
    public String getRebuildAt() {
        return rebuildAt;
    }

    public void setRebuildAt(String rebuildAt) {
        this.rebuildAt = rebuildAt;
    }

    public SchemaDto withLastBuildAt(String lastBuildAt) {
        this.lastBuildAt = lastBuildAt;
        return this;
    }

    /**
     * **参数解释：** 索引最近构建时间。 **约束限制：** 不涉及。
     * @return lastBuildAt
     */
    public String getLastBuildAt() {
        return lastBuildAt;
    }

    public void setLastBuildAt(String lastBuildAt) {
        this.lastBuildAt = lastBuildAt;
    }

    public SchemaDto withBuildTimes(Integer buildTimes) {
        this.buildTimes = buildTimes;
        return this;
    }

    /**
     * **参数解释：** 索引构建次数。 **约束限制：** 不涉及。
     * @return buildTimes
     */
    public Integer getBuildTimes() {
        return buildTimes;
    }

    public void setBuildTimes(Integer buildTimes) {
        this.buildTimes = buildTimes;
    }

    public SchemaDto withQueryTimes(Integer queryTimes) {
        this.queryTimes = queryTimes;
        return this;
    }

    /**
     * **参数解释：** 请求次数。 **约束限制：** 不涉及。
     * @return queryTimes
     */
    public Integer getQueryTimes() {
        return queryTimes;
    }

    public void setQueryTimes(Integer queryTimes) {
        this.queryTimes = queryTimes;
    }

    public SchemaDto withOutlineTimes(Integer outlineTimes) {
        this.outlineTimes = outlineTimes;
        return this;
    }

    /**
     * **参数解释：** 索引大纲请求次数。 **约束限制：** 不涉及。
     * @return outlineTimes
     */
    public Integer getOutlineTimes() {
        return outlineTimes;
    }

    public void setOutlineTimes(Integer outlineTimes) {
        this.outlineTimes = outlineTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchemaDto that = (SchemaDto) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.maximumFileSize, that.maximumFileSize)
            && Objects.equals(this.maximumLineLength, that.maximumLineLength)
            && Objects.equals(this.maximumTruncateLine, that.maximumTruncateLine)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.rebuildAt, that.rebuildAt) && Objects.equals(this.lastBuildAt, that.lastBuildAt)
            && Objects.equals(this.buildTimes, that.buildTimes) && Objects.equals(this.queryTimes, that.queryTimes)
            && Objects.equals(this.outlineTimes, that.outlineTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            maximumFileSize,
            maximumLineLength,
            maximumTruncateLine,
            createAt,
            updateAt,
            rebuildAt,
            lastBuildAt,
            buildTimes,
            queryTimes,
            outlineTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaDto {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    maximumFileSize: ").append(toIndentedString(maximumFileSize)).append("\n");
        sb.append("    maximumLineLength: ").append(toIndentedString(maximumLineLength)).append("\n");
        sb.append("    maximumTruncateLine: ").append(toIndentedString(maximumTruncateLine)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    rebuildAt: ").append(toIndentedString(rebuildAt)).append("\n");
        sb.append("    lastBuildAt: ").append(toIndentedString(lastBuildAt)).append("\n");
        sb.append("    buildTimes: ").append(toIndentedString(buildTimes)).append("\n");
        sb.append("    queryTimes: ").append(toIndentedString(queryTimes)).append("\n");
        sb.append("    outlineTimes: ").append(toIndentedString(outlineTimes)).append("\n");
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
