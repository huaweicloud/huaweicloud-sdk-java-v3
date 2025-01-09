package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListNatMappingConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_on")

    private Boolean natOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vag_ips")

    private List<String> vagIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_vag_maps")

    private List<NatMappingConfig> natVagMaps = null;

    public ListNatMappingConfigsResponse withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public ListNatMappingConfigsResponse withNatOn(Boolean natOn) {
        this.natOn = natOn;
        return this;
    }

    /**
     * 是否开启nat映射。
     * @return natOn
     */
    public Boolean getNatOn() {
        return natOn;
    }

    public void setNatOn(Boolean natOn) {
        this.natOn = natOn;
    }

    public ListNatMappingConfigsResponse withVagIps(List<String> vagIps) {
        this.vagIps = vagIps;
        return this;
    }

    public ListNatMappingConfigsResponse addVagIpsItem(String vagIpsItem) {
        if (this.vagIps == null) {
            this.vagIps = new ArrayList<>();
        }
        this.vagIps.add(vagIpsItem);
        return this;
    }

    public ListNatMappingConfigsResponse withVagIps(Consumer<List<String>> vagIpsSetter) {
        if (this.vagIps == null) {
            this.vagIps = new ArrayList<>();
        }
        vagIpsSetter.accept(this.vagIps);
        return this;
    }

    /**
     * vag Ip列表。
     * @return vagIps
     */
    public List<String> getVagIps() {
        return vagIps;
    }

    public void setVagIps(List<String> vagIps) {
        this.vagIps = vagIps;
    }

    public ListNatMappingConfigsResponse withNatVagMaps(List<NatMappingConfig> natVagMaps) {
        this.natVagMaps = natVagMaps;
        return this;
    }

    public ListNatMappingConfigsResponse addNatVagMapsItem(NatMappingConfig natVagMapsItem) {
        if (this.natVagMaps == null) {
            this.natVagMaps = new ArrayList<>();
        }
        this.natVagMaps.add(natVagMapsItem);
        return this;
    }

    public ListNatMappingConfigsResponse withNatVagMaps(Consumer<List<NatMappingConfig>> natVagMapsSetter) {
        if (this.natVagMaps == null) {
            this.natVagMaps = new ArrayList<>();
        }
        natVagMapsSetter.accept(this.natVagMaps);
        return this;
    }

    /**
     * NAT映射配置表。
     * @return natVagMaps
     */
    public List<NatMappingConfig> getNatVagMaps() {
        return natVagMaps;
    }

    public void setNatVagMaps(List<NatMappingConfig> natVagMaps) {
        this.natVagMaps = natVagMaps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNatMappingConfigsResponse that = (ListNatMappingConfigsResponse) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.natOn, that.natOn)
            && Objects.equals(this.vagIps, that.vagIps) && Objects.equals(this.natVagMaps, that.natVagMaps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, natOn, vagIps, natVagMaps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatMappingConfigsResponse {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    natOn: ").append(toIndentedString(natOn)).append("\n");
        sb.append("    vagIps: ").append(toIndentedString(vagIps)).append("\n");
        sb.append("    natVagMaps: ").append(toIndentedString(natVagMaps)).append("\n");
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
