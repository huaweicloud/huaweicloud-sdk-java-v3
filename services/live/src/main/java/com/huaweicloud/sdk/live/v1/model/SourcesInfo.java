package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主入流信息
 */
public class SourcesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_snapshot")

    private Boolean enableSnapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate_for3u8")

    private Boolean bitrateFor3u8;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passphrase")

    private String passphrase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_urls")

    private List<String> backupUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private Integer latency;

    public SourcesInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 频道源流URL，用于外部拉流
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SourcesInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 码率。无需直播转码时，此参数为必填项  单位：bps。取值范围：(0,104,857,600]（100Mbps）
     * minimum: 0
     * maximum: 104857600
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public SourcesInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 分辨率对应宽的值，非必填项  取值范围：0 - 4096（4K）
     * minimum: 0
     * maximum: 4096
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public SourcesInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 分辨率对应高的值，非必填项  取值范围：0 - 2160（4K）
     * minimum: 0
     * maximum: 2160
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public SourcesInfo withEnableSnapshot(Boolean enableSnapshot) {
        this.enableSnapshot = enableSnapshot;
        return this;
    }

    /**
     * 描述是否使用该流做截图
     * @return enableSnapshot
     */
    public Boolean getEnableSnapshot() {
        return enableSnapshot;
    }

    public void setEnableSnapshot(Boolean enableSnapshot) {
        this.enableSnapshot = enableSnapshot;
    }

    public SourcesInfo withBitrateFor3u8(Boolean bitrateFor3u8) {
        this.bitrateFor3u8 = bitrateFor3u8;
        return this;
    }

    /**
     * 是否使用bitrate来固定码率。默认值：false
     * @return bitrateFor3u8
     */
    public Boolean getBitrateFor3u8() {
        return bitrateFor3u8;
    }

    public void setBitrateFor3u8(Boolean bitrateFor3u8) {
        this.bitrateFor3u8 = bitrateFor3u8;
    }

    public SourcesInfo withPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    /**
     * 协议为SRT_PUSH时的加密信息
     * @return passphrase
     */
    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public SourcesInfo withBackupUrls(List<String> backupUrls) {
        this.backupUrls = backupUrls;
        return this;
    }

    public SourcesInfo addBackupUrlsItem(String backupUrlsItem) {
        if (this.backupUrls == null) {
            this.backupUrls = new ArrayList<>();
        }
        this.backupUrls.add(backupUrlsItem);
        return this;
    }

    public SourcesInfo withBackupUrls(Consumer<List<String>> backupUrlsSetter) {
        if (this.backupUrls == null) {
            this.backupUrls = new ArrayList<>();
        }
        backupUrlsSetter.accept(this.backupUrls);
        return this;
    }

    /**
     * 备入流地址列表
     * @return backupUrls
     */
    public List<String> getBackupUrls() {
        return backupUrls;
    }

    public void setBackupUrls(List<String> backupUrls) {
        this.backupUrls = backupUrls;
    }

    public SourcesInfo withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * 频道为SRT_PULL类型时，拉流地址的Stream ID。
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public SourcesInfo withLatency(Integer latency) {
        this.latency = latency;
        return this;
    }

    /**
     * 频道为SRT_PULL类型时的拉流时延。
     * @return latency
     */
    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourcesInfo that = (SourcesInfo) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.bitrate, that.bitrate)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.enableSnapshot, that.enableSnapshot)
            && Objects.equals(this.bitrateFor3u8, that.bitrateFor3u8)
            && Objects.equals(this.passphrase, that.passphrase) && Objects.equals(this.backupUrls, that.backupUrls)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.latency, that.latency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url,
            bitrate,
            width,
            height,
            enableSnapshot,
            bitrateFor3u8,
            passphrase,
            backupUrls,
            streamId,
            latency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourcesInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    enableSnapshot: ").append(toIndentedString(enableSnapshot)).append("\n");
        sb.append("    bitrateFor3u8: ").append(toIndentedString(bitrateFor3u8)).append("\n");
        sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
        sb.append("    backupUrls: ").append(toIndentedString(backupUrls)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
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
