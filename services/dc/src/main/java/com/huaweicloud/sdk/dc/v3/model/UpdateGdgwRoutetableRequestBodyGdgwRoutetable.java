package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateGdgwRoutetableRequestBodyGdgwRoutetable
 */
public class UpdateGdgwRoutetableRequestBodyGdgwRoutetable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_routes")

    private List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableAddRoutes> addRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_routes")

    private List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableDelRoutes> delRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_routes")

    private List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableUpdateRoutes> updateRoutes = null;

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable withAddRoutes(
        List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableAddRoutes> addRoutes) {
        this.addRoutes = addRoutes;
        return this;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable addAddRoutesItem(
        UpdateGdgwRoutetableRequestBodyGdgwRoutetableAddRoutes addRoutesItem) {
        if (this.addRoutes == null) {
            this.addRoutes = new ArrayList<>();
        }
        this.addRoutes.add(addRoutesItem);
        return this;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable withAddRoutes(
        Consumer<List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableAddRoutes>> addRoutesSetter) {
        if (this.addRoutes == null) {
            this.addRoutes = new ArrayList<>();
        }
        addRoutesSetter.accept(this.addRoutes);
        return this;
    }

    /**
     * Get addRoutes
     * @return addRoutes
     */
    public List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableAddRoutes> getAddRoutes() {
        return addRoutes;
    }

    public void setAddRoutes(List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableAddRoutes> addRoutes) {
        this.addRoutes = addRoutes;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable withDelRoutes(
        List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableDelRoutes> delRoutes) {
        this.delRoutes = delRoutes;
        return this;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable addDelRoutesItem(
        UpdateGdgwRoutetableRequestBodyGdgwRoutetableDelRoutes delRoutesItem) {
        if (this.delRoutes == null) {
            this.delRoutes = new ArrayList<>();
        }
        this.delRoutes.add(delRoutesItem);
        return this;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable withDelRoutes(
        Consumer<List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableDelRoutes>> delRoutesSetter) {
        if (this.delRoutes == null) {
            this.delRoutes = new ArrayList<>();
        }
        delRoutesSetter.accept(this.delRoutes);
        return this;
    }

    /**
     * 删除的路由
     * @return delRoutes
     */
    public List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableDelRoutes> getDelRoutes() {
        return delRoutes;
    }

    public void setDelRoutes(List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableDelRoutes> delRoutes) {
        this.delRoutes = delRoutes;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable withUpdateRoutes(
        List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableUpdateRoutes> updateRoutes) {
        this.updateRoutes = updateRoutes;
        return this;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable addUpdateRoutesItem(
        UpdateGdgwRoutetableRequestBodyGdgwRoutetableUpdateRoutes updateRoutesItem) {
        if (this.updateRoutes == null) {
            this.updateRoutes = new ArrayList<>();
        }
        this.updateRoutes.add(updateRoutesItem);
        return this;
    }

    public UpdateGdgwRoutetableRequestBodyGdgwRoutetable withUpdateRoutes(
        Consumer<List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableUpdateRoutes>> updateRoutesSetter) {
        if (this.updateRoutes == null) {
            this.updateRoutes = new ArrayList<>();
        }
        updateRoutesSetter.accept(this.updateRoutes);
        return this;
    }

    /**
     * 仅更新该条路由的附加信息，不执行交换机的路由更新操作。当前支持更新：路由描述-description信息
     * @return updateRoutes
     */
    public List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableUpdateRoutes> getUpdateRoutes() {
        return updateRoutes;
    }

    public void setUpdateRoutes(List<UpdateGdgwRoutetableRequestBodyGdgwRoutetableUpdateRoutes> updateRoutes) {
        this.updateRoutes = updateRoutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGdgwRoutetableRequestBodyGdgwRoutetable that = (UpdateGdgwRoutetableRequestBodyGdgwRoutetable) obj;
        return Objects.equals(this.addRoutes, that.addRoutes) && Objects.equals(this.delRoutes, that.delRoutes)
            && Objects.equals(this.updateRoutes, that.updateRoutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addRoutes, delRoutes, updateRoutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGdgwRoutetableRequestBodyGdgwRoutetable {\n");
        sb.append("    addRoutes: ").append(toIndentedString(addRoutes)).append("\n");
        sb.append("    delRoutes: ").append(toIndentedString(delRoutes)).append("\n");
        sb.append("    updateRoutes: ").append(toIndentedString(updateRoutes)).append("\n");
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
