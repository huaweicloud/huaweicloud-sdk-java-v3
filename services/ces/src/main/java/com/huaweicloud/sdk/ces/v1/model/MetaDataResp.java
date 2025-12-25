package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询结果元数据信息，包括分页信息等。
 */
public class MetaDataResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public MetaDataResp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 当前返回结果条数。 **取值范围**: 0 - 2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public MetaDataResp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 结果总条数。 **取值范围**： 0 - 2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public MetaDataResp withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释**： 下一个开始的标记，用于分页。如本次查询10条数据，第十条alarm_id为al1441967036681YkazZ0deN，下次start配置为al1441967036681YkazZ0deN可从该alarm_id开始查询。 **取值范围**： 1 - 9999 
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataResp that = (MetaDataResp) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.total, that.total)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, total, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaDataResp {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
