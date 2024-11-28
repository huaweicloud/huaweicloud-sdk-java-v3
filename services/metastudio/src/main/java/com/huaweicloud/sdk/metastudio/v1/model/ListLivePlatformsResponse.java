package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListLivePlatformsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_platforms")

    private List<LivePlatformInfo> livePlatforms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListLivePlatformsResponse withLivePlatforms(List<LivePlatformInfo> livePlatforms) {
        this.livePlatforms = livePlatforms;
        return this;
    }

    public ListLivePlatformsResponse addLivePlatformsItem(LivePlatformInfo livePlatformsItem) {
        if (this.livePlatforms == null) {
            this.livePlatforms = new ArrayList<>();
        }
        this.livePlatforms.add(livePlatformsItem);
        return this;
    }

    public ListLivePlatformsResponse withLivePlatforms(Consumer<List<LivePlatformInfo>> livePlatformsSetter) {
        if (this.livePlatforms == null) {
            this.livePlatforms = new ArrayList<>();
        }
        livePlatformsSetter.accept(this.livePlatforms);
        return this;
    }

    /**
     * 直播平台列表
     * @return livePlatforms
     */
    public List<LivePlatformInfo> getLivePlatforms() {
        return livePlatforms;
    }

    public void setLivePlatforms(List<LivePlatformInfo> livePlatforms) {
        this.livePlatforms = livePlatforms;
    }

    public ListLivePlatformsResponse withXRequestId(String xRequestId) {
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
        ListLivePlatformsResponse that = (ListLivePlatformsResponse) obj;
        return Objects.equals(this.livePlatforms, that.livePlatforms)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livePlatforms, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLivePlatformsResponse {\n");
        sb.append("    livePlatforms: ").append(toIndentedString(livePlatforms)).append("\n");
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
