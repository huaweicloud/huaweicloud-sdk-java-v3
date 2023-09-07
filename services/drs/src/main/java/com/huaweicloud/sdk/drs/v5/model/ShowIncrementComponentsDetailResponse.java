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
public class ShowIncrementComponentsDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_components_list")

    private List<IncreComponentDetail> incrementComponentsList = null;

    public ShowIncrementComponentsDetailResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowIncrementComponentsDetailResponse withIncrementComponentsList(
        List<IncreComponentDetail> incrementComponentsList) {
        this.incrementComponentsList = incrementComponentsList;
        return this;
    }

    public ShowIncrementComponentsDetailResponse addIncrementComponentsListItem(
        IncreComponentDetail incrementComponentsListItem) {
        if (this.incrementComponentsList == null) {
            this.incrementComponentsList = new ArrayList<>();
        }
        this.incrementComponentsList.add(incrementComponentsListItem);
        return this;
    }

    public ShowIncrementComponentsDetailResponse withIncrementComponentsList(
        Consumer<List<IncreComponentDetail>> incrementComponentsListSetter) {
        if (this.incrementComponentsList == null) {
            this.incrementComponentsList = new ArrayList<>();
        }
        incrementComponentsListSetter.accept(this.incrementComponentsList);
        return this;
    }

    /**
     * 增量组件详情。
     * @return incrementComponentsList
     */
    public List<IncreComponentDetail> getIncrementComponentsList() {
        return incrementComponentsList;
    }

    public void setIncrementComponentsList(List<IncreComponentDetail> incrementComponentsList) {
        this.incrementComponentsList = incrementComponentsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIncrementComponentsDetailResponse that = (ShowIncrementComponentsDetailResponse) obj;
        return Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.incrementComponentsList, that.incrementComponentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime, incrementComponentsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIncrementComponentsDetailResponse {\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    incrementComponentsList: ").append(toIndentedString(incrementComponentsList)).append("\n");
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
