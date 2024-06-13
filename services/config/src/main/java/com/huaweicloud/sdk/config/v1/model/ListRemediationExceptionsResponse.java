package com.huaweicloud.sdk.config.v1.model;

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
public class ListRemediationExceptionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<RemediationException> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListRemediationExceptionsResponse withValue(List<RemediationException> value) {
        this.value = value;
        return this;
    }

    public ListRemediationExceptionsResponse addValueItem(RemediationException valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public ListRemediationExceptionsResponse withValue(Consumer<List<RemediationException>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 合规规则修正例外的详情。
     * @return value
     */
    public List<RemediationException> getValue() {
        return value;
    }

    public void setValue(List<RemediationException> value) {
        this.value = value;
    }

    public ListRemediationExceptionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRemediationExceptionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRemediationExceptionsResponse that = (ListRemediationExceptionsResponse) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRemediationExceptionsResponse {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
