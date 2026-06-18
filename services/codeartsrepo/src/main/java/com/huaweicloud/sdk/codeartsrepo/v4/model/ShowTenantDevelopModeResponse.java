package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTenantDevelopModeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cr_enable")

    private Boolean crEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_encryption_enabled")

    private Boolean repoEncryptionEnabled;

    public ShowTenantDevelopModeResponse withCrEnable(Boolean crEnable) {
        this.crEnable = crEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启cr模式。
     * @return crEnable
     */
    public Boolean getCrEnable() {
        return crEnable;
    }

    public void setCrEnable(Boolean crEnable) {
        this.crEnable = crEnable;
    }

    public ShowTenantDevelopModeResponse withRepoEncryptionEnabled(Boolean repoEncryptionEnabled) {
        this.repoEncryptionEnabled = repoEncryptionEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启租户下加密设置。
     * @return repoEncryptionEnabled
     */
    public Boolean getRepoEncryptionEnabled() {
        return repoEncryptionEnabled;
    }

    public void setRepoEncryptionEnabled(Boolean repoEncryptionEnabled) {
        this.repoEncryptionEnabled = repoEncryptionEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTenantDevelopModeResponse that = (ShowTenantDevelopModeResponse) obj;
        return Objects.equals(this.crEnable, that.crEnable)
            && Objects.equals(this.repoEncryptionEnabled, that.repoEncryptionEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crEnable, repoEncryptionEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantDevelopModeResponse {\n");
        sb.append("    crEnable: ").append(toIndentedString(crEnable)).append("\n");
        sb.append("    repoEncryptionEnabled: ").append(toIndentedString(repoEncryptionEnabled)).append("\n");
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
