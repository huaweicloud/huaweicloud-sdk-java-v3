package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTwoTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    private String pipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enter_type")

    private String enterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_order")

    private String dateOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_time_order")

    private String usedTimeOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ListTwoTemplatesRequest withPlatform(String platform) {
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

    public ListTwoTemplatesRequest withLanguage(String language) {
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

    public ListTwoTemplatesRequest withPipeline(String pipeline) {
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

    public ListTwoTemplatesRequest withEnterType(String enterType) {
        this.enterType = enterType;
        return this;
    }

    /**
     * 模板分类
     * @return enterType
     */
    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType;
    }

    public ListTwoTemplatesRequest withSearch(String search) {
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

    public ListTwoTemplatesRequest withDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
        return this;
    }

    /**
     * 模板日期排序
     * @return dateOrder
     */
    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public ListTwoTemplatesRequest withUsedTimeOrder(String usedTimeOrder) {
        this.usedTimeOrder = usedTimeOrder;
        return this;
    }

    /**
     * 模板引用次数排序
     * @return usedTimeOrder
     */
    public String getUsedTimeOrder() {
        return usedTimeOrder;
    }

    public void setUsedTimeOrder(String usedTimeOrder) {
        this.usedTimeOrder = usedTimeOrder;
    }

    public ListTwoTemplatesRequest withType(String type) {
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

    public ListTwoTemplatesRequest withRegion(String region) {
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

    public ListTwoTemplatesRequest withPageNo(Integer pageNo) {
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

    public ListTwoTemplatesRequest withPageSize(Integer pageSize) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTwoTemplatesRequest that = (ListTwoTemplatesRequest) obj;
        return Objects.equals(this.platform, that.platform) && Objects.equals(this.language, that.language)
            && Objects.equals(this.pipeline, that.pipeline) && Objects.equals(this.enterType, that.enterType)
            && Objects.equals(this.search, that.search) && Objects.equals(this.dateOrder, that.dateOrder)
            && Objects.equals(this.usedTimeOrder, that.usedTimeOrder) && Objects.equals(this.type, that.type)
            && Objects.equals(this.region, that.region) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform,
            language,
            pipeline,
            enterType,
            search,
            dateOrder,
            usedTimeOrder,
            type,
            region,
            pageNo,
            pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTwoTemplatesRequest {\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    enterType: ").append(toIndentedString(enterType)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    dateOrder: ").append(toIndentedString(dateOrder)).append("\n");
        sb.append("    usedTimeOrder: ").append(toIndentedString(usedTimeOrder)).append("\n");
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
