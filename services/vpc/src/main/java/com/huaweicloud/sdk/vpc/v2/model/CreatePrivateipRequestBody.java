package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.CreatePrivateipOption;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreatePrivateipRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privateips")
    
    private List<CreatePrivateipOption> privateips = new ArrayList<>();
    
    public CreatePrivateipRequestBody withPrivateips(List<CreatePrivateipOption> privateips) {
        this.privateips = privateips;
        return this;
    }

    
    public CreatePrivateipRequestBody addPrivateipsItem(CreatePrivateipOption privateipsItem) {
        this.privateips.add(privateipsItem);
        return this;
    }

    public CreatePrivateipRequestBody withPrivateips(Consumer<List<CreatePrivateipOption>> privateipsSetter) {
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
    public List<CreatePrivateipOption> getPrivateips() {
        return privateips;
    }

    public void setPrivateips(List<CreatePrivateipOption> privateips) {
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
        CreatePrivateipRequestBody createPrivateipRequestBody = (CreatePrivateipRequestBody) o;
        return Objects.equals(this.privateips, createPrivateipRequestBody.privateips);
    }
    @Override
    public int hashCode() {
        return Objects.hash(privateips);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateipRequestBody {\n");
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

