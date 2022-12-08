package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAutoEnlargePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_size")

    private Integer limitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_threshold")

    private Integer triggerThreshold;

    public ShowAutoEnlargePolicyResponse withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 是否已开启自动扩容，true为开启
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public ShowAutoEnlargePolicyResponse withLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
        return this;
    }

    /**
     * 扩容上限，单位GB
     * @return limitSize
     */
    public Integer getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public ShowAutoEnlargePolicyResponse withTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }

    /**
     * 可用空间百分比，小于等于此值或者10GB时触发扩容
     * @return triggerThreshold
     */
    public Integer getTriggerThreshold() {
        return triggerThreshold;
    }

    public void setTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAutoEnlargePolicyResponse showAutoEnlargePolicyResponse = (ShowAutoEnlargePolicyResponse) o;
        return Objects.equals(this.switchOption, showAutoEnlargePolicyResponse.switchOption)
            && Objects.equals(this.limitSize, showAutoEnlargePolicyResponse.limitSize)
            && Objects.equals(this.triggerThreshold, showAutoEnlargePolicyResponse.triggerThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, limitSize, triggerThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoEnlargePolicyResponse {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
        sb.append("    triggerThreshold: ").append(toIndentedString(triggerThreshold)).append("\n");
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
