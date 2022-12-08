package com.huaweicloud.sdk.eip.v2.model;

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
public class ListBandwidthPkgResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidthpkgs")

    private List<BandwidthPkgResp> bandwidthpkgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidthpkgs_links")

    private List<BandwidthPkgPage> bandwidthpkgsLinks = null;

    public ListBandwidthPkgResponse withBandwidthpkgs(List<BandwidthPkgResp> bandwidthpkgs) {
        this.bandwidthpkgs = bandwidthpkgs;
        return this;
    }

    public ListBandwidthPkgResponse addBandwidthpkgsItem(BandwidthPkgResp bandwidthpkgsItem) {
        if (this.bandwidthpkgs == null) {
            this.bandwidthpkgs = new ArrayList<>();
        }
        this.bandwidthpkgs.add(bandwidthpkgsItem);
        return this;
    }

    public ListBandwidthPkgResponse withBandwidthpkgs(Consumer<List<BandwidthPkgResp>> bandwidthpkgsSetter) {
        if (this.bandwidthpkgs == null) {
            this.bandwidthpkgs = new ArrayList<>();
        }
        bandwidthpkgsSetter.accept(this.bandwidthpkgs);
        return this;
    }

    /**
     * bandwidthpkg对象列表
     * @return bandwidthpkgs
     */
    public List<BandwidthPkgResp> getBandwidthpkgs() {
        return bandwidthpkgs;
    }

    public void setBandwidthpkgs(List<BandwidthPkgResp> bandwidthpkgs) {
        this.bandwidthpkgs = bandwidthpkgs;
    }

    public ListBandwidthPkgResponse withBandwidthpkgsLinks(List<BandwidthPkgPage> bandwidthpkgsLinks) {
        this.bandwidthpkgsLinks = bandwidthpkgsLinks;
        return this;
    }

    public ListBandwidthPkgResponse addBandwidthpkgsLinksItem(BandwidthPkgPage bandwidthpkgsLinksItem) {
        if (this.bandwidthpkgsLinks == null) {
            this.bandwidthpkgsLinks = new ArrayList<>();
        }
        this.bandwidthpkgsLinks.add(bandwidthpkgsLinksItem);
        return this;
    }

    public ListBandwidthPkgResponse withBandwidthpkgsLinks(Consumer<List<BandwidthPkgPage>> bandwidthpkgsLinksSetter) {
        if (this.bandwidthpkgsLinks == null) {
            this.bandwidthpkgsLinks = new ArrayList<>();
        }
        bandwidthpkgsLinksSetter.accept(this.bandwidthpkgsLinks);
        return this;
    }

    /**
     * 翻页展示
     * @return bandwidthpkgsLinks
     */
    public List<BandwidthPkgPage> getBandwidthpkgsLinks() {
        return bandwidthpkgsLinks;
    }

    public void setBandwidthpkgsLinks(List<BandwidthPkgPage> bandwidthpkgsLinks) {
        this.bandwidthpkgsLinks = bandwidthpkgsLinks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBandwidthPkgResponse listBandwidthPkgResponse = (ListBandwidthPkgResponse) o;
        return Objects.equals(this.bandwidthpkgs, listBandwidthPkgResponse.bandwidthpkgs)
            && Objects.equals(this.bandwidthpkgsLinks, listBandwidthPkgResponse.bandwidthpkgsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthpkgs, bandwidthpkgsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthPkgResponse {\n");
        sb.append("    bandwidthpkgs: ").append(toIndentedString(bandwidthpkgs)).append("\n");
        sb.append("    bandwidthpkgsLinks: ").append(toIndentedString(bandwidthpkgsLinks)).append("\n");
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
