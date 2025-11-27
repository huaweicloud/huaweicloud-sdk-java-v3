package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSpecialUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Long status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private Long metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flux_metric")

    private Long fluxMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cy")

    private Long cy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "h6")

    private Long h6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "c")

    private Long c;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc")

    private Long sc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bhc")

    private Long bhc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi")

    private Long pi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp5")

    private Long exp5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "m1")

    private Long m1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_month_m5")

    private Long isMonthM5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_agy")

    private Long expAgy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ces_report_site")

    private Long cesReportSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "float")

    private Long _float;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_up_bw")

    private Long isShowUpBw;

    public ShowSpecialUserResponse withStatus(Long status) {
        this.status = status;
        return this;
    }

    /**
     * 1表示用户可以查询总请求时长枚举，0表示用户不可以查询总请求时长枚举
     * @return status
     */
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public ShowSpecialUserResponse withMetric(Long metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 进制
     * @return metric
     */
    public Long getMetric() {
        return metric;
    }

    public void setMetric(Long metric) {
        this.metric = metric;
    }

    public ShowSpecialUserResponse withFluxMetric(Long fluxMetric) {
        this.fluxMetric = fluxMetric;
        return this;
    }

    /**
     * 流量进制
     * @return fluxMetric
     */
    public Long getFluxMetric() {
        return fluxMetric;
    }

    public void setFluxMetric(Long fluxMetric) {
        this.fluxMetric = fluxMetric;
    }

    public ShowSpecialUserResponse withCy(Long cy) {
        this.cy = cy;
        return this;
    }

    /**
     * 1表示用户可以，0表示用户不可以。是否是开放国家及地区界面用户
     * @return cy
     */
    public Long getCy() {
        return cy;
    }

    public void setCy(Long cy) {
        this.cy = cy;
    }

    public ShowSpecialUserResponse withH6(Long h6) {
        this.h6 = h6;
        return this;
    }

    /**
     * 1表示用户可以查询ipv6流量,https流量，0表示用户不可以
     * @return h6
     */
    public Long getH6() {
        return h6;
    }

    public void setH6(Long h6) {
        this.h6 = h6;
    }

    public ShowSpecialUserResponse withC(Long c) {
        this.c = c;
        return this;
    }

    /**
     * 1表示用户可以查询具体的状态码详情，0表示用户不可以
     * @return c
     */
    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    public ShowSpecialUserResponse withSc(Long sc) {
        this.sc = sc;
        return this;
    }

    /**
     * 1表示用户查询 top url 时要返回http状态码，0表示用户不返回
     * @return sc
     */
    public Long getSc() {
        return sc;
    }

    public void setSc(Long sc) {
        this.sc = sc;
    }

    public ShowSpecialUserResponse withBhc(Long bhc) {
        this.bhc = bhc;
        return this;
    }

    /**
     * 1表示该用户可以查询回源状态码，0表示不可以
     * @return bhc
     */
    public Long getBhc() {
        return bhc;
    }

    public void setBhc(Long bhc) {
        this.bhc = bhc;
    }

    public ShowSpecialUserResponse withPi(Long pi) {
        this.pi = pi;
        return this;
    }

    /**
     * 1表示该用户可以查询protocol和IPVersion，0表示用户不可以
     * @return pi
     */
    public Long getPi() {
        return pi;
    }

    public void setPi(Long pi) {
        this.pi = pi;
    }

    public ShowSpecialUserResponse withExp5(Long exp5) {
        this.exp5 = exp5;
        return this;
    }

    /**
     * 1表示该用户可以查询租户界面5分钟粒度数据导出白名单，0表示用户不可以
     * @return exp5
     */
    public Long getExp5() {
        return exp5;
    }

    public void setExp5(Long exp5) {
        this.exp5 = exp5;
    }

    public ShowSpecialUserResponse withM1(Long m1) {
        this.m1 = m1;
        return this;
    }

    /**
     * 1表示该用户可以查询1分钟粒度统计数据，0表示用户不可以
     * @return m1
     */
    public Long getM1() {
        return m1;
    }

    public void setM1(Long m1) {
        this.m1 = m1;
    }

    public ShowSpecialUserResponse withIsMonthM5(Long isMonthM5) {
        this.isMonthM5 = isMonthM5;
        return this;
    }

    /**
     * 1表示该用户可以查询1个月5分钟粒度统计数据，0表示用户不可以
     * @return isMonthM5
     */
    public Long getIsMonthM5() {
        return isMonthM5;
    }

    public void setIsMonthM5(Long isMonthM5) {
        this.isMonthM5 = isMonthM5;
    }

    public ShowSpecialUserResponse withExpAgy(Long expAgy) {
        this.expAgy = expAgy;
        return this;
    }

    /**
     * 1表示该用户可以在租户界面指定下载链接可用范围，0表示用户不可以
     * @return expAgy
     */
    public Long getExpAgy() {
        return expAgy;
    }

    public void setExpAgy(Long expAgy) {
        this.expAgy = expAgy;
    }

    public ShowSpecialUserResponse withCesReportSite(Long cesReportSite) {
        this.cesReportSite = cesReportSite;
        return this;
    }

    /**
     * 1表示该用户可以是否上报到国际站CES，0表示用户不可以
     * @return cesReportSite
     */
    public Long getCesReportSite() {
        return cesReportSite;
    }

    public void setCesReportSite(Long cesReportSite) {
        this.cesReportSite = cesReportSite;
    }

    public ShowSpecialUserResponse withFloat(Long _float) {
        this._float = _float;
        return this;
    }

    /**
     * 1表示该用户按上浮系数展示数据，0表示用户不可以
     * @return _float
     */
    public Long getFloat() {
        return _float;
    }

    public void setFloat(Long _float) {
        this._float = _float;
    }

    public ShowSpecialUserResponse withIsShowUpBw(Long isShowUpBw) {
        this.isShowUpBw = isShowUpBw;
        return this;
    }

    /**
     * 1表示该用户允许查询入网带宽，0表示用户不可以
     * @return isShowUpBw
     */
    public Long getIsShowUpBw() {
        return isShowUpBw;
    }

    public void setIsShowUpBw(Long isShowUpBw) {
        this.isShowUpBw = isShowUpBw;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSpecialUserResponse that = (ShowSpecialUserResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.fluxMetric, that.fluxMetric) && Objects.equals(this.cy, that.cy)
            && Objects.equals(this.h6, that.h6) && Objects.equals(this.c, that.c) && Objects.equals(this.sc, that.sc)
            && Objects.equals(this.bhc, that.bhc) && Objects.equals(this.pi, that.pi)
            && Objects.equals(this.exp5, that.exp5) && Objects.equals(this.m1, that.m1)
            && Objects.equals(this.isMonthM5, that.isMonthM5) && Objects.equals(this.expAgy, that.expAgy)
            && Objects.equals(this.cesReportSite, that.cesReportSite) && Objects.equals(this._float, that._float)
            && Objects.equals(this.isShowUpBw, that.isShowUpBw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            metric,
            fluxMetric,
            cy,
            h6,
            c,
            sc,
            bhc,
            pi,
            exp5,
            m1,
            isMonthM5,
            expAgy,
            cesReportSite,
            _float,
            isShowUpBw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpecialUserResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    fluxMetric: ").append(toIndentedString(fluxMetric)).append("\n");
        sb.append("    cy: ").append(toIndentedString(cy)).append("\n");
        sb.append("    h6: ").append(toIndentedString(h6)).append("\n");
        sb.append("    c: ").append(toIndentedString(c)).append("\n");
        sb.append("    sc: ").append(toIndentedString(sc)).append("\n");
        sb.append("    bhc: ").append(toIndentedString(bhc)).append("\n");
        sb.append("    pi: ").append(toIndentedString(pi)).append("\n");
        sb.append("    exp5: ").append(toIndentedString(exp5)).append("\n");
        sb.append("    m1: ").append(toIndentedString(m1)).append("\n");
        sb.append("    isMonthM5: ").append(toIndentedString(isMonthM5)).append("\n");
        sb.append("    expAgy: ").append(toIndentedString(expAgy)).append("\n");
        sb.append("    cesReportSite: ").append(toIndentedString(cesReportSite)).append("\n");
        sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
        sb.append("    isShowUpBw: ").append(toIndentedString(isShowUpBw)).append("\n");
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
