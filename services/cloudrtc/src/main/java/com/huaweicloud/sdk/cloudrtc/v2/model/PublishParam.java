package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转推参数
 */
public class PublishParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmp_urls")

    @JacksonXmlProperty(localName = "rtmp_urls")

    private List<String> rtmpUrls = null;

    public PublishParam withRtmpUrls(List<String> rtmpUrls) {
        this.rtmpUrls = rtmpUrls;
        return this;
    }

    public PublishParam addRtmpUrlsItem(String rtmpUrlsItem) {
        if (this.rtmpUrls == null) {
            this.rtmpUrls = new ArrayList<>();
        }
        this.rtmpUrls.add(rtmpUrlsItem);
        return this;
    }

    public PublishParam withRtmpUrls(Consumer<List<String>> rtmpUrlsSetter) {
        if (this.rtmpUrls == null) {
            this.rtmpUrls = new ArrayList<>();
        }
        rtmpUrlsSetter.accept(this.rtmpUrls);
        return this;
    }

    /**
     * 合流任务完成后，转推的RTMP推流地址。
     * @return rtmpUrls
     */
    public List<String> getRtmpUrls() {
        return rtmpUrls;
    }

    public void setRtmpUrls(List<String> rtmpUrls) {
        this.rtmpUrls = rtmpUrls;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishParam publishParam = (PublishParam) o;
        return Objects.equals(this.rtmpUrls, publishParam.rtmpUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rtmpUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishParam {\n");
        sb.append("    rtmpUrls: ").append(toIndentedString(rtmpUrls)).append("\n");
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
