package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作详情信息
 */
public class EventDetailRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_attr")

    private String fileAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_ip")

    private String loginIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user_name")

    private String loginUserName;

    public EventDetailRequestInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * Agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public EventDetailRequestInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * 进程id
     * minimum: 0
     * maximum: 2147483647
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public EventDetailRequestInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * 文件哈希
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public EventDetailRequestInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public EventDetailRequestInfo withFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
        return this;
    }

    /**
     * 文件属性
     * @return fileAttr
     */
    public String getFileAttr() {
        return fileAttr;
    }

    public void setFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
    }

    public EventDetailRequestInfo withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 告警事件关键字，仅用于告警白名单
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public EventDetailRequestInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 告警事件hash，仅用于告警白名单
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public EventDetailRequestInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public EventDetailRequestInfo withLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    /**
     * 登录源IP
     * @return loginIp
     */
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public EventDetailRequestInfo withLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
        return this;
    }

    /**
     * 登录用户名
     * @return loginUserName
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventDetailRequestInfo eventDetailRequestInfo = (EventDetailRequestInfo) o;
        return Objects.equals(this.agentId, eventDetailRequestInfo.agentId)
            && Objects.equals(this.processPid, eventDetailRequestInfo.processPid)
            && Objects.equals(this.fileHash, eventDetailRequestInfo.fileHash)
            && Objects.equals(this.filePath, eventDetailRequestInfo.filePath)
            && Objects.equals(this.fileAttr, eventDetailRequestInfo.fileAttr)
            && Objects.equals(this.keyword, eventDetailRequestInfo.keyword)
            && Objects.equals(this.hash, eventDetailRequestInfo.hash)
            && Objects.equals(this.privateIp, eventDetailRequestInfo.privateIp)
            && Objects.equals(this.loginIp, eventDetailRequestInfo.loginIp)
            && Objects.equals(this.loginUserName, eventDetailRequestInfo.loginUserName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(agentId, processPid, fileHash, filePath, fileAttr, keyword, hash, privateIp, loginIp, loginUserName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventDetailRequestInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileAttr: ").append(toIndentedString(fileAttr)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
        sb.append("    loginUserName: ").append(toIndentedString(loginUserName)).append("\n");
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
