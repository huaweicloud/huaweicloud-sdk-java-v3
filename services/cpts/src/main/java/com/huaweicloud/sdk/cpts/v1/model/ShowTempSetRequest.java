package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTempSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_id")

    @JacksonXmlProperty(localName = "test_suite_id")

    private Integer testSuiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ShowTempSetRequest withTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * 测试工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuiteId
     */
    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public ShowTempSetRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowTempSetRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数量
     * minimum: 0
     * maximum: 2147483647
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTempSetRequest showTempSetRequest = (ShowTempSetRequest) o;
        return Objects.equals(this.testSuiteId, showTempSetRequest.testSuiteId)
            && Objects.equals(this.offset, showTempSetRequest.offset)
            && Objects.equals(this.limit, showTempSetRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testSuiteId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTempSetRequest {\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
