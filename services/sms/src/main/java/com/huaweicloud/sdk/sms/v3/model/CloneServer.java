package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 克隆服务器类
 */
public class CloneServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_id")

    @JacksonXmlProperty(localName = "vm_id")

    private String vmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_error")

    @JacksonXmlProperty(localName = "clone_error")

    private String cloneError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_state")

    @JacksonXmlProperty(localName = "clone_state")

    private String cloneState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    @JacksonXmlProperty(localName = "error_msg")

    private String errorMsg;

    public CloneServer withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * 克隆服务器ID
     * @return vmId
     */
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public CloneServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 克隆虚拟机的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloneServer withCloneError(String cloneError) {
        this.cloneError = cloneError;
        return this;
    }

    /**
     * 克隆错误信息
     * @return cloneError
     */
    public String getCloneError() {
        return cloneError;
    }

    public void setCloneError(String cloneError) {
        this.cloneError = cloneError;
    }

    public CloneServer withCloneState(String cloneState) {
        this.cloneState = cloneState;
        return this;
    }

    /**
     * 克隆状态
     * @return cloneState
     */
    public String getCloneState() {
        return cloneState;
    }

    public void setCloneState(String cloneState) {
        this.cloneState = cloneState;
    }

    public CloneServer withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 克隆错误信息描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneServer cloneServer = (CloneServer) o;
        return Objects.equals(this.vmId, cloneServer.vmId) && Objects.equals(this.name, cloneServer.name)
            && Objects.equals(this.cloneError, cloneServer.cloneError)
            && Objects.equals(this.cloneState, cloneServer.cloneState)
            && Objects.equals(this.errorMsg, cloneServer.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmId, name, cloneError, cloneState, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneServer {\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cloneError: ").append(toIndentedString(cloneError)).append("\n");
        sb.append("    cloneState: ").append(toIndentedString(cloneState)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
