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
public class ListFederationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_federations")

    private List<RayFederationInfo> rayFederations = null;

    public ListFederationsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：Ray联邦端点总记录数。 **取值范围**：大于等于0的整数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListFederationsResponse withRayFederations(List<RayFederationInfo> rayFederations) {
        this.rayFederations = rayFederations;
        return this;
    }

    public ListFederationsResponse addRayFederationsItem(RayFederationInfo rayFederationsItem) {
        if (this.rayFederations == null) {
            this.rayFederations = new ArrayList<>();
        }
        this.rayFederations.add(rayFederationsItem);
        return this;
    }

    public ListFederationsResponse withRayFederations(Consumer<List<RayFederationInfo>> rayFederationsSetter) {
        if (this.rayFederations == null) {
            this.rayFederations = new ArrayList<>();
        }
        rayFederationsSetter.accept(this.rayFederations);
        return this;
    }

    /**
     * **参数解释**：Ray联邦端点列表。
     * @return rayFederations
     */
    public List<RayFederationInfo> getRayFederations() {
        return rayFederations;
    }

    public void setRayFederations(List<RayFederationInfo> rayFederations) {
        this.rayFederations = rayFederations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFederationsResponse that = (ListFederationsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.rayFederations, that.rayFederations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, rayFederations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFederationsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    rayFederations: ").append(toIndentedString(rayFederations)).append("\n");
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
