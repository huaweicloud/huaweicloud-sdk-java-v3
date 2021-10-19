package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 保护实例变更规格请求数据结构 */
public class ResizeProtectedInstanceRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "production_flavorRef")

    private String productionFlavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_flavorRef")

    private String drFlavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "production_dedicated_host_id")

    private String productionDedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_dedicated_host_id")

    private String drDedicatedHostId;

    public ResizeProtectedInstanceRequestParams withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /** 变更规格后，生产站点云服务器和容灾站点云服务器的flavor ID。可通过查询云服务器规格变更支持列表接口获取。
     * 说明：系统支持同时变更生产站点云服务器和容灾站点云服务器的规格。如需同时变更，请使用flavorRef参数，变更规格后，生产站点云服务器和容灾站点云服务器的规格相同。
     * 
     * @return flavorRef */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public ResizeProtectedInstanceRequestParams withProductionFlavorRef(String productionFlavorRef) {
        this.productionFlavorRef = productionFlavorRef;
        return this;
    }

    /** 变更规格后，生产站点云服务器的flavor ID。可通过查询云服务器规格变更支持列表接口获取。
     * 说明：系统支持仅变更生产站点云服务器的规格。此时，请使用production_flavorRef参数。当flavorRef参数有值时，production_flavorRef参数不生效。
     * 
     * @return productionFlavorRef */
    public String getProductionFlavorRef() {
        return productionFlavorRef;
    }

    public void setProductionFlavorRef(String productionFlavorRef) {
        this.productionFlavorRef = productionFlavorRef;
    }

    public ResizeProtectedInstanceRequestParams withDrFlavorRef(String drFlavorRef) {
        this.drFlavorRef = drFlavorRef;
        return this;
    }

    /** 变更规格后，容灾站点云服务器的flavor ID。可通过查询云服务器规格变更支持列表接口获取。
     * 说明：系统支持仅变更容灾站点云服务器的规格。此时，请使用dr_flavorRef参数。当flavorRef参数有值时，dr_flavorRef参数不生效。
     * 
     * @return drFlavorRef */
    public String getDrFlavorRef() {
        return drFlavorRef;
    }

    public void setDrFlavorRef(String drFlavorRef) {
        this.drFlavorRef = drFlavorRef;
    }

    public ResizeProtectedInstanceRequestParams withProductionDedicatedHostId(String productionDedicatedHostId) {
        this.productionDedicatedHostId = productionDedicatedHostId;
        return this;
    }

    /** 新生产站点专属主机ID。 说明：生产站点云服务器在专属主机上时，变更规格需要指定此参数。可以指定为生产站点云服务器当前所在专属主机ID或其他专属主机ID。
     * 
     * @return productionDedicatedHostId */
    public String getProductionDedicatedHostId() {
        return productionDedicatedHostId;
    }

    public void setProductionDedicatedHostId(String productionDedicatedHostId) {
        this.productionDedicatedHostId = productionDedicatedHostId;
    }

    public ResizeProtectedInstanceRequestParams withDrDedicatedHostId(String drDedicatedHostId) {
        this.drDedicatedHostId = drDedicatedHostId;
        return this;
    }

    /** 新容灾站点专属主机ID。 说明：容灾站点云服务器在专属主机上时，变更规格需要指定此参数。可以指定为容灾站点云服务器当前所在专属主机ID或其他专属主机ID。
     * 
     * @return drDedicatedHostId */
    public String getDrDedicatedHostId() {
        return drDedicatedHostId;
    }

    public void setDrDedicatedHostId(String drDedicatedHostId) {
        this.drDedicatedHostId = drDedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeProtectedInstanceRequestParams resizeProtectedInstanceRequestParams =
            (ResizeProtectedInstanceRequestParams) o;
        return Objects.equals(this.flavorRef, resizeProtectedInstanceRequestParams.flavorRef)
            && Objects.equals(this.productionFlavorRef, resizeProtectedInstanceRequestParams.productionFlavorRef)
            && Objects.equals(this.drFlavorRef, resizeProtectedInstanceRequestParams.drFlavorRef)
            && Objects.equals(this.productionDedicatedHostId,
                resizeProtectedInstanceRequestParams.productionDedicatedHostId)
            && Objects.equals(this.drDedicatedHostId, resizeProtectedInstanceRequestParams.drDedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, productionFlavorRef, drFlavorRef, productionDedicatedHostId, drDedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeProtectedInstanceRequestParams {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    productionFlavorRef: ").append(toIndentedString(productionFlavorRef)).append("\n");
        sb.append("    drFlavorRef: ").append(toIndentedString(drFlavorRef)).append("\n");
        sb.append("    productionDedicatedHostId: ").append(toIndentedString(productionDedicatedHostId)).append("\n");
        sb.append("    drDedicatedHostId: ").append(toIndentedString(drDedicatedHostId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
