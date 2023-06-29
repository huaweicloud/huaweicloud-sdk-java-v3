package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListApicGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_groups")

    private List<ApigGroupDTO> gatewayGroups = null;

    public ListApicGroupsResponse withGatewayGroups(List<ApigGroupDTO> gatewayGroups) {
        this.gatewayGroups = gatewayGroups;
        return this;
    }

    public ListApicGroupsResponse addGatewayGroupsItem(ApigGroupDTO gatewayGroupsItem) {
        if (this.gatewayGroups == null) {
            this.gatewayGroups = new ArrayList<>();
        }
        this.gatewayGroups.add(gatewayGroupsItem);
        return this;
    }

    public ListApicGroupsResponse withGatewayGroups(Consumer<List<ApigGroupDTO>> gatewayGroupsSetter) {
        if (this.gatewayGroups == null) {
            this.gatewayGroups = new ArrayList<>();
        }
        gatewayGroupsSetter.accept(this.gatewayGroups);
        return this;
    }

    /**
     * 网关分组列表
     * @return gatewayGroups
     */
    public List<ApigGroupDTO> getGatewayGroups() {
        return gatewayGroups;
    }

    public void setGatewayGroups(List<ApigGroupDTO> gatewayGroups) {
        this.gatewayGroups = gatewayGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApicGroupsResponse that = (ListApicGroupsResponse) obj;
        return Objects.equals(this.gatewayGroups, that.gatewayGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApicGroupsResponse {\n");
        sb.append("    gatewayGroups: ").append(toIndentedString(gatewayGroups)).append("\n");
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
