package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.SysTag;
import com.huaweicloud.sdk.cbr.v1.model.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BulkCreateAndDeleteVaultTagsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<SysTag> sysTags = null;
        /**
     * 操作标识：仅限于create（创建）、delete（删除）
     */
    public static final class ActionEnum {

        
        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");
        
        /**
         * Enum _DELETE for value: " delete"
         */
        public static final ActionEnum _DELETE = new ActionEnum(" delete");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("create", CREATE);
            map.put(" delete", _DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;

    public BulkCreateAndDeleteVaultTagsReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public BulkCreateAndDeleteVaultTagsReq addTagsItem(Tag tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BulkCreateAndDeleteVaultTagsReq withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。  tags不允许为空列表。  tags中最多包含10个key。  tags中key不允许重复。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    

    public BulkCreateAndDeleteVaultTagsReq withSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public BulkCreateAndDeleteVaultTagsReq addSysTagsItem(SysTag sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public BulkCreateAndDeleteVaultTagsReq withSysTags(Consumer<List<SysTag>> sysTagsSetter) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表。  op_service权限可以访问，和tags二选一。  目前TMS调用时只包含一个resource_tag结构体 ，key固定为：_sys_enterprise_project_id。  value是UUID或0,value为0表示默认企业项目。  现在仅支持create操作。
     * @return sysTags
     */
    public List<SysTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
    }

    

    public BulkCreateAndDeleteVaultTagsReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识：仅限于create（创建）、delete（删除）
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkCreateAndDeleteVaultTagsReq bulkCreateAndDeleteVaultTagsReq = (BulkCreateAndDeleteVaultTagsReq) o;
        return Objects.equals(this.tags, bulkCreateAndDeleteVaultTagsReq.tags) &&
            Objects.equals(this.sysTags, bulkCreateAndDeleteVaultTagsReq.sysTags) &&
            Objects.equals(this.action, bulkCreateAndDeleteVaultTagsReq.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkCreateAndDeleteVaultTagsReq {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

