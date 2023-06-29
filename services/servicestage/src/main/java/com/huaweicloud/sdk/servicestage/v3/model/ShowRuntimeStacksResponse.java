package com.huaweicloud.sdk.servicestage.v3.model;

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
public class ShowRuntimeStacksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtimestacks")

    private List<RuntimeStackView> runtimestacks = null;

    public ShowRuntimeStacksResponse withRuntimestacks(List<RuntimeStackView> runtimestacks) {
        this.runtimestacks = runtimestacks;
        return this;
    }

    public ShowRuntimeStacksResponse addRuntimestacksItem(RuntimeStackView runtimestacksItem) {
        if (this.runtimestacks == null) {
            this.runtimestacks = new ArrayList<>();
        }
        this.runtimestacks.add(runtimestacksItem);
        return this;
    }

    public ShowRuntimeStacksResponse withRuntimestacks(Consumer<List<RuntimeStackView>> runtimestacksSetter) {
        if (this.runtimestacks == null) {
            this.runtimestacks = new ArrayList<>();
        }
        runtimestacksSetter.accept(this.runtimestacks);
        return this;
    }

    /**
     * Get runtimestacks
     * @return runtimestacks
     */
    public List<RuntimeStackView> getRuntimestacks() {
        return runtimestacks;
    }

    public void setRuntimestacks(List<RuntimeStackView> runtimestacks) {
        this.runtimestacks = runtimestacks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRuntimeStacksResponse that = (ShowRuntimeStacksResponse) obj;
        return Objects.equals(this.runtimestacks, that.runtimestacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimestacks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRuntimeStacksResponse {\n");
        sb.append("    runtimestacks: ").append(toIndentedString(runtimestacks)).append("\n");
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
