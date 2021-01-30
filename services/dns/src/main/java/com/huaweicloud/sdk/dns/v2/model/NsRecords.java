package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NsRecords
 */
public class NsRecords  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    private Integer priority;

    public NsRecords withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    


    /**
     * 主机名。  当为内网名称服务器时，此值为空。
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public NsRecords withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 名称服务器地址。  当为公网名称服务器时，此值为空。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NsRecords withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 优先级。  示例：  如果priority的值为“1”，表示会第一个采用该域名服务器进行解析。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NsRecords nsRecords = (NsRecords) o;
        return Objects.equals(this.hostname, nsRecords.hostname) &&
            Objects.equals(this.address, nsRecords.address) &&
            Objects.equals(this.priority, nsRecords.priority);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostname, address, priority);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NsRecords {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

