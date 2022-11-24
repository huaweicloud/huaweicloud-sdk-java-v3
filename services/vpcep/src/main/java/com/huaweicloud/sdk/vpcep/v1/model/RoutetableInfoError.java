package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当修改终端节点子网路由表失败时，返回错误提示信息
 */
public class RoutetableInfoError {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_failed")

    private List<RoutetableInfoErrorDetial> bindFailed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbind_failed")

    private List<RoutetableInfoErrorDetial> unbindFailed = null;

    public RoutetableInfoError withBindFailed(List<RoutetableInfoErrorDetial> bindFailed) {
        this.bindFailed = bindFailed;
        return this;
    }

    public RoutetableInfoError addBindFailedItem(RoutetableInfoErrorDetial bindFailedItem) {
        if (this.bindFailed == null) {
            this.bindFailed = new ArrayList<>();
        }
        this.bindFailed.add(bindFailedItem);
        return this;
    }

    public RoutetableInfoError withBindFailed(Consumer<List<RoutetableInfoErrorDetial>> bindFailedSetter) {
        if (this.bindFailed == null) {
            this.bindFailed = new ArrayList<>();
        }
        bindFailedSetter.accept(this.bindFailed);
        return this;
    }

    /**
     * 绑定终端节点子网路由表失败信息。
     * @return bindFailed
     */
    public List<RoutetableInfoErrorDetial> getBindFailed() {
        return bindFailed;
    }

    public void setBindFailed(List<RoutetableInfoErrorDetial> bindFailed) {
        this.bindFailed = bindFailed;
    }

    public RoutetableInfoError withUnbindFailed(List<RoutetableInfoErrorDetial> unbindFailed) {
        this.unbindFailed = unbindFailed;
        return this;
    }

    public RoutetableInfoError addUnbindFailedItem(RoutetableInfoErrorDetial unbindFailedItem) {
        if (this.unbindFailed == null) {
            this.unbindFailed = new ArrayList<>();
        }
        this.unbindFailed.add(unbindFailedItem);
        return this;
    }

    public RoutetableInfoError withUnbindFailed(Consumer<List<RoutetableInfoErrorDetial>> unbindFailedSetter) {
        if (this.unbindFailed == null) {
            this.unbindFailed = new ArrayList<>();
        }
        unbindFailedSetter.accept(this.unbindFailed);
        return this;
    }

    /**
     * 解绑终端节点子网路由表失败信息。
     * @return unbindFailed
     */
    public List<RoutetableInfoErrorDetial> getUnbindFailed() {
        return unbindFailed;
    }

    public void setUnbindFailed(List<RoutetableInfoErrorDetial> unbindFailed) {
        this.unbindFailed = unbindFailed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoutetableInfoError routetableInfoError = (RoutetableInfoError) o;
        return Objects.equals(this.bindFailed, routetableInfoError.bindFailed)
            && Objects.equals(this.unbindFailed, routetableInfoError.unbindFailed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindFailed, unbindFailed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoutetableInfoError {\n");
        sb.append("    bindFailed: ").append(toIndentedString(bindFailed)).append("\n");
        sb.append("    unbindFailed: ").append(toIndentedString(unbindFailed)).append("\n");
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
