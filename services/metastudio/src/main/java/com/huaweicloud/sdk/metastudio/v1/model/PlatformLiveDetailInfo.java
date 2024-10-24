package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 平台直播信息
 */
public class PlatformLiveDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_id")

    private String platformId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_id")

    private String liveId;

    public PlatformLiveDetailInfo withPlatformId(String platformId) {
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

    public PlatformLiveDetailInfo withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 直播平台。美团填写meituan
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public PlatformLiveDetailInfo withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 授权账号信息。 美团平台对应：opBizCode
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public PlatformLiveDetailInfo withLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }

    /**
     * 直播ID。如果配置，则段落切换回调中会携带该信息。 美团对应liveId
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
        PlatformLiveDetailInfo that = (PlatformLiveDetailInfo) obj;
        return Objects.equals(this.platformId, that.platformId) && Objects.equals(this.platform, that.platform)
            && Objects.equals(this.account, that.account) && Objects.equals(this.liveId, that.liveId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformId, platform, account, liveId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlatformLiveDetailInfo {\n");
        sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
