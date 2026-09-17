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
public class ShowSlowLogTopInfoNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_user_list")

    private List<SlowLogTopInfo> topUserList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_ip_list")

    private List<SlowLogTopInfo> topIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_db_list")

    private List<SlowLogTopInfo> topDbList = null;

    public ShowSlowLogTopInfoNewResponse withTopUserList(List<SlowLogTopInfo> topUserList) {
        this.topUserList = topUserList;
        return this;
    }

    public ShowSlowLogTopInfoNewResponse addTopUserListItem(SlowLogTopInfo topUserListItem) {
        if (this.topUserList == null) {
            this.topUserList = new ArrayList<>();
        }
        this.topUserList.add(topUserListItem);
        return this;
    }

    public ShowSlowLogTopInfoNewResponse withTopUserList(Consumer<List<SlowLogTopInfo>> topUserListSetter) {
        if (this.topUserList == null) {
            this.topUserList = new ArrayList<>();
        }
        topUserListSetter.accept(this.topUserList);
        return this;
    }

    /**
     * Top用户列表
     * @return topUserList
     */
    public List<SlowLogTopInfo> getTopUserList() {
        return topUserList;
    }

    public void setTopUserList(List<SlowLogTopInfo> topUserList) {
        this.topUserList = topUserList;
    }

    public ShowSlowLogTopInfoNewResponse withTopIpList(List<SlowLogTopInfo> topIpList) {
        this.topIpList = topIpList;
        return this;
    }

    public ShowSlowLogTopInfoNewResponse addTopIpListItem(SlowLogTopInfo topIpListItem) {
        if (this.topIpList == null) {
            this.topIpList = new ArrayList<>();
        }
        this.topIpList.add(topIpListItem);
        return this;
    }

    public ShowSlowLogTopInfoNewResponse withTopIpList(Consumer<List<SlowLogTopInfo>> topIpListSetter) {
        if (this.topIpList == null) {
            this.topIpList = new ArrayList<>();
        }
        topIpListSetter.accept(this.topIpList);
        return this;
    }

    /**
     * Top IP列表
     * @return topIpList
     */
    public List<SlowLogTopInfo> getTopIpList() {
        return topIpList;
    }

    public void setTopIpList(List<SlowLogTopInfo> topIpList) {
        this.topIpList = topIpList;
    }

    public ShowSlowLogTopInfoNewResponse withTopDbList(List<SlowLogTopInfo> topDbList) {
        this.topDbList = topDbList;
        return this;
    }

    public ShowSlowLogTopInfoNewResponse addTopDbListItem(SlowLogTopInfo topDbListItem) {
        if (this.topDbList == null) {
            this.topDbList = new ArrayList<>();
        }
        this.topDbList.add(topDbListItem);
        return this;
    }

    public ShowSlowLogTopInfoNewResponse withTopDbList(Consumer<List<SlowLogTopInfo>> topDbListSetter) {
        if (this.topDbList == null) {
            this.topDbList = new ArrayList<>();
        }
        topDbListSetter.accept(this.topDbList);
        return this;
    }

    /**
     * Top数据库列表
     * @return topDbList
     */
    public List<SlowLogTopInfo> getTopDbList() {
        return topDbList;
    }

    public void setTopDbList(List<SlowLogTopInfo> topDbList) {
        this.topDbList = topDbList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogTopInfoNewResponse that = (ShowSlowLogTopInfoNewResponse) obj;
        return Objects.equals(this.topUserList, that.topUserList) && Objects.equals(this.topIpList, that.topIpList)
            && Objects.equals(this.topDbList, that.topDbList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topUserList, topIpList, topDbList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogTopInfoNewResponse {\n");
        sb.append("    topUserList: ").append(toIndentedString(topUserList)).append("\n");
        sb.append("    topIpList: ").append(toIndentedString(topIpList)).append("\n");
        sb.append("    topDbList: ").append(toIndentedString(topDbList)).append("\n");
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
