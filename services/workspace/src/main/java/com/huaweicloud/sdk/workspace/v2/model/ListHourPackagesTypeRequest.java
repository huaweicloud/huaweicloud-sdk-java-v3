package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHourPackagesTypeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_resource_spec_code")

    private String desktopResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    public ListHourPackagesTypeRequest withDesktopResourceSpecCode(String desktopResourceSpecCode) {
        this.desktopResourceSpecCode = desktopResourceSpecCode;
        return this;
    }

    /**
     * 小时包对应的按需桌面的资源规格编码。
     * @return desktopResourceSpecCode
     */
    public String getDesktopResourceSpecCode() {
        return desktopResourceSpecCode;
    }

    public void setDesktopResourceSpecCode(String desktopResourceSpecCode) {
        this.desktopResourceSpecCode = desktopResourceSpecCode;
    }

    public ListHourPackagesTypeRequest withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 小时包的资源规格编码。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHourPackagesTypeRequest that = (ListHourPackagesTypeRequest) obj;
        return Objects.equals(this.desktopResourceSpecCode, that.desktopResourceSpecCode)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopResourceSpecCode, resourceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHourPackagesTypeRequest {\n");
        sb.append("    desktopResourceSpecCode: ").append(toIndentedString(desktopResourceSpecCode)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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
