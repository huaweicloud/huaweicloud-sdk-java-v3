package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分页相关参数，自2.3.11版本起导出图默认分页导出。
 */
public class ExportGraphReqPaginate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_count_per_file")

    private Integer rowCountPerFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_thread")

    private Integer numThread;

    public ExportGraphReqPaginate withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启分页，默认为true，不需要开启分页时，需显示声明为false。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ExportGraphReqPaginate withRowCountPerFile(Integer rowCountPerFile) {
        this.rowCountPerFile = rowCountPerFile;
        return this;
    }

    /**
     * 按页导出时，每个文件最大行数，默认10000000。
     * @return rowCountPerFile
     */
    public Integer getRowCountPerFile() {
        return rowCountPerFile;
    }

    public void setRowCountPerFile(Integer rowCountPerFile) {
        this.rowCountPerFile = rowCountPerFile;
    }

    public ExportGraphReqPaginate withNumThread(Integer numThread) {
        this.numThread = numThread;
        return this;
    }

    /**
     * 按页导出时，并行线程数，默认为8。
     * @return numThread
     */
    public Integer getNumThread() {
        return numThread;
    }

    public void setNumThread(Integer numThread) {
        this.numThread = numThread;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportGraphReqPaginate that = (ExportGraphReqPaginate) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.rowCountPerFile, that.rowCountPerFile)
            && Objects.equals(this.numThread, that.numThread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, rowCountPerFile, numThread);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportGraphReqPaginate {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    rowCountPerFile: ").append(toIndentedString(rowCountPerFile)).append("\n");
        sb.append("    numThread: ").append(toIndentedString(numThread)).append("\n");
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
