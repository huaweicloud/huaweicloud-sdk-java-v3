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
public class ListPublicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publications")

    private List<QueryPublicationInfo> publications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListPublicationsResponse withPublications(List<QueryPublicationInfo> publications) {
        this.publications = publications;
        return this;
    }

    public ListPublicationsResponse addPublicationsItem(QueryPublicationInfo publicationsItem) {
        if (this.publications == null) {
            this.publications = new ArrayList<>();
        }
        this.publications.add(publicationsItem);
        return this;
    }

    public ListPublicationsResponse withPublications(Consumer<List<QueryPublicationInfo>> publicationsSetter) {
        if (this.publications == null) {
            this.publications = new ArrayList<>();
        }
        publicationsSetter.accept(this.publications);
        return this;
    }

    /**
     * 实例发布列表。
     * @return publications
     */
    public List<QueryPublicationInfo> getPublications() {
        return publications;
    }

    public void setPublications(List<QueryPublicationInfo> publications) {
        this.publications = publications;
    }

    public ListPublicationsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 实例发布数。
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
        ListPublicationsResponse that = (ListPublicationsResponse) obj;
        return Objects.equals(this.publications, that.publications) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publications, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicationsResponse {\n");
        sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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
