package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListGlobalFeatureGatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableUserDefObs")

    private Boolean enableUserDefObs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableEnterprise")

    private Boolean enableEnterprise;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cerAvailable")

    private Boolean cerAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableOBSEncryptUserKmsKey")

    private Boolean enableOBSEncryptUserKmsKey;

    public ListGlobalFeatureGatesResponse withEnableUserDefObs(Boolean enableUserDefObs) {
        this.enableUserDefObs = enableUserDefObs;
        return this;
    }

    /**
     * 是否支持使用用户的obs桶
     * @return enableUserDefObs
     */
    public Boolean getEnableUserDefObs() {
        return enableUserDefObs;
    }

    public void setEnableUserDefObs(Boolean enableUserDefObs) {
        this.enableUserDefObs = enableUserDefObs;
    }

    public ListGlobalFeatureGatesResponse withEnableEnterprise(Boolean enableEnterprise) {
        this.enableEnterprise = enableEnterprise;
        return this;
    }

    /**
     * 是否支持支持企业项目
     * @return enableEnterprise
     */
    public Boolean getEnableEnterprise() {
        return enableEnterprise;
    }

    public void setEnableEnterprise(Boolean enableEnterprise) {
        this.enableEnterprise = enableEnterprise;
    }

    public ListGlobalFeatureGatesResponse withCerAvailable(Boolean cerAvailable) {
        this.cerAvailable = cerAvailable;
        return this;
    }

    /**
     * 是否支持SWR企业版功能
     * @return cerAvailable
     */
    public Boolean getCerAvailable() {
        return cerAvailable;
    }

    public void setCerAvailable(Boolean cerAvailable) {
        this.cerAvailable = cerAvailable;
    }

    public ListGlobalFeatureGatesResponse withEnableOBSEncryptUserKmsKey(Boolean enableOBSEncryptUserKmsKey) {
        this.enableOBSEncryptUserKmsKey = enableOBSEncryptUserKmsKey;
        return this;
    }

    /**
     * 是否支持使用已有KSM密钥ID创建OBS桶
     * @return enableOBSEncryptUserKmsKey
     */
    public Boolean getEnableOBSEncryptUserKmsKey() {
        return enableOBSEncryptUserKmsKey;
    }

    public void setEnableOBSEncryptUserKmsKey(Boolean enableOBSEncryptUserKmsKey) {
        this.enableOBSEncryptUserKmsKey = enableOBSEncryptUserKmsKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalFeatureGatesResponse that = (ListGlobalFeatureGatesResponse) obj;
        return Objects.equals(this.enableUserDefObs, that.enableUserDefObs)
            && Objects.equals(this.enableEnterprise, that.enableEnterprise)
            && Objects.equals(this.cerAvailable, that.cerAvailable)
            && Objects.equals(this.enableOBSEncryptUserKmsKey, that.enableOBSEncryptUserKmsKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableUserDefObs, enableEnterprise, cerAvailable, enableOBSEncryptUserKmsKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalFeatureGatesResponse {\n");
        sb.append("    enableUserDefObs: ").append(toIndentedString(enableUserDefObs)).append("\n");
        sb.append("    enableEnterprise: ").append(toIndentedString(enableEnterprise)).append("\n");
        sb.append("    cerAvailable: ").append(toIndentedString(cerAvailable)).append("\n");
        sb.append("    enableOBSEncryptUserKmsKey: ").append(toIndentedString(enableOBSEncryptUserKmsKey)).append("\n");
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
