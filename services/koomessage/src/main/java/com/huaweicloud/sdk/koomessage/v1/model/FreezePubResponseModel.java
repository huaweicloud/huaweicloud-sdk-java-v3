package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FreezePubResponseModel
 */
public class FreezePubResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    public FreezePubResponseModel withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreezePubResponseModel that = (FreezePubResponseModel) obj;
        return Objects.equals(this.pubId, that.pubId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezePubResponseModel {\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
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
