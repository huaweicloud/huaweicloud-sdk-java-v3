package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ImportDataMapLineageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guids")

    private List<NodeLineageGuids> guids = null;

    public ImportDataMapLineageResponse withGuids(List<NodeLineageGuids> guids) {
        this.guids = guids;
        return this;
    }

    public ImportDataMapLineageResponse addGuidsItem(NodeLineageGuids guidsItem) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        this.guids.add(guidsItem);
        return this;
    }

    public ImportDataMapLineageResponse withGuids(Consumer<List<NodeLineageGuids>> guidsSetter) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        guidsSetter.accept(this.guids);
        return this;
    }

    /**
     * 血缘信息资产guids。
     * @return guids
     */
    public List<NodeLineageGuids> getGuids() {
        return guids;
    }

    public void setGuids(List<NodeLineageGuids> guids) {
        this.guids = guids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportDataMapLineageResponse that = (ImportDataMapLineageResponse) obj;
        return Objects.equals(this.guids, that.guids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDataMapLineageResponse {\n");
        sb.append("    guids: ").append(toIndentedString(guids)).append("\n");
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
