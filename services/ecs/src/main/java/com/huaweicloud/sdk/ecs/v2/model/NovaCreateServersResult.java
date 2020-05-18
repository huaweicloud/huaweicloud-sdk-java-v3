package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaLink;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerSecurityGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  
 */
public class NovaCreateServersResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<NovaLink> links = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<NovaServerSecurityGroup> securityGroups = new ArrayList<>();
        /**
     * diskConfig方式。  - MANUAL，镜像空间不会扩展。 - AUTO，系统盘镜像空间会自动扩展为与flavor大小一致。
     */
    public static class OsDCFDiskConfigEnum {

        
        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        
        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        

        public static Map<String, OsDCFDiskConfigEnum> staticFields =
                new HashMap<String, OsDCFDiskConfigEnum>() {
                    { 
                        put("MANUAL", MANUAL);
                        put("AUTO", AUTO);
                    }
                };

        private String value;

        OsDCFDiskConfigEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsDCFDiskConfigEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsDCFDiskConfigEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsDCFDiskConfigEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsDCFDiskConfigEnum) {
                return this.value.equals(((OsDCFDiskConfigEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-DCF:diskConfig")
    
    private OsDCFDiskConfigEnum osDCFDiskConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reservation_id")
    
    private String reservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminPass")
    
    private String adminPass;

    public NovaCreateServersResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 弹性云服务器uuid。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaCreateServersResult withLinks(List<NovaLink> links) {
        this.links = links;
        return this;
    }

    
    public NovaCreateServersResult addLinksItem(NovaLink linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public NovaCreateServersResult withLinks(Consumer<List<NovaLink>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 弹性云服务器URI自描述信息。
     * @return links
     */
    public List<NovaLink> getLinks() {
        return links;
    }

    public void setLinks(List<NovaLink> links) {
        this.links = links;
    }

    public NovaCreateServersResult withSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public NovaCreateServersResult addSecurityGroupsItem(NovaServerSecurityGroup securityGroupsItem) {
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaCreateServersResult withSecurityGroups(Consumer<List<NovaServerSecurityGroup>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 弹性云服务器所在安全组。
     * @return securityGroups
     */
    public List<NovaServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NovaCreateServersResult withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    


    /**
     * diskConfig方式。  - MANUAL，镜像空间不会扩展。 - AUTO，系统盘镜像空间会自动扩展为与flavor大小一致。
     * @return osDCFDiskConfig
     */
    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public NovaCreateServersResult withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    


    /**
     * 通过返回的reservation_id，可以过滤查询到本次创建的弹性云服务器。  > 说明： >  > 批量创建弹性云服务器时，支持使用该字段。
     * @return reservationId
     */
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public NovaCreateServersResult withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    


    /**
     * Windows弹性云服务器Administrator用户的密码。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaCreateServersResult novaCreateServersResult = (NovaCreateServersResult) o;
        return Objects.equals(this.id, novaCreateServersResult.id) &&
            Objects.equals(this.links, novaCreateServersResult.links) &&
            Objects.equals(this.securityGroups, novaCreateServersResult.securityGroups) &&
            Objects.equals(this.osDCFDiskConfig, novaCreateServersResult.osDCFDiskConfig) &&
            Objects.equals(this.reservationId, novaCreateServersResult.reservationId) &&
            Objects.equals(this.adminPass, novaCreateServersResult.adminPass);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, securityGroups, osDCFDiskConfig, reservationId, adminPass);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersResult {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
            sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
            sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
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

