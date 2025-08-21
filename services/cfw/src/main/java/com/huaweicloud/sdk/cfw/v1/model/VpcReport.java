package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VpcReport
 */
public class VpcReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private List<ItemVO> app = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private List<ItemVO> dstIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview")

    private Overview overview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private List<ItemVO> srcIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_trend")

    private List<TrendVO> trafficTrend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private Vpc vpc;

    public VpcReport withApp(List<ItemVO> app) {
        this.app = app;
        return this;
    }

    public VpcReport addAppItem(ItemVO appItem) {
        if (this.app == null) {
            this.app = new ArrayList<>();
        }
        this.app.add(appItem);
        return this;
    }

    public VpcReport withApp(Consumer<List<ItemVO>> appSetter) {
        if (this.app == null) {
            this.app = new ArrayList<>();
        }
        appSetter.accept(this.app);
        return this;
    }

    /**
     * **参数解释**： TOP应用数量 **取值范围**： 不涉及
     * @return app
     */
    public List<ItemVO> getApp() {
        return app;
    }

    public void setApp(List<ItemVO> app) {
        this.app = app;
    }

    public VpcReport withDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public VpcReport addDstIpItem(ItemVO dstIpItem) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        this.dstIp.add(dstIpItem);
        return this;
    }

    public VpcReport withDstIp(Consumer<List<ItemVO>> dstIpSetter) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        dstIpSetter.accept(this.dstIp);
        return this;
    }

    /**
     * **参数解释**： TOP访问目的IP **取值范围**： 不涉及
     * @return dstIp
     */
    public List<ItemVO> getDstIp() {
        return dstIp;
    }

    public void setDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
    }

    public VpcReport withOverview(Overview overview) {
        this.overview = overview;
        return this;
    }

    public VpcReport withOverview(Consumer<Overview> overviewSetter) {
        if (this.overview == null) {
            this.overview = new Overview();
            overviewSetter.accept(this.overview);
        }

        return this;
    }

    /**
     * Get overview
     * @return overview
     */
    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public VpcReport withSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public VpcReport addSrcIpItem(ItemVO srcIpItem) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        this.srcIp.add(srcIpItem);
        return this;
    }

    public VpcReport withSrcIp(Consumer<List<ItemVO>> srcIpSetter) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        srcIpSetter.accept(this.srcIp);
        return this;
    }

    /**
     * **参数解释**： TOP访问源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public List<ItemVO> getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
    }

    public VpcReport withTrafficTrend(List<TrendVO> trafficTrend) {
        this.trafficTrend = trafficTrend;
        return this;
    }

    public VpcReport addTrafficTrendItem(TrendVO trafficTrendItem) {
        if (this.trafficTrend == null) {
            this.trafficTrend = new ArrayList<>();
        }
        this.trafficTrend.add(trafficTrendItem);
        return this;
    }

    public VpcReport withTrafficTrend(Consumer<List<TrendVO>> trafficTrendSetter) {
        if (this.trafficTrend == null) {
            this.trafficTrend = new ArrayList<>();
        }
        trafficTrendSetter.accept(this.trafficTrend);
        return this;
    }

    /**
     * **参数解释**： 流量趋势 **取值范围**： 不涉及
     * @return trafficTrend
     */
    public List<TrendVO> getTrafficTrend() {
        return trafficTrend;
    }

    public void setTrafficTrend(List<TrendVO> trafficTrend) {
        this.trafficTrend = trafficTrend;
    }

    public VpcReport withVpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }

    public VpcReport withVpc(Consumer<Vpc> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new Vpc();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public Vpc getVpc() {
        return vpc;
    }

    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcReport that = (VpcReport) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.dstIp, that.dstIp)
            && Objects.equals(this.overview, that.overview) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.trafficTrend, that.trafficTrend) && Objects.equals(this.vpc, that.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, dstIp, overview, srcIp, trafficTrend, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcReport {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    trafficTrend: ").append(toIndentedString(trafficTrend)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
