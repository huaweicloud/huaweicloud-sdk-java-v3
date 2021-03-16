package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateRecordSetReq
 */
public class CreateRecordSetReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl")
    
    private Integer ttl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<String> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = null;
    
    public CreateRecordSetReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 域名，后缀需以zone name结束且为FQDN（即以“.”号结束的完整主机名）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateRecordSetReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateRecordSetReq withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Record Set的类型。  取值范围：A、AAAA、MX、CNAME、TXT、NS、SRV、CAA。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public CreateRecordSetReq withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public CreateRecordSetReq withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    


    /**
     * Get ttl
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    

    public CreateRecordSetReq withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    
    public CreateRecordSetReq addRecordsItem(String recordsItem) {
        this.records.add(recordsItem);
        return this;
    }

    public CreateRecordSetReq withRecords(Consumer<List<String>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 解析记录的值。不同类型解析记录对应的值的规则不同。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    

    public CreateRecordSetReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateRecordSetReq addTagsItem(Tag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public CreateRecordSetReq withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRecordSetReq createRecordSetReq = (CreateRecordSetReq) o;
        return Objects.equals(this.name, createRecordSetReq.name) &&
            Objects.equals(this.description, createRecordSetReq.description) &&
            Objects.equals(this.type, createRecordSetReq.type) &&
            Objects.equals(this.status, createRecordSetReq.status) &&
            Objects.equals(this.ttl, createRecordSetReq.ttl) &&
            Objects.equals(this.records, createRecordSetReq.records) &&
            Objects.equals(this.tags, createRecordSetReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, status, ttl, records, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordSetReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

