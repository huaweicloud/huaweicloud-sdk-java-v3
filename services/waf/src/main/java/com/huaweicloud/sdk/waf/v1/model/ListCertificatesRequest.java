package com.huaweicloud.sdk.waf.v1.model;




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
public class ListCertificatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pagesize")
    
    private Integer pagesize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private Boolean host;
    /**
     * 证书过期状态，0-未过期，1-已过期，2-即将过期
     */
    public static final class ExpStatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ExpStatusEnum NUMBER_0 = new ExpStatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ExpStatusEnum NUMBER_1 = new ExpStatusEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ExpStatusEnum NUMBER_2 = new ExpStatusEnum(2);
        

        private static final Map<Integer, ExpStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ExpStatusEnum> createStaticFields() {
            Map<Integer, ExpStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ExpStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExpStatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ExpStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExpStatusEnum(value);
            }
            return result;
        }

        public static ExpStatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ExpStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExpStatusEnum) {
                return this.value.equals(((ExpStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exp_status")
    
    private ExpStatusEnum expStatus;

    public ListCertificatesRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 页码
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListCertificatesRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    


    /**
     * 每页条数
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    

    public ListCertificatesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListCertificatesRequest withHost(Boolean host) {
        this.host = host;
        return this;
    }

    


    /**
     * 是否获取证书关联的域名
     * @return host
     */
    public Boolean getHost() {
        return host;
    }

    public void setHost(Boolean host) {
        this.host = host;
    }

    

    public ListCertificatesRequest withExpStatus(ExpStatusEnum expStatus) {
        this.expStatus = expStatus;
        return this;
    }

    


    /**
     * 证书过期状态，0-未过期，1-已过期，2-即将过期
     * @return expStatus
     */
    public ExpStatusEnum getExpStatus() {
        return expStatus;
    }

    public void setExpStatus(ExpStatusEnum expStatus) {
        this.expStatus = expStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificatesRequest listCertificatesRequest = (ListCertificatesRequest) o;
        return Objects.equals(this.page, listCertificatesRequest.page) &&
            Objects.equals(this.pagesize, listCertificatesRequest.pagesize) &&
            Objects.equals(this.name, listCertificatesRequest.name) &&
            Objects.equals(this.host, listCertificatesRequest.host) &&
            Objects.equals(this.expStatus, listCertificatesRequest.expStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(page, pagesize, name, host, expStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    expStatus: ").append(toIndentedString(expStatus)).append("\n");
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

