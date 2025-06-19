package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询出的IP黑名单列表信息，total字段表示已经导入的IP黑名单条数，如果没有导入过则total字段为0条，最大为2条。 records字段中保存了返回的IP黑名单列表信息。
 */
public class PageDataIpBlacklistsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<IpBlacklistVO> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public PageDataIpBlacklistsVo withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 一次查询返回的记录条数，调用接口时赋值
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public PageDataIpBlacklistsVo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 本次查询结果返回后下次查询的偏移
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public PageDataIpBlacklistsVo withRecords(List<IpBlacklistVO> records) {
        this.records = records;
        return this;
    }

    public PageDataIpBlacklistsVo addRecordsItem(IpBlacklistVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public PageDataIpBlacklistsVo withRecords(Consumer<List<IpBlacklistVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 查询出的IP黑名单列表信息
     * @return records
     */
    public List<IpBlacklistVO> getRecords() {
        return records;
    }

    public void setRecords(List<IpBlacklistVO> records) {
        this.records = records;
    }

    public PageDataIpBlacklistsVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 防火墙实例中IP黑名单的总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageDataIpBlacklistsVo that = (PageDataIpBlacklistsVo) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.records, that.records) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, records, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageDataIpBlacklistsVo {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
