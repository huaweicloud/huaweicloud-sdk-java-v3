package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取SCTE35信号的响应体。
 */
public class SCTE35StatisticRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scte35_info")

    private List<SCTE35InfoItem> scte35Info = null;

    public SCTE35StatisticRsp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询到scet35信息的总个数。
     * minimum: 1
     * maximum: 2147483648
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SCTE35StatisticRsp withScte35Info(List<SCTE35InfoItem> scte35Info) {
        this.scte35Info = scte35Info;
        return this;
    }

    public SCTE35StatisticRsp addScte35InfoItem(SCTE35InfoItem scte35InfoItem) {
        if (this.scte35Info == null) {
            this.scte35Info = new ArrayList<>();
        }
        this.scte35Info.add(scte35InfoItem);
        return this;
    }

    public SCTE35StatisticRsp withScte35Info(Consumer<List<SCTE35InfoItem>> scte35InfoSetter) {
        if (this.scte35Info == null) {
            this.scte35Info = new ArrayList<>();
        }
        scte35InfoSetter.accept(this.scte35Info);
        return this;
    }

    /**
     * 详细的scte35信号的数组。
     * @return scte35Info
     */
    public List<SCTE35InfoItem> getScte35Info() {
        return scte35Info;
    }

    public void setScte35Info(List<SCTE35InfoItem> scte35Info) {
        this.scte35Info = scte35Info;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SCTE35StatisticRsp that = (SCTE35StatisticRsp) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.scte35Info, that.scte35Info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, scte35Info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SCTE35StatisticRsp {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    scte35Info: ").append(toIndentedString(scte35Info)).append("\n");
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
