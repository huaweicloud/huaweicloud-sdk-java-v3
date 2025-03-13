package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * DelayUpgradePlanRequestBody
 */
public class DelayUpgradePlanRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notBefore")

    private LocalDate notBefore;

    public DelayUpgradePlanRequestBody withNotBefore(LocalDate notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 新的自动升级计划启动时间，必须早于notBeforeDeadline
     * @return notBefore
     */
    public LocalDate getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(LocalDate notBefore) {
        this.notBefore = notBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelayUpgradePlanRequestBody that = (DelayUpgradePlanRequestBody) obj;
        return Objects.equals(this.notBefore, that.notBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelayUpgradePlanRequestBody {\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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
