package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会议录制文件下载链接信息。
 */
public class RecordDownloadInfoBO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUuid")

    private String confUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<RecordDownloadUrlDO> urls = null;

    public RecordDownloadInfoBO withConfUuid(String confUuid) {
        this.confUuid = confUuid;
        return this;
    }

    /**
     * 会议UUID。
     * @return confUuid
     */
    public String getConfUuid() {
        return confUuid;
    }

    public void setConfUuid(String confUuid) {
        this.confUuid = confUuid;
    }

    public RecordDownloadInfoBO withUrls(List<RecordDownloadUrlDO> urls) {
        this.urls = urls;
        return this;
    }

    public RecordDownloadInfoBO addUrlsItem(RecordDownloadUrlDO urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public RecordDownloadInfoBO withUrls(Consumer<List<RecordDownloadUrlDO>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 下载链接信息。
     * @return urls
     */
    public List<RecordDownloadUrlDO> getUrls() {
        return urls;
    }

    public void setUrls(List<RecordDownloadUrlDO> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordDownloadInfoBO that = (RecordDownloadInfoBO) obj;
        return Objects.equals(this.confUuid, that.confUuid) && Objects.equals(this.urls, that.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUuid, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordDownloadInfoBO {\n");
        sb.append("    confUuid: ").append(toIndentedString(confUuid)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
