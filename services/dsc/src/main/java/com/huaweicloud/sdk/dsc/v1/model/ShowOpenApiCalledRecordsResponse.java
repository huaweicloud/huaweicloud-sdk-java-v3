package com.huaweicloud.sdk.dsc.v1.model;

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
public class ShowOpenApiCalledRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed")

    @JacksonXmlProperty(localName = "succeed")

    private Integer succeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    @JacksonXmlProperty(localName = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openapi_called_records")

    @JacksonXmlProperty(localName = "openapi_called_records")

    private List<OpenApiCalledRecord> openapiCalledRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    @JacksonXmlProperty(localName = "next_marker")

    private String nextMarker;

    public ShowOpenApiCalledRecordsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 调用API总次数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowOpenApiCalledRecordsResponse withSucceed(Integer succeed) {
        this.succeed = succeed;
        return this;
    }

    /**
     * 调用API成功次数
     * @return succeed
     */
    public Integer getSucceed() {
        return succeed;
    }

    public void setSucceed(Integer succeed) {
        this.succeed = succeed;
    }

    public ShowOpenApiCalledRecordsResponse withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 调用API失败次数
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public ShowOpenApiCalledRecordsResponse withOpenapiCalledRecords(List<OpenApiCalledRecord> openapiCalledRecords) {
        this.openapiCalledRecords = openapiCalledRecords;
        return this;
    }

    public ShowOpenApiCalledRecordsResponse addOpenapiCalledRecordsItem(OpenApiCalledRecord openapiCalledRecordsItem) {
        if (this.openapiCalledRecords == null) {
            this.openapiCalledRecords = new ArrayList<>();
        }
        this.openapiCalledRecords.add(openapiCalledRecordsItem);
        return this;
    }

    public ShowOpenApiCalledRecordsResponse withOpenapiCalledRecords(
        Consumer<List<OpenApiCalledRecord>> openapiCalledRecordsSetter) {
        if (this.openapiCalledRecords == null) {
            this.openapiCalledRecords = new ArrayList<>();
        }
        openapiCalledRecordsSetter.accept(this.openapiCalledRecords);
        return this;
    }

    /**
     * API调用记录列表
     * @return openapiCalledRecords
     */
    public List<OpenApiCalledRecord> getOpenapiCalledRecords() {
        return openapiCalledRecords;
    }

    public void setOpenapiCalledRecords(List<OpenApiCalledRecord> openapiCalledRecords) {
        this.openapiCalledRecords = openapiCalledRecords;
    }

    public ShowOpenApiCalledRecordsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 获取下一页所需的标识符。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOpenApiCalledRecordsResponse showOpenApiCalledRecordsResponse = (ShowOpenApiCalledRecordsResponse) o;
        return Objects.equals(this.total, showOpenApiCalledRecordsResponse.total)
            && Objects.equals(this.succeed, showOpenApiCalledRecordsResponse.succeed)
            && Objects.equals(this.failed, showOpenApiCalledRecordsResponse.failed)
            && Objects.equals(this.openapiCalledRecords, showOpenApiCalledRecordsResponse.openapiCalledRecords)
            && Objects.equals(this.nextMarker, showOpenApiCalledRecordsResponse.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, succeed, failed, openapiCalledRecords, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpenApiCalledRecordsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    succeed: ").append(toIndentedString(succeed)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    openapiCalledRecords: ").append(toIndentedString(openapiCalledRecords)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
