package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新弹性公网IP的请求体
 */
public class UpdatePublicipsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private UpdatePublicipOption publicip = null;

    public UpdatePublicipsRequestBody withPublicip(UpdatePublicipOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public UpdatePublicipsRequestBody withPublicip(Consumer<UpdatePublicipOption> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new UpdatePublicipOption();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public UpdatePublicipOption getPublicip() {
        return publicip;
    }

    public void setPublicip(UpdatePublicipOption publicip) {
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
        UpdatePublicipsRequestBody updatePublicipsRequestBody = (UpdatePublicipsRequestBody) o;
        return Objects.equals(this.publicip, updatePublicipsRequestBody.publicip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicipsRequestBody {\n");
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

