package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 瑞数配置项
 */
public class HttpRiverConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_name")

    private String siteName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_timeout")

    private Integer connectTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_timeout")

    private Integer readTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_timeout")

    private Integer sendTimeout;

    public HttpRiverConfig withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 瑞数站点ID
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public HttpRiverConfig withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * 瑞数站点名称
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public HttpRiverConfig withConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * 连接超时（毫秒）
     * minimum: 0
     * maximum: 1500
     * @return connectTimeout
     */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public HttpRiverConfig withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * 读超时（毫秒）
     * minimum: 0
     * maximum: 1500
     * @return readTimeout
     */
    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public HttpRiverConfig withSendTimeout(Integer sendTimeout) {
        this.sendTimeout = sendTimeout;
        return this;
    }

    /**
     * 写超时（毫秒）
     * minimum: 0
     * maximum: 1500
     * @return sendTimeout
     */
    public Integer getSendTimeout() {
        return sendTimeout;
    }

    public void setSendTimeout(Integer sendTimeout) {
        this.sendTimeout = sendTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRiverConfig that = (HttpRiverConfig) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.siteName, that.siteName)
            && Objects.equals(this.connectTimeout, that.connectTimeout)
            && Objects.equals(this.readTimeout, that.readTimeout) && Objects.equals(this.sendTimeout, that.sendTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, siteName, connectTimeout, readTimeout, sendTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpRiverConfig {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
        sb.append("    sendTimeout: ").append(toIndentedString(sendTimeout)).append("\n");
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
