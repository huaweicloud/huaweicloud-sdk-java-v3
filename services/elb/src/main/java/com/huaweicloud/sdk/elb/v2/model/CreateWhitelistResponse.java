package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.WhitelistV2Resp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateWhitelistResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelist")
    
    private WhitelistV2Resp whitelist = null;

    public CreateWhitelistResponse withWhitelist(WhitelistV2Resp whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public CreateWhitelistResponse withWhitelist(Consumer<WhitelistV2Resp> whitelistSetter) {
        if(this.whitelist == null ){
            this.whitelist = new WhitelistV2Resp();
            whitelistSetter.accept(this.whitelist);
        }
        
        return this;
    }


    /**
     * Get whitelist
     * @return whitelist
     */
    public WhitelistV2Resp getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(WhitelistV2Resp whitelist) {
        this.whitelist = whitelist;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWhitelistResponse createWhitelistResponse = (CreateWhitelistResponse) o;
        return Objects.equals(this.whitelist, createWhitelistResponse.whitelist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(whitelist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWhitelistResponse {\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

