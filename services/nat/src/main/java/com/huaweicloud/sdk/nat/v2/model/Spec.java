package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Spec
 */
public class Spec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbc_code")

    private String cbcCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_max")

    private Integer ruleMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sess_max")

    private Integer sessMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bps_max")

    private Integer bpsMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pps_max")

    private Integer ppsMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps_max")

    private Integer qpsMax;

    public Spec withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spec withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 规格编号。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Spec withCbcCode(String cbcCode) {
        this.cbcCode = cbcCode;
        return this;
    }

    /**
     * 规格cbc编码。
     * @return cbcCode
     */
    public String getCbcCode() {
        return cbcCode;
    }

    public void setCbcCode(String cbcCode) {
        this.cbcCode = cbcCode;
    }

    public Spec withRuleMax(Integer ruleMax) {
        this.ruleMax = ruleMax;
        return this;
    }

    /**
     * 最大规则数。
     * minimum: 0
     * maximum: 65535
     * @return ruleMax
     */
    public Integer getRuleMax() {
        return ruleMax;
    }

    public void setRuleMax(Integer ruleMax) {
        this.ruleMax = ruleMax;
    }

    public Spec withSessMax(Integer sessMax) {
        this.sessMax = sessMax;
        return this;
    }

    /**
     * 最大连接数。
     * minimum: 0
     * maximum: 65535
     * @return sessMax
     */
    public Integer getSessMax() {
        return sessMax;
    }

    public void setSessMax(Integer sessMax) {
        this.sessMax = sessMax;
    }

    public Spec withBpsMax(Integer bpsMax) {
        this.bpsMax = bpsMax;
        return this;
    }

    /**
     * 最大bps。
     * minimum: 0
     * maximum: 65535
     * @return bpsMax
     */
    public Integer getBpsMax() {
        return bpsMax;
    }

    public void setBpsMax(Integer bpsMax) {
        this.bpsMax = bpsMax;
    }

    public Spec withPpsMax(Integer ppsMax) {
        this.ppsMax = ppsMax;
        return this;
    }

    /**
     * 最大pps。
     * minimum: 0
     * maximum: 65535
     * @return ppsMax
     */
    public Integer getPpsMax() {
        return ppsMax;
    }

    public void setPpsMax(Integer ppsMax) {
        this.ppsMax = ppsMax;
    }

    public Spec withQpsMax(Integer qpsMax) {
        this.qpsMax = qpsMax;
        return this;
    }

    /**
     * 最大qps。
     * minimum: 0
     * maximum: 65535
     * @return qpsMax
     */
    public Integer getQpsMax() {
        return qpsMax;
    }

    public void setQpsMax(Integer qpsMax) {
        this.qpsMax = qpsMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Spec that = (Spec) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.code, that.code)
            && Objects.equals(this.cbcCode, that.cbcCode) && Objects.equals(this.ruleMax, that.ruleMax)
            && Objects.equals(this.sessMax, that.sessMax) && Objects.equals(this.bpsMax, that.bpsMax)
            && Objects.equals(this.ppsMax, that.ppsMax) && Objects.equals(this.qpsMax, that.qpsMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, cbcCode, ruleMax, sessMax, bpsMax, ppsMax, qpsMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Spec {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    cbcCode: ").append(toIndentedString(cbcCode)).append("\n");
        sb.append("    ruleMax: ").append(toIndentedString(ruleMax)).append("\n");
        sb.append("    sessMax: ").append(toIndentedString(sessMax)).append("\n");
        sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
        sb.append("    ppsMax: ").append(toIndentedString(ppsMax)).append("\n");
        sb.append("    qpsMax: ").append(toIndentedString(qpsMax)).append("\n");
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
