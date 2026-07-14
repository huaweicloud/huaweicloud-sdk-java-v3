package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IntranetConnectionDeleteRequest
 */
public class IntranetConnectionDeleteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_connection_ids")

    private List<String> intranetConnectionIds = null;

    public IntranetConnectionDeleteRequest withIntranetConnectionIds(List<String> intranetConnectionIds) {
        this.intranetConnectionIds = intranetConnectionIds;
        return this;
    }

    public IntranetConnectionDeleteRequest addIntranetConnectionIdsItem(String intranetConnectionIdsItem) {
        if (this.intranetConnectionIds == null) {
            this.intranetConnectionIds = new ArrayList<>();
        }
        this.intranetConnectionIds.add(intranetConnectionIdsItem);
        return this;
    }

    public IntranetConnectionDeleteRequest withIntranetConnectionIds(
        Consumer<List<String>> intranetConnectionIdsSetter) {
        if (this.intranetConnectionIds == null) {
            this.intranetConnectionIds = new ArrayList<>();
        }
        intranetConnectionIdsSetter.accept(this.intranetConnectionIds);
        return this;
    }

    /**
     * 内网接入的id列表
     * @return intranetConnectionIds
     */
    public List<String> getIntranetConnectionIds() {
        return intranetConnectionIds;
    }

    public void setIntranetConnectionIds(List<String> intranetConnectionIds) {
        this.intranetConnectionIds = intranetConnectionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntranetConnectionDeleteRequest that = (IntranetConnectionDeleteRequest) obj;
        return Objects.equals(this.intranetConnectionIds, that.intranetConnectionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intranetConnectionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntranetConnectionDeleteRequest {\n");
        sb.append("    intranetConnectionIds: ").append(toIndentedString(intranetConnectionIds)).append("\n");
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
