package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListDesktopsConnectStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_names")

    private List<String> userNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_status")

    private String connectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListDesktopsConnectStatusRequest withUserNames(List<String> userNames) {
        this.userNames = userNames;
        return this;
    }

    public ListDesktopsConnectStatusRequest addUserNamesItem(String userNamesItem) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        this.userNames.add(userNamesItem);
        return this;
    }

    public ListDesktopsConnectStatusRequest withUserNames(Consumer<List<String>> userNamesSetter) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        userNamesSetter.accept(this.userNames);
        return this;
    }

    /**
     * 桌面所属用户，批量筛选，最多不超过100个用户。
     * @return userNames
     */
    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public ListDesktopsConnectStatusRequest withConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
        return this;
    }

    /**
     * 桌面的连接状态。  - UNREGISTER：表示桌面未注册时的状态（桌面启动后，会自动注册）。关机后也会出现未注册的状态。 - REGISTERED：表示桌面注册以后，等待用户连接的状态。 - CONNECTED：表示用户已经成功连接，正在使用桌面。 - DISCONNECTED：表示桌面与客户端断开会话后显示的状态，可能为关闭客户端窗口，或客户端与桌面网络断开引起。
     * @return connectStatus
     */
    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
    }

    public ListDesktopsConnectStatusRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 从查询结果中的第几条数据开始返回,用于分页查询，取值范围0-2000，默认从0开始。
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDesktopsConnectStatusRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询结果中想要返回的信息条目数量,用于分页查询，取值范围0-2000，默认值100。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsConnectStatusRequest that = (ListDesktopsConnectStatusRequest) obj;
        return Objects.equals(this.userNames, that.userNames) && Objects.equals(this.connectStatus, that.connectStatus)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNames, connectStatus, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsConnectStatusRequest {\n");
        sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
        sb.append("    connectStatus: ").append(toIndentedString(connectStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
