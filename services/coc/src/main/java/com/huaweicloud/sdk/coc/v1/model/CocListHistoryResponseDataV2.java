package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 历史数据详细
 */
public class CocListHistoryResponseDataV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private List<CocTicketHistoryBaseInfoV2> info = null;

    public CocListHistoryResponseDataV2 withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public CocListHistoryResponseDataV2 withInfo(List<CocTicketHistoryBaseInfoV2> info) {
        this.info = info;
        return this;
    }

    public CocListHistoryResponseDataV2 addInfoItem(CocTicketHistoryBaseInfoV2 infoItem) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        this.info.add(infoItem);
        return this;
    }

    public CocListHistoryResponseDataV2 withInfo(Consumer<List<CocTicketHistoryBaseInfoV2>> infoSetter) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        infoSetter.accept(this.info);
        return this;
    }

    /**
     * 历史详情
     * @return info
     */
    public List<CocTicketHistoryBaseInfoV2> getInfo() {
        return info;
    }

    public void setInfo(List<CocTicketHistoryBaseInfoV2> info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocListHistoryResponseDataV2 that = (CocListHistoryResponseDataV2) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocListHistoryResponseDataV2 {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
