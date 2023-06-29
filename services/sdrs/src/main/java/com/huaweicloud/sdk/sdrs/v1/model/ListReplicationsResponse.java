package com.huaweicloud.sdk.sdrs.v1.model;

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
public class ListReplicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replications")

    private List<ShowReplicationParams> replications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListReplicationsResponse withReplications(List<ShowReplicationParams> replications) {
        this.replications = replications;
        return this;
    }

    public ListReplicationsResponse addReplicationsItem(ShowReplicationParams replicationsItem) {
        if (this.replications == null) {
            this.replications = new ArrayList<>();
        }
        this.replications.add(replicationsItem);
        return this;
    }

    public ListReplicationsResponse withReplications(Consumer<List<ShowReplicationParams>> replicationsSetter) {
        if (this.replications == null) {
            this.replications = new ArrayList<>();
        }
        replicationsSetter.accept(this.replications);
        return this;
    }

    /**
     * 复制对列表。
     * @return replications
     */
    public List<ShowReplicationParams> getReplications() {
        return replications;
    }

    public void setReplications(List<ShowReplicationParams> replications) {
        this.replications = replications;
    }

    public ListReplicationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 列表中包含的复制对个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReplicationsResponse that = (ListReplicationsResponse) obj;
        return Objects.equals(this.replications, that.replications) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replications, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReplicationsResponse {\n");
        sb.append("    replications: ").append(toIndentedString(replications)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
