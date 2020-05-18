package com.huaweicloud.sdk.dds.v3.model;

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
 * ListBackupsDatastoreResult
 */
public class ListBackupsDatastoreResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public ListBackupsDatastoreResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据库引擎。 取值：DDS-Community，或DDS-Enhanced。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListBackupsDatastoreResult withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 数据库版本。取值： - 社区版引擎取“3.2”、“3.4”或“4.0”。 - 增强版引擎取“3.4”。 支持3.2、3.4和4.0数据库版本。取值为“3.2”、“3.4”或“4.0”。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsDatastoreResult listBackupsDatastoreResult = (ListBackupsDatastoreResult) o;
        return Objects.equals(this.type, listBackupsDatastoreResult.type) &&
            Objects.equals(this.version, listBackupsDatastoreResult.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsDatastoreResult {\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

