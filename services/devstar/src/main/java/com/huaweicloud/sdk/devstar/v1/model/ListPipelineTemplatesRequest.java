package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPipelineTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListPipelineTemplatesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /** 语言类型 中文:zh-cn 英文:en-us
     * 
     * @return xLanguage */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListPipelineTemplatesRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** 区域id
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListPipelineTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询，默认0 minimum: 0 maximum: 1000000
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPipelineTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，默认10 minimum: 1 maximum: 100
     * 
     * @return limit */
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
        ListPipelineTemplatesRequest listPipelineTemplatesRequest = (ListPipelineTemplatesRequest) o;
        return Objects.equals(this.xLanguage, listPipelineTemplatesRequest.xLanguage)
            && Objects.equals(this.regionId, listPipelineTemplatesRequest.regionId)
            && Objects.equals(this.offset, listPipelineTemplatesRequest.offset)
            && Objects.equals(this.limit, listPipelineTemplatesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, regionId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineTemplatesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
