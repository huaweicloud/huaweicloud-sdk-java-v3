package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自适应流控控制选项。
 */
public class PoliciesDisplayAdaptiveBitrateControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_bandwidth_suppression_enable")

    private Boolean peakBandwidthSuppressionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_average_network_latency")

    private Integer expectedAverageNetworkLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_latency_threshold1")

    private Integer networkLatencyThreshold1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_latency_threshold2")

    private Integer networkLatencyThreshold2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_dynamic_frame_rate")

    private Integer minDynamicFrameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_dynamic_frame_rate_lv1")

    private Integer minDynamicFrameRateLv1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_dynamic_frame_rate_lv2")

    private Integer minDynamicFrameRateLv2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtt_threshold")

    private Integer rttThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_add_framerate")

    private Integer minAddFramerate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_add_framerate")

    private Integer maxAddFramerate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_framerate")

    private Integer subFramerate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_bandwidth_lower_limit")

    private Integer adaptiveBandwidthLowerLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_compression_quality_lower_limit")

    private Integer adaptiveCompressionQualityLowerLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_compression_quality_upper_limit")

    private Integer adaptiveCompressionQualityUpperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_compression_quality_increase_limit")

    private Integer adaptiveCompressionQualityIncreaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_compression_quality_decrease_limit")

    private Integer adaptiveCompressionQualityDecreaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_average_quality_lower_limit")

    private Integer adaptiveAverageQualityLowerLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_average_quality_upper_limit")

    private Integer adaptiveAverageQualityUpperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_average_quality_increase_limit")

    private Integer adaptiveAverageQualityIncreaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_average_quality_decrease_limit")

    private Integer adaptiveAverageQualityDecreaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_min_quality_lower_limit")

    private Integer adaptiveMinQualityLowerLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_min_quality_upper_limit")

    private Integer adaptiveMinQualityUpperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_min_quality_increase_limit")

    private Integer adaptiveMinQualityIncreaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptive_min_quality_decrease_limit")

    private Integer adaptiveMinQualityDecreaseLimit;

    public PoliciesDisplayAdaptiveBitrateControlOptions withPeakBandwidthSuppressionEnable(
        Boolean peakBandwidthSuppressionEnable) {
        this.peakBandwidthSuppressionEnable = peakBandwidthSuppressionEnable;
        return this;
    }

    /**
     * 峰值带宽抑制：取值为： false：表示关闭。 true：表示开启。
     * @return peakBandwidthSuppressionEnable
     */
    public Boolean getPeakBandwidthSuppressionEnable() {
        return peakBandwidthSuppressionEnable;
    }

    public void setPeakBandwidthSuppressionEnable(Boolean peakBandwidthSuppressionEnable) {
        this.peakBandwidthSuppressionEnable = peakBandwidthSuppressionEnable;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withExpectedAverageNetworkLatency(
        Integer expectedAverageNetworkLatency) {
        this.expectedAverageNetworkLatency = expectedAverageNetworkLatency;
        return this;
    }

    /**
     * 网络平均期望延时。取值范围为[1-2000]。默认：160。
     * minimum: 1
     * maximum: 2000
     * @return expectedAverageNetworkLatency
     */
    public Integer getExpectedAverageNetworkLatency() {
        return expectedAverageNetworkLatency;
    }

    public void setExpectedAverageNetworkLatency(Integer expectedAverageNetworkLatency) {
        this.expectedAverageNetworkLatency = expectedAverageNetworkLatency;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withNetworkLatencyThreshold1(Integer networkLatencyThreshold1) {
        this.networkLatencyThreshold1 = networkLatencyThreshold1;
        return this;
    }

    /**
     * 网络延时阈值1（ms）。取值范围为[1-2000]。默认：160。
     * minimum: 1
     * maximum: 2000
     * @return networkLatencyThreshold1
     */
    public Integer getNetworkLatencyThreshold1() {
        return networkLatencyThreshold1;
    }

    public void setNetworkLatencyThreshold1(Integer networkLatencyThreshold1) {
        this.networkLatencyThreshold1 = networkLatencyThreshold1;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withNetworkLatencyThreshold2(Integer networkLatencyThreshold2) {
        this.networkLatencyThreshold2 = networkLatencyThreshold2;
        return this;
    }

    /**
     * 网络延时阈值2（ms）。取值范围为[1-2000]。默认：300。
     * minimum: 1
     * maximum: 2000
     * @return networkLatencyThreshold2
     */
    public Integer getNetworkLatencyThreshold2() {
        return networkLatencyThreshold2;
    }

    public void setNetworkLatencyThreshold2(Integer networkLatencyThreshold2) {
        this.networkLatencyThreshold2 = networkLatencyThreshold2;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withMinDynamicFrameRate(Integer minDynamicFrameRate) {
        this.minDynamicFrameRate = minDynamicFrameRate;
        return this;
    }

    /**
     * 最小动态帧率（fps）。取值范围为[1-60]。默认：17。
     * minimum: 1
     * maximum: 60
     * @return minDynamicFrameRate
     */
    public Integer getMinDynamicFrameRate() {
        return minDynamicFrameRate;
    }

    public void setMinDynamicFrameRate(Integer minDynamicFrameRate) {
        this.minDynamicFrameRate = minDynamicFrameRate;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withMinDynamicFrameRateLv1(Integer minDynamicFrameRateLv1) {
        this.minDynamicFrameRateLv1 = minDynamicFrameRateLv1;
        return this;
    }

    /**
     * 最小动态帧率Lv1（fps）。取值范围为[1-60]。默认：17。
     * minimum: 1
     * maximum: 60
     * @return minDynamicFrameRateLv1
     */
    public Integer getMinDynamicFrameRateLv1() {
        return minDynamicFrameRateLv1;
    }

    public void setMinDynamicFrameRateLv1(Integer minDynamicFrameRateLv1) {
        this.minDynamicFrameRateLv1 = minDynamicFrameRateLv1;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withMinDynamicFrameRateLv2(Integer minDynamicFrameRateLv2) {
        this.minDynamicFrameRateLv2 = minDynamicFrameRateLv2;
        return this;
    }

    /**
     * 最小动态帧率Lv2（fps）。取值范围为[1-60]。默认：10。
     * minimum: 1
     * maximum: 60
     * @return minDynamicFrameRateLv2
     */
    public Integer getMinDynamicFrameRateLv2() {
        return minDynamicFrameRateLv2;
    }

    public void setMinDynamicFrameRateLv2(Integer minDynamicFrameRateLv2) {
        this.minDynamicFrameRateLv2 = minDynamicFrameRateLv2;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withRttThreshold(Integer rttThreshold) {
        this.rttThreshold = rttThreshold;
        return this;
    }

    /**
     * 帧率控制参数1。取值范围为[0-1000]。默认：20。
     * minimum: 0
     * maximum: 1000
     * @return rttThreshold
     */
    public Integer getRttThreshold() {
        return rttThreshold;
    }

    public void setRttThreshold(Integer rttThreshold) {
        this.rttThreshold = rttThreshold;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withMinAddFramerate(Integer minAddFramerate) {
        this.minAddFramerate = minAddFramerate;
        return this;
    }

    /**
     * 帧率控制参数2。取值范围为[0-120]。默认：8。
     * minimum: 0
     * maximum: 120
     * @return minAddFramerate
     */
    public Integer getMinAddFramerate() {
        return minAddFramerate;
    }

    public void setMinAddFramerate(Integer minAddFramerate) {
        this.minAddFramerate = minAddFramerate;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withMaxAddFramerate(Integer maxAddFramerate) {
        this.maxAddFramerate = maxAddFramerate;
        return this;
    }

    /**
     * 帧率控制参数3。取值范围为[0-120]。默认：20。
     * minimum: 0
     * maximum: 120
     * @return maxAddFramerate
     */
    public Integer getMaxAddFramerate() {
        return maxAddFramerate;
    }

    public void setMaxAddFramerate(Integer maxAddFramerate) {
        this.maxAddFramerate = maxAddFramerate;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withSubFramerate(Integer subFramerate) {
        this.subFramerate = subFramerate;
        return this;
    }

    /**
     * 帧率控制参数4。取值范围为[0-120]。默认：25。
     * minimum: 0
     * maximum: 120
     * @return subFramerate
     */
    public Integer getSubFramerate() {
        return subFramerate;
    }

    public void setSubFramerate(Integer subFramerate) {
        this.subFramerate = subFramerate;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveBandwidthLowerLimit(
        Integer adaptiveBandwidthLowerLimit) {
        this.adaptiveBandwidthLowerLimit = adaptiveBandwidthLowerLimit;
        return this;
    }

    /**
     * 自适应带宽下限。取值范围为[100-20000]。默认：500。
     * minimum: 100
     * maximum: 20000
     * @return adaptiveBandwidthLowerLimit
     */
    public Integer getAdaptiveBandwidthLowerLimit() {
        return adaptiveBandwidthLowerLimit;
    }

    public void setAdaptiveBandwidthLowerLimit(Integer adaptiveBandwidthLowerLimit) {
        this.adaptiveBandwidthLowerLimit = adaptiveBandwidthLowerLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveCompressionQualityLowerLimit(
        Integer adaptiveCompressionQualityLowerLimit) {
        this.adaptiveCompressionQualityLowerLimit = adaptiveCompressionQualityLowerLimit;
        return this;
    }

    /**
     * 自适应有损压缩质量下限。取值范围为[1-100]。默认：60。
     * minimum: 1
     * maximum: 100
     * @return adaptiveCompressionQualityLowerLimit
     */
    public Integer getAdaptiveCompressionQualityLowerLimit() {
        return adaptiveCompressionQualityLowerLimit;
    }

    public void setAdaptiveCompressionQualityLowerLimit(Integer adaptiveCompressionQualityLowerLimit) {
        this.adaptiveCompressionQualityLowerLimit = adaptiveCompressionQualityLowerLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveCompressionQualityUpperLimit(
        Integer adaptiveCompressionQualityUpperLimit) {
        this.adaptiveCompressionQualityUpperLimit = adaptiveCompressionQualityUpperLimit;
        return this;
    }

    /**
     * 自适应有损压缩质量上限。取值范围为[1-100]。默认：85。
     * minimum: 1
     * maximum: 100
     * @return adaptiveCompressionQualityUpperLimit
     */
    public Integer getAdaptiveCompressionQualityUpperLimit() {
        return adaptiveCompressionQualityUpperLimit;
    }

    public void setAdaptiveCompressionQualityUpperLimit(Integer adaptiveCompressionQualityUpperLimit) {
        this.adaptiveCompressionQualityUpperLimit = adaptiveCompressionQualityUpperLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveCompressionQualityIncreaseLimit(
        Integer adaptiveCompressionQualityIncreaseLimit) {
        this.adaptiveCompressionQualityIncreaseLimit = adaptiveCompressionQualityIncreaseLimit;
        return this;
    }

    /**
     * 自适应有损压缩质量增限。取值范围为[1-100]。默认：5。
     * minimum: 1
     * maximum: 100
     * @return adaptiveCompressionQualityIncreaseLimit
     */
    public Integer getAdaptiveCompressionQualityIncreaseLimit() {
        return adaptiveCompressionQualityIncreaseLimit;
    }

    public void setAdaptiveCompressionQualityIncreaseLimit(Integer adaptiveCompressionQualityIncreaseLimit) {
        this.adaptiveCompressionQualityIncreaseLimit = adaptiveCompressionQualityIncreaseLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveCompressionQualityDecreaseLimit(
        Integer adaptiveCompressionQualityDecreaseLimit) {
        this.adaptiveCompressionQualityDecreaseLimit = adaptiveCompressionQualityDecreaseLimit;
        return this;
    }

    /**
     * 自适应有损压缩质量减限。取值范围为[1-100]。默认：10。
     * minimum: 1
     * maximum: 100
     * @return adaptiveCompressionQualityDecreaseLimit
     */
    public Integer getAdaptiveCompressionQualityDecreaseLimit() {
        return adaptiveCompressionQualityDecreaseLimit;
    }

    public void setAdaptiveCompressionQualityDecreaseLimit(Integer adaptiveCompressionQualityDecreaseLimit) {
        this.adaptiveCompressionQualityDecreaseLimit = adaptiveCompressionQualityDecreaseLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveAverageQualityLowerLimit(
        Integer adaptiveAverageQualityLowerLimit) {
        this.adaptiveAverageQualityLowerLimit = adaptiveAverageQualityLowerLimit;
        return this;
    }

    /**
     * 自适应视频平均质量下限。取值范围为[5-50]。默认：15。
     * minimum: 5
     * maximum: 50
     * @return adaptiveAverageQualityLowerLimit
     */
    public Integer getAdaptiveAverageQualityLowerLimit() {
        return adaptiveAverageQualityLowerLimit;
    }

    public void setAdaptiveAverageQualityLowerLimit(Integer adaptiveAverageQualityLowerLimit) {
        this.adaptiveAverageQualityLowerLimit = adaptiveAverageQualityLowerLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveAverageQualityUpperLimit(
        Integer adaptiveAverageQualityUpperLimit) {
        this.adaptiveAverageQualityUpperLimit = adaptiveAverageQualityUpperLimit;
        return this;
    }

    /**
     * 自适应视频平均质量上限。取值范围为[5-50]。默认：25。
     * minimum: 5
     * maximum: 50
     * @return adaptiveAverageQualityUpperLimit
     */
    public Integer getAdaptiveAverageQualityUpperLimit() {
        return adaptiveAverageQualityUpperLimit;
    }

    public void setAdaptiveAverageQualityUpperLimit(Integer adaptiveAverageQualityUpperLimit) {
        this.adaptiveAverageQualityUpperLimit = adaptiveAverageQualityUpperLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveAverageQualityIncreaseLimit(
        Integer adaptiveAverageQualityIncreaseLimit) {
        this.adaptiveAverageQualityIncreaseLimit = adaptiveAverageQualityIncreaseLimit;
        return this;
    }

    /**
     * 自适应视频平均质量增限。取值范围为[1-50]。默认：3。
     * minimum: 1
     * maximum: 50
     * @return adaptiveAverageQualityIncreaseLimit
     */
    public Integer getAdaptiveAverageQualityIncreaseLimit() {
        return adaptiveAverageQualityIncreaseLimit;
    }

    public void setAdaptiveAverageQualityIncreaseLimit(Integer adaptiveAverageQualityIncreaseLimit) {
        this.adaptiveAverageQualityIncreaseLimit = adaptiveAverageQualityIncreaseLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveAverageQualityDecreaseLimit(
        Integer adaptiveAverageQualityDecreaseLimit) {
        this.adaptiveAverageQualityDecreaseLimit = adaptiveAverageQualityDecreaseLimit;
        return this;
    }

    /**
     * 自适应视频平均质量减限。取值范围为[1-50]。默认：1。
     * minimum: 1
     * maximum: 50
     * @return adaptiveAverageQualityDecreaseLimit
     */
    public Integer getAdaptiveAverageQualityDecreaseLimit() {
        return adaptiveAverageQualityDecreaseLimit;
    }

    public void setAdaptiveAverageQualityDecreaseLimit(Integer adaptiveAverageQualityDecreaseLimit) {
        this.adaptiveAverageQualityDecreaseLimit = adaptiveAverageQualityDecreaseLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveMinQualityLowerLimit(
        Integer adaptiveMinQualityLowerLimit) {
        this.adaptiveMinQualityLowerLimit = adaptiveMinQualityLowerLimit;
        return this;
    }

    /**
     * 自适应视频最低质量下限。取值范围为[5-69]。默认：25。
     * minimum: 5
     * maximum: 69
     * @return adaptiveMinQualityLowerLimit
     */
    public Integer getAdaptiveMinQualityLowerLimit() {
        return adaptiveMinQualityLowerLimit;
    }

    public void setAdaptiveMinQualityLowerLimit(Integer adaptiveMinQualityLowerLimit) {
        this.adaptiveMinQualityLowerLimit = adaptiveMinQualityLowerLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveMinQualityUpperLimit(
        Integer adaptiveMinQualityUpperLimit) {
        this.adaptiveMinQualityUpperLimit = adaptiveMinQualityUpperLimit;
        return this;
    }

    /**
     * 自适应视频最低质量上限。取值范围为[5-69]。默认：30。
     * minimum: 5
     * maximum: 69
     * @return adaptiveMinQualityUpperLimit
     */
    public Integer getAdaptiveMinQualityUpperLimit() {
        return adaptiveMinQualityUpperLimit;
    }

    public void setAdaptiveMinQualityUpperLimit(Integer adaptiveMinQualityUpperLimit) {
        this.adaptiveMinQualityUpperLimit = adaptiveMinQualityUpperLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveMinQualityIncreaseLimit(
        Integer adaptiveMinQualityIncreaseLimit) {
        this.adaptiveMinQualityIncreaseLimit = adaptiveMinQualityIncreaseLimit;
        return this;
    }

    /**
     * 自适应视频最低质量增限。取值范围为[1-50]。默认：3。
     * minimum: 1
     * maximum: 50
     * @return adaptiveMinQualityIncreaseLimit
     */
    public Integer getAdaptiveMinQualityIncreaseLimit() {
        return adaptiveMinQualityIncreaseLimit;
    }

    public void setAdaptiveMinQualityIncreaseLimit(Integer adaptiveMinQualityIncreaseLimit) {
        this.adaptiveMinQualityIncreaseLimit = adaptiveMinQualityIncreaseLimit;
    }

    public PoliciesDisplayAdaptiveBitrateControlOptions withAdaptiveMinQualityDecreaseLimit(
        Integer adaptiveMinQualityDecreaseLimit) {
        this.adaptiveMinQualityDecreaseLimit = adaptiveMinQualityDecreaseLimit;
        return this;
    }

    /**
     * 自适应视频最低质量减限。取值范围为[1-50]。默认：1。
     * minimum: 1
     * maximum: 50
     * @return adaptiveMinQualityDecreaseLimit
     */
    public Integer getAdaptiveMinQualityDecreaseLimit() {
        return adaptiveMinQualityDecreaseLimit;
    }

    public void setAdaptiveMinQualityDecreaseLimit(Integer adaptiveMinQualityDecreaseLimit) {
        this.adaptiveMinQualityDecreaseLimit = adaptiveMinQualityDecreaseLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDisplayAdaptiveBitrateControlOptions that = (PoliciesDisplayAdaptiveBitrateControlOptions) obj;
        return Objects.equals(this.peakBandwidthSuppressionEnable, that.peakBandwidthSuppressionEnable)
            && Objects.equals(this.expectedAverageNetworkLatency, that.expectedAverageNetworkLatency)
            && Objects.equals(this.networkLatencyThreshold1, that.networkLatencyThreshold1)
            && Objects.equals(this.networkLatencyThreshold2, that.networkLatencyThreshold2)
            && Objects.equals(this.minDynamicFrameRate, that.minDynamicFrameRate)
            && Objects.equals(this.minDynamicFrameRateLv1, that.minDynamicFrameRateLv1)
            && Objects.equals(this.minDynamicFrameRateLv2, that.minDynamicFrameRateLv2)
            && Objects.equals(this.rttThreshold, that.rttThreshold)
            && Objects.equals(this.minAddFramerate, that.minAddFramerate)
            && Objects.equals(this.maxAddFramerate, that.maxAddFramerate)
            && Objects.equals(this.subFramerate, that.subFramerate)
            && Objects.equals(this.adaptiveBandwidthLowerLimit, that.adaptiveBandwidthLowerLimit)
            && Objects.equals(this.adaptiveCompressionQualityLowerLimit, that.adaptiveCompressionQualityLowerLimit)
            && Objects.equals(this.adaptiveCompressionQualityUpperLimit, that.adaptiveCompressionQualityUpperLimit)
            && Objects.equals(this.adaptiveCompressionQualityIncreaseLimit,
                that.adaptiveCompressionQualityIncreaseLimit)
            && Objects.equals(this.adaptiveCompressionQualityDecreaseLimit,
                that.adaptiveCompressionQualityDecreaseLimit)
            && Objects.equals(this.adaptiveAverageQualityLowerLimit, that.adaptiveAverageQualityLowerLimit)
            && Objects.equals(this.adaptiveAverageQualityUpperLimit, that.adaptiveAverageQualityUpperLimit)
            && Objects.equals(this.adaptiveAverageQualityIncreaseLimit, that.adaptiveAverageQualityIncreaseLimit)
            && Objects.equals(this.adaptiveAverageQualityDecreaseLimit, that.adaptiveAverageQualityDecreaseLimit)
            && Objects.equals(this.adaptiveMinQualityLowerLimit, that.adaptiveMinQualityLowerLimit)
            && Objects.equals(this.adaptiveMinQualityUpperLimit, that.adaptiveMinQualityUpperLimit)
            && Objects.equals(this.adaptiveMinQualityIncreaseLimit, that.adaptiveMinQualityIncreaseLimit)
            && Objects.equals(this.adaptiveMinQualityDecreaseLimit, that.adaptiveMinQualityDecreaseLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peakBandwidthSuppressionEnable,
            expectedAverageNetworkLatency,
            networkLatencyThreshold1,
            networkLatencyThreshold2,
            minDynamicFrameRate,
            minDynamicFrameRateLv1,
            minDynamicFrameRateLv2,
            rttThreshold,
            minAddFramerate,
            maxAddFramerate,
            subFramerate,
            adaptiveBandwidthLowerLimit,
            adaptiveCompressionQualityLowerLimit,
            adaptiveCompressionQualityUpperLimit,
            adaptiveCompressionQualityIncreaseLimit,
            adaptiveCompressionQualityDecreaseLimit,
            adaptiveAverageQualityLowerLimit,
            adaptiveAverageQualityUpperLimit,
            adaptiveAverageQualityIncreaseLimit,
            adaptiveAverageQualityDecreaseLimit,
            adaptiveMinQualityLowerLimit,
            adaptiveMinQualityUpperLimit,
            adaptiveMinQualityIncreaseLimit,
            adaptiveMinQualityDecreaseLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDisplayAdaptiveBitrateControlOptions {\n");
        sb.append("    peakBandwidthSuppressionEnable: ")
            .append(toIndentedString(peakBandwidthSuppressionEnable))
            .append("\n");
        sb.append("    expectedAverageNetworkLatency: ")
            .append(toIndentedString(expectedAverageNetworkLatency))
            .append("\n");
        sb.append("    networkLatencyThreshold1: ").append(toIndentedString(networkLatencyThreshold1)).append("\n");
        sb.append("    networkLatencyThreshold2: ").append(toIndentedString(networkLatencyThreshold2)).append("\n");
        sb.append("    minDynamicFrameRate: ").append(toIndentedString(minDynamicFrameRate)).append("\n");
        sb.append("    minDynamicFrameRateLv1: ").append(toIndentedString(minDynamicFrameRateLv1)).append("\n");
        sb.append("    minDynamicFrameRateLv2: ").append(toIndentedString(minDynamicFrameRateLv2)).append("\n");
        sb.append("    rttThreshold: ").append(toIndentedString(rttThreshold)).append("\n");
        sb.append("    minAddFramerate: ").append(toIndentedString(minAddFramerate)).append("\n");
        sb.append("    maxAddFramerate: ").append(toIndentedString(maxAddFramerate)).append("\n");
        sb.append("    subFramerate: ").append(toIndentedString(subFramerate)).append("\n");
        sb.append("    adaptiveBandwidthLowerLimit: ")
            .append(toIndentedString(adaptiveBandwidthLowerLimit))
            .append("\n");
        sb.append("    adaptiveCompressionQualityLowerLimit: ")
            .append(toIndentedString(adaptiveCompressionQualityLowerLimit))
            .append("\n");
        sb.append("    adaptiveCompressionQualityUpperLimit: ")
            .append(toIndentedString(adaptiveCompressionQualityUpperLimit))
            .append("\n");
        sb.append("    adaptiveCompressionQualityIncreaseLimit: ")
            .append(toIndentedString(adaptiveCompressionQualityIncreaseLimit))
            .append("\n");
        sb.append("    adaptiveCompressionQualityDecreaseLimit: ")
            .append(toIndentedString(adaptiveCompressionQualityDecreaseLimit))
            .append("\n");
        sb.append("    adaptiveAverageQualityLowerLimit: ")
            .append(toIndentedString(adaptiveAverageQualityLowerLimit))
            .append("\n");
        sb.append("    adaptiveAverageQualityUpperLimit: ")
            .append(toIndentedString(adaptiveAverageQualityUpperLimit))
            .append("\n");
        sb.append("    adaptiveAverageQualityIncreaseLimit: ")
            .append(toIndentedString(adaptiveAverageQualityIncreaseLimit))
            .append("\n");
        sb.append("    adaptiveAverageQualityDecreaseLimit: ")
            .append(toIndentedString(adaptiveAverageQualityDecreaseLimit))
            .append("\n");
        sb.append("    adaptiveMinQualityLowerLimit: ")
            .append(toIndentedString(adaptiveMinQualityLowerLimit))
            .append("\n");
        sb.append("    adaptiveMinQualityUpperLimit: ")
            .append(toIndentedString(adaptiveMinQualityUpperLimit))
            .append("\n");
        sb.append("    adaptiveMinQualityIncreaseLimit: ")
            .append(toIndentedString(adaptiveMinQualityIncreaseLimit))
            .append("\n");
        sb.append("    adaptiveMinQualityDecreaseLimit: ")
            .append(toIndentedString(adaptiveMinQualityDecreaseLimit))
            .append("\n");
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
