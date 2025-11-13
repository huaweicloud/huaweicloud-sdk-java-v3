package com.huaweicloud.sdk.rds.v3.model;

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
public class ListPublications4SubscriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_publications")

    private List<InstancePublicatiosInfo> instancePublications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListPublications4SubscriptionResponse withInstancePublications(
        List<InstancePublicatiosInfo> instancePublications) {
        this.instancePublications = instancePublications;
        return this;
    }

    public ListPublications4SubscriptionResponse addInstancePublicationsItem(
        InstancePublicatiosInfo instancePublicationsItem) {
        if (this.instancePublications == null) {
            this.instancePublications = new ArrayList<>();
        }
        this.instancePublications.add(instancePublicationsItem);
        return this;
    }

    public ListPublications4SubscriptionResponse withInstancePublications(
        Consumer<List<InstancePublicatiosInfo>> instancePublicationsSetter) {
        if (this.instancePublications == null) {
            this.instancePublications = new ArrayList<>();
        }
        instancePublicationsSetter.accept(this.instancePublications);
        return this;
    }

    /**
     * 实例发布列表。
     * @return instancePublications
     */
    public List<InstancePublicatiosInfo> getInstancePublications() {
        return instancePublications;
    }

    public void setInstancePublications(List<InstancePublicatiosInfo> instancePublications) {
        this.instancePublications = instancePublications;
    }

    public ListPublications4SubscriptionResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 发布总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPublications4SubscriptionResponse that = (ListPublications4SubscriptionResponse) obj;
        return Objects.equals(this.instancePublications, that.instancePublications)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instancePublications, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublications4SubscriptionResponse {\n");
        sb.append("    instancePublications: ").append(toIndentedString(instancePublications)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
