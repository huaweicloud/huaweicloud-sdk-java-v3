package com.huaweicloud.sdk.rms.v1.model;

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
public class ListPolicyStatesByAssignmentIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private List<PolicyState> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    @JacksonXmlProperty(localName = "page_info")

    private PageInfo pageInfo;

    public ListPolicyStatesByAssignmentIdResponse withValue(List<PolicyState> value) {
        this.value = value;
        return this;
    }

    public ListPolicyStatesByAssignmentIdResponse addValueItem(PolicyState valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public ListPolicyStatesByAssignmentIdResponse withValue(Consumer<List<PolicyState>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 合规结果查询返回值
     * @return value
     */
    public List<PolicyState> getValue() {
        return value;
    }

    public void setValue(List<PolicyState> value) {
        this.value = value;
    }

    public ListPolicyStatesByAssignmentIdResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPolicyStatesByAssignmentIdResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPolicyStatesByAssignmentIdResponse listPolicyStatesByAssignmentIdResponse =
            (ListPolicyStatesByAssignmentIdResponse) o;
        return Objects.equals(this.value, listPolicyStatesByAssignmentIdResponse.value)
            && Objects.equals(this.pageInfo, listPolicyStatesByAssignmentIdResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyStatesByAssignmentIdResponse {\n");
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
