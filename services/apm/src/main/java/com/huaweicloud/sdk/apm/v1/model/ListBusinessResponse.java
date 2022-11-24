package com.huaweicloud.sdk.apm.v1.model;

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
public class ListBusinessResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_nodes")

    private List<BusinessNodeModel> businessNodes = null;

    public ListBusinessResponse withBusinessNodes(List<BusinessNodeModel> businessNodes) {
        this.businessNodes = businessNodes;
        return this;
    }

    public ListBusinessResponse addBusinessNodesItem(BusinessNodeModel businessNodesItem) {
        if (this.businessNodes == null) {
            this.businessNodes = new ArrayList<>();
        }
        this.businessNodes.add(businessNodesItem);
        return this;
    }

    public ListBusinessResponse withBusinessNodes(Consumer<List<BusinessNodeModel>> businessNodesSetter) {
        if (this.businessNodes == null) {
            this.businessNodes = new ArrayList<>();
        }
        businessNodesSetter.accept(this.businessNodes);
        return this;
    }

    /**
     * 获取应用列表数据结构。
     * @return businessNodes
     */
    public List<BusinessNodeModel> getBusinessNodes() {
        return businessNodes;
    }

    public void setBusinessNodes(List<BusinessNodeModel> businessNodes) {
        this.businessNodes = businessNodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBusinessResponse listBusinessResponse = (ListBusinessResponse) o;
        return Objects.equals(this.businessNodes, listBusinessResponse.businessNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBusinessResponse {\n");
        sb.append("    businessNodes: ").append(toIndentedString(businessNodes)).append("\n");
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
