package com.huaweicloud.sdk.dws.v2.model;

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
public class ListElbsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbs")

    private List<ClusterElbInfo> elbs = null;

    public ListElbsResponse withElbs(List<ClusterElbInfo> elbs) {
        this.elbs = elbs;
        return this;
    }

    public ListElbsResponse addElbsItem(ClusterElbInfo elbsItem) {
        if (this.elbs == null) {
            this.elbs = new ArrayList<>();
        }
        this.elbs.add(elbsItem);
        return this;
    }

    public ListElbsResponse withElbs(Consumer<List<ClusterElbInfo>> elbsSetter) {
        if (this.elbs == null) {
            this.elbs = new ArrayList<>();
        }
        elbsSetter.accept(this.elbs);
        return this;
    }

    /**
     * 弹性负载均衡列表
     * @return elbs
     */
    public List<ClusterElbInfo> getElbs() {
        return elbs;
    }

    public void setElbs(List<ClusterElbInfo> elbs) {
        this.elbs = elbs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListElbsResponse listElbsResponse = (ListElbsResponse) o;
        return Objects.equals(this.elbs, listElbsResponse.elbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elbs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListElbsResponse {\n");
        sb.append("    elbs: ").append(toIndentedString(elbs)).append("\n");
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
