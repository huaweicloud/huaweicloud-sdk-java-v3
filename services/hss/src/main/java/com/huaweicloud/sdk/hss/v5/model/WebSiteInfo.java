package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: Web站点信息 
 */
public class WebSiteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_addr")

    private String bindAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_path")

    private String urlPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Integer uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Integer gid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proc_path")

    private String procPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_https")

    private Boolean isHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_issuer")

    private String certIssuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_user")

    private String certUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_issue_time")

    private String certIssueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_expired_time")

    private String certExpiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public WebSiteInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * **参数解释**: 域名 **取值范围**: 字符长度1-256 
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public WebSiteInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符长度1-256 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public WebSiteInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: web目录路径 **取值范围**: 字符长度1-512 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public WebSiteInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: web站点对外端口 **取值范围**: 最小值0，最大值2147483647 
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public WebSiteInfo withBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
        return this;
    }

    /**
     * **参数解释**: web站点绑定IP **取值范围**: 字符长度1-512 
     * @return bindAddr
     */
    public String getBindAddr() {
        return bindAddr;
    }

    public void setBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
    }

    public WebSiteInfo withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    /**
     * **参数解释**: web站点url路径 **取值范围**: 字符长度1-128 
     * @return urlPath
     */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public WebSiteInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**: web站点进程uid **取值范围**: 最小值0，最大值2147483647 
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public WebSiteInfo withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * **参数解释**: web站点进程gid **取值范围**: 最小值0，最大值2147483647 
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public WebSiteInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**: web站点文件权限 **取值范围**: 字符长度1-32 
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public WebSiteInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**: web站点进程pid **取值范围**: 最小值0，最大值2147483647 
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public WebSiteInfo withProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }

    /**
     * **参数解释**: web站点进程路径 **取值范围**: 字符长度1-1024 
     * @return procPath
     */
    public String getProcPath() {
        return procPath;
    }

    public void setProcPath(String procPath) {
        this.procPath = procPath;
    }

    public WebSiteInfo withIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
        return this;
    }

    /**
     * **参数解释**: web站点是否为https **取值范围**: - true：是。 - false：否。 
     * @return isHttps
     */
    public Boolean getIsHttps() {
        return isHttps;
    }

    public void setIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
    }

    public WebSiteInfo withCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
        return this;
    }

    /**
     * **参数解释**: web站点SSL证书颁发者 **取值范围**: 字符长度0-256 
     * @return certIssuer
     */
    public String getCertIssuer() {
        return certIssuer;
    }

    public void setCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
    }

    public WebSiteInfo withCertUser(String certUser) {
        this.certUser = certUser;
        return this;
    }

    /**
     * **参数解释**: web站点SSL证书使用者 **取值范围**: 字符长度0-256 
     * @return certUser
     */
    public String getCertUser() {
        return certUser;
    }

    public void setCertUser(String certUser) {
        this.certUser = certUser;
    }

    public WebSiteInfo withCertIssueTime(String certIssueTime) {
        this.certIssueTime = certIssueTime;
        return this;
    }

    /**
     * **参数解释**: web站点SSL证书颁发时间 **取值范围**: 字符长度0-32 
     * @return certIssueTime
     */
    public String getCertIssueTime() {
        return certIssueTime;
    }

    public void setCertIssueTime(String certIssueTime) {
        this.certIssueTime = certIssueTime;
    }

    public WebSiteInfo withCertExpiredTime(String certExpiredTime) {
        this.certExpiredTime = certExpiredTime;
        return this;
    }

    /**
     * **参数解释**: web站点SSL证书截止时间 **取值范围**: 字符长度0-32 
     * @return certExpiredTime
     */
    public String getCertExpiredTime() {
        return certExpiredTime;
    }

    public void setCertExpiredTime(String certExpiredTime) {
        this.certExpiredTime = certExpiredTime;
    }

    public WebSiteInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * **参数解释**: web框架扫描时间 **取值范围**: 最小值0，最大值2^63-1 
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public WebSiteInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器id **取值范围**: 字符长度1-128 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public WebSiteInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**: 容器名称 **取值范围**: 字符长度1-256 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebSiteInfo that = (WebSiteInfo) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.path, that.path) && Objects.equals(this.port, that.port)
            && Objects.equals(this.bindAddr, that.bindAddr) && Objects.equals(this.urlPath, that.urlPath)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.gid, that.gid)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.procPath, that.procPath) && Objects.equals(this.isHttps, that.isHttps)
            && Objects.equals(this.certIssuer, that.certIssuer) && Objects.equals(this.certUser, that.certUser)
            && Objects.equals(this.certIssueTime, that.certIssueTime)
            && Objects.equals(this.certExpiredTime, that.certExpiredTime)
            && Objects.equals(this.recordTime, that.recordTime) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain,
            appName,
            path,
            port,
            bindAddr,
            urlPath,
            uid,
            gid,
            mode,
            pid,
            procPath,
            isHttps,
            certIssuer,
            certUser,
            certIssueTime,
            certExpiredTime,
            recordTime,
            containerId,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebSiteInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    bindAddr: ").append(toIndentedString(bindAddr)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    procPath: ").append(toIndentedString(procPath)).append("\n");
        sb.append("    isHttps: ").append(toIndentedString(isHttps)).append("\n");
        sb.append("    certIssuer: ").append(toIndentedString(certIssuer)).append("\n");
        sb.append("    certUser: ").append(toIndentedString(certUser)).append("\n");
        sb.append("    certIssueTime: ").append(toIndentedString(certIssueTime)).append("\n");
        sb.append("    certExpiredTime: ").append(toIndentedString(certExpiredTime)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
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
