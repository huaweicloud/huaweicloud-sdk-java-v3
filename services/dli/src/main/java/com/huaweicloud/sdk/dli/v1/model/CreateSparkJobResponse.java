package com.huaweicloud.sdk.dli.v1.model;

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
public class CreateSparkJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appId")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private List<String> log = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sc_type")

    private String scType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyUser")

    private String proxyUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    public CreateSparkJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释:   Batch作业的id 示例: 80ceaaff-3cfc-4162-a56f-70031ea4fa91 约束限制:  无 取值范围: 无 默认取值: 无
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSparkJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 参数解释:   Batch作业的状态 示例: starting 约束限制:  无 取值范围: starting：正在启动 running：正在执行任务 dead：session已退出 success：session停止成功 recovering：正在恢复 默认取值: 无
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateSparkJobResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 参数解释:   批处理作业的后台app id 示例: batch-session-ca2a4042-0db9-45ab-bc7f-ae6a56846348:30671 约束限制:  无 取值范围: 无 默认取值: 无
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateSparkJobResponse withLog(List<String> log) {
        this.log = log;
        return this;
    }

    public CreateSparkJobResponse addLogItem(String logItem) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        this.log.add(logItem);
        return this;
    }

    public CreateSparkJobResponse withLog(Consumer<List<String>> logSetter) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        logSetter.accept(this.log);
        return this;
    }

    /**
     * 参数解释:   显示当前Batch作业的最后10条记录 约束限制:  无 取值范围: 无 默认取值: 无
     * @return log
     */
    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

    public CreateSparkJobResponse withScType(String scType) {
        this.scType = scType;
        return this;
    }

    /**
     * 参数解释: 计算资源类型，目前可接受参数A, B, C。如果不指定，则按最小类型创建。 示例: A 约束限制: 无 取值范围: A：物理资源：8核32G内存，driverCores：2；executorCores：1；driverMemory：7G；executorMemory：4G；numExecutor：6 B：16核64G内存,2,2,7G,8G,7 C：32核128G内存,4,2,15G,8G,14 默认取值: 无
     * @return scType
     */
    public String getScType() {
        return scType;
    }

    public void setScType(String scType) {
        this.scType = scType;
    }

    public CreateSparkJobResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 参数解释:   会话所在队列 约束限制:  无 取值范围: 无 默认取值: 无
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateSparkJobResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 参数解释:   Batch的创建时间。是单位为“毫秒”的时间戳 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateSparkJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释:   创建时用户指定的批处理名称，不能超过128个字符 示例: test_spark 约束限制:  不超过128个字符的字符串 取值范围: 无 默认取值: 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSparkJobResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 参数解释:   批处理作业所属用户 示例: ei_dlics_d00352431 约束限制:  无 取值范围: 无 默认取值: 无
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateSparkJobResponse withProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }

    /**
     * 参数解释:  批处理作业所属代理用户（资源租户） 示例: tenant1 约束限制:  无 取值范围: 无 默认取值: 无
     * @return proxyUser
     */
    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public CreateSparkJobResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 参数解释:  批处理作业类型，只支持spark类型参数 示例: spark 约束限制:  无 取值范围: spark 默认取值: 无
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateSparkJobResponse withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 参数解释:  用于指定队列，填写已创建DLI的队列名 示例: gen0218 约束限制:  无 取值范围: 无 默认取值: 无
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public CreateSparkJobResponse withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 参数解释:  自定义镜像。格式为：组织名/镜像名:镜像版本 示例: ceshi/spark_general-x86_64:3.3.1-2.3.7.1720240718867424736954752.tensorflow 约束限制:  无 取值范围: 无 默认取值: 无
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CreateSparkJobResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 参数解释:  批处理作业的更新时间。是单位为“毫秒”的时间戳 示例: 1739867779341 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateSparkJobResponse withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 参数解释:  作业运行时长，单位毫秒 示例: 213038 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSparkJobResponse that = (CreateSparkJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.state, that.state)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.log, that.log)
            && Objects.equals(this.scType, that.scType) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.proxyUser, that.proxyUser)
            && Objects.equals(this.kind, that.kind) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.image, that.image) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.duration, that.duration);
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
            updateTime,
            duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSparkJobResponse {\n");
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
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
