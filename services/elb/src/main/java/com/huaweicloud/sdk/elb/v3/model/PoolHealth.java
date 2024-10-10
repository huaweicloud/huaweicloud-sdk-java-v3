package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数解释：后端全下线转发配置。
 */
public class PoolHealth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_healthy_member_count")

    private Integer minimumHealthyMemberCount;

    public PoolHealth withMinimumHealthyMemberCount(Integer minimumHealthyMemberCount) {
        this.minimumHealthyMemberCount = minimumHealthyMemberCount;
        return this;
    }

    /**
     * 参数解释：当健康检查在线的member个数小于该个数，判定pool的state为不健康。  取值范围： - 0：默认值，不生效。 - 1：全下线转发生效。
     * @return minimumHealthyMemberCount
     */
    public Integer getMinimumHealthyMemberCount() {
        return minimumHealthyMemberCount;
    }

    public void setMinimumHealthyMemberCount(Integer minimumHealthyMemberCount) {
        this.minimumHealthyMemberCount = minimumHealthyMemberCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolHealth that = (PoolHealth) obj;
        return Objects.equals(this.minimumHealthyMemberCount, that.minimumHealthyMemberCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumHealthyMemberCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolHealth {\n");
        sb.append("    minimumHealthyMemberCount: ").append(toIndentedString(minimumHealthyMemberCount)).append("\n");
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
