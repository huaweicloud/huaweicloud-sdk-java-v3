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
public class ShowDomainsNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uos_domain_list")

    private List<UosDomainInfo> uosDomainList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_infos")

    private List<AdDomain> domainInfos = null;

    public ShowDomainsNewResponse withUosDomainList(List<UosDomainInfo> uosDomainList) {
        this.uosDomainList = uosDomainList;
        return this;
    }

    public ShowDomainsNewResponse addUosDomainListItem(UosDomainInfo uosDomainListItem) {
        if (this.uosDomainList == null) {
            this.uosDomainList = new ArrayList<>();
        }
        this.uosDomainList.add(uosDomainListItem);
        return this;
    }

    public ShowDomainsNewResponse withUosDomainList(Consumer<List<UosDomainInfo>> uosDomainListSetter) {
        if (this.uosDomainList == null) {
            this.uosDomainList = new ArrayList<>();
        }
        uosDomainListSetter.accept(this.uosDomainList);
        return this;
    }

    /**
     * 统信域控列表。
     * @return uosDomainList
     */
    public List<UosDomainInfo> getUosDomainList() {
        return uosDomainList;
    }

    public void setUosDomainList(List<UosDomainInfo> uosDomainList) {
        this.uosDomainList = uosDomainList;
    }

    public ShowDomainsNewResponse withDomainInfos(List<AdDomain> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }

    public ShowDomainsNewResponse addDomainInfosItem(AdDomain domainInfosItem) {
        if (this.domainInfos == null) {
            this.domainInfos = new ArrayList<>();
        }
        this.domainInfos.add(domainInfosItem);
        return this;
    }

    public ShowDomainsNewResponse withDomainInfos(Consumer<List<AdDomain>> domainInfosSetter) {
        if (this.domainInfos == null) {
            this.domainInfos = new ArrayList<>();
        }
        domainInfosSetter.accept(this.domainInfos);
        return this;
    }

    /**
     * 域信息。
     * @return domainInfos
     */
    public List<AdDomain> getDomainInfos() {
        return domainInfos;
    }

    public void setDomainInfos(List<AdDomain> domainInfos) {
        this.domainInfos = domainInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainsNewResponse that = (ShowDomainsNewResponse) obj;
        return Objects.equals(this.uosDomainList, that.uosDomainList)
            && Objects.equals(this.domainInfos, that.domainInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uosDomainList, domainInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainsNewResponse {\n");
        sb.append("    uosDomainList: ").append(toIndentedString(uosDomainList)).append("\n");
        sb.append("    domainInfos: ").append(toIndentedString(domainInfos)).append("\n");
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
