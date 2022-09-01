package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListServersDedicatedHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    @JacksonXmlProperty(localName = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    public ListServersDedicatedHostRequest withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机ID。  可以从专属主机控制台查询，或者通过调用查询专属主机列表API获取。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public ListServersDedicatedHostRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每个页面上显示的条目数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServersDedicatedHostRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 该值是上一页最后一条记录的ID。  如果“marker”取值无效，将会返回“400”错误码。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServersDedicatedHostRequest listServersDedicatedHostRequest = (ListServersDedicatedHostRequest) o;
        return Objects.equals(this.dedicatedHostId, listServersDedicatedHostRequest.dedicatedHostId)
            && Objects.equals(this.limit, listServersDedicatedHostRequest.limit)
            && Objects.equals(this.marker, listServersDedicatedHostRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersDedicatedHostRequest {\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
