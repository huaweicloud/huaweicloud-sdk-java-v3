package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 生成测试套的请求信息 */
public class CreateTestSuitByRepoFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testsuite_name")

    private String testsuiteName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_branch")

    private String repositoryBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    public CreateTestSuitByRepoFileInfo withTestsuiteName(String testsuiteName) {
        this.testsuiteName = testsuiteName;
        return this;
    }

    /** 要生成的测试套名称
     * 
     * @return testsuiteName */
    public String getTestsuiteName() {
        return testsuiteName;
    }

    public void setTestsuiteName(String testsuiteName) {
        this.testsuiteName = testsuiteName;
    }

    public CreateTestSuitByRepoFileInfo withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /** 仓库id
     * 
     * @return repositoryId */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public CreateTestSuitByRepoFileInfo withRepositoryBranch(String repositoryBranch) {
        this.repositoryBranch = repositoryBranch;
        return this;
    }

    /** 仓库分支
     * 
     * @return repositoryBranch */
    public String getRepositoryBranch() {
        return repositoryBranch;
    }

    public void setRepositoryBranch(String repositoryBranch) {
        this.repositoryBranch = repositoryBranch;
    }

    public CreateTestSuitByRepoFileInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /** 仓库中yaml或json文件的相对路径，仅支持swagger 2.0版本的yaml和json文件
     * 
     * @return filePath */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTestSuitByRepoFileInfo createTestSuitByRepoFileInfo = (CreateTestSuitByRepoFileInfo) o;
        return Objects.equals(this.testsuiteName, createTestSuitByRepoFileInfo.testsuiteName)
            && Objects.equals(this.repositoryId, createTestSuitByRepoFileInfo.repositoryId)
            && Objects.equals(this.repositoryBranch, createTestSuitByRepoFileInfo.repositoryBranch)
            && Objects.equals(this.filePath, createTestSuitByRepoFileInfo.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testsuiteName, repositoryId, repositoryBranch, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTestSuitByRepoFileInfo {\n");
        sb.append("    testsuiteName: ").append(toIndentedString(testsuiteName)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryBranch: ").append(toIndentedString(repositoryBranch)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
