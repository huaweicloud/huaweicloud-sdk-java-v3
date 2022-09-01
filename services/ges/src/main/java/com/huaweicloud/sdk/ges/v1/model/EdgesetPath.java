package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 边数据
 */
public class EdgesetPath  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    @JacksonXmlProperty(localName = "path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log")
    
    @JacksonXmlProperty(localName = "log")
    
    private String log;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    @JacksonXmlProperty(localName = "status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cause")
    
    @JacksonXmlProperty(localName = "cause")
    
    private String cause;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="totalLines")
    
    @JacksonXmlProperty(localName = "totalLines")
    
    private Long totalLines;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failedLines")
    
    @JacksonXmlProperty(localName = "failedLines")
    
    private Long failedLines;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="successfulLines")
    
    @JacksonXmlProperty(localName = "successfulLines")
    
    private Long successfulLines;

    public EdgesetPath withPath(String path) {
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

    

    public EdgesetPath withLog(String log) {
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

    

    public EdgesetPath withStatus(String status) {
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

    

    public EdgesetPath withCause(String cause) {
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

    

    public EdgesetPath withTotalLines(Long totalLines) {
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

    

    public EdgesetPath withFailedLines(Long failedLines) {
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

    

    public EdgesetPath withSuccessfulLines(Long successfulLines) {
        this.successfulLines = successfulLines;
        return this;
    }

    


    /**
     * 导出成功行数。其值为-1时表示当前版本没有返回该字段。
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
        EdgesetPath edgesetPath = (EdgesetPath) o;
        return Objects.equals(this.path, edgesetPath.path) &&
            Objects.equals(this.log, edgesetPath.log) &&
            Objects.equals(this.status, edgesetPath.status) &&
            Objects.equals(this.cause, edgesetPath.cause) &&
            Objects.equals(this.totalLines, edgesetPath.totalLines) &&
            Objects.equals(this.failedLines, edgesetPath.failedLines) &&
            Objects.equals(this.successfulLines, edgesetPath.successfulLines);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, log, status, cause, totalLines, failedLines, successfulLines);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgesetPath {\n");
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

