package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除系统用户白名单列表,如果delete_all为true时，data_list可不填
 */
public class RemoveSystemUserWhiteListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<SystemUserWhiteListRequestInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_all")

    private Boolean deleteAll;

    public RemoveSystemUserWhiteListRequestInfo withDataList(List<SystemUserWhiteListRequestInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public RemoveSystemUserWhiteListRequestInfo addDataListItem(SystemUserWhiteListRequestInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public RemoveSystemUserWhiteListRequestInfo withDataList(
        Consumer<List<SystemUserWhiteListRequestInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 删除系统用户白名单详情
     * @return dataList
     */
    public List<SystemUserWhiteListRequestInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<SystemUserWhiteListRequestInfo> dataList) {
        this.dataList = dataList;
    }

    public RemoveSystemUserWhiteListRequestInfo withDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }

    /**
     * 是否删除所有白名单内容
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return deleteAll;
    }

    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveSystemUserWhiteListRequestInfo that = (RemoveSystemUserWhiteListRequestInfo) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.deleteAll, that.deleteAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, deleteAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveSystemUserWhiteListRequestInfo {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    deleteAll: ").append(toIndentedString(deleteAll)).append("\n");
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
