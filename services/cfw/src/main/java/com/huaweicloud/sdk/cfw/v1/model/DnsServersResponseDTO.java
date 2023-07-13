package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DnsServersResponseDTO
 */
public class DnsServersResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Integer isApplied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_customized")

    private Integer isCustomized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    public DnsServersResponseDTO withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DnsServersResponseDTO withIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * 是否应用，0否 1是
     * @return isApplied
     */
    public Integer getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
    }

    public DnsServersResponseDTO withIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
        return this;
    }

    /**
     * 是否是用户自定义的dns服务器，0否 1是
     * @return isCustomized
     */
    public Integer getIsCustomized() {
        return isCustomized;
    }

    public void setIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
    }

    public DnsServersResponseDTO withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * DNS服务器IP
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DnsServersResponseDTO that = (DnsServersResponseDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.isApplied, that.isApplied)
            && Objects.equals(this.isCustomized, that.isCustomized) && Objects.equals(this.serverIp, that.serverIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isApplied, isCustomized, serverIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsServersResponseDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
        sb.append("    isCustomized: ").append(toIndentedString(isCustomized)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
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
