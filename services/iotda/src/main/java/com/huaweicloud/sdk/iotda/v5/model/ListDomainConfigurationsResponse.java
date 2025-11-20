package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListDomainConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_configurations")

    private List<DomainConfigurationDTO> domainConfigurations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDomainConfigurationsResponse withDomainConfigurations(
        List<DomainConfigurationDTO> domainConfigurations) {
        this.domainConfigurations = domainConfigurations;
        return this;
    }

    public ListDomainConfigurationsResponse addDomainConfigurationsItem(
        DomainConfigurationDTO domainConfigurationsItem) {
        if (this.domainConfigurations == null) {
            this.domainConfigurations = new ArrayList<>();
        }
        this.domainConfigurations.add(domainConfigurationsItem);
        return this;
    }

    public ListDomainConfigurationsResponse withDomainConfigurations(
        Consumer<List<DomainConfigurationDTO>> domainConfigurationsSetter) {
        if (this.domainConfigurations == null) {
            this.domainConfigurations = new ArrayList<>();
        }
        domainConfigurationsSetter.accept(this.domainConfigurations);
        return this;
    }

    /**
     * **参数说明**：域配置列表。
     * @return domainConfigurations
     */
    public List<DomainConfigurationDTO> getDomainConfigurations() {
        return domainConfigurations;
    }

    public void setDomainConfigurations(List<DomainConfigurationDTO> domainConfigurations) {
        this.domainConfigurations = domainConfigurations;
    }

    public ListDomainConfigurationsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDomainConfigurationsResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainConfigurationsResponse that = (ListDomainConfigurationsResponse) obj;
        return Objects.equals(this.domainConfigurations, that.domainConfigurations)
            && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainConfigurations, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainConfigurationsResponse {\n");
        sb.append("    domainConfigurations: ").append(toIndentedString(domainConfigurations)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
