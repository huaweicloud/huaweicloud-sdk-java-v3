package com.huaweicloud.sdk.ec.v1.model;

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
public class ListEcnWithErResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_er_relationships")

    private List<EcnErItem> ecnErRelationships = null;

    public ListEcnWithErResponse withEcnErRelationships(List<EcnErItem> ecnErRelationships) {
        this.ecnErRelationships = ecnErRelationships;
        return this;
    }

    public ListEcnWithErResponse addEcnErRelationshipsItem(EcnErItem ecnErRelationshipsItem) {
        if (this.ecnErRelationships == null) {
            this.ecnErRelationships = new ArrayList<>();
        }
        this.ecnErRelationships.add(ecnErRelationshipsItem);
        return this;
    }

    public ListEcnWithErResponse withEcnErRelationships(Consumer<List<EcnErItem>> ecnErRelationshipsSetter) {
        if (this.ecnErRelationships == null) {
            this.ecnErRelationships = new ArrayList<>();
        }
        ecnErRelationshipsSetter.accept(this.ecnErRelationships);
        return this;
    }

    /**
     * 企业连接网络与企业路由器的绑定关系列表
     * @return ecnErRelationships
     */
    public List<EcnErItem> getEcnErRelationships() {
        return ecnErRelationships;
    }

    public void setEcnErRelationships(List<EcnErItem> ecnErRelationships) {
        this.ecnErRelationships = ecnErRelationships;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcnWithErResponse that = (ListEcnWithErResponse) obj;
        return Objects.equals(this.ecnErRelationships, that.ecnErRelationships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnErRelationships);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcnWithErResponse {\n");
        sb.append("    ecnErRelationships: ").append(toIndentedString(ecnErRelationships)).append("\n");
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
