package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动扩容策略
 */
public class AutoEnlargeStrategyForConsoleApi {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private Boolean option;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limitSize")

    private Long limitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggerAvailablePercent")

    private Long triggerAvailablePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stepPercent")

    private Long stepPercent;

    public AutoEnlargeStrategyForConsoleApi withOption(Boolean option) {
        this.option = option;
        return this;
    }

    /**
     * 是否开启自动扩容。
     * @return option
     */
    public Boolean getOption() {
        return option;
    }

    public void setOption(Boolean option) {
        this.option = option;
    }

    public AutoEnlargeStrategyForConsoleApi withLimitSize(Long limitSize) {
        this.limitSize = limitSize;
        return this;
    }

    /**
     * 扩容上限，单位GB。“option”为true时，该参数必填。
     * @return limitSize
     */
    public Long getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(Long limitSize) {
        this.limitSize = limitSize;
    }

    public AutoEnlargeStrategyForConsoleApi withTriggerAvailablePercent(Long triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
        return this;
    }

    /**
     * 可用存储空间百分比，小于等于此值或者为10GB时触发扩容。“option”为true时，该参数必填。
     * @return triggerAvailablePercent
     */
    public Long getTriggerAvailablePercent() {
        return triggerAvailablePercent;
    }

    public void setTriggerAvailablePercent(Long triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
    }

    public AutoEnlargeStrategyForConsoleApi withStepPercent(Long stepPercent) {
        this.stepPercent = stepPercent;
        return this;
    }

    /**
     * 每次自动扩容的步长，单位为百分比，即每次自动扩容当前存储空间的百分比。取值范围为5%~50%。
     * @return stepPercent
     */
    public Long getStepPercent() {
        return stepPercent;
    }

    public void setStepPercent(Long stepPercent) {
        this.stepPercent = stepPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoEnlargeStrategyForConsoleApi that = (AutoEnlargeStrategyForConsoleApi) obj;
        return Objects.equals(this.option, that.option) && Objects.equals(this.limitSize, that.limitSize)
            && Objects.equals(this.triggerAvailablePercent, that.triggerAvailablePercent)
            && Objects.equals(this.stepPercent, that.stepPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, limitSize, triggerAvailablePercent, stepPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoEnlargeStrategyForConsoleApi {\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
        sb.append("    triggerAvailablePercent: ").append(toIndentedString(triggerAvailablePercent)).append("\n");
        sb.append("    stepPercent: ").append(toIndentedString(stepPercent)).append("\n");
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
