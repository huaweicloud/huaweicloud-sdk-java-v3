package com.huaweicloud.sdk.dris.v1.model;

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
public class ListV2xEdgeAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<V2XEdgeAppResponseDTO> apps = null;

    public ListV2xEdgeAppResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：满足查询条件的记录数。
     * minimum: 0
     * maximum: 10000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListV2xEdgeAppResponse withApps(List<V2XEdgeAppResponseDTO> apps) {
        this.apps = apps;
        return this;
    }

    public ListV2xEdgeAppResponse addAppsItem(V2XEdgeAppResponseDTO appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public ListV2xEdgeAppResponse withApps(Consumer<List<V2XEdgeAppResponseDTO>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * **参数说明**：已部署的边缘应用列表。
     * @return apps
     */
    public List<V2XEdgeAppResponseDTO> getApps() {
        return apps;
    }

    public void setApps(List<V2XEdgeAppResponseDTO> apps) {
        this.apps = apps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListV2xEdgeAppResponse listV2xEdgeAppResponse = (ListV2xEdgeAppResponse) o;
        return Objects.equals(this.count, listV2xEdgeAppResponse.count)
            && Objects.equals(this.apps, listV2xEdgeAppResponse.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2xEdgeAppResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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
