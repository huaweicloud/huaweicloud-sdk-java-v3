package com.huaweicloud.sdk.lts.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.lts.v2.model.StructLogContents;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLogContents2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="struct_logs")
    
    private List<StructLogContents> structLogs = null;
    
    public UpdateLogContents2Response withStructLogs(List<StructLogContents> structLogs) {
        this.structLogs = structLogs;
        return this;
    }

    
    public UpdateLogContents2Response addStructLogsItem(StructLogContents structLogsItem) {
        if(this.structLogs == null) {
            this.structLogs = new ArrayList<>();
        }
        this.structLogs.add(structLogsItem);
        return this;
    }

    public UpdateLogContents2Response withStructLogs(Consumer<List<StructLogContents>> structLogsSetter) {
        if(this.structLogs == null) {
            this.structLogs = new ArrayList<>();
        }
        structLogsSetter.accept(this.structLogs);
        return this;
    }

    /**
     * 日志信息。
     * @return structLogs
     */
    public List<StructLogContents> getStructLogs() {
        return structLogs;
    }

    public void setStructLogs(List<StructLogContents> structLogs) {
        this.structLogs = structLogs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLogContents2Response updateLogContents2Response = (UpdateLogContents2Response) o;
        return Objects.equals(this.structLogs, updateLogContents2Response.structLogs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(structLogs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogContents2Response {\n");
        sb.append("    structLogs: ").append(toIndentedString(structLogs)).append("\n");
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

