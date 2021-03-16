package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

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
 * Response Object
 */
public class AssociateDomainV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_domain")
    
    private String urlDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final StatusEnum NUMBER_3 = new StatusEnum(3);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final StatusEnum NUMBER_4 = new StatusEnum(4);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
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

    public AssociateDomainV2Response withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    


    /**
     * 自定义域名
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    

    public AssociateDomainV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 域名的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public AssociateDomainV2Response withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateDomainV2Response associateDomainV2Response = (AssociateDomainV2Response) o;
        return Objects.equals(this.urlDomain, associateDomainV2Response.urlDomain) &&
            Objects.equals(this.id, associateDomainV2Response.id) &&
            Objects.equals(this.status, associateDomainV2Response.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urlDomain, id, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateDomainV2Response {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

