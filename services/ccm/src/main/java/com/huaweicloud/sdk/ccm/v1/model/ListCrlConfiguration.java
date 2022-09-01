package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ListCrlConfiguration
 */
public class ListCrlConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_name")

    @JacksonXmlProperty(localName = "crl_name")

    private String crlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    @JacksonXmlProperty(localName = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_days")

    @JacksonXmlProperty(localName = "valid_days")

    private Integer validDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_dis_point")

    @JacksonXmlProperty(localName = "crl_dis_point")

    private String crlDisPoint;

    public ListCrlConfiguration withEnabled(Boolean enabled) {
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

    public ListCrlConfiguration withCrlName(String crlName) {
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

    public ListCrlConfiguration withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名称。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public ListCrlConfiguration withValidDays(Integer validDays) {
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

    public ListCrlConfiguration withCrlDisPoint(String crlDisPoint) {
        this.crlDisPoint = crlDisPoint;
        return this;
    }

    /**
     * 吊销列表分发地址，即对应的OBS桶中的CRL文件地址。 > 本参数由程序根据crl_name、obs_bucket_name以及OBS地址进行拼接而成。
     * @return crlDisPoint
     */
    public String getCrlDisPoint() {
        return crlDisPoint;
    }

    public void setCrlDisPoint(String crlDisPoint) {
        this.crlDisPoint = crlDisPoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCrlConfiguration listCrlConfiguration = (ListCrlConfiguration) o;
        return Objects.equals(this.enabled, listCrlConfiguration.enabled)
            && Objects.equals(this.crlName, listCrlConfiguration.crlName)
            && Objects.equals(this.obsBucketName, listCrlConfiguration.obsBucketName)
            && Objects.equals(this.validDays, listCrlConfiguration.validDays)
            && Objects.equals(this.crlDisPoint, listCrlConfiguration.crlDisPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, crlName, obsBucketName, validDays, crlDisPoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCrlConfiguration {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    crlName: ").append(toIndentedString(crlName)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    validDays: ").append(toIndentedString(validDays)).append("\n");
        sb.append("    crlDisPoint: ").append(toIndentedString(crlDisPoint)).append("\n");
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
