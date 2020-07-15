package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.ResourceTagDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建tag对象的请求体
 */
public class ResourceTagReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private ResourceTagDict tag = null;

    public ResourceTagReq withTag(ResourceTagDict tag) {
        this.tag = tag;
        return this;
    }

    public ResourceTagReq withTag(Consumer<ResourceTagDict> tagSetter) {
        if(this.tag == null ){
            this.tag = new ResourceTagDict();
            tagSetter.accept(this.tag);
        }
        
        return this;
    }


    /**
     * Get tag
     * @return tag
     */
    public ResourceTagDict getTag() {
        return tag;
    }

    public void setTag(ResourceTagDict tag) {
        this.tag = tag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceTagReq resourceTagReq = (ResourceTagReq) o;
        return Objects.equals(this.tag, resourceTagReq.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTagReq {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

