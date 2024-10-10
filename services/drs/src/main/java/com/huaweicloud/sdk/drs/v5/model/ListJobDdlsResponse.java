package com.huaweicloud.sdk.drs.v5.model;

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
public class ListJobDdlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_list")

    private List<DdlAlarmResp> ddlList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListJobDdlsResponse withDdlList(List<DdlAlarmResp> ddlList) {
        this.ddlList = ddlList;
        return this;
    }

    public ListJobDdlsResponse addDdlListItem(DdlAlarmResp ddlListItem) {
        if (this.ddlList == null) {
            this.ddlList = new ArrayList<>();
        }
        this.ddlList.add(ddlListItem);
        return this;
    }

    public ListJobDdlsResponse withDdlList(Consumer<List<DdlAlarmResp>> ddlListSetter) {
        if (this.ddlList == null) {
            this.ddlList = new ArrayList<>();
        }
        ddlListSetter.accept(this.ddlList);
        return this;
    }

    /**
     * DDL告警信息列表。
     * @return ddlList
     */
    public List<DdlAlarmResp> getDdlList() {
        return ddlList;
    }

    public void setDdlList(List<DdlAlarmResp> ddlList) {
        this.ddlList = ddlList;
    }

    public ListJobDdlsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobDdlsResponse that = (ListJobDdlsResponse) obj;
        return Objects.equals(this.ddlList, that.ddlList) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddlList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobDdlsResponse {\n");
        sb.append("    ddlList: ").append(toIndentedString(ddlList)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
