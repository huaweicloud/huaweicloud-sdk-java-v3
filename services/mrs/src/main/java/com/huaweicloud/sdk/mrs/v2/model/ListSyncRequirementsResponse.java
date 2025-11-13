package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListSyncRequirementsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_synchronous")

    private Boolean isSynchronous;

    public ListSyncRequirementsResponse withIsSynchronous(Boolean isSynchronous) {
        this.isSynchronous = isSynchronous;
        return this;
    }

    /**
     * 表示当前集群是否已完成IAM同步
     * @return isSynchronous
     */
    public Boolean getIsSynchronous() {
        return isSynchronous;
    }

    public void setIsSynchronous(Boolean isSynchronous) {
        this.isSynchronous = isSynchronous;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSyncRequirementsResponse that = (ListSyncRequirementsResponse) obj;
        return Objects.equals(this.isSynchronous, that.isSynchronous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSynchronous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyncRequirementsResponse {\n");
        sb.append("    isSynchronous: ").append(toIndentedString(isSynchronous)).append("\n");
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
