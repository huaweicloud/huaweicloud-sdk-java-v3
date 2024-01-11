package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEcnWithVpcRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_id")

    private String ecnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    public DeleteEcnWithVpcRequest withEcnId(String ecnId) {
        this.ecnId = ecnId;
        return this;
    }

    /**
     * 企业连接网络ID
     * @return ecnId
     */
    public String getEcnId() {
        return ecnId;
    }

    public void setEcnId(String ecnId) {
        this.ecnId = ecnId;
    }

    public DeleteEcnWithVpcRequest withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 企业连接网络绑定关系ID
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteEcnWithVpcRequest that = (DeleteEcnWithVpcRequest) obj;
        return Objects.equals(this.ecnId, that.ecnId) && Objects.equals(this.relationId, that.relationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnId, relationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEcnWithVpcRequest {\n");
        sb.append("    ecnId: ").append(toIndentedString(ecnId)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
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
