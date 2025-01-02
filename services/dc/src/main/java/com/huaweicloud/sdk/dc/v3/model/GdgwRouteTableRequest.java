package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改路由入参对象
 */
public class GdgwRouteTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_routes")

    private List<AddGdgwRouteAction> addRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_routes")

    private List<DeleteGdgwRouteAction> delRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_routes")

    private List<UpdateRouteAction> updateRoutes = null;

    public GdgwRouteTableRequest withAddRoutes(List<AddGdgwRouteAction> addRoutes) {
        this.addRoutes = addRoutes;
        return this;
    }

    public GdgwRouteTableRequest addAddRoutesItem(AddGdgwRouteAction addRoutesItem) {
        if (this.addRoutes == null) {
            this.addRoutes = new ArrayList<>();
        }
        this.addRoutes.add(addRoutesItem);
        return this;
    }

    public GdgwRouteTableRequest withAddRoutes(Consumer<List<AddGdgwRouteAction>> addRoutesSetter) {
        if (this.addRoutes == null) {
            this.addRoutes = new ArrayList<>();
        }
        addRoutesSetter.accept(this.addRoutes);
        return this;
    }

    /**
     * 需要添加的路由
     * @return addRoutes
     */
    public List<AddGdgwRouteAction> getAddRoutes() {
        return addRoutes;
    }

    public void setAddRoutes(List<AddGdgwRouteAction> addRoutes) {
        this.addRoutes = addRoutes;
    }

    public GdgwRouteTableRequest withDelRoutes(List<DeleteGdgwRouteAction> delRoutes) {
        this.delRoutes = delRoutes;
        return this;
    }

    public GdgwRouteTableRequest addDelRoutesItem(DeleteGdgwRouteAction delRoutesItem) {
        if (this.delRoutes == null) {
            this.delRoutes = new ArrayList<>();
        }
        this.delRoutes.add(delRoutesItem);
        return this;
    }

    public GdgwRouteTableRequest withDelRoutes(Consumer<List<DeleteGdgwRouteAction>> delRoutesSetter) {
        if (this.delRoutes == null) {
            this.delRoutes = new ArrayList<>();
        }
        delRoutesSetter.accept(this.delRoutes);
        return this;
    }

    /**
     * 需要删除的路由
     * @return delRoutes
     */
    public List<DeleteGdgwRouteAction> getDelRoutes() {
        return delRoutes;
    }

    public void setDelRoutes(List<DeleteGdgwRouteAction> delRoutes) {
        this.delRoutes = delRoutes;
    }

    public GdgwRouteTableRequest withUpdateRoutes(List<UpdateRouteAction> updateRoutes) {
        this.updateRoutes = updateRoutes;
        return this;
    }

    public GdgwRouteTableRequest addUpdateRoutesItem(UpdateRouteAction updateRoutesItem) {
        if (this.updateRoutes == null) {
            this.updateRoutes = new ArrayList<>();
        }
        this.updateRoutes.add(updateRoutesItem);
        return this;
    }

    public GdgwRouteTableRequest withUpdateRoutes(Consumer<List<UpdateRouteAction>> updateRoutesSetter) {
        if (this.updateRoutes == null) {
            this.updateRoutes = new ArrayList<>();
        }
        updateRoutesSetter.accept(this.updateRoutes);
        return this;
    }

    /**
     * 需要更新的路由 仅更新该条路由的附加信息，不执行交换机的路由更新操作。当前支持更新：路由描述-description信息
     * @return updateRoutes
     */
    public List<UpdateRouteAction> getUpdateRoutes() {
        return updateRoutes;
    }

    public void setUpdateRoutes(List<UpdateRouteAction> updateRoutes) {
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
        GdgwRouteTableRequest that = (GdgwRouteTableRequest) obj;
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
        sb.append("class GdgwRouteTableRequest {\n");
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
