package com.huaweicloud.sdk.eip.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.FloatingIpResp;
import com.huaweicloud.sdk.eip.v2.model.Pager;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NeutronListFloatingIpsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingips")
    
    private List<FloatingIpResp> floatingips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingips_links")
    
    private List<Pager> floatingipsLinks = null;
    
    public NeutronListFloatingIpsResponse withFloatingips(List<FloatingIpResp> floatingips) {
        this.floatingips = floatingips;
        return this;
    }

    
    public NeutronListFloatingIpsResponse addFloatingipsItem(FloatingIpResp floatingipsItem) {
        this.floatingips.add(floatingipsItem);
        return this;
    }

    public NeutronListFloatingIpsResponse withFloatingips(Consumer<List<FloatingIpResp>> floatingipsSetter) {
        if(this.floatingips == null ){
            this.floatingips = new ArrayList<>();
        }
        floatingipsSetter.accept(this.floatingips);
        return this;
    }

    /**
     * floatingip对象列表
     * @return floatingips
     */
    public List<FloatingIpResp> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<FloatingIpResp> floatingips) {
        this.floatingips = floatingips;
    }

    

    public NeutronListFloatingIpsResponse withFloatingipsLinks(List<Pager> floatingipsLinks) {
        this.floatingipsLinks = floatingipsLinks;
        return this;
    }

    
    public NeutronListFloatingIpsResponse addFloatingipsLinksItem(Pager floatingipsLinksItem) {
        this.floatingipsLinks.add(floatingipsLinksItem);
        return this;
    }

    public NeutronListFloatingIpsResponse withFloatingipsLinks(Consumer<List<Pager>> floatingipsLinksSetter) {
        if(this.floatingipsLinks == null ){
            this.floatingipsLinks = new ArrayList<>();
        }
        floatingipsLinksSetter.accept(this.floatingipsLinks);
        return this;
    }

    /**
     * marker分页结构
     * @return floatingipsLinks
     */
    public List<Pager> getFloatingipsLinks() {
        return floatingipsLinks;
    }

    public void setFloatingipsLinks(List<Pager> floatingipsLinks) {
        this.floatingipsLinks = floatingipsLinks;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListFloatingIpsResponse neutronListFloatingIpsResponse = (NeutronListFloatingIpsResponse) o;
        return Objects.equals(this.floatingips, neutronListFloatingIpsResponse.floatingips) &&
            Objects.equals(this.floatingipsLinks, neutronListFloatingIpsResponse.floatingipsLinks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floatingips, floatingipsLinks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFloatingIpsResponse {\n");
        sb.append("    floatingips: ").append(toIndentedString(floatingips)).append("\n");
        sb.append("    floatingipsLinks: ").append(toIndentedString(floatingipsLinks)).append("\n");
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

