package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckClusterShrinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_passed")

    private Boolean isPassed;

    public CheckClusterShrinkResponse withIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
        return this;
    }

    /**
     * **参数解释**： 检查是否通过。如不通过，需要调整缩容节点数重试，或者是当前集群就不满足缩容前置条件。 **取值范围**： 不涉及。
     * @return isPassed
     */
    public Boolean getIsPassed() {
        return isPassed;
    }

    public void setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckClusterShrinkResponse that = (CheckClusterShrinkResponse) obj;
        return Objects.equals(this.isPassed, that.isPassed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPassed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckClusterShrinkResponse {\n");
        sb.append("    isPassed: ").append(toIndentedString(isPassed)).append("\n");
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
