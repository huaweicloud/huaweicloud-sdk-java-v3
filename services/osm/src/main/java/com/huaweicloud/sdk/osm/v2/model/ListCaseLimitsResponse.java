package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.TenantConfigV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCaseLimitsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    
    private TenantConfigV2 config;

    public ListCaseLimitsResponse withConfig(TenantConfigV2 config) {
        this.config = config;
        return this;
    }

    public ListCaseLimitsResponse withConfig(Consumer<TenantConfigV2> configSetter) {
        if(this.config == null ){
            this.config = new TenantConfigV2();
            configSetter.accept(this.config);
        }
        
        return this;
    }


    /**
     * Get config
     * @return config
     */
    public TenantConfigV2 getConfig() {
        return config;
    }

    public void setConfig(TenantConfigV2 config) {
        this.config = config;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCaseLimitsResponse listCaseLimitsResponse = (ListCaseLimitsResponse) o;
        return Objects.equals(this.config, listCaseLimitsResponse.config);
    }
    @Override
    public int hashCode() {
        return Objects.hash(config);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseLimitsResponse {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

