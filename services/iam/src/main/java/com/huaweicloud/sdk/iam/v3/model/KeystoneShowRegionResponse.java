package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Region;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneShowRegionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private Region region;

    public KeystoneShowRegionResponse withRegion(Region region) {
        this.region = region;
        return this;
    }

    public KeystoneShowRegionResponse withRegion(Consumer<Region> regionSetter) {
        if(this.region == null ){
            this.region = new Region();
            regionSetter.accept(this.region);
        }
        
        return this;
    }


    /**
     * Get region
     * @return region
     */
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowRegionResponse keystoneShowRegionResponse = (KeystoneShowRegionResponse) o;
        return Objects.equals(this.region, keystoneShowRegionResponse.region);
    }
    @Override
    public int hashCode() {
        return Objects.hash(region);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowRegionResponse {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

