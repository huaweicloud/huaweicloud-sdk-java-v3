package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储声明关联作用对象
 */
public class PersistentStorageAssignment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_claim_id")

    private String storageClaimId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_path")

    private String folderPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claim_mode")

    private ClaimMode claimMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_metadata")

    private StorageMetadata storageMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement")

    private PolicyStatement policyStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private Attachment attachment;

    public PersistentStorageAssignment withStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
        return this;
    }

    /**
     * WKS存储目录声明ID
     * @return storageClaimId
     */
    public String getStorageClaimId() {
        return storageClaimId;
    }

    public void setStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
    }

    public PersistentStorageAssignment withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * 存储对象路径 注: path是对象在系统中的完整路径 例如系统中存在如下目录结构的数据. SFS-Tmp: └─shares   ├─image   └─video image的路径: shares/image/ video的路径: shares/video/
     * @return folderPath
     */
    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public PersistentStorageAssignment withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 路径分隔符
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public PersistentStorageAssignment withClaimMode(ClaimMode claimMode) {
        this.claimMode = claimMode;
        return this;
    }

    /**
     * Get claimMode
     * @return claimMode
     */
    public ClaimMode getClaimMode() {
        return claimMode;
    }

    public void setClaimMode(ClaimMode claimMode) {
        this.claimMode = claimMode;
    }

    public PersistentStorageAssignment withStorageMetadata(StorageMetadata storageMetadata) {
        this.storageMetadata = storageMetadata;
        return this;
    }

    public PersistentStorageAssignment withStorageMetadata(Consumer<StorageMetadata> storageMetadataSetter) {
        if (this.storageMetadata == null) {
            this.storageMetadata = new StorageMetadata();
            storageMetadataSetter.accept(this.storageMetadata);
        }

        return this;
    }

    /**
     * Get storageMetadata
     * @return storageMetadata
     */
    public StorageMetadata getStorageMetadata() {
        return storageMetadata;
    }

    public void setStorageMetadata(StorageMetadata storageMetadata) {
        this.storageMetadata = storageMetadata;
    }

    public PersistentStorageAssignment withPolicyStatement(PolicyStatement policyStatement) {
        this.policyStatement = policyStatement;
        return this;
    }

    public PersistentStorageAssignment withPolicyStatement(Consumer<PolicyStatement> policyStatementSetter) {
        if (this.policyStatement == null) {
            this.policyStatement = new PolicyStatement();
            policyStatementSetter.accept(this.policyStatement);
        }

        return this;
    }

    /**
     * Get policyStatement
     * @return policyStatement
     */
    public PolicyStatement getPolicyStatement() {
        return policyStatement;
    }

    public void setPolicyStatement(PolicyStatement policyStatement) {
        this.policyStatement = policyStatement;
    }

    public PersistentStorageAssignment withAttachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public PersistentStorageAssignment withAttachment(Consumer<Attachment> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new Attachment();
            attachmentSetter.accept(this.attachment);
        }

        return this;
    }

    /**
     * Get attachment
     * @return attachment
     */
    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageAssignment that = (PersistentStorageAssignment) obj;
        return Objects.equals(this.storageClaimId, that.storageClaimId)
            && Objects.equals(this.folderPath, that.folderPath) && Objects.equals(this.delimiter, that.delimiter)
            && Objects.equals(this.claimMode, that.claimMode)
            && Objects.equals(this.storageMetadata, that.storageMetadata)
            && Objects.equals(this.policyStatement, that.policyStatement)
            && Objects.equals(this.attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(storageClaimId, folderPath, delimiter, claimMode, storageMetadata, policyStatement, attachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentStorageAssignment {\n");
        sb.append("    storageClaimId: ").append(toIndentedString(storageClaimId)).append("\n");
        sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    claimMode: ").append(toIndentedString(claimMode)).append("\n");
        sb.append("    storageMetadata: ").append(toIndentedString(storageMetadata)).append("\n");
        sb.append("    policyStatement: ").append(toIndentedString(policyStatement)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
