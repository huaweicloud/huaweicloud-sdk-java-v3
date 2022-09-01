package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQuotaSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_set")

    @JacksonXmlProperty(localName = "quota_set")

    private List<RespQuotaSet> quotaSet = null;

    public ShowQuotaSetsResponse withQuotaSet(List<RespQuotaSet> quotaSet) {
        this.quotaSet = quotaSet;
        return this;
    }

    public ShowQuotaSetsResponse addQuotaSetItem(RespQuotaSet quotaSetItem) {
        if (this.quotaSet == null) {
            this.quotaSet = new ArrayList<>();
        }
        this.quotaSet.add(quotaSetItem);
        return this;
    }

    public ShowQuotaSetsResponse withQuotaSet(Consumer<List<RespQuotaSet>> quotaSetSetter) {
        if (this.quotaSet == null) {
            this.quotaSet = new ArrayList<>();
        }
        quotaSetSetter.accept(this.quotaSet);
        return this;
    }

    /**
     * 专属主机的配额。
     * @return quotaSet
     */
    public List<RespQuotaSet> getQuotaSet() {
        return quotaSet;
    }

    public void setQuotaSet(List<RespQuotaSet> quotaSet) {
        this.quotaSet = quotaSet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQuotaSetsResponse showQuotaSetsResponse = (ShowQuotaSetsResponse) o;
        return Objects.equals(this.quotaSet, showQuotaSetsResponse.quotaSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaSetsResponse {\n");
        sb.append("    quotaSet: ").append(toIndentedString(quotaSet)).append("\n");
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
