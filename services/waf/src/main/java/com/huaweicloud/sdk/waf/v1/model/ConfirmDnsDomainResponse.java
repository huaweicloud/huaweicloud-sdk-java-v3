package com.huaweicloud.sdk.waf.v1.model;

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
public class ConfirmDnsDomainResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<DnsDomain> items = null;

    public ConfirmDnsDomainResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * dns标识
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ConfirmDnsDomainResponse withItems(List<DnsDomain> items) {
        this.items = items;
        return this;
    }

    public ConfirmDnsDomainResponse addItemsItem(DnsDomain itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ConfirmDnsDomainResponse withItems(Consumer<List<DnsDomain>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * dns域名列表
     * @return items
     */
    public List<DnsDomain> getItems() {
        return items;
    }

    public void setItems(List<DnsDomain> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmDnsDomainResponse that = (ConfirmDnsDomainResponse) obj;
        return Objects.equals(this.nextMarker, that.nextMarker) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextMarker, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmDnsDomainResponse {\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
