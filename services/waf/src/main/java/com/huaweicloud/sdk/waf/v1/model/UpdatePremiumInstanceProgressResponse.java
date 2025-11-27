package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdatePremiumInstanceProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public UpdatePremiumInstanceProgressResponse withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释：** 接入步骤（1:回源IP加白步骤，2:本地验证步骤 3:修改DNS解析步骤） **约束限制：** 不涉及 **取值范围：** - 1 : 回源IP加白步骤 - 2 : 本地验证步骤 - 3 : 修改DNS解析步骤  **默认取值：** 不涉及
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public UpdatePremiumInstanceProgressResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 完成情况（0:未完成，1:完成，2:跳过） **约束限制：** 不涉及 **取值范围：** - 0:未完成 - 1:完成 - 2:跳过  **默认取值：** 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePremiumInstanceProgressResponse that = (UpdatePremiumInstanceProgressResponse) obj;
        return Objects.equals(this.step, that.step) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(step, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePremiumInstanceProgressResponse {\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
