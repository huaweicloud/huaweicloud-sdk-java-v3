package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 当修改终端节点子网路由表失败 时，返回错误提示信息 */
public class RoutetableInfoError {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_failed")

    private RoutetableInfoErrorDetial bindFailed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbind_failed")

    private RoutetableInfoErrorDetial unbindFailed;

    public RoutetableInfoError withBindFailed(RoutetableInfoErrorDetial bindFailed) {
        this.bindFailed = bindFailed;
        return this;
    }

    public RoutetableInfoError withBindFailed(Consumer<RoutetableInfoErrorDetial> bindFailedSetter) {
        if (this.bindFailed == null) {
            this.bindFailed = new RoutetableInfoErrorDetial();
            bindFailedSetter.accept(this.bindFailed);
        }

        return this;
    }

    /** Get bindFailed
     * 
     * @return bindFailed */
    public RoutetableInfoErrorDetial getBindFailed() {
        return bindFailed;
    }

    public void setBindFailed(RoutetableInfoErrorDetial bindFailed) {
        this.bindFailed = bindFailed;
    }

    public RoutetableInfoError withUnbindFailed(RoutetableInfoErrorDetial unbindFailed) {
        this.unbindFailed = unbindFailed;
        return this;
    }

    public RoutetableInfoError withUnbindFailed(Consumer<RoutetableInfoErrorDetial> unbindFailedSetter) {
        if (this.unbindFailed == null) {
            this.unbindFailed = new RoutetableInfoErrorDetial();
            unbindFailedSetter.accept(this.unbindFailed);
        }

        return this;
    }

    /** Get unbindFailed
     * 
     * @return unbindFailed */
    public RoutetableInfoErrorDetial getUnbindFailed() {
        return unbindFailed;
    }

    public void setUnbindFailed(RoutetableInfoErrorDetial unbindFailed) {
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
