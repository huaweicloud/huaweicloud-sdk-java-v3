package com.huaweicloud.sdk.rds.v3.model;

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
public class ShowAvailableVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_versions")

    private List<String> availableVersions = null;

    public ShowAvailableVersionResponse withAvailableVersions(List<String> availableVersions) {
        this.availableVersions = availableVersions;
        return this;
    }

    public ShowAvailableVersionResponse addAvailableVersionsItem(String availableVersionsItem) {
        if (this.availableVersions == null) {
            this.availableVersions = new ArrayList<>();
        }
        this.availableVersions.add(availableVersionsItem);
        return this;
    }

    public ShowAvailableVersionResponse withAvailableVersions(Consumer<List<String>> availableVersionsSetter) {
        if (this.availableVersions == null) {
            this.availableVersions = new ArrayList<>();
        }
        availableVersionsSetter.accept(this.availableVersions);
        return this;
    }

    /**
     * 可选版本列表。
     * @return availableVersions
     */
    public List<String> getAvailableVersions() {
        return availableVersions;
    }

    public void setAvailableVersions(List<String> availableVersions) {
        this.availableVersions = availableVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableVersionResponse that = (ShowAvailableVersionResponse) obj;
        return Objects.equals(this.availableVersions, that.availableVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableVersionResponse {\n");
        sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
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
