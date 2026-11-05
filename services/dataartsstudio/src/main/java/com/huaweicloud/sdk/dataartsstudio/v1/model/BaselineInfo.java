package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BaselineInfo
 */
public class BaselineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_id")

    private String baselineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_name")

    private String baselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_time")

    private Long slaTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_time")

    private Long expTime;

    public BaselineInfo withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * **参数解释**： 基线ID。 **取值范围**： 长度为1~64个字符。
     * @return baselineId
     */
    public String getBaselineId() {
        return baselineId;
    }

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    public BaselineInfo withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * **参数解释**： 基线名称。 **取值范围**： 长度为1~1024个字符。
     * @return baselineName
     */
    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public BaselineInfo withSlaTime(Long slaTime) {
        this.slaTime = slaTime;
        return this;
    }

    /**
     * **参数解释**： 基线承诺时间，单位毫秒。 **取值范围**： 不涉及。
     * @return slaTime
     */
    public Long getSlaTime() {
        return slaTime;
    }

    public void setSlaTime(Long slaTime) {
        this.slaTime = slaTime;
    }

    public BaselineInfo withExpTime(Long expTime) {
        this.expTime = expTime;
        return this;
    }

    /**
     * **参数解释**： 基线预警时间，单位毫秒。 **取值范围**： 不涉及。
     * @return expTime
     */
    public Long getExpTime() {
        return expTime;
    }

    public void setExpTime(Long expTime) {
        this.expTime = expTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaselineInfo that = (BaselineInfo) obj;
        return Objects.equals(this.baselineId, that.baselineId) && Objects.equals(this.baselineName, that.baselineName)
            && Objects.equals(this.slaTime, that.slaTime) && Objects.equals(this.expTime, that.expTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineId, baselineName, slaTime, expTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaselineInfo {\n");
        sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
        sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
        sb.append("    slaTime: ").append(toIndentedString(slaTime)).append("\n");
        sb.append("    expTime: ").append(toIndentedString(expTime)).append("\n");
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
