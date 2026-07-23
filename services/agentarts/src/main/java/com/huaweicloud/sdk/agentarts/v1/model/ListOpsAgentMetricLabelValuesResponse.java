package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsAgentMetricLabelValuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<String> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_extend_list")

    private List<ComponentExtendInfo> dataExtendList = null;

    public ListOpsAgentMetricLabelValuesResponse withDataList(List<String> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListOpsAgentMetricLabelValuesResponse addDataListItem(String dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListOpsAgentMetricLabelValuesResponse withDataList(Consumer<List<String>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**：  组件列表。  **取值范围**： 不涉及。 
     * @return dataList
     */
    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }

    public ListOpsAgentMetricLabelValuesResponse withDataExtendList(List<ComponentExtendInfo> dataExtendList) {
        this.dataExtendList = dataExtendList;
        return this;
    }

    public ListOpsAgentMetricLabelValuesResponse addDataExtendListItem(ComponentExtendInfo dataExtendListItem) {
        if (this.dataExtendList == null) {
            this.dataExtendList = new ArrayList<>();
        }
        this.dataExtendList.add(dataExtendListItem);
        return this;
    }

    public ListOpsAgentMetricLabelValuesResponse withDataExtendList(
        Consumer<List<ComponentExtendInfo>> dataExtendListSetter) {
        if (this.dataExtendList == null) {
            this.dataExtendList = new ArrayList<>();
        }
        dataExtendListSetter.accept(this.dataExtendList);
        return this;
    }

    /**
     * **参数解释**：  组件扩展属性列表，返回组件的ID和名称等扩展信息。  **取值范围**： 不涉及。 
     * @return dataExtendList
     */
    public List<ComponentExtendInfo> getDataExtendList() {
        return dataExtendList;
    }

    public void setDataExtendList(List<ComponentExtendInfo> dataExtendList) {
        this.dataExtendList = dataExtendList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentMetricLabelValuesResponse that = (ListOpsAgentMetricLabelValuesResponse) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.dataExtendList, that.dataExtendList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, dataExtendList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentMetricLabelValuesResponse {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    dataExtendList: ").append(toIndentedString(dataExtendList)).append("\n");
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
