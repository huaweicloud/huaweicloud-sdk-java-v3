package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问控制列表，包含Grant、 Grantee、Permission三个元素 
 */
@JacksonXmlRootElement(localName = "AccessControlList")
public class AccessControlList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Grant")

    @JacksonXmlProperty(localName = "Grant")
    private List<Grant> grant = null;

    public AccessControlList withGrant(List<Grant> grant) {
        this.grant = grant;
        return this;
    }

    public AccessControlList addGrantItem(Grant grantItem) {
        if (this.grant == null) {
            this.grant = new ArrayList<>();
        }
        this.grant.add(grantItem);
        return this;
    }

    public AccessControlList withGrant(Consumer<List<Grant>> grantSetter) {
        if (this.grant == null) {
            this.grant = new ArrayList<>();
        }
        grantSetter.accept(this.grant);
        return this;
    }

    /**
     * Get grant
     * @return grant
     */
    public List<Grant> getGrant() {
        return grant;
    }

    public void setGrant(List<Grant> grant) {
        this.grant = grant;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList that = (AccessControlList) obj;
        return Objects.equals(this.grant, that.grant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessControlList {\n");
        sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
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
