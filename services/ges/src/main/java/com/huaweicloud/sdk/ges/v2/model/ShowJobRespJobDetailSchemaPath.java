package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowJobRespJobDetailSchemaPath
 */
public class ShowJobRespJobDetailSchemaPath  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log")
    
    
    private String log;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cause")
    
    
    private String cause;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_lines")
    
    
    private Long totalLines;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_lines")
    
    
    private Long failedLines;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="successful_lines")
    
    
    private Long successfulLines;

    public ShowJobRespJobDetailSchemaPath withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * OBS文件路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public ShowJobRespJobDetailSchemaPath withLog(String log) {
        this.log = log;
        return this;
    }

    


    /**
     * OBS文件导入日志存储文件。
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    

    public ShowJobRespJobDetailSchemaPath withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * OBS文件导入状态。  - success：完全成功 - failed：完全失败 - partFailed：部分成功
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ShowJobRespJobDetailSchemaPath withCause(String cause) {
        this.cause = cause;
        return this;
    }

    


    /**
     * 导入失败原因。
     * @return cause
     */
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    

    public ShowJobRespJobDetailSchemaPath withTotalLines(Long totalLines) {
        this.totalLines = totalLines;
        return this;
    }

    


    /**
     * 导入总行数。其值为-1时表示当前版本没有返回该字段。
     * @return totalLines
     */
    public Long getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(Long totalLines) {
        this.totalLines = totalLines;
    }

    

    public ShowJobRespJobDetailSchemaPath withFailedLines(Long failedLines) {
        this.failedLines = failedLines;
        return this;
    }

    


    /**
     * 导入失败行数。其值为-1时表示当前版本没有返回该字段。
     * @return failedLines
     */
    public Long getFailedLines() {
        return failedLines;
    }

    public void setFailedLines(Long failedLines) {
        this.failedLines = failedLines;
    }

    

    public ShowJobRespJobDetailSchemaPath withSuccessfulLines(Long successfulLines) {
        this.successfulLines = successfulLines;
        return this;
    }

    


    /**
     * 导入成功行数。其值为-1时表示当前版本没有返回该字段。
     * @return successfulLines
     */
    public Long getSuccessfulLines() {
        return successfulLines;
    }

    public void setSuccessfulLines(Long successfulLines) {
        this.successfulLines = successfulLines;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobRespJobDetailSchemaPath showJobRespJobDetailSchemaPath = (ShowJobRespJobDetailSchemaPath) o;
        return Objects.equals(this.path, showJobRespJobDetailSchemaPath.path) &&
            Objects.equals(this.log, showJobRespJobDetailSchemaPath.log) &&
            Objects.equals(this.status, showJobRespJobDetailSchemaPath.status) &&
            Objects.equals(this.cause, showJobRespJobDetailSchemaPath.cause) &&
            Objects.equals(this.totalLines, showJobRespJobDetailSchemaPath.totalLines) &&
            Objects.equals(this.failedLines, showJobRespJobDetailSchemaPath.failedLines) &&
            Objects.equals(this.successfulLines, showJobRespJobDetailSchemaPath.successfulLines);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, log, status, cause, totalLines, failedLines, successfulLines);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobRespJobDetailSchemaPath {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    totalLines: ").append(toIndentedString(totalLines)).append("\n");
        sb.append("    failedLines: ").append(toIndentedString(failedLines)).append("\n");
        sb.append("    successfulLines: ").append(toIndentedString(successfulLines)).append("\n");
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

