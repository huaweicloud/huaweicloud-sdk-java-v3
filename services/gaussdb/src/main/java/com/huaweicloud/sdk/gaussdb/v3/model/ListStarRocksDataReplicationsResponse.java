package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListStarRocksDataReplicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replications")

    private List<StarRocksReplicationInfo> replications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_text")

    private String extText;

    public ListStarRocksDataReplicationsResponse withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 查询数据同步任务数。
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public ListStarRocksDataReplicationsResponse withReplications(List<StarRocksReplicationInfo> replications) {
        this.replications = replications;
        return this;
    }

    public ListStarRocksDataReplicationsResponse addReplicationsItem(StarRocksReplicationInfo replicationsItem) {
        if (this.replications == null) {
            this.replications = new ArrayList<>();
        }
        this.replications.add(replicationsItem);
        return this;
    }

    public ListStarRocksDataReplicationsResponse withReplications(
        Consumer<List<StarRocksReplicationInfo>> replicationsSetter) {
        if (this.replications == null) {
            this.replications = new ArrayList<>();
        }
        replicationsSetter.accept(this.replications);
        return this;
    }

    /**
     * 数据同步任务信息。
     * @return replications
     */
    public List<StarRocksReplicationInfo> getReplications() {
        return replications;
    }

    public void setReplications(List<StarRocksReplicationInfo> replications) {
        this.replications = replications;
    }

    public ListStarRocksDataReplicationsResponse withExtText(String extText) {
        this.extText = extText;
        return this;
    }

    /**
     * 扩展字段。
     * @return extText
     */
    public String getExtText() {
        return extText;
    }

    public void setExtText(String extText) {
        this.extText = extText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStarRocksDataReplicationsResponse that = (ListStarRocksDataReplicationsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.replications, that.replications)
            && Objects.equals(this.extText, that.extText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, replications, extText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStarRocksDataReplicationsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    replications: ").append(toIndentedString(replications)).append("\n");
        sb.append("    extText: ").append(toIndentedString(extText)).append("\n");
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
