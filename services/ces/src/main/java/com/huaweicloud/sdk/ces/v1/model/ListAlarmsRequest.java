package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    @JacksonXmlProperty(localName = "start")

    private String start;

    public ListAlarmsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 取值范围(0,100]，默认值为100  用于限制结果数据条数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlarmsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 用于标识结果排序方法。  取值说明，默认值为desc。  asc：升序 desc：降序
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListAlarmsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 分页起始值，内容为alarm_id。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmsRequest listAlarmsRequest = (ListAlarmsRequest) o;
        return Objects.equals(this.limit, listAlarmsRequest.limit)
            && Objects.equals(this.order, listAlarmsRequest.order)
            && Objects.equals(this.start, listAlarmsRequest.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, order, start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
