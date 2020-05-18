package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ResizeInstanceRequestBody
 */
public class ResizeInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize")
    
    private ResizeInstanceOption resize = null;

    public ResizeInstanceRequestBody withResize(ResizeInstanceOption resize) {
        this.resize = resize;
        return this;
    }

    public ResizeInstanceRequestBody withResize(Consumer<ResizeInstanceOption> resizeSetter) {
        if(this.resize == null ){
            this.resize = new ResizeInstanceOption();
        }
        resizeSetter.accept(this.resize);
        return this;
    }


    /**
     * Get resize
     * @return resize
     */
    public ResizeInstanceOption getResize() {
        return resize;
    }

    public void setResize(ResizeInstanceOption resize) {
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
        ResizeInstanceRequestBody resizeInstanceRequestBody = (ResizeInstanceRequestBody) o;
        return Objects.equals(this.resize, resizeInstanceRequestBody.resize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceRequestBody {\n");
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

