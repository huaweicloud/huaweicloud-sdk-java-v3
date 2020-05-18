package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.PostPaidServerEip;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class PostPaidServerPublicip  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip")
    
    private PostPaidServerEip eip = null;

    public PostPaidServerPublicip withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 为待创建云服务器分配已有弹性IP时，分配的弹性IP的ID，UUID格式。  约束：只能分配状态（status）为DOWN的弹性IP。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PostPaidServerPublicip withEip(PostPaidServerEip eip) {
        this.eip = eip;
        return this;
    }

    public PostPaidServerPublicip withEip(Consumer<PostPaidServerEip> eipSetter) {
        if(this.eip == null ){
            this.eip = new PostPaidServerEip();
        }
        eipSetter.accept(this.eip);
        return this;
    }


    /**
     * Get eip
     * @return eip
     */
    public PostPaidServerEip getEip() {
        return eip;
    }

    public void setEip(PostPaidServerEip eip) {
        this.eip = eip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerPublicip postPaidServerPublicip = (PostPaidServerPublicip) o;
        return Objects.equals(this.id, postPaidServerPublicip.id) &&
            Objects.equals(this.eip, postPaidServerPublicip.eip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, eip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerPublicip {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
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

