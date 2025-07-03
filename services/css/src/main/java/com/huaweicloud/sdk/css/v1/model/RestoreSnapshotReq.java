package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestoreSnapshotReq
 */
public class RestoreSnapshotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cluster")

    private String targetCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    private String indices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rename_pattern")

    private String renamePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rename_replacement")

    private String renameReplacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_exist_indices")

    private Boolean replaceExistIndices;

    public RestoreSnapshotReq withTargetCluster(String targetCluster) {
        this.targetCluster = targetCluster;
        return this;
    }

    /**
     * 快照要恢复到的集群的ID。
     * @return targetCluster
     */
    public String getTargetCluster() {
        return targetCluster;
    }

    public void setTargetCluster(String targetCluster) {
        this.targetCluster = targetCluster;
    }

    public RestoreSnapshotReq withIndices(String indices) {
        this.indices = indices;
        return this;
    }

    /**
     * 指定要恢复的索引名称，多个索引用逗号隔开，默认恢复所有索引。支持使用“\\*”匹配多个索引，例如：2018-06\\*，表示恢复名称前缀是2018-06的所有索引的数据。  0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?特殊字符。
     * @return indices
     */
    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    public RestoreSnapshotReq withRenamePattern(String renamePattern) {
        this.renamePattern = renamePattern;
        return this;
    }

    /**
     * 匹配要恢复的索引规则，最大支持1024个字符。根据此处定义的过滤条件去恢复符合条件的索引，过滤条件请使用正则表达式。  0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?,特殊字符。   renamePattern参数与renameReplacement参数必须同时设置才能生效。
     * @return renamePattern
     */
    public String getRenamePattern() {
        return renamePattern;
    }

    public void setRenamePattern(String renamePattern) {
        this.renamePattern = renamePattern;
    }

    public RestoreSnapshotReq withRenameReplacement(String renameReplacement) {
        this.renameReplacement = renameReplacement;
        return this;
    }

    /**
     * 索引重命名的规则。0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?,特殊字符。例如，“restored_index_$1”表示在所有恢复的索引名称前面加上“restored_”。    renamePattern参数与renameReplacement参数必须同时设置才能生效。
     * @return renameReplacement
     */
    public String getRenameReplacement() {
        return renameReplacement;
    }

    public void setRenameReplacement(String renameReplacement) {
        this.renameReplacement = renameReplacement;
    }

    public RestoreSnapshotReq withReplaceExistIndices(Boolean replaceExistIndices) {
        this.replaceExistIndices = replaceExistIndices;
        return this;
    }

    /**
     * 替换已存在的索引。    
     * @return replaceExistIndices
     */
    public Boolean getReplaceExistIndices() {
        return replaceExistIndices;
    }

    public void setReplaceExistIndices(Boolean replaceExistIndices) {
        this.replaceExistIndices = replaceExistIndices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreSnapshotReq that = (RestoreSnapshotReq) obj;
        return Objects.equals(this.targetCluster, that.targetCluster) && Objects.equals(this.indices, that.indices)
            && Objects.equals(this.renamePattern, that.renamePattern)
            && Objects.equals(this.renameReplacement, that.renameReplacement)
            && Objects.equals(this.replaceExistIndices, that.replaceExistIndices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetCluster, indices, renamePattern, renameReplacement, replaceExistIndices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreSnapshotReq {\n");
        sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
        sb.append("    renamePattern: ").append(toIndentedString(renamePattern)).append("\n");
        sb.append("    renameReplacement: ").append(toIndentedString(renameReplacement)).append("\n");
        sb.append("    replaceExistIndices: ").append(toIndentedString(replaceExistIndices)).append("\n");
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
