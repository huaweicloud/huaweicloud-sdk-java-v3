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
public class CollectRemediationExecutionStatusesSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<RemediationExecutionStatus> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public CollectRemediationExecutionStatusesSummaryResponse withValue(List<RemediationExecutionStatus> value) {
        this.value = value;
        return this;
    }

    public CollectRemediationExecutionStatusesSummaryResponse addValueItem(RemediationExecutionStatus valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public CollectRemediationExecutionStatusesSummaryResponse withValue(
        Consumer<List<RemediationExecutionStatus>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 合规规则修正执行结果查询列表。
     * @return value
     */
    public List<RemediationExecutionStatus> getValue() {
        return value;
    }

    public void setValue(List<RemediationExecutionStatus> value) {
        this.value = value;
    }

    public CollectRemediationExecutionStatusesSummaryResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public CollectRemediationExecutionStatusesSummaryResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        CollectRemediationExecutionStatusesSummaryResponse that =
            (CollectRemediationExecutionStatusesSummaryResponse) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectRemediationExecutionStatusesSummaryResponse {\n");
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
