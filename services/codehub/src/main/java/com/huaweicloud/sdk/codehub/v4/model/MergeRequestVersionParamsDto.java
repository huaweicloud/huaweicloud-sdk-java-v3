package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合并请求版本详情。
 */
public class MergeRequestVersionParamsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_id")

    private Integer diffId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sha")

    private String startSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    public MergeRequestVersionParamsDto withDiffId(Integer diffId) {
        this.diffId = diffId;
        return this;
    }

    /**
     * **参数解释：** 版本id(由合并请求id和sha值共同组成)。
     * @return diffId
     */
    public Integer getDiffId() {
        return diffId;
    }

    public void setDiffId(Integer diffId) {
        this.diffId = diffId;
    }

    public MergeRequestVersionParamsDto withStartSha(String startSha) {
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

    public MergeRequestVersionParamsDto withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释：** 提交记录id。
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestVersionParamsDto that = (MergeRequestVersionParamsDto) obj;
        return Objects.equals(this.diffId, that.diffId) && Objects.equals(this.startSha, that.startSha)
            && Objects.equals(this.commitId, that.commitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diffId, startSha, commitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestVersionParamsDto {\n");
        sb.append("    diffId: ").append(toIndentedString(diffId)).append("\n");
        sb.append("    startSha: ").append(toIndentedString(startSha)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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
