package com.huaweicloud.sdk.live.v1.model;

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
public class ListGeoBlockingConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domain")

    private String playDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<GeoBlockingConfigInfo> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListGeoBlockingConfigResponse withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * 直播播放域名
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    public ListGeoBlockingConfigResponse withApps(List<GeoBlockingConfigInfo> apps) {
        this.apps = apps;
        return this;
    }

    public ListGeoBlockingConfigResponse addAppsItem(GeoBlockingConfigInfo appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public ListGeoBlockingConfigResponse withApps(Consumer<List<GeoBlockingConfigInfo>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 应用列表
     * @return apps
     */
    public List<GeoBlockingConfigInfo> getApps() {
        return apps;
    }

    public void setApps(List<GeoBlockingConfigInfo> apps) {
        this.apps = apps;
    }

    public ListGeoBlockingConfigResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGeoBlockingConfigResponse that = (ListGeoBlockingConfigResponse) obj;
        return Objects.equals(this.playDomain, that.playDomain) && Objects.equals(this.apps, that.apps)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomain, apps, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGeoBlockingConfigResponse {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
