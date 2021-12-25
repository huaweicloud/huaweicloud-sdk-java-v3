package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    public ShowFileRequest withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /** 仓库短id
     * 
     * @return repoId */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public ShowFileRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /** Url编码的新文件的完整路径。
     * 
     * @return filePath */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ShowFileRequest withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /** commit id，仓库的branch名或tag名
     * 
     * @return ref */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFileRequest showFileRequest = (ShowFileRequest) o;
        return Objects.equals(this.repoId, showFileRequest.repoId)
            && Objects.equals(this.filePath, showFileRequest.filePath) && Objects.equals(this.ref, showFileRequest.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId, filePath, ref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFileRequest {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
