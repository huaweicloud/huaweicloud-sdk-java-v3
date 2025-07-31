package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器列表
 */
public class WebSiteHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

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

    public WebSiteHostInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agent_id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public WebSiteHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WebSiteHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public WebSiteHostInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public WebSiteHostInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public WebSiteHostInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public WebSiteHostInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public WebSiteHostInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public WebSiteHostInfo withBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
        return this;
    }

    /**
     * 绑定地址
     * @return bindAddr
     */
    public String getBindAddr() {
        return bindAddr;
    }

    public void setBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
    }

    public WebSiteHostInfo withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    /**
     * url路径
     * @return urlPath
     */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public WebSiteHostInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 用户id
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public WebSiteHostInfo withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * 用户组id
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public WebSiteHostInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 文件权限
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public WebSiteHostInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 进程id
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public WebSiteHostInfo withProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }

    /**
     * 进程路径
     * @return procPath
     */
    public String getProcPath() {
        return procPath;
    }

    public void setProcPath(String procPath) {
        this.procPath = procPath;
    }

    public WebSiteHostInfo withIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
        return this;
    }

    /**
     * 是否是https
     * @return isHttps
     */
    public Boolean getIsHttps() {
        return isHttps;
    }

    public void setIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
    }

    public WebSiteHostInfo withCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
        return this;
    }

    /**
     * SSL证书颁发者
     * @return certIssuer
     */
    public String getCertIssuer() {
        return certIssuer;
    }

    public void setCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
    }

    public WebSiteHostInfo withCertUser(String certUser) {
        this.certUser = certUser;
        return this;
    }

    /**
     * SSL证书使用者
     * @return certUser
     */
    public String getCertUser() {
        return certUser;
    }

    public void setCertUser(String certUser) {
        this.certUser = certUser;
    }

    public WebSiteHostInfo withCertIssueTime(String certIssueTime) {
        this.certIssueTime = certIssueTime;
        return this;
    }

    /**
     * SSL证书颁发时间
     * @return certIssueTime
     */
    public String getCertIssueTime() {
        return certIssueTime;
    }

    public void setCertIssueTime(String certIssueTime) {
        this.certIssueTime = certIssueTime;
    }

    public WebSiteHostInfo withCertExpiredTime(String certExpiredTime) {
        this.certExpiredTime = certExpiredTime;
        return this;
    }

    /**
     * SSL证书截止时间
     * @return certExpiredTime
     */
    public String getCertExpiredTime() {
        return certExpiredTime;
    }

    public void setCertExpiredTime(String certExpiredTime) {
        this.certExpiredTime = certExpiredTime;
    }

    public WebSiteHostInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 扫描时间
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public WebSiteHostInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public WebSiteHostInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器名称
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
        WebSiteHostInfo that = (WebSiteHostInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
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
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            domain,
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
        sb.append("class WebSiteHostInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
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
