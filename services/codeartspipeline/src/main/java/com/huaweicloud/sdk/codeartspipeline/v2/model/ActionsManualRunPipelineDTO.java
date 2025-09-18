package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ActionsManualRunPipelineDTO
 */
public class ActionsManualRunPipelineDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_url")

    private String httpsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_content")

    private String fileContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    public ActionsManualRunPipelineDTO withHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
        return this;
    }

    /**
     * **参数解释**： 触发URL。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return httpsUrl
     */
    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    public ActionsManualRunPipelineDTO withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 文件存储路径。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ActionsManualRunPipelineDTO withFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * **参数解释**： 文件详情。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public ActionsManualRunPipelineDTO withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释**： 代码源分支名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ActionsManualRunPipelineDTO withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * **参数解释**： 文件编码方式。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public ActionsManualRunPipelineDTO withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**： 代码源标签。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ActionsManualRunPipelineDTO withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释**： 代码源提交记录id。 **约束限制**： 不涉及。 **取值范围**： 40位字符。 **默认取值**： 不涉及。 
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ActionsManualRunPipelineDTO withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * **参数解释**： 代码源访问权限token。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionsManualRunPipelineDTO that = (ActionsManualRunPipelineDTO) obj;
        return Objects.equals(this.httpsUrl, that.httpsUrl) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fileContent, that.fileContent) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.encoding, that.encoding) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.commitId, that.commitId) && Objects.equals(this.accessToken, that.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsUrl, filePath, fileContent, branch, encoding, tag, commitId, accessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsManualRunPipelineDTO {\n");
        sb.append("    httpsUrl: ").append(toIndentedString(httpsUrl)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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
