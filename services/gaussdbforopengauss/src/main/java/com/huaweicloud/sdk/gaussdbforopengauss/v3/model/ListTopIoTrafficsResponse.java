package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListTopIoTrafficsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_io_infos")

    private List<TopIoInfo> topIoInfos = null;

    public ListTopIoTrafficsResponse withTopIoInfos(List<TopIoInfo> topIoInfos) {
        this.topIoInfos = topIoInfos;
        return this;
    }

    public ListTopIoTrafficsResponse addTopIoInfosItem(TopIoInfo topIoInfosItem) {
        if (this.topIoInfos == null) {
            this.topIoInfos = new ArrayList<>();
        }
        this.topIoInfos.add(topIoInfosItem);
        return this;
    }

    public ListTopIoTrafficsResponse withTopIoInfos(Consumer<List<TopIoInfo>> topIoInfosSetter) {
        if (this.topIoInfos == null) {
            this.topIoInfos = new ArrayList<>();
        }
        topIoInfosSetter.accept(this.topIoInfos);
        return this;
    }

    /**
     * Top IO列表
     * @return topIoInfos
     */
    public List<TopIoInfo> getTopIoInfos() {
        return topIoInfos;
    }

    public void setTopIoInfos(List<TopIoInfo> topIoInfos) {
        this.topIoInfos = topIoInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopIoTrafficsResponse that = (ListTopIoTrafficsResponse) obj;
        return Objects.equals(this.topIoInfos, that.topIoInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topIoInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopIoTrafficsResponse {\n");
        sb.append("    topIoInfos: ").append(toIndentedString(topIoInfos)).append("\n");
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
