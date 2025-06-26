package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Subtask
 */
public class Subtask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Integer jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private String repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_text")

    private String statusText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_time")

    private String opTime;

    public Subtask withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 子任务ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subtask withJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 内部任务ID
     * @return jobId
     */
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Subtask withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间名
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Subtask withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * 制品仓库
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public Subtask withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 制品版本
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Subtask withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * sha256值
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Subtask withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 老化动作， DEL
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Subtask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，Initialized、Pending、InProgress、Succeed、Failed、Stopped
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Subtask withStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    /**
     * 状态信息
     * @return statusText
     */
    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Subtask withOpTime(String opTime) {
        this.opTime = opTime;
        return this;
    }

    /**
     * 开始时间
     * @return opTime
     */
    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Subtask that = (Subtask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.repository, that.repository)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.digest, that.digest)
            && Objects.equals(this.action, that.action) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusText, that.statusText) && Objects.equals(this.opTime, that.opTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobId, namespace, repository, tag, digest, action, status, statusText, opTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subtask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
        sb.append("    opTime: ").append(toIndentedString(opTime)).append("\n");
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
