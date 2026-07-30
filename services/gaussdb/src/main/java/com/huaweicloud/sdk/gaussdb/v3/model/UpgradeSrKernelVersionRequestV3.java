package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StarRocks内核版本升级请求体。
 */
public class UpgradeSrKernelVersionRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_skip_validate")

    private Boolean isSkipValidate;

    public UpgradeSrKernelVersionRequestV3 withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * **参数解释**： 是否延时升级。  **约束限制**： 不涉及  **取值范围**： - true - false  **默认取值**： false。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public UpgradeSrKernelVersionRequestV3 withIsSkipValidate(Boolean isSkipValidate) {
        this.isSkipValidate = isSkipValidate;
        return this;
    }

    /**
     * **参数解释**： 是否跳过升级校验。  **约束限制**： 不涉及  **取值范围**： - true - false  **默认取值**： false。
     * @return isSkipValidate
     */
    public Boolean getIsSkipValidate() {
        return isSkipValidate;
    }

    public void setIsSkipValidate(Boolean isSkipValidate) {
        this.isSkipValidate = isSkipValidate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeSrKernelVersionRequestV3 that = (UpgradeSrKernelVersionRequestV3) obj;
        return Objects.equals(this.delay, that.delay) && Objects.equals(this.isSkipValidate, that.isSkipValidate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delay, isSkipValidate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeSrKernelVersionRequestV3 {\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    isSkipValidate: ").append(toIndentedString(isSkipValidate)).append("\n");
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
