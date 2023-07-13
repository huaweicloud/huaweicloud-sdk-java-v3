package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListImageBaseInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_info")

    private List<DataInfo> dataInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListImageBaseInfoResponse withDataInfo(List<DataInfo> dataInfo) {
        this.dataInfo = dataInfo;
        return this;
    }

    public ListImageBaseInfoResponse addDataInfoItem(DataInfo dataInfoItem) {
        if (this.dataInfo == null) {
            this.dataInfo = new ArrayList<>();
        }
        this.dataInfo.add(dataInfoItem);
        return this;
    }

    public ListImageBaseInfoResponse withDataInfo(Consumer<List<DataInfo>> dataInfoSetter) {
        if (this.dataInfo == null) {
            this.dataInfo = new ArrayList<>();
        }
        dataInfoSetter.accept(this.dataInfo);
        return this;
    }

    /**
     * 数据信息列表。
     * @return dataInfo
     */
    public List<DataInfo> getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(List<DataInfo> dataInfo) {
        this.dataInfo = dataInfo;
    }

    public ListImageBaseInfoResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListImageBaseInfoResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageBaseInfoResponse that = (ListImageBaseInfoResponse) obj;
        return Objects.equals(this.dataInfo, that.dataInfo) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInfo, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageBaseInfoResponse {\n");
        sb.append("    dataInfo: ").append(toIndentedString(dataInfo)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
