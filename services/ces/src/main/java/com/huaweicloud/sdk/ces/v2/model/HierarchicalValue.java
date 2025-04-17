package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 多层级告警阈值。当hierarchical_value和value同时使用时以hierarchical_value为准。 创建或修改告警规则以下2种场景只支持设置一个阈值：   1.告警类型为&#x60;指标告警&#x60;且告警策略为&#x60;所有策略都满足才告警&#x60;的场景。   2.告警类型为&#x60;事件告警&#x60;的场景。 
 */
public class HierarchicalValue {

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

    public HierarchicalValue withCritical(Double critical) {
        this.critical = critical;
        return this;
    }

    /**
     * 紧急级别的阈值
     * minimum: 0
     * maximum: 1.7976931348623156E+108
     * @return critical
     */
    public Double getCritical() {
        return critical;
    }

    public void setCritical(Double critical) {
        this.critical = critical;
    }

    public HierarchicalValue withMajor(Double major) {
        this.major = major;
        return this;
    }

    /**
     * 重要级别的阈值
     * minimum: 0
     * maximum: 1.7976931348623156E+108
     * @return major
     */
    public Double getMajor() {
        return major;
    }

    public void setMajor(Double major) {
        this.major = major;
    }

    public HierarchicalValue withMinor(Double minor) {
        this.minor = minor;
        return this;
    }

    /**
     * 次要级别的阈值
     * minimum: 0
     * maximum: 1.7976931348623156E+108
     * @return minor
     */
    public Double getMinor() {
        return minor;
    }

    public void setMinor(Double minor) {
        this.minor = minor;
    }

    public HierarchicalValue withInfo(Double info) {
        this.info = info;
        return this;
    }

    /**
     * 提示级别的阈值
     * minimum: 0
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
        HierarchicalValue that = (HierarchicalValue) obj;
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
        sb.append("class HierarchicalValue {\n");
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
