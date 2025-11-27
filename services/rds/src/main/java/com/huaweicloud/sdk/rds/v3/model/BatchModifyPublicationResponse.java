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
public class BatchModifyPublicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publications")

    private List<BatchOperateResponseInfo> publications = null;

    public BatchModifyPublicationResponse withPublications(List<BatchOperateResponseInfo> publications) {
        this.publications = publications;
        return this;
    }

    public BatchModifyPublicationResponse addPublicationsItem(BatchOperateResponseInfo publicationsItem) {
        if (this.publications == null) {
            this.publications = new ArrayList<>();
        }
        this.publications.add(publicationsItem);
        return this;
    }

    public BatchModifyPublicationResponse withPublications(
        Consumer<List<BatchOperateResponseInfo>> publicationsSetter) {
        if (this.publications == null) {
            this.publications = new ArrayList<>();
        }
        publicationsSetter.accept(this.publications);
        return this;
    }

    /**
     * 修改发布结果。
     * @return publications
     */
    public List<BatchOperateResponseInfo> getPublications() {
        return publications;
    }

    public void setPublications(List<BatchOperateResponseInfo> publications) {
        this.publications = publications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchModifyPublicationResponse that = (BatchModifyPublicationResponse) obj;
        return Objects.equals(this.publications, that.publications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyPublicationResponse {\n");
        sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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
