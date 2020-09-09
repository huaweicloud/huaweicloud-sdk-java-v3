package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 协调器信息。
 */
public class ShowCoordinatorsRespCoordinators  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;

    public ShowCoordinatorsRespCoordinators withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 消费组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowCoordinatorsRespCoordinators withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 对应协调器的broker id。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowCoordinatorsRespCoordinators withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 对应协调器的地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowCoordinatorsRespCoordinators withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 端口号。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCoordinatorsRespCoordinators showCoordinatorsRespCoordinators = (ShowCoordinatorsRespCoordinators) o;
        return Objects.equals(this.groupId, showCoordinatorsRespCoordinators.groupId) &&
            Objects.equals(this.id, showCoordinatorsRespCoordinators.id) &&
            Objects.equals(this.host, showCoordinatorsRespCoordinators.host) &&
            Objects.equals(this.port, showCoordinatorsRespCoordinators.port);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, id, host, port);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCoordinatorsRespCoordinators {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

