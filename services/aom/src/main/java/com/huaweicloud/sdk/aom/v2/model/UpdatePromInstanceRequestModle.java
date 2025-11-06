package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePromInstanceRequestModle
 */
public class UpdatePromInstanceRequestModle {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_id")

    private String promId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_limits")

    private PromLimits promLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_name")

    private String promName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggr_prometheus_info")

    private List<AggrPrometheusInfo> aggrPrometheusInfo = null;

    public UpdatePromInstanceRequestModle withPromId(String promId) {
        this.promId = promId;
        return this;
    }

    /**
     * 待修改的普罗实例id。
     * @return promId
     */
    public String getPromId() {
        return promId;
    }

    public void setPromId(String promId) {
        this.promId = promId;
    }

    public UpdatePromInstanceRequestModle withPromLimits(PromLimits promLimits) {
        this.promLimits = promLimits;
        return this;
    }

    public UpdatePromInstanceRequestModle withPromLimits(Consumer<PromLimits> promLimitsSetter) {
        if (this.promLimits == null) {
            this.promLimits = new PromLimits();
            promLimitsSetter.accept(this.promLimits);
        }

        return this;
    }

    /**
     * Get promLimits
     * @return promLimits
     */
    public PromLimits getPromLimits() {
        return promLimits;
    }

    public void setPromLimits(PromLimits promLimits) {
        this.promLimits = promLimits;
    }

    public UpdatePromInstanceRequestModle withPromName(String promName) {
        this.promName = promName;
        return this;
    }

    /**
     * 待修改的普罗实例名称，名称不能以下划线或中划线开头和结尾，只含有中文，英文，数字，下划线，中划线，长度1-100。
     * @return promName
     */
    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public UpdatePromInstanceRequestModle withAggrPrometheusInfo(List<AggrPrometheusInfo> aggrPrometheusInfo) {
        this.aggrPrometheusInfo = aggrPrometheusInfo;
        return this;
    }

    public UpdatePromInstanceRequestModle addAggrPrometheusInfoItem(AggrPrometheusInfo aggrPrometheusInfoItem) {
        if (this.aggrPrometheusInfo == null) {
            this.aggrPrometheusInfo = new ArrayList<>();
        }
        this.aggrPrometheusInfo.add(aggrPrometheusInfoItem);
        return this;
    }

    public UpdatePromInstanceRequestModle withAggrPrometheusInfo(
        Consumer<List<AggrPrometheusInfo>> aggrPrometheusInfoSetter) {
        if (this.aggrPrometheusInfo == null) {
            this.aggrPrometheusInfo = new ArrayList<>();
        }
        aggrPrometheusInfoSetter.accept(this.aggrPrometheusInfo);
        return this;
    }

    /**
     * 被聚合的账号和普罗实例列表。
     * @return aggrPrometheusInfo
     */
    public List<AggrPrometheusInfo> getAggrPrometheusInfo() {
        return aggrPrometheusInfo;
    }

    public void setAggrPrometheusInfo(List<AggrPrometheusInfo> aggrPrometheusInfo) {
        this.aggrPrometheusInfo = aggrPrometheusInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePromInstanceRequestModle that = (UpdatePromInstanceRequestModle) obj;
        return Objects.equals(this.promId, that.promId) && Objects.equals(this.promLimits, that.promLimits)
            && Objects.equals(this.promName, that.promName)
            && Objects.equals(this.aggrPrometheusInfo, that.aggrPrometheusInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promId, promLimits, promName, aggrPrometheusInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePromInstanceRequestModle {\n");
        sb.append("    promId: ").append(toIndentedString(promId)).append("\n");
        sb.append("    promLimits: ").append(toIndentedString(promLimits)).append("\n");
        sb.append("    promName: ").append(toIndentedString(promName)).append("\n");
        sb.append("    aggrPrometheusInfo: ").append(toIndentedString(aggrPrometheusInfo)).append("\n");
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
