package com.huaweicloud.sdk.ges.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 点数据
 */
public class SchemaPath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause")

    private String cause;

    public SchemaPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * OBS文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SchemaPath withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * OBS文件导入日志存储文件
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public SchemaPath withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * - OBS文件导入状态。 - success：完全成功 - failed：完全失败 - partFailed：部分成功
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SchemaPath withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * 导入失败原因
     * @return cause
     */
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchemaPath that = (SchemaPath) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.log, that.log)
            && Objects.equals(this.status, that.status) && Objects.equals(this.cause, that.cause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, log, status, cause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaPath {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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
