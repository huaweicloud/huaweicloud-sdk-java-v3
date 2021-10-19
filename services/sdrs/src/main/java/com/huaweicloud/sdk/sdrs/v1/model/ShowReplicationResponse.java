package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowReplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private ShowReplicationParams replication;

    public ShowReplicationResponse withReplication(ShowReplicationParams replication) {
        this.replication = replication;
        return this;
    }

    public ShowReplicationResponse withReplication(Consumer<ShowReplicationParams> replicationSetter) {
        if (this.replication == null) {
            this.replication = new ShowReplicationParams();
            replicationSetter.accept(this.replication);
        }

        return this;
    }

    /** Get replication
     * 
     * @return replication */
    public ShowReplicationParams getReplication() {
        return replication;
    }

    public void setReplication(ShowReplicationParams replication) {
        this.replication = replication;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReplicationResponse showReplicationResponse = (ShowReplicationResponse) o;
        return Objects.equals(this.replication, showReplicationResponse.replication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplicationResponse {\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
