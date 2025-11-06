package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RenameFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    public RenameFileResponse withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public RenameFileResponse withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支名称
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenameFileResponse that = (RenameFileResponse) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.branch, that.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, branch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameFileResponse {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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
