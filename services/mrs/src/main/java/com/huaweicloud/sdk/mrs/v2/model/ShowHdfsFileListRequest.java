package com.huaweicloud.sdk.mrs.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowHdfsFileListRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    @JacksonXmlProperty(localName = "cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    @JacksonXmlProperty(localName = "path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    @JacksonXmlProperty(localName = "offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    @JacksonXmlProperty(localName = "limit")
    
    private String limit;
    /**
     * 列表排序按该属性排序。缺省值：path_suffix  - path_suffix：文件或目录名称 - length：文件大小 - modification_time：修改时间
     */
    public static final class SortKeyEnum {

        
        /**
         * Enum PATH_SUFFIX_ for value: "path_suffix：文件或目录名称"
         */
        public static final SortKeyEnum PATH_SUFFIX_ = new SortKeyEnum("path_suffix：文件或目录名称");
        
        /**
         * Enum LENGTH_ for value: "length：文件大小"
         */
        public static final SortKeyEnum LENGTH_ = new SortKeyEnum("length：文件大小");
        
        /**
         * Enum MODIFICATION_TIME_ for value: "modification_time：修改时间"
         */
        public static final SortKeyEnum MODIFICATION_TIME_ = new SortKeyEnum("modification_time：修改时间");
        

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("path_suffix：文件或目录名称", PATH_SUFFIX_);
            map.put("length：文件大小", LENGTH_);
            map.put("modification_time：修改时间", MODIFICATION_TIME_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
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
            if (obj instanceof SortKeyEnum) {
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
    
    @JacksonXmlProperty(localName = "sort_key")
    
    private SortKeyEnum sortKey;
    /**
     * 列表排序方式，desc为降序，asc为升序，默认值为desc。
     */
    public static final class OrderEnum {

        
        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");
        
        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");
        

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("desc", DESC);
            map.put("asc", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order")
    
    @JacksonXmlProperty(localName = "order")
    
    private OrderEnum order;

    public ShowHdfsFileListRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。获取方法，请参见[获取集群ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public ShowHdfsFileListRequest withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 文件目录，比如访问“/tmp/test”目录列表，此处必须是目录，整体URI为  /v2/{project_id}/clusters/{cluster_id}/files?path=%2Ftmp%2Ftest  单层目录要遵循以下规则：  - 不能为空 - 不能以\".\"开头或结尾 - 不能包括下列符号 : :*?\"<>|\\;&,'`!{}[]$%+ - 不能超过255个字节
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public ShowHdfsFileListRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 分页参数，表示从该偏移量开始查询文件列表，默认值为1。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ShowHdfsFileListRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 分页参数，列表当前分页的数量限制，默认为100，最大1000。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ShowHdfsFileListRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * 列表排序按该属性排序。缺省值：path_suffix  - path_suffix：文件或目录名称 - length：文件大小 - modification_time：修改时间
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    

    public ShowHdfsFileListRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    


    /**
     * 列表排序方式，desc为降序，asc为升序，默认值为desc。
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHdfsFileListRequest showHdfsFileListRequest = (ShowHdfsFileListRequest) o;
        return Objects.equals(this.clusterId, showHdfsFileListRequest.clusterId) &&
            Objects.equals(this.path, showHdfsFileListRequest.path) &&
            Objects.equals(this.offset, showHdfsFileListRequest.offset) &&
            Objects.equals(this.limit, showHdfsFileListRequest.limit) &&
            Objects.equals(this.sortKey, showHdfsFileListRequest.sortKey) &&
            Objects.equals(this.order, showHdfsFileListRequest.order);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, path, offset, limit, sortKey, order);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHdfsFileListRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

