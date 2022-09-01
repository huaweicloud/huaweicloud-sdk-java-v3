package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFlavorInfosRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    @JacksonXmlProperty(localName = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListFlavorInfosRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 数据库类型。   - 取值为“cassandra”，表示查询GaussDB(for Cassandra)数据库实例支持的规格。   - 取值为“mongodb”，表示查询GaussDB(for Mongo)数据库实例支持的规格。   - 取值为“influxdb”，表示查询GaussDB(for Influx)数据库实例支持的规格。   - 取值为“redis”，表示查询GaussDB(for Redis)数据库实例支持的规格。   - 如果不传该参数，默认为“cassandra”。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ListFlavorInfosRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。   - 从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询）。   - 取值必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFlavorInfosRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询规格信息上限值。   - 取值范围: 1~100。   - 不传该参数时，默认查询前100条规格信息。
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
        ListFlavorInfosRequest listFlavorInfosRequest = (ListFlavorInfosRequest) o;
        return Objects.equals(this.engineName, listFlavorInfosRequest.engineName)
            && Objects.equals(this.offset, listFlavorInfosRequest.offset)
            && Objects.equals(this.limit, listFlavorInfosRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorInfosRequest {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
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
