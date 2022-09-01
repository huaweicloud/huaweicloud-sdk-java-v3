package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListReadWriteRatioResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRecord")

    @JacksonXmlProperty(localName = "totalRecord")

    private Integer totalRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readWriteRatioList")

    @JacksonXmlProperty(localName = "readWriteRatioList")

    private List<ReadWriteRatioList> readWriteRatioList = null;

    public ListReadWriteRatioResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * DDM读写比例监控信息条数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public ListReadWriteRatioResponse withReadWriteRatioList(List<ReadWriteRatioList> readWriteRatioList) {
        this.readWriteRatioList = readWriteRatioList;
        return this;
    }

    public ListReadWriteRatioResponse addReadWriteRatioListItem(ReadWriteRatioList readWriteRatioListItem) {
        if (this.readWriteRatioList == null) {
            this.readWriteRatioList = new ArrayList<>();
        }
        this.readWriteRatioList.add(readWriteRatioListItem);
        return this;
    }

    public ListReadWriteRatioResponse withReadWriteRatioList(
        Consumer<List<ReadWriteRatioList>> readWriteRatioListSetter) {
        if (this.readWriteRatioList == null) {
            this.readWriteRatioList = new ArrayList<>();
        }
        readWriteRatioListSetter.accept(this.readWriteRatioList);
        return this;
    }

    /**
     * DDM实例读写次数信息列表的集合。
     * @return readWriteRatioList
     */
    public List<ReadWriteRatioList> getReadWriteRatioList() {
        return readWriteRatioList;
    }

    public void setReadWriteRatioList(List<ReadWriteRatioList> readWriteRatioList) {
        this.readWriteRatioList = readWriteRatioList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListReadWriteRatioResponse listReadWriteRatioResponse = (ListReadWriteRatioResponse) o;
        return Objects.equals(this.totalRecord, listReadWriteRatioResponse.totalRecord)
            && Objects.equals(this.readWriteRatioList, listReadWriteRatioResponse.readWriteRatioList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, readWriteRatioList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReadWriteRatioResponse {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    readWriteRatioList: ").append(toIndentedString(readWriteRatioList)).append("\n");
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
