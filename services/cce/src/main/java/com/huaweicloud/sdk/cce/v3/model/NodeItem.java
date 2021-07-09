package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NodeItem
 */
public class NodeItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uid")
    
    private String uid;

    public NodeItem withUid(String uid) {
        this.uid = uid;
        return this;
    }

    


    /**
     * 节点ID
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeItem nodeItem = (NodeItem) o;
        return Objects.equals(this.uid, nodeItem.uid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeItem {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

