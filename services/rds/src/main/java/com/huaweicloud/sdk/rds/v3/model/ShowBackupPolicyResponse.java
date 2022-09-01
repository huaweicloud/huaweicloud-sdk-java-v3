package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    @JacksonXmlProperty(localName = "backup_policy")

    private BackupPolicy backupPolicy;

    public ShowBackupPolicyResponse withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public ShowBackupPolicyResponse withBackupPolicy(Consumer<BackupPolicy> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new BackupPolicy();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public BackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBackupPolicyResponse showBackupPolicyResponse = (ShowBackupPolicyResponse) o;
        return Objects.equals(this.backupPolicy, showBackupPolicyResponse.backupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupPolicyResponse {\n");
        sb.append("    backupPolicy: ").append(toIndentedString(backupPolicy)).append("\n");
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
