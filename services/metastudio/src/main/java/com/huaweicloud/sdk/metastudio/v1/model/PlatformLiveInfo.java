package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 平台直播信息
 */
public class PlatformLiveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_id")

    private String platformId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_id")

    private String liveId;

    public PlatformLiveInfo withPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    /**
     * 直播平台ID。
     * @return platformId
     */
    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public PlatformLiveInfo withLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }

    /**
     * 直播ID。如果配置，则段落切换回调中会携带该信息。只能包含英文、数字、-、_。 美团对应liveId
     * @return liveId
     */
    public String getLiveId() {
        return liveId;
    }

    public void setLiveId(String liveId) {
        this.liveId = liveId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlatformLiveInfo that = (PlatformLiveInfo) obj;
        return Objects.equals(this.platformId, that.platformId) && Objects.equals(this.liveId, that.liveId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformId, liveId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlatformLiveInfo {\n");
        sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
        sb.append("    liveId: ").append(toIndentedString(liveId)).append("\n");
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
