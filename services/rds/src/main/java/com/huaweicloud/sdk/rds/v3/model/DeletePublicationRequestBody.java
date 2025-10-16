package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * （批量）删除发布。
 */
public class DeletePublicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_ids")

    private List<String> publicationIds = null;

    public DeletePublicationRequestBody withPublicationIds(List<String> publicationIds) {
        this.publicationIds = publicationIds;
        return this;
    }

    public DeletePublicationRequestBody addPublicationIdsItem(String publicationIdsItem) {
        if (this.publicationIds == null) {
            this.publicationIds = new ArrayList<>();
        }
        this.publicationIds.add(publicationIdsItem);
        return this;
    }

    public DeletePublicationRequestBody withPublicationIds(Consumer<List<String>> publicationIdsSetter) {
        if (this.publicationIds == null) {
            this.publicationIds = new ArrayList<>();
        }
        publicationIdsSetter.accept(this.publicationIds);
        return this;
    }

    /**
     * 删除的发布id列表（需要是同一实例的发布）。
     * @return publicationIds
     */
    public List<String> getPublicationIds() {
        return publicationIds;
    }

    public void setPublicationIds(List<String> publicationIds) {
        this.publicationIds = publicationIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePublicationRequestBody that = (DeletePublicationRequestBody) obj;
        return Objects.equals(this.publicationIds, that.publicationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePublicationRequestBody {\n");
        sb.append("    publicationIds: ").append(toIndentedString(publicationIds)).append("\n");
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
