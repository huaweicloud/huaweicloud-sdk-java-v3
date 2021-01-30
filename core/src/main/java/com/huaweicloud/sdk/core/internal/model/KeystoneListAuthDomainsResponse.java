package com.huaweicloud.sdk.core.internal.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

public class KeystoneListAuthDomainsResponse extends SdkResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")
    private List<Domain> domains = null;

    public KeystoneListAuthDomainsResponse withDomains(List<Domain> domains) {
        this.domains = domains;
        return this;
    }

    public KeystoneListAuthDomainsResponse addDomainsItem(Domain domainItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainItem);
        return this;
    }

    public KeystoneListAuthDomainsResponse withDomains(Consumer<List<Domain>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 账号信息列表。
     *
     * @return domains
     */
    public List<Domain> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain> domains) {
        this.domains = domains;
    }

}

