package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IAC安全扫描任务的参数，任务类型task_type为“iac_scan”时可传
 */
public class ListTasksRequestBodyIacScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    public ListTasksRequestBodyIacScanInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型，包含如下   - dockerfile：Dockerfile文件   - k8s_yaml：k8s yaml文件
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequestBodyIacScanInfo that = (ListTasksRequestBodyIacScanInfo) obj;
        return Objects.equals(this.fileType, that.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequestBodyIacScanInfo {\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
