package com.huaweicloud.sdk.servicestage.v2.model;

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
public class ListRuntimesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtimes")

    private List<RuntimeTypeView> runtimes = null;

    public ListRuntimesResponse withRuntimes(List<RuntimeTypeView> runtimes) {
        this.runtimes = runtimes;
        return this;
    }

    public ListRuntimesResponse addRuntimesItem(RuntimeTypeView runtimesItem) {
        if (this.runtimes == null) {
            this.runtimes = new ArrayList<>();
        }
        this.runtimes.add(runtimesItem);
        return this;
    }

    public ListRuntimesResponse withRuntimes(Consumer<List<RuntimeTypeView>> runtimesSetter) {
        if (this.runtimes == null) {
            this.runtimes = new ArrayList<>();
        }
        runtimesSetter.accept(this.runtimes);
        return this;
    }

    /**
     * 运行时列表。
     * @return runtimes
     */
    public List<RuntimeTypeView> getRuntimes() {
        return runtimes;
    }

    public void setRuntimes(List<RuntimeTypeView> runtimes) {
        this.runtimes = runtimes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRuntimesResponse listRuntimesResponse = (ListRuntimesResponse) o;
        return Objects.equals(this.runtimes, listRuntimesResponse.runtimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuntimesResponse {\n");
        sb.append("    runtimes: ").append(toIndentedString(runtimes)).append("\n");
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
