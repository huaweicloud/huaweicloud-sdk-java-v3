package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBatchJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appId")

    @JacksonXmlProperty(localName = "appId")

    private List<String> appId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    @JacksonXmlProperty(localName = "log")

    private List<String> log = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type")

    @JacksonXmlProperty(localName = "sc_type")

    private String scType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    @JacksonXmlProperty(localName = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyUser")

    @JacksonXmlProperty(localName = "proxyUser")

    private String proxyUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    @JacksonXmlProperty(localName = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    @JacksonXmlProperty(localName = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    @JacksonXmlProperty(localName = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    public CreateBatchJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Batch作业的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateBatchJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Batch作业的状态。包括： starting：正在启动；running：正在执行任务；dead：session已退出；success：session停止成功；recovering：正在恢复。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateBatchJobResponse withAppId(List<String> appId) {
        this.appId = appId;
        return this;
    }

    public CreateBatchJobResponse addAppIdItem(String appIdItem) {
        if (this.appId == null) {
            this.appId = new ArrayList<>();
        }
        this.appId.add(appIdItem);
        return this;
    }

    public CreateBatchJobResponse withAppId(Consumer<List<String>> appIdSetter) {
        if (this.appId == null) {
            this.appId = new ArrayList<>();
        }
        appIdSetter.accept(this.appId);
        return this;
    }

    /**
     * Batch作业的后台app id。
     * @return appId
     */
    public List<String> getAppId() {
        return appId;
    }

    public void setAppId(List<String> appId) {
        this.appId = appId;
    }

    public CreateBatchJobResponse withLog(List<String> log) {
        this.log = log;
        return this;
    }

    public CreateBatchJobResponse addLogItem(String logItem) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        this.log.add(logItem);
        return this;
    }

    public CreateBatchJobResponse withLog(Consumer<List<String>> logSetter) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        logSetter.accept(this.log);
        return this;
    }

    /**
     * 显示当前Batch作业的最后10条记录。
     * @return log
     */
    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

    public CreateBatchJobResponse withScType(String scType) {
        this.scType = scType;
        return this;
    }

    /**
     * 计算资源类型。用户自定义时返回CUSTOMIZED。
     * @return scType
     */
    public String getScType() {
        return scType;
    }

    public void setScType(String scType) {
        this.scType = scType;
    }

    public CreateBatchJobResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 会话所在队列。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateBatchJobResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Batch的创建时间。是单位为“毫秒”的时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateBatchJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建时用户指定的批处理名称，不能超过128个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBatchJobResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 批处理作业所属用户
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateBatchJobResponse withProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }

    /**
     * 批处理作业所属代理用户（资源租户）。
     * @return proxyUser
     */
    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public CreateBatchJobResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 批处理作业类型，只支持spark类型参数。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateBatchJobResponse withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 用于指定队列，填写已创建DLI的队列名
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public CreateBatchJobResponse withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 自定义镜像。格式为：组织名/镜像名:镜像版本。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CreateBatchJobResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBatchJobResponse createBatchJobResponse = (CreateBatchJobResponse) o;
        return Objects.equals(this.id, createBatchJobResponse.id)
            && Objects.equals(this.state, createBatchJobResponse.state)
            && Objects.equals(this.appId, createBatchJobResponse.appId)
            && Objects.equals(this.log, createBatchJobResponse.log)
            && Objects.equals(this.scType, createBatchJobResponse.scType)
            && Objects.equals(this.clusterName, createBatchJobResponse.clusterName)
            && Objects.equals(this.createTime, createBatchJobResponse.createTime)
            && Objects.equals(this.name, createBatchJobResponse.name)
            && Objects.equals(this.owner, createBatchJobResponse.owner)
            && Objects.equals(this.proxyUser, createBatchJobResponse.proxyUser)
            && Objects.equals(this.kind, createBatchJobResponse.kind)
            && Objects.equals(this.queue, createBatchJobResponse.queue)
            && Objects.equals(this.image, createBatchJobResponse.image)
            && Objects.equals(this.updateTime, createBatchJobResponse.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            state,
            appId,
            log,
            scType,
            clusterName,
            createTime,
            name,
            owner,
            proxyUser,
            kind,
            queue,
            image,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    scType: ").append(toIndentedString(scType)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
