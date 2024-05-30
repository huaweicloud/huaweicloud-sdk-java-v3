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
public class ListBridgesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridges")

    private List<BridgeResponse> bridges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListBridgesResponse withBridges(List<BridgeResponse> bridges) {
        this.bridges = bridges;
        return this;
    }

    public ListBridgesResponse addBridgesItem(BridgeResponse bridgesItem) {
        if (this.bridges == null) {
            this.bridges = new ArrayList<>();
        }
        this.bridges.add(bridgesItem);
        return this;
    }

    public ListBridgesResponse withBridges(Consumer<List<BridgeResponse>> bridgesSetter) {
        if (this.bridges == null) {
            this.bridges = new ArrayList<>();
        }
        bridgesSetter.accept(this.bridges);
        return this;
    }

    /**
     * 网桥列表。
     * @return bridges
     */
    public List<BridgeResponse> getBridges() {
        return bridges;
    }

    public void setBridges(List<BridgeResponse> bridges) {
        this.bridges = bridges;
    }

    public ListBridgesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListBridgesResponse withPage(Consumer<Page> pageSetter) {
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
        ListBridgesResponse that = (ListBridgesResponse) obj;
        return Objects.equals(this.bridges, that.bridges) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridges, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBridgesResponse {\n");
        sb.append("    bridges: ").append(toIndentedString(bridges)).append("\n");
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
