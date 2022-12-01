package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkSpacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_id")

    private String iamUserId;

    public ListWorkSpacesRequest withIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
        return this;
    }

    /**
     * 用户的userId，用于查询指定的的子工作空间
     * @return iamUserId
     */
    public String getIamUserId() {
        return iamUserId;
    }

    public void setIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkSpacesRequest listWorkSpacesRequest = (ListWorkSpacesRequest) o;
        return Objects.equals(this.iamUserId, listWorkSpacesRequest.iamUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkSpacesRequest {\n");
        sb.append("    iamUserId: ").append(toIndentedString(iamUserId)).append("\n");
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
