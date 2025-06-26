package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddDomainNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name_info")

    private DomainNameInfo domainNameInfo;

    public AddDomainNameResponse withDomainNameInfo(DomainNameInfo domainNameInfo) {
        this.domainNameInfo = domainNameInfo;
        return this;
    }

    public AddDomainNameResponse withDomainNameInfo(Consumer<DomainNameInfo> domainNameInfoSetter) {
        if (this.domainNameInfo == null) {
            this.domainNameInfo = new DomainNameInfo();
            domainNameInfoSetter.accept(this.domainNameInfo);
        }

        return this;
    }

    /**
     * Get domainNameInfo
     * @return domainNameInfo
     */
    public DomainNameInfo getDomainNameInfo() {
        return domainNameInfo;
    }

    public void setDomainNameInfo(DomainNameInfo domainNameInfo) {
        this.domainNameInfo = domainNameInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDomainNameResponse that = (AddDomainNameResponse) obj;
        return Objects.equals(this.domainNameInfo, that.domainNameInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainNameInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDomainNameResponse {\n");
        sb.append("    domainNameInfo: ").append(toIndentedString(domainNameInfo)).append("\n");
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
