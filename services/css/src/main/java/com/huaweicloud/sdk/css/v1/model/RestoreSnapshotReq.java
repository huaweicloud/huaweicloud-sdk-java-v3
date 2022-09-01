package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * RestoreSnapshotReq
 */
public class RestoreSnapshotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetCluster")

    @JacksonXmlProperty(localName = "targetCluster")

    private String targetCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    @JacksonXmlProperty(localName = "indices")

    private String indices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "renamePattern")

    @JacksonXmlProperty(localName = "renamePattern")

    private String renamePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "renameReplacement")

    @JacksonXmlProperty(localName = "renameReplacement")

    private String renameReplacement;

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
     * 匹配要恢复的索引规则，最大支持1024个字符。根据此处定义的过滤条件去恢复符合条件的索引，过滤条件请使用正则表达式。  0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?,特殊字符。
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
     * 索引重命名的规则。0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?,特殊字符。例如，“restored_index_$1”表示在所有恢复的索引名称前面加上“restored_”。  设置renameReplacement参数时，renamePattern和该参数必须同时设置才能生效。
     * @return renameReplacement
     */
    public String getRenameReplacement() {
        return renameReplacement;
    }

    public void setRenameReplacement(String renameReplacement) {
        this.renameReplacement = renameReplacement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreSnapshotReq restoreSnapshotReq = (RestoreSnapshotReq) o;
        return Objects.equals(this.targetCluster, restoreSnapshotReq.targetCluster)
            && Objects.equals(this.indices, restoreSnapshotReq.indices)
            && Objects.equals(this.renamePattern, restoreSnapshotReq.renamePattern)
            && Objects.equals(this.renameReplacement, restoreSnapshotReq.renameReplacement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetCluster, indices, renamePattern, renameReplacement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreSnapshotReq {\n");
        sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
        sb.append("    renamePattern: ").append(toIndentedString(renamePattern)).append("\n");
        sb.append("    renameReplacement: ").append(toIndentedString(renameReplacement)).append("\n");
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
