package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class ResizePostPaidServerOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavorRef")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;

    public ResizePostPaidServerOption withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 变更后的云服务器规格ID。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public ResizePostPaidServerOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 取值为withStopServer ，支持开机状态下变更规格。  mode取值为withStopServer时，对开机状态的云服务器执行变更规格操作，系统自动对云服务器先执行关机，再变更规格，变更成功后再执行开机。
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
        ResizePostPaidServerOption resizePostPaidServerOption = (ResizePostPaidServerOption) o;
        return Objects.equals(this.flavorRef, resizePostPaidServerOption.flavorRef) &&
            Objects.equals(this.mode, resizePostPaidServerOption.mode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, mode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizePostPaidServerOption {\n");
            sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
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

