package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkflowInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_urn")

    private String workflowUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    /**
     * 流程实例执行状态  最小长度：1  最大长度：32  枚举值：  success  fail  running  timeout  cancel
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("timeout");

        /**
         * Enum CANCEL for value: "cancel"
         */
        public static final StatusEnum CANCEL = new StatusEnum("cancel");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("running", RUNNING);
            map.put("timeout", TIMEOUT);
            map.put("cancel", CANCEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Object input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private Object output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_execution_details")

    private List<NodeExecution> nodeExecutionDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public ShowWorkflowInstanceResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 流程定义ID  最小长度：1  最大长度：64
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public ShowWorkflowInstanceResponse withWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
        return this;
    }

    /**
     * 函数工作流URN, 格式为： urn:fss:<region_id>:<project_id>:workflow:<package>:<workflow_name>:<version> 注意： package当前只支持default version当前只支持latest
     * @return workflowUrn
     */
    public String getWorkflowUrn() {
        return workflowUrn;
    }

    public void setWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
    }

    public ShowWorkflowInstanceResponse withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 流程执行实例ID  最小长度：1  最大长度：64
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public ShowWorkflowInstanceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 流程实例执行状态  最小长度：1  最大长度：32  枚举值：  success  fail  running  timeout  cancel
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowWorkflowInstanceResponse withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * 函数执行时需要的Header。
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public ShowWorkflowInstanceResponse withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * 函数执行时的入参
     * @return input
     */
    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }

    public ShowWorkflowInstanceResponse withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * 函数执行结果
     * @return output
     */
    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    public ShowWorkflowInstanceResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 流程实例创建时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间  最小长度：0  最大长度：64
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowWorkflowInstanceResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 流程实例结束时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间  最小长度：0  最大长度：64
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowWorkflowInstanceResponse withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 流程实例上次更新时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间  最小长度：0  最大长度：64
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ShowWorkflowInstanceResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 流程实例创建者  最小长度：1  最大长度：32
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ShowWorkflowInstanceResponse withNodeExecutionDetails(List<NodeExecution> nodeExecutionDetails) {
        this.nodeExecutionDetails = nodeExecutionDetails;
        return this;
    }

    public ShowWorkflowInstanceResponse addNodeExecutionDetailsItem(NodeExecution nodeExecutionDetailsItem) {
        if (this.nodeExecutionDetails == null) {
            this.nodeExecutionDetails = new ArrayList<>();
        }
        this.nodeExecutionDetails.add(nodeExecutionDetailsItem);
        return this;
    }

    public ShowWorkflowInstanceResponse withNodeExecutionDetails(
        Consumer<List<NodeExecution>> nodeExecutionDetailsSetter) {
        if (this.nodeExecutionDetails == null) {
            this.nodeExecutionDetails = new ArrayList<>();
        }
        nodeExecutionDetailsSetter.accept(this.nodeExecutionDetails);
        return this;
    }

    /**
     * 节点执行信息
     * @return nodeExecutionDetails
     */
    public List<NodeExecution> getNodeExecutionDetails() {
        return nodeExecutionDetails;
    }

    public void setNodeExecutionDetails(List<NodeExecution> nodeExecutionDetails) {
        this.nodeExecutionDetails = nodeExecutionDetails;
    }

    public ShowWorkflowInstanceResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ShowWorkflowInstanceResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public ShowWorkflowInstanceResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public ShowWorkflowInstanceResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWorkflowInstanceResponse showWorkflowInstanceResponse = (ShowWorkflowInstanceResponse) o;
        return Objects.equals(this.workflowId, showWorkflowInstanceResponse.workflowId)
            && Objects.equals(this.workflowUrn, showWorkflowInstanceResponse.workflowUrn)
            && Objects.equals(this.executionId, showWorkflowInstanceResponse.executionId)
            && Objects.equals(this.status, showWorkflowInstanceResponse.status)
            && Objects.equals(this.headers, showWorkflowInstanceResponse.headers)
            && Objects.equals(this.input, showWorkflowInstanceResponse.input)
            && Objects.equals(this.output, showWorkflowInstanceResponse.output)
            && Objects.equals(this.beginTime, showWorkflowInstanceResponse.beginTime)
            && Objects.equals(this.endTime, showWorkflowInstanceResponse.endTime)
            && Objects.equals(this.lastUpdateTime, showWorkflowInstanceResponse.lastUpdateTime)
            && Objects.equals(this.createdBy, showWorkflowInstanceResponse.createdBy)
            && Objects.equals(this.nodeExecutionDetails, showWorkflowInstanceResponse.nodeExecutionDetails)
            && Objects.equals(this.xRequestId, showWorkflowInstanceResponse.xRequestId)
            && Objects.equals(this.connection, showWorkflowInstanceResponse.connection)
            && Objects.equals(this.contentLength, showWorkflowInstanceResponse.contentLength)
            && Objects.equals(this.date, showWorkflowInstanceResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId,
            workflowUrn,
            executionId,
            status,
            headers,
            input,
            output,
            beginTime,
            endTime,
            lastUpdateTime,
            createdBy,
            nodeExecutionDetails,
            xRequestId,
            connection,
            contentLength,
            date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowInstanceResponse {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    workflowUrn: ").append(toIndentedString(workflowUrn)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    nodeExecutionDetails: ").append(toIndentedString(nodeExecutionDetails)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
