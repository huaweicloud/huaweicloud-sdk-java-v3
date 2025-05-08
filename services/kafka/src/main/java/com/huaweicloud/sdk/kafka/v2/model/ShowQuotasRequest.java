package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowQuotasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeTagsQuota")

    private String includeTagsQuota;

    public ShowQuotasRequest withIncludeTagsQuota(String includeTagsQuota) {
        this.includeTagsQuota = includeTagsQuota;
        return this;
    }

    /**
     * 是否包含标签配额。
     * @return includeTagsQuota
     */
    public String getIncludeTagsQuota() {
        return includeTagsQuota;
    }

    public void setIncludeTagsQuota(String includeTagsQuota) {
        this.includeTagsQuota = includeTagsQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasRequest that = (ShowQuotasRequest) obj;
        return Objects.equals(this.includeTagsQuota, that.includeTagsQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeTagsQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRequest {\n");
        sb.append("    includeTagsQuota: ").append(toIndentedString(includeTagsQuota)).append("\n");
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
