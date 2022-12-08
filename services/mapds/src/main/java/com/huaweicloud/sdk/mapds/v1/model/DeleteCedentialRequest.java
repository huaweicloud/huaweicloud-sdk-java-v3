package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCedentialRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientid")

    private String clientid;

    public DeleteCedentialRequest withClientid(String clientid) {
        this.clientid = clientid;
        return this;
    }

    /**
     * 待删除的key的id。
     * @return clientid
     */
    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteCedentialRequest deleteCedentialRequest = (DeleteCedentialRequest) o;
        return Objects.equals(this.clientid, deleteCedentialRequest.clientid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCedentialRequest {\n");
        sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
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
