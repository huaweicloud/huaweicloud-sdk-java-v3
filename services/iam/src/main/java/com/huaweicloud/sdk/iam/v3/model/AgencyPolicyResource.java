package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgencyPolicyResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    @JacksonXmlProperty(localName = "uri")

    private List<String> uri = null;

    public AgencyPolicyResource withUri(List<String> uri) {
        this.uri = uri;
        return this;
    }

    public AgencyPolicyResource addUriItem(String uriItem) {
        if (this.uri == null) {
            this.uri = new ArrayList<>();
        }
        this.uri.add(uriItem);
        return this;
    }

    public AgencyPolicyResource withUri(Consumer<List<String>> uriSetter) {
        if (this.uri == null) {
            this.uri = new ArrayList<>();
        }
        uriSetter.accept(this.uri);
        return this;
    }

    /**
     * 委托资源的URI，长度不超过128。格式为：/iam/agencies/委托ID。例： ``` \"uri\": [\"/iam/agencies/07805acaba800fdd4fbdc00b8f888c7c\"] ```
     * @return uri
     */
    public List<String> getUri() {
        return uri;
    }

    public void setUri(List<String> uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyPolicyResource agencyPolicyResource = (AgencyPolicyResource) o;
        return Objects.equals(this.uri, agencyPolicyResource.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyPolicyResource {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
