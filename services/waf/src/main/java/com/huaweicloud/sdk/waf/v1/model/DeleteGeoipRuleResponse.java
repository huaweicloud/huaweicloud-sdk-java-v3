package com.huaweicloud.sdk.waf.v1.model;




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
public class DeleteGeoipRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="geoip")
    
    private String geoip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="white")
    
    private Integer white;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public DeleteGeoipRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public DeleteGeoipRuleResponse withGeoip(String geoip) {
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

    

    public DeleteGeoipRuleResponse withWhite(Integer white) {
        this.white = white;
        return this;
    }

    


    /**
     * 放行或者拦截
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    

    public DeleteGeoipRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteGeoipRuleResponse deleteGeoipRuleResponse = (DeleteGeoipRuleResponse) o;
        return Objects.equals(this.id, deleteGeoipRuleResponse.id) &&
            Objects.equals(this.geoip, deleteGeoipRuleResponse.geoip) &&
            Objects.equals(this.white, deleteGeoipRuleResponse.white) &&
            Objects.equals(this.timestamp, deleteGeoipRuleResponse.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, geoip, white, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGeoipRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

