package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Versions;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListVersionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    private Versions versions;

    public KeystoneListVersionsResponse withVersions(Versions versions) {
        this.versions = versions;
        return this;
    }

    public KeystoneListVersionsResponse withVersions(Consumer<Versions> versionsSetter) {
        if(this.versions == null ){
            this.versions = new Versions();
            versionsSetter.accept(this.versions);
        }
        
        return this;
    }


    /**
     * Get versions
     * @return versions
     */
    public Versions getVersions() {
        return versions;
    }

    public void setVersions(Versions versions) {
        this.versions = versions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListVersionsResponse keystoneListVersionsResponse = (KeystoneListVersionsResponse) o;
        return Objects.equals(this.versions, keystoneListVersionsResponse.versions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

