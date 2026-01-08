package com.huaweicloud.sdk.elb.v3.model;

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
public class CloneListenerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_list")

    private List<CloneListenerResp> listenerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public CloneListenerResponse withListenerList(List<CloneListenerResp> listenerList) {
        this.listenerList = listenerList;
        return this;
    }

    public CloneListenerResponse addListenerListItem(CloneListenerResp listenerListItem) {
        if (this.listenerList == null) {
            this.listenerList = new ArrayList<>();
        }
        this.listenerList.add(listenerListItem);
        return this;
    }

    public CloneListenerResponse withListenerList(Consumer<List<CloneListenerResp>> listenerListSetter) {
        if (this.listenerList == null) {
            this.listenerList = new ArrayList<>();
        }
        listenerListSetter.accept(this.listenerList);
        return this;
    }

    /**
     * **参数解释**：新监听器相关信息。
     * @return listenerList
     */
    public List<CloneListenerResp> getListenerList() {
        return listenerList;
    }

    public void setListenerList(List<CloneListenerResp> listenerList) {
        this.listenerList = listenerList;
    }

    public CloneListenerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求的ID 。 **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CloneListenerResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：监听器复制任务的ID，任务详情可通过GET /v3/{project_id}/elb/jobs/{job_id}进行查询。 **取值范围**：标准的UUID格式，长度为36个字符。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneListenerResponse that = (CloneListenerResponse) obj;
        return Objects.equals(this.listenerList, that.listenerList) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerList, requestId, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneListenerResponse {\n");
        sb.append("    listenerList: ").append(toIndentedString(listenerList)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
