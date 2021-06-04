package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发IoTA服务消息结构
 */
public class IoTAForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_source_id")
    
    private String dataSourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;

    public IoTAForwarding withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    


    /**
     * **参数说明**：IoTA服务对应的数据源Id。
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    

    public IoTAForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * **参数说明**：IoTA服务对应的projectId信息。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IoTAForwarding ioTAForwarding = (IoTAForwarding) o;
        return Objects.equals(this.dataSourceId, ioTAForwarding.dataSourceId) &&
            Objects.equals(this.projectId, ioTAForwarding.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IoTAForwarding {\n");
        sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

