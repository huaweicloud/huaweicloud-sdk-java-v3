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
public class ShowInstanceRouteRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instanceid")
    
    private String instanceid;

    public ShowInstanceRouteRequest withInstanceid(String instanceid) {
        this.instanceid = instanceid;
        return this;
    }

    


    /**
     * 域名Id
     * @return instanceid
     */
    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceRouteRequest showInstanceRouteRequest = (ShowInstanceRouteRequest) o;
        return Objects.equals(this.instanceid, showInstanceRouteRequest.instanceid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceRouteRequest {\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
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

