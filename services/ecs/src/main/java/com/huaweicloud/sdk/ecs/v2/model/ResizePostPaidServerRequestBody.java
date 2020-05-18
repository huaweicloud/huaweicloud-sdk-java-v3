package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ResizePostPaidServerOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class ResizePostPaidServerRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize")
    
    private ResizePostPaidServerOption resize = null;

    public ResizePostPaidServerRequestBody withResize(ResizePostPaidServerOption resize) {
        this.resize = resize;
        return this;
    }

    public ResizePostPaidServerRequestBody withResize(Consumer<ResizePostPaidServerOption> resizeSetter) {
        if(this.resize == null ){
            this.resize = new ResizePostPaidServerOption();
        }
        resizeSetter.accept(this.resize);
        return this;
    }


    /**
     * Get resize
     * @return resize
     */
    public ResizePostPaidServerOption getResize() {
        return resize;
    }

    public void setResize(ResizePostPaidServerOption resize) {
        this.resize = resize;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizePostPaidServerRequestBody resizePostPaidServerRequestBody = (ResizePostPaidServerRequestBody) o;
        return Objects.equals(this.resize, resizePostPaidServerRequestBody.resize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizePostPaidServerRequestBody {\n");
            sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
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

