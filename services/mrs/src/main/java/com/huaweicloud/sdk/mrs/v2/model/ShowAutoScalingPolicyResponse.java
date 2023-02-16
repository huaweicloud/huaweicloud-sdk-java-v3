package com.huaweicloud.sdk.mrs.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.AutoScalingPolicyV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAutoScalingPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private List<AutoScalingPolicyV2> body = null;
    
    public ShowAutoScalingPolicyResponse withBody(List<AutoScalingPolicyV2> body) {
        this.body = body;
        return this;
    }

    
    public ShowAutoScalingPolicyResponse addBodyItem(AutoScalingPolicyV2 bodyItem) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ShowAutoScalingPolicyResponse withBody(Consumer<List<AutoScalingPolicyV2>> bodySetter) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 弹性伸缩策略列表
     * @return body
     */
    public List<AutoScalingPolicyV2> getBody() {
        return body;
    }

    public void setBody(List<AutoScalingPolicyV2> body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAutoScalingPolicyResponse showAutoScalingPolicyResponse = (ShowAutoScalingPolicyResponse) o;
        return Objects.equals(this.body, showAutoScalingPolicyResponse.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoScalingPolicyResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

