package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DownloadOnlineDdlTaskLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_link")

    private String downloadLink;

    public DownloadOnlineDdlTaskLogResponse withDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }

    /**
     * **参数解释**：  下载实例无锁变更任务日志的链接。  **取值范围**：   不涉及。
     * @return downloadLink
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadOnlineDdlTaskLogResponse that = (DownloadOnlineDdlTaskLogResponse) obj;
        return Objects.equals(this.downloadLink, that.downloadLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadOnlineDdlTaskLogResponse {\n");
        sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
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
