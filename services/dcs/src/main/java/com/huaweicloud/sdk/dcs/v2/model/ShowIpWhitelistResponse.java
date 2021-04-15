package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.Whitelist;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowIpWhitelistResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_whitelist")
    
    private Boolean enableWhitelist;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelist")
    
    private List<Whitelist> whitelist = null;
    
    public ShowIpWhitelistResponse withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    


    /**
     * 是否启用白名单（true/false）。
     * @return enableWhitelist
     */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    

    public ShowIpWhitelistResponse withWhitelist(List<Whitelist> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    
    public ShowIpWhitelistResponse addWhitelistItem(Whitelist whitelistItem) {
        if(this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        this.whitelist.add(whitelistItem);
        return this;
    }

    public ShowIpWhitelistResponse withWhitelist(Consumer<List<Whitelist>> whitelistSetter) {
        if(this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        whitelistSetter.accept(this.whitelist);
        return this;
    }

    /**
     * IP白名单分组列表。
     * @return whitelist
     */
    public List<Whitelist> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<Whitelist> whitelist) {
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
        ShowIpWhitelistResponse showIpWhitelistResponse = (ShowIpWhitelistResponse) o;
        return Objects.equals(this.enableWhitelist, showIpWhitelistResponse.enableWhitelist) &&
            Objects.equals(this.whitelist, showIpWhitelistResponse.whitelist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enableWhitelist, whitelist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpWhitelistResponse {\n");
        sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
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

