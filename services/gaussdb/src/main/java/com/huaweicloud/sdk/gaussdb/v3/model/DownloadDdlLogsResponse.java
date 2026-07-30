package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class DownloadDdlLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_files")

    private List<DownLoadFileInfoItem> downloadFiles = null;

    public DownloadDdlLogsResponse withDownloadFiles(List<DownLoadFileInfoItem> downloadFiles) {
        this.downloadFiles = downloadFiles;
        return this;
    }

    public DownloadDdlLogsResponse addDownloadFilesItem(DownLoadFileInfoItem downloadFilesItem) {
        if (this.downloadFiles == null) {
            this.downloadFiles = new ArrayList<>();
        }
        this.downloadFiles.add(downloadFilesItem);
        return this;
    }

    public DownloadDdlLogsResponse withDownloadFiles(Consumer<List<DownLoadFileInfoItem>> downloadFilesSetter) {
        if (this.downloadFiles == null) {
            this.downloadFiles = new ArrayList<>();
        }
        downloadFilesSetter.accept(this.downloadFiles);
        return this;
    }

    /**
     * **参数解释**：  每个日志文件的下载链接详情。  **取值范围**：  不涉及。 
     * @return downloadFiles
     */
    public List<DownLoadFileInfoItem> getDownloadFiles() {
        return downloadFiles;
    }

    public void setDownloadFiles(List<DownLoadFileInfoItem> downloadFiles) {
        this.downloadFiles = downloadFiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadDdlLogsResponse that = (DownloadDdlLogsResponse) obj;
        return Objects.equals(this.downloadFiles, that.downloadFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadDdlLogsResponse {\n");
        sb.append("    downloadFiles: ").append(toIndentedString(downloadFiles)).append("\n");
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
