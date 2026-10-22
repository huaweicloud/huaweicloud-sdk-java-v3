package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoStopConfig
 */
public class AutoStopConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_timeout_minutes")

    private Integer idleTimeoutMinutes;

    public AutoStopConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**：自动停止集群开关。 **约束限制**：不涉及。 **取值范围**：   - true：开启自动停止集群。   - false：关闭自动停止集群。 **默认取值**：不涉及。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AutoStopConfig withIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
        return this;
    }

    /**
     * **参数解释**：指定时间不活动后自动停止集群，单位分钟。 **约束限制**：不涉及。 **取值范围**：5~360。 **默认取值**：10。 
     * minimum: 5
     * maximum: 360
     * @return idleTimeoutMinutes
     */
    public Integer getIdleTimeoutMinutes() {
        return idleTimeoutMinutes;
    }

    public void setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoStopConfig that = (AutoStopConfig) obj;
        return Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.idleTimeoutMinutes, that.idleTimeoutMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, idleTimeoutMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoStopConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    idleTimeoutMinutes: ").append(toIndentedString(idleTimeoutMinutes)).append("\n");
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
