package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.CreatePublicIpOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建弹性公网IP请求体。
 */
public class CreatePublicIpRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private CreatePublicIpOption publicip;

    public CreatePublicIpRequestBody withPublicip(CreatePublicIpOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePublicIpRequestBody withPublicip(Consumer<CreatePublicIpOption> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new CreatePublicIpOption();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public CreatePublicIpOption getPublicip() {
        return publicip;
    }

    public void setPublicip(CreatePublicIpOption publicip) {
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
        CreatePublicIpRequestBody createPublicIpRequestBody = (CreatePublicIpRequestBody) o;
        return Objects.equals(this.publicip, createPublicIpRequestBody.publicip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicIpRequestBody {\n");
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

