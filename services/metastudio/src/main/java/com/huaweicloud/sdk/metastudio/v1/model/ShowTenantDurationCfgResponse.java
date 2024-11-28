package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTenantDurationCfgResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_min")

    private Integer basicMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_max")

    private Integer basicMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_advice_value")

    private Integer basicAdviceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle_min")

    private Integer middleMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle_max")

    private Integer middleMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle_advice_value")

    private Integer middleAdviceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advance_min")

    private Integer advanceMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advance_max")

    private Integer advanceMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advance_advice_value")

    private Integer advanceAdviceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexus_min")

    private Integer flexusMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexus_max")

    private Integer flexusMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexus_advice_value")

    private Integer flexusAdviceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmww_min")

    private Integer cmwwMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmww_max")

    private Integer cmwwMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmww_advice_value")

    private Integer cmwwAdviceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ljzn_min")

    private Integer ljznMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ljzn_max")

    private Integer ljznMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ljzn_advice_value")

    private Integer ljznAdviceValue;

    public ShowTenantDurationCfgResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowTenantDurationCfgResponse withBasicMin(Integer basicMin) {
        this.basicMin = basicMin;
        return this;
    }

    /**
     * 基础版最低时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return basicMin
     */
    public Integer getBasicMin() {
        return basicMin;
    }

    public void setBasicMin(Integer basicMin) {
        this.basicMin = basicMin;
    }

    public ShowTenantDurationCfgResponse withBasicMax(Integer basicMax) {
        this.basicMax = basicMax;
        return this;
    }

    /**
     * 基础版最高时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return basicMax
     */
    public Integer getBasicMax() {
        return basicMax;
    }

    public void setBasicMax(Integer basicMax) {
        this.basicMax = basicMax;
    }

    public ShowTenantDurationCfgResponse withBasicAdviceValue(Integer basicAdviceValue) {
        this.basicAdviceValue = basicAdviceValue;
        return this;
    }

    /**
     * 建议时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return basicAdviceValue
     */
    public Integer getBasicAdviceValue() {
        return basicAdviceValue;
    }

    public void setBasicAdviceValue(Integer basicAdviceValue) {
        this.basicAdviceValue = basicAdviceValue;
    }

    public ShowTenantDurationCfgResponse withMiddleMin(Integer middleMin) {
        this.middleMin = middleMin;
        return this;
    }

    /**
     * 进阶版最低时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return middleMin
     */
    public Integer getMiddleMin() {
        return middleMin;
    }

    public void setMiddleMin(Integer middleMin) {
        this.middleMin = middleMin;
    }

    public ShowTenantDurationCfgResponse withMiddleMax(Integer middleMax) {
        this.middleMax = middleMax;
        return this;
    }

    /**
     * 进阶版最高时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return middleMax
     */
    public Integer getMiddleMax() {
        return middleMax;
    }

    public void setMiddleMax(Integer middleMax) {
        this.middleMax = middleMax;
    }

    public ShowTenantDurationCfgResponse withMiddleAdviceValue(Integer middleAdviceValue) {
        this.middleAdviceValue = middleAdviceValue;
        return this;
    }

    /**
     * 建议时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return middleAdviceValue
     */
    public Integer getMiddleAdviceValue() {
        return middleAdviceValue;
    }

    public void setMiddleAdviceValue(Integer middleAdviceValue) {
        this.middleAdviceValue = middleAdviceValue;
    }

    public ShowTenantDurationCfgResponse withAdvanceMin(Integer advanceMin) {
        this.advanceMin = advanceMin;
        return this;
    }

    /**
     * 高级版最低时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return advanceMin
     */
    public Integer getAdvanceMin() {
        return advanceMin;
    }

    public void setAdvanceMin(Integer advanceMin) {
        this.advanceMin = advanceMin;
    }

    public ShowTenantDurationCfgResponse withAdvanceMax(Integer advanceMax) {
        this.advanceMax = advanceMax;
        return this;
    }

    /**
     * 高级版最高时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return advanceMax
     */
    public Integer getAdvanceMax() {
        return advanceMax;
    }

    public void setAdvanceMax(Integer advanceMax) {
        this.advanceMax = advanceMax;
    }

    public ShowTenantDurationCfgResponse withAdvanceAdviceValue(Integer advanceAdviceValue) {
        this.advanceAdviceValue = advanceAdviceValue;
        return this;
    }

    /**
     * 建议时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return advanceAdviceValue
     */
    public Integer getAdvanceAdviceValue() {
        return advanceAdviceValue;
    }

    public void setAdvanceAdviceValue(Integer advanceAdviceValue) {
        this.advanceAdviceValue = advanceAdviceValue;
    }

    public ShowTenantDurationCfgResponse withFlexusMin(Integer flexusMin) {
        this.flexusMin = flexusMin;
        return this;
    }

    /**
     * flexus版最低时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return flexusMin
     */
    public Integer getFlexusMin() {
        return flexusMin;
    }

    public void setFlexusMin(Integer flexusMin) {
        this.flexusMin = flexusMin;
    }

    public ShowTenantDurationCfgResponse withFlexusMax(Integer flexusMax) {
        this.flexusMax = flexusMax;
        return this;
    }

    /**
     * flexus版最高时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return flexusMax
     */
    public Integer getFlexusMax() {
        return flexusMax;
    }

    public void setFlexusMax(Integer flexusMax) {
        this.flexusMax = flexusMax;
    }

    public ShowTenantDurationCfgResponse withFlexusAdviceValue(Integer flexusAdviceValue) {
        this.flexusAdviceValue = flexusAdviceValue;
        return this;
    }

    /**
     * flexus建议时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return flexusAdviceValue
     */
    public Integer getFlexusAdviceValue() {
        return flexusAdviceValue;
    }

    public void setFlexusAdviceValue(Integer flexusAdviceValue) {
        this.flexusAdviceValue = flexusAdviceValue;
    }

    public ShowTenantDurationCfgResponse withCmwwMin(Integer cmwwMin) {
        this.cmwwMin = cmwwMin;
        return this;
    }

    /**
     * 出门问问最低时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return cmwwMin
     */
    public Integer getCmwwMin() {
        return cmwwMin;
    }

    public void setCmwwMin(Integer cmwwMin) {
        this.cmwwMin = cmwwMin;
    }

    public ShowTenantDurationCfgResponse withCmwwMax(Integer cmwwMax) {
        this.cmwwMax = cmwwMax;
        return this;
    }

    /**
     * 出门问问最高时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return cmwwMax
     */
    public Integer getCmwwMax() {
        return cmwwMax;
    }

    public void setCmwwMax(Integer cmwwMax) {
        this.cmwwMax = cmwwMax;
    }

    public ShowTenantDurationCfgResponse withCmwwAdviceValue(Integer cmwwAdviceValue) {
        this.cmwwAdviceValue = cmwwAdviceValue;
        return this;
    }

    /**
     * 出门问问建议时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return cmwwAdviceValue
     */
    public Integer getCmwwAdviceValue() {
        return cmwwAdviceValue;
    }

    public void setCmwwAdviceValue(Integer cmwwAdviceValue) {
        this.cmwwAdviceValue = cmwwAdviceValue;
    }

    public ShowTenantDurationCfgResponse withLjznMin(Integer ljznMin) {
        this.ljznMin = ljznMin;
        return this;
    }

    /**
     * 逻辑智能最低时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return ljznMin
     */
    public Integer getLjznMin() {
        return ljznMin;
    }

    public void setLjznMin(Integer ljznMin) {
        this.ljznMin = ljznMin;
    }

    public ShowTenantDurationCfgResponse withLjznMax(Integer ljznMax) {
        this.ljznMax = ljznMax;
        return this;
    }

    /**
     * 逻辑智能最高时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return ljznMax
     */
    public Integer getLjznMax() {
        return ljznMax;
    }

    public void setLjznMax(Integer ljznMax) {
        this.ljznMax = ljznMax;
    }

    public ShowTenantDurationCfgResponse withLjznAdviceValue(Integer ljznAdviceValue) {
        this.ljznAdviceValue = ljznAdviceValue;
        return this;
    }

    /**
     * 逻辑智能建议时长（秒）
     * minimum: 0
     * maximum: 2147483647
     * @return ljznAdviceValue
     */
    public Integer getLjznAdviceValue() {
        return ljznAdviceValue;
    }

    public void setLjznAdviceValue(Integer ljznAdviceValue) {
        this.ljznAdviceValue = ljznAdviceValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTenantDurationCfgResponse that = (ShowTenantDurationCfgResponse) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.basicMin, that.basicMin)
            && Objects.equals(this.basicMax, that.basicMax)
            && Objects.equals(this.basicAdviceValue, that.basicAdviceValue)
            && Objects.equals(this.middleMin, that.middleMin) && Objects.equals(this.middleMax, that.middleMax)
            && Objects.equals(this.middleAdviceValue, that.middleAdviceValue)
            && Objects.equals(this.advanceMin, that.advanceMin) && Objects.equals(this.advanceMax, that.advanceMax)
            && Objects.equals(this.advanceAdviceValue, that.advanceAdviceValue)
            && Objects.equals(this.flexusMin, that.flexusMin) && Objects.equals(this.flexusMax, that.flexusMax)
            && Objects.equals(this.flexusAdviceValue, that.flexusAdviceValue)
            && Objects.equals(this.cmwwMin, that.cmwwMin) && Objects.equals(this.cmwwMax, that.cmwwMax)
            && Objects.equals(this.cmwwAdviceValue, that.cmwwAdviceValue) && Objects.equals(this.ljznMin, that.ljznMin)
            && Objects.equals(this.ljznMax, that.ljznMax) && Objects.equals(this.ljznAdviceValue, that.ljznAdviceValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
            basicMin,
            basicMax,
            basicAdviceValue,
            middleMin,
            middleMax,
            middleAdviceValue,
            advanceMin,
            advanceMax,
            advanceAdviceValue,
            flexusMin,
            flexusMax,
            flexusAdviceValue,
            cmwwMin,
            cmwwMax,
            cmwwAdviceValue,
            ljznMin,
            ljznMax,
            ljznAdviceValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantDurationCfgResponse {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    basicMin: ").append(toIndentedString(basicMin)).append("\n");
        sb.append("    basicMax: ").append(toIndentedString(basicMax)).append("\n");
        sb.append("    basicAdviceValue: ").append(toIndentedString(basicAdviceValue)).append("\n");
        sb.append("    middleMin: ").append(toIndentedString(middleMin)).append("\n");
        sb.append("    middleMax: ").append(toIndentedString(middleMax)).append("\n");
        sb.append("    middleAdviceValue: ").append(toIndentedString(middleAdviceValue)).append("\n");
        sb.append("    advanceMin: ").append(toIndentedString(advanceMin)).append("\n");
        sb.append("    advanceMax: ").append(toIndentedString(advanceMax)).append("\n");
        sb.append("    advanceAdviceValue: ").append(toIndentedString(advanceAdviceValue)).append("\n");
        sb.append("    flexusMin: ").append(toIndentedString(flexusMin)).append("\n");
        sb.append("    flexusMax: ").append(toIndentedString(flexusMax)).append("\n");
        sb.append("    flexusAdviceValue: ").append(toIndentedString(flexusAdviceValue)).append("\n");
        sb.append("    cmwwMin: ").append(toIndentedString(cmwwMin)).append("\n");
        sb.append("    cmwwMax: ").append(toIndentedString(cmwwMax)).append("\n");
        sb.append("    cmwwAdviceValue: ").append(toIndentedString(cmwwAdviceValue)).append("\n");
        sb.append("    ljznMin: ").append(toIndentedString(ljznMin)).append("\n");
        sb.append("    ljznMax: ").append(toIndentedString(ljznMax)).append("\n");
        sb.append("    ljznAdviceValue: ").append(toIndentedString(ljznAdviceValue)).append("\n");
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
