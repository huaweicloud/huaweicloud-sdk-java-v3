package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAnonymousAuthRandomResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="siteUrl")
    
    private String siteUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="random")
    
    private String random;

    public CreateAnonymousAuthRandomResponse withSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    


    /**
     * 下一跳URL。
     * @return siteUrl
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    

    public CreateAnonymousAuthRandomResponse withRandom(String random) {
        this.random = random;
        return this;
    }

    


    /**
     * 鉴权随机数。
     * @return random
     */
    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAnonymousAuthRandomResponse createAnonymousAuthRandomResponse = (CreateAnonymousAuthRandomResponse) o;
        return Objects.equals(this.siteUrl, createAnonymousAuthRandomResponse.siteUrl) &&
            Objects.equals(this.random, createAnonymousAuthRandomResponse.random);
    }
    @Override
    public int hashCode() {
        return Objects.hash(siteUrl, random);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAnonymousAuthRandomResponse {\n");
        sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
        sb.append("    random: ").append(toIndentedString(random)).append("\n");
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

