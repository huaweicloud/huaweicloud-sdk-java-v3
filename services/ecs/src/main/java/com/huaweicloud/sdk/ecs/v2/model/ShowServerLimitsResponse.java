package com.huaweicloud.sdk.ecs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ServerLimits;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerLimitsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="absolute")
    
    private ServerLimits absolute = null;

    public ShowServerLimitsResponse withAbsolute(ServerLimits absolute) {
        this.absolute = absolute;
        return this;
    }

    public ShowServerLimitsResponse withAbsolute(Consumer<ServerLimits> absoluteSetter) {
        if(this.absolute == null ){
            this.absolute = new ServerLimits();
            absoluteSetter.accept(this.absolute);
        }
        
        return this;
    }


    /**
     * Get absolute
     * @return absolute
     */
    public ServerLimits getAbsolute() {
        return absolute;
    }

    public void setAbsolute(ServerLimits absolute) {
        this.absolute = absolute;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServerLimitsResponse showServerLimitsResponse = (ShowServerLimitsResponse) o;
        return Objects.equals(this.absolute, showServerLimitsResponse.absolute);
    }
    @Override
    public int hashCode() {
        return Objects.hash(absolute);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerLimitsResponse {\n");
        sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
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

