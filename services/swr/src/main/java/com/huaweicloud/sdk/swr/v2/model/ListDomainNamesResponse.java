package com.huaweicloud.sdk.swr.v2.model;

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
public class ListDomainNamesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name_infos")

    private List<DomainNameInfo> domainNameInfos = null;

    public ListDomainNamesResponse withDomainNameInfos(List<DomainNameInfo> domainNameInfos) {
        this.domainNameInfos = domainNameInfos;
        return this;
    }

    public ListDomainNamesResponse addDomainNameInfosItem(DomainNameInfo domainNameInfosItem) {
        if (this.domainNameInfos == null) {
            this.domainNameInfos = new ArrayList<>();
        }
        this.domainNameInfos.add(domainNameInfosItem);
        return this;
    }

    public ListDomainNamesResponse withDomainNameInfos(Consumer<List<DomainNameInfo>> domainNameInfosSetter) {
        if (this.domainNameInfos == null) {
            this.domainNameInfos = new ArrayList<>();
        }
        domainNameInfosSetter.accept(this.domainNameInfos);
        return this;
    }

    /**
     * 域名信息
     * @return domainNameInfos
     */
    public List<DomainNameInfo> getDomainNameInfos() {
        return domainNameInfos;
    }

    public void setDomainNameInfos(List<DomainNameInfo> domainNameInfos) {
        this.domainNameInfos = domainNameInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainNamesResponse that = (ListDomainNamesResponse) obj;
        return Objects.equals(this.domainNameInfos, that.domainNameInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainNameInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainNamesResponse {\n");
        sb.append("    domainNameInfos: ").append(toIndentedString(domainNameInfos)).append("\n");
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
