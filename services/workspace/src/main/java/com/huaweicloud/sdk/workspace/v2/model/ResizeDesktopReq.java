package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 变更规格请求。
 */
public class ResizeDesktopReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<ResizeDesktopData> desktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_placement")

    private String autoPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    public ResizeDesktopReq withDesktops(List<ResizeDesktopData> desktops) {
        this.desktops = desktops;
        return this;
    }

    public ResizeDesktopReq addDesktopsItem(ResizeDesktopData desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public ResizeDesktopReq withDesktops(Consumer<List<ResizeDesktopData>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 桌面数据。支持批量将桌面变更为同一规格。
     * @return desktops
     */
    public List<ResizeDesktopData> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<ResizeDesktopData> desktops) {
        this.desktops = desktops;
    }

    public ResizeDesktopReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 套餐id。批量变更时，则变更为同一规格的虚拟机。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ResizeDesktopReq withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 是否支持开机状态下执行变更规格操作。固定传值STOP_DESKTOP，如果桌面处于开机状态，会先关机再变更规格。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ResizeDesktopReq withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * 是否自动放置，专属主机桌面变更规格时使用，默认是off关闭自动放置，on表示开启自动放置。
     * @return autoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public ResizeDesktopReq withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池id。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeDesktopReq that = (ResizeDesktopReq) obj;
        return Objects.equals(this.desktops, that.desktops) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.autoPlacement, that.autoPlacement)
            && Objects.equals(this.desktopPoolId, that.desktopPoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops, productId, mode, autoPlacement, desktopPoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopReq {\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
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
