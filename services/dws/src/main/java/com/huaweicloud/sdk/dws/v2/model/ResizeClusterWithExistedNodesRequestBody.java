package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点扩容请求
 */
public class ResizeClusterWithExistedNodesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_out")

    private ScaleOut scaleOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize")

    private Resize resize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_backup")

    private Boolean forceBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_with_existed_node")

    private Boolean expandWithExistedNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_node_only")

    private Boolean createNodeOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_redistribute")

    private Boolean autoRedistribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_scheduler_build_mode")

    private Boolean isSchedulerBuildMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_conf")

    private RedisConf redisConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_task_info")

    private BuildTaskInfo buildTaskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    public ResizeClusterWithExistedNodesRequestBody withScaleOut(ScaleOut scaleOut) {
        this.scaleOut = scaleOut;
        return this;
    }

    public ResizeClusterWithExistedNodesRequestBody withScaleOut(Consumer<ScaleOut> scaleOutSetter) {
        if (this.scaleOut == null) {
            this.scaleOut = new ScaleOut();
            scaleOutSetter.accept(this.scaleOut);
        }

        return this;
    }

    /**
     * Get scaleOut
     * @return scaleOut
     */
    public ScaleOut getScaleOut() {
        return scaleOut;
    }

    public void setScaleOut(ScaleOut scaleOut) {
        this.scaleOut = scaleOut;
    }

    public ResizeClusterWithExistedNodesRequestBody withResize(Resize resize) {
        this.resize = resize;
        return this;
    }

    public ResizeClusterWithExistedNodesRequestBody withResize(Consumer<Resize> resizeSetter) {
        if (this.resize == null) {
            this.resize = new Resize();
            resizeSetter.accept(this.resize);
        }

        return this;
    }

    /**
     * Get resize
     * @return resize
     */
    public Resize getResize() {
        return resize;
    }

    public void setResize(Resize resize) {
        this.resize = resize;
    }

    public ResizeClusterWithExistedNodesRequestBody withForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
        return this;
    }

    /**
     * 是否强制备份
     * @return forceBackup
     */
    public Boolean getForceBackup() {
        return forceBackup;
    }

    public void setForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
    }

    public ResizeClusterWithExistedNodesRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 扩容模式
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ResizeClusterWithExistedNodesRequestBody withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * 逻辑集群名称
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public ResizeClusterWithExistedNodesRequestBody withExpandWithExistedNode(Boolean expandWithExistedNode) {
        this.expandWithExistedNode = expandWithExistedNode;
        return this;
    }

    /**
     * 是否是使用已添加的空闲节点进行扩容
     * @return expandWithExistedNode
     */
    public Boolean getExpandWithExistedNode() {
        return expandWithExistedNode;
    }

    public void setExpandWithExistedNode(Boolean expandWithExistedNode) {
        this.expandWithExistedNode = expandWithExistedNode;
    }

    public ResizeClusterWithExistedNodesRequestBody withCreateNodeOnly(Boolean createNodeOnly) {
        this.createNodeOnly = createNodeOnly;
        return this;
    }

    /**
     * 否只是添加节点
     * @return createNodeOnly
     */
    public Boolean getCreateNodeOnly() {
        return createNodeOnly;
    }

    public void setCreateNodeOnly(Boolean createNodeOnly) {
        this.createNodeOnly = createNodeOnly;
    }

    public ResizeClusterWithExistedNodesRequestBody withAutoRedistribute(Boolean autoRedistribute) {
        this.autoRedistribute = autoRedistribute;
        return this;
    }

    /**
     * 扩容完成后是否自动启动重分布，默认是
     * @return autoRedistribute
     */
    public Boolean getAutoRedistribute() {
        return autoRedistribute;
    }

    public void setAutoRedistribute(Boolean autoRedistribute) {
        this.autoRedistribute = autoRedistribute;
    }

    public ResizeClusterWithExistedNodesRequestBody withIsSchedulerBuildMode(Boolean isSchedulerBuildMode) {
        this.isSchedulerBuildMode = isSchedulerBuildMode;
        return this;
    }

    /**
     * 是否调度模式扩容加节点
     * @return isSchedulerBuildMode
     */
    public Boolean getIsSchedulerBuildMode() {
        return isSchedulerBuildMode;
    }

    public void setIsSchedulerBuildMode(Boolean isSchedulerBuildMode) {
        this.isSchedulerBuildMode = isSchedulerBuildMode;
    }

    public ResizeClusterWithExistedNodesRequestBody withRedisConf(RedisConf redisConf) {
        this.redisConf = redisConf;
        return this;
    }

    public ResizeClusterWithExistedNodesRequestBody withRedisConf(Consumer<RedisConf> redisConfSetter) {
        if (this.redisConf == null) {
            this.redisConf = new RedisConf();
            redisConfSetter.accept(this.redisConf);
        }

        return this;
    }

    /**
     * Get redisConf
     * @return redisConf
     */
    public RedisConf getRedisConf() {
        return redisConf;
    }

    public void setRedisConf(RedisConf redisConf) {
        this.redisConf = redisConf;
    }

    public ResizeClusterWithExistedNodesRequestBody withBuildTaskInfo(BuildTaskInfo buildTaskInfo) {
        this.buildTaskInfo = buildTaskInfo;
        return this;
    }

    public ResizeClusterWithExistedNodesRequestBody withBuildTaskInfo(Consumer<BuildTaskInfo> buildTaskInfoSetter) {
        if (this.buildTaskInfo == null) {
            this.buildTaskInfo = new BuildTaskInfo();
            buildTaskInfoSetter.accept(this.buildTaskInfo);
        }

        return this;
    }

    /**
     * Get buildTaskInfo
     * @return buildTaskInfo
     */
    public BuildTaskInfo getBuildTaskInfo() {
        return buildTaskInfo;
    }

    public void setBuildTaskInfo(BuildTaskInfo buildTaskInfo) {
        this.buildTaskInfo = buildTaskInfo;
    }

    public ResizeClusterWithExistedNodesRequestBody withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 扩容订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeClusterWithExistedNodesRequestBody that = (ResizeClusterWithExistedNodesRequestBody) obj;
        return Objects.equals(this.scaleOut, that.scaleOut) && Objects.equals(this.resize, that.resize)
            && Objects.equals(this.forceBackup, that.forceBackup) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.expandWithExistedNode, that.expandWithExistedNode)
            && Objects.equals(this.createNodeOnly, that.createNodeOnly)
            && Objects.equals(this.autoRedistribute, that.autoRedistribute)
            && Objects.equals(this.isSchedulerBuildMode, that.isSchedulerBuildMode)
            && Objects.equals(this.redisConf, that.redisConf) && Objects.equals(this.buildTaskInfo, that.buildTaskInfo)
            && Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scaleOut,
            resize,
            forceBackup,
            mode,
            logicalClusterName,
            expandWithExistedNode,
            createNodeOnly,
            autoRedistribute,
            isSchedulerBuildMode,
            redisConf,
            buildTaskInfo,
            orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterWithExistedNodesRequestBody {\n");
        sb.append("    scaleOut: ").append(toIndentedString(scaleOut)).append("\n");
        sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
        sb.append("    forceBackup: ").append(toIndentedString(forceBackup)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    expandWithExistedNode: ").append(toIndentedString(expandWithExistedNode)).append("\n");
        sb.append("    createNodeOnly: ").append(toIndentedString(createNodeOnly)).append("\n");
        sb.append("    autoRedistribute: ").append(toIndentedString(autoRedistribute)).append("\n");
        sb.append("    isSchedulerBuildMode: ").append(toIndentedString(isSchedulerBuildMode)).append("\n");
        sb.append("    redisConf: ").append(toIndentedString(redisConf)).append("\n");
        sb.append("    buildTaskInfo: ").append(toIndentedString(buildTaskInfo)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
