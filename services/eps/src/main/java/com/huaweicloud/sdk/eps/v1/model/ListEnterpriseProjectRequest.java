package com.huaweicloud.sdk.eps.v1.model;




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
public class ListEnterpriseProjectRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;
    /**
     * Gets or Sets sortDir
     */
    public static final class SortDirEnum {

        
        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");
        
        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");
        

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("desc", DESC);
            map.put("asc", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_dir")
    
    private SortDirEnum sortDir;
    /**
     * Gets or Sets sortKey
     */
    public static final class SortKeyEnum {

        
        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");
        
        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");
        

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public ListEnterpriseProjectRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEnterpriseProjectRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEnterpriseProjectRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListEnterpriseProjectRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEnterpriseProjectRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    


    /**
     * Get sortDir
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListEnterpriseProjectRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * Get sortKey
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListEnterpriseProjectRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
        ListEnterpriseProjectRequest listEnterpriseProjectRequest = (ListEnterpriseProjectRequest) o;
        return Objects.equals(this.id, listEnterpriseProjectRequest.id) &&
            Objects.equals(this.limit, listEnterpriseProjectRequest.limit) &&
            Objects.equals(this.name, listEnterpriseProjectRequest.name) &&
            Objects.equals(this.offset, listEnterpriseProjectRequest.offset) &&
            Objects.equals(this.sortDir, listEnterpriseProjectRequest.sortDir) &&
            Objects.equals(this.sortKey, listEnterpriseProjectRequest.sortKey) &&
            Objects.equals(this.status, listEnterpriseProjectRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, limit, name, offset, sortDir, sortKey, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseProjectRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
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

