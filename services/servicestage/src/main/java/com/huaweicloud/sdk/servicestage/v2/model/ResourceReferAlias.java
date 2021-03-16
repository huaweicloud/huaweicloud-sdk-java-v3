package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用别名，dcs时才提供，支持“distributed_session”、“distributed_cache”、“distributed_session, distributed_cache”，  默认值是“distributed_session, distributed_cache”。 
 */
public class ResourceReferAlias  {


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceReferAlias {\n");
        sb.append("}");
        return sb.toString();
    }
    
}

