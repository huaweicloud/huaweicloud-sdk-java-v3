package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTopDomainNamesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_domain_names")

    private List<Map<String, Object>> topDomainNames = null;

    public ShowTopDomainNamesResponse withTopDomainNames(List<Map<String, Object>> topDomainNames) {
        this.topDomainNames = topDomainNames;
        return this;
    }

    public ShowTopDomainNamesResponse addTopDomainNamesItem(Map<String, Object> topDomainNamesItem) {
        if (this.topDomainNames == null) {
            this.topDomainNames = new ArrayList<>();
        }
        this.topDomainNames.add(topDomainNamesItem);
        return this;
    }

    public ShowTopDomainNamesResponse withTopDomainNames(Consumer<List<Map<String, Object>>> topDomainNamesSetter) {
        if (this.topDomainNames == null) {
            this.topDomainNames = new ArrayList<>();
        }
        topDomainNamesSetter.accept(this.topDomainNames);
        return this;
    }

    /**
     * top域名信息
     * @return topDomainNames
     */
    public List<Map<String, Object>> getTopDomainNames() {
        return topDomainNames;
    }

    public void setTopDomainNames(List<Map<String, Object>> topDomainNames) {
        this.topDomainNames = topDomainNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTopDomainNamesResponse showTopDomainNamesResponse = (ShowTopDomainNamesResponse) o;
        return Objects.equals(this.topDomainNames, showTopDomainNamesResponse.topDomainNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topDomainNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopDomainNamesResponse {\n");
        sb.append("    topDomainNames: ").append(toIndentedString(topDomainNames)).append("\n");
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
