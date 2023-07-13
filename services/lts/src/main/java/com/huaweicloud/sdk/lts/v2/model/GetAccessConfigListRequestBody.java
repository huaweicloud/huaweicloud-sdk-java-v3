package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询日志接入列表请求体
 */
public class GetAccessConfigListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_name_list")

    private List<String> accessConfigNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_name_list")

    private List<String> hostGroupNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name_list")

    private List<String> logGroupNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name_list")

    private List<String> logStreamNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_tag_list")

    private List<AccessConfigTag> accessConfigTagList = null;

    public GetAccessConfigListRequestBody withAccessConfigNameList(List<String> accessConfigNameList) {
        this.accessConfigNameList = accessConfigNameList;
        return this;
    }

    public GetAccessConfigListRequestBody addAccessConfigNameListItem(String accessConfigNameListItem) {
        if (this.accessConfigNameList == null) {
            this.accessConfigNameList = new ArrayList<>();
        }
        this.accessConfigNameList.add(accessConfigNameListItem);
        return this;
    }

    public GetAccessConfigListRequestBody withAccessConfigNameList(Consumer<List<String>> accessConfigNameListSetter) {
        if (this.accessConfigNameList == null) {
            this.accessConfigNameList = new ArrayList<>();
        }
        accessConfigNameListSetter.accept(this.accessConfigNameList);
        return this;
    }

    /**
     * 接入配置名称列表
     * @return accessConfigNameList
     */
    public List<String> getAccessConfigNameList() {
        return accessConfigNameList;
    }

    public void setAccessConfigNameList(List<String> accessConfigNameList) {
        this.accessConfigNameList = accessConfigNameList;
    }

    public GetAccessConfigListRequestBody withHostGroupNameList(List<String> hostGroupNameList) {
        this.hostGroupNameList = hostGroupNameList;
        return this;
    }

    public GetAccessConfigListRequestBody addHostGroupNameListItem(String hostGroupNameListItem) {
        if (this.hostGroupNameList == null) {
            this.hostGroupNameList = new ArrayList<>();
        }
        this.hostGroupNameList.add(hostGroupNameListItem);
        return this;
    }

    public GetAccessConfigListRequestBody withHostGroupNameList(Consumer<List<String>> hostGroupNameListSetter) {
        if (this.hostGroupNameList == null) {
            this.hostGroupNameList = new ArrayList<>();
        }
        hostGroupNameListSetter.accept(this.hostGroupNameList);
        return this;
    }

    /**
     * 主机组名称列表
     * @return hostGroupNameList
     */
    public List<String> getHostGroupNameList() {
        return hostGroupNameList;
    }

    public void setHostGroupNameList(List<String> hostGroupNameList) {
        this.hostGroupNameList = hostGroupNameList;
    }

    public GetAccessConfigListRequestBody withLogGroupNameList(List<String> logGroupNameList) {
        this.logGroupNameList = logGroupNameList;
        return this;
    }

    public GetAccessConfigListRequestBody addLogGroupNameListItem(String logGroupNameListItem) {
        if (this.logGroupNameList == null) {
            this.logGroupNameList = new ArrayList<>();
        }
        this.logGroupNameList.add(logGroupNameListItem);
        return this;
    }

    public GetAccessConfigListRequestBody withLogGroupNameList(Consumer<List<String>> logGroupNameListSetter) {
        if (this.logGroupNameList == null) {
            this.logGroupNameList = new ArrayList<>();
        }
        logGroupNameListSetter.accept(this.logGroupNameList);
        return this;
    }

    /**
     * 日志组名称列表
     * @return logGroupNameList
     */
    public List<String> getLogGroupNameList() {
        return logGroupNameList;
    }

    public void setLogGroupNameList(List<String> logGroupNameList) {
        this.logGroupNameList = logGroupNameList;
    }

    public GetAccessConfigListRequestBody withLogStreamNameList(List<String> logStreamNameList) {
        this.logStreamNameList = logStreamNameList;
        return this;
    }

    public GetAccessConfigListRequestBody addLogStreamNameListItem(String logStreamNameListItem) {
        if (this.logStreamNameList == null) {
            this.logStreamNameList = new ArrayList<>();
        }
        this.logStreamNameList.add(logStreamNameListItem);
        return this;
    }

    public GetAccessConfigListRequestBody withLogStreamNameList(Consumer<List<String>> logStreamNameListSetter) {
        if (this.logStreamNameList == null) {
            this.logStreamNameList = new ArrayList<>();
        }
        logStreamNameListSetter.accept(this.logStreamNameList);
        return this;
    }

    /**
     * 日志流名称列表
     * @return logStreamNameList
     */
    public List<String> getLogStreamNameList() {
        return logStreamNameList;
    }

    public void setLogStreamNameList(List<String> logStreamNameList) {
        this.logStreamNameList = logStreamNameList;
    }

    public GetAccessConfigListRequestBody withAccessConfigTagList(List<AccessConfigTag> accessConfigTagList) {
        this.accessConfigTagList = accessConfigTagList;
        return this;
    }

    public GetAccessConfigListRequestBody addAccessConfigTagListItem(AccessConfigTag accessConfigTagListItem) {
        if (this.accessConfigTagList == null) {
            this.accessConfigTagList = new ArrayList<>();
        }
        this.accessConfigTagList.add(accessConfigTagListItem);
        return this;
    }

    public GetAccessConfigListRequestBody withAccessConfigTagList(
        Consumer<List<AccessConfigTag>> accessConfigTagListSetter) {
        if (this.accessConfigTagList == null) {
            this.accessConfigTagList = new ArrayList<>();
        }
        accessConfigTagListSetter.accept(this.accessConfigTagList);
        return this;
    }

    /**
     * 接入配置标签，KEY不能重复,最多20个标签
     * @return accessConfigTagList
     */
    public List<AccessConfigTag> getAccessConfigTagList() {
        return accessConfigTagList;
    }

    public void setAccessConfigTagList(List<AccessConfigTag> accessConfigTagList) {
        this.accessConfigTagList = accessConfigTagList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAccessConfigListRequestBody that = (GetAccessConfigListRequestBody) obj;
        return Objects.equals(this.accessConfigNameList, that.accessConfigNameList)
            && Objects.equals(this.hostGroupNameList, that.hostGroupNameList)
            && Objects.equals(this.logGroupNameList, that.logGroupNameList)
            && Objects.equals(this.logStreamNameList, that.logStreamNameList)
            && Objects.equals(this.accessConfigTagList, that.accessConfigTagList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accessConfigNameList, hostGroupNameList, logGroupNameList, logStreamNameList, accessConfigTagList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccessConfigListRequestBody {\n");
        sb.append("    accessConfigNameList: ").append(toIndentedString(accessConfigNameList)).append("\n");
        sb.append("    hostGroupNameList: ").append(toIndentedString(hostGroupNameList)).append("\n");
        sb.append("    logGroupNameList: ").append(toIndentedString(logGroupNameList)).append("\n");
        sb.append("    logStreamNameList: ").append(toIndentedString(logStreamNameList)).append("\n");
        sb.append("    accessConfigTagList: ").append(toIndentedString(accessConfigTagList)).append("\n");
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
