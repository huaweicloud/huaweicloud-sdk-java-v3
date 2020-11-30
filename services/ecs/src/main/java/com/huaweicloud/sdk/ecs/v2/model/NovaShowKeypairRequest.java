package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NovaShowKeypairRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypair_name")
    
    private String keypairName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OpenStack-API-Version")
    
    private String openStackAPIVersion;

    public NovaShowKeypairRequest withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    


    /**
     * Get keypairName
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public NovaShowKeypairRequest withOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
        return this;
    }

    


    /**
     * Get openStackAPIVersion
     * @return openStackAPIVersion
     */
    public String getOpenStackAPIVersion() {
        return openStackAPIVersion;
    }

    public void setOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaShowKeypairRequest novaShowKeypairRequest = (NovaShowKeypairRequest) o;
        return Objects.equals(this.keypairName, novaShowKeypairRequest.keypairName) &&
            Objects.equals(this.openStackAPIVersion, novaShowKeypairRequest.openStackAPIVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keypairName, openStackAPIVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaShowKeypairRequest {\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    openStackAPIVersion: ").append(toIndentedString(openStackAPIVersion)).append("\n");
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

