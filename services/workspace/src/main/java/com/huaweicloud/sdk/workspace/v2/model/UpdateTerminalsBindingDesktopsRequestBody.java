package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateTerminalsBindingDesktopsRequestBody
 */
public class UpdateTerminalsBindingDesktopsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac")

    private String mac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateTerminalsBindingDesktopsRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateTerminalsBindingDesktopsRequestBody withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * 终端MAC地址
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public UpdateTerminalsBindingDesktopsRequestBody withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 虚拟机名称
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public UpdateTerminalsBindingDesktopsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTerminalsBindingDesktopsRequestBody updateTerminalsBindingDesktopsRequestBody =
            (UpdateTerminalsBindingDesktopsRequestBody) o;
        return Objects.equals(this.id, updateTerminalsBindingDesktopsRequestBody.id)
            && Objects.equals(this.mac, updateTerminalsBindingDesktopsRequestBody.mac)
            && Objects.equals(this.desktopName, updateTerminalsBindingDesktopsRequestBody.desktopName)
            && Objects.equals(this.description, updateTerminalsBindingDesktopsRequestBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mac, desktopName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTerminalsBindingDesktopsRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
