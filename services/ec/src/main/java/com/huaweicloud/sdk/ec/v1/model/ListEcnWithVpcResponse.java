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
public class ListEcnWithVpcResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_vpc_relationships")

    private List<EcnWithVpcItem> ecnVpcRelationships = null;

    public ListEcnWithVpcResponse withEcnVpcRelationships(List<EcnWithVpcItem> ecnVpcRelationships) {
        this.ecnVpcRelationships = ecnVpcRelationships;
        return this;
    }

    public ListEcnWithVpcResponse addEcnVpcRelationshipsItem(EcnWithVpcItem ecnVpcRelationshipsItem) {
        if (this.ecnVpcRelationships == null) {
            this.ecnVpcRelationships = new ArrayList<>();
        }
        this.ecnVpcRelationships.add(ecnVpcRelationshipsItem);
        return this;
    }

    public ListEcnWithVpcResponse withEcnVpcRelationships(Consumer<List<EcnWithVpcItem>> ecnVpcRelationshipsSetter) {
        if (this.ecnVpcRelationships == null) {
            this.ecnVpcRelationships = new ArrayList<>();
        }
        ecnVpcRelationshipsSetter.accept(this.ecnVpcRelationships);
        return this;
    }

    /**
     * 企业连接网络与虚拟私有云的绑定关系列表
     * @return ecnVpcRelationships
     */
    public List<EcnWithVpcItem> getEcnVpcRelationships() {
        return ecnVpcRelationships;
    }

    public void setEcnVpcRelationships(List<EcnWithVpcItem> ecnVpcRelationships) {
        this.ecnVpcRelationships = ecnVpcRelationships;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcnWithVpcResponse that = (ListEcnWithVpcResponse) obj;
        return Objects.equals(this.ecnVpcRelationships, that.ecnVpcRelationships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnVpcRelationships);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcnWithVpcResponse {\n");
        sb.append("    ecnVpcRelationships: ").append(toIndentedString(ecnVpcRelationships)).append("\n");
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
