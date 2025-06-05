package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 系统用户白名单
 */
public class UpdateSystemUserWhiteListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_user_name_list")

    private List<String> systemUserNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    public UpdateSystemUserWhiteListRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdateSystemUserWhiteListRequestInfo withSystemUserNameList(List<String> systemUserNameList) {
        this.systemUserNameList = systemUserNameList;
        return this;
    }

    public UpdateSystemUserWhiteListRequestInfo addSystemUserNameListItem(String systemUserNameListItem) {
        if (this.systemUserNameList == null) {
            this.systemUserNameList = new ArrayList<>();
        }
        this.systemUserNameList.add(systemUserNameListItem);
        return this;
    }

    public UpdateSystemUserWhiteListRequestInfo withSystemUserNameList(
        Consumer<List<String>> systemUserNameListSetter) {
        if (this.systemUserNameList == null) {
            this.systemUserNameList = new ArrayList<>();
        }
        systemUserNameListSetter.accept(this.systemUserNameList);
        return this;
    }

    /**
     * 系统用户名列表
     * @return systemUserNameList
     */
    public List<String> getSystemUserNameList() {
        return systemUserNameList;
    }

    public void setSystemUserNameList(List<String> systemUserNameList) {
        this.systemUserNameList = systemUserNameList;
    }

    public UpdateSystemUserWhiteListRequestInfo withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSystemUserWhiteListRequestInfo that = (UpdateSystemUserWhiteListRequestInfo) obj;
        return Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.systemUserNameList, that.systemUserNameList)
            && Objects.equals(this.remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, systemUserNameList, remarks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSystemUserWhiteListRequestInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    systemUserNameList: ").append(toIndentedString(systemUserNameList)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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
