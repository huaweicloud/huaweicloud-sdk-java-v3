package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteConfigSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configsetid")

    private String configsetid;

    public DeleteConfigSetRequest withConfigsetid(String configsetid) {
        this.configsetid = configsetid;
        return this;
    }

    /**
     * 配置集合id
     * @return configsetid
     */
    public String getConfigsetid() {
        return configsetid;
    }

    public void setConfigsetid(String configsetid) {
        this.configsetid = configsetid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteConfigSetRequest that = (DeleteConfigSetRequest) obj;
        return Objects.equals(this.configsetid, that.configsetid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configsetid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConfigSetRequest {\n");
        sb.append("    configsetid: ").append(toIndentedString(configsetid)).append("\n");
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
