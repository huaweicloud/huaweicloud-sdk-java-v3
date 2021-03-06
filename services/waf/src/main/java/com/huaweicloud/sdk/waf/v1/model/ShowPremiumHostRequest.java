package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowPremiumHostRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_id")
    
    private String hostId;

    public ShowPremiumHostRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 独享模式域名ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPremiumHostRequest showPremiumHostRequest = (ShowPremiumHostRequest) o;
        return Objects.equals(this.hostId, showPremiumHostRequest.hostId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPremiumHostRequest {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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

