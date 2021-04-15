package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SignApiBinding
 */
public class SignApiBinding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_id")
    
    private String signId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_ids")
    
    private List<String> publishIds = null;
    
    public SignApiBinding withSignId(String signId) {
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

    

    public SignApiBinding withPublishIds(List<String> publishIds) {
        this.publishIds = publishIds;
        return this;
    }

    
    public SignApiBinding addPublishIdsItem(String publishIdsItem) {
        if(this.publishIds == null) {
            this.publishIds = new ArrayList<>();
        }
        this.publishIds.add(publishIdsItem);
        return this;
    }

    public SignApiBinding withPublishIds(Consumer<List<String>> publishIdsSetter) {
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
        SignApiBinding signApiBinding = (SignApiBinding) o;
        return Objects.equals(this.signId, signApiBinding.signId) &&
            Objects.equals(this.publishIds, signApiBinding.publishIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(signId, publishIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignApiBinding {\n");
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

