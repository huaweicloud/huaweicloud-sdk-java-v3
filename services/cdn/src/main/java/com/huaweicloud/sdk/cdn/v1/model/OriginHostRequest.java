package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.OriginHostBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OriginHostRequest
 */
public class OriginHostRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin_host")
    
    private OriginHostBody originHost;

    public OriginHostRequest withOriginHost(OriginHostBody originHost) {
        this.originHost = originHost;
        return this;
    }

    public OriginHostRequest withOriginHost(Consumer<OriginHostBody> originHostSetter) {
        if(this.originHost == null ){
            this.originHost = new OriginHostBody();
            originHostSetter.accept(this.originHost);
        }
        
        return this;
    }


    /**
     * Get originHost
     * @return originHost
     */
    public OriginHostBody getOriginHost() {
        return originHost;
    }

    public void setOriginHost(OriginHostBody originHost) {
        this.originHost = originHost;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OriginHostRequest originHostRequest = (OriginHostRequest) o;
        return Objects.equals(this.originHost, originHostRequest.originHost);
    }
    @Override
    public int hashCode() {
        return Objects.hash(originHost);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginHostRequest {\n");
        sb.append("    originHost: ").append(toIndentedString(originHost)).append("\n");
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

