package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListServicesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sorted")

    @JacksonXmlProperty(localName = "sorted")

    private String sorted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    @JacksonXmlProperty(localName = "ief-instance-id")

    private String iefInstanceId;

    public ListServicesRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定分页查询每页的行数，最大为100，默认值为10。
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListServicesRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 指定要查询的偏移数量，默认为0。
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListServicesRequest withSorted(String sorted) {
        this.sorted = sorted;
        return this;
    }

    /**
     * 响应中查询到的服务将按照指定的字段进行排序
     * @return sorted
     */
    public String getSorted() {
        return sorted;
    }

    public void setSorted(String sorted) {
        this.sorted = sorted;
    }

    public ListServicesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListServicesRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 按照相关的应用查询服务
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListServicesRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServicesRequest listServicesRequest = (ListServicesRequest) o;
        return Objects.equals(this.limit, listServicesRequest.limit)
            && Objects.equals(this.offset, listServicesRequest.offset)
            && Objects.equals(this.sorted, listServicesRequest.sorted)
            && Objects.equals(this.name, listServicesRequest.name) && Objects.equals(this.app, listServicesRequest.app)
            && Objects.equals(this.iefInstanceId, listServicesRequest.iefInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, sorted, name, app, iefInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServicesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
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
