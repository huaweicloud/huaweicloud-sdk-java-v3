package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SPSAMLConfig
 */
public class SPSAMLConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acs_url")

    private String acsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    public SPSAMLConfig withAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
        return this;
    }

    /**
     * 服务提供商断言响应地址
     * @return acsUrl
     */
    public String getAcsUrl() {
        return acsUrl;
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }

    public SPSAMLConfig withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 服务提供商签发者
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public SPSAMLConfig withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 服务提供商元数据
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SPSAMLConfig that = (SPSAMLConfig) obj;
        return Objects.equals(this.acsUrl, that.acsUrl) && Objects.equals(this.issuer, that.issuer)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acsUrl, issuer, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SPSAMLConfig {\n");
        sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
