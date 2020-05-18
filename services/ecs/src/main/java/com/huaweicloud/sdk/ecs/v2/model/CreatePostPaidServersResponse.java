package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CreatePostPaidServersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serverIds")
    
    private List<String> serverIds = null;
    
    public CreatePostPaidServersResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 提交任务成功后返回的任务ID，用户可以使用该ID对任务执行情况进行查询。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreatePostPaidServersResponse withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    
    public CreatePostPaidServersResponse addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public CreatePostPaidServersResponse withServerIds(Consumer<List<String>> serverIdsSetter) {
        if(this.serverIds == null ){
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云服务器ID列表。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePostPaidServersResponse createPostPaidServersResponse = (CreatePostPaidServersResponse) o;
        return Objects.equals(this.jobId, createPostPaidServersResponse.jobId) &&
            Objects.equals(this.serverIds, createPostPaidServersResponse.serverIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, serverIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidServersResponse {\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
            sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
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

