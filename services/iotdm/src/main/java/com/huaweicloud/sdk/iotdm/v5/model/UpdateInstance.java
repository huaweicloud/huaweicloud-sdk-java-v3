package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateInstance
 */
public class UpdateInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_window")

    private OperateWindow operateWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_info")

    private UpdateForwardingInfo forwardingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_info")

    private UpdateAccessInfo accessInfo;

    public UpdateInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：实例名称。 **取值范围**：由中文字符，英文字母、数字及“_”、“-”组成，且长度为[1-64]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInstance withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：设备接入实例的描述信息。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_，,.。、&-等字符的组合 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstance withOperateWindow(OperateWindow operateWindow) {
        this.operateWindow = operateWindow;
        return this;
    }

    public UpdateInstance withOperateWindow(Consumer<OperateWindow> operateWindowSetter) {
        if (this.operateWindow == null) {
            this.operateWindow = new OperateWindow();
            operateWindowSetter.accept(this.operateWindow);
        }

        return this;
    }

    /**
     * Get operateWindow
     * @return operateWindow
     */
    public OperateWindow getOperateWindow() {
        return operateWindow;
    }

    public void setOperateWindow(OperateWindow operateWindow) {
        this.operateWindow = operateWindow;
    }

    public UpdateInstance withForwardingInfo(UpdateForwardingInfo forwardingInfo) {
        this.forwardingInfo = forwardingInfo;
        return this;
    }

    public UpdateInstance withForwardingInfo(Consumer<UpdateForwardingInfo> forwardingInfoSetter) {
        if (this.forwardingInfo == null) {
            this.forwardingInfo = new UpdateForwardingInfo();
            forwardingInfoSetter.accept(this.forwardingInfo);
        }

        return this;
    }

    /**
     * Get forwardingInfo
     * @return forwardingInfo
     */
    public UpdateForwardingInfo getForwardingInfo() {
        return forwardingInfo;
    }

    public void setForwardingInfo(UpdateForwardingInfo forwardingInfo) {
        this.forwardingInfo = forwardingInfo;
    }

    public UpdateInstance withAccessInfo(UpdateAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
        return this;
    }

    public UpdateInstance withAccessInfo(Consumer<UpdateAccessInfo> accessInfoSetter) {
        if (this.accessInfo == null) {
            this.accessInfo = new UpdateAccessInfo();
            accessInfoSetter.accept(this.accessInfo);
        }

        return this;
    }

    /**
     * Get accessInfo
     * @return accessInfo
     */
    public UpdateAccessInfo getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(UpdateAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstance that = (UpdateInstance) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.operateWindow, that.operateWindow)
            && Objects.equals(this.forwardingInfo, that.forwardingInfo)
            && Objects.equals(this.accessInfo, that.accessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, operateWindow, forwardingInfo, accessInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstance {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    operateWindow: ").append(toIndentedString(operateWindow)).append("\n");
        sb.append("    forwardingInfo: ").append(toIndentedString(forwardingInfo)).append("\n");
        sb.append("    accessInfo: ").append(toIndentedString(accessInfo)).append("\n");
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
