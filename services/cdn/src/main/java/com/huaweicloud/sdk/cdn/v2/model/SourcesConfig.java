package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 源站配置。
 */
public class SourcesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_addr")

    private String originAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_type")

    private String originType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_web_hosting_status")

    private String obsWebHostingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_port")

    private Integer httpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_port")

    private Integer httpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_type")

    private String obsBucketType;

    public SourcesConfig withOriginAddr(String originAddr) {
        this.originAddr = originAddr;
        return this;
    }

    /**
     * 源站IP或者域名。
     * @return originAddr
     */
    public String getOriginAddr() {
        return originAddr;
    }

    public void setOriginAddr(String originAddr) {
        this.originAddr = originAddr;
    }

    public SourcesConfig withOriginType(String originType) {
        this.originType = originType;
        return this;
    }

    /**
     * 源站类型， ipaddr：源站IP，domain：源站域名，obs_bucket：OBS桶域名。
     * @return originType
     */
    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    public SourcesConfig withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 源站优先级，70：主，30：备。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public SourcesConfig withObsWebHostingStatus(String obsWebHostingStatus) {
        this.obsWebHostingStatus = obsWebHostingStatus;
        return this;
    }

    /**
     * 是否开启Obs静态网站托管，源站类型为obs_bucket时传递，off：关闭，on：开启。
     * @return obsWebHostingStatus
     */
    public String getObsWebHostingStatus() {
        return obsWebHostingStatus;
    }

    public void setObsWebHostingStatus(String obsWebHostingStatus) {
        this.obsWebHostingStatus = obsWebHostingStatus;
    }

    public SourcesConfig withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * HTTP端口，默认80,端口取值取值范围1-65535。
     * @return httpPort
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public SourcesConfig withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * HTTPS端口，默认443,端口取值取值范围1-65535。
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    public SourcesConfig withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 回源HOST，默认加速域名。
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public SourcesConfig withObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
        return this;
    }

    /**
     * obs桶源站类型 “private” 私有桶 “public” 公有桶。
     * @return obsBucketType
     */
    public String getObsBucketType() {
        return obsBucketType;
    }

    public void setObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourcesConfig that = (SourcesConfig) obj;
        return Objects.equals(this.originAddr, that.originAddr) && Objects.equals(this.originType, that.originType)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.obsWebHostingStatus, that.obsWebHostingStatus)
            && Objects.equals(this.httpPort, that.httpPort) && Objects.equals(this.httpsPort, that.httpsPort)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.obsBucketType, that.obsBucketType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(originAddr, originType, priority, obsWebHostingStatus, httpPort, httpsPort, hostName, obsBucketType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourcesConfig {\n");
        sb.append("    originAddr: ").append(toIndentedString(originAddr)).append("\n");
        sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    obsWebHostingStatus: ").append(toIndentedString(obsWebHostingStatus)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
