package com.huaweicloud.sdk.das.v3.model;

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
public class ListInstanceProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_time")

    private Long dataSyncTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<Object> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info_list")

    private List<String> userInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_info_list")

    private List<String> dbInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info_list")

    private List<String> hostInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_info_list")

    private List<String> stateInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_info_list")

    private List<String> commandInfoList = null;

    public ListInstanceProcessesResponse withDataSyncTime(Long dataSyncTime) {
        this.dataSyncTime = dataSyncTime;
        return this;
    }

    /**
     * 同步时间
     * @return dataSyncTime
     */
    public Long getDataSyncTime() {
        return dataSyncTime;
    }

    public void setDataSyncTime(Long dataSyncTime) {
        this.dataSyncTime = dataSyncTime;
    }

    public ListInstanceProcessesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListInstanceProcessesResponse withData(List<Object> data) {
        this.data = data;
        return this;
    }

    public ListInstanceProcessesResponse addDataItem(Object dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListInstanceProcessesResponse withData(Consumer<List<Object>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 数据列表
     * @return data
     */
    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public ListInstanceProcessesResponse withUserInfoList(List<String> userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }

    public ListInstanceProcessesResponse addUserInfoListItem(String userInfoListItem) {
        if (this.userInfoList == null) {
            this.userInfoList = new ArrayList<>();
        }
        this.userInfoList.add(userInfoListItem);
        return this;
    }

    public ListInstanceProcessesResponse withUserInfoList(Consumer<List<String>> userInfoListSetter) {
        if (this.userInfoList == null) {
            this.userInfoList = new ArrayList<>();
        }
        userInfoListSetter.accept(this.userInfoList);
        return this;
    }

    /**
     * 用户列表
     * @return userInfoList
     */
    public List<String> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<String> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public ListInstanceProcessesResponse withDbInfoList(List<String> dbInfoList) {
        this.dbInfoList = dbInfoList;
        return this;
    }

    public ListInstanceProcessesResponse addDbInfoListItem(String dbInfoListItem) {
        if (this.dbInfoList == null) {
            this.dbInfoList = new ArrayList<>();
        }
        this.dbInfoList.add(dbInfoListItem);
        return this;
    }

    public ListInstanceProcessesResponse withDbInfoList(Consumer<List<String>> dbInfoListSetter) {
        if (this.dbInfoList == null) {
            this.dbInfoList = new ArrayList<>();
        }
        dbInfoListSetter.accept(this.dbInfoList);
        return this;
    }

    /**
     * 数据库列表
     * @return dbInfoList
     */
    public List<String> getDbInfoList() {
        return dbInfoList;
    }

    public void setDbInfoList(List<String> dbInfoList) {
        this.dbInfoList = dbInfoList;
    }

    public ListInstanceProcessesResponse withHostInfoList(List<String> hostInfoList) {
        this.hostInfoList = hostInfoList;
        return this;
    }

    public ListInstanceProcessesResponse addHostInfoListItem(String hostInfoListItem) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        this.hostInfoList.add(hostInfoListItem);
        return this;
    }

    public ListInstanceProcessesResponse withHostInfoList(Consumer<List<String>> hostInfoListSetter) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        hostInfoListSetter.accept(this.hostInfoList);
        return this;
    }

    /**
     * 来源IP列表
     * @return hostInfoList
     */
    public List<String> getHostInfoList() {
        return hostInfoList;
    }

    public void setHostInfoList(List<String> hostInfoList) {
        this.hostInfoList = hostInfoList;
    }

    public ListInstanceProcessesResponse withStateInfoList(List<String> stateInfoList) {
        this.stateInfoList = stateInfoList;
        return this;
    }

    public ListInstanceProcessesResponse addStateInfoListItem(String stateInfoListItem) {
        if (this.stateInfoList == null) {
            this.stateInfoList = new ArrayList<>();
        }
        this.stateInfoList.add(stateInfoListItem);
        return this;
    }

    public ListInstanceProcessesResponse withStateInfoList(Consumer<List<String>> stateInfoListSetter) {
        if (this.stateInfoList == null) {
            this.stateInfoList = new ArrayList<>();
        }
        stateInfoListSetter.accept(this.stateInfoList);
        return this;
    }

    /**
     * 状态列表
     * @return stateInfoList
     */
    public List<String> getStateInfoList() {
        return stateInfoList;
    }

    public void setStateInfoList(List<String> stateInfoList) {
        this.stateInfoList = stateInfoList;
    }

    public ListInstanceProcessesResponse withCommandInfoList(List<String> commandInfoList) {
        this.commandInfoList = commandInfoList;
        return this;
    }

    public ListInstanceProcessesResponse addCommandInfoListItem(String commandInfoListItem) {
        if (this.commandInfoList == null) {
            this.commandInfoList = new ArrayList<>();
        }
        this.commandInfoList.add(commandInfoListItem);
        return this;
    }

    public ListInstanceProcessesResponse withCommandInfoList(Consumer<List<String>> commandInfoListSetter) {
        if (this.commandInfoList == null) {
            this.commandInfoList = new ArrayList<>();
        }
        commandInfoListSetter.accept(this.commandInfoList);
        return this;
    }

    /**
     * 命令列表
     * @return commandInfoList
     */
    public List<String> getCommandInfoList() {
        return commandInfoList;
    }

    public void setCommandInfoList(List<String> commandInfoList) {
        this.commandInfoList = commandInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceProcessesResponse that = (ListInstanceProcessesResponse) obj;
        return Objects.equals(this.dataSyncTime, that.dataSyncTime) && Objects.equals(this.total, that.total)
            && Objects.equals(this.data, that.data) && Objects.equals(this.userInfoList, that.userInfoList)
            && Objects.equals(this.dbInfoList, that.dbInfoList) && Objects.equals(this.hostInfoList, that.hostInfoList)
            && Objects.equals(this.stateInfoList, that.stateInfoList)
            && Objects.equals(this.commandInfoList, that.commandInfoList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dataSyncTime, total, data, userInfoList, dbInfoList, hostInfoList, stateInfoList, commandInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceProcessesResponse {\n");
        sb.append("    dataSyncTime: ").append(toIndentedString(dataSyncTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    userInfoList: ").append(toIndentedString(userInfoList)).append("\n");
        sb.append("    dbInfoList: ").append(toIndentedString(dbInfoList)).append("\n");
        sb.append("    hostInfoList: ").append(toIndentedString(hostInfoList)).append("\n");
        sb.append("    stateInfoList: ").append(toIndentedString(stateInfoList)).append("\n");
        sb.append("    commandInfoList: ").append(toIndentedString(commandInfoList)).append("\n");
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
