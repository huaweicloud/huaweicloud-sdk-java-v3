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
     * 桌面数据。支持批量按需类型桌面变更为同一规格。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeDesktopReq resizeDesktopReq = (ResizeDesktopReq) o;
        return Objects.equals(this.desktops, resizeDesktopReq.desktops)
            && Objects.equals(this.productId, resizeDesktopReq.productId)
            && Objects.equals(this.mode, resizeDesktopReq.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops, productId, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopReq {\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
