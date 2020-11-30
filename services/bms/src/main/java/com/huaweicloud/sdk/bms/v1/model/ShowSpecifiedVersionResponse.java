package com.huaweicloud.sdk.bms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.Versions;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSpecifiedVersionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private Versions version = null;

    public ShowSpecifiedVersionResponse withVersion(Versions version) {
        this.version = version;
        return this;
    }

    public ShowSpecifiedVersionResponse withVersion(Consumer<Versions> versionSetter) {
        if(this.version == null ){
            this.version = new Versions();
            versionSetter.accept(this.version);
        }
        
        return this;
    }


    /**
     * Get version
     * @return version
     */
    public Versions getVersion() {
        return version;
    }

    public void setVersion(Versions version) {
        this.version = version;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSpecifiedVersionResponse showSpecifiedVersionResponse = (ShowSpecifiedVersionResponse) o;
        return Objects.equals(this.version, showSpecifiedVersionResponse.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpecifiedVersionResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

