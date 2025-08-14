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
public class SystemUserWhiteListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_user_name_list")

    private List<String> systemUserNameList = null;

    public SystemUserWhiteListRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public SystemUserWhiteListRequestInfo withSystemUserNameList(List<String> systemUserNameList) {
        this.systemUserNameList = systemUserNameList;
        return this;
    }

    public SystemUserWhiteListRequestInfo addSystemUserNameListItem(String systemUserNameListItem) {
        if (this.systemUserNameList == null) {
            this.systemUserNameList = new ArrayList<>();
        }
        this.systemUserNameList.add(systemUserNameListItem);
        return this;
    }

    public SystemUserWhiteListRequestInfo withSystemUserNameList(Consumer<List<String>> systemUserNameListSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemUserWhiteListRequestInfo that = (SystemUserWhiteListRequestInfo) obj;
        return Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.systemUserNameList, that.systemUserNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, systemUserNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemUserWhiteListRequestInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    systemUserNameList: ").append(toIndentedString(systemUserNameList)).append("\n");
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
