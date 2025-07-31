package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivilegedProcessResponseInfo
 */
public class PrivilegedProcessResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_file_path")

    private String processFilePath;

    public PrivilegedProcessResponseInfo withProcessFilePath(String processFilePath) {
        this.processFilePath = processFilePath;
        return this;
    }

    /**
     * 特权进程文件路径
     * @return processFilePath
     */
    public String getProcessFilePath() {
        return processFilePath;
    }

    public void setProcessFilePath(String processFilePath) {
        this.processFilePath = processFilePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivilegedProcessResponseInfo that = (PrivilegedProcessResponseInfo) obj;
        return Objects.equals(this.processFilePath, that.processFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processFilePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegedProcessResponseInfo {\n");
        sb.append("    processFilePath: ").append(toIndentedString(processFilePath)).append("\n");
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
