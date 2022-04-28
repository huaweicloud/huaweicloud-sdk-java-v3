package com.huaweicloud.sdk.dli.v1.model;

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
public class ExportFlinkJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zip_file")

    private List<String> zipFile = null;

    public ExportFlinkJobResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ExportFlinkJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExportFlinkJobResponse withZipFile(List<String> zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    public ExportFlinkJobResponse addZipFileItem(String zipFileItem) {
        if (this.zipFile == null) {
            this.zipFile = new ArrayList<>();
        }
        this.zipFile.add(zipFileItem);
        return this;
    }

    public ExportFlinkJobResponse withZipFile(Consumer<List<String>> zipFileSetter) {
        if (this.zipFile == null) {
            this.zipFile = new ArrayList<>();
        }
        zipFileSetter.accept(this.zipFile);
        return this;
    }

    /**
     * OBS上导出作业zip文件名。
     * @return zipFile
     */
    public List<String> getZipFile() {
        return zipFile;
    }

    public void setZipFile(List<String> zipFile) {
        this.zipFile = zipFile;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportFlinkJobResponse exportFlinkJobResponse = (ExportFlinkJobResponse) o;
        return Objects.equals(this.isSuccess, exportFlinkJobResponse.isSuccess)
            && Objects.equals(this.message, exportFlinkJobResponse.message)
            && Objects.equals(this.zipFile, exportFlinkJobResponse.zipFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, zipFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFlinkJobResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    zipFile: ").append(toIndentedString(zipFile)).append("\n");
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
