package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListPortStatusRequestInfo
 */
public class ListPortStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<PortStatusRequestInfo> dataList = null;

    public ListPortStatusRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * **参数解释**: 端口状态，是否忽略 **约束限制**: 不涉及 **取值范围**: - ignore：忽略 - not_ignore：取消忽略  **默认取值**: 不涉及 
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ListPortStatusRequestInfo withDataList(List<PortStatusRequestInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListPortStatusRequestInfo addDataListItem(PortStatusRequestInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListPortStatusRequestInfo withDataList(Consumer<List<PortStatusRequestInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 主机相关信息列表 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值200 **默认取值**: 不涉及 
     * @return dataList
     */
    public List<PortStatusRequestInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<PortStatusRequestInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPortStatusRequestInfo that = (ListPortStatusRequestInfo) obj;
        return Objects.equals(this.operateType, that.operateType) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortStatusRequestInfo {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
