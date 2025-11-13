package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListSyncStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_synchronizing")

    private Boolean isSynchronizing;

    public ListSyncStatusResponse withIsSynchronizing(Boolean isSynchronizing) {
        this.isSynchronizing = isSynchronizing;
        return this;
    }

    /**
     * 表示IAM同步任务是否正在进行中
     * @return isSynchronizing
     */
    public Boolean getIsSynchronizing() {
        return isSynchronizing;
    }

    public void setIsSynchronizing(Boolean isSynchronizing) {
        this.isSynchronizing = isSynchronizing;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSyncStatusResponse that = (ListSyncStatusResponse) obj;
        return Objects.equals(this.isSynchronizing, that.isSynchronizing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSynchronizing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyncStatusResponse {\n");
        sb.append("    isSynchronizing: ").append(toIndentedString(isSynchronizing)).append("\n");
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
