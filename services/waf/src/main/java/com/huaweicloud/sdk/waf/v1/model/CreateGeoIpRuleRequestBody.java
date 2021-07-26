package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateGeoIpRuleRequestBody
 */
public class CreateGeoIpRuleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="geoip")
    
    private String geoip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="white")
    
    private Integer white;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public CreateGeoIpRuleRequestBody withGeoip(String geoip) {
        this.geoip = geoip;
        return this;
    }

    


    /**
     * 地理位置封禁区域
     * @return geoip
     */
    public String getGeoip() {
        return geoip;
    }

    public void setGeoip(String geoip) {
        this.geoip = geoip;
    }

    

    public CreateGeoIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    


    /**
     * 放行或者拦截（0拦截，1放行）
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    

    public CreateGeoIpRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 创建规则时间戳
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGeoIpRuleRequestBody createGeoIpRuleRequestBody = (CreateGeoIpRuleRequestBody) o;
        return Objects.equals(this.geoip, createGeoIpRuleRequestBody.geoip) &&
            Objects.equals(this.white, createGeoIpRuleRequestBody.white) &&
            Objects.equals(this.description, createGeoIpRuleRequestBody.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(geoip, white, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGeoIpRuleRequestBody {\n");
        sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

