package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InternetReport
 */
public class InternetReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private Eip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in2out")

    private In2Out in2out;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out2in")

    private Out2in out2in;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview")

    private Overview overview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_trend")

    private List<TrendVO> trafficTrend = null;

    public InternetReport withEip(Eip eip) {
        this.eip = eip;
        return this;
    }

    public InternetReport withEip(Consumer<Eip> eipSetter) {
        if (this.eip == null) {
            this.eip = new Eip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public Eip getEip() {
        return eip;
    }

    public void setEip(Eip eip) {
        this.eip = eip;
    }

    public InternetReport withIn2out(In2Out in2out) {
        this.in2out = in2out;
        return this;
    }

    public InternetReport withIn2out(Consumer<In2Out> in2outSetter) {
        if (this.in2out == null) {
            this.in2out = new In2Out();
            in2outSetter.accept(this.in2out);
        }

        return this;
    }

    /**
     * Get in2out
     * @return in2out
     */
    public In2Out getIn2out() {
        return in2out;
    }

    public void setIn2out(In2Out in2out) {
        this.in2out = in2out;
    }

    public InternetReport withOut2in(Out2in out2in) {
        this.out2in = out2in;
        return this;
    }

    public InternetReport withOut2in(Consumer<Out2in> out2inSetter) {
        if (this.out2in == null) {
            this.out2in = new Out2in();
            out2inSetter.accept(this.out2in);
        }

        return this;
    }

    /**
     * Get out2in
     * @return out2in
     */
    public Out2in getOut2in() {
        return out2in;
    }

    public void setOut2in(Out2in out2in) {
        this.out2in = out2in;
    }

    public InternetReport withOverview(Overview overview) {
        this.overview = overview;
        return this;
    }

    public InternetReport withOverview(Consumer<Overview> overviewSetter) {
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

    public InternetReport withTrafficTrend(List<TrendVO> trafficTrend) {
        this.trafficTrend = trafficTrend;
        return this;
    }

    public InternetReport addTrafficTrendItem(TrendVO trafficTrendItem) {
        if (this.trafficTrend == null) {
            this.trafficTrend = new ArrayList<>();
        }
        this.trafficTrend.add(trafficTrendItem);
        return this;
    }

    public InternetReport withTrafficTrend(Consumer<List<TrendVO>> trafficTrendSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternetReport that = (InternetReport) obj;
        return Objects.equals(this.eip, that.eip) && Objects.equals(this.in2out, that.in2out)
            && Objects.equals(this.out2in, that.out2in) && Objects.equals(this.overview, that.overview)
            && Objects.equals(this.trafficTrend, that.trafficTrend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip, in2out, out2in, overview, trafficTrend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InternetReport {\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    in2out: ").append(toIndentedString(in2out)).append("\n");
        sb.append("    out2in: ").append(toIndentedString(out2in)).append("\n");
        sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
        sb.append("    trafficTrend: ").append(toIndentedString(trafficTrend)).append("\n");
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
