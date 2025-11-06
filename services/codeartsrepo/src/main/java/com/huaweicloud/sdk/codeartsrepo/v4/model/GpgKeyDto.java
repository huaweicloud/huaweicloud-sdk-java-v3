package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GpgKeyDto
 */
public class GpgKeyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_name")

    private String gpgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_gpg_verified")

    private Boolean openGpgVerified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_status")

    private Integer verificationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_primary_key_id")

    private String gpgPrimaryKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_nick_name")

    private String gpgNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_tenant_name")

    private String gpgTenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_user_name")

    private String gpgUserName;

    public GpgKeyDto withGpgName(String gpgName) {
        this.gpgName = gpgName;
        return this;
    }

    /**
     * gpg名称
     * @return gpgName
     */
    public String getGpgName() {
        return gpgName;
    }

    public void setGpgName(String gpgName) {
        this.gpgName = gpgName;
    }

    public GpgKeyDto withOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
        return this;
    }

    /**
     * 是否开启gpg认证
     * @return openGpgVerified
     */
    public Boolean getOpenGpgVerified() {
        return openGpgVerified;
    }

    public void setOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
    }

    public GpgKeyDto withVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * gpg认证状态
     * @return verificationStatus
     */
    public Integer getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public GpgKeyDto withGpgPrimaryKeyId(String gpgPrimaryKeyId) {
        this.gpgPrimaryKeyId = gpgPrimaryKeyId;
        return this;
    }

    /**
     * gpg初始化id
     * @return gpgPrimaryKeyId
     */
    public String getGpgPrimaryKeyId() {
        return gpgPrimaryKeyId;
    }

    public void setGpgPrimaryKeyId(String gpgPrimaryKeyId) {
        this.gpgPrimaryKeyId = gpgPrimaryKeyId;
    }

    public GpgKeyDto withGpgNickName(String gpgNickName) {
        this.gpgNickName = gpgNickName;
        return this;
    }

    /**
     * gpg昵称
     * @return gpgNickName
     */
    public String getGpgNickName() {
        return gpgNickName;
    }

    public void setGpgNickName(String gpgNickName) {
        this.gpgNickName = gpgNickName;
    }

    public GpgKeyDto withGpgTenantName(String gpgTenantName) {
        this.gpgTenantName = gpgTenantName;
        return this;
    }

    /**
     * gpg租户昵称
     * @return gpgTenantName
     */
    public String getGpgTenantName() {
        return gpgTenantName;
    }

    public void setGpgTenantName(String gpgTenantName) {
        this.gpgTenantName = gpgTenantName;
    }

    public GpgKeyDto withGpgUserName(String gpgUserName) {
        this.gpgUserName = gpgUserName;
        return this;
    }

    /**
     * gpg用户名称
     * @return gpgUserName
     */
    public String getGpgUserName() {
        return gpgUserName;
    }

    public void setGpgUserName(String gpgUserName) {
        this.gpgUserName = gpgUserName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GpgKeyDto that = (GpgKeyDto) obj;
        return Objects.equals(this.gpgName, that.gpgName) && Objects.equals(this.openGpgVerified, that.openGpgVerified)
            && Objects.equals(this.verificationStatus, that.verificationStatus)
            && Objects.equals(this.gpgPrimaryKeyId, that.gpgPrimaryKeyId)
            && Objects.equals(this.gpgNickName, that.gpgNickName)
            && Objects.equals(this.gpgTenantName, that.gpgTenantName)
            && Objects.equals(this.gpgUserName, that.gpgUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpgName,
            openGpgVerified,
            verificationStatus,
            gpgPrimaryKeyId,
            gpgNickName,
            gpgTenantName,
            gpgUserName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GpgKeyDto {\n");
        sb.append("    gpgName: ").append(toIndentedString(gpgName)).append("\n");
        sb.append("    openGpgVerified: ").append(toIndentedString(openGpgVerified)).append("\n");
        sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
        sb.append("    gpgPrimaryKeyId: ").append(toIndentedString(gpgPrimaryKeyId)).append("\n");
        sb.append("    gpgNickName: ").append(toIndentedString(gpgNickName)).append("\n");
        sb.append("    gpgTenantName: ").append(toIndentedString(gpgTenantName)).append("\n");
        sb.append("    gpgUserName: ").append(toIndentedString(gpgUserName)).append("\n");
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
