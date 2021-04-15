package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Domains;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListAuthDomainsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domains")
    
    private List<Domains> domains = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links;

    public KeystoneListAuthDomainsResponse withDomains(List<Domains> domains) {
        this.domains = domains;
        return this;
    }

    
    public KeystoneListAuthDomainsResponse addDomainsItem(Domains domainsItem) {
        if(this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public KeystoneListAuthDomainsResponse withDomains(Consumer<List<Domains>> domainsSetter) {
        if(this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 账号信息列表。
     * @return domains
     */
    public List<Domains> getDomains() {
        return domains;
    }

    public void setDomains(List<Domains> domains) {
        this.domains = domains;
    }

    

    public KeystoneListAuthDomainsResponse withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public KeystoneListAuthDomainsResponse withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListAuthDomainsResponse keystoneListAuthDomainsResponse = (KeystoneListAuthDomainsResponse) o;
        return Objects.equals(this.domains, keystoneListAuthDomainsResponse.domains) &&
            Objects.equals(this.links, keystoneListAuthDomainsResponse.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domains, links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListAuthDomainsResponse {\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

