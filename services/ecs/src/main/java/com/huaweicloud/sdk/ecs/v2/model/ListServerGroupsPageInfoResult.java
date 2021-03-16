package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListServerGroupsPageInfoResult
 */
public class ListServerGroupsPageInfoResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next_marker")
    
    private String nextMarker;

    public ListServerGroupsPageInfoResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    


    /**
     * 
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServerGroupsPageInfoResult listServerGroupsPageInfoResult = (ListServerGroupsPageInfoResult) o;
        return Objects.equals(this.nextMarker, listServerGroupsPageInfoResult.nextMarker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nextMarker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerGroupsPageInfoResult {\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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

