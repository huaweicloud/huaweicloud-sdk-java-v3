package com.huaweicloud.sdk.dns.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.Nameserver;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPublicZoneNameServerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameservers")
    
    private List<Nameserver> nameservers = null;
    
    public ShowPublicZoneNameServerResponse withNameservers(List<Nameserver> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    
    public ShowPublicZoneNameServerResponse addNameserversItem(Nameserver nameserversItem) {
        if(this.nameservers == null) {
            this.nameservers = new ArrayList<>();
        }
        this.nameservers.add(nameserversItem);
        return this;
    }

    public ShowPublicZoneNameServerResponse withNameservers(Consumer<List<Nameserver>> nameserversSetter) {
        if(this.nameservers == null) {
            this.nameservers = new ArrayList<>();
        }
        nameserversSetter.accept(this.nameservers);
        return this;
    }

    /**
     * 查询单个公网Zone的名称服务器响应。
     * @return nameservers
     */
    public List<Nameserver> getNameservers() {
        return nameservers;
    }

    public void setNameservers(List<Nameserver> nameservers) {
        this.nameservers = nameservers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPublicZoneNameServerResponse showPublicZoneNameServerResponse = (ShowPublicZoneNameServerResponse) o;
        return Objects.equals(this.nameservers, showPublicZoneNameServerResponse.nameservers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameservers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicZoneNameServerResponse {\n");
        sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
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

