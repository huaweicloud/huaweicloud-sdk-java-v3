package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器列表
 */
public class WebFrameworkHostInfo {

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_ip_list")

    private String bindIpList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connected_ip_list")

    private String connectedIpList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connected_number")

    private String connectedNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "embedder_dir")

    private String embedderDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Integer gid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_embedded")

    private Integer isEmbedded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_port_list")

    private String listenPortList;

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
    @JsonProperty(value = "uid")

    private String uid;

    public WebFrameworkHostInfo withAgentId(String agentId) {
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

    public WebFrameworkHostInfo withHostId(String hostId) {
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

    public WebFrameworkHostInfo withHostName(String hostName) {
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

    public WebFrameworkHostInfo withHostIp(String hostIp) {
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

    public WebFrameworkHostInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebFrameworkHostInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public WebFrameworkHostInfo withPath(String path) {
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

    public WebFrameworkHostInfo withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 大小
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public WebFrameworkHostInfo withRecordTime(Long recordTime) {
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

    public WebFrameworkHostInfo withBindIpList(String bindIpList) {
        this.bindIpList = bindIpList;
        return this;
    }

    /**
     * 绑定的ip列表
     * @return bindIpList
     */
    public String getBindIpList() {
        return bindIpList;
    }

    public void setBindIpList(String bindIpList) {
        this.bindIpList = bindIpList;
    }

    public WebFrameworkHostInfo withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * 软件的类型
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public WebFrameworkHostInfo withConnectedIpList(String connectedIpList) {
        this.connectedIpList = connectedIpList;
        return this;
    }

    /**
     * 连接的ip列表
     * @return connectedIpList
     */
    public String getConnectedIpList() {
        return connectedIpList;
    }

    public void setConnectedIpList(String connectedIpList) {
        this.connectedIpList = connectedIpList;
    }

    public WebFrameworkHostInfo withConnectedNumber(String connectedNumber) {
        this.connectedNumber = connectedNumber;
        return this;
    }

    /**
     * 连接数
     * @return connectedNumber
     */
    public String getConnectedNumber() {
        return connectedNumber;
    }

    public void setConnectedNumber(String connectedNumber) {
        this.connectedNumber = connectedNumber;
    }

    public WebFrameworkHostInfo withEmbedderDir(String embedderDir) {
        this.embedderDir = embedderDir;
        return this;
    }

    /**
     * 压缩的目录
     * @return embedderDir
     */
    public String getEmbedderDir() {
        return embedderDir;
    }

    public void setEmbedderDir(String embedderDir) {
        this.embedderDir = embedderDir;
    }

    public WebFrameworkHostInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public WebFrameworkHostInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public WebFrameworkHostInfo withGid(Integer gid) {
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

    public WebFrameworkHostInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 文件哈希值
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public WebFrameworkHostInfo withIsEmbedded(Integer isEmbedded) {
        this.isEmbedded = isEmbedded;
        return this;
    }

    /**
     * 是否是压缩的文件
     * @return isEmbedded
     */
    public Integer getIsEmbedded() {
        return isEmbedded;
    }

    public void setIsEmbedded(Integer isEmbedded) {
        this.isEmbedded = isEmbedded;
    }

    public WebFrameworkHostInfo withListenPortList(String listenPortList) {
        this.listenPortList = listenPortList;
        return this;
    }

    /**
     * 监听的端口列表
     * @return listenPortList
     */
    public String getListenPortList() {
        return listenPortList;
    }

    public void setListenPortList(String listenPortList) {
        this.listenPortList = listenPortList;
    }

    public WebFrameworkHostInfo withMode(String mode) {
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

    public WebFrameworkHostInfo withPid(Integer pid) {
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

    public WebFrameworkHostInfo withProcPath(String procPath) {
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

    public WebFrameworkHostInfo withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 用户id
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebFrameworkHostInfo that = (WebFrameworkHostInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.path, that.path) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.recordTime, that.recordTime) && Objects.equals(this.bindIpList, that.bindIpList)
            && Objects.equals(this.catalogue, that.catalogue)
            && Objects.equals(this.connectedIpList, that.connectedIpList)
            && Objects.equals(this.connectedNumber, that.connectedNumber)
            && Objects.equals(this.embedderDir, that.embedderDir) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.gid, that.gid)
            && Objects.equals(this.hash, that.hash) && Objects.equals(this.isEmbedded, that.isEmbedded)
            && Objects.equals(this.listenPortList, that.listenPortList) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.pid, that.pid) && Objects.equals(this.procPath, that.procPath)
            && Objects.equals(this.uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            name,
            version,
            path,
            fileSize,
            recordTime,
            bindIpList,
            catalogue,
            connectedIpList,
            connectedNumber,
            embedderDir,
            fileName,
            fileType,
            gid,
            hash,
            isEmbedded,
            listenPortList,
            mode,
            pid,
            procPath,
            uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebFrameworkHostInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    bindIpList: ").append(toIndentedString(bindIpList)).append("\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    connectedIpList: ").append(toIndentedString(connectedIpList)).append("\n");
        sb.append("    connectedNumber: ").append(toIndentedString(connectedNumber)).append("\n");
        sb.append("    embedderDir: ").append(toIndentedString(embedderDir)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
        sb.append("    listenPortList: ").append(toIndentedString(listenPortList)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    procPath: ").append(toIndentedString(procPath)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
