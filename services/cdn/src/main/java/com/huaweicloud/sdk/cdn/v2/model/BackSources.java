package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 高级回源信息源站配置。
 */
public class BackSources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources_type")

    private String sourcesType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_or_domain")

    private String ipOrDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_type")

    private String obsBucketType;

    public BackSources withSourcesType(String sourcesType) {
        this.sourcesType = sourcesType;
        return this;
    }

    /**
     * 源站类型（\"ipaddr\"：\"源站IP\"，\"domain\"：\"源站域名\"，\"obs_bucket\"：\"OBS桶域名\"）。
     * @return sourcesType
     */
    public String getSourcesType() {
        return sourcesType;
    }

    public void setSourcesType(String sourcesType) {
        this.sourcesType = sourcesType;
    }

    public BackSources withIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
        return this;
    }

    /**
     * 源站IP或者域名。
     * @return ipOrDomain
     */
    public String getIpOrDomain() {
        return ipOrDomain;
    }

    public void setIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
    }

    public BackSources withObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
        return this;
    }

    /**
     * obs桶类型，“private”： 私有桶， “public”： 公有桶。
     * @return obsBucketType
     */
    public String getObsBucketType() {
        return obsBucketType;
    }

    public void setObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackSources backSources = (BackSources) o;
        return Objects.equals(this.sourcesType, backSources.sourcesType)
            && Objects.equals(this.ipOrDomain, backSources.ipOrDomain)
            && Objects.equals(this.obsBucketType, backSources.obsBucketType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourcesType, ipOrDomain, obsBucketType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackSources {\n");
        sb.append("    sourcesType: ").append(toIndentedString(sourcesType)).append("\n");
        sb.append("    ipOrDomain: ").append(toIndentedString(ipOrDomain)).append("\n");
        sb.append("    obsBucketType: ").append(toIndentedString(obsBucketType)).append("\n");
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
