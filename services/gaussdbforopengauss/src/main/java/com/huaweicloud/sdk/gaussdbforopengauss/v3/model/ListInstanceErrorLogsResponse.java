package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceErrorLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_files")

    private List<InstanceLogFile> logFiles = null;

    public ListInstanceErrorLogsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceErrorLogsResponse withLogFiles(List<InstanceLogFile> logFiles) {
        this.logFiles = logFiles;
        return this;
    }

    public ListInstanceErrorLogsResponse addLogFilesItem(InstanceLogFile logFilesItem) {
        if (this.logFiles == null) {
            this.logFiles = new ArrayList<>();
        }
        this.logFiles.add(logFilesItem);
        return this;
    }

    public ListInstanceErrorLogsResponse withLogFiles(Consumer<List<InstanceLogFile>> logFilesSetter) {
        if (this.logFiles == null) {
            this.logFiles = new ArrayList<>();
        }
        logFilesSetter.accept(this.logFiles);
        return this;
    }

    /**
     * 日志文件列表
     * @return logFiles
     */
    public List<InstanceLogFile> getLogFiles() {
        return logFiles;
    }

    public void setLogFiles(List<InstanceLogFile> logFiles) {
        this.logFiles = logFiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceErrorLogsResponse that = (ListInstanceErrorLogsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.logFiles, that.logFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, logFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceErrorLogsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    logFiles: ").append(toIndentedString(logFiles)).append("\n");
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
