package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流控控制项。
 */
public class FileRedirectionOptionsFluidControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "good_network_latency")

    private Integer goodNetworkLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_network_latency")

    private Integer normalNetworkLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poor_network_latency")

    private Integer poorNetworkLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reducing_step")

    private Integer reducingStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_increasing_step")

    private Integer slowIncreasingStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quick_increasing_step")

    private Integer quickIncreasingStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_speed")

    private Integer startSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_block_size")

    private Integer testBlockSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_time_gap")

    private Integer testTimeGap;

    public FileRedirectionOptionsFluidControlOptions withGoodNetworkLatency(Integer goodNetworkLatency) {
        this.goodNetworkLatency = goodNetworkLatency;
        return this;
    }

    /**
     * 网络优的延时阈值（ms）。取值范围为[1-1000]。默认：30。
     * minimum: 1
     * maximum: 1000
     * @return goodNetworkLatency
     */
    public Integer getGoodNetworkLatency() {
        return goodNetworkLatency;
    }

    public void setGoodNetworkLatency(Integer goodNetworkLatency) {
        this.goodNetworkLatency = goodNetworkLatency;
    }

    public FileRedirectionOptionsFluidControlOptions withNormalNetworkLatency(Integer normalNetworkLatency) {
        this.normalNetworkLatency = normalNetworkLatency;
        return this;
    }

    /**
     * 网络一般的延时阈值（ms）。取值范围为[1-1000]。默认：70。
     * minimum: 1
     * maximum: 1000
     * @return normalNetworkLatency
     */
    public Integer getNormalNetworkLatency() {
        return normalNetworkLatency;
    }

    public void setNormalNetworkLatency(Integer normalNetworkLatency) {
        this.normalNetworkLatency = normalNetworkLatency;
    }

    public FileRedirectionOptionsFluidControlOptions withPoorNetworkLatency(Integer poorNetworkLatency) {
        this.poorNetworkLatency = poorNetworkLatency;
        return this;
    }

    /**
     * 网络差的延时阈值（ms）。取值范围为[1-1000]。默认：100。
     * minimum: 1
     * maximum: 1000
     * @return poorNetworkLatency
     */
    public Integer getPoorNetworkLatency() {
        return poorNetworkLatency;
    }

    public void setPoorNetworkLatency(Integer poorNetworkLatency) {
        this.poorNetworkLatency = poorNetworkLatency;
    }

    public FileRedirectionOptionsFluidControlOptions withReducingStep(Integer reducingStep) {
        this.reducingStep = reducingStep;
        return this;
    }

    /**
     * 降速步伐（KB）。取值范围为[1-100]。默认：20。
     * minimum: 1
     * maximum: 100
     * @return reducingStep
     */
    public Integer getReducingStep() {
        return reducingStep;
    }

    public void setReducingStep(Integer reducingStep) {
        this.reducingStep = reducingStep;
    }

    public FileRedirectionOptionsFluidControlOptions withSlowIncreasingStep(Integer slowIncreasingStep) {
        this.slowIncreasingStep = slowIncreasingStep;
        return this;
    }

    /**
     * 慢增速步伐（KB）。取值范围为[1-100]。默认：10。
     * minimum: 1
     * maximum: 100
     * @return slowIncreasingStep
     */
    public Integer getSlowIncreasingStep() {
        return slowIncreasingStep;
    }

    public void setSlowIncreasingStep(Integer slowIncreasingStep) {
        this.slowIncreasingStep = slowIncreasingStep;
    }

    public FileRedirectionOptionsFluidControlOptions withQuickIncreasingStep(Integer quickIncreasingStep) {
        this.quickIncreasingStep = quickIncreasingStep;
        return this;
    }

    /**
     * 快增速步伐（KB）。取值范围为[1-100]。默认：20。
     * minimum: 1
     * maximum: 100
     * @return quickIncreasingStep
     */
    public Integer getQuickIncreasingStep() {
        return quickIncreasingStep;
    }

    public void setQuickIncreasingStep(Integer quickIncreasingStep) {
        this.quickIncreasingStep = quickIncreasingStep;
    }

    public FileRedirectionOptionsFluidControlOptions withStartSpeed(Integer startSpeed) {
        this.startSpeed = startSpeed;
        return this;
    }

    /**
     * 传输初始速度（KB/s）。取值范围为[1-10240]。默认：1024。
     * minimum: 1
     * maximum: 10240
     * @return startSpeed
     */
    public Integer getStartSpeed() {
        return startSpeed;
    }

    public void setStartSpeed(Integer startSpeed) {
        this.startSpeed = startSpeed;
    }

    public FileRedirectionOptionsFluidControlOptions withTestBlockSize(Integer testBlockSize) {
        this.testBlockSize = testBlockSize;
        return this;
    }

    /**
     * 测速块大小（KB）。取值范围为[64-1024]。默认：64。
     * minimum: 64
     * maximum: 1024
     * @return testBlockSize
     */
    public Integer getTestBlockSize() {
        return testBlockSize;
    }

    public void setTestBlockSize(Integer testBlockSize) {
        this.testBlockSize = testBlockSize;
    }

    public FileRedirectionOptionsFluidControlOptions withTestTimeGap(Integer testTimeGap) {
        this.testTimeGap = testTimeGap;
        return this;
    }

    /**
     * 测速块时间间隔（ms）。取值范围为[1000-100000]。默认：10000。
     * minimum: 1000
     * maximum: 100000
     * @return testTimeGap
     */
    public Integer getTestTimeGap() {
        return testTimeGap;
    }

    public void setTestTimeGap(Integer testTimeGap) {
        this.testTimeGap = testTimeGap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileRedirectionOptionsFluidControlOptions that = (FileRedirectionOptionsFluidControlOptions) obj;
        return Objects.equals(this.goodNetworkLatency, that.goodNetworkLatency)
            && Objects.equals(this.normalNetworkLatency, that.normalNetworkLatency)
            && Objects.equals(this.poorNetworkLatency, that.poorNetworkLatency)
            && Objects.equals(this.reducingStep, that.reducingStep)
            && Objects.equals(this.slowIncreasingStep, that.slowIncreasingStep)
            && Objects.equals(this.quickIncreasingStep, that.quickIncreasingStep)
            && Objects.equals(this.startSpeed, that.startSpeed)
            && Objects.equals(this.testBlockSize, that.testBlockSize)
            && Objects.equals(this.testTimeGap, that.testTimeGap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodNetworkLatency,
            normalNetworkLatency,
            poorNetworkLatency,
            reducingStep,
            slowIncreasingStep,
            quickIncreasingStep,
            startSpeed,
            testBlockSize,
            testTimeGap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileRedirectionOptionsFluidControlOptions {\n");
        sb.append("    goodNetworkLatency: ").append(toIndentedString(goodNetworkLatency)).append("\n");
        sb.append("    normalNetworkLatency: ").append(toIndentedString(normalNetworkLatency)).append("\n");
        sb.append("    poorNetworkLatency: ").append(toIndentedString(poorNetworkLatency)).append("\n");
        sb.append("    reducingStep: ").append(toIndentedString(reducingStep)).append("\n");
        sb.append("    slowIncreasingStep: ").append(toIndentedString(slowIncreasingStep)).append("\n");
        sb.append("    quickIncreasingStep: ").append(toIndentedString(quickIncreasingStep)).append("\n");
        sb.append("    startSpeed: ").append(toIndentedString(startSpeed)).append("\n");
        sb.append("    testBlockSize: ").append(toIndentedString(testBlockSize)).append("\n");
        sb.append("    testTimeGap: ").append(toIndentedString(testTimeGap)).append("\n");
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
