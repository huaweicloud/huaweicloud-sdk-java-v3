package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SyncClusterProtectionEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synched")

    private Boolean synched;

    public SyncClusterProtectionEventResponse withSynched(Boolean synched) {
        this.synched = synched;
        return this;
    }

    /**
     * 创建同步任务是否成功
     * @return synched
     */
    public Boolean getSynched() {
        return synched;
    }

    public void setSynched(Boolean synched) {
        this.synched = synched;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncClusterProtectionEventResponse that = (SyncClusterProtectionEventResponse) obj;
        return Objects.equals(this.synched, that.synched);
    }

    @Override
    public int hashCode() {
        return Objects.hash(synched);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncClusterProtectionEventResponse {\n");
        sb.append("    synched: ").append(toIndentedString(synched)).append("\n");
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
