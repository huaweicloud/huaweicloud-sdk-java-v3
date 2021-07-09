package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowDatabaseRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ddm_dbname")
    
    private String ddmDbname;

    public ShowDatabaseRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * DDM实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ShowDatabaseRequest withDdmDbname(String ddmDbname) {
        this.ddmDbname = ddmDbname;
        return this;
    }

    


    /**
     * 需要查询的逻辑库名称，不区分大小写。
     * @return ddmDbname
     */
    public String getDdmDbname() {
        return ddmDbname;
    }

    public void setDdmDbname(String ddmDbname) {
        this.ddmDbname = ddmDbname;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDatabaseRequest showDatabaseRequest = (ShowDatabaseRequest) o;
        return Objects.equals(this.instanceId, showDatabaseRequest.instanceId) &&
            Objects.equals(this.ddmDbname, showDatabaseRequest.ddmDbname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ddmDbname);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatabaseRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ddmDbname: ").append(toIndentedString(ddmDbname)).append("\n");
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

