package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “文档”文件夹重定向配置
 */
public class DocumentsConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_status")

    private Integer documentsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_redirection_type")

    private Integer documentsRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_storage_path")

    private String documentsStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_relative_path")

    private String documentsRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_exclusive_rights")

    private Integer documentsExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_move_contents")

    private Integer documentsMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_move_content_on_policy_removal")

    private Integer documentsMoveContentOnPolicyRemoval;

    public DocumentsConfigurations withDocumentsStatus(Integer documentsStatus) {
        this.documentsStatus = documentsStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return documentsStatus
     */
    public Integer getDocumentsStatus() {
        return documentsStatus;
    }

    public void setDocumentsStatus(Integer documentsStatus) {
        this.documentsStatus = documentsStatus;
    }

    public DocumentsConfigurations withDocumentsRedirectionType(Integer documentsRedirectionType) {
        this.documentsRedirectionType = documentsRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return documentsRedirectionType
     */
    public Integer getDocumentsRedirectionType() {
        return documentsRedirectionType;
    }

    public void setDocumentsRedirectionType(Integer documentsRedirectionType) {
        this.documentsRedirectionType = documentsRedirectionType;
    }

    public DocumentsConfigurations withDocumentsStoragePath(String documentsStoragePath) {
        this.documentsStoragePath = documentsStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return documentsStoragePath
     */
    public String getDocumentsStoragePath() {
        return documentsStoragePath;
    }

    public void setDocumentsStoragePath(String documentsStoragePath) {
        this.documentsStoragePath = documentsStoragePath;
    }

    public DocumentsConfigurations withDocumentsRelativePath(String documentsRelativePath) {
        this.documentsRelativePath = documentsRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return documentsRelativePath
     */
    public String getDocumentsRelativePath() {
        return documentsRelativePath;
    }

    public void setDocumentsRelativePath(String documentsRelativePath) {
        this.documentsRelativePath = documentsRelativePath;
    }

    public DocumentsConfigurations withDocumentsExclusiveRights(Integer documentsExclusiveRights) {
        this.documentsExclusiveRights = documentsExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return documentsExclusiveRights
     */
    public Integer getDocumentsExclusiveRights() {
        return documentsExclusiveRights;
    }

    public void setDocumentsExclusiveRights(Integer documentsExclusiveRights) {
        this.documentsExclusiveRights = documentsExclusiveRights;
    }

    public DocumentsConfigurations withDocumentsMoveContents(Integer documentsMoveContents) {
        this.documentsMoveContents = documentsMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return documentsMoveContents
     */
    public Integer getDocumentsMoveContents() {
        return documentsMoveContents;
    }

    public void setDocumentsMoveContents(Integer documentsMoveContents) {
        this.documentsMoveContents = documentsMoveContents;
    }

    public DocumentsConfigurations withDocumentsMoveContentOnPolicyRemoval(
        Integer documentsMoveContentOnPolicyRemoval) {
        this.documentsMoveContentOnPolicyRemoval = documentsMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return documentsMoveContentOnPolicyRemoval
     */
    public Integer getDocumentsMoveContentOnPolicyRemoval() {
        return documentsMoveContentOnPolicyRemoval;
    }

    public void setDocumentsMoveContentOnPolicyRemoval(Integer documentsMoveContentOnPolicyRemoval) {
        this.documentsMoveContentOnPolicyRemoval = documentsMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentsConfigurations that = (DocumentsConfigurations) obj;
        return Objects.equals(this.documentsStatus, that.documentsStatus)
            && Objects.equals(this.documentsRedirectionType, that.documentsRedirectionType)
            && Objects.equals(this.documentsStoragePath, that.documentsStoragePath)
            && Objects.equals(this.documentsRelativePath, that.documentsRelativePath)
            && Objects.equals(this.documentsExclusiveRights, that.documentsExclusiveRights)
            && Objects.equals(this.documentsMoveContents, that.documentsMoveContents)
            && Objects.equals(this.documentsMoveContentOnPolicyRemoval, that.documentsMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentsStatus,
            documentsRedirectionType,
            documentsStoragePath,
            documentsRelativePath,
            documentsExclusiveRights,
            documentsMoveContents,
            documentsMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentsConfigurations {\n");
        sb.append("    documentsStatus: ").append(toIndentedString(documentsStatus)).append("\n");
        sb.append("    documentsRedirectionType: ").append(toIndentedString(documentsRedirectionType)).append("\n");
        sb.append("    documentsStoragePath: ").append(toIndentedString(documentsStoragePath)).append("\n");
        sb.append("    documentsRelativePath: ").append(toIndentedString(documentsRelativePath)).append("\n");
        sb.append("    documentsExclusiveRights: ").append(toIndentedString(documentsExclusiveRights)).append("\n");
        sb.append("    documentsMoveContents: ").append(toIndentedString(documentsMoveContents)).append("\n");
        sb.append("    documentsMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(documentsMoveContentOnPolicyRemoval))
            .append("\n");
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
