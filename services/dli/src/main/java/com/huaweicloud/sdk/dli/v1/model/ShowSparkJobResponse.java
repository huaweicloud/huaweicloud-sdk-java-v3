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
public class ShowSparkJobResponse extends SdkResponse {

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
    @JsonProperty(value = "req_body")

    private String reqBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_version")

    private String sparkVersion;

    public ShowSparkJobResponse withId(String id) {
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

    public ShowSparkJobResponse withState(String state) {
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

    public ShowSparkJobResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 批处理作业的后台app id。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowSparkJobResponse withLog(List<String> log) {
        this.log = log;
        return this;
    }

    public ShowSparkJobResponse addLogItem(String logItem) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        this.log.add(logItem);
        return this;
    }

    public ShowSparkJobResponse withLog(Consumer<List<String>> logSetter) {
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

    public ShowSparkJobResponse withScType(String scType) {
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

    public ShowSparkJobResponse withClusterName(String clusterName) {
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

    public ShowSparkJobResponse withCreateTime(Long createTime) {
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

    public ShowSparkJobResponse withName(String name) {
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

    public ShowSparkJobResponse withOwner(String owner) {
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

    public ShowSparkJobResponse withProxyUser(String proxyUser) {
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

    public ShowSparkJobResponse withKind(String kind) {
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

    public ShowSparkJobResponse withQueue(String queue) {
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

    public ShowSparkJobResponse withImage(String image) {
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

    public ShowSparkJobResponse withReqBody(String reqBody) {
        this.reqBody = reqBody;
        return this;
    }

    /**
     * 请求参数详情
     * @return reqBody
     */
    public String getReqBody() {
        return reqBody;
    }

    public void setReqBody(String reqBody) {
        this.reqBody = reqBody;
    }

    public ShowSparkJobResponse withUpdateTime(Long updateTime) {
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

    public ShowSparkJobResponse withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 作业特性。表示用户作业使用的Spark镜像类型。  basic：表示使用DLI提供的基础Spark镜像。 custom：表示使用用户自定义的Spark镜像。 ai：表示使用DLI提供的AI镜像。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public ShowSparkJobResponse withSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * 作业使用spark组件的版本号，在“feature”为“basic”或“ai”时填写，若不填写，则使用默认的spark组件版本号2.3.2。
     * @return sparkVersion
     */
    public String getSparkVersion() {
        return sparkVersion;
    }

    public void setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkJobResponse that = (ShowSparkJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.state, that.state)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.log, that.log)
            && Objects.equals(this.scType, that.scType) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.proxyUser, that.proxyUser)
            && Objects.equals(this.kind, that.kind) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.image, that.image) && Objects.equals(this.reqBody, that.reqBody)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.sparkVersion, that.sparkVersion);
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
            reqBody,
            updateTime,
            feature,
            sparkVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkJobResponse {\n");
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
        sb.append("    reqBody: ").append(toIndentedString(reqBody)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    sparkVersion: ").append(toIndentedString(sparkVersion)).append("\n");
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
