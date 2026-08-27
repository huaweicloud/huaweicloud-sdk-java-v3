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
public class ListProtocolConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_configs")

    private List<ProtocolConfigBase> protocolConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListProtocolConfigsResponse withProtocolConfigs(List<ProtocolConfigBase> protocolConfigs) {
        this.protocolConfigs = protocolConfigs;
        return this;
    }

    public ListProtocolConfigsResponse addProtocolConfigsItem(ProtocolConfigBase protocolConfigsItem) {
        if (this.protocolConfigs == null) {
            this.protocolConfigs = new ArrayList<>();
        }
        this.protocolConfigs.add(protocolConfigsItem);
        return this;
    }

    public ListProtocolConfigsResponse withProtocolConfigs(Consumer<List<ProtocolConfigBase>> protocolConfigsSetter) {
        if (this.protocolConfigs == null) {
            this.protocolConfigs = new ArrayList<>();
        }
        protocolConfigsSetter.accept(this.protocolConfigs);
        return this;
    }

    /**
     * 泛协议配置列表
     * @return protocolConfigs
     */
    public List<ProtocolConfigBase> getProtocolConfigs() {
        return protocolConfigs;
    }

    public void setProtocolConfigs(List<ProtocolConfigBase> protocolConfigs) {
        this.protocolConfigs = protocolConfigs;
    }

    public ListProtocolConfigsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListProtocolConfigsResponse withPage(Consumer<Page> pageSetter) {
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
        ListProtocolConfigsResponse that = (ListProtocolConfigsResponse) obj;
        return Objects.equals(this.protocolConfigs, that.protocolConfigs) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolConfigs, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtocolConfigsResponse {\n");
        sb.append("    protocolConfigs: ").append(toIndentedString(protocolConfigs)).append("\n");
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
