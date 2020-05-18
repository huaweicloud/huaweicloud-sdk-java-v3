package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class Links  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="self")
    
    private String self;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="previous")
    
    private String previous;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next")
    
    private String next;

    public Links withSelf(String self) {
        this.self = self;
        return this;
    }

    


    /**
     * 资源链接地址。
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Links withPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    


    /**
     * 前一邻接资源链接地址。
     * @return previous
     */
    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public Links withNext(String next) {
        this.next = next;
        return this;
    }

    


    /**
     * 后一邻接资源链接地址。
     * @return next
     */
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Links links = (Links) o;
        return Objects.equals(this.self, links.self) &&
            Objects.equals(this.previous, links.previous) &&
            Objects.equals(this.next, links.next);
    }
    @Override
    public int hashCode() {
        return Objects.hash(self, previous, next);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links {\n");
            sb.append("    self: ").append(toIndentedString(self)).append("\n");
            sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
            sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

