package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VodInfoV2
 */
public class VodInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_url")

    private String playUrl;

    public VodInfoV2 withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * VOD媒资id
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public VodInfoV2 withPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }

    /**
     * 点播播放地址
     * @return playUrl
     */
    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VodInfoV2 vodInfoV2 = (VodInfoV2) o;
        return Objects.equals(this.assetId, vodInfoV2.assetId) && Objects.equals(this.playUrl, vodInfoV2.playUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, playUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VodInfoV2 {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    playUrl: ").append(toIndentedString(playUrl)).append("\n");
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
