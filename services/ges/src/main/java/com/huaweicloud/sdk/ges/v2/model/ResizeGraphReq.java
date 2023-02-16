package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ResizeGraphReqResize;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 扩容图请求体
 */
public class ResizeGraphReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize")
    
    
    private ResizeGraphReqResize resize;

    public ResizeGraphReq withResize(ResizeGraphReqResize resize) {
        this.resize = resize;
        return this;
    }

    public ResizeGraphReq withResize(Consumer<ResizeGraphReqResize> resizeSetter) {
        if(this.resize == null ){
            this.resize = new ResizeGraphReqResize();
            resizeSetter.accept(this.resize);
        }
        
        return this;
    }


    /**
     * Get resize
     * @return resize
     */
    public ResizeGraphReqResize getResize() {
        return resize;
    }

    public void setResize(ResizeGraphReqResize resize) {
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
        ResizeGraphReq resizeGraphReq = (ResizeGraphReq) o;
        return Objects.equals(this.resize, resizeGraphReq.resize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeGraphReq {\n");
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

