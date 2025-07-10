package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListAgenciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_agencies")

    private List<AgenciesInfo> existingAgencies = null;

    public ListAgenciesResponse withExistingAgencies(List<AgenciesInfo> existingAgencies) {
        this.existingAgencies = existingAgencies;
        return this;
    }

    public ListAgenciesResponse addExistingAgenciesItem(AgenciesInfo existingAgenciesItem) {
        if (this.existingAgencies == null) {
            this.existingAgencies = new ArrayList<>();
        }
        this.existingAgencies.add(existingAgenciesItem);
        return this;
    }

    public ListAgenciesResponse withExistingAgencies(Consumer<List<AgenciesInfo>> existingAgenciesSetter) {
        if (this.existingAgencies == null) {
            this.existingAgencies = new ArrayList<>();
        }
        existingAgenciesSetter.accept(this.existingAgencies);
        return this;
    }

    /**
     * 委托信息。
     * @return existingAgencies
     */
    public List<AgenciesInfo> getExistingAgencies() {
        return existingAgencies;
    }

    public void setExistingAgencies(List<AgenciesInfo> existingAgencies) {
        this.existingAgencies = existingAgencies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgenciesResponse that = (ListAgenciesResponse) obj;
        return Objects.equals(this.existingAgencies, that.existingAgencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existingAgencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgenciesResponse {\n");
        sb.append("    existingAgencies: ").append(toIndentedString(existingAgencies)).append("\n");
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
