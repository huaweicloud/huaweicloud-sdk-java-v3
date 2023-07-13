package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重力衰减因子
 */
public class BehaviorGravity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weaken_factor")

    private Double weakenFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_type")

    private String viewType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algo_type")

    private String algoType;

    public BehaviorGravity withWeakenFactor(Double weakenFactor) {
        this.weakenFactor = weakenFactor;
        return this;
    }

    /**
     * 衰减因子。
     * minimum: 0.1
     * maximum: 5
     * @return weakenFactor
     */
    public Double getWeakenFactor() {
        return weakenFactor;
    }

    public void setWeakenFactor(Double weakenFactor) {
        this.weakenFactor = weakenFactor;
    }

    public BehaviorGravity withViewType(String viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * 行为次数统计方法： - pv，访问量 - uv，独立访客
     * @return viewType
     */
    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public BehaviorGravity withAlgoType(String algoType) {
        this.algoType = algoType;
        return this;
    }

    /**
     * 算法类型: - normal，通用 - time，时间
     * @return algoType
     */
    public String getAlgoType() {
        return algoType;
    }

    public void setAlgoType(String algoType) {
        this.algoType = algoType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BehaviorGravity that = (BehaviorGravity) obj;
        return Objects.equals(this.weakenFactor, that.weakenFactor) && Objects.equals(this.viewType, that.viewType)
            && Objects.equals(this.algoType, that.algoType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weakenFactor, viewType, algoType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BehaviorGravity {\n");
        sb.append("    weakenFactor: ").append(toIndentedString(weakenFactor)).append("\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
        sb.append("    algoType: ").append(toIndentedString(algoType)).append("\n");
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
