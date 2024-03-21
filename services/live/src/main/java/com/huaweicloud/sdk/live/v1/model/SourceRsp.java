package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RTMP推流地址。只有频道入流协议为RTMP_PUSH时，会返回RTMP推流地址
 */
public class SourceRsp {

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

    public SourceRsp withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * RTMP推流地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SourceRsp withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 码率。  单位：bps。取值范围：0 - 104,857,600（100Mbps）
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

    public SourceRsp withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 分辨率对应宽的值。取值范围：0 - 4096（4K）
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

    public SourceRsp withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 分辨率对应高的值。取值范围：0 - 2160（4K）
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

    public SourceRsp withEnableSnapshot(Boolean enableSnapshot) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceRsp that = (SourceRsp) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.bitrate, that.bitrate)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.enableSnapshot, that.enableSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, bitrate, width, height, enableSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceRsp {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    enableSnapshot: ").append(toIndentedString(enableSnapshot)).append("\n");
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
