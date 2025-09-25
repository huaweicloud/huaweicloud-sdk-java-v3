package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWelfareAreaInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_info")

    private HttpWelfareInfoResponseInfoHotInfo hotInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_update_info")

    private HttpWelfareInfoResponseInfoVersionUpdateInfo versionUpdateInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activities_info")

    private HttpWelfareInfoResponseInfoActivitiesInfo activitiesInfo;

    public ShowWelfareAreaInfoResponse withHotInfo(HttpWelfareInfoResponseInfoHotInfo hotInfo) {
        this.hotInfo = hotInfo;
        return this;
    }

    public ShowWelfareAreaInfoResponse withHotInfo(Consumer<HttpWelfareInfoResponseInfoHotInfo> hotInfoSetter) {
        if (this.hotInfo == null) {
            this.hotInfo = new HttpWelfareInfoResponseInfoHotInfo();
            hotInfoSetter.accept(this.hotInfo);
        }

        return this;
    }

    /**
     * Get hotInfo
     * @return hotInfo
     */
    public HttpWelfareInfoResponseInfoHotInfo getHotInfo() {
        return hotInfo;
    }

    public void setHotInfo(HttpWelfareInfoResponseInfoHotInfo hotInfo) {
        this.hotInfo = hotInfo;
    }

    public ShowWelfareAreaInfoResponse withVersionUpdateInfo(
        HttpWelfareInfoResponseInfoVersionUpdateInfo versionUpdateInfo) {
        this.versionUpdateInfo = versionUpdateInfo;
        return this;
    }

    public ShowWelfareAreaInfoResponse withVersionUpdateInfo(
        Consumer<HttpWelfareInfoResponseInfoVersionUpdateInfo> versionUpdateInfoSetter) {
        if (this.versionUpdateInfo == null) {
            this.versionUpdateInfo = new HttpWelfareInfoResponseInfoVersionUpdateInfo();
            versionUpdateInfoSetter.accept(this.versionUpdateInfo);
        }

        return this;
    }

    /**
     * Get versionUpdateInfo
     * @return versionUpdateInfo
     */
    public HttpWelfareInfoResponseInfoVersionUpdateInfo getVersionUpdateInfo() {
        return versionUpdateInfo;
    }

    public void setVersionUpdateInfo(HttpWelfareInfoResponseInfoVersionUpdateInfo versionUpdateInfo) {
        this.versionUpdateInfo = versionUpdateInfo;
    }

    public ShowWelfareAreaInfoResponse withActivitiesInfo(HttpWelfareInfoResponseInfoActivitiesInfo activitiesInfo) {
        this.activitiesInfo = activitiesInfo;
        return this;
    }

    public ShowWelfareAreaInfoResponse withActivitiesInfo(
        Consumer<HttpWelfareInfoResponseInfoActivitiesInfo> activitiesInfoSetter) {
        if (this.activitiesInfo == null) {
            this.activitiesInfo = new HttpWelfareInfoResponseInfoActivitiesInfo();
            activitiesInfoSetter.accept(this.activitiesInfo);
        }

        return this;
    }

    /**
     * Get activitiesInfo
     * @return activitiesInfo
     */
    public HttpWelfareInfoResponseInfoActivitiesInfo getActivitiesInfo() {
        return activitiesInfo;
    }

    public void setActivitiesInfo(HttpWelfareInfoResponseInfoActivitiesInfo activitiesInfo) {
        this.activitiesInfo = activitiesInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWelfareAreaInfoResponse that = (ShowWelfareAreaInfoResponse) obj;
        return Objects.equals(this.hotInfo, that.hotInfo)
            && Objects.equals(this.versionUpdateInfo, that.versionUpdateInfo)
            && Objects.equals(this.activitiesInfo, that.activitiesInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotInfo, versionUpdateInfo, activitiesInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWelfareAreaInfoResponse {\n");
        sb.append("    hotInfo: ").append(toIndentedString(hotInfo)).append("\n");
        sb.append("    versionUpdateInfo: ").append(toIndentedString(versionUpdateInfo)).append("\n");
        sb.append("    activitiesInfo: ").append(toIndentedString(activitiesInfo)).append("\n");
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
