package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.Match;
import com.huaweicloud.sdk.cbr.v1.model.SysTags;
import com.huaweicloud.sdk.cbr.v1.model.TagsReq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class VaultResourceInstancesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsReq> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags_any")
    
    private List<TagsReq> tagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags")
    
    private List<TagsReq> notTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags_any")
    
    private List<TagsReq> notTagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<SysTags> sysTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    private List<Match> matches = null;
        /**
     * 云类型
     */
    public static final class CloudTypeEnum {

        
        /**
         * Enum PUBLIC for value: "public"
         */
        public static final CloudTypeEnum PUBLIC = new CloudTypeEnum("public");
        
        /**
         * Enum _HYBRID for value: " hybrid"
         */
        public static final CloudTypeEnum _HYBRID = new CloudTypeEnum(" hybrid");
        

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put(" hybrid", _HYBRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
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
        public static CloudTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CloudTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CloudTypeEnum(value);
            }
            return result;
        }

        public static CloudTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CloudTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CloudTypeEnum) {
                return this.value.equals(((CloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_type")
    
    private CloudTypeEnum cloudType;
    /**
     * 资源类型
     */
    public static final class ObjectTypeEnum {

        
        /**
         * Enum SERVER for value: "server"
         */
        public static final ObjectTypeEnum SERVER = new ObjectTypeEnum("server");
        
        /**
         * Enum DISK for value: "disk"
         */
        public static final ObjectTypeEnum DISK = new ObjectTypeEnum("disk");
        

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("server", SERVER);
            map.put("disk", DISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectTypeEnum(value);
            }
            return result;
        }

        public static ObjectTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_type")
    
    private ObjectTypeEnum objectType;

    public VaultResourceInstancesReq withTags(List<TagsReq> tags) {
        this.tags = tags;
        return this;
    }

    
    public VaultResourceInstancesReq addTagsItem(TagsReq tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VaultResourceInstancesReq withTags(Consumer<List<TagsReq>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签。  tags不允许为空列表。  tags中最多包含10个key。  tags中key不允许重复。  tags中多个key之间是“与”的关系。  结果返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。  无过滤条件时返回全量数据。
     * @return tags
     */
    public List<TagsReq> getTags() {
        return tags;
    }

    public void setTags(List<TagsReq> tags) {
        this.tags = tags;
    }

    public VaultResourceInstancesReq withTagsAny(List<TagsReq> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    
    public VaultResourceInstancesReq addTagsAnyItem(TagsReq tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public VaultResourceInstancesReq withTagsAny(Consumer<List<TagsReq>> tagsAnySetter) {
        if(this.tagsAny == null ){
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任一标签。  tags不允许为空列表。  tags中最多包含10个key。  tags中key不允许重复。  结果返回包含任一标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。  无过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<TagsReq> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagsReq> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public VaultResourceInstancesReq withNotTags(List<TagsReq> notTags) {
        this.notTags = notTags;
        return this;
    }

    
    public VaultResourceInstancesReq addNotTagsItem(TagsReq notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public VaultResourceInstancesReq withNotTags(Consumer<List<TagsReq>> notTagsSetter) {
        if(this.notTags == null ){
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签。  tags不允许为空列表。  tags中最多包含10个key。  tags中key不允许重复。  结果返回不包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。  无过滤条件时返回全量数据。
     * @return notTags
     */
    public List<TagsReq> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagsReq> notTags) {
        this.notTags = notTags;
    }

    public VaultResourceInstancesReq withNotTagsAny(List<TagsReq> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    
    public VaultResourceInstancesReq addNotTagsAnyItem(TagsReq notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public VaultResourceInstancesReq withNotTagsAny(Consumer<List<TagsReq>> notTagsAnySetter) {
        if(this.notTagsAny == null ){
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任一标签。  tags不允许为空列表。  tags中最多包含10个key。  tags中key不允许重复。  结果返回不包含任一标签的资源列表，key之间是或的关系，key-value结构张value是或的关系。  无过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<TagsReq> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagsReq> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public VaultResourceInstancesReq withSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public VaultResourceInstancesReq addSysTagsItem(SysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public VaultResourceInstancesReq withSysTags(Consumer<List<SysTags>> sysTagsSetter) {
        if(this.sysTags == null ){
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 仅op_service权限可以使用此字段做资源实例过滤条件。  目前TMS调用时只包含一个tag结构体。  * key： _sys_enterprise_project_id  * values：企业项目id列表  目前TMS调用时，key下面只包含一个value，0表示默认企业项目。  sys_tags和租户标签过滤条件（tags、tags_any、not_tags、not_tags_any）不能同时使用。  无sys_tags时按照tag接口处理，无tag过滤条件时返回全量数据。  sys_tags不能为空列表
     * @return sysTags
     */
    public List<SysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
    }

    public VaultResourceInstancesReq withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数（action为count时无此参数）如果action为filter时，默认为1000，limit最小值为1，limit最大值为1000, 不在范围内报错。返回的结果中记录数不超过limit。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public VaultResourceInstancesReq withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置（action为count时无此参数）如果action为filter时，默认为0，offset最小值为0。返回的结果中第一条记录为符合查询条件的第offset+1条记录。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public VaultResourceInstancesReq withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识取值范围为：\"filter\", \"count\"。如果是filter就是分页查询，如果是count只需按照条件将总条数返回即可
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public VaultResourceInstancesReq withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    
    public VaultResourceInstancesReq addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public VaultResourceInstancesReq withMatches(Consumer<List<Match>> matchesSetter) {
        if(this.matches == null ){
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 资源本身支持的查询条件。  matches不允许为空列表。  matches中key不允许重复。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public VaultResourceInstancesReq withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    


    /**
     * 云类型
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public VaultResourceInstancesReq withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    


    /**
     * 资源类型
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultResourceInstancesReq vaultResourceInstancesReq = (VaultResourceInstancesReq) o;
        return Objects.equals(this.tags, vaultResourceInstancesReq.tags) &&
            Objects.equals(this.tagsAny, vaultResourceInstancesReq.tagsAny) &&
            Objects.equals(this.notTags, vaultResourceInstancesReq.notTags) &&
            Objects.equals(this.notTagsAny, vaultResourceInstancesReq.notTagsAny) &&
            Objects.equals(this.sysTags, vaultResourceInstancesReq.sysTags) &&
            Objects.equals(this.limit, vaultResourceInstancesReq.limit) &&
            Objects.equals(this.offset, vaultResourceInstancesReq.offset) &&
            Objects.equals(this.action, vaultResourceInstancesReq.action) &&
            Objects.equals(this.matches, vaultResourceInstancesReq.matches) &&
            Objects.equals(this.cloudType, vaultResourceInstancesReq.cloudType) &&
            Objects.equals(this.objectType, vaultResourceInstancesReq.objectType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, sysTags, limit, offset, action, matches, cloudType, objectType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultResourceInstancesReq {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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

