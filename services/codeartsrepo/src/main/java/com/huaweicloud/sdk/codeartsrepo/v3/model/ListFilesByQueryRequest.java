package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFilesByQueryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    public ListFilesByQueryRequest withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库短id
     * @return repoId
     */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public ListFilesByQueryRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件的完整路径。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ListFilesByQueryRequest withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * commit id，仓库的branch名或tag名
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFilesByQueryRequest that = (ListFilesByQueryRequest) obj;
        return Objects.equals(this.repoId, that.repoId) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.ref, that.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId, filePath, ref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFilesByQueryRequest {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
