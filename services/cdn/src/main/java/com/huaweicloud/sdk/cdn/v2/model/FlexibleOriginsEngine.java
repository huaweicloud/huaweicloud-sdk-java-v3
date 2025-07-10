package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 高级回源，实现根据不同的资源类型或路径回源到不同源站 **约束限制：** 最多配置20条
 */
public class FlexibleOriginsEngine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources_type")

    private String sourcesType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_or_domain")

    private String ipOrDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_type")

    private String obsBucketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_access_key")

    private String bucketAccessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_secret_key")

    private String bucketSecretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_region")

    private String bucketRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_protocol")

    private String originProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_port")

    private Integer httpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_port")

    private Integer httpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public FlexibleOriginsEngine withSourcesType(String sourcesType) {
        this.sourcesType = sourcesType;
        return this;
    }

    /**
     * **参数解释：** 源站类型 **约束限制：** 不涉及 **取值范围：** - ipaddr: 源站IP - domain: 源站域名 - obs_bucket: OBS桶域名 - third_bucket: 第三方桶域名 **默认取值：** 不涉及
     * @return sourcesType
     */
    public String getSourcesType() {
        return sourcesType;
    }

    public void setSourcesType(String sourcesType) {
        this.sourcesType = sourcesType;
    }

    public FlexibleOriginsEngine withIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
        return this;
    }

    /**
     * **参数解释：** 源站IP或者域名 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ipOrDomain
     */
    public String getIpOrDomain() {
        return ipOrDomain;
    }

    public void setIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
    }

    public FlexibleOriginsEngine withObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
        return this;
    }

    /**
     * **参数解释：** OBS桶类型 **约束限制：** 源站类型是“OBS桶域名”时需要传该参数 **取值范围：** - private: 私有桶 - public: 公有桶 **默认取值：** public: 公有桶
     * @return obsBucketType
     */
    public String getObsBucketType() {
        return obsBucketType;
    }

    public void setObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
    }

    public FlexibleOriginsEngine withBucketAccessKey(String bucketAccessKey) {
        this.bucketAccessKey = bucketAccessKey;
        return this;
    }

    /**
     * **参数解释：** 第三方对象存储访问密钥 **约束限制：** 源站类型为第三方桶时必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return bucketAccessKey
     */
    public String getBucketAccessKey() {
        return bucketAccessKey;
    }

    public void setBucketAccessKey(String bucketAccessKey) {
        this.bucketAccessKey = bucketAccessKey;
    }

    public FlexibleOriginsEngine withBucketSecretKey(String bucketSecretKey) {
        this.bucketSecretKey = bucketSecretKey;
        return this;
    }

    /**
     * **参数解释：** 第三方对象存储密钥 **约束限制：** 源站类型为第三方桶时必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return bucketSecretKey
     */
    public String getBucketSecretKey() {
        return bucketSecretKey;
    }

    public void setBucketSecretKey(String bucketSecretKey) {
        this.bucketSecretKey = bucketSecretKey;
    }

    public FlexibleOriginsEngine withBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }

    /**
     * **参数解释：** 第三方对象存储区域 **约束限制：** 源站类型为第三方桶时必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return bucketRegion
     */
    public String getBucketRegion() {
        return bucketRegion;
    }

    public void setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
    }

    public FlexibleOriginsEngine withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数解释：** 第三方对象存储名称 **约束限制：** 源站类型为第三方桶时必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public FlexibleOriginsEngine withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释：** 回源HOST **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 加速域名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public FlexibleOriginsEngine withOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
        return this;
    }

    /**
     * **参数解释：** 指定CDN回源时的请求协议 **约束限制：** 不涉及 **取值范围：** - follow: 协议跟随 - http: http协议 - https: https协议 **默认取值：** http: http协议
     * @return originProtocol
     */
    public String getOriginProtocol() {
        return originProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
    }

    public FlexibleOriginsEngine withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * **参数解释：** HTTP端口 **约束限制：** 不涉及 **取值范围：** 1-65535 **默认取值：** 80
     * @return httpPort
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public FlexibleOriginsEngine withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * **参数解释：** HTTPS端口 **约束限制：** 不涉及 **取值范围：** 1-65535 **默认取值：** 443
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    public FlexibleOriginsEngine withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 优先级，值越大优先级越高 **约束限制：** 不涉及 **取值范围：** 1-100 **默认取值：** 不涉及
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public FlexibleOriginsEngine withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重，值越大回源到该源站的次数越多。多个优先级相同的源站，由权重决定回源到各个源站的比例 **约束限制：** 不涉及 **取值范围：** 1-100 **默认取值：** 不涉及
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlexibleOriginsEngine that = (FlexibleOriginsEngine) obj;
        return Objects.equals(this.sourcesType, that.sourcesType) && Objects.equals(this.ipOrDomain, that.ipOrDomain)
            && Objects.equals(this.obsBucketType, that.obsBucketType)
            && Objects.equals(this.bucketAccessKey, that.bucketAccessKey)
            && Objects.equals(this.bucketSecretKey, that.bucketSecretKey)
            && Objects.equals(this.bucketRegion, that.bucketRegion) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.originProtocol, that.originProtocol)
            && Objects.equals(this.httpPort, that.httpPort) && Objects.equals(this.httpsPort, that.httpsPort)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourcesType,
            ipOrDomain,
            obsBucketType,
            bucketAccessKey,
            bucketSecretKey,
            bucketRegion,
            bucketName,
            hostName,
            originProtocol,
            httpPort,
            httpsPort,
            priority,
            weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlexibleOriginsEngine {\n");
        sb.append("    sourcesType: ").append(toIndentedString(sourcesType)).append("\n");
        sb.append("    ipOrDomain: ").append(toIndentedString(ipOrDomain)).append("\n");
        sb.append("    obsBucketType: ").append(toIndentedString(obsBucketType)).append("\n");
        sb.append("    bucketAccessKey: ").append(toIndentedString(bucketAccessKey)).append("\n");
        sb.append("    bucketSecretKey: ").append(toIndentedString(bucketSecretKey)).append("\n");
        sb.append("    bucketRegion: ").append(toIndentedString(bucketRegion)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    originProtocol: ").append(toIndentedString(originProtocol)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
