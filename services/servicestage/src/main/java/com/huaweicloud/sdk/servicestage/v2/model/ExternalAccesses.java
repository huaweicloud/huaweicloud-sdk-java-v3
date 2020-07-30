package com.huaweicloud.sdk.servicestage.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ExternalAccessProtocol;
import com.huaweicloud.sdk.servicestage.v2.model.ExternalAccessStatus;
import com.huaweicloud.sdk.servicestage.v2.model.ExternalAccessType;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 访问方式。
 */
public class ExternalAccesses  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ExternalAccessProtocol protocol = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="forward_port")
    
    private Integer forwardPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private ExternalAccessType type = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private ExternalAccessStatus status = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private Long updateTime;

    public ExternalAccesses withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExternalAccesses withProtocol(ExternalAccessProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * Get protocol
     * @return protocol
     */
    public ExternalAccessProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(ExternalAccessProtocol protocol) {
        this.protocol = protocol;
    }

    public ExternalAccesses withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 访问地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ExternalAccesses withForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }

    


    /**
     * 应用组件进程监听端口
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return forwardPort;
    }

    public void setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
    }

    public ExternalAccesses withType(ExternalAccessType type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public ExternalAccessType getType() {
        return type;
    }

    public void setType(ExternalAccessType type) {
        this.type = type;
    }

    public ExternalAccesses withStatus(ExternalAccessStatus status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public ExternalAccessStatus getStatus() {
        return status;
    }

    public void setStatus(ExternalAccessStatus status) {
        this.status = status;
    }

    public ExternalAccesses withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ExternalAccesses withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalAccesses externalAccesses = (ExternalAccesses) o;
        return Objects.equals(this.id, externalAccesses.id) &&
            Objects.equals(this.protocol, externalAccesses.protocol) &&
            Objects.equals(this.address, externalAccesses.address) &&
            Objects.equals(this.forwardPort, externalAccesses.forwardPort) &&
            Objects.equals(this.type, externalAccesses.type) &&
            Objects.equals(this.status, externalAccesses.status) &&
            Objects.equals(this.createTime, externalAccesses.createTime) &&
            Objects.equals(this.updateTime, externalAccesses.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, protocol, address, forwardPort, type, status, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalAccesses {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    forwardPort: ").append(toIndentedString(forwardPort)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

