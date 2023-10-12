package com.huaweicloud.sdk.css.v1.model;

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
public class ListSmnTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topicsName")

    private List<String> topicsName = null;

    public ListSmnTopicsResponse withTopicsName(List<String> topicsName) {
        this.topicsName = topicsName;
        return this;
    }

    public ListSmnTopicsResponse addTopicsNameItem(String topicsNameItem) {
        if (this.topicsName == null) {
            this.topicsName = new ArrayList<>();
        }
        this.topicsName.add(topicsNameItem);
        return this;
    }

    public ListSmnTopicsResponse withTopicsName(Consumer<List<String>> topicsNameSetter) {
        if (this.topicsName == null) {
            this.topicsName = new ArrayList<>();
        }
        topicsNameSetter.accept(this.topicsName);
        return this;
    }

    /**
     * SMN主题名称列表。
     * @return topicsName
     */
    public List<String> getTopicsName() {
        return topicsName;
    }

    public void setTopicsName(List<String> topicsName) {
        this.topicsName = topicsName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSmnTopicsResponse that = (ListSmnTopicsResponse) obj;
        return Objects.equals(this.topicsName, that.topicsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicsName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmnTopicsResponse {\n");
        sb.append("    topicsName: ").append(toIndentedString(topicsName)).append("\n");
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
