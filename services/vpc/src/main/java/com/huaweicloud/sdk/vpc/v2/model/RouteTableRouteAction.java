package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新路由表路由对象动作，可选add、mod、del
 */
public class RouteTableRouteAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add")

    private List<AddRouteTableRoute> add = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mod")

    private List<ModRouteTableRoute> mod = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del")

    private List<DelRouteTableRoute> del = null;

    public RouteTableRouteAction withAdd(List<AddRouteTableRoute> add) {
        this.add = add;
        return this;
    }

    public RouteTableRouteAction addAddItem(AddRouteTableRoute addItem) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        this.add.add(addItem);
        return this;
    }

    public RouteTableRouteAction withAdd(Consumer<List<AddRouteTableRoute>> addSetter) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        addSetter.accept(this.add);
        return this;
    }

    /**
     * 新增路由条目，type，destination，nexthop必选
     * @return add
     */
    public List<AddRouteTableRoute> getAdd() {
        return add;
    }

    public void setAdd(List<AddRouteTableRoute> add) {
        this.add = add;
    }

    public RouteTableRouteAction withMod(List<ModRouteTableRoute> mod) {
        this.mod = mod;
        return this;
    }

    public RouteTableRouteAction addModItem(ModRouteTableRoute modItem) {
        if (this.mod == null) {
            this.mod = new ArrayList<>();
        }
        this.mod.add(modItem);
        return this;
    }

    public RouteTableRouteAction withMod(Consumer<List<ModRouteTableRoute>> modSetter) {
        if (this.mod == null) {
            this.mod = new ArrayList<>();
        }
        modSetter.accept(this.mod);
        return this;
    }

    /**
     * 修改路由条目，type，destination，nexthop必选
     * @return mod
     */
    public List<ModRouteTableRoute> getMod() {
        return mod;
    }

    public void setMod(List<ModRouteTableRoute> mod) {
        this.mod = mod;
    }

    public RouteTableRouteAction withDel(List<DelRouteTableRoute> del) {
        this.del = del;
        return this;
    }

    public RouteTableRouteAction addDelItem(DelRouteTableRoute delItem) {
        if (this.del == null) {
            this.del = new ArrayList<>();
        }
        this.del.add(delItem);
        return this;
    }

    public RouteTableRouteAction withDel(Consumer<List<DelRouteTableRoute>> delSetter) {
        if (this.del == null) {
            this.del = new ArrayList<>();
        }
        delSetter.accept(this.del);
        return this;
    }

    /**
     * 删除路由条目，destination必选
     * @return del
     */
    public List<DelRouteTableRoute> getDel() {
        return del;
    }

    public void setDel(List<DelRouteTableRoute> del) {
        this.del = del;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouteTableRouteAction routeTableRouteAction = (RouteTableRouteAction) o;
        return Objects.equals(this.add, routeTableRouteAction.add)
            && Objects.equals(this.mod, routeTableRouteAction.mod)
            && Objects.equals(this.del, routeTableRouteAction.del);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, mod, del);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteTableRouteAction {\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    mod: ").append(toIndentedString(mod)).append("\n");
        sb.append("    del: ").append(toIndentedString(del)).append("\n");
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
