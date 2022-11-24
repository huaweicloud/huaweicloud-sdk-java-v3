package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CrlConfiguration
 */
public class CrlConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_name")

    private String crlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_days")

    private Integer validDays;

    public CrlConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用CRL发布功能。 - **true** - **false**
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CrlConfiguration withCrlName(String crlName) {
        this.crlName = crlName;
        return this;
    }

    /**
     * 吊销列表文件名称。 > 若用户不指定，系统将默认采用当前证书的父CA ID。
     * @return crlName
     */
    public String getCrlName() {
        return crlName;
    }

    public void setCrlName(String crlName) {
        this.crlName = crlName;
    }

    public CrlConfiguration withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名称。 > 当需要启用CRL发布功能： > - 此参数为必填项，且用户必须已创建委托授权，授予PCA服务对OBS的相关权限，具体参见本文档：**证书吊销处理>查看是否具有委托权限**、**证书吊销处理>创建委托**； > - 指定的OBS桶必须存在，否则将报错。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public CrlConfiguration withValidDays(Integer validDays) {
        this.validDays = validDays;
        return this;
    }

    /**
     * CRL更新周期，单位为\"天\"。当启用CRL发布功能，为必填项。
     * minimum: 7
     * maximum: 30
     * @return validDays
     */
    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CrlConfiguration crlConfiguration = (CrlConfiguration) o;
        return Objects.equals(this.enabled, crlConfiguration.enabled)
            && Objects.equals(this.crlName, crlConfiguration.crlName)
            && Objects.equals(this.obsBucketName, crlConfiguration.obsBucketName)
            && Objects.equals(this.validDays, crlConfiguration.validDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, crlName, obsBucketName, validDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrlConfiguration {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    crlName: ").append(toIndentedString(crlName)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    validDays: ").append(toIndentedString(validDays)).append("\n");
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
