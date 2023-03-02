package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckPutEventsReq
 */
public class CheckPutEventsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<CheckPutEventsReqSources> sources = null;

    public CheckPutEventsReq withSources(List<CheckPutEventsReqSources> sources) {
        this.sources = sources;
        return this;
    }

    public CheckPutEventsReq addSourcesItem(CheckPutEventsReqSources sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public CheckPutEventsReq withSources(Consumer<List<CheckPutEventsReqSources>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * Get sources
     * @return sources
     */
    public List<CheckPutEventsReqSources> getSources() {
        return sources;
    }

    public void setSources(List<CheckPutEventsReqSources> sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckPutEventsReq checkPutEventsReq = (CheckPutEventsReq) o;
        return Objects.equals(this.sources, checkPutEventsReq.sources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckPutEventsReq {\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
