package com.huaweicloud.sdk.rds.v3.model;

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
public class ShowTopObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_time")

    private Long curTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_object_list")

    private List<TopObject> topObjectList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_object_overview_list")

    private List<TopObjectOverview> topObjectOverviewList = null;

    public ShowTopObjectsResponse withCurTime(Long curTime) {
        this.curTime = curTime;
        return this;
    }

    /**
     * 更新时间
     * @return curTime
     */
    public Long getCurTime() {
        return curTime;
    }

    public void setCurTime(Long curTime) {
        this.curTime = curTime;
    }

    public ShowTopObjectsResponse withTopObjectList(List<TopObject> topObjectList) {
        this.topObjectList = topObjectList;
        return this;
    }

    public ShowTopObjectsResponse addTopObjectListItem(TopObject topObjectListItem) {
        if (this.topObjectList == null) {
            this.topObjectList = new ArrayList<>();
        }
        this.topObjectList.add(topObjectListItem);
        return this;
    }

    public ShowTopObjectsResponse withTopObjectList(Consumer<List<TopObject>> topObjectListSetter) {
        if (this.topObjectList == null) {
            this.topObjectList = new ArrayList<>();
        }
        topObjectListSetter.accept(this.topObjectList);
        return this;
    }

    /**
     * 明细
     * @return topObjectList
     */
    public List<TopObject> getTopObjectList() {
        return topObjectList;
    }

    public void setTopObjectList(List<TopObject> topObjectList) {
        this.topObjectList = topObjectList;
    }

    public ShowTopObjectsResponse withTopObjectOverviewList(List<TopObjectOverview> topObjectOverviewList) {
        this.topObjectOverviewList = topObjectOverviewList;
        return this;
    }

    public ShowTopObjectsResponse addTopObjectOverviewListItem(TopObjectOverview topObjectOverviewListItem) {
        if (this.topObjectOverviewList == null) {
            this.topObjectOverviewList = new ArrayList<>();
        }
        this.topObjectOverviewList.add(topObjectOverviewListItem);
        return this;
    }

    public ShowTopObjectsResponse withTopObjectOverviewList(
        Consumer<List<TopObjectOverview>> topObjectOverviewListSetter) {
        if (this.topObjectOverviewList == null) {
            this.topObjectOverviewList = new ArrayList<>();
        }
        topObjectOverviewListSetter.accept(this.topObjectOverviewList);
        return this;
    }

    /**
     * 总览
     * @return topObjectOverviewList
     */
    public List<TopObjectOverview> getTopObjectOverviewList() {
        return topObjectOverviewList;
    }

    public void setTopObjectOverviewList(List<TopObjectOverview> topObjectOverviewList) {
        this.topObjectOverviewList = topObjectOverviewList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopObjectsResponse that = (ShowTopObjectsResponse) obj;
        return Objects.equals(this.curTime, that.curTime) && Objects.equals(this.topObjectList, that.topObjectList)
            && Objects.equals(this.topObjectOverviewList, that.topObjectOverviewList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curTime, topObjectList, topObjectOverviewList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopObjectsResponse {\n");
        sb.append("    curTime: ").append(toIndentedString(curTime)).append("\n");
        sb.append("    topObjectList: ").append(toIndentedString(topObjectList)).append("\n");
        sb.append("    topObjectOverviewList: ").append(toIndentedString(topObjectOverviewList)).append("\n");
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
