package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新复制对名称请求体 */
public class UpdateReplicationNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private UpdateReplicationNameRequestParams replication;

    public UpdateReplicationNameRequestBody withReplication(UpdateReplicationNameRequestParams replication) {
        this.replication = replication;
        return this;
    }

    public UpdateReplicationNameRequestBody withReplication(
        Consumer<UpdateReplicationNameRequestParams> replicationSetter) {
        if (this.replication == null) {
            this.replication = new UpdateReplicationNameRequestParams();
            replicationSetter.accept(this.replication);
        }

        return this;
    }

    /** Get replication
     * 
     * @return replication */
    public UpdateReplicationNameRequestParams getReplication() {
        return replication;
    }

    public void setReplication(UpdateReplicationNameRequestParams replication) {
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
        UpdateReplicationNameRequestBody updateReplicationNameRequestBody = (UpdateReplicationNameRequestBody) o;
        return Objects.equals(this.replication, updateReplicationNameRequestBody.replication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReplicationNameRequestBody {\n");
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
