package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加组件请求
 */
public class AddComponentsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components_install_mode")

    private List<ComponentInstallMode> componentsInstallMode = null;

    public AddComponentsReq withComponentsInstallMode(List<ComponentInstallMode> componentsInstallMode) {
        this.componentsInstallMode = componentsInstallMode;
        return this;
    }

    public AddComponentsReq addComponentsInstallModeItem(ComponentInstallMode componentsInstallModeItem) {
        if (this.componentsInstallMode == null) {
            this.componentsInstallMode = new ArrayList<>();
        }
        this.componentsInstallMode.add(componentsInstallModeItem);
        return this;
    }

    public AddComponentsReq withComponentsInstallMode(
        Consumer<List<ComponentInstallMode>> componentsInstallModeSetter) {
        if (this.componentsInstallMode == null) {
            this.componentsInstallMode = new ArrayList<>();
        }
        componentsInstallModeSetter.accept(this.componentsInstallMode);
        return this;
    }

    /**
     * 组件模型详情
     * @return componentsInstallMode
     */
    public List<ComponentInstallMode> getComponentsInstallMode() {
        return componentsInstallMode;
    }

    public void setComponentsInstallMode(List<ComponentInstallMode> componentsInstallMode) {
        this.componentsInstallMode = componentsInstallMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddComponentsReq that = (AddComponentsReq) obj;
        return Objects.equals(this.componentsInstallMode, that.componentsInstallMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentsInstallMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddComponentsReq {\n");
        sb.append("    componentsInstallMode: ").append(toIndentedString(componentsInstallMode)).append("\n");
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
