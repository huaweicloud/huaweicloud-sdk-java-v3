package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞操作列表
 */
public class ChangeVulStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<VulOperateInfo> dataList = null;

    public ChangeVulStatusRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型 - ignore : 忽略 - not_ignore : 取消忽略 - immediate_repair : 修复 - verify : 验证
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ChangeVulStatusRequestInfo withDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ChangeVulStatusRequestInfo addDataListItem(VulOperateInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ChangeVulStatusRequestInfo withDataList(Consumer<List<VulOperateInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 漏洞列表
     * @return dataList
     */
    public List<VulOperateInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeVulStatusRequestInfo changeVulStatusRequestInfo = (ChangeVulStatusRequestInfo) o;
        return Objects.equals(this.operateType, changeVulStatusRequestInfo.operateType)
            && Objects.equals(this.dataList, changeVulStatusRequestInfo.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeVulStatusRequestInfo {\n");
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
