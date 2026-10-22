package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListV2NetworksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<V2NetworkBriefInfo> networks = null;

    public ListV2NetworksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总记录数。 **取值范围**：不涉及。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListV2NetworksResponse withNetworks(List<V2NetworkBriefInfo> networks) {
        this.networks = networks;
        return this;
    }

    public ListV2NetworksResponse addNetworksItem(V2NetworkBriefInfo networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public ListV2NetworksResponse withNetworks(Consumer<List<V2NetworkBriefInfo>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * **参数解释**：网络配置列表。 
     * @return networks
     */
    public List<V2NetworkBriefInfo> getNetworks() {
        return networks;
    }

    public void setNetworks(List<V2NetworkBriefInfo> networks) {
        this.networks = networks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2NetworksResponse that = (ListV2NetworksResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.networks, that.networks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, networks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2NetworksResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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
