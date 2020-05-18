package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.Privateip;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CreatePrivateipResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privateips")
    
    private List<Privateip> privateips = null;
    
    public CreatePrivateipResponse withPrivateips(List<Privateip> privateips) {
        this.privateips = privateips;
        return this;
    }

    
    public CreatePrivateipResponse addPrivateipsItem(Privateip privateipsItem) {
        if (this.privateips == null) {
            this.privateips = new ArrayList<>();
        }
        this.privateips.add(privateipsItem);
        return this;
    }

    public CreatePrivateipResponse withPrivateips(Consumer<List<Privateip>> privateipsSetter) {
        if(this.privateips == null ){
            this.privateips = new ArrayList<>();
        }
        privateipsSetter.accept(this.privateips);
        return this;
    }

    /**
     * 私有IP列表对象
     * @return privateips
     */
    public List<Privateip> getPrivateips() {
        return privateips;
    }

    public void setPrivateips(List<Privateip> privateips) {
        this.privateips = privateips;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrivateipResponse createPrivateipResponse = (CreatePrivateipResponse) o;
        return Objects.equals(this.privateips, createPrivateipResponse.privateips);
    }
    @Override
    public int hashCode() {
        return Objects.hash(privateips);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateipResponse {\n");
            sb.append("    privateips: ").append(toIndentedString(privateips)).append("\n");
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

