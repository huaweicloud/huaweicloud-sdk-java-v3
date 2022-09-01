package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    @JacksonXmlProperty(localName = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    @JacksonXmlProperty(localName = "pipeline")

    private String pipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entertype")

    @JacksonXmlProperty(localName = "entertype")

    private String entertype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    @JacksonXmlProperty(localName = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dateorder")

    @JacksonXmlProperty(localName = "dateorder")

    private String dateorder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedtimeorder")

    @JacksonXmlProperty(localName = "usedtimeorder")

    private String usedtimeorder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    @JacksonXmlProperty(localName = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    @JacksonXmlProperty(localName = "page_size")

    private Integer pageSize;

    public GetTemplatesRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 模板平台类型
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public GetTemplatesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言类型
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public GetTemplatesRequest withPipeline(String pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * 是否支持流水线
     * @return pipeline
     */
    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public GetTemplatesRequest withEntertype(String entertype) {
        this.entertype = entertype;
        return this;
    }

    /**
     * 模板分类
     * @return entertype
     */
    public String getEntertype() {
        return entertype;
    }

    public void setEntertype(String entertype) {
        this.entertype = entertype;
    }

    public GetTemplatesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * 模板名称
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public GetTemplatesRequest withDateorder(String dateorder) {
        this.dateorder = dateorder;
        return this;
    }

    /**
     * 模板日期排序
     * @return dateorder
     */
    public String getDateorder() {
        return dateorder;
    }

    public void setDateorder(String dateorder) {
        this.dateorder = dateorder;
    }

    public GetTemplatesRequest withUsedtimeorder(String usedtimeorder) {
        this.usedtimeorder = usedtimeorder;
        return this;
    }

    /**
     * 模板引用次数排序
     * @return usedtimeorder
     */
    public String getUsedtimeorder() {
        return usedtimeorder;
    }

    public void setUsedtimeorder(String usedtimeorder) {
        this.usedtimeorder = usedtimeorder;
    }

    public GetTemplatesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板公开类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetTemplatesRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 大区名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public GetTemplatesRequest withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 分页页数
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public GetTemplatesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数据数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTemplatesRequest getTemplatesRequest = (GetTemplatesRequest) o;
        return Objects.equals(this.platform, getTemplatesRequest.platform)
            && Objects.equals(this.language, getTemplatesRequest.language)
            && Objects.equals(this.pipeline, getTemplatesRequest.pipeline)
            && Objects.equals(this.entertype, getTemplatesRequest.entertype)
            && Objects.equals(this.search, getTemplatesRequest.search)
            && Objects.equals(this.dateorder, getTemplatesRequest.dateorder)
            && Objects.equals(this.usedtimeorder, getTemplatesRequest.usedtimeorder)
            && Objects.equals(this.type, getTemplatesRequest.type)
            && Objects.equals(this.region, getTemplatesRequest.region)
            && Objects.equals(this.pageNo, getTemplatesRequest.pageNo)
            && Objects.equals(this.pageSize, getTemplatesRequest.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform,
            language,
            pipeline,
            entertype,
            search,
            dateorder,
            usedtimeorder,
            type,
            region,
            pageNo,
            pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTemplatesRequest {\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    entertype: ").append(toIndentedString(entertype)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    dateorder: ").append(toIndentedString(dateorder)).append("\n");
        sb.append("    usedtimeorder: ").append(toIndentedString(usedtimeorder)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
