package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备代理的基本信息。
 */
public class QueryDeviceProxySimplify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_id")

    private String proxyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_name")

    private String proxyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time_range")

    private EffectiveTimeRangeResponseDTO effectiveTimeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public QueryDeviceProxySimplify withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    /**
     * **参数说明**：代理ID。用来唯一标识一个代理规则
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public QueryDeviceProxySimplify withProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }

    /**
     * **参数说明**：设备代理名称
     * @return proxyName
     */
    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    public QueryDeviceProxySimplify withEffectiveTimeRange(EffectiveTimeRangeResponseDTO effectiveTimeRange) {
        this.effectiveTimeRange = effectiveTimeRange;
        return this;
    }

    public QueryDeviceProxySimplify withEffectiveTimeRange(
        Consumer<EffectiveTimeRangeResponseDTO> effectiveTimeRangeSetter) {
        if (this.effectiveTimeRange == null) {
            this.effectiveTimeRange = new EffectiveTimeRangeResponseDTO();
            effectiveTimeRangeSetter.accept(this.effectiveTimeRange);
        }

        return this;
    }

    /**
     * Get effectiveTimeRange
     * @return effectiveTimeRange
     */
    public EffectiveTimeRangeResponseDTO getEffectiveTimeRange() {
        return effectiveTimeRange;
    }

    public void setEffectiveTimeRange(EffectiveTimeRangeResponseDTO effectiveTimeRange) {
        this.effectiveTimeRange = effectiveTimeRange;
    }

    public QueryDeviceProxySimplify withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数说明**：资源空间ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDeviceProxySimplify that = (QueryDeviceProxySimplify) obj;
        return Objects.equals(this.proxyId, that.proxyId) && Objects.equals(this.proxyName, that.proxyName)
            && Objects.equals(this.effectiveTimeRange, that.effectiveTimeRange)
            && Objects.equals(this.appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyId, proxyName, effectiveTimeRange, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDeviceProxySimplify {\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
        sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
        sb.append("    effectiveTimeRange: ").append(toIndentedString(effectiveTimeRange)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
