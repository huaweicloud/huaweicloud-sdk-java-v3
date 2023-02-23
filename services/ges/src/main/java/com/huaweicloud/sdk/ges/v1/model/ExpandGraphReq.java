package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.ReplicationReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ExpandGraphReq
 */
public class ExpandGraphReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expand")
    

    private ReplicationReq expand;

    public ExpandGraphReq withExpand(ReplicationReq expand) {
        this.expand = expand;
        return this;
    }

    public ExpandGraphReq withExpand(Consumer<ReplicationReq> expandSetter) {
        if(this.expand == null ){
            this.expand = new ReplicationReq();
            expandSetter.accept(this.expand);
        }
        
        return this;
    }


    /**
     * Get expand
     * @return expand
     */
    public ReplicationReq getExpand() {
        return expand;
    }

    public void setExpand(ReplicationReq expand) {
        this.expand = expand;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandGraphReq expandGraphReq = (ExpandGraphReq) o;
        return Objects.equals(this.expand, expandGraphReq.expand);
    }
    @Override
    public int hashCode() {
        return Objects.hash(expand);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandGraphReq {\n");
        sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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

