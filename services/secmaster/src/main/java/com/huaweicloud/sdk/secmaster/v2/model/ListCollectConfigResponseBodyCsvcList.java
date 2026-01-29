package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCollectConfigResponseBodyCsvcList
 */
public class ListCollectConfigResponseBodyCsvcList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc")

    private String csvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_list")

    private List<ListCollectConfigResponseBodySourceList> sourceList = null;

    public ListCollectConfigResponseBodyCsvcList withCsvc(String csvc) {
        this.csvc = csvc;
        return this;
    }

    /**
     * 云产品ID
     * @return csvc
     */
    public String getCsvc() {
        return csvc;
    }

    public void setCsvc(String csvc) {
        this.csvc = csvc;
    }

    public ListCollectConfigResponseBodyCsvcList withSourceList(
        List<ListCollectConfigResponseBodySourceList> sourceList) {
        this.sourceList = sourceList;
        return this;
    }

    public ListCollectConfigResponseBodyCsvcList addSourceListItem(
        ListCollectConfigResponseBodySourceList sourceListItem) {
        if (this.sourceList == null) {
            this.sourceList = new ArrayList<>();
        }
        this.sourceList.add(sourceListItem);
        return this;
    }

    public ListCollectConfigResponseBodyCsvcList withSourceList(
        Consumer<List<ListCollectConfigResponseBodySourceList>> sourceListSetter) {
        if (this.sourceList == null) {
            this.sourceList = new ArrayList<>();
        }
        sourceListSetter.accept(this.sourceList);
        return this;
    }

    /**
     * 所有的日志类型
     * @return sourceList
     */
    public List<ListCollectConfigResponseBodySourceList> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<ListCollectConfigResponseBodySourceList> sourceList) {
        this.sourceList = sourceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyCsvcList that = (ListCollectConfigResponseBodyCsvcList) obj;
        return Objects.equals(this.csvc, that.csvc) && Objects.equals(this.sourceList, that.sourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csvc, sourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyCsvcList {\n");
        sb.append("    csvc: ").append(toIndentedString(csvc)).append("\n");
        sb.append("    sourceList: ").append(toIndentedString(sourceList)).append("\n");
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
