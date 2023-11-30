package com.huaweicloud.sdk.dis.v2.model;

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
public class ShowAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_checkpoint_stream_names")

    private List<String> commitCheckpointStreamNames = null;

    public ShowAppResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * App的名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowAppResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * App的唯一标识符。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowAppResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * App创建的时间，单位毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowAppResponse withCommitCheckpointStreamNames(List<String> commitCheckpointStreamNames) {
        this.commitCheckpointStreamNames = commitCheckpointStreamNames;
        return this;
    }

    public ShowAppResponse addCommitCheckpointStreamNamesItem(String commitCheckpointStreamNamesItem) {
        if (this.commitCheckpointStreamNames == null) {
            this.commitCheckpointStreamNames = new ArrayList<>();
        }
        this.commitCheckpointStreamNames.add(commitCheckpointStreamNamesItem);
        return this;
    }

    public ShowAppResponse withCommitCheckpointStreamNames(Consumer<List<String>> commitCheckpointStreamNamesSetter) {
        if (this.commitCheckpointStreamNames == null) {
            this.commitCheckpointStreamNames = new ArrayList<>();
        }
        commitCheckpointStreamNamesSetter.accept(this.commitCheckpointStreamNames);
        return this;
    }

    /**
     * 关联通道列表。
     * @return commitCheckpointStreamNames
     */
    public List<String> getCommitCheckpointStreamNames() {
        return commitCheckpointStreamNames;
    }

    public void setCommitCheckpointStreamNames(List<String> commitCheckpointStreamNames) {
        this.commitCheckpointStreamNames = commitCheckpointStreamNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppResponse that = (ShowAppResponse) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.commitCheckpointStreamNames, that.commitCheckpointStreamNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, appId, createTime, commitCheckpointStreamNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppResponse {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    commitCheckpointStreamNames: ")
            .append(toIndentedString(commitCheckpointStreamNames))
            .append("\n");
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
