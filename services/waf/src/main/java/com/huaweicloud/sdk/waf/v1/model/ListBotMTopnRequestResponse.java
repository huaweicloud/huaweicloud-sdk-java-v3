package com.huaweicloud.sdk.waf.v1.model;

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
public class ListBotMTopnRequestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_known_bots")

    private List<TypedStatBucket> topnKnownBots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_domains")

    private List<TypedStatBucket> topnDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_src_ips")

    private List<TypedStatBucket> topnSrcIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_src_ip_asns")

    private List<TypedStatBucket> topnSrcIpAsns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_src_ip_geolocations")

    private List<TypedStatBucket> topnSrcIpGeolocations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_ja4_fps")

    private List<TypedStatBucket> topnJa4Fps = null;

    public ListBotMTopnRequestResponse withTopnKnownBots(List<TypedStatBucket> topnKnownBots) {
        this.topnKnownBots = topnKnownBots;
        return this;
    }

    public ListBotMTopnRequestResponse addTopnKnownBotsItem(TypedStatBucket topnKnownBotsItem) {
        if (this.topnKnownBots == null) {
            this.topnKnownBots = new ArrayList<>();
        }
        this.topnKnownBots.add(topnKnownBotsItem);
        return this;
    }

    public ListBotMTopnRequestResponse withTopnKnownBots(Consumer<List<TypedStatBucket>> topnKnownBotsSetter) {
        if (this.topnKnownBots == null) {
            this.topnKnownBots = new ArrayList<>();
        }
        topnKnownBotsSetter.accept(this.topnKnownBots);
        return this;
    }

    /**
     * **参数解释：** TopN已知BOT的请求统计 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topnKnownBots
     */
    public List<TypedStatBucket> getTopnKnownBots() {
        return topnKnownBots;
    }

    public void setTopnKnownBots(List<TypedStatBucket> topnKnownBots) {
        this.topnKnownBots = topnKnownBots;
    }

    public ListBotMTopnRequestResponse withTopnDomains(List<TypedStatBucket> topnDomains) {
        this.topnDomains = topnDomains;
        return this;
    }

    public ListBotMTopnRequestResponse addTopnDomainsItem(TypedStatBucket topnDomainsItem) {
        if (this.topnDomains == null) {
            this.topnDomains = new ArrayList<>();
        }
        this.topnDomains.add(topnDomainsItem);
        return this;
    }

    public ListBotMTopnRequestResponse withTopnDomains(Consumer<List<TypedStatBucket>> topnDomainsSetter) {
        if (this.topnDomains == null) {
            this.topnDomains = new ArrayList<>();
        }
        topnDomainsSetter.accept(this.topnDomains);
        return this;
    }

    /**
     * **参数解释：** TopN被访问域名的请求统计 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topnDomains
     */
    public List<TypedStatBucket> getTopnDomains() {
        return topnDomains;
    }

    public void setTopnDomains(List<TypedStatBucket> topnDomains) {
        this.topnDomains = topnDomains;
    }

    public ListBotMTopnRequestResponse withTopnSrcIps(List<TypedStatBucket> topnSrcIps) {
        this.topnSrcIps = topnSrcIps;
        return this;
    }

    public ListBotMTopnRequestResponse addTopnSrcIpsItem(TypedStatBucket topnSrcIpsItem) {
        if (this.topnSrcIps == null) {
            this.topnSrcIps = new ArrayList<>();
        }
        this.topnSrcIps.add(topnSrcIpsItem);
        return this;
    }

    public ListBotMTopnRequestResponse withTopnSrcIps(Consumer<List<TypedStatBucket>> topnSrcIpsSetter) {
        if (this.topnSrcIps == null) {
            this.topnSrcIps = new ArrayList<>();
        }
        topnSrcIpsSetter.accept(this.topnSrcIps);
        return this;
    }

    /**
     * **参数解释：** TopN攻击源IP的请求统计 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topnSrcIps
     */
    public List<TypedStatBucket> getTopnSrcIps() {
        return topnSrcIps;
    }

    public void setTopnSrcIps(List<TypedStatBucket> topnSrcIps) {
        this.topnSrcIps = topnSrcIps;
    }

    public ListBotMTopnRequestResponse withTopnSrcIpAsns(List<TypedStatBucket> topnSrcIpAsns) {
        this.topnSrcIpAsns = topnSrcIpAsns;
        return this;
    }

    public ListBotMTopnRequestResponse addTopnSrcIpAsnsItem(TypedStatBucket topnSrcIpAsnsItem) {
        if (this.topnSrcIpAsns == null) {
            this.topnSrcIpAsns = new ArrayList<>();
        }
        this.topnSrcIpAsns.add(topnSrcIpAsnsItem);
        return this;
    }

    public ListBotMTopnRequestResponse withTopnSrcIpAsns(Consumer<List<TypedStatBucket>> topnSrcIpAsnsSetter) {
        if (this.topnSrcIpAsns == null) {
            this.topnSrcIpAsns = new ArrayList<>();
        }
        topnSrcIpAsnsSetter.accept(this.topnSrcIpAsns);
        return this;
    }

    /**
     * **参数解释：** TopN攻击源IP所属ASN的请求统计 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topnSrcIpAsns
     */
    public List<TypedStatBucket> getTopnSrcIpAsns() {
        return topnSrcIpAsns;
    }

    public void setTopnSrcIpAsns(List<TypedStatBucket> topnSrcIpAsns) {
        this.topnSrcIpAsns = topnSrcIpAsns;
    }

    public ListBotMTopnRequestResponse withTopnSrcIpGeolocations(List<TypedStatBucket> topnSrcIpGeolocations) {
        this.topnSrcIpGeolocations = topnSrcIpGeolocations;
        return this;
    }

    public ListBotMTopnRequestResponse addTopnSrcIpGeolocationsItem(TypedStatBucket topnSrcIpGeolocationsItem) {
        if (this.topnSrcIpGeolocations == null) {
            this.topnSrcIpGeolocations = new ArrayList<>();
        }
        this.topnSrcIpGeolocations.add(topnSrcIpGeolocationsItem);
        return this;
    }

    public ListBotMTopnRequestResponse withTopnSrcIpGeolocations(
        Consumer<List<TypedStatBucket>> topnSrcIpGeolocationsSetter) {
        if (this.topnSrcIpGeolocations == null) {
            this.topnSrcIpGeolocations = new ArrayList<>();
        }
        topnSrcIpGeolocationsSetter.accept(this.topnSrcIpGeolocations);
        return this;
    }

    /**
     * **参数解释：** TopN攻击源地区的请求统计 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topnSrcIpGeolocations
     */
    public List<TypedStatBucket> getTopnSrcIpGeolocations() {
        return topnSrcIpGeolocations;
    }

    public void setTopnSrcIpGeolocations(List<TypedStatBucket> topnSrcIpGeolocations) {
        this.topnSrcIpGeolocations = topnSrcIpGeolocations;
    }

    public ListBotMTopnRequestResponse withTopnJa4Fps(List<TypedStatBucket> topnJa4Fps) {
        this.topnJa4Fps = topnJa4Fps;
        return this;
    }

    public ListBotMTopnRequestResponse addTopnJa4FpsItem(TypedStatBucket topnJa4FpsItem) {
        if (this.topnJa4Fps == null) {
            this.topnJa4Fps = new ArrayList<>();
        }
        this.topnJa4Fps.add(topnJa4FpsItem);
        return this;
    }

    public ListBotMTopnRequestResponse withTopnJa4Fps(Consumer<List<TypedStatBucket>> topnJa4FpsSetter) {
        if (this.topnJa4Fps == null) {
            this.topnJa4Fps = new ArrayList<>();
        }
        topnJa4FpsSetter.accept(this.topnJa4Fps);
        return this;
    }

    /**
     * **参数解释：** TopN JA4指纹的请求统计 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topnJa4Fps
     */
    public List<TypedStatBucket> getTopnJa4Fps() {
        return topnJa4Fps;
    }

    public void setTopnJa4Fps(List<TypedStatBucket> topnJa4Fps) {
        this.topnJa4Fps = topnJa4Fps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBotMTopnRequestResponse that = (ListBotMTopnRequestResponse) obj;
        return Objects.equals(this.topnKnownBots, that.topnKnownBots)
            && Objects.equals(this.topnDomains, that.topnDomains) && Objects.equals(this.topnSrcIps, that.topnSrcIps)
            && Objects.equals(this.topnSrcIpAsns, that.topnSrcIpAsns)
            && Objects.equals(this.topnSrcIpGeolocations, that.topnSrcIpGeolocations)
            && Objects.equals(this.topnJa4Fps, that.topnJa4Fps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topnKnownBots, topnDomains, topnSrcIps, topnSrcIpAsns, topnSrcIpGeolocations, topnJa4Fps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBotMTopnRequestResponse {\n");
        sb.append("    topnKnownBots: ").append(toIndentedString(topnKnownBots)).append("\n");
        sb.append("    topnDomains: ").append(toIndentedString(topnDomains)).append("\n");
        sb.append("    topnSrcIps: ").append(toIndentedString(topnSrcIps)).append("\n");
        sb.append("    topnSrcIpAsns: ").append(toIndentedString(topnSrcIpAsns)).append("\n");
        sb.append("    topnSrcIpGeolocations: ").append(toIndentedString(topnSrcIpGeolocations)).append("\n");
        sb.append("    topnJa4Fps: ").append(toIndentedString(topnJa4Fps)).append("\n");
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
