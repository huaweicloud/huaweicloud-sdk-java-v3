package com.huaweicloud.sdk.dns.v2.model;

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
public class ListLineGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linegroups")

    private List<CreateLineGroupsResp> linegroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metedata metadata;

    public ListLineGroupsResponse withLinegroups(List<CreateLineGroupsResp> linegroups) {
        this.linegroups = linegroups;
        return this;
    }

    public ListLineGroupsResponse addLinegroupsItem(CreateLineGroupsResp linegroupsItem) {
        if (this.linegroups == null) {
            this.linegroups = new ArrayList<>();
        }
        this.linegroups.add(linegroupsItem);
        return this;
    }

    public ListLineGroupsResponse withLinegroups(Consumer<List<CreateLineGroupsResp>> linegroupsSetter) {
        if (this.linegroups == null) {
            this.linegroups = new ArrayList<>();
        }
        linegroupsSetter.accept(this.linegroups);
        return this;
    }

    /**
     * 列表对象。
     * @return linegroups
     */
    public List<CreateLineGroupsResp> getLinegroups() {
        return linegroups;
    }

    public void setLinegroups(List<CreateLineGroupsResp> linegroups) {
        this.linegroups = linegroups;
    }

    public ListLineGroupsResponse withMetadata(Metedata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListLineGroupsResponse withMetadata(Consumer<Metedata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metedata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metedata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metedata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLineGroupsResponse listLineGroupsResponse = (ListLineGroupsResponse) o;
        return Objects.equals(this.linegroups, listLineGroupsResponse.linegroups)
            && Objects.equals(this.metadata, listLineGroupsResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linegroups, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLineGroupsResponse {\n");
        sb.append("    linegroups: ").append(toIndentedString(linegroups)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
