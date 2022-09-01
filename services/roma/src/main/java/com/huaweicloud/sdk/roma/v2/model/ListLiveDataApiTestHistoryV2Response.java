package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLiveDataApiTestHistoryV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    @JacksonXmlProperty(localName = "histories")

    private List<LdApiTestHistoryInfoV2> histories = null;

    public ListLiveDataApiTestHistoryV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListLiveDataApiTestHistoryV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListLiveDataApiTestHistoryV2Response withHistories(List<LdApiTestHistoryInfoV2> histories) {
        this.histories = histories;
        return this;
    }

    public ListLiveDataApiTestHistoryV2Response addHistoriesItem(LdApiTestHistoryInfoV2 historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ListLiveDataApiTestHistoryV2Response withHistories(Consumer<List<LdApiTestHistoryInfoV2>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 本次查询到的测试结果对象列表
     * @return histories
     */
    public List<LdApiTestHistoryInfoV2> getHistories() {
        return histories;
    }

    public void setHistories(List<LdApiTestHistoryInfoV2> histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveDataApiTestHistoryV2Response listLiveDataApiTestHistoryV2Response =
            (ListLiveDataApiTestHistoryV2Response) o;
        return Objects.equals(this.size, listLiveDataApiTestHistoryV2Response.size)
            && Objects.equals(this.total, listLiveDataApiTestHistoryV2Response.total)
            && Objects.equals(this.histories, listLiveDataApiTestHistoryV2Response.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveDataApiTestHistoryV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
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
