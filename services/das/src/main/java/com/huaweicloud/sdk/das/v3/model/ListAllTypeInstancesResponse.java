package com.huaweicloud.sdk.das.v3.model;

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
public class ListAllTypeInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entry_names")

    private List<String> entryNames = null;

    public ListAllTypeInstancesResponse withEntryNames(List<String> entryNames) {
        this.entryNames = entryNames;
        return this;
    }

    public ListAllTypeInstancesResponse addEntryNamesItem(String entryNamesItem) {
        if (this.entryNames == null) {
            this.entryNames = new ArrayList<>();
        }
        this.entryNames.add(entryNamesItem);
        return this;
    }

    public ListAllTypeInstancesResponse withEntryNames(Consumer<List<String>> entryNamesSetter) {
        if (this.entryNames == null) {
            this.entryNames = new ArrayList<>();
        }
        entryNamesSetter.accept(this.entryNames);
        return this;
    }

    /**
     * 错误信息条件列表
     * @return entryNames
     */
    public List<String> getEntryNames() {
        return entryNames;
    }

    public void setEntryNames(List<String> entryNames) {
        this.entryNames = entryNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllTypeInstancesResponse that = (ListAllTypeInstancesResponse) obj;
        return Objects.equals(this.entryNames, that.entryNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entryNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllTypeInstancesResponse {\n");
        sb.append("    entryNames: ").append(toIndentedString(entryNames)).append("\n");
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
