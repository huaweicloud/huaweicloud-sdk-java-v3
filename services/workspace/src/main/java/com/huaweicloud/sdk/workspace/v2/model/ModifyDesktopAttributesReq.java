package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询云桌面列表响应
 */
public class ModifyDesktopAttributesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop")

    private ModifyDesktopAttributesReqDesktop desktop;

    public ModifyDesktopAttributesReq withDesktop(ModifyDesktopAttributesReqDesktop desktop) {
        this.desktop = desktop;
        return this;
    }

    public ModifyDesktopAttributesReq withDesktop(Consumer<ModifyDesktopAttributesReqDesktop> desktopSetter) {
        if (this.desktop == null) {
            this.desktop = new ModifyDesktopAttributesReqDesktop();
            desktopSetter.accept(this.desktop);
        }

        return this;
    }

    /**
     * Get desktop
     * @return desktop
     */
    public ModifyDesktopAttributesReqDesktop getDesktop() {
        return desktop;
    }

    public void setDesktop(ModifyDesktopAttributesReqDesktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyDesktopAttributesReq that = (ModifyDesktopAttributesReq) obj;
        return Objects.equals(this.desktop, that.desktop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDesktopAttributesReq {\n");
        sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
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
