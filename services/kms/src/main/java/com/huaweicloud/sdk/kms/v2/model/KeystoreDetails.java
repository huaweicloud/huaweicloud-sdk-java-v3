package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 密钥库详情
 */
public class KeystoreDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    @JacksonXmlProperty(localName = "keystore_id")

    private String keystoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_alias")

    @JacksonXmlProperty(localName = "keystore_alias")

    private String keystoreAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_type")

    @JacksonXmlProperty(localName = "keystore_type")

    private String keystoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_cluster_id")

    @JacksonXmlProperty(localName = "hsm_cluster_id")

    private String hsmClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    public KeystoreDetails withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * 密钥库ID
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    public KeystoreDetails withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户域ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoreDetails withKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
        return this;
    }

    /**
     * 密钥库别名
     * @return keystoreAlias
     */
    public String getKeystoreAlias() {
        return keystoreAlias;
    }

    public void setKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }

    public KeystoreDetails withKeystoreType(String keystoreType) {
        this.keystoreType = keystoreType;
        return this;
    }

    /**
     * 密钥库类型
     * @return keystoreType
     */
    public String getKeystoreType() {
        return keystoreType;
    }

    public void setKeystoreType(String keystoreType) {
        this.keystoreType = keystoreType;
    }

    public KeystoreDetails withHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
        return this;
    }

    /**
     * DHSM集群id，要求集群当前未创建专属密钥库
     * @return hsmClusterId
     */
    public String getHsmClusterId() {
        return hsmClusterId;
    }

    public void setHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
    }

    public KeystoreDetails withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 密钥库创建时间，UTC时间戳。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoreDetails keystoreDetails = (KeystoreDetails) o;
        return Objects.equals(this.keystoreId, keystoreDetails.keystoreId)
            && Objects.equals(this.domainId, keystoreDetails.domainId)
            && Objects.equals(this.keystoreAlias, keystoreDetails.keystoreAlias)
            && Objects.equals(this.keystoreType, keystoreDetails.keystoreType)
            && Objects.equals(this.hsmClusterId, keystoreDetails.hsmClusterId)
            && Objects.equals(this.createTime, keystoreDetails.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreId, domainId, keystoreAlias, keystoreType, hsmClusterId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoreDetails {\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keystoreAlias: ").append(toIndentedString(keystoreAlias)).append("\n");
        sb.append("    keystoreType: ").append(toIndentedString(keystoreType)).append("\n");
        sb.append("    hsmClusterId: ").append(toIndentedString(hsmClusterId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
