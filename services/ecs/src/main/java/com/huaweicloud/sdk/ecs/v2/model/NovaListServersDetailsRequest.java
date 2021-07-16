package com.huaweicloud.sdk.ecs.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NovaListServersDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="changes-since")
    
    private String changesSince;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private String image;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not-tags")
    
    private String notTags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reservation_id")
    
    private String reservationId;
    /**
     * 查询结果按弹性云服务器属性排序，默认排序顺序为created_at逆序。
     */
    public static final class SortKeyEnum {

        
        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");
        
        /**
         * Enum AVAILABILITY_ZONE for value: "availability_zone"
         */
        public static final SortKeyEnum AVAILABILITY_ZONE = new SortKeyEnum("availability_zone");
        
        /**
         * Enum DISPLAY_NAME for value: "display_name"
         */
        public static final SortKeyEnum DISPLAY_NAME = new SortKeyEnum("display_name");
        
        /**
         * Enum HOST for value: "host"
         */
        public static final SortKeyEnum HOST = new SortKeyEnum("host");
        
        /**
         * Enum INSTANCE_TYPE_ID for value: "instance_type_id"
         */
        public static final SortKeyEnum INSTANCE_TYPE_ID = new SortKeyEnum("instance_type_id");
        
        /**
         * Enum KEY_NAME for value: "key_name"
         */
        public static final SortKeyEnum KEY_NAME = new SortKeyEnum("key_name");
        
        /**
         * Enum PROJECT_ID for value: "project_id"
         */
        public static final SortKeyEnum PROJECT_ID = new SortKeyEnum("project_id");
        
        /**
         * Enum USER_ID for value: "user_id"
         */
        public static final SortKeyEnum USER_ID = new SortKeyEnum("user_id");
        
        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");
        
        /**
         * Enum UUID for value: "uuid"
         */
        public static final SortKeyEnum UUID = new SortKeyEnum("uuid");
        
        /**
         * Enum VM_STATE for value: "vm_state"
         */
        public static final SortKeyEnum VM_STATE = new SortKeyEnum("vm_state");
        

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("availability_zone", AVAILABILITY_ZONE);
            map.put("display_name", DISPLAY_NAME);
            map.put("host", HOST);
            map.put("instance_type_id", INSTANCE_TYPE_ID);
            map.put("key_name", KEY_NAME);
            map.put("project_id", PROJECT_ID);
            map.put("user_id", USER_ID);
            map.put("updated_at", UPDATED_AT);
            map.put("uuid", UUID);
            map.put("vm_state", VM_STATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortKeyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortKeyEnum(value);
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_key")
    
    private SortKeyEnum sortKey;
    /**
     * 云服务器状态。  取值范围： ACTIVE， BUILD，DELETED，ERROR，HARD_REBOOT，MIGRATING，REBOOT，RESIZE，REVERT_RESIZE，SHELVED，SHELVED_OFFLOADED，SHUTOFF，UNKNOWN，VERIFY_RESIZE  直到2.37微版本，非上面范围的status字段将返回空列表，2.38之后的微版本，将返回400错误。  云服务器状态说明请参考[云服务器状态](https://support.huaweicloud.com/api-ecs/ecs_08_0002.html)。
     */
    public static final class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");
        
        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");
        
        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");
        
        /**
         * Enum HARD_REBOOT for value: "HARD_REBOOT"
         */
        public static final StatusEnum HARD_REBOOT = new StatusEnum("HARD_REBOOT");
        
        /**
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");
        
        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final StatusEnum REBOOT = new StatusEnum("REBOOT");
        
        /**
         * Enum RESIZE for value: "RESIZE"
         */
        public static final StatusEnum RESIZE = new StatusEnum("RESIZE");
        
        /**
         * Enum REVERT_RESIZE for value: "REVERT_RESIZE"
         */
        public static final StatusEnum REVERT_RESIZE = new StatusEnum("REVERT_RESIZE");
        
        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final StatusEnum SHELVED = new StatusEnum("SHELVED");
        
        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final StatusEnum SHELVED_OFFLOADED = new StatusEnum("SHELVED_OFFLOADED");
        
        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final StatusEnum SHUTOFF = new StatusEnum("SHUTOFF");
        
        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("UNKNOWN");
        
        /**
         * Enum VERIFY_RESIZE for value: "VERIFY_RESIZE"
         */
        public static final StatusEnum VERIFY_RESIZE = new StatusEnum("VERIFY_RESIZE");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("DELETED", DELETED);
            map.put("ERROR", ERROR);
            map.put("HARD_REBOOT", HARD_REBOOT);
            map.put("MIGRATING", MIGRATING);
            map.put("REBOOT", REBOOT);
            map.put("RESIZE", RESIZE);
            map.put("REVERT_RESIZE", REVERT_RESIZE);
            map.put("SHELVED", SHELVED);
            map.put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
            map.put("SHUTOFF", SHUTOFF);
            map.put("UNKNOWN", UNKNOWN);
            map.put("VERIFY_RESIZE", VERIFY_RESIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OpenStack-API-Version")
    
    private String openStackAPIVersion;

    public NovaListServersDetailsRequest withChangesSince(String changesSince) {
        this.changesSince = changesSince;
        return this;
    }

    


    /**
     * 云服务器上次更新状态的时间戳信息。时间戳为UTC格式。
     * @return changesSince
     */
    public String getChangesSince() {
        return changesSince;
    }

    public void setChangesSince(String changesSince) {
        this.changesSince = changesSince;
    }

    

    public NovaListServersDetailsRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * 云服务器规格ID。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    

    public NovaListServersDetailsRequest withImage(String image) {
        this.image = image;
        return this;
    }

    


    /**
     * 镜像ID  在使用image作为条件过滤时，不能同时支持其他过滤条件和分页条件。如果同时指定image及其他条件，则以image条件为准；当条件不含image时，接口功能不受限制。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    

    public NovaListServersDetailsRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * IPv4地址过滤结果，匹配规则为模糊匹配。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    public NovaListServersDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询返回云服务器数量限制。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public NovaListServersDetailsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 从marker指定的云服务器ID的下一条数据开始查询。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public NovaListServersDetailsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NovaListServersDetailsRequest withNotTags(String notTags) {
        this.notTags = notTags;
        return this;
    }

    


    /**
     * 查询tag字段中不包含该值的云服务器，值为标签的Key。  > 说明： >  > 系统近期对标签功能进行了升级。如果之前添加的Tag为“Key.Value”的形式，则查询的时候需要使用“Key”来查询。 >  > 例如：之前添加的tag为“a.b”,则升级后，查询时需使用“not-tags=a”。
     * @return notTags
     */
    public String getNotTags() {
        return notTags;
    }

    public void setNotTags(String notTags) {
        this.notTags = notTags;
    }

    

    public NovaListServersDetailsRequest withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    


    /**
     * 批量创建弹性云服务器时，指定返回的ID，用于查询本次批量创建的弹性云服务器。
     * @return reservationId
     */
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    

    public NovaListServersDetailsRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * 查询结果按弹性云服务器属性排序，默认排序顺序为created_at逆序。
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    

    public NovaListServersDetailsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云服务器状态。  取值范围： ACTIVE， BUILD，DELETED，ERROR，HARD_REBOOT，MIGRATING，REBOOT，RESIZE，REVERT_RESIZE，SHELVED，SHELVED_OFFLOADED，SHUTOFF，UNKNOWN，VERIFY_RESIZE  直到2.37微版本，非上面范围的status字段将返回空列表，2.38之后的微版本，将返回400错误。  云服务器状态说明请参考[云服务器状态](https://support.huaweicloud.com/api-ecs/ecs_08_0002.html)。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public NovaListServersDetailsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 查询tag字段中包含该值的云服务器。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public NovaListServersDetailsRequest withOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
        return this;
    }

    


    /**
     * 微版本头
     * @return openStackAPIVersion
     */
    public String getOpenStackAPIVersion() {
        return openStackAPIVersion;
    }

    public void setOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaListServersDetailsRequest novaListServersDetailsRequest = (NovaListServersDetailsRequest) o;
        return Objects.equals(this.changesSince, novaListServersDetailsRequest.changesSince) &&
            Objects.equals(this.flavor, novaListServersDetailsRequest.flavor) &&
            Objects.equals(this.image, novaListServersDetailsRequest.image) &&
            Objects.equals(this.ip, novaListServersDetailsRequest.ip) &&
            Objects.equals(this.limit, novaListServersDetailsRequest.limit) &&
            Objects.equals(this.marker, novaListServersDetailsRequest.marker) &&
            Objects.equals(this.name, novaListServersDetailsRequest.name) &&
            Objects.equals(this.notTags, novaListServersDetailsRequest.notTags) &&
            Objects.equals(this.reservationId, novaListServersDetailsRequest.reservationId) &&
            Objects.equals(this.sortKey, novaListServersDetailsRequest.sortKey) &&
            Objects.equals(this.status, novaListServersDetailsRequest.status) &&
            Objects.equals(this.tags, novaListServersDetailsRequest.tags) &&
            Objects.equals(this.openStackAPIVersion, novaListServersDetailsRequest.openStackAPIVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(changesSince, flavor, image, ip, limit, marker, name, notTags, reservationId, sortKey, status, tags, openStackAPIVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListServersDetailsRequest {\n");
        sb.append("    changesSince: ").append(toIndentedString(changesSince)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    openStackAPIVersion: ").append(toIndentedString(openStackAPIVersion)).append("\n");
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

