package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重启实例
 */
public class TaurusRestartInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connections")

    private Integer maxConnections;

    public TaurusRestartInstanceRequest withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 实例是否延迟重启，默认false，立即重启。  - true: 延迟重启，实例将在运维时间窗内自动重启。 - false: 立即重启。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public TaurusRestartInstanceRequest withMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    /**
     * **参数解释**：  实例重启后生效的max_connections内核参数配置值。max_connections用于设置允许同时连接到数据库实例的最大客户端连接数。  **约束限制**：  不涉及。  **取值范围**： 30-100000。  **默认取值**： 不涉及。
     * @return maxConnections
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaurusRestartInstanceRequest that = (TaurusRestartInstanceRequest) obj;
        return Objects.equals(this.delay, that.delay) && Objects.equals(this.maxConnections, that.maxConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delay, maxConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusRestartInstanceRequest {\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
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
