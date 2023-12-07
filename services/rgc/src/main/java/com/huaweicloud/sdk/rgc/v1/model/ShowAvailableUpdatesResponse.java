package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAvailableUpdatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_update_available")

    private Boolean baselineUpdateAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_update_available")

    private Boolean controlUpdateAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "landing_zone_update_available")

    private Boolean landingZoneUpdateAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_landing_zone_version")

    private String serviceLandingZoneVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_landing_zone_version")

    private String userLandingZoneVersion;

    public ShowAvailableUpdatesResponse withBaselineUpdateAvailable(Boolean baselineUpdateAvailable) {
        this.baselineUpdateAvailable = baselineUpdateAvailable;
        return this;
    }

    /**
     * Landing Zone基础配置是否可用。
     * @return baselineUpdateAvailable
     */
    public Boolean getBaselineUpdateAvailable() {
        return baselineUpdateAvailable;
    }

    public void setBaselineUpdateAvailable(Boolean baselineUpdateAvailable) {
        this.baselineUpdateAvailable = baselineUpdateAvailable;
    }

    public ShowAvailableUpdatesResponse withControlUpdateAvailable(Boolean controlUpdateAvailable) {
        this.controlUpdateAvailable = controlUpdateAvailable;
        return this;
    }

    /**
     * 控制策略是否可用。
     * @return controlUpdateAvailable
     */
    public Boolean getControlUpdateAvailable() {
        return controlUpdateAvailable;
    }

    public void setControlUpdateAvailable(Boolean controlUpdateAvailable) {
        this.controlUpdateAvailable = controlUpdateAvailable;
    }

    public ShowAvailableUpdatesResponse withLandingZoneUpdateAvailable(Boolean landingZoneUpdateAvailable) {
        this.landingZoneUpdateAvailable = landingZoneUpdateAvailable;
        return this;
    }

    /**
     * Landing Zone是否可更新。
     * @return landingZoneUpdateAvailable
     */
    public Boolean getLandingZoneUpdateAvailable() {
        return landingZoneUpdateAvailable;
    }

    public void setLandingZoneUpdateAvailable(Boolean landingZoneUpdateAvailable) {
        this.landingZoneUpdateAvailable = landingZoneUpdateAvailable;
    }

    public ShowAvailableUpdatesResponse withServiceLandingZoneVersion(String serviceLandingZoneVersion) {
        this.serviceLandingZoneVersion = serviceLandingZoneVersion;
        return this;
    }

    /**
     * Landing Zone当前最新的版本号。
     * @return serviceLandingZoneVersion
     */
    public String getServiceLandingZoneVersion() {
        return serviceLandingZoneVersion;
    }

    public void setServiceLandingZoneVersion(String serviceLandingZoneVersion) {
        this.serviceLandingZoneVersion = serviceLandingZoneVersion;
    }

    public ShowAvailableUpdatesResponse withUserLandingZoneVersion(String userLandingZoneVersion) {
        this.userLandingZoneVersion = userLandingZoneVersion;
        return this;
    }

    /**
     * 用户当前的Landing Zone版本。
     * @return userLandingZoneVersion
     */
    public String getUserLandingZoneVersion() {
        return userLandingZoneVersion;
    }

    public void setUserLandingZoneVersion(String userLandingZoneVersion) {
        this.userLandingZoneVersion = userLandingZoneVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableUpdatesResponse that = (ShowAvailableUpdatesResponse) obj;
        return Objects.equals(this.baselineUpdateAvailable, that.baselineUpdateAvailable)
            && Objects.equals(this.controlUpdateAvailable, that.controlUpdateAvailable)
            && Objects.equals(this.landingZoneUpdateAvailable, that.landingZoneUpdateAvailable)
            && Objects.equals(this.serviceLandingZoneVersion, that.serviceLandingZoneVersion)
            && Objects.equals(this.userLandingZoneVersion, that.userLandingZoneVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineUpdateAvailable,
            controlUpdateAvailable,
            landingZoneUpdateAvailable,
            serviceLandingZoneVersion,
            userLandingZoneVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableUpdatesResponse {\n");
        sb.append("    baselineUpdateAvailable: ").append(toIndentedString(baselineUpdateAvailable)).append("\n");
        sb.append("    controlUpdateAvailable: ").append(toIndentedString(controlUpdateAvailable)).append("\n");
        sb.append("    landingZoneUpdateAvailable: ").append(toIndentedString(landingZoneUpdateAvailable)).append("\n");
        sb.append("    serviceLandingZoneVersion: ").append(toIndentedString(serviceLandingZoneVersion)).append("\n");
        sb.append("    userLandingZoneVersion: ").append(toIndentedString(userLandingZoneVersion)).append("\n");
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
