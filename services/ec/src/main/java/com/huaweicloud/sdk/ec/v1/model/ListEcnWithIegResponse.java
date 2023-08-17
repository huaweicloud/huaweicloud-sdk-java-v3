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
public class ListEcnWithIegResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_ieg_relationships")

    private List<EcnIegItem> ecnIegRelationships = null;

    public ListEcnWithIegResponse withEcnIegRelationships(List<EcnIegItem> ecnIegRelationships) {
        this.ecnIegRelationships = ecnIegRelationships;
        return this;
    }

    public ListEcnWithIegResponse addEcnIegRelationshipsItem(EcnIegItem ecnIegRelationshipsItem) {
        if (this.ecnIegRelationships == null) {
            this.ecnIegRelationships = new ArrayList<>();
        }
        this.ecnIegRelationships.add(ecnIegRelationshipsItem);
        return this;
    }

    public ListEcnWithIegResponse withEcnIegRelationships(Consumer<List<EcnIegItem>> ecnIegRelationshipsSetter) {
        if (this.ecnIegRelationships == null) {
            this.ecnIegRelationships = new ArrayList<>();
        }
        ecnIegRelationshipsSetter.accept(this.ecnIegRelationships);
        return this;
    }

    /**
     * 企业连接网络与智能企业网关的绑定关系列表
     * @return ecnIegRelationships
     */
    public List<EcnIegItem> getEcnIegRelationships() {
        return ecnIegRelationships;
    }

    public void setEcnIegRelationships(List<EcnIegItem> ecnIegRelationships) {
        this.ecnIegRelationships = ecnIegRelationships;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcnWithIegResponse that = (ListEcnWithIegResponse) obj;
        return Objects.equals(this.ecnIegRelationships, that.ecnIegRelationships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnIegRelationships);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcnWithIegResponse {\n");
        sb.append("    ecnIegRelationships: ").append(toIndentedString(ecnIegRelationships)).append("\n");
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
