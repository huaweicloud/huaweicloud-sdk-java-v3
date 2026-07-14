package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 滚动更新配置。
 */
public class RollingUpdateResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_surge")

    private String maxSurge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_unavailable")

    private String maxUnavailable;

    public RollingUpdateResponse withMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

    /**
     * **参数解释：** 滚动更新时最多可以启动多少个Pod。 **取值范围：** 不涉及。
     * @return maxSurge
     */
    public String getMaxSurge() {
        return maxSurge;
    }

    public void setMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
    }

    public RollingUpdateResponse withMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    /**
     * **参数解释：** 滚动更新时最多可以删除多少个Pod。 **取值范围：** 不涉及。
     * @return maxUnavailable
     */
    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RollingUpdateResponse that = (RollingUpdateResponse) obj;
        return Objects.equals(this.maxSurge, that.maxSurge) && Objects.equals(this.maxUnavailable, that.maxUnavailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSurge, maxUnavailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollingUpdateResponse {\n");
        sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
        sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
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
