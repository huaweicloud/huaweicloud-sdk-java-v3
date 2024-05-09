package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMolBatchDownloadTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filename")

    private String filename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_dir")

    private String outDir;

    public ShowMolBatchDownloadTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态：WAITING、RUNNING、FINISHED、CANCELLED、ABNORMAL、FAILED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowMolBatchDownloadTaskResponse withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * 下载文件名
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ShowMolBatchDownloadTaskResponse withOutDir(String outDir) {
        this.outDir = outDir;
        return this;
    }

    /**
     * 下载路径
     * @return outDir
     */
    public String getOutDir() {
        return outDir;
    }

    public void setOutDir(String outDir) {
        this.outDir = outDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMolBatchDownloadTaskResponse that = (ShowMolBatchDownloadTaskResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.filename, that.filename)
            && Objects.equals(this.outDir, that.outDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, filename, outDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMolBatchDownloadTaskResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    outDir: ").append(toIndentedString(outDir)).append("\n");
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
