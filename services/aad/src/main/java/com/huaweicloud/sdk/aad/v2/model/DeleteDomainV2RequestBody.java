package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteDomainV2RequestBody
 */
public class DeleteDomainV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private List<String> domainId = null;

    public DeleteDomainV2RequestBody withDomainId(List<String> domainId) {
        this.domainId = domainId;
        return this;
    }

    public DeleteDomainV2RequestBody addDomainIdItem(String domainIdItem) {
        if (this.domainId == null) {
            this.domainId = new ArrayList<>();
        }
        this.domainId.add(domainIdItem);
        return this;
    }

    public DeleteDomainV2RequestBody withDomainId(Consumer<List<String>> domainIdSetter) {
        if (this.domainId == null) {
            this.domainId = new ArrayList<>();
        }
        domainIdSetter.accept(this.domainId);
        return this;
    }

    /**
     * 域名id列表
     * @return domainId
     */
    public List<String> getDomainId() {
        return domainId;
    }

    public void setDomainId(List<String> domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDomainV2RequestBody that = (DeleteDomainV2RequestBody) obj;
        return Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDomainV2RequestBody {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
