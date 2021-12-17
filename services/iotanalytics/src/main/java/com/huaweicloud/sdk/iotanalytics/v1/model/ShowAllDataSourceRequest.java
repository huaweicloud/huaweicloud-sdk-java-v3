package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowAllDataSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ShowAllDataSourceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** filter
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAllDataSourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /** 数据源类型, 包括：OBS、DIS、IOTDA、SMN、FUNCTION_GRAPH、MODEL_ARTS、DCS、KAFKA、API
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowAllDataSourceRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每次查询返回元素的上限 minimum: 1 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowAllDataSourceRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询，offset大于等于0 minimum: 0 maximum: 65535
     * 
     * @return offset */
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
        ShowAllDataSourceRequest showAllDataSourceRequest = (ShowAllDataSourceRequest) o;
        return Objects.equals(this.name, showAllDataSourceRequest.name)
            && Objects.equals(this.type, showAllDataSourceRequest.type)
            && Objects.equals(this.limit, showAllDataSourceRequest.limit)
            && Objects.equals(this.offset, showAllDataSourceRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAllDataSourceRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
