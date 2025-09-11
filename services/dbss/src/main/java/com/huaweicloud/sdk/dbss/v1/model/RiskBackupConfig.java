package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RiskBackupConfig
 */
public class RiskBackupConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_domain_id")

    private String backupDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_root_path")

    private String bucketRootPath;

    public RiskBackupConfig withBackupDomainId(String backupDomainId) {
        this.backupDomainId = backupDomainId;
        return this;
    }

    /**
     * 账户ID
     * @return backupDomainId
     */
    public String getBackupDomainId() {
        return backupDomainId;
    }

    public void setBackupDomainId(String backupDomainId) {
        this.backupDomainId = backupDomainId;
    }

    public RiskBackupConfig withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public RiskBackupConfig withBucketRootPath(String bucketRootPath) {
        this.bucketRootPath = bucketRootPath;
        return this;
    }

    /**
     * OBS桶根路径
     * @return bucketRootPath
     */
    public String getBucketRootPath() {
        return bucketRootPath;
    }

    public void setBucketRootPath(String bucketRootPath) {
        this.bucketRootPath = bucketRootPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskBackupConfig that = (RiskBackupConfig) obj;
        return Objects.equals(this.backupDomainId, that.backupDomainId)
            && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.bucketRootPath, that.bucketRootPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupDomainId, bucketName, bucketRootPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskBackupConfig {\n");
        sb.append("    backupDomainId: ").append(toIndentedString(backupDomainId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    bucketRootPath: ").append(toIndentedString(bucketRootPath)).append("\n");
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
