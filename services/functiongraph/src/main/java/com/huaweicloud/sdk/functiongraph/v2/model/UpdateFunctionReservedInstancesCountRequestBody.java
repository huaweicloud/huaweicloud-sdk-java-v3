package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateFunctionReservedInstancesCountRequestBody
 */
public class UpdateFunctionReservedInstancesCountRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_mode")

    private Boolean idleMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tactics_config")

    private TacticsConfig tacticsConfig;

    public UpdateFunctionReservedInstancesCountRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 预留实例个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public UpdateFunctionReservedInstancesCountRequestBody withIdleMode(Boolean idleMode) {
        this.idleMode = idleMode;
        return this;
    }

    /**
     * 是否开启闲置模式配置
     * @return idleMode
     */
    public Boolean getIdleMode() {
        return idleMode;
    }

    public void setIdleMode(Boolean idleMode) {
        this.idleMode = idleMode;
    }

    public UpdateFunctionReservedInstancesCountRequestBody withTacticsConfig(TacticsConfig tacticsConfig) {
        this.tacticsConfig = tacticsConfig;
        return this;
    }

    public UpdateFunctionReservedInstancesCountRequestBody withTacticsConfig(
        Consumer<TacticsConfig> tacticsConfigSetter) {
        if (this.tacticsConfig == null) {
            this.tacticsConfig = new TacticsConfig();
            tacticsConfigSetter.accept(this.tacticsConfig);
        }

        return this;
    }

    /**
     * Get tacticsConfig
     * @return tacticsConfig
     */
    public TacticsConfig getTacticsConfig() {
        return tacticsConfig;
    }

    public void setTacticsConfig(TacticsConfig tacticsConfig) {
        this.tacticsConfig = tacticsConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFunctionReservedInstancesCountRequestBody that = (UpdateFunctionReservedInstancesCountRequestBody) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.idleMode, that.idleMode)
            && Objects.equals(this.tacticsConfig, that.tacticsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, idleMode, tacticsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionReservedInstancesCountRequestBody {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    idleMode: ").append(toIndentedString(idleMode)).append("\n");
        sb.append("    tacticsConfig: ").append(toIndentedString(tacticsConfig)).append("\n");
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
