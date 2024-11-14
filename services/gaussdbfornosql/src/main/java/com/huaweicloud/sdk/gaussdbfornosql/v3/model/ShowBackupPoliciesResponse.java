package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy")

    private ShowBackupPolicyResult backupPolicy;

    public ShowBackupPoliciesResponse withBackupPolicy(ShowBackupPolicyResult backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    public ShowBackupPoliciesResponse withBackupPolicy(Consumer<ShowBackupPolicyResult> backupPolicySetter) {
        if (this.backupPolicy == null) {
            this.backupPolicy = new ShowBackupPolicyResult();
            backupPolicySetter.accept(this.backupPolicy);
        }

        return this;
    }

    /**
     * Get backupPolicy
     * @return backupPolicy
     */
    public ShowBackupPolicyResult getBackupPolicy() {
        return backupPolicy;
    }

    public void setBackupPolicy(ShowBackupPolicyResult backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupPoliciesResponse that = (ShowBackupPoliciesResponse) obj;
        return Objects.equals(this.backupPolicy, that.backupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupPoliciesResponse {\n");
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
