package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class SearchAutoEnlargePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_volume_size")

    private Integer limitVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_volume_size")

    private Integer minVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_volume_size")

    private Integer maxVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_available_percent")

    private Integer triggerAvailablePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percents")

    private List<Integer> percents = null;

    public SearchAutoEnlargePolicyResponse withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 磁盘自动扩容开关。
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public SearchAutoEnlargePolicyResponse withLimitVolumeSize(Integer limitVolumeSize) {
        this.limitVolumeSize = limitVolumeSize;
        return this;
    }

    /**
     * 存储自动扩容上限。
     * @return limitVolumeSize
     */
    public Integer getLimitVolumeSize() {
        return limitVolumeSize;
    }

    public void setLimitVolumeSize(Integer limitVolumeSize) {
        this.limitVolumeSize = limitVolumeSize;
    }

    public SearchAutoEnlargePolicyResponse withMinVolumeSize(Integer minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
        return this;
    }

    /**
     * 最小扩容磁盘容量。
     * @return minVolumeSize
     */
    public Integer getMinVolumeSize() {
        return minVolumeSize;
    }

    public void setMinVolumeSize(Integer minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
    }

    public SearchAutoEnlargePolicyResponse withMaxVolumeSize(Integer maxVolumeSize) {
        this.maxVolumeSize = maxVolumeSize;
        return this;
    }

    /**
     * 最大扩容磁盘容量。
     * @return maxVolumeSize
     */
    public Integer getMaxVolumeSize() {
        return maxVolumeSize;
    }

    public void setMaxVolumeSize(Integer maxVolumeSize) {
        this.maxVolumeSize = maxVolumeSize;
    }

    public SearchAutoEnlargePolicyResponse withTriggerAvailablePercent(Integer triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
        return this;
    }

    /**
     * 可用存储空间率。
     * @return triggerAvailablePercent
     */
    public Integer getTriggerAvailablePercent() {
        return triggerAvailablePercent;
    }

    public void setTriggerAvailablePercent(Integer triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
    }

    public SearchAutoEnlargePolicyResponse withPercents(List<Integer> percents) {
        this.percents = percents;
        return this;
    }

    public SearchAutoEnlargePolicyResponse addPercentsItem(Integer percentsItem) {
        if (this.percents == null) {
            this.percents = new ArrayList<>();
        }
        this.percents.add(percentsItem);
        return this;
    }

    public SearchAutoEnlargePolicyResponse withPercents(Consumer<List<Integer>> percentsSetter) {
        if (this.percents == null) {
            this.percents = new ArrayList<>();
        }
        percentsSetter.accept(this.percents);
        return this;
    }

    /**
     * 空间率集合。
     * @return percents
     */
    public List<Integer> getPercents() {
        return percents;
    }

    public void setPercents(List<Integer> percents) {
        this.percents = percents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchAutoEnlargePolicyResponse that = (SearchAutoEnlargePolicyResponse) obj;
        return Objects.equals(this.switchOption, that.switchOption)
            && Objects.equals(this.limitVolumeSize, that.limitVolumeSize)
            && Objects.equals(this.minVolumeSize, that.minVolumeSize)
            && Objects.equals(this.maxVolumeSize, that.maxVolumeSize)
            && Objects.equals(this.triggerAvailablePercent, that.triggerAvailablePercent)
            && Objects.equals(this.percents, that.percents);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(switchOption, limitVolumeSize, minVolumeSize, maxVolumeSize, triggerAvailablePercent, percents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAutoEnlargePolicyResponse {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    limitVolumeSize: ").append(toIndentedString(limitVolumeSize)).append("\n");
        sb.append("    minVolumeSize: ").append(toIndentedString(minVolumeSize)).append("\n");
        sb.append("    maxVolumeSize: ").append(toIndentedString(maxVolumeSize)).append("\n");
        sb.append("    triggerAvailablePercent: ").append(toIndentedString(triggerAvailablePercent)).append("\n");
        sb.append("    percents: ").append(toIndentedString(percents)).append("\n");
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
