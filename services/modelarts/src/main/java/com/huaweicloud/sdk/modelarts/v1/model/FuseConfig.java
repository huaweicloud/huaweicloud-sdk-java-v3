package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 熔断配置。 **取值范围：** 不涉及。
 */
public class FuseConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_rate_fuse_enable")

    private Boolean errorRateFuseEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_rate_threshold")

    private Float errorRateThreshold;

    public FuseConfig withErrorRateFuseEnable(Boolean errorRateFuseEnable) {
        this.errorRateFuseEnable = errorRateFuseEnable;
        return this;
    }

    /**
     * **参数解释：** 错误率熔断开关。 **约束限制：** 不涉及。 **取值范围：** * true：开启错误率熔断。 * false：不打开错误率熔断。 **默认取值：** false：不打开错误率熔断。
     * @return errorRateFuseEnable
     */
    public Boolean getErrorRateFuseEnable() {
        return errorRateFuseEnable;
    }

    public void setErrorRateFuseEnable(Boolean errorRateFuseEnable) {
        this.errorRateFuseEnable = errorRateFuseEnable;
    }

    public FuseConfig withErrorRateThreshold(Float errorRateThreshold) {
        this.errorRateThreshold = errorRateThreshold;
        return this;
    }

    /**
     * **参数解释：** 错误率熔断阈值。 **约束限制：** 不涉及。 **取值范围：** (0, 1]（最多支持2位小数，小数点后第3位做四舍五入处理）。 **默认取值：** 不涉及。
     * minimum: 0
     * maximum: 1
     * @return errorRateThreshold
     */
    public Float getErrorRateThreshold() {
        return errorRateThreshold;
    }

    public void setErrorRateThreshold(Float errorRateThreshold) {
        this.errorRateThreshold = errorRateThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuseConfig that = (FuseConfig) obj;
        return Objects.equals(this.errorRateFuseEnable, that.errorRateFuseEnable)
            && Objects.equals(this.errorRateThreshold, that.errorRateThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorRateFuseEnable, errorRateThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuseConfig {\n");
        sb.append("    errorRateFuseEnable: ").append(toIndentedString(errorRateFuseEnable)).append("\n");
        sb.append("    errorRateThreshold: ").append(toIndentedString(errorRateThreshold)).append("\n");
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
