package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAssetModelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    public ListAssetModelsRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 过滤条件 示例： {\"key\":\"xxx\"} {\"key1\":\"xxx\",\"key2\":\"xxx\"} {\"key\":{\"eq|like\":\"xxx\"}} {\"key\":{\"in\":[\"xxx\",\"xxx\"]}} {\"or\":{\"key1\":\"xxx\",\"key2\":{\"eq|like\":\"xxx\"},\"key3\":{\"in\":[\"xxx\",\"xxx\"]}}} {\"and\":{\"key1\":\"xxx\",\"key2\":{\"eq|like\":\"xxx\"},\"key3\":{\"in\":[\"xxx\",\"xxx\"]}}} 支持的key： asset_model_id，name，display_name，job_id 注意： job_id只支持contain过滤 {\"job_id\":{\"contain\":\"xxx\"}}
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ListAssetModelsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAssetModelsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssetModelsRequest listAssetModelsRequest = (ListAssetModelsRequest) o;
        return Objects.equals(this.filter, listAssetModelsRequest.filter)
            && Objects.equals(this.limit, listAssetModelsRequest.limit)
            && Objects.equals(this.offset, listAssetModelsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetModelsRequest {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
