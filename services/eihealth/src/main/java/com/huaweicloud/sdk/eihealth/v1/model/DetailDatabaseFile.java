package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库数据文件详情
 */
public class DetailDatabaseFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private DatabaseFileSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public DetailDatabaseFile withSource(DatabaseFileSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public DatabaseFileSource getSource() {
        return source;
    }

    public void setSource(DatabaseFileSource source) {
        this.source = source;
    }

    public DetailDatabaseFile withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 文件URL，用户私有数据中心为项目路径、公共数据场景为obs地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DetailDatabaseFile withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 数据库文件所在项目id，仅文件为数据中心时填写
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public DetailDatabaseFile withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据库文件写入状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DetailDatabaseFile withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetailDatabaseFile that = (DetailDatabaseFile) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.url, that.url)
            && Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failedReason, that.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, url, eihealthProjectId, status, failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailDatabaseFile {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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
