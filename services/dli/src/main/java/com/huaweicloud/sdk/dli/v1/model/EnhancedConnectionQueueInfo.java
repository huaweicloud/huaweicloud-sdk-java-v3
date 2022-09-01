package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 增强型跨源连接各个队列创建对等连接的信息。
 */
public class EnhancedConnectionQueueInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_id")

    @JacksonXmlProperty(localName = "peer_id")

    private String peerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_msg")

    @JacksonXmlProperty(localName = "err_msg")

    private String errMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    public EnhancedConnectionQueueInfo withPeerId(String peerId) {
        this.peerId = peerId;
        return this;
    }

    /**
     * 对等连接ID。
     * @return peerId
     */
    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    public EnhancedConnectionQueueInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 连接状态。CREATING：跨源连接正在创建中；ACTIVE：跨源连接创建成功，与目的地址连接正常；FAILED：跨源连接创建失败。  
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EnhancedConnectionQueueInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 队列名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnhancedConnectionQueueInfo withErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    /**
     * 状态为失败时的详细报错信息。
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public EnhancedConnectionQueueInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
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
        EnhancedConnectionQueueInfo enhancedConnectionQueueInfo = (EnhancedConnectionQueueInfo) o;
        return Objects.equals(this.peerId, enhancedConnectionQueueInfo.peerId)
            && Objects.equals(this.status, enhancedConnectionQueueInfo.status)
            && Objects.equals(this.name, enhancedConnectionQueueInfo.name)
            && Objects.equals(this.errMsg, enhancedConnectionQueueInfo.errMsg)
            && Objects.equals(this.updateTime, enhancedConnectionQueueInfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, status, name, errMsg, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnhancedConnectionQueueInfo {\n");
        sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
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
