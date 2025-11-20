package com.huaweicloud.sdk.cce.v3.model;

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
public class ListHyperNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperNodeList")

    private List<HyperNode> hyperNodeList = null;

    public ListHyperNodesResponse withHyperNodeList(List<HyperNode> hyperNodeList) {
        this.hyperNodeList = hyperNodeList;
        return this;
    }

    public ListHyperNodesResponse addHyperNodeListItem(HyperNode hyperNodeListItem) {
        if (this.hyperNodeList == null) {
            this.hyperNodeList = new ArrayList<>();
        }
        this.hyperNodeList.add(hyperNodeListItem);
        return this;
    }

    public ListHyperNodesResponse withHyperNodeList(Consumer<List<HyperNode>> hyperNodeListSetter) {
        if (this.hyperNodeList == null) {
            this.hyperNodeList = new ArrayList<>();
        }
        hyperNodeListSetter.accept(this.hyperNodeList);
        return this;
    }

    /**
     * Get hyperNodeList
     * @return hyperNodeList
     */
    public List<HyperNode> getHyperNodeList() {
        return hyperNodeList;
    }

    public void setHyperNodeList(List<HyperNode> hyperNodeList) {
        this.hyperNodeList = hyperNodeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHyperNodesResponse that = (ListHyperNodesResponse) obj;
        return Objects.equals(this.hyperNodeList, that.hyperNodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hyperNodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHyperNodesResponse {\n");
        sb.append("    hyperNodeList: ").append(toIndentedString(hyperNodeList)).append("\n");
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
