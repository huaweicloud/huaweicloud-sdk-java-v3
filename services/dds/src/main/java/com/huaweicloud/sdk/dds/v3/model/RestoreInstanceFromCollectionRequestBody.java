package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** RestoreInstanceFromCollectionRequestBody */
public class RestoreInstanceFromCollectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_collections")

    private List<RestoreInstanceFromCollectionRequestBodyRestoreCollections> restoreCollections = null;

    public RestoreInstanceFromCollectionRequestBody withRestoreCollections(
        List<RestoreInstanceFromCollectionRequestBodyRestoreCollections> restoreCollections) {
        this.restoreCollections = restoreCollections;
        return this;
    }

    public RestoreInstanceFromCollectionRequestBody addRestoreCollectionsItem(
        RestoreInstanceFromCollectionRequestBodyRestoreCollections restoreCollectionsItem) {
        if (this.restoreCollections == null) {
            this.restoreCollections = new ArrayList<>();
        }
        this.restoreCollections.add(restoreCollectionsItem);
        return this;
    }

    public RestoreInstanceFromCollectionRequestBody withRestoreCollections(
        Consumer<List<RestoreInstanceFromCollectionRequestBodyRestoreCollections>> restoreCollectionsSetter) {
        if (this.restoreCollections == null) {
            this.restoreCollections = new ArrayList<>();
        }
        restoreCollectionsSetter.accept(this.restoreCollections);
        return this;
    }

    /** 数据库信息。
     * 
     * @return restoreCollections */
    public List<RestoreInstanceFromCollectionRequestBodyRestoreCollections> getRestoreCollections() {
        return restoreCollections;
    }

    public void setRestoreCollections(
        List<RestoreInstanceFromCollectionRequestBodyRestoreCollections> restoreCollections) {
        this.restoreCollections = restoreCollections;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreInstanceFromCollectionRequestBody restoreInstanceFromCollectionRequestBody =
            (RestoreInstanceFromCollectionRequestBody) o;
        return Objects.equals(this.restoreCollections, restoreInstanceFromCollectionRequestBody.restoreCollections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreCollections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInstanceFromCollectionRequestBody {\n");
        sb.append("    restoreCollections: ").append(toIndentedString(restoreCollections)).append("\n");
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
