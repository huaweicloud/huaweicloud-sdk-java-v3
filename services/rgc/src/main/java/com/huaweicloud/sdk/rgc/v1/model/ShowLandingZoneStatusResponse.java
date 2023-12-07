package com.huaweicloud.sdk.rgc.v1.model;

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
public class ShowLandingZoneStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployed_version")

    private String deployedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "landing_zone_status")

    private String landingZoneStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_complete")

    private Integer percentageComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_details")

    private List<PercentageDetail> percentageDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "landing_zone_action_type")

    private String landingZoneActionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private List<LandingZoneErrorMessage> message = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<RegionConfigurationList> regions = null;

    public ShowLandingZoneStatusResponse withDeployedVersion(String deployedVersion) {
        this.deployedVersion = deployedVersion;
        return this;
    }

    /**
     * 部署的Landing Zone版本。
     * @return deployedVersion
     */
    public String getDeployedVersion() {
        return deployedVersion;
    }

    public void setDeployedVersion(String deployedVersion) {
        this.deployedVersion = deployedVersion;
    }

    public ShowLandingZoneStatusResponse withLandingZoneStatus(String landingZoneStatus) {
        this.landingZoneStatus = landingZoneStatus;
        return this;
    }

    /**
     * Landing Zone的设置状态，包括进行中，已完成。
     * @return landingZoneStatus
     */
    public String getLandingZoneStatus() {
        return landingZoneStatus;
    }

    public void setLandingZoneStatus(String landingZoneStatus) {
        this.landingZoneStatus = landingZoneStatus;
    }

    public ShowLandingZoneStatusResponse withPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    /**
     * LandingZone的完成进度。
     * minimum: 1
     * maximum: 100
     * @return percentageComplete
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    public ShowLandingZoneStatusResponse withPercentageDetails(List<PercentageDetail> percentageDetails) {
        this.percentageDetails = percentageDetails;
        return this;
    }

    public ShowLandingZoneStatusResponse addPercentageDetailsItem(PercentageDetail percentageDetailsItem) {
        if (this.percentageDetails == null) {
            this.percentageDetails = new ArrayList<>();
        }
        this.percentageDetails.add(percentageDetailsItem);
        return this;
    }

    public ShowLandingZoneStatusResponse withPercentageDetails(
        Consumer<List<PercentageDetail>> percentageDetailsSetter) {
        if (this.percentageDetails == null) {
            this.percentageDetails = new ArrayList<>();
        }
        percentageDetailsSetter.accept(this.percentageDetails);
        return this;
    }

    /**
     * Landing Zone设置的详细进度信息。
     * @return percentageDetails
     */
    public List<PercentageDetail> getPercentageDetails() {
        return percentageDetails;
    }

    public void setPercentageDetails(List<PercentageDetail> percentageDetails) {
        this.percentageDetails = percentageDetails;
    }

    public ShowLandingZoneStatusResponse withLandingZoneActionType(String landingZoneActionType) {
        this.landingZoneActionType = landingZoneActionType;
        return this;
    }

    /**
     * Landing Zone当前需要执行的动作。
     * @return landingZoneActionType
     */
    public String getLandingZoneActionType() {
        return landingZoneActionType;
    }

    public void setLandingZoneActionType(String landingZoneActionType) {
        this.landingZoneActionType = landingZoneActionType;
    }

    public ShowLandingZoneStatusResponse withMessage(List<LandingZoneErrorMessage> message) {
        this.message = message;
        return this;
    }

    public ShowLandingZoneStatusResponse addMessageItem(LandingZoneErrorMessage messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    public ShowLandingZoneStatusResponse withMessage(Consumer<List<LandingZoneErrorMessage>> messageSetter) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /**
     * Landing Zone错误消息。
     * @return message
     */
    public List<LandingZoneErrorMessage> getMessage() {
        return message;
    }

    public void setMessage(List<LandingZoneErrorMessage> message) {
        this.message = message;
    }

    public ShowLandingZoneStatusResponse withRegions(List<RegionConfigurationList> regions) {
        this.regions = regions;
        return this;
    }

    public ShowLandingZoneStatusResponse addRegionsItem(RegionConfigurationList regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowLandingZoneStatusResponse withRegions(Consumer<List<RegionConfigurationList>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 纳管的区域信息。
     * @return regions
     */
    public List<RegionConfigurationList> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionConfigurationList> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLandingZoneStatusResponse that = (ShowLandingZoneStatusResponse) obj;
        return Objects.equals(this.deployedVersion, that.deployedVersion)
            && Objects.equals(this.landingZoneStatus, that.landingZoneStatus)
            && Objects.equals(this.percentageComplete, that.percentageComplete)
            && Objects.equals(this.percentageDetails, that.percentageDetails)
            && Objects.equals(this.landingZoneActionType, that.landingZoneActionType)
            && Objects.equals(this.message, that.message) && Objects.equals(this.regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployedVersion,
            landingZoneStatus,
            percentageComplete,
            percentageDetails,
            landingZoneActionType,
            message,
            regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLandingZoneStatusResponse {\n");
        sb.append("    deployedVersion: ").append(toIndentedString(deployedVersion)).append("\n");
        sb.append("    landingZoneStatus: ").append(toIndentedString(landingZoneStatus)).append("\n");
        sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
        sb.append("    percentageDetails: ").append(toIndentedString(percentageDetails)).append("\n");
        sb.append("    landingZoneActionType: ").append(toIndentedString(landingZoneActionType)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
