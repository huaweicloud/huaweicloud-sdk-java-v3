package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AssetDailySummaryResult
 */
public class AssetDailySummaryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    public AssetDailySummaryResult withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 播放日期，格式为：yyyyMMdd000000。 
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AssetDailySummaryResult withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 日播放统计数据文件的下载地址，有效期为12个小时。  文件内容格式：[域名]\\t[媒资ID]\\t[日期]\\t[播放流量]\\t[播放次数]  播放次数统计说明： - HLS文件：访问M3U8文件时会统计播放次数，访问TS文件时不会统计播放次数。 - 其它文件：如MP4文件，当播放请求带有range且range的start参数不等于0时，不统计播放次数。其它情况下，会统计播放次数。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetDailySummaryResult that = (AssetDailySummaryResult) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetDailySummaryResult {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
