package com.huaweicloud.sdk.rabbitmq.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListAvailableZonesRespAvailableZones
 */
public class ListAvailableZonesRespAvailableZones  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="soldOut")
    
    private Boolean soldOut;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_availability")
    
    private String resourceAvailability;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_az")
    
    private Boolean defaultAz;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;

    public ListAvailableZonesRespAvailableZones withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    


    /**
     * 是否售罄。
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public ListAvailableZonesRespAvailableZones withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 可用区ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAvailableZonesRespAvailableZones withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 可用区编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListAvailableZonesRespAvailableZones withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 可用区名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAvailableZonesRespAvailableZones withPort(String port) {
        this.port = port;
        return this;
    }

    


    /**
     * 可用区端口号。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ListAvailableZonesRespAvailableZones withResourceAvailability(String resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
        return this;
    }

    


    /**
     * 分区上是否还有可用资源。
     * @return resourceAvailability
     */
    public String getResourceAvailability() {
        return resourceAvailability;
    }

    public void setResourceAvailability(String resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
    }

    public ListAvailableZonesRespAvailableZones withDefaultAz(Boolean defaultAz) {
        this.defaultAz = defaultAz;
        return this;
    }

    


    /**
     * 是否为默认可用区。
     * @return defaultAz
     */
    public Boolean getDefaultAz() {
        return defaultAz;
    }

    public void setDefaultAz(Boolean defaultAz) {
        this.defaultAz = defaultAz;
    }

    public ListAvailableZonesRespAvailableZones withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    


    /**
     * 是否支持IPv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableZonesRespAvailableZones listAvailableZonesRespAvailableZones = (ListAvailableZonesRespAvailableZones) o;
        return Objects.equals(this.soldOut, listAvailableZonesRespAvailableZones.soldOut) &&
            Objects.equals(this.id, listAvailableZonesRespAvailableZones.id) &&
            Objects.equals(this.code, listAvailableZonesRespAvailableZones.code) &&
            Objects.equals(this.name, listAvailableZonesRespAvailableZones.name) &&
            Objects.equals(this.port, listAvailableZonesRespAvailableZones.port) &&
            Objects.equals(this.resourceAvailability, listAvailableZonesRespAvailableZones.resourceAvailability) &&
            Objects.equals(this.defaultAz, listAvailableZonesRespAvailableZones.defaultAz) &&
            Objects.equals(this.ipv6Enable, listAvailableZonesRespAvailableZones.ipv6Enable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(soldOut, id, code, name, port, resourceAvailability, defaultAz, ipv6Enable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableZonesRespAvailableZones {\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    resourceAvailability: ").append(toIndentedString(resourceAvailability)).append("\n");
        sb.append("    defaultAz: ").append(toIndentedString(defaultAz)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
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

