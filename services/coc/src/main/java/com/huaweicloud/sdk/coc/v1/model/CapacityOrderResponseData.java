package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CapacityOrderResponseData
 */
public class CapacityOrderResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_list")

    private CapacityOrderResponseRankList rankList;

    public CapacityOrderResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 容量的种类。 **取值范围：** 根据云服务容量数据显示具体容量类型，一般种类 - cpu：CPU核数。 - mem：内存。 - size：云盘大小。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CapacityOrderResponseData withRankList(CapacityOrderResponseRankList rankList) {
        this.rankList = rankList;
        return this;
    }

    public CapacityOrderResponseData withRankList(Consumer<CapacityOrderResponseRankList> rankListSetter) {
        if (this.rankList == null) {
            this.rankList = new CapacityOrderResponseRankList();
            rankListSetter.accept(this.rankList);
        }

        return this;
    }

    /**
     * Get rankList
     * @return rankList
     */
    public CapacityOrderResponseRankList getRankList() {
        return rankList;
    }

    public void setRankList(CapacityOrderResponseRankList rankList) {
        this.rankList = rankList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacityOrderResponseData that = (CapacityOrderResponseData) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.rankList, that.rankList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, rankList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityOrderResponseData {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rankList: ").append(toIndentedString(rankList)).append("\n");
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
