package com.huaweicloud.sdk.cph.v1.model;

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
public class ListShareAppsSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private String collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_apps")

    private List<ListShareAppsSnapshotResponseBodyShareApps> shareApps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo;

    public ListShareAppsSnapshotResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListShareAppsSnapshotResponse withCollectTime(String collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间。
     * @return collectTime
     */
    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public ListShareAppsSnapshotResponse withShareApps(List<ListShareAppsSnapshotResponseBodyShareApps> shareApps) {
        this.shareApps = shareApps;
        return this;
    }

    public ListShareAppsSnapshotResponse addShareAppsItem(ListShareAppsSnapshotResponseBodyShareApps shareAppsItem) {
        if (this.shareApps == null) {
            this.shareApps = new ArrayList<>();
        }
        this.shareApps.add(shareAppsItem);
        return this;
    }

    public ListShareAppsSnapshotResponse withShareApps(
        Consumer<List<ListShareAppsSnapshotResponseBodyShareApps>> shareAppsSetter) {
        if (this.shareApps == null) {
            this.shareApps = new ArrayList<>();
        }
        shareAppsSetter.accept(this.shareApps);
        return this;
    }

    /**
     * 采集的共享应用信息
     * @return shareApps
     */
    public List<ListShareAppsSnapshotResponseBodyShareApps> getShareApps() {
        return shareApps;
    }

    public void setShareApps(List<ListShareAppsSnapshotResponseBodyShareApps> shareApps) {
        this.shareApps = shareApps;
    }

    public ListShareAppsSnapshotResponse withPageInfo(
        ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListShareAppsSnapshotResponse withPageInfo(
        Consumer<ListCloudPhoneServersModelOfferingsResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListCloudPhoneServersModelOfferingsResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListCloudPhoneServersModelOfferingsResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListShareAppsSnapshotResponse that = (ListShareAppsSnapshotResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.shareApps, that.shareApps) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, collectTime, shareApps, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareAppsSnapshotResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    shareApps: ").append(toIndentedString(shareApps)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
