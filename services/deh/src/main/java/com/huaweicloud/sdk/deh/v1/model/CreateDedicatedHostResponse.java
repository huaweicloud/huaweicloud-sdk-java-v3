package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateDedicatedHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_ids")

    private List<String> dedicatedHostIds = null;

    public CreateDedicatedHostResponse withDedicatedHostIds(List<String> dedicatedHostIds) {
        this.dedicatedHostIds = dedicatedHostIds;
        return this;
    }

    public CreateDedicatedHostResponse addDedicatedHostIdsItem(String dedicatedHostIdsItem) {
        if (this.dedicatedHostIds == null) {
            this.dedicatedHostIds = new ArrayList<>();
        }
        this.dedicatedHostIds.add(dedicatedHostIdsItem);
        return this;
    }

    public CreateDedicatedHostResponse withDedicatedHostIds(Consumer<List<String>> dedicatedHostIdsSetter) {
        if (this.dedicatedHostIds == null) {
            this.dedicatedHostIds = new ArrayList<>();
        }
        dedicatedHostIdsSetter.accept(this.dedicatedHostIds);
        return this;
    }

    /** 已分配的专属主机ID数组。租户可以在这些专属主机上创建云服务器。
     * 
     * @return dedicatedHostIds */
    public List<String> getDedicatedHostIds() {
        return dedicatedHostIds;
    }

    public void setDedicatedHostIds(List<String> dedicatedHostIds) {
        this.dedicatedHostIds = dedicatedHostIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDedicatedHostResponse createDedicatedHostResponse = (CreateDedicatedHostResponse) o;
        return Objects.equals(this.dedicatedHostIds, createDedicatedHostResponse.dedicatedHostIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDedicatedHostResponse {\n");
        sb.append("    dedicatedHostIds: ").append(toIndentedString(dedicatedHostIds)).append("\n");
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
