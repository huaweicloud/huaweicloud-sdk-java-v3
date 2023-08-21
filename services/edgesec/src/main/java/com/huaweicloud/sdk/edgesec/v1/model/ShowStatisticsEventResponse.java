package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStatisticsEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf")

    private List<TimeSeriesData> waf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bot")

    private List<TimeSeriesData> bot = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private List<TimeSeriesData> cc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos")

    private List<TimeSeriesData> ddos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private List<TimeSeriesData> flow = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drop")

    private List<TimeSeriesData> drop = null;

    public ShowStatisticsEventResponse withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * DDos攻击事件次数，type=ddos_attack_count返回
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public ShowStatisticsEventResponse withWaf(List<TimeSeriesData> waf) {
        this.waf = waf;
        return this;
    }

    public ShowStatisticsEventResponse addWafItem(TimeSeriesData wafItem) {
        if (this.waf == null) {
            this.waf = new ArrayList<>();
        }
        this.waf.add(wafItem);
        return this;
    }

    public ShowStatisticsEventResponse withWaf(Consumer<List<TimeSeriesData>> wafSetter) {
        if (this.waf == null) {
            this.waf = new ArrayList<>();
        }
        wafSetter.accept(this.waf);
        return this;
    }

    /**
     * WAF攻击事件次数，type=attack_count时返回
     * @return waf
     */
    public List<TimeSeriesData> getWaf() {
        return waf;
    }

    public void setWaf(List<TimeSeriesData> waf) {
        this.waf = waf;
    }

    public ShowStatisticsEventResponse withBot(List<TimeSeriesData> bot) {
        this.bot = bot;
        return this;
    }

    public ShowStatisticsEventResponse addBotItem(TimeSeriesData botItem) {
        if (this.bot == null) {
            this.bot = new ArrayList<>();
        }
        this.bot.add(botItem);
        return this;
    }

    public ShowStatisticsEventResponse withBot(Consumer<List<TimeSeriesData>> botSetter) {
        if (this.bot == null) {
            this.bot = new ArrayList<>();
        }
        botSetter.accept(this.bot);
        return this;
    }

    /**
     * BOT攻击事件次数，type=attack_count时返回
     * @return bot
     */
    public List<TimeSeriesData> getBot() {
        return bot;
    }

    public void setBot(List<TimeSeriesData> bot) {
        this.bot = bot;
    }

    public ShowStatisticsEventResponse withCc(List<TimeSeriesData> cc) {
        this.cc = cc;
        return this;
    }

    public ShowStatisticsEventResponse addCcItem(TimeSeriesData ccItem) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        this.cc.add(ccItem);
        return this;
    }

    public ShowStatisticsEventResponse withCc(Consumer<List<TimeSeriesData>> ccSetter) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        ccSetter.accept(this.cc);
        return this;
    }

    /**
     * CC攻击事件次数，type=attack_count时返回
     * @return cc
     */
    public List<TimeSeriesData> getCc() {
        return cc;
    }

    public void setCc(List<TimeSeriesData> cc) {
        this.cc = cc;
    }

    public ShowStatisticsEventResponse withDdos(List<TimeSeriesData> ddos) {
        this.ddos = ddos;
        return this;
    }

    public ShowStatisticsEventResponse addDdosItem(TimeSeriesData ddosItem) {
        if (this.ddos == null) {
            this.ddos = new ArrayList<>();
        }
        this.ddos.add(ddosItem);
        return this;
    }

    public ShowStatisticsEventResponse withDdos(Consumer<List<TimeSeriesData>> ddosSetter) {
        if (this.ddos == null) {
            this.ddos = new ArrayList<>();
        }
        ddosSetter.accept(this.ddos);
        return this;
    }

    /**
     * DDos攻击事件次数，type=attack_count返回
     * @return ddos
     */
    public List<TimeSeriesData> getDdos() {
        return ddos;
    }

    public void setDdos(List<TimeSeriesData> ddos) {
        this.ddos = ddos;
    }

    public ShowStatisticsEventResponse withFlow(List<TimeSeriesData> flow) {
        this.flow = flow;
        return this;
    }

    public ShowStatisticsEventResponse addFlowItem(TimeSeriesData flowItem) {
        if (this.flow == null) {
            this.flow = new ArrayList<>();
        }
        this.flow.add(flowItem);
        return this;
    }

    public ShowStatisticsEventResponse withFlow(Consumer<List<TimeSeriesData>> flowSetter) {
        if (this.flow == null) {
            this.flow = new ArrayList<>();
        }
        flowSetter.accept(this.flow);
        return this;
    }

    /**
     * 访问次数，type=flow_drop_count返回
     * @return flow
     */
    public List<TimeSeriesData> getFlow() {
        return flow;
    }

    public void setFlow(List<TimeSeriesData> flow) {
        this.flow = flow;
    }

    public ShowStatisticsEventResponse withDrop(List<TimeSeriesData> drop) {
        this.drop = drop;
        return this;
    }

    public ShowStatisticsEventResponse addDropItem(TimeSeriesData dropItem) {
        if (this.drop == null) {
            this.drop = new ArrayList<>();
        }
        this.drop.add(dropItem);
        return this;
    }

    public ShowStatisticsEventResponse withDrop(Consumer<List<TimeSeriesData>> dropSetter) {
        if (this.drop == null) {
            this.drop = new ArrayList<>();
        }
        dropSetter.accept(this.drop);
        return this;
    }

    /**
     * 攻击次数，type=flow_drop_count返回
     * @return drop
     */
    public List<TimeSeriesData> getDrop() {
        return drop;
    }

    public void setDrop(List<TimeSeriesData> drop) {
        this.drop = drop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticsEventResponse that = (ShowStatisticsEventResponse) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.waf, that.waf)
            && Objects.equals(this.bot, that.bot) && Objects.equals(this.cc, that.cc)
            && Objects.equals(this.ddos, that.ddos) && Objects.equals(this.flow, that.flow)
            && Objects.equals(this.drop, that.drop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, waf, bot, cc, ddos, flow, drop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticsEventResponse {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    waf: ").append(toIndentedString(waf)).append("\n");
        sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    ddos: ").append(toIndentedString(ddos)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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
