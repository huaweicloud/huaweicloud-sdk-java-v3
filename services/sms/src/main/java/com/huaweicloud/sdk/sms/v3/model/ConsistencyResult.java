package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 一致性校验的结果
 */
public class ConsistencyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_check")

    private String dirCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_total_files")

    private Integer numTotalFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_different_files")

    private Integer numDifferentFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_target_miss_files")

    private Integer numTargetMissFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_target_more_files")

    private Integer numTargetMoreFiles;

    public ConsistencyResult withDirCheck(String dirCheck) {
        this.dirCheck = dirCheck;
        return this;
    }

    /**
     * 校验目录
     * @return dirCheck
     */
    public String getDirCheck() {
        return dirCheck;
    }

    public void setDirCheck(String dirCheck) {
        this.dirCheck = dirCheck;
    }

    public ConsistencyResult withNumTotalFiles(Integer numTotalFiles) {
        this.numTotalFiles = numTotalFiles;
        return this;
    }

    /**
     * 文件总数
     * minimum: 0
     * maximum: 100000
     * @return numTotalFiles
     */
    public Integer getNumTotalFiles() {
        return numTotalFiles;
    }

    public void setNumTotalFiles(Integer numTotalFiles) {
        this.numTotalFiles = numTotalFiles;
    }

    public ConsistencyResult withNumDifferentFiles(Integer numDifferentFiles) {
        this.numDifferentFiles = numDifferentFiles;
        return this;
    }

    /**
     * 差异文件数量
     * minimum: 0
     * maximum: 100000
     * @return numDifferentFiles
     */
    public Integer getNumDifferentFiles() {
        return numDifferentFiles;
    }

    public void setNumDifferentFiles(Integer numDifferentFiles) {
        this.numDifferentFiles = numDifferentFiles;
    }

    public ConsistencyResult withNumTargetMissFiles(Integer numTargetMissFiles) {
        this.numTargetMissFiles = numTargetMissFiles;
        return this;
    }

    /**
     * 目的端缺少文件数量
     * minimum: 0
     * maximum: 100000
     * @return numTargetMissFiles
     */
    public Integer getNumTargetMissFiles() {
        return numTargetMissFiles;
    }

    public void setNumTargetMissFiles(Integer numTargetMissFiles) {
        this.numTargetMissFiles = numTargetMissFiles;
    }

    public ConsistencyResult withNumTargetMoreFiles(Integer numTargetMoreFiles) {
        this.numTargetMoreFiles = numTargetMoreFiles;
        return this;
    }

    /**
     * 目的端多余文件数量
     * minimum: 0
     * maximum: 100000
     * @return numTargetMoreFiles
     */
    public Integer getNumTargetMoreFiles() {
        return numTargetMoreFiles;
    }

    public void setNumTargetMoreFiles(Integer numTargetMoreFiles) {
        this.numTargetMoreFiles = numTargetMoreFiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsistencyResult that = (ConsistencyResult) obj;
        return Objects.equals(this.dirCheck, that.dirCheck) && Objects.equals(this.numTotalFiles, that.numTotalFiles)
            && Objects.equals(this.numDifferentFiles, that.numDifferentFiles)
            && Objects.equals(this.numTargetMissFiles, that.numTargetMissFiles)
            && Objects.equals(this.numTargetMoreFiles, that.numTargetMoreFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dirCheck, numTotalFiles, numDifferentFiles, numTargetMissFiles, numTargetMoreFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyResult {\n");
        sb.append("    dirCheck: ").append(toIndentedString(dirCheck)).append("\n");
        sb.append("    numTotalFiles: ").append(toIndentedString(numTotalFiles)).append("\n");
        sb.append("    numDifferentFiles: ").append(toIndentedString(numDifferentFiles)).append("\n");
        sb.append("    numTargetMissFiles: ").append(toIndentedString(numTargetMissFiles)).append("\n");
        sb.append("    numTargetMoreFiles: ").append(toIndentedString(numTargetMoreFiles)).append("\n");
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
