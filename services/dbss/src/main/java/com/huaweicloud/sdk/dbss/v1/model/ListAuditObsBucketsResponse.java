package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAuditObsBucketsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_list")

    private List<ObsBucketObject> obsList = null;

    public ListAuditObsBucketsResponse withObsList(List<ObsBucketObject> obsList) {
        this.obsList = obsList;
        return this;
    }

    public ListAuditObsBucketsResponse addObsListItem(ObsBucketObject obsListItem) {
        if (this.obsList == null) {
            this.obsList = new ArrayList<>();
        }
        this.obsList.add(obsListItem);
        return this;
    }

    public ListAuditObsBucketsResponse withObsList(Consumer<List<ObsBucketObject>> obsListSetter) {
        if (this.obsList == null) {
            this.obsList = new ArrayList<>();
        }
        obsListSetter.accept(this.obsList);
        return this;
    }

    /**
     * OBS桶列表
     * @return obsList
     */
    public List<ObsBucketObject> getObsList() {
        return obsList;
    }

    public void setObsList(List<ObsBucketObject> obsList) {
        this.obsList = obsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditObsBucketsResponse that = (ListAuditObsBucketsResponse) obj;
        return Objects.equals(this.obsList, that.obsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditObsBucketsResponse {\n");
        sb.append("    obsList: ").append(toIndentedString(obsList)).append("\n");
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
