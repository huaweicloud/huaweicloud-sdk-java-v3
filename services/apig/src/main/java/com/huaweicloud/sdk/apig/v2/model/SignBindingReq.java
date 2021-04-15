package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SignBindingReq
 */
public class SignBindingReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_id")
    
    private String signId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_ids")
    
    private List<String> publishIds = null;
    
    public SignBindingReq withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    


    /**
     * 签名密钥编号
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    

    public SignBindingReq withPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
        return this;
    }

    
    public SignBindingReq addPublishIdsItem(String publishIdsItem) {
        if(this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        this.publishIds.add(publishIdsItem);
        return this;
    }

    public SignBindingReq withPublishIds(Consumer<List<String>> publishIdsSetter) {
        if(this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        publishIdsSetter.accept(this.publishIds);
        return this;
    }

    /**
     * API的发布记录编号
     * @return publishIds
     */
    public List<String> getPublishIds() {
        return publishIds;
    }

    public void setPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignBindingReq signBindingReq = (SignBindingReq) o;
        return Objects.equals(this.signId, signBindingReq.signId) &&
            Objects.equals(this.publishIds, signBindingReq.publishIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(signId, publishIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignBindingReq {\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    publishIds: ").append(toIndentedString(publishIds)).append("\n");
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

