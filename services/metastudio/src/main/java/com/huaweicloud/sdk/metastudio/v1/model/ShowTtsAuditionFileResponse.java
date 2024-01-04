package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowTtsAuditionFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_file_complete")

    private Boolean isFileComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<AuditionFile> files = null;

    public ShowTtsAuditionFileResponse withIsFileComplete(Boolean isFileComplete) {
        this.isFileComplete = isFileComplete;
        return this;
    }

    /**
     * 试听文件是否已生成完成。该标记为false时，应该每隔5秒再次调用本接口获取试听文件。
     * @return isFileComplete
     */
    public Boolean getIsFileComplete() {
        return isFileComplete;
    }

    public void setIsFileComplete(Boolean isFileComplete) {
        this.isFileComplete = isFileComplete;
    }

    public ShowTtsAuditionFileResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 异常信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowTtsAuditionFileResponse withFiles(List<AuditionFile> files) {
        this.files = files;
        return this;
    }

    public ShowTtsAuditionFileResponse addFilesItem(AuditionFile filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ShowTtsAuditionFileResponse withFiles(Consumer<List<AuditionFile>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 试听文件列表。
     * @return files
     */
    public List<AuditionFile> getFiles() {
        return files;
    }

    public void setFiles(List<AuditionFile> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTtsAuditionFileResponse that = (ShowTtsAuditionFileResponse) obj;
        return Objects.equals(this.isFileComplete, that.isFileComplete) && Objects.equals(this.message, that.message)
            && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFileComplete, message, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTtsAuditionFileResponse {\n");
        sb.append("    isFileComplete: ").append(toIndentedString(isFileComplete)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
