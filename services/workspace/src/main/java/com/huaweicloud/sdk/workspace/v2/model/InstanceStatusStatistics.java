package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceStatusStatistics
 */
public class InstanceStatusStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_name")

    private String staticName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_num")

    private Integer runningNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_num")

    private Integer stopNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hibernate_num")

    private Integer hibernateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_num")

    private Integer otherNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_num")

    private Integer attachedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unattached_num")

    private Integer unattachedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cannot_attach_num")

    private Integer cannotAttachNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_process_num")

    private Integer inProcessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_use_num")

    private Integer inUseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unregistered_num")

    private Integer unregisteredNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready_num")

    private Integer readyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnected_num")

    private Integer disconnectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown_num")

    private Integer unknownNum;

    public InstanceStatusStatistics withStaticName(String staticName) {
        this.staticName = staticName;
        return this;
    }

    /**
     * 统计对象名称(虚拟机组名称、桌面组名称)。
     * @return staticName
     */
    public String getStaticName() {
        return staticName;
    }

    public void setStaticName(String staticName) {
        this.staticName = staticName;
    }

    public InstanceStatusStatistics withRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
        return this;
    }

    /**
     * 运行数目(运行中、启动中、故障迁移中、迁移中)。
     * minimum: 0
     * maximum: 2147483647
     * @return runningNum
     */
    public Integer getRunningNum() {
        return runningNum;
    }

    public void setRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
    }

    public InstanceStatusStatistics withStopNum(Integer stopNum) {
        this.stopNum = stopNum;
        return this;
    }

    /**
     * 关机数目(关机中、已关机)。
     * minimum: 0
     * maximum: 2147483647
     * @return stopNum
     */
    public Integer getStopNum() {
        return stopNum;
    }

    public void setStopNum(Integer stopNum) {
        this.stopNum = stopNum;
    }

    public InstanceStatusStatistics withHibernateNum(Integer hibernateNum) {
        this.hibernateNum = hibernateNum;
        return this;
    }

    /**
     * 休眠数目(休眠中、已休眠)。
     * minimum: 0
     * maximum: 2147483647
     * @return hibernateNum
     */
    public Integer getHibernateNum() {
        return hibernateNum;
    }

    public void setHibernateNum(Integer hibernateNum) {
        this.hibernateNum = hibernateNum;
    }

    public InstanceStatusStatistics withOtherNum(Integer otherNum) {
        this.otherNum = otherNum;
        return this;
    }

    /**
     * 其他(未知、删除失败、删除中)。
     * minimum: 0
     * maximum: 2147483647
     * @return otherNum
     */
    public Integer getOtherNum() {
        return otherNum;
    }

    public void setOtherNum(Integer otherNum) {
        this.otherNum = otherNum;
    }

    public InstanceStatusStatistics withAttachedNum(Integer attachedNum) {
        this.attachedNum = attachedNum;
        return this;
    }

    /**
     * 已分配数目
     * minimum: 0
     * maximum: 2147483647
     * @return attachedNum
     */
    public Integer getAttachedNum() {
        return attachedNum;
    }

    public void setAttachedNum(Integer attachedNum) {
        this.attachedNum = attachedNum;
    }

    public InstanceStatusStatistics withUnattachedNum(Integer unattachedNum) {
        this.unattachedNum = unattachedNum;
        return this;
    }

    /**
     * 未分配数目
     * minimum: 0
     * maximum: 2147483647
     * @return unattachedNum
     */
    public Integer getUnattachedNum() {
        return unattachedNum;
    }

    public void setUnattachedNum(Integer unattachedNum) {
        this.unattachedNum = unattachedNum;
    }

    public InstanceStatusStatistics withCannotAttachNum(Integer cannotAttachNum) {
        this.cannotAttachNum = cannotAttachNum;
        return this;
    }

    /**
     * 不可分配数目(分配失败、解分配失败、解分配成功)
     * minimum: 0
     * maximum: 2147483647
     * @return cannotAttachNum
     */
    public Integer getCannotAttachNum() {
        return cannotAttachNum;
    }

    public void setCannotAttachNum(Integer cannotAttachNum) {
        this.cannotAttachNum = cannotAttachNum;
    }

    public InstanceStatusStatistics withInProcessNum(Integer inProcessNum) {
        this.inProcessNum = inProcessNum;
        return this;
    }

    /**
     * 处理中(分配中、解分配中)
     * minimum: 0
     * maximum: 2147483647
     * @return inProcessNum
     */
    public Integer getInProcessNum() {
        return inProcessNum;
    }

    public void setInProcessNum(Integer inProcessNum) {
        this.inProcessNum = inProcessNum;
    }

    public InstanceStatusStatistics withInUseNum(Integer inUseNum) {
        this.inUseNum = inUseNum;
        return this;
    }

    /**
     * 使用中数目。
     * minimum: 0
     * maximum: 2147483647
     * @return inUseNum
     */
    public Integer getInUseNum() {
        return inUseNum;
    }

    public void setInUseNum(Integer inUseNum) {
        this.inUseNum = inUseNum;
    }

    public InstanceStatusStatistics withUnregisteredNum(Integer unregisteredNum) {
        this.unregisteredNum = unregisteredNum;
        return this;
    }

    /**
     * 未注册数目。
     * minimum: 0
     * maximum: 2147483647
     * @return unregisteredNum
     */
    public Integer getUnregisteredNum() {
        return unregisteredNum;
    }

    public void setUnregisteredNum(Integer unregisteredNum) {
        this.unregisteredNum = unregisteredNum;
    }

    public InstanceStatusStatistics withReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
        return this;
    }

    /**
     * 空闲数目。
     * minimum: 0
     * maximum: 2147483647
     * @return readyNum
     */
    public Integer getReadyNum() {
        return readyNum;
    }

    public void setReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
    }

    public InstanceStatusStatistics withDisconnectedNum(Integer disconnectedNum) {
        this.disconnectedNum = disconnectedNum;
        return this;
    }

    /**
     * 断开连接数目。
     * minimum: 0
     * maximum: 2147483647
     * @return disconnectedNum
     */
    public Integer getDisconnectedNum() {
        return disconnectedNum;
    }

    public void setDisconnectedNum(Integer disconnectedNum) {
        this.disconnectedNum = disconnectedNum;
    }

    public InstanceStatusStatistics withUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
        return this;
    }

    /**
     * 未知数目。
     * minimum: 0
     * maximum: 2147483647
     * @return unknownNum
     */
    public Integer getUnknownNum() {
        return unknownNum;
    }

    public void setUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceStatusStatistics that = (InstanceStatusStatistics) obj;
        return Objects.equals(this.staticName, that.staticName) && Objects.equals(this.runningNum, that.runningNum)
            && Objects.equals(this.stopNum, that.stopNum) && Objects.equals(this.hibernateNum, that.hibernateNum)
            && Objects.equals(this.otherNum, that.otherNum) && Objects.equals(this.attachedNum, that.attachedNum)
            && Objects.equals(this.unattachedNum, that.unattachedNum)
            && Objects.equals(this.cannotAttachNum, that.cannotAttachNum)
            && Objects.equals(this.inProcessNum, that.inProcessNum) && Objects.equals(this.inUseNum, that.inUseNum)
            && Objects.equals(this.unregisteredNum, that.unregisteredNum)
            && Objects.equals(this.readyNum, that.readyNum)
            && Objects.equals(this.disconnectedNum, that.disconnectedNum)
            && Objects.equals(this.unknownNum, that.unknownNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staticName,
            runningNum,
            stopNum,
            hibernateNum,
            otherNum,
            attachedNum,
            unattachedNum,
            cannotAttachNum,
            inProcessNum,
            inUseNum,
            unregisteredNum,
            readyNum,
            disconnectedNum,
            unknownNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceStatusStatistics {\n");
        sb.append("    staticName: ").append(toIndentedString(staticName)).append("\n");
        sb.append("    runningNum: ").append(toIndentedString(runningNum)).append("\n");
        sb.append("    stopNum: ").append(toIndentedString(stopNum)).append("\n");
        sb.append("    hibernateNum: ").append(toIndentedString(hibernateNum)).append("\n");
        sb.append("    otherNum: ").append(toIndentedString(otherNum)).append("\n");
        sb.append("    attachedNum: ").append(toIndentedString(attachedNum)).append("\n");
        sb.append("    unattachedNum: ").append(toIndentedString(unattachedNum)).append("\n");
        sb.append("    cannotAttachNum: ").append(toIndentedString(cannotAttachNum)).append("\n");
        sb.append("    inProcessNum: ").append(toIndentedString(inProcessNum)).append("\n");
        sb.append("    inUseNum: ").append(toIndentedString(inUseNum)).append("\n");
        sb.append("    unregisteredNum: ").append(toIndentedString(unregisteredNum)).append("\n");
        sb.append("    readyNum: ").append(toIndentedString(readyNum)).append("\n");
        sb.append("    disconnectedNum: ").append(toIndentedString(disconnectedNum)).append("\n");
        sb.append("    unknownNum: ").append(toIndentedString(unknownNum)).append("\n");
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
