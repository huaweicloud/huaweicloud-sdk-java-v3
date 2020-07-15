package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新弹性公网IP的请求体
 */
public class UpdatePublicipsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private UpdatePublicipDict publicip = null;

    public UpdatePublicipsReq withPublicip(UpdatePublicipDict publicip) {
        this.publicip = publicip;
        return this;
    }

    public UpdatePublicipsReq withPublicip(Consumer<UpdatePublicipDict> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new UpdatePublicipDict();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public UpdatePublicipDict getPublicip() {
        return publicip;
    }

    public void setPublicip(UpdatePublicipDict publicip) {
        this.publicip = publicip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePublicipsReq updatePublicipsReq = (UpdatePublicipsReq) o;
        return Objects.equals(this.publicip, updatePublicipsReq.publicip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicipsReq {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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

