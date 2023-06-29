package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EnableCertificateAuthorityCrlRequestBody
 */
public class EnableCertificateAuthorityCrlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_name")

    private String crlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_days")

    private Integer validDays;

    public EnableCertificateAuthorityCrlRequestBody withCrlName(String crlName) {
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

    public EnableCertificateAuthorityCrlRequestBody withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名称。 > - 用户必须已创建委托授权，授予PCA服务对OBS的相关权限，具体参见本文档：**证书吊销处理>查看是否具有委托权限**、**证书吊销处理>创建委托**； > - 指定的OBS桶必须存在，否则将报错。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public EnableCertificateAuthorityCrlRequestBody withValidDays(Integer validDays) {
        this.validDays = validDays;
        return this;
    }

    /**
     * CRL更新周期，单位为\"天\"。
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableCertificateAuthorityCrlRequestBody that = (EnableCertificateAuthorityCrlRequestBody) obj;
        return Objects.equals(this.crlName, that.crlName) && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.validDays, that.validDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crlName, obsBucketName, validDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableCertificateAuthorityCrlRequestBody {\n");
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
