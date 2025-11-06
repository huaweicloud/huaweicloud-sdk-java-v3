package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 多层级告警阈值。 
 */
public class HierarchicalValueResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private Double critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "major")

    private Double major;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minor")

    private Double minor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private Double info;

    public HierarchicalValueResp withCritical(Double critical) {
        this.critical = critical;
        return this;
    }

    /**
     * **参数解释**： 紧急级别的阈值。 **取值范围**： [-1.7976931348623157e+108, 1.7976931348623157e+108] 
     * minimum: -1.7976931348623156E+108
     * maximum: 1.7976931348623156E+108
     * @return critical
     */
    public Double getCritical() {
        return critical;
    }

    public void setCritical(Double critical) {
        this.critical = critical;
    }

    public HierarchicalValueResp withMajor(Double major) {
        this.major = major;
        return this;
    }

    /**
     * **参数解释**： 重要级别的阈值。 **取值范围**： [-1.7976931348623157e+108, 1.7976931348623157e+108] 
     * minimum: -1.7976931348623156E+108
     * maximum: 1.7976931348623156E+108
     * @return major
     */
    public Double getMajor() {
        return major;
    }

    public void setMajor(Double major) {
        this.major = major;
    }

    public HierarchicalValueResp withMinor(Double minor) {
        this.minor = minor;
        return this;
    }

    /**
     * **参数解释**： 次要级别的阈值。 **取值范围**： [-1.7976931348623157e+108, 1.7976931348623157e+108] 
     * minimum: -1.7976931348623156E+108
     * maximum: 1.7976931348623156E+108
     * @return minor
     */
    public Double getMinor() {
        return minor;
    }

    public void setMinor(Double minor) {
        this.minor = minor;
    }

    public HierarchicalValueResp withInfo(Double info) {
        this.info = info;
        return this;
    }

    /**
     * **参数解释**： 提示级别的阈值。 **取值范围**： [-1.7976931348623157e+108, 1.7976931348623157e+108] 
     * minimum: -1.7976931348623156E+108
     * maximum: 1.7976931348623156E+108
     * @return info
     */
    public Double getInfo() {
        return info;
    }

    public void setInfo(Double info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HierarchicalValueResp that = (HierarchicalValueResp) obj;
        return Objects.equals(this.critical, that.critical) && Objects.equals(this.major, that.major)
            && Objects.equals(this.minor, that.minor) && Objects.equals(this.info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(critical, major, minor, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HierarchicalValueResp {\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    major: ").append(toIndentedString(major)).append("\n");
        sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
