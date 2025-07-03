package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowShareFeatureGatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_experience")

    private Boolean enableExperience;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hss_service")

    private Boolean enableHssService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_image_scan")

    private Boolean enableImageScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_sm3")

    private Boolean enableSm3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_image_sync")

    private Boolean enableImageSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_cci_service")

    private Boolean enableCciService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_image_label")

    private Boolean enableImageLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_pipeline")

    private Boolean enablePipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_list_v3")

    private Boolean enableListV3;

    public ShowShareFeatureGatesResponse withEnableExperience(Boolean enableExperience) {
        this.enableExperience = enableExperience;
        return this;
    }

    /**
     * 是否支持体验馆
     * @return enableExperience
     */
    public Boolean getEnableExperience() {
        return enableExperience;
    }

    public void setEnableExperience(Boolean enableExperience) {
        this.enableExperience = enableExperience;
    }

    public ShowShareFeatureGatesResponse withEnableHssService(Boolean enableHssService) {
        this.enableHssService = enableHssService;
        return this;
    }

    /**
     * 是否支持对接hss服务
     * @return enableHssService
     */
    public Boolean getEnableHssService() {
        return enableHssService;
    }

    public void setEnableHssService(Boolean enableHssService) {
        this.enableHssService = enableHssService;
    }

    public ShowShareFeatureGatesResponse withEnableImageScan(Boolean enableImageScan) {
        this.enableImageScan = enableImageScan;
        return this;
    }

    /**
     * 是否支持镜像扫描
     * @return enableImageScan
     */
    public Boolean getEnableImageScan() {
        return enableImageScan;
    }

    public void setEnableImageScan(Boolean enableImageScan) {
        this.enableImageScan = enableImageScan;
    }

    public ShowShareFeatureGatesResponse withEnableSm3(Boolean enableSm3) {
        this.enableSm3 = enableSm3;
        return this;
    }

    /**
     * 是否支持国密场景
     * @return enableSm3
     */
    public Boolean getEnableSm3() {
        return enableSm3;
    }

    public void setEnableSm3(Boolean enableSm3) {
        this.enableSm3 = enableSm3;
    }

    public ShowShareFeatureGatesResponse withEnableImageSync(Boolean enableImageSync) {
        this.enableImageSync = enableImageSync;
        return this;
    }

    /**
     * 是否支持镜像同步
     * @return enableImageSync
     */
    public Boolean getEnableImageSync() {
        return enableImageSync;
    }

    public void setEnableImageSync(Boolean enableImageSync) {
        this.enableImageSync = enableImageSync;
    }

    public ShowShareFeatureGatesResponse withEnableCciService(Boolean enableCciService) {
        this.enableCciService = enableCciService;
        return this;
    }

    /**
     * 是否支持对接cci服务
     * @return enableCciService
     */
    public Boolean getEnableCciService() {
        return enableCciService;
    }

    public void setEnableCciService(Boolean enableCciService) {
        this.enableCciService = enableCciService;
    }

    public ShowShareFeatureGatesResponse withEnableImageLabel(Boolean enableImageLabel) {
        this.enableImageLabel = enableImageLabel;
        return this;
    }

    /**
     * 是否支持镜像标签
     * @return enableImageLabel
     */
    public Boolean getEnableImageLabel() {
        return enableImageLabel;
    }

    public void setEnableImageLabel(Boolean enableImageLabel) {
        this.enableImageLabel = enableImageLabel;
    }

    public ShowShareFeatureGatesResponse withEnablePipeline(Boolean enablePipeline) {
        this.enablePipeline = enablePipeline;
        return this;
    }

    /**
     * 是否支持流水线服务
     * @return enablePipeline
     */
    public Boolean getEnablePipeline() {
        return enablePipeline;
    }

    public void setEnablePipeline(Boolean enablePipeline) {
        this.enablePipeline = enablePipeline;
    }

    public ShowShareFeatureGatesResponse withEnableListV3(Boolean enableListV3) {
        this.enableListV3 = enableListV3;
        return this;
    }

    /**
     * 是否支持list v3接口
     * @return enableListV3
     */
    public Boolean getEnableListV3() {
        return enableListV3;
    }

    public void setEnableListV3(Boolean enableListV3) {
        this.enableListV3 = enableListV3;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShareFeatureGatesResponse that = (ShowShareFeatureGatesResponse) obj;
        return Objects.equals(this.enableExperience, that.enableExperience)
            && Objects.equals(this.enableHssService, that.enableHssService)
            && Objects.equals(this.enableImageScan, that.enableImageScan)
            && Objects.equals(this.enableSm3, that.enableSm3)
            && Objects.equals(this.enableImageSync, that.enableImageSync)
            && Objects.equals(this.enableCciService, that.enableCciService)
            && Objects.equals(this.enableImageLabel, that.enableImageLabel)
            && Objects.equals(this.enablePipeline, that.enablePipeline)
            && Objects.equals(this.enableListV3, that.enableListV3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableExperience,
            enableHssService,
            enableImageScan,
            enableSm3,
            enableImageSync,
            enableCciService,
            enableImageLabel,
            enablePipeline,
            enableListV3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShareFeatureGatesResponse {\n");
        sb.append("    enableExperience: ").append(toIndentedString(enableExperience)).append("\n");
        sb.append("    enableHssService: ").append(toIndentedString(enableHssService)).append("\n");
        sb.append("    enableImageScan: ").append(toIndentedString(enableImageScan)).append("\n");
        sb.append("    enableSm3: ").append(toIndentedString(enableSm3)).append("\n");
        sb.append("    enableImageSync: ").append(toIndentedString(enableImageSync)).append("\n");
        sb.append("    enableCciService: ").append(toIndentedString(enableCciService)).append("\n");
        sb.append("    enableImageLabel: ").append(toIndentedString(enableImageLabel)).append("\n");
        sb.append("    enablePipeline: ").append(toIndentedString(enablePipeline)).append("\n");
        sb.append("    enableListV3: ").append(toIndentedString(enableListV3)).append("\n");
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
